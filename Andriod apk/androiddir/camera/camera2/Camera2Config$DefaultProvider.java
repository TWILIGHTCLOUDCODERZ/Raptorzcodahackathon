package androidx.camera.camera2;

import p009b.p049e.p050a.C0610a;
import p009b.p049e.p050a.C0611b;
import p009b.p049e.p050a.C0612c;
import p009b.p049e.p058b.C0835a2;
import p009b.p049e.p058b.p059i3.C1000j0;
import p009b.p049e.p058b.p059i3.C1022o1;
import p009b.p049e.p058b.p059i3.C1032r1;
import p009b.p049e.p058b.p059i3.C1050w0;

public final class Camera2Config$DefaultProvider implements C0835a2.C0837b {
    public C0835a2 getCameraXConfig() {
        C0612c cVar = C0612c.f2403a;
        C0611b bVar = C0611b.f2402a;
        C0610a aVar = C0610a.f2401a;
        C0835a2.C0836a aVar2 = new C0835a2.C0836a();
        C1022o1 o1Var = aVar2.f2895a;
        C1050w0.C1051a<C1000j0.C1001a> aVar3 = C0835a2.f2888u;
        C1050w0.C1053c cVar2 = C1050w0.C1053c.OPTIONAL;
        o1Var.mo3463D(aVar3, cVar2, cVar);
        aVar2.f2895a.mo3463D(C0835a2.f2889v, cVar2, bVar);
        aVar2.f2895a.mo3463D(C0835a2.f2890w, cVar2, aVar);
        return new C0835a2(C1032r1.m2573A(aVar2.f2895a));
    }
}
