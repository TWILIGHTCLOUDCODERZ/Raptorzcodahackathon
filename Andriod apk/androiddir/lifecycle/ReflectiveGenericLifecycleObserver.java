package androidx.lifecycle;

import p009b.p114q.C1656a;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;

public class ReflectiveGenericLifecycleObserver implements C1664e {

    /* renamed from: c */
    public final Object f657c;

    /* renamed from: d */
    public final C1656a.C1657a f658d;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f657c = obj;
        this.f658d = C1656a.f5099c.mo4757b(obj.getClass());
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        C1656a.C1657a aVar2 = this.f658d;
        Object obj = this.f657c;
        C1656a.C1657a.m4067a(aVar2.f5102a.get(aVar), gVar, aVar, obj);
        C1656a.C1657a.m4067a(aVar2.f5102a.get(C1661d.C1662a.ON_ANY), gVar, aVar, obj);
    }
}
