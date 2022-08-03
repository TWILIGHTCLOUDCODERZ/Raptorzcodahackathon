package androidx.fragment.app;

import android.view.View;
import p009b.p107n.p108b.C1601m;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;

public class Fragment$5 implements C1664e {

    /* renamed from: c */
    public final /* synthetic */ C1601m f635c;

    public Fragment$5(C1601m mVar) {
        this.f635c = mVar;
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        View view;
        if (aVar == C1661d.C1662a.ON_STOP && (view = this.f635c.f4907H) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
