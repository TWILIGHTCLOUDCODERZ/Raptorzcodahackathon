package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p009b.p033c0.C0464e;
import p009b.p033c0.C0485q;
import p009b.p033c0.p034r.p043p.p045m.C0598a;
import p133c.p149b.p152b.p153a.C2108a;
import p133c.p175d.p319c.p320a.p321a.C5848a;

public abstract class ListenableWorker {

    /* renamed from: c */
    public Context f970c;

    /* renamed from: d */
    public WorkerParameters f971d;

    /* renamed from: e */
    public volatile boolean f972e;

    /* renamed from: f */
    public boolean f973f;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C0170a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C0171a extends C0170a {

            /* renamed from: a */
            public final C0464e f974a = C0464e.f2079c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0171a.class != obj.getClass()) {
                    return false;
                }
                return this.f974a.equals(((C0171a) obj).f974a);
            }

            public int hashCode() {
                return this.f974a.hashCode() + (C0171a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder o = C2108a.m5005o("Failure {mOutputData=");
                o.append(this.f974a);
                o.append('}');
                return o.toString();
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C0172b extends C0170a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C0172b.class == obj.getClass();
            }

            public int hashCode() {
                return C0172b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C0173c extends C0170a {

            /* renamed from: a */
            public final C0464e f975a;

            public C0173c() {
                this.f975a = C0464e.f2079c;
            }

            public C0173c(C0464e eVar) {
                this.f975a = eVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0173c.class != obj.getClass()) {
                    return false;
                }
                return this.f975a.equals(((C0173c) obj).f975a);
            }

            public int hashCode() {
                return this.f975a.hashCode() + (C0173c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder o = C2108a.m5005o("Success {mOutputData=");
                o.append(this.f975a);
                o.append('}');
                return o.toString();
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f970c = context;
            this.f971d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f970c;
    }

    public Executor getBackgroundExecutor() {
        return this.f971d.f983f;
    }

    public final UUID getId() {
        return this.f971d.f978a;
    }

    public final C0464e getInputData() {
        return this.f971d.f979b;
    }

    public final Network getNetwork() {
        return this.f971d.f981d.f988c;
    }

    public final int getRunAttemptCount() {
        return this.f971d.f982e;
    }

    public final Set<String> getTags() {
        return this.f971d.f980c;
    }

    public C0598a getTaskExecutor() {
        return this.f971d.f984g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f971d.f981d.f986a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f971d.f981d.f987b;
    }

    public C0485q getWorkerFactory() {
        return this.f971d.f985h;
    }

    public final boolean isStopped() {
        return this.f972e;
    }

    public final boolean isUsed() {
        return this.f973f;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.f973f = true;
    }

    public abstract C5848a<C0170a> startWork();

    public final void stop() {
        this.f972e = true;
        onStopped();
    }
}
