package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p009b.p033c0.C0468h;
import p009b.p033c0.C0480m;
import p009b.p033c0.p034r.C0491e;
import p009b.p033c0.p034r.C0499i;
import p009b.p033c0.p034r.p035m.p038c.C0519b;
import p009b.p033c0.p034r.p042o.C0557j;
import p009b.p033c0.p034r.p042o.C0559k;
import p009b.p033c0.p034r.p042o.C0560l;

public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final String f1010e = C0468h.m1649e("ForceStopRunnable");

    /* renamed from: f */
    public static final long f1011f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c */
    public final Context f1012c;

    /* renamed from: d */
    public final C0499i f1013d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f1014a = C0468h.m1649e("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C0468h c = C0468h.m1648c();
                String str = f1014a;
                if (((C0468h.C0469a) c).f2088b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.m808b(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C0499i iVar) {
        this.f1012c = context.getApplicationContext();
        this.f1013d = iVar;
    }

    /* renamed from: a */
    public static PendingIntent m807a(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* renamed from: b */
    public static void m808b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m807a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f1011f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, a);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        boolean z;
        List<JobInfo> e;
        C0468h.m1648c().mo2728a(f1010e, "Performing cleanup operations.", new Throwable[0]);
        Context context = this.f1012c;
        String str = C0519b.f2238h;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (e = C0519b.m1724e(context, jobScheduler)) == null || e.isEmpty())) {
            for (JobInfo next : e) {
                PersistableBundle extras = next.getExtras();
                if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    C0519b.m1722a(jobScheduler, next.getId());
                }
            }
        }
        WorkDatabase workDatabase = this.f1013d.f2147c;
        C0559k n = workDatabase.mo1359n();
        workDatabase.mo4975c();
        try {
            C0560l lVar = (C0560l) n;
            List<C0557j> c = lVar.mo2826c();
            boolean z2 = !((ArrayList) c).isEmpty();
            if (z2) {
                Iterator it = ((ArrayList) c).iterator();
                while (it.hasNext()) {
                    C0557j jVar = (C0557j) it.next();
                    lVar.mo2837n(C0480m.ENQUEUED, jVar.f2296a);
                    lVar.mo2833j(jVar.f2296a, -1);
                }
            }
            workDatabase.mo4980j();
            workDatabase.mo4977g();
            if (this.f1013d.f2151g.mo2845a().getBoolean("reschedule_needed", false)) {
                C0468h.m1648c().mo2728a(f1010e, "Rescheduling Workers.", new Throwable[0]);
                this.f1013d.mo2751e();
                this.f1013d.f2151g.mo2845a().edit().putBoolean("reschedule_needed", false).apply();
            } else {
                if (m807a(this.f1012c, 536870912) == null) {
                    m808b(this.f1012c);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C0468h.m1648c().mo2728a(f1010e, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f1013d.mo2751e();
                } else if (z2) {
                    C0468h.m1648c().mo2728a(f1010e, "Found unfinished work, scheduling it.", new Throwable[0]);
                    C0499i iVar = this.f1013d;
                    C0491e.m1672a(iVar.f2146b, iVar.f2147c, iVar.f2149e);
                }
            }
            C0499i iVar2 = this.f1013d;
            Objects.requireNonNull(iVar2);
            synchronized (C0499i.f2144l) {
                iVar2.f2152h = true;
                BroadcastReceiver.PendingResult pendingResult = iVar2.f2153i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    iVar2.f2153i = null;
                }
            }
        } catch (Throwable th) {
            workDatabase.mo4977g();
            throw th;
        }
    }
}
