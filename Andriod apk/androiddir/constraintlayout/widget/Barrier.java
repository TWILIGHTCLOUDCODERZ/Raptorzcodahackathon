package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p009b.p077i.p080b.p081h.C1282a;
import p009b.p077i.p083c.C1317b;
import p009b.p077i.p083c.C1332i;

public class Barrier extends C1317b {

    /* renamed from: j */
    public int f442j;

    /* renamed from: k */
    public int f443k;

    /* renamed from: l */
    public C1282a f444l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: f */
    public void mo583f(AttributeSet attributeSet) {
        super.mo583f(attributeSet);
        this.f444l = new C1282a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1332i.f4225b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f444l.f3860o0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f444l.f3861p0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4090f = this.f444l;
        mo4008k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo584g(p009b.p077i.p080b.p081h.C1286d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f442j
            r3.f443k = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            if (r0 != r1) goto L_0x0018
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0014
        L_0x0010:
            r5 = 0
        L_0x0011:
            r3.f443k = r5
            goto L_0x0018
        L_0x0014:
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r5 = 1
            goto L_0x0011
        L_0x0018:
            boolean r5 = r4 instanceof p009b.p077i.p080b.p081h.C1282a
            if (r5 == 0) goto L_0x0022
            b.i.b.h.a r4 = (p009b.p077i.p080b.p081h.C1282a) r4
            int r5 = r3.f443k
            r4.f3859n0 = r5
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo584g(b.i.b.h.d, boolean):void");
    }

    public int getMargin() {
        return this.f444l.f3861p0;
    }

    public int getType() {
        return this.f442j;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f444l.f3860o0 = z;
    }

    public void setDpMargin(int i) {
        this.f444l.f3861p0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f444l.f3861p0 = i;
    }

    public void setType(int i) {
        this.f442j = i;
    }
}
