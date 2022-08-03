package androidx.savedstate;

import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p126w.C1793a;

public class SavedStateRegistry$1 implements C1664e {

    /* renamed from: c */
    public final /* synthetic */ C1793a f968c;

    public SavedStateRegistry$1(C1793a aVar) {
        this.f968c = aVar;
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        C1793a aVar2;
        boolean z;
        if (aVar == C1661d.C1662a.ON_START) {
            aVar2 = this.f968c;
            z = true;
        } else if (aVar == C1661d.C1662a.ON_STOP) {
            aVar2 = this.f968c;
            z = false;
        } else {
            return;
        }
        aVar2.f5475e = z;
    }
}
