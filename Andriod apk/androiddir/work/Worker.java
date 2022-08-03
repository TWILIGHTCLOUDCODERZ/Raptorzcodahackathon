package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import p009b.p033c0.p034r.p043p.p044l.C0597c;
import p133c.p175d.p319c.p320a.p321a.C5848a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: g */
    public C0597c<ListenableWorker.C0170a> f976g;

    /* renamed from: androidx.work.Worker$a */
    public class C0174a implements Runnable {
        public C0174a() {
        }

        public void run() {
            try {
                Worker.this.f976g.mo2871i(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f976g.mo2872l(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C0170a doWork();

    public final C5848a<ListenableWorker.C0170a> startWork() {
        this.f976g = new C0597c<>();
        getBackgroundExecutor().execute(new C0174a());
        return this.f976g;
    }
}
