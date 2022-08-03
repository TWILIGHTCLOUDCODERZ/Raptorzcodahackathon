package androidx.lifecycle;

import p009b.p114q.C1660c;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1674m;

public class CompositeGeneratedAdaptersObserver implements C1664e {

    /* renamed from: c */
    public final C1660c[] f636c;

    public CompositeGeneratedAdaptersObserver(C1660c[] cVarArr) {
        this.f636c = cVarArr;
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        C1674m mVar = new C1674m();
        for (C1660c a : this.f636c) {
            a.mo4767a(gVar, aVar, false, mVar);
        }
        for (C1660c a2 : this.f636c) {
            a2.mo4767a(gVar, aVar, true, mVar);
        }
    }
}
