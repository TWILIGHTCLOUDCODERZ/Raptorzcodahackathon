package androidx.lifecycle;

import java.util.Map;
import p009b.p028c.p029a.p030a.C0442a;
import p009b.p028c.p029a.p031b.C0448b;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p114q.C1676o;
import p133c.p149b.p152b.p153a.C2108a;

public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f639k = new Object();

    /* renamed from: a */
    public final Object f640a;

    /* renamed from: b */
    public C0448b<C1676o<? super T>, LiveData<T>.c> f641b;

    /* renamed from: c */
    public int f642c;

    /* renamed from: d */
    public boolean f643d;

    /* renamed from: e */
    public volatile Object f644e;

    /* renamed from: f */
    public volatile Object f645f;

    /* renamed from: g */
    public int f646g;

    /* renamed from: h */
    public boolean f647h;

    /* renamed from: i */
    public boolean f648i;

    /* renamed from: j */
    public final Runnable f649j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements C1664e {

        /* renamed from: g */
        public final C1666g f650g;

        public LifecycleBoundObserver(C1666g gVar, C1676o<? super T> oVar) {
            super(oVar);
            this.f650g = gVar;
        }

        /* renamed from: b */
        public void mo847b() {
            C1667h hVar = (C1667h) this.f650g.mo67b();
            hVar.mo4771c("removeObserver");
            hVar.f5112a.mo2693p(this);
        }

        /* renamed from: c */
        public boolean mo848c(C1666g gVar) {
            return this.f650g == gVar;
        }

        /* renamed from: e */
        public boolean mo849e() {
            return ((C1667h) this.f650g.mo67b()).f5113b.compareTo(C1661d.C1663b.STARTED) >= 0;
        }

        /* renamed from: j */
        public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
            C1661d.C1663b bVar = ((C1667h) this.f650g.mo67b()).f5113b;
            if (bVar == C1661d.C1663b.DESTROYED) {
                LiveData.this.mo845i(this.f653c);
                return;
            }
            C1661d.C1663b bVar2 = null;
            while (bVar2 != bVar) {
                mo851a(mo849e());
                bVar2 = bVar;
                bVar = ((C1667h) this.f650g.mo67b()).f5113b;
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0107a implements Runnable {
        public C0107a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f640a) {
                obj = LiveData.this.f645f;
                LiveData.this.f645f = LiveData.f639k;
            }
            LiveData.this.mo846j(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C0108b extends LiveData<T>.c {
        public C0108b(LiveData liveData, C1676o<? super T> oVar) {
            super(oVar);
        }

        /* renamed from: e */
        public boolean mo849e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C0109c {

        /* renamed from: c */
        public final C1676o<? super T> f653c;

        /* renamed from: d */
        public boolean f654d;

        /* renamed from: e */
        public int f655e = -1;

        public C0109c(C1676o<? super T> oVar) {
            this.f653c = oVar;
        }

        /* renamed from: a */
        public void mo851a(boolean z) {
            if (z != this.f654d) {
                this.f654d = z;
                LiveData liveData = LiveData.this;
                int i = z ? 1 : -1;
                int i2 = liveData.f642c;
                liveData.f642c = i + i2;
                if (!liveData.f643d) {
                    liveData.f643d = true;
                    while (true) {
                        try {
                            int i3 = liveData.f642c;
                            if (i2 == i3) {
                                break;
                            }
                            boolean z2 = i2 == 0 && i3 > 0;
                            boolean z3 = i2 > 0 && i3 == 0;
                            if (z2) {
                                liveData.mo843g();
                            } else if (z3) {
                                liveData.mo844h();
                            }
                            i2 = i3;
                        } finally {
                            liveData.f643d = false;
                        }
                    }
                }
                if (this.f654d) {
                    LiveData.this.mo839c(this);
                }
            }
        }

        /* renamed from: b */
        public void mo847b() {
        }

        /* renamed from: c */
        public boolean mo848c(C1666g gVar) {
            return false;
        }

        /* renamed from: e */
        public abstract boolean mo849e();
    }

    public LiveData() {
        this.f640a = new Object();
        this.f641b = new C0448b<>();
        this.f642c = 0;
        Object obj = f639k;
        this.f645f = obj;
        this.f649j = new C0107a();
        this.f644e = obj;
        this.f646g = -1;
    }

    public LiveData(T t) {
        this.f640a = new Object();
        this.f641b = new C0448b<>();
        this.f642c = 0;
        this.f645f = f639k;
        this.f649j = new C0107a();
        this.f644e = t;
        this.f646g = 0;
    }

    /* renamed from: a */
    public static void m295a(String str) {
        if (!C0442a.m1611d().mo2686b()) {
            throw new IllegalStateException(C2108a.m4998h("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void mo838b(LiveData<T>.c cVar) {
        if (cVar.f654d) {
            if (!cVar.mo849e()) {
                cVar.mo851a(false);
                return;
            }
            int i = cVar.f655e;
            int i2 = this.f646g;
            if (i < i2) {
                cVar.f655e = i2;
                cVar.f653c.mo2993a(this.f644e);
            }
        }
    }

    /* renamed from: c */
    public void mo839c(LiveData<T>.c cVar) {
        if (this.f647h) {
            this.f648i = true;
            return;
        }
        this.f647h = true;
        do {
            this.f648i = false;
            if (cVar == null) {
                C0448b<K, V>.d m = this.f641b.mo2697m();
                while (m.hasNext()) {
                    mo838b((C0109c) ((Map.Entry) m.next()).getValue());
                    if (this.f648i) {
                        break;
                    }
                }
            } else {
                mo838b(cVar);
                cVar = null;
            }
        } while (this.f648i);
        this.f647h = false;
    }

    /* renamed from: d */
    public T mo840d() {
        T t = this.f644e;
        if (t != f639k) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public void mo841e(C1666g gVar, C1676o<? super T> oVar) {
        m295a("observe");
        if (((C1667h) gVar.mo67b()).f5113b != C1661d.C1663b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, oVar);
            C0109c o = this.f641b.mo2692o(oVar, lifecycleBoundObserver);
            if (o != null && !o.mo848c(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (o == null) {
                gVar.mo67b().mo4768a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: f */
    public void mo842f(C1676o<? super T> oVar) {
        m295a("observeForever");
        C0108b bVar = new C0108b(this, oVar);
        C0109c o = this.f641b.mo2692o(oVar, bVar);
        if (o instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (o == null) {
            bVar.mo851a(true);
        }
    }

    /* renamed from: g */
    public void mo843g() {
    }

    /* renamed from: h */
    public void mo844h() {
    }

    /* renamed from: i */
    public void mo845i(C1676o<? super T> oVar) {
        m295a("removeObserver");
        C0109c p = this.f641b.mo2693p(oVar);
        if (p != null) {
            p.mo847b();
            p.mo851a(false);
        }
    }

    /* renamed from: j */
    public abstract void mo846j(T t);
}
