package androidx.camera.lifecycle;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p009b.p049e.p058b.C0879f3;
import p009b.p049e.p058b.C0887g3;
import p009b.p049e.p058b.p063j3.C1092d;
import p009b.p049e.p066c.C1192b;
import p009b.p086k.p087b.C1341c;
import p009b.p114q.C1661d;
import p009b.p114q.C1665f;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p114q.C1677p;

public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f399a = new Object();

    /* renamed from: b */
    public final Map<C0080a, LifecycleCamera> f400b = new HashMap();

    /* renamed from: c */
    public final Map<LifecycleCameraRepositoryObserver, Set<C0080a>> f401c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque<C1666g> f402d = new ArrayDeque<>();

    public static class LifecycleCameraRepositoryObserver implements C1665f {

        /* renamed from: c */
        public final LifecycleCameraRepository f403c;

        /* renamed from: d */
        public final C1666g f404d;

        public LifecycleCameraRepositoryObserver(C1666g gVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f404d = gVar;
            this.f403c = lifecycleCameraRepository;
        }

        @C1677p(C1661d.C1662a.ON_DESTROY)
        public void onDestroy(C1666g gVar) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f403c;
            synchronized (lifecycleCameraRepository.f399a) {
                LifecycleCameraRepositoryObserver b = lifecycleCameraRepository.mo528b(gVar);
                if (b != null) {
                    lifecycleCameraRepository.mo532f(gVar);
                    for (C0080a remove : lifecycleCameraRepository.f401c.get(b)) {
                        lifecycleCameraRepository.f400b.remove(remove);
                    }
                    lifecycleCameraRepository.f401c.remove(b);
                    C1667h hVar = (C1667h) b.f404d.mo67b();
                    hVar.mo4771c("removeObserver");
                    hVar.f5112a.mo2693p(b);
                }
            }
        }

        @C1677p(C1661d.C1662a.ON_START)
        public void onStart(C1666g gVar) {
            this.f403c.mo531e(gVar);
        }

        @C1677p(C1661d.C1662a.ON_STOP)
        public void onStop(C1666g gVar) {
            this.f403c.mo532f(gVar);
        }
    }

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    public static abstract class C0080a {
        /* renamed from: a */
        public abstract C1092d.C1094b mo538a();

        /* renamed from: b */
        public abstract C1666g mo539b();
    }

    /* renamed from: a */
    public void mo527a(LifecycleCamera lifecycleCamera, C0887g3 g3Var, Collection<C0879f3> collection) {
        synchronized (this.f399a) {
            boolean z = true;
            C1341c.m3304e(!collection.isEmpty());
            C1666g h = lifecycleCamera.mo519h();
            for (C0080a aVar : this.f401c.get(mo528b(h))) {
                LifecycleCamera lifecycleCamera2 = this.f400b.get(aVar);
                Objects.requireNonNull(lifecycleCamera2);
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.mo520i().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                C1092d dVar = lifecycleCamera.f397e;
                synchronized (dVar.f3410k) {
                    dVar.f3408i = g3Var;
                }
                synchronized (lifecycleCamera.f395c) {
                    lifecycleCamera.f397e.mo3537d(collection);
                }
                if (((C1667h) h.mo67b()).f5113b.compareTo(C1661d.C1663b.STARTED) < 0) {
                    z = false;
                }
                if (z) {
                    mo531e(h);
                }
            } catch (C1092d.C1093a e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final LifecycleCameraRepositoryObserver mo528b(C1666g gVar) {
        synchronized (this.f399a) {
            for (LifecycleCameraRepositoryObserver next : this.f401c.keySet()) {
                if (gVar.equals(next.f404d)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo529c(C1666g gVar) {
        synchronized (this.f399a) {
            LifecycleCameraRepositoryObserver b = mo528b(gVar);
            if (b == null) {
                return false;
            }
            for (C0080a aVar : this.f401c.get(b)) {
                LifecycleCamera lifecycleCamera = this.f400b.get(aVar);
                Objects.requireNonNull(lifecycleCamera);
                if (!lifecycleCamera.mo520i().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final void mo530d(LifecycleCamera lifecycleCamera) {
        synchronized (this.f399a) {
            C1666g h = lifecycleCamera.mo519h();
            C1192b bVar = new C1192b(h, lifecycleCamera.f397e.f3406g);
            LifecycleCameraRepositoryObserver b = mo528b(h);
            Set hashSet = b != null ? this.f401c.get(b) : new HashSet();
            hashSet.add(bVar);
            this.f400b.put(bVar, lifecycleCamera);
            if (b == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(h, this);
                this.f401c.put(lifecycleCameraRepositoryObserver, hashSet);
                h.mo67b().mo4768a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: e */
    public void mo531e(C1666g gVar) {
        ArrayDeque<C1666g> arrayDeque;
        synchronized (this.f399a) {
            if (mo529c(gVar)) {
                if (this.f402d.isEmpty()) {
                    arrayDeque = this.f402d;
                } else {
                    C1666g peek = this.f402d.peek();
                    if (!gVar.equals(peek)) {
                        mo533g(peek);
                        this.f402d.remove(gVar);
                        arrayDeque = this.f402d;
                    }
                    mo534h(gVar);
                }
                arrayDeque.push(gVar);
                mo534h(gVar);
            }
        }
    }

    /* renamed from: f */
    public void mo532f(C1666g gVar) {
        synchronized (this.f399a) {
            this.f402d.remove(gVar);
            mo533g(gVar);
            if (!this.f402d.isEmpty()) {
                mo534h(this.f402d.peek());
            }
        }
    }

    /* renamed from: g */
    public final void mo533g(C1666g gVar) {
        synchronized (this.f399a) {
            for (C0080a aVar : this.f401c.get(mo528b(gVar))) {
                LifecycleCamera lifecycleCamera = this.f400b.get(aVar);
                Objects.requireNonNull(lifecycleCamera);
                lifecycleCamera.mo522o();
            }
        }
    }

    /* renamed from: h */
    public final void mo534h(C1666g gVar) {
        synchronized (this.f399a) {
            for (C0080a aVar : this.f401c.get(mo528b(gVar))) {
                LifecycleCamera lifecycleCamera = this.f400b.get(aVar);
                Objects.requireNonNull(lifecycleCamera);
                if (!lifecycleCamera.mo520i().isEmpty()) {
                    lifecycleCamera.mo526p();
                }
            }
        }
    }
}
