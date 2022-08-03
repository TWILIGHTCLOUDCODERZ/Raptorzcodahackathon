package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.C0486a;
import p009b.p033c0.p034r.C0488c;
import p009b.p033c0.p034r.C0499i;

public class SystemJobService extends JobService implements C0486a {

    /* renamed from: e */
    public static final String f1007e = C0468h.m1649e("SystemJobService");

    /* renamed from: c */
    public C0499i f1008c;

    /* renamed from: d */
    public final Map<String, JobParameters> f1009d = new HashMap();

    /* renamed from: a */
    public void mo1379a(String str, boolean z) {
        JobParameters remove;
        C0468h.m1648c().mo2728a(f1007e, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f1009d) {
            remove = this.f1009d.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C0499i c = C0499i.m1681c(getApplicationContext());
            this.f1008c = c;
            c.f2150f.mo2742b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C0468h.m1648c().mo2731f(f1007e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C0499i iVar = this.f1008c;
        if (iVar != null) {
            C0488c cVar = iVar.f2150f;
            synchronized (cVar.f2123k) {
                cVar.f2122j.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r3 < 24) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r2 = new androidx.work.WorkerParameters.C0175a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r2.f987b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r2.f986a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r3 < 28) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r2.f988c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r9 = r8.f1008c;
        r3 = r9.f2148d;
        ((p009b.p033c0.p034r.p043p.p045m.C0599b) r3).f2385a.execute(new p009b.p033c0.p034r.p043p.C0582i(r9, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            b.c0.r.i r0 = r8.f1008c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            b.c0.h r0 = p009b.p033c0.C0468h.m1648c()
            java.lang.String r3 = f1007e
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.mo2728a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            android.os.PersistableBundle r0 = r9.getExtras()
            if (r0 != 0) goto L_0x002b
            b.c0.h r9 = p009b.p033c0.C0468h.m1648c()
            java.lang.String r0 = f1007e
            java.lang.String r1 = "No extras in JobParameters."
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.mo2729b(r0, r1, r3)
            return r2
        L_0x002b:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0045
            b.c0.h r9 = p009b.p033c0.C0468h.m1648c()
            java.lang.String r0 = f1007e
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.mo2729b(r0, r1, r3)
            return r2
        L_0x0045:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f1009d
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f1009d     // Catch:{ all -> 0x00c9 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0067
            b.c0.h r9 = p009b.p033c0.C0468h.m1648c()     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = f1007e     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c9 }
            r1[r2] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c9 }
            r9.mo2728a(r4, r0, r1)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            return r2
        L_0x0067:
            b.c0.h r4 = p009b.p033c0.C0468h.m1648c()     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = f1007e     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c9 }
            r7[r2] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c9 }
            r4.mo2728a(r5, r6, r2)     // Catch:{ all -> 0x00c9 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f1009d     // Catch:{ all -> 0x00c9 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00b8
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x009e
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f987b = r4
        L_0x009e:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x00ae
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f986a = r4
        L_0x00ae:
            r4 = 28
            if (r3 < r4) goto L_0x00b8
            android.net.Network r9 = r9.getNetwork()
            r2.f988c = r9
        L_0x00b8:
            b.c0.r.i r9 = r8.f1008c
            b.c0.r.p.m.a r3 = r9.f2148d
            b.c0.r.p.i r4 = new b.c0.r.p.i
            r4.<init>(r9, r0, r2)
            b.c0.r.p.m.b r3 = (p009b.p033c0.p034r.p043p.p045m.C0599b) r3
            java.util.concurrent.Executor r9 = r3.f2385a
            r9.execute(r4)
            return r1
        L_0x00c9:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f1008c == null) {
            C0468h.m1648c().mo2728a(f1007e, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            C0468h.m1648c().mo2729b(f1007e, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            C0468h.m1648c().mo2729b(f1007e, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C0468h.m1648c().mo2728a(f1007e, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.f1009d) {
            this.f1009d.remove(string);
        }
        this.f1008c.mo2752f(string);
        C0488c cVar = this.f1008c.f2150f;
        synchronized (cVar.f2123k) {
            contains = cVar.f2121i.contains(string);
        }
        return !contains;
    }
}
