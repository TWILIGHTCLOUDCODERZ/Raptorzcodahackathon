package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p114q.C1682s;
import p009b.p114q.C1686w;
import p009b.p114q.C1687x;
import p009b.p126w.C1793a;
import p009b.p126w.C1797c;

public final class SavedStateHandleController implements C1664e {

    /* renamed from: c */
    public boolean f659c;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    public class C01101 implements C1664e {

        /* renamed from: c */
        public final /* synthetic */ C1661d f660c;

        /* renamed from: d */
        public final /* synthetic */ C1793a f661d;

        /* renamed from: j */
        public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
            if (aVar == C1661d.C1662a.ON_START) {
                C1667h hVar = (C1667h) this.f660c;
                hVar.mo4771c("removeObserver");
                hVar.f5112a.mo2693p(this);
                this.f661d.mo5008c(C0111a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0111a implements C1793a.C1794a {
        /* renamed from: a */
        public void mo852a(C1797c cVar) {
            Object obj;
            boolean z;
            if (cVar instanceof C1687x) {
                C1686w i = ((C1687x) cVar).mo71i();
                C1793a d = cVar.mo69d();
                Objects.requireNonNull(i);
                Iterator it = new HashSet(i.f5136a.keySet()).iterator();
                while (it.hasNext()) {
                    C1682s sVar = i.f5136a.get((String) it.next());
                    C1661d b = cVar.mo67b();
                    Map<String, Object> map = sVar.f5135a;
                    if (map == null) {
                        obj = null;
                    } else {
                        synchronized (map) {
                            obj = sVar.f5135a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z = savedStateHandleController.f659c)) {
                        if (z) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.f659c = true;
                        b.mo4768a(savedStateHandleController);
                        throw null;
                    }
                }
                if (!new HashSet(i.f5136a.keySet()).isEmpty()) {
                    d.mo5008c(C0111a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        if (aVar == C1661d.C1662a.ON_DESTROY) {
            this.f659c = false;
            C1667h hVar = (C1667h) gVar.mo67b();
            hVar.mo4771c("removeObserver");
            hVar.f5112a.mo2693p(this);
        }
    }
}
