package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p009b.p010a.C0179a;
import p009b.p010a.C0182d;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f67a;

    /* renamed from: b */
    public final ArrayDeque<C0182d> f68b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C1664e, C0179a {

        /* renamed from: c */
        public final C1661d f69c;

        /* renamed from: d */
        public final C0182d f70d;

        /* renamed from: e */
        public C0179a f71e;

        public LifecycleOnBackPressedCancellable(C1661d dVar, C0182d dVar2) {
            this.f69c = dVar;
            this.f70d = dVar2;
            dVar.mo4768a(this);
        }

        public void cancel() {
            C1667h hVar = (C1667h) this.f69c;
            hVar.mo4771c("removeObserver");
            hVar.f5112a.mo2693p(this);
            this.f70d.f1029b.remove(this);
            C0179a aVar = this.f71e;
            if (aVar != null) {
                aVar.cancel();
                this.f71e = null;
            }
        }

        /* renamed from: j */
        public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
            if (aVar == C1661d.C1662a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C0182d dVar = this.f70d;
                onBackPressedDispatcher.f68b.add(dVar);
                C0034a aVar2 = new C0034a(dVar);
                dVar.f1029b.add(aVar2);
                this.f71e = aVar2;
            } else if (aVar == C1661d.C1662a.ON_STOP) {
                C0179a aVar3 = this.f71e;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == C1661d.C1662a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0034a implements C0179a {

        /* renamed from: c */
        public final C0182d f73c;

        public C0034a(C0182d dVar) {
            this.f73c = dVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f68b.remove(this.f73c);
            this.f73c.f1029b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f67a = runnable;
    }

    /* renamed from: a */
    public void mo93a() {
        Iterator<C0182d> descendingIterator = this.f68b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0182d next = descendingIterator.next();
            if (next.f1028a) {
                next.mo1393a();
                return;
            }
        }
        Runnable runnable = this.f67a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
