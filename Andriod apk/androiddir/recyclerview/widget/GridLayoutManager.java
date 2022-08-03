package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p009b.p086k.p098j.p099b0.C1463b;
import p009b.p121u.p122c.C1746m;
import p133c.p149b.p152b.p153a.C2108a;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G */
    public boolean f671G = false;

    /* renamed from: H */
    public int f672H = -1;

    /* renamed from: I */
    public int[] f673I;

    /* renamed from: J */
    public View[] f674J;

    /* renamed from: K */
    public final SparseIntArray f675K = new SparseIntArray();

    /* renamed from: L */
    public final SparseIntArray f676L = new SparseIntArray();

    /* renamed from: M */
    public C0114c f677M = new C0112a();

    /* renamed from: N */
    public final Rect f678N = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0112a extends C0114c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0113b extends RecyclerView.C0139m {

        /* renamed from: e */
        public int f679e = -1;

        /* renamed from: f */
        public int f680f = 0;

        public C0113b(int i, int i2) {
            super(i, i2);
        }

        public C0113b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0113b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0113b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0114c {

        /* renamed from: a */
        public final SparseIntArray f681a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f682b = new SparseIntArray();

        /* renamed from: a */
        public int mo901a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        mo875P1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo875P1(RecyclerView.C0134l.m517S(context, attributeSet, i, i2).f828b);
    }

    /* renamed from: A */
    public int mo863A(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (this.f689r == 1) {
            return this.f672H;
        }
        if (wVar.mo1226b() < 1) {
            return 0;
        }
        return mo868K1(rVar, wVar, wVar.mo1226b() - 1) + 1;
    }

    /* renamed from: D1 */
    public void mo864D1(boolean z) {
        if (!z) {
            mo917d((String) null);
            if (this.f695x) {
                this.f695x = false;
                mo1148K0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: H1 */
    public final void mo865H1(int i) {
        int i2;
        int[] iArr = this.f673I;
        int i3 = this.f672H;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f673I = iArr;
    }

    /* renamed from: I1 */
    public final void mo866I1() {
        View[] viewArr = this.f674J;
        if (viewArr == null || viewArr.length != this.f672H) {
            this.f674J = new View[this.f672H];
        }
    }

    /* renamed from: J1 */
    public int mo867J1(int i, int i2) {
        if (this.f689r != 1 || !mo943u1()) {
            int[] iArr = this.f673I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f673I;
        int i3 = this.f672H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: K1 */
    public final int mo868K1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, int i) {
        if (!wVar.f872g) {
            return this.f677M.mo901a(i, this.f672H);
        }
        int c = rVar.mo1205c(i);
        if (c != -1) {
            return this.f677M.mo901a(c, this.f672H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: L0 */
    public int mo869L0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        mo877Q1();
        mo866I1();
        if (this.f689r == 1) {
            return 0;
        }
        return mo904B1(i, rVar, wVar);
    }

    /* renamed from: L1 */
    public final int mo870L1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, int i) {
        if (!wVar.f872g) {
            C0114c cVar = this.f677M;
            int i2 = this.f672H;
            Objects.requireNonNull(cVar);
            return i % i2;
        }
        int i3 = this.f676L.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = rVar.mo1205c(i);
        if (c == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        C0114c cVar2 = this.f677M;
        int i4 = this.f672H;
        Objects.requireNonNull(cVar2);
        return c % i4;
    }

    /* renamed from: M1 */
    public final int mo871M1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, int i) {
        if (!wVar.f872g) {
            Objects.requireNonNull(this.f677M);
            return 1;
        }
        int i2 = this.f675K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (rVar.mo1205c(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        Objects.requireNonNull(this.f677M);
        return 1;
    }

    /* renamed from: N0 */
    public int mo872N0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        mo877Q1();
        mo866I1();
        if (this.f689r == 0) {
            return 0;
        }
        return mo904B1(i, rVar, wVar);
    }

    /* renamed from: N1 */
    public final void mo873N1(View view, int i, boolean z) {
        int i2;
        int i3;
        C0113b bVar = (C0113b) view.getLayoutParams();
        Rect rect = bVar.f832b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int J1 = mo867J1(bVar.f679e, bVar.f680f);
        if (this.f689r == 1) {
            i2 = RecyclerView.C0134l.m520z(J1, i, i5, bVar.width, false);
            i3 = RecyclerView.C0134l.m520z(this.f691t.mo4940l(), this.f822o, i4, bVar.height, true);
        } else {
            int z2 = RecyclerView.C0134l.m520z(J1, i, i4, bVar.height, false);
            int z3 = RecyclerView.C0134l.m520z(this.f691t.mo4940l(), this.f821n, i5, bVar.width, true);
            i3 = z2;
            i2 = z3;
        }
        mo874O1(view, i2, i3, z);
    }

    /* renamed from: O1 */
    public final void mo874O1(View view, int i, int i2, boolean z) {
        RecyclerView.C0139m mVar = (RecyclerView.C0139m) view.getLayoutParams();
        if (z ? mo1163V0(view, i, i2, mVar) : mo1160T0(view, i, i2, mVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: P1 */
    public void mo875P1(int i) {
        if (i != this.f672H) {
            this.f671G = true;
            if (i >= 1) {
                this.f672H = i;
                this.f677M.f681a.clear();
                mo1148K0();
                return;
            }
            throw new IllegalArgumentException(C2108a.m4995e("Span count should be at least 1. Provided ", i));
        }
    }

    /* renamed from: Q0 */
    public void mo876Q0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f673I == null) {
            super.mo876Q0(rect, i, i2);
        }
        int P = mo1154P() + mo1152O();
        int N = mo1151N() + mo1156Q();
        if (this.f689r == 1) {
            i4 = RecyclerView.C0134l.m519h(i2, rect.height() + N, mo1149L());
            int[] iArr = this.f673I;
            i3 = RecyclerView.C0134l.m519h(i, iArr[iArr.length - 1] + P, mo1150M());
        } else {
            i3 = RecyclerView.C0134l.m519h(i, rect.width() + P, mo1150M());
            int[] iArr2 = this.f673I;
            i4 = RecyclerView.C0134l.m519h(i2, iArr2[iArr2.length - 1] + N, mo1149L());
        }
        this.f809b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: Q1 */
    public final void mo877Q1() {
        int i;
        int i2;
        if (this.f689r == 1) {
            i2 = this.f823p - mo1154P();
            i = mo1152O();
        } else {
            i2 = this.f824q - mo1151N();
            i = mo1156Q();
        }
        mo865H1(i2 - i);
    }

    /* renamed from: T */
    public int mo878T(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (this.f689r == 0) {
            return this.f672H;
        }
        if (wVar.mo1226b() < 1) {
            return 0;
        }
        return mo868K1(rVar, wVar, wVar.mo1226b() - 1) + 1;
    }

    /* renamed from: Y0 */
    public boolean mo879Y0() {
        return this.f684B == null && !this.f671G;
    }

    /* renamed from: a1 */
    public void mo880a1(RecyclerView.C0153w wVar, LinearLayoutManager.C0117c cVar, RecyclerView.C0134l.C0137c cVar2) {
        int i = this.f672H;
        for (int i2 = 0; i2 < this.f672H && cVar.mo954b(wVar) && i > 0; i2++) {
            ((C1746m.C1748b) cVar2).mo4923a(cVar.f710d, Math.max(0, cVar.f713g));
            Objects.requireNonNull(this.f677M);
            i--;
            cVar.f710d += cVar.f711e;
        }
    }

    /* renamed from: g */
    public boolean mo881g(RecyclerView.C0139m mVar) {
        return mVar instanceof C0113b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo882i0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0145r r25, androidx.recyclerview.widget.RecyclerView.C0153w r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo1181s(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r5
            int r6 = r5.f679e
            int r5 = r5.f680f
            int r5 = r5 + r6
            android.view.View r7 = super.mo882i0(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.mo920e1(r7)
            r8 = 1
            if (r7 != r8) goto L_0x002b
            r7 = r8
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f694w
            if (r7 == r10) goto L_0x0032
            r7 = r8
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.mo1186y()
            int r7 = r7 - r8
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r22.mo1186y()
            r11 = r7
            r12 = r8
            r7 = 0
        L_0x0045:
            int r13 = r0.f689r
            if (r13 != r8) goto L_0x0051
            boolean r13 = r22.mo943u1()
            if (r13 == 0) goto L_0x0051
            r13 = r8
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo868K1(r1, r2, r7)
            r8 = r10
            r15 = r8
            r16 = r12
            r9 = 0
            r12 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0128
            r17 = r11
            int r11 = r0.mo868K1(r1, r2, r10)
            android.view.View r1 = r0.mo1184x(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0128
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0083
            if (r11 == r14) goto L_0x0083
            if (r4 == 0) goto L_0x007a
            goto L_0x0128
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r9 = 0
            goto L_0x0118
        L_0x0083:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r11
            int r2 = r11.f679e
            r18 = r3
            int r3 = r11.f680f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009b
            if (r2 != r6) goto L_0x009b
            if (r3 != r5) goto L_0x009b
            return r1
        L_0x009b:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00ab
        L_0x00a3:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ae
            if (r7 != 0) goto L_0x00ae
        L_0x00ab:
            r21 = r7
            goto L_0x00cc
        L_0x00ae:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d1
            if (r7 <= r9) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            if (r7 != r9) goto L_0x00ea
            if (r2 <= r15) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            if (r13 != r7) goto L_0x00ea
        L_0x00cc:
            r19 = r9
            r7 = 1
            r9 = 0
            goto L_0x00ee
        L_0x00d1:
            if (r4 != 0) goto L_0x00ea
            r19 = r9
            r9 = 0
            boolean r20 = r0.mo1166Z(r1, r9)
            if (r20 == 0) goto L_0x00ed
            if (r7 <= r12) goto L_0x00df
            goto L_0x00e8
        L_0x00df:
            if (r7 != r12) goto L_0x00ed
            if (r2 <= r8) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = r9
        L_0x00e6:
            if (r13 != r7) goto L_0x00ed
        L_0x00e8:
            r7 = 1
            goto L_0x00ee
        L_0x00ea:
            r19 = r9
            r9 = 0
        L_0x00ed:
            r7 = r9
        L_0x00ee:
            if (r7 == 0) goto L_0x0118
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0109
            int r4 = r11.f679e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r19 = r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x011a
        L_0x0109:
            int r7 = r11.f679e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r7 = r1
            goto L_0x011a
        L_0x0118:
            r7 = r21
        L_0x011a:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r9 = r19
            goto L_0x005e
        L_0x0128:
            r21 = r7
            if (r4 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r4 = r21
        L_0x012f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo882i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* renamed from: l */
    public int mo883l(RecyclerView.C0153w wVar) {
        return mo916c1(wVar);
    }

    /* renamed from: m */
    public int mo884m(RecyclerView.C0153w wVar) {
        return mo918d1(wVar);
    }

    /* renamed from: m0 */
    public void mo885m0(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, View view, C1463b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0113b)) {
            mo1177l0(view, bVar);
            return;
        }
        C0113b bVar2 = (C0113b) layoutParams;
        int K1 = mo868K1(rVar, wVar, bVar2.mo1193a());
        if (this.f689r == 0) {
            i4 = bVar2.f679e;
            i3 = bVar2.f680f;
            i = 1;
            z2 = false;
            z = false;
            i2 = K1;
        } else {
            i3 = 1;
            i2 = bVar2.f679e;
            i = bVar2.f680f;
            z2 = false;
            z = false;
            i4 = K1;
        }
        bVar.mo4236j(C1463b.C1466c.m3547a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: o */
    public int mo886o(RecyclerView.C0153w wVar) {
        return mo916c1(wVar);
    }

    /* renamed from: o0 */
    public void mo887o0(RecyclerView recyclerView, int i, int i2) {
        this.f677M.f681a.clear();
        this.f677M.f682b.clear();
    }

    /* renamed from: p */
    public int mo888p(RecyclerView.C0153w wVar) {
        return mo918d1(wVar);
    }

    /* renamed from: p0 */
    public void mo889p0(RecyclerView recyclerView) {
        this.f677M.f681a.clear();
        this.f677M.f682b.clear();
    }

    /* renamed from: p1 */
    public View mo890p1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, int i, int i2, int i3) {
        mo922f1();
        int k = this.f691t.mo4939k();
        int g = this.f691t.mo4935g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View x = mo1184x(i);
            int R = mo1157R(x);
            if (R >= 0 && R < i3 && mo870L1(rVar, wVar, R) == 0) {
                if (((RecyclerView.C0139m) x.getLayoutParams()).mo1195c()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else if (this.f691t.mo4933e(x) < g && this.f691t.mo4930b(x) >= k) {
                    return x;
                } else {
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: q0 */
    public void mo891q0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f677M.f681a.clear();
        this.f677M.f682b.clear();
    }

    /* renamed from: r0 */
    public void mo892r0(RecyclerView recyclerView, int i, int i2) {
        this.f677M.f681a.clear();
        this.f677M.f682b.clear();
    }

    /* renamed from: t0 */
    public void mo893t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f677M.f681a.clear();
        this.f677M.f682b.clear();
    }

    /* renamed from: u */
    public RecyclerView.C0139m mo894u() {
        return this.f689r == 0 ? new C0113b(-2, -1) : new C0113b(-1, -2);
    }

    /* renamed from: u0 */
    public void mo895u0(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (wVar.f872g) {
            int y = mo1186y();
            for (int i = 0; i < y; i++) {
                C0113b bVar = (C0113b) mo1184x(i).getLayoutParams();
                int a = bVar.mo1193a();
                this.f675K.put(a, bVar.f680f);
                this.f676L.put(a, bVar.f679e);
            }
        }
        super.mo895u0(rVar, wVar);
        this.f675K.clear();
        this.f676L.clear();
    }

    /* renamed from: v */
    public RecyclerView.C0139m mo896v(Context context, AttributeSet attributeSet) {
        return new C0113b(context, attributeSet);
    }

    /* renamed from: v0 */
    public void mo897v0(RecyclerView.C0153w wVar) {
        this.f684B = null;
        this.f697z = -1;
        this.f683A = Integer.MIN_VALUE;
        this.f685C.mo951d();
        this.f671G = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0254 A[SYNTHETIC] */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo898v1(androidx.recyclerview.widget.RecyclerView.C0145r r18, androidx.recyclerview.widget.RecyclerView.C0153w r19, androidx.recyclerview.widget.LinearLayoutManager.C0117c r20, androidx.recyclerview.widget.LinearLayoutManager.C0116b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            b.u.c.s r3 = r6.f691t
            int r3 = r3.mo4938j()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r3 == r4) goto L_0x0017
            r4 = r5
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            int r9 = r17.mo1186y()
            if (r9 <= 0) goto L_0x0025
            int[] r9 = r6.f673I
            int r10 = r6.f672H
            r9 = r9[r10]
            goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x002b
            r17.mo877Q1()
        L_0x002b:
            int r10 = r2.f711e
            if (r10 != r5) goto L_0x0031
            r10 = r5
            goto L_0x0032
        L_0x0031:
            r10 = 0
        L_0x0032:
            int r11 = r6.f672H
            if (r10 != 0) goto L_0x0043
            int r11 = r2.f710d
            int r11 = r6.mo870L1(r0, r1, r11)
            int r12 = r2.f710d
            int r12 = r6.mo871M1(r0, r1, r12)
            int r11 = r11 + r12
        L_0x0043:
            r12 = 0
        L_0x0044:
            int r13 = r6.f672H
            if (r12 >= r13) goto L_0x0094
            boolean r13 = r2.mo954b(r1)
            if (r13 == 0) goto L_0x0094
            if (r11 <= 0) goto L_0x0094
            int r13 = r2.f710d
            int r14 = r6.mo871M1(r0, r1, r13)
            int r15 = r6.f672H
            if (r14 > r15) goto L_0x006c
            int r11 = r11 - r14
            if (r11 >= 0) goto L_0x005e
            goto L_0x0094
        L_0x005e:
            android.view.View r13 = r2.mo955c(r0)
            if (r13 != 0) goto L_0x0065
            goto L_0x0094
        L_0x0065:
            android.view.View[] r14 = r6.f674J
            r14[r12] = r13
            int r12 = r12 + 1
            goto L_0x0044
        L_0x006c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f672H
            java.lang.String r3 = " spans."
            java.lang.String r1 = p133c.p149b.p152b.p153a.C2108a.m4999i(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0094:
            if (r12 != 0) goto L_0x0099
            r7.f704b = r5
            return
        L_0x0099:
            if (r10 == 0) goto L_0x009f
            r13 = r5
            r11 = r12
            r5 = 0
            goto L_0x00a3
        L_0x009f:
            int r5 = r12 + -1
            r11 = -1
            r13 = -1
        L_0x00a3:
            r14 = 0
        L_0x00a4:
            if (r5 == r11) goto L_0x00c1
            android.view.View[] r15 = r6.f674J
            r15 = r15[r5]
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r8 = r16
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r8
            int r15 = r6.mo1157R(r15)
            int r15 = r6.mo871M1(r0, r1, r15)
            r8.f680f = r15
            r8.f679e = r14
            int r14 = r14 + r15
            int r5 = r5 + r13
            goto L_0x00a4
        L_0x00c1:
            r0 = 0
            r1 = 0
            r5 = 0
        L_0x00c4:
            if (r1 >= r12) goto L_0x0120
            android.view.View[] r8 = r6.f674J
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r11 = r2.f717k
            if (r11 != 0) goto L_0x00da
            if (r10 == 0) goto L_0x00d5
            r6.mo1168b(r8)
            r11 = 0
            goto L_0x00e7
        L_0x00d5:
            r11 = 0
            r6.mo1170c(r8, r11, r11)
            goto L_0x00e7
        L_0x00da:
            r11 = 0
            if (r10 == 0) goto L_0x00e3
            r13 = -1
            r14 = 1
            r6.mo1170c(r8, r13, r14)
            goto L_0x00e7
        L_0x00e3:
            r13 = 1
            r6.mo1170c(r8, r11, r13)
        L_0x00e7:
            android.graphics.Rect r13 = r6.f678N
            androidx.recyclerview.widget.RecyclerView r14 = r6.f809b
            if (r14 != 0) goto L_0x00f1
            r13.set(r11, r11, r11, r11)
            goto L_0x00f8
        L_0x00f1:
            android.graphics.Rect r14 = r14.mo970L(r8)
            r13.set(r14)
        L_0x00f8:
            r6.mo873N1(r8, r3, r11)
            b.u.c.s r11 = r6.f691t
            int r11 = r11.mo4931c(r8)
            if (r11 <= r5) goto L_0x0104
            r5 = r11
        L_0x0104:
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r11
            r13 = 1065353216(0x3f800000, float:1.0)
            b.u.c.s r14 = r6.f691t
            int r8 = r14.mo4932d(r8)
            float r8 = (float) r8
            float r8 = r8 * r13
            int r11 = r11.f680f
            float r11 = (float) r11
            float r8 = r8 / r11
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x011d
            r0 = r8
        L_0x011d:
            int r1 = r1 + 1
            goto L_0x00c4
        L_0x0120:
            if (r4 == 0) goto L_0x014b
            int r1 = r6.f672H
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r9)
            r6.mo865H1(r0)
            r5 = 0
            r11 = 0
        L_0x0133:
            if (r11 >= r12) goto L_0x014b
            android.view.View[] r0 = r6.f674J
            r0 = r0[r11]
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r6.mo873N1(r0, r1, r3)
            b.u.c.s r1 = r6.f691t
            int r0 = r1.mo4931c(r0)
            if (r0 <= r5) goto L_0x0148
            r5 = r0
        L_0x0148:
            int r11 = r11 + 1
            goto L_0x0133
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 >= r12) goto L_0x01ad
            android.view.View[] r0 = r6.f674J
            r0 = r0[r11]
            b.u.c.s r1 = r6.f691t
            int r1 = r1.mo4931c(r0)
            if (r1 == r5) goto L_0x01a9
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r1 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r1
            android.graphics.Rect r3 = r1.f832b
            int r4 = r3.top
            int r8 = r3.bottom
            int r4 = r4 + r8
            int r8 = r1.topMargin
            int r4 = r4 + r8
            int r8 = r1.bottomMargin
            int r4 = r4 + r8
            int r8 = r3.left
            int r3 = r3.right
            int r8 = r8 + r3
            int r3 = r1.leftMargin
            int r8 = r8 + r3
            int r3 = r1.rightMargin
            int r8 = r8 + r3
            int r3 = r1.f679e
            int r9 = r1.f680f
            int r3 = r6.mo867J1(r3, r9)
            int r9 = r6.f689r
            r10 = 1
            if (r9 != r10) goto L_0x0195
            int r1 = r1.width
            r9 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r1 = androidx.recyclerview.widget.RecyclerView.C0134l.m520z(r3, r9, r8, r1, r13)
            int r3 = r5 - r4
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            goto L_0x01a5
        L_0x0195:
            r13 = 0
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = r5 - r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r1 = r1.height
            int r3 = androidx.recyclerview.widget.RecyclerView.C0134l.m520z(r3, r9, r4, r1, r13)
            r1 = r8
        L_0x01a5:
            r6.mo874O1(r0, r1, r3, r10)
            goto L_0x01aa
        L_0x01a9:
            r13 = 0
        L_0x01aa:
            int r11 = r11 + 1
            goto L_0x014c
        L_0x01ad:
            r13 = 0
            r0 = 1
            r7.f703a = r5
            int r1 = r6.f689r
            if (r1 != r0) goto L_0x01ca
            int r0 = r2.f712f
            r1 = -1
            if (r0 != r1) goto L_0x01c0
            int r0 = r2.f708b
            int r1 = r0 - r5
            r11 = r1
            goto L_0x01c5
        L_0x01c0:
            int r0 = r2.f708b
            int r5 = r5 + r0
            r11 = r0
            r0 = r5
        L_0x01c5:
            r1 = r11
            r2 = r13
            r11 = r0
            r0 = r2
            goto L_0x01dd
        L_0x01ca:
            r0 = -1
            int r1 = r2.f712f
            if (r1 != r0) goto L_0x01d5
            int r0 = r2.f708b
            int r1 = r0 - r5
            r11 = r1
            goto L_0x01da
        L_0x01d5:
            int r0 = r2.f708b
            int r5 = r5 + r0
            r11 = r0
            r0 = r5
        L_0x01da:
            r2 = r11
            r1 = r13
            r11 = r1
        L_0x01dd:
            r8 = r13
        L_0x01de:
            if (r8 >= r12) goto L_0x0265
            android.view.View[] r3 = r6.f674J
            r9 = r3[r8]
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            r10 = r3
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C0113b) r10
            int r3 = r6.f689r
            r4 = 1
            if (r3 != r4) goto L_0x0224
            boolean r0 = r17.mo943u1()
            if (r0 == 0) goto L_0x020d
            int r0 = r17.mo1152O()
            int[] r2 = r6.f673I
            int r3 = r6.f672H
            int r4 = r10.f679e
            int r3 = r3 - r4
            r2 = r2[r3]
            int r0 = r0 + r2
            b.u.c.s r2 = r6.f691t
            int r2 = r2.mo4932d(r9)
            int r2 = r0 - r2
            goto L_0x0237
        L_0x020d:
            int r0 = r17.mo1152O()
            int[] r2 = r6.f673I
            int r3 = r10.f679e
            r2 = r2[r3]
            int r0 = r0 + r2
            b.u.c.s r2 = r6.f691t
            int r2 = r2.mo4932d(r9)
            int r2 = r2 + r0
            r14 = r0
            r13 = r1
            r15 = r11
            r11 = r2
            goto L_0x023b
        L_0x0224:
            int r1 = r17.mo1156Q()
            int[] r3 = r6.f673I
            int r4 = r10.f679e
            r3 = r3[r4]
            int r1 = r1 + r3
            b.u.c.s r3 = r6.f691t
            int r3 = r3.mo4932d(r9)
            int r11 = r3 + r1
        L_0x0237:
            r13 = r1
            r14 = r2
            r15 = r11
            r11 = r0
        L_0x023b:
            r0 = r17
            r1 = r9
            r2 = r14
            r3 = r13
            r4 = r11
            r5 = r15
            r0.mo1167a0(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo1195c()
            if (r0 != 0) goto L_0x0251
            boolean r0 = r10.mo1194b()
            if (r0 == 0) goto L_0x0254
        L_0x0251:
            r0 = 1
            r7.f705c = r0
        L_0x0254:
            boolean r0 = r7.f706d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f706d = r0
            int r8 = r8 + 1
            r0 = r11
            r1 = r13
            r2 = r14
            r11 = r15
            goto L_0x01de
        L_0x0265:
            android.view.View[] r0 = r6.f674J
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo898v1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: w */
    public RecyclerView.C0139m mo899w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0113b((ViewGroup.MarginLayoutParams) layoutParams) : new C0113b(layoutParams);
    }

    /* renamed from: w1 */
    public void mo900w1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, LinearLayoutManager.C0115a aVar, int i) {
        mo877Q1();
        if (wVar.mo1226b() > 0 && !wVar.f872g) {
            boolean z = i == 1;
            int L1 = mo870L1(rVar, wVar, aVar.f699b);
            if (z) {
                while (L1 > 0) {
                    int i2 = aVar.f699b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f699b = i3;
                    L1 = mo870L1(rVar, wVar, i3);
                }
            } else {
                int b = wVar.mo1226b() - 1;
                int i4 = aVar.f699b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int L12 = mo870L1(rVar, wVar, i5);
                    if (L12 <= L1) {
                        break;
                    }
                    i4 = i5;
                    L1 = L12;
                }
                aVar.f699b = i4;
            }
        }
        mo866I1();
    }
}
