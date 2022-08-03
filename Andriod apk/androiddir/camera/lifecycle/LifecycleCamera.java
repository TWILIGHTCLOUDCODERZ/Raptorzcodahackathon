package androidx.camera.lifecycle;

import java.util.Collections;
import java.util.List;
import p009b.p049e.p058b.C0879f3;
import p009b.p049e.p058b.C1128o1;
import p009b.p049e.p058b.p059i3.C0922e0;
import p009b.p049e.p058b.p059i3.C0931g0;
import p009b.p049e.p058b.p063j3.C1092d;
import p009b.p114q.C1661d;
import p009b.p114q.C1665f;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p114q.C1677p;

public final class LifecycleCamera implements C1665f, C1128o1 {

    /* renamed from: c */
    public final Object f395c = new Object();

    /* renamed from: d */
    public final C1666g f396d;

    /* renamed from: e */
    public final C1092d f397e;

    /* renamed from: f */
    public boolean f398f;

    public LifecycleCamera(C1666g gVar, C1092d dVar) {
        boolean z = false;
        this.f398f = false;
        this.f396d = gVar;
        this.f397e = dVar;
        if (((C1667h) gVar.mo67b()).f5113b.compareTo(C1661d.C1663b.STARTED) >= 0 ? true : z) {
            dVar.mo3538f();
        } else {
            dVar.mo3540i();
        }
        gVar.mo67b().mo4768a(this);
    }

    /* renamed from: h */
    public C1666g mo519h() {
        C1666g gVar;
        synchronized (this.f395c) {
            gVar = this.f396d;
        }
        return gVar;
    }

    /* renamed from: i */
    public List<C0879f3> mo520i() {
        List<C0879f3> unmodifiableList;
        synchronized (this.f395c) {
            unmodifiableList = Collections.unmodifiableList(this.f397e.mo3541j());
        }
        return unmodifiableList;
    }

    /* renamed from: n */
    public void mo521n(C0922e0 e0Var) {
        C1092d dVar = this.f397e;
        synchronized (dVar.f3410k) {
            if (e0Var == null) {
                dVar.f3409j = C0931g0.f3087a;
            } else {
                dVar.f3409j = e0Var;
            }
        }
    }

    /* renamed from: o */
    public void mo522o() {
        synchronized (this.f395c) {
            if (!this.f398f) {
                onStop(this.f396d);
                this.f398f = true;
            }
        }
    }

    @C1677p(C1661d.C1662a.ON_DESTROY)
    public void onDestroy(C1666g gVar) {
        synchronized (this.f395c) {
            C1092d dVar = this.f397e;
            dVar.mo3542k(dVar.mo3541j());
        }
    }

    @C1677p(C1661d.C1662a.ON_START)
    public void onStart(C1666g gVar) {
        synchronized (this.f395c) {
            if (!this.f398f) {
                this.f397e.mo3538f();
            }
        }
    }

    @C1677p(C1661d.C1662a.ON_STOP)
    public void onStop(C1666g gVar) {
        synchronized (this.f395c) {
            if (!this.f398f) {
                this.f397e.mo3540i();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo526p() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f395c
            monitor-enter(r0)
            boolean r1 = r4.f398f     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0009:
            r1 = 0
            r4.f398f = r1     // Catch:{ all -> 0x0028 }
            b.q.g r2 = r4.f396d     // Catch:{ all -> 0x0028 }
            b.q.d r2 = r2.mo67b()     // Catch:{ all -> 0x0028 }
            b.q.h r2 = (p009b.p114q.C1667h) r2     // Catch:{ all -> 0x0028 }
            b.q.d$b r2 = r2.f5113b     // Catch:{ all -> 0x0028 }
            b.q.d$b r3 = p009b.p114q.C1661d.C1663b.STARTED     // Catch:{ all -> 0x0028 }
            int r2 = r2.compareTo(r3)     // Catch:{ all -> 0x0028 }
            if (r2 < 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0026
            b.q.g r1 = r4.f396d     // Catch:{ all -> 0x0028 }
            r4.onStart(r1)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.mo526p():void");
    }
}
