package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.C0499i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f1003a = C0468h.m1649e("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C0468h.m1648c().mo2728a(f1003a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            C0499i c = C0499i.m1681c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Objects.requireNonNull(c);
            synchronized (C0499i.f2144l) {
                c.f2153i = goAsync;
                if (c.f2152h) {
                    goAsync.finish();
                    c.f2153i = null;
                }
            }
        } catch (IllegalStateException unused) {
            C0468h.m1648c().mo2729b(f1003a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
        }
    }
}
