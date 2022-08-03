package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.List;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.C0499i;
import p009b.p033c0.p034r.p039n.C0522c;
import p009b.p033c0.p034r.p039n.C0523d;
import p009b.p033c0.p034r.p042o.C0557j;
import p009b.p033c0.p034r.p042o.C0560l;
import p009b.p033c0.p034r.p043p.p044l.C0597c;
import p009b.p033c0.p034r.p043p.p045m.C0598a;
import p009b.p033c0.p034r.p046q.C0601a;
import p133c.p175d.p319c.p320a.p321a.C5848a;

public class ConstraintTrackingWorker extends ListenableWorker implements C0522c {

    /* renamed from: l */
    public static final String f1015l = C0468h.m1649e("ConstraintTrkngWrkr");

    /* renamed from: g */
    public WorkerParameters f1016g;

    /* renamed from: h */
    public final Object f1017h = new Object();

    /* renamed from: i */
    public volatile boolean f1018i = false;

    /* renamed from: j */
    public C0597c<ListenableWorker.C0170a> f1019j = new C0597c<>();

    /* renamed from: k */
    public ListenableWorker f1020k;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class C0178a implements Runnable {
        public C0178a() {
        }

        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b = constraintTrackingWorker.getInputData().mo2723b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b)) {
                C0468h.m1648c().mo2729b(ConstraintTrackingWorker.f1015l, "No worker to delegate to.", new Throwable[0]);
            } else {
                ListenableWorker a = constraintTrackingWorker.getWorkerFactory().mo2740a(constraintTrackingWorker.getApplicationContext(), b, constraintTrackingWorker.f1016g);
                constraintTrackingWorker.f1020k = a;
                if (a == null) {
                    C0468h.m1648c().mo2728a(ConstraintTrackingWorker.f1015l, "No worker to delegate to.", new Throwable[0]);
                } else {
                    C0557j h = ((C0560l) C0499i.m1681c(constraintTrackingWorker.getApplicationContext()).f2147c.mo1359n()).mo2831h(constraintTrackingWorker.getId().toString());
                    if (h != null) {
                        C0523d dVar = new C0523d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        dVar.mo2787b(Collections.singletonList(h));
                        if (dVar.mo2786a(constraintTrackingWorker.getId().toString())) {
                            C0468h.m1648c().mo2728a(ConstraintTrackingWorker.f1015l, String.format("Constraints met for delegate %s", new Object[]{b}), new Throwable[0]);
                            try {
                                C5848a<ListenableWorker.C0170a> startWork = constraintTrackingWorker.f1020k.startWork();
                                startWork.mo2860k(new C0601a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                                return;
                            } catch (Throwable th) {
                                C0468h c = C0468h.m1648c();
                                String str = ConstraintTrackingWorker.f1015l;
                                c.mo2728a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{b}), th);
                                synchronized (constraintTrackingWorker.f1017h) {
                                    if (constraintTrackingWorker.f1018i) {
                                        C0468h.m1648c().mo2728a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                        constraintTrackingWorker.mo1387b();
                                    } else {
                                        constraintTrackingWorker.mo1386a();
                                    }
                                    return;
                                }
                            }
                        } else {
                            C0468h.m1648c().mo2728a(ConstraintTrackingWorker.f1015l, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{b}), new Throwable[0]);
                            constraintTrackingWorker.mo1387b();
                            return;
                        }
                    }
                }
            }
            constraintTrackingWorker.mo1386a();
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1016g = workerParameters;
    }

    /* renamed from: a */
    public void mo1386a() {
        this.f1019j.mo2871i(new ListenableWorker.C0170a.C0171a());
    }

    /* renamed from: b */
    public void mo1387b() {
        this.f1019j.mo2871i(new ListenableWorker.C0170a.C0172b());
    }

    /* renamed from: d */
    public void mo1388d(List<String> list) {
        C0468h.m1648c().mo2728a(f1015l, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f1017h) {
            this.f1018i = true;
        }
    }

    /* renamed from: e */
    public void mo1389e(List<String> list) {
    }

    public C0598a getTaskExecutor() {
        return C0499i.m1681c(getApplicationContext()).f2148d;
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1020k;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public C5848a<ListenableWorker.C0170a> startWork() {
        getBackgroundExecutor().execute(new C0178a());
        return this.f1019j;
    }
}
