package androidx.lifecycle;

import p009b.p114q.C1659b;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;

public class FullLifecycleObserverAdapter implements C1664e {

    /* renamed from: c */
    public final C1659b f637c;

    /* renamed from: d */
    public final C1664e f638d;

    public FullLifecycleObserverAdapter(C1659b bVar, C1664e eVar) {
        this.f637c = bVar;
        this.f638d = eVar;
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f637c.mo4762f(gVar);
                break;
            case 1:
                this.f637c.onStart(gVar);
                break;
            case 2:
                this.f637c.mo4761d(gVar);
                break;
            case 3:
                this.f637c.mo4763k(gVar);
                break;
            case 4:
                this.f637c.onStop(gVar);
                break;
            case 5:
                this.f637c.onDestroy(gVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1664e eVar = this.f638d;
        if (eVar != null) {
            eVar.mo89j(gVar, aVar);
        }
    }
}
