package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p009b.p121u.C1716a;
import p009b.p121u.p122c.C1746m;
import p009b.p121u.p122c.C1751o;
import p009b.p121u.p122c.C1756s;
import p133c.p149b.p152b.p153a.C2108a;

public class LinearLayoutManager extends RecyclerView.C0134l implements RecyclerView.C0150v.C0152b {

    /* renamed from: A */
    public int f683A = Integer.MIN_VALUE;

    /* renamed from: B */
    public C0118d f684B = null;

    /* renamed from: C */
    public final C0115a f685C = new C0115a();

    /* renamed from: D */
    public final C0116b f686D = new C0116b();

    /* renamed from: E */
    public int f687E = 2;

    /* renamed from: F */
    public int[] f688F = new int[2];

    /* renamed from: r */
    public int f689r = 1;

    /* renamed from: s */
    public C0117c f690s;

    /* renamed from: t */
    public C1756s f691t;

    /* renamed from: u */
    public boolean f692u;

    /* renamed from: v */
    public boolean f693v = false;

    /* renamed from: w */
    public boolean f694w = false;

    /* renamed from: x */
    public boolean f695x = false;

    /* renamed from: y */
    public boolean f696y = true;

    /* renamed from: z */
    public int f697z = -1;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0115a {

        /* renamed from: a */
        public C1756s f698a;

        /* renamed from: b */
        public int f699b;

        /* renamed from: c */
        public int f700c;

        /* renamed from: d */
        public boolean f701d;

        /* renamed from: e */
        public boolean f702e;

        public C0115a() {
            mo951d();
        }

        /* renamed from: a */
        public void mo948a() {
            this.f700c = this.f701d ? this.f698a.mo4935g() : this.f698a.mo4939k();
        }

        /* renamed from: b */
        public void mo949b(View view, int i) {
            if (this.f701d) {
                this.f700c = this.f698a.mo4944m() + this.f698a.mo4930b(view);
            } else {
                this.f700c = this.f698a.mo4933e(view);
            }
            this.f699b = i;
        }

        /* renamed from: c */
        public void mo950c(View view, int i) {
            int i2;
            int m = this.f698a.mo4944m();
            if (m >= 0) {
                mo949b(view, i);
                return;
            }
            this.f699b = i;
            if (this.f701d) {
                int g = (this.f698a.mo4935g() - m) - this.f698a.mo4930b(view);
                this.f700c = this.f698a.mo4935g() - g;
                if (g > 0) {
                    int c = this.f700c - this.f698a.mo4931c(view);
                    int k = this.f698a.mo4939k();
                    int min = c - (Math.min(this.f698a.mo4933e(view) - k, 0) + k);
                    if (min < 0) {
                        i2 = Math.min(g, -min) + this.f700c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e = this.f698a.mo4933e(view);
                int k2 = e - this.f698a.mo4939k();
                this.f700c = e;
                if (k2 > 0) {
                    int g2 = (this.f698a.mo4935g() - Math.min(0, (this.f698a.mo4935g() - m) - this.f698a.mo4930b(view))) - (this.f698a.mo4931c(view) + e);
                    if (g2 < 0) {
                        i2 = this.f700c - Math.min(k2, -g2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f700c = i2;
        }

        /* renamed from: d */
        public void mo951d() {
            this.f699b = -1;
            this.f700c = Integer.MIN_VALUE;
            this.f701d = false;
            this.f702e = false;
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("AnchorInfo{mPosition=");
            o.append(this.f699b);
            o.append(", mCoordinate=");
            o.append(this.f700c);
            o.append(", mLayoutFromEnd=");
            o.append(this.f701d);
            o.append(", mValid=");
            o.append(this.f702e);
            o.append('}');
            return o.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0116b {

        /* renamed from: a */
        public int f703a;

        /* renamed from: b */
        public boolean f704b;

        /* renamed from: c */
        public boolean f705c;

        /* renamed from: d */
        public boolean f706d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0117c {

        /* renamed from: a */
        public boolean f707a = true;

        /* renamed from: b */
        public int f708b;

        /* renamed from: c */
        public int f709c;

        /* renamed from: d */
        public int f710d;

        /* renamed from: e */
        public int f711e;

        /* renamed from: f */
        public int f712f;

        /* renamed from: g */
        public int f713g;

        /* renamed from: h */
        public int f714h = 0;

        /* renamed from: i */
        public int f715i = 0;

        /* renamed from: j */
        public int f716j;

        /* renamed from: k */
        public List<RecyclerView.C0156z> f717k = null;

        /* renamed from: l */
        public boolean f718l;

        /* renamed from: a */
        public void mo953a(View view) {
            int i;
            int a;
            int size = this.f717k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f717k.get(i3).f888a;
                RecyclerView.C0139m mVar = (RecyclerView.C0139m) view3.getLayoutParams();
                if (view3 != view && !mVar.mo1195c() && (a = (mVar.mo1193a() - this.f710d) * this.f711e) >= 0 && a < i2) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i2 = a;
                }
            }
            if (view2 == null) {
                i = -1;
            } else {
                i = ((RecyclerView.C0139m) view2.getLayoutParams()).mo1193a();
            }
            this.f710d = i;
        }

        /* renamed from: b */
        public boolean mo954b(RecyclerView.C0153w wVar) {
            int i = this.f710d;
            return i >= 0 && i < wVar.mo1226b();
        }

        /* renamed from: c */
        public View mo955c(RecyclerView.C0145r rVar) {
            List<RecyclerView.C0156z> list = this.f717k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f717k.get(i).f888a;
                    RecyclerView.C0139m mVar = (RecyclerView.C0139m) view.getLayoutParams();
                    if (!mVar.mo1195c() && this.f710d == mVar.mo1193a()) {
                        mo953a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = rVar.mo1212j(this.f710d, false, Long.MAX_VALUE).f888a;
            this.f710d += this.f711e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0118d implements Parcelable {
        public static final Parcelable.Creator<C0118d> CREATOR = new C0119a();

        /* renamed from: c */
        public int f719c;

        /* renamed from: d */
        public int f720d;

        /* renamed from: e */
        public boolean f721e;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class C0119a implements Parcelable.Creator<C0118d> {
            public Object createFromParcel(Parcel parcel) {
                return new C0118d(parcel);
            }

            public Object[] newArray(int i) {
                return new C0118d[i];
            }
        }

        public C0118d() {
        }

        public C0118d(Parcel parcel) {
            this.f719c = parcel.readInt();
            this.f720d = parcel.readInt();
            this.f721e = parcel.readInt() != 1 ? false : true;
        }

        public C0118d(C0118d dVar) {
            this.f719c = dVar.f719c;
            this.f720d = dVar.f720d;
            this.f721e = dVar.f721e;
        }

        /* renamed from: a */
        public boolean mo956a() {
            return this.f719c >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f719c);
            parcel.writeInt(this.f720d);
            parcel.writeInt(this.f721e ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        mo905C1(i);
        mo917d((String) null);
        if (z != this.f693v) {
            this.f693v = z;
            mo1148K0();
        }
    }

    /* renamed from: A0 */
    public Parcelable mo902A0() {
        C0118d dVar = this.f684B;
        if (dVar != null) {
            return new C0118d(dVar);
        }
        C0118d dVar2 = new C0118d();
        if (mo1186y() > 0) {
            mo922f1();
            boolean z = this.f692u ^ this.f694w;
            dVar2.f721e = z;
            if (z) {
                View s1 = mo940s1();
                dVar2.f720d = this.f691t.mo4935g() - this.f691t.mo4930b(s1);
                dVar2.f719c = mo1157R(s1);
            } else {
                View t1 = mo942t1();
                dVar2.f719c = mo1157R(t1);
                dVar2.f720d = this.f691t.mo4933e(t1) - this.f691t.mo4939k();
            }
        } else {
            dVar2.f719c = -1;
        }
        return dVar2;
    }

    /* renamed from: A1 */
    public final void mo903A1() {
        this.f694w = (this.f689r == 1 || !mo943u1()) ? this.f693v : !this.f693v;
    }

    /* renamed from: B1 */
    public int mo904B1(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (mo1186y() == 0 || i == 0) {
            return 0;
        }
        mo922f1();
        this.f690s.f707a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo906E1(i2, abs, true, wVar);
        C0117c cVar = this.f690s;
        int g1 = mo923g1(rVar, cVar, wVar, false) + cVar.f713g;
        if (g1 < 0) {
            return 0;
        }
        if (abs > g1) {
            i = i2 * g1;
        }
        this.f691t.mo4943p(-i);
        this.f690s.f716j = i;
        return i;
    }

    /* renamed from: C1 */
    public void mo905C1(int i) {
        if (i == 0 || i == 1) {
            mo917d((String) null);
            if (i != this.f689r || this.f691t == null) {
                C1756s a = C1756s.m4290a(this, i);
                this.f691t = a;
                this.f685C.f698a = a;
                this.f689r = i;
                mo1148K0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C2108a.m4995e("invalid orientation:", i));
    }

    /* renamed from: D1 */
    public void mo864D1(boolean z) {
        mo917d((String) null);
        if (this.f695x != z) {
            this.f695x = z;
            mo1148K0();
        }
    }

    /* renamed from: E1 */
    public final void mo906E1(int i, int i2, boolean z, RecyclerView.C0153w wVar) {
        int i3;
        this.f690s.f718l = mo947z1();
        this.f690s.f712f = i;
        int[] iArr = this.f688F;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo913Z0(wVar, iArr);
        int max = Math.max(0, this.f688F[0]);
        int max2 = Math.max(0, this.f688F[1]);
        if (i == 1) {
            z2 = true;
        }
        C0117c cVar = this.f690s;
        int i5 = z2 ? max2 : max;
        cVar.f714h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f715i = max;
        if (z2) {
            cVar.f714h = this.f691t.mo4936h() + i5;
            View s1 = mo940s1();
            C0117c cVar2 = this.f690s;
            if (this.f694w) {
                i4 = -1;
            }
            cVar2.f711e = i4;
            int R = mo1157R(s1);
            C0117c cVar3 = this.f690s;
            cVar2.f710d = R + cVar3.f711e;
            cVar3.f708b = this.f691t.mo4930b(s1);
            i3 = this.f691t.mo4930b(s1) - this.f691t.mo4935g();
        } else {
            View t1 = mo942t1();
            C0117c cVar4 = this.f690s;
            cVar4.f714h = this.f691t.mo4939k() + cVar4.f714h;
            C0117c cVar5 = this.f690s;
            if (!this.f694w) {
                i4 = -1;
            }
            cVar5.f711e = i4;
            int R2 = mo1157R(t1);
            C0117c cVar6 = this.f690s;
            cVar5.f710d = R2 + cVar6.f711e;
            cVar6.f708b = this.f691t.mo4933e(t1);
            i3 = (-this.f691t.mo4933e(t1)) + this.f691t.mo4939k();
        }
        C0117c cVar7 = this.f690s;
        cVar7.f709c = i2;
        if (z) {
            cVar7.f709c = i2 - i3;
        }
        cVar7.f713g = i3;
    }

    /* renamed from: F1 */
    public final void mo907F1(int i, int i2) {
        this.f690s.f709c = this.f691t.mo4935g() - i2;
        C0117c cVar = this.f690s;
        cVar.f711e = this.f694w ? -1 : 1;
        cVar.f710d = i;
        cVar.f712f = 1;
        cVar.f708b = i2;
        cVar.f713g = Integer.MIN_VALUE;
    }

    /* renamed from: G1 */
    public final void mo908G1(int i, int i2) {
        this.f690s.f709c = i2 - this.f691t.mo4939k();
        C0117c cVar = this.f690s;
        cVar.f710d = i;
        cVar.f711e = this.f694w ? 1 : -1;
        cVar.f712f = -1;
        cVar.f708b = i2;
        cVar.f713g = Integer.MIN_VALUE;
    }

    /* renamed from: L0 */
    public int mo869L0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (this.f689r == 1) {
            return 0;
        }
        return mo904B1(i, rVar, wVar);
    }

    /* renamed from: M0 */
    public void mo909M0(int i) {
        this.f697z = i;
        this.f683A = Integer.MIN_VALUE;
        C0118d dVar = this.f684B;
        if (dVar != null) {
            dVar.f719c = -1;
        }
        mo1148K0();
    }

    /* renamed from: N0 */
    public int mo872N0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (this.f689r == 0) {
            return 0;
        }
        return mo904B1(i, rVar, wVar);
    }

    /* renamed from: U0 */
    public boolean mo910U0() {
        boolean z;
        if (this.f822o == 1073741824 || this.f821n == 1073741824) {
            return false;
        }
        int y = mo1186y();
        int i = 0;
        while (true) {
            if (i >= y) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = mo1184x(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public boolean mo911W() {
        return true;
    }

    /* renamed from: W0 */
    public void mo912W0(RecyclerView recyclerView, RecyclerView.C0153w wVar, int i) {
        C1751o oVar = new C1751o(recyclerView.getContext());
        oVar.f851a = i;
        mo1165X0(oVar);
    }

    /* renamed from: Y0 */
    public boolean mo879Y0() {
        return this.f684B == null && this.f692u == this.f695x;
    }

    /* renamed from: Z0 */
    public void mo913Z0(RecyclerView.C0153w wVar, int[] iArr) {
        int i;
        int l = wVar.f866a != -1 ? this.f691t.mo4940l() : 0;
        if (this.f690s.f712f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    /* renamed from: a */
    public PointF mo914a(int i) {
        if (mo1186y() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo1157R(mo1184x(0))) {
            z = true;
        }
        if (z != this.f694w) {
            i2 = -1;
        }
        return this.f689r == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a1 */
    public void mo880a1(RecyclerView.C0153w wVar, C0117c cVar, RecyclerView.C0134l.C0137c cVar2) {
        int i = cVar.f710d;
        if (i >= 0 && i < wVar.mo1226b()) {
            ((C1746m.C1748b) cVar2).mo4923a(i, Math.max(0, cVar.f713g));
        }
    }

    /* renamed from: b1 */
    public final int mo915b1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        mo922f1();
        C1756s sVar = this.f691t;
        View j1 = mo930j1(!this.f696y, true);
        return C1716a.m4161g(wVar, sVar, j1, mo927i1(!this.f696y, true), this, this.f696y);
    }

    /* renamed from: c1 */
    public final int mo916c1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        mo922f1();
        C1756s sVar = this.f691t;
        View j1 = mo930j1(!this.f696y, true);
        return C1716a.m4162h(wVar, sVar, j1, mo927i1(!this.f696y, true), this, this.f696y, this.f694w);
    }

    /* renamed from: d */
    public void mo917d(String str) {
        RecyclerView recyclerView;
        if (this.f684B == null && (recyclerView = this.f809b) != null) {
            recyclerView.mo1035i(str);
        }
    }

    /* renamed from: d1 */
    public final int mo918d1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        mo922f1();
        C1756s sVar = this.f691t;
        View j1 = mo930j1(!this.f696y, true);
        return C1716a.m4163i(wVar, sVar, j1, mo927i1(!this.f696y, true), this, this.f696y);
    }

    /* renamed from: e */
    public boolean mo919e() {
        return this.f689r == 0;
    }

    /* renamed from: e1 */
    public int mo920e1(int i) {
        if (i == 1) {
            return (this.f689r != 1 && mo943u1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f689r != 1 && mo943u1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f689r == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f689r == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f689r == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f689r == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: f */
    public boolean mo921f() {
        return this.f689r == 1;
    }

    /* renamed from: f1 */
    public void mo922f1() {
        if (this.f690s == null) {
            this.f690s = new C0117c();
        }
    }

    /* renamed from: g1 */
    public int mo923g1(RecyclerView.C0145r rVar, C0117c cVar, RecyclerView.C0153w wVar, boolean z) {
        int i = cVar.f709c;
        int i2 = cVar.f713g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f713g = i2 + i;
            }
            mo944x1(rVar, cVar);
        }
        int i3 = cVar.f709c + cVar.f714h;
        C0116b bVar = this.f686D;
        while (true) {
            if ((!cVar.f718l && i3 <= 0) || !cVar.mo954b(wVar)) {
                break;
            }
            bVar.f703a = 0;
            bVar.f704b = false;
            bVar.f705c = false;
            bVar.f706d = false;
            mo898v1(rVar, wVar, cVar, bVar);
            if (!bVar.f704b) {
                int i4 = cVar.f708b;
                int i5 = bVar.f703a;
                cVar.f708b = (cVar.f712f * i5) + i4;
                if (!bVar.f705c || cVar.f717k != null || !wVar.f872g) {
                    cVar.f709c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.f713g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.f713g = i7;
                    int i8 = cVar.f709c;
                    if (i8 < 0) {
                        cVar.f713g = i7 + i8;
                    }
                    mo944x1(rVar, cVar);
                }
                if (z && bVar.f706d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f709c;
    }

    /* renamed from: h0 */
    public void mo924h0(RecyclerView recyclerView, RecyclerView.C0145r rVar) {
        mo1175g0();
    }

    /* renamed from: h1 */
    public final View mo925h1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return mo890p1(rVar, wVar, 0, mo1186y(), wVar.mo1226b());
    }

    /* renamed from: i */
    public void mo926i(int i, int i2, RecyclerView.C0153w wVar, RecyclerView.C0134l.C0137c cVar) {
        if (this.f689r != 0) {
            i = i2;
        }
        if (mo1186y() != 0 && i != 0) {
            mo922f1();
            mo906E1(i > 0 ? 1 : -1, Math.abs(i), true, wVar);
            mo880a1(wVar, this.f690s, cVar);
        }
    }

    /* renamed from: i0 */
    public View mo882i0(View view, int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        int e1;
        View view2;
        mo903A1();
        if (mo1186y() == 0 || (e1 = mo920e1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo922f1();
        mo906E1(e1, (int) (((float) this.f691t.mo4940l()) * 0.33333334f), false, wVar);
        C0117c cVar = this.f690s;
        cVar.f713g = Integer.MIN_VALUE;
        cVar.f707a = false;
        mo923g1(rVar, cVar, wVar, true);
        if (e1 == -1) {
            if (this.f694w) {
                view2 = mo936n1(mo1186y() - 1, -1);
            } else {
                view2 = mo936n1(0, mo1186y());
            }
        } else if (this.f694w) {
            view2 = mo936n1(0, mo1186y());
        } else {
            view2 = mo936n1(mo1186y() - 1, -1);
        }
        View t1 = e1 == -1 ? mo942t1() : mo940s1();
        if (!t1.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return t1;
    }

    /* renamed from: i1 */
    public View mo927i1(boolean z, boolean z2) {
        int y;
        int i;
        if (this.f694w) {
            y = 0;
            i = mo1186y();
        } else {
            y = mo1186y() - 1;
            i = -1;
        }
        return mo937o1(y, i, z, z2);
    }

    /* renamed from: j */
    public void mo928j(int i, RecyclerView.C0134l.C0137c cVar) {
        boolean z;
        int i2;
        C0118d dVar = this.f684B;
        int i3 = -1;
        if (dVar == null || !dVar.mo956a()) {
            mo903A1();
            z = this.f694w;
            i2 = this.f697z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0118d dVar2 = this.f684B;
            z = dVar2.f721e;
            i2 = dVar2.f719c;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f687E && i2 >= 0 && i2 < i; i4++) {
            ((C1746m.C1748b) cVar).mo4923a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: j0 */
    public void mo929j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0145r rVar = this.f809b.f752d;
        mo1176k0(accessibilityEvent);
        if (mo1186y() > 0) {
            accessibilityEvent.setFromIndex(mo932k1());
            accessibilityEvent.setToIndex(mo934m1());
        }
    }

    /* renamed from: j1 */
    public View mo930j1(boolean z, boolean z2) {
        int i;
        int y;
        if (this.f694w) {
            i = mo1186y() - 1;
            y = -1;
        } else {
            i = 0;
            y = mo1186y();
        }
        return mo937o1(i, y, z, z2);
    }

    /* renamed from: k */
    public int mo931k(RecyclerView.C0153w wVar) {
        return mo915b1(wVar);
    }

    /* renamed from: k1 */
    public int mo932k1() {
        View o1 = mo937o1(0, mo1186y(), false, true);
        if (o1 == null) {
            return -1;
        }
        return mo1157R(o1);
    }

    /* renamed from: l */
    public int mo883l(RecyclerView.C0153w wVar) {
        return mo916c1(wVar);
    }

    /* renamed from: l1 */
    public final View mo933l1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return mo890p1(rVar, wVar, mo1186y() - 1, -1, wVar.mo1226b());
    }

    /* renamed from: m */
    public int mo884m(RecyclerView.C0153w wVar) {
        return mo918d1(wVar);
    }

    /* renamed from: m1 */
    public int mo934m1() {
        View o1 = mo937o1(mo1186y() - 1, -1, false, true);
        if (o1 == null) {
            return -1;
        }
        return mo1157R(o1);
    }

    /* renamed from: n */
    public int mo935n(RecyclerView.C0153w wVar) {
        return mo915b1(wVar);
    }

    /* renamed from: n1 */
    public View mo936n1(int i, int i2) {
        int i3;
        int i4;
        mo922f1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo1184x(i);
        }
        if (this.f691t.mo4933e(mo1184x(i)) < this.f691t.mo4939k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f689r == 0 ? this.f812e : this.f813f).mo4853a(i, i2, i4, i3);
    }

    /* renamed from: o */
    public int mo886o(RecyclerView.C0153w wVar) {
        return mo916c1(wVar);
    }

    /* renamed from: o1 */
    public View mo937o1(int i, int i2, boolean z, boolean z2) {
        mo922f1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f689r == 0 ? this.f812e : this.f813f).mo4853a(i, i2, i4, i3);
    }

    /* renamed from: p */
    public int mo888p(RecyclerView.C0153w wVar) {
        return mo918d1(wVar);
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
            if (R >= 0 && R < i3) {
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

    /* renamed from: q1 */
    public final int mo938q1(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, boolean z) {
        int g;
        int g2 = this.f691t.mo4935g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -mo904B1(-g2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (g = this.f691t.mo4935g() - i3) <= 0) {
            return i2;
        }
        this.f691t.mo4943p(g);
        return g + i2;
    }

    /* renamed from: r1 */
    public final int mo939r1(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, boolean z) {
        int k;
        int k2 = i - this.f691t.mo4939k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -mo904B1(k2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.f691t.mo4939k()) <= 0) {
            return i2;
        }
        this.f691t.mo4943p(-k);
        return i2 - k;
    }

    /* renamed from: s1 */
    public final View mo940s1() {
        return mo1184x(this.f694w ? 0 : mo1186y() - 1);
    }

    /* renamed from: t */
    public View mo941t(int i) {
        int y = mo1186y();
        if (y == 0) {
            return null;
        }
        int R = i - mo1157R(mo1184x(0));
        if (R >= 0 && R < y) {
            View x = mo1184x(R);
            if (mo1157R(x) == i) {
                return x;
            }
        }
        return super.mo941t(i);
    }

    /* renamed from: t1 */
    public final View mo942t1() {
        return mo1184x(this.f694w ? mo1186y() - 1 : 0);
    }

    /* renamed from: u */
    public RecyclerView.C0139m mo894u() {
        return new RecyclerView.C0139m(-2, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo895u0(androidx.recyclerview.widget.RecyclerView.C0145r r17, androidx.recyclerview.widget.RecyclerView.C0153w r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f684B
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f697z
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.mo1226b()
            if (r3 != 0) goto L_0x0019
            r16.mo1136E0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f684B
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.mo956a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f684B
            int r3 = r3.f719c
            r0.f697z = r3
        L_0x0029:
            r16.mo922f1()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r5 = 0
            r3.f707a = r5
            r16.mo903A1()
            android.view.View r3 = r16.mo1143I()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f685C
            boolean r7 = r6.f702e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.f697z
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f684B
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0236
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4933e(r3)
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4935g()
            if (r6 >= r7) goto L_0x0068
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4930b(r3)
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4939k()
            if (r6 > r7) goto L_0x0236
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f685C
            int r7 = r0.mo1157R(r3)
            r6.mo950c(r3, r7)
            goto L_0x0236
        L_0x0073:
            r6.mo951d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            boolean r6 = r0.f694w
            boolean r7 = r0.f695x
            r6 = r6 ^ r7
            r3.f701d = r6
            boolean r6 = r2.f872g
            if (r6 != 0) goto L_0x0170
            int r6 = r0.f697z
            if (r6 != r4) goto L_0x0089
            goto L_0x0170
        L_0x0089:
            if (r6 < 0) goto L_0x016c
            int r7 = r18.mo1226b()
            if (r6 < r7) goto L_0x0093
            goto L_0x016c
        L_0x0093:
            int r6 = r0.f697z
            r3.f699b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f684B
            if (r6 == 0) goto L_0x00c1
            boolean r6 = r6.mo956a()
            if (r6 == 0) goto L_0x00c1
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f684B
            boolean r6 = r6.f721e
            r3.f701d = r6
            if (r6 == 0) goto L_0x00b5
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4935g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f684B
            int r7 = r7.f720d
            goto L_0x015d
        L_0x00b5:
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4939k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f684B
            int r7 = r7.f720d
            goto L_0x0167
        L_0x00c1:
            int r6 = r0.f683A
            if (r6 != r8) goto L_0x014f
            int r6 = r0.f697z
            android.view.View r6 = r0.mo941t(r6)
            if (r6 == 0) goto L_0x012d
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4931c(r6)
            b.u.c.s r10 = r0.f691t
            int r10 = r10.mo4940l()
            if (r7 <= r10) goto L_0x00dd
            goto L_0x014b
        L_0x00dd:
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4933e(r6)
            b.u.c.s r10 = r0.f691t
            int r10 = r10.mo4939k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x00f8
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4939k()
            r3.f700c = r6
            r3.f701d = r5
            goto L_0x016a
        L_0x00f8:
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4935g()
            b.u.c.s r10 = r0.f691t
            int r10 = r10.mo4930b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0112
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4935g()
            r3.f700c = r6
            r3.f701d = r9
            goto L_0x016a
        L_0x0112:
            boolean r7 = r3.f701d
            if (r7 == 0) goto L_0x0124
            b.u.c.s r7 = r0.f691t
            int r6 = r7.mo4930b(r6)
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4944m()
            int r7 = r7 + r6
            goto L_0x012a
        L_0x0124:
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4933e(r6)
        L_0x012a:
            r3.f700c = r7
            goto L_0x016a
        L_0x012d:
            int r6 = r16.mo1186y()
            if (r6 <= 0) goto L_0x014b
            android.view.View r6 = r0.mo1184x(r5)
            int r6 = r0.mo1157R(r6)
            int r7 = r0.f697z
            if (r7 >= r6) goto L_0x0141
            r6 = r9
            goto L_0x0142
        L_0x0141:
            r6 = r5
        L_0x0142:
            boolean r7 = r0.f694w
            if (r6 != r7) goto L_0x0148
            r6 = r9
            goto L_0x0149
        L_0x0148:
            r6 = r5
        L_0x0149:
            r3.f701d = r6
        L_0x014b:
            r3.mo948a()
            goto L_0x016a
        L_0x014f:
            boolean r6 = r0.f694w
            r3.f701d = r6
            if (r6 == 0) goto L_0x015f
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4935g()
            int r7 = r0.f683A
        L_0x015d:
            int r6 = r6 - r7
            goto L_0x0168
        L_0x015f:
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4939k()
            int r7 = r0.f683A
        L_0x0167:
            int r6 = r6 + r7
        L_0x0168:
            r3.f700c = r6
        L_0x016a:
            r6 = r9
            goto L_0x0171
        L_0x016c:
            r0.f697z = r4
            r0.f683A = r8
        L_0x0170:
            r6 = r5
        L_0x0171:
            if (r6 == 0) goto L_0x0175
            goto L_0x0232
        L_0x0175:
            int r6 = r16.mo1186y()
            if (r6 != 0) goto L_0x017d
            goto L_0x021e
        L_0x017d:
            android.view.View r6 = r16.mo1143I()
            if (r6 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.C0139m) r7
            boolean r10 = r7.mo1195c()
            if (r10 != 0) goto L_0x01a1
            int r10 = r7.mo1193a()
            if (r10 < 0) goto L_0x01a1
            int r7 = r7.mo1193a()
            int r10 = r18.mo1226b()
            if (r7 >= r10) goto L_0x01a1
            r7 = r9
            goto L_0x01a2
        L_0x01a1:
            r7 = r5
        L_0x01a2:
            if (r7 == 0) goto L_0x01ad
            int r7 = r0.mo1157R(r6)
            r3.mo950c(r6, r7)
            goto L_0x021c
        L_0x01ad:
            boolean r6 = r0.f692u
            boolean r7 = r0.f695x
            if (r6 == r7) goto L_0x01b5
            goto L_0x021e
        L_0x01b5:
            boolean r6 = r3.f701d
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r0.f694w
            if (r6 == 0) goto L_0x01c2
            android.view.View r6 = r16.mo925h1(r17, r18)
            goto L_0x01d4
        L_0x01c2:
            android.view.View r6 = r16.mo933l1(r17, r18)
            goto L_0x01d4
        L_0x01c7:
            boolean r6 = r0.f694w
            if (r6 == 0) goto L_0x01d0
            android.view.View r6 = r16.mo933l1(r17, r18)
            goto L_0x01d4
        L_0x01d0:
            android.view.View r6 = r16.mo925h1(r17, r18)
        L_0x01d4:
            if (r6 == 0) goto L_0x021e
            int r7 = r0.mo1157R(r6)
            r3.mo949b(r6, r7)
            boolean r7 = r2.f872g
            if (r7 != 0) goto L_0x021c
            boolean r7 = r16.mo879Y0()
            if (r7 == 0) goto L_0x021c
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4933e(r6)
            b.u.c.s r10 = r0.f691t
            int r10 = r10.mo4935g()
            if (r7 >= r10) goto L_0x0206
            b.u.c.s r7 = r0.f691t
            int r6 = r7.mo4930b(r6)
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4939k()
            if (r6 >= r7) goto L_0x0204
            goto L_0x0206
        L_0x0204:
            r6 = r5
            goto L_0x0207
        L_0x0206:
            r6 = r9
        L_0x0207:
            if (r6 == 0) goto L_0x021c
            boolean r6 = r3.f701d
            if (r6 == 0) goto L_0x0214
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4935g()
            goto L_0x021a
        L_0x0214:
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4939k()
        L_0x021a:
            r3.f700c = r6
        L_0x021c:
            r6 = r9
            goto L_0x021f
        L_0x021e:
            r6 = r5
        L_0x021f:
            if (r6 == 0) goto L_0x0222
            goto L_0x0232
        L_0x0222:
            r3.mo948a()
            boolean r6 = r0.f695x
            if (r6 == 0) goto L_0x022f
            int r6 = r18.mo1226b()
            int r6 = r6 + r4
            goto L_0x0230
        L_0x022f:
            r6 = r5
        L_0x0230:
            r3.f699b = r6
        L_0x0232:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            r3.f702e = r9
        L_0x0236:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r6 = r3.f716j
            if (r6 < 0) goto L_0x023e
            r6 = r9
            goto L_0x023f
        L_0x023e:
            r6 = r4
        L_0x023f:
            r3.f712f = r6
            int[] r3 = r0.f688F
            r3[r5] = r5
            r3[r9] = r5
            r0.mo913Z0(r2, r3)
            int[] r3 = r0.f688F
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            b.u.c.s r6 = r0.f691t
            int r6 = r6.mo4939k()
            int r6 = r6 + r3
            int[] r3 = r0.f688F
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            b.u.c.s r7 = r0.f691t
            int r7 = r7.mo4936h()
            int r7 = r7 + r3
            boolean r3 = r2.f872g
            if (r3 == 0) goto L_0x02a3
            int r3 = r0.f697z
            if (r3 == r4) goto L_0x02a3
            int r10 = r0.f683A
            if (r10 == r8) goto L_0x02a3
            android.view.View r3 = r0.mo941t(r3)
            if (r3 == 0) goto L_0x02a3
            boolean r8 = r0.f694w
            if (r8 == 0) goto L_0x028e
            b.u.c.s r8 = r0.f691t
            int r8 = r8.mo4935g()
            b.u.c.s r10 = r0.f691t
            int r3 = r10.mo4930b(r3)
            int r8 = r8 - r3
            int r3 = r0.f683A
            goto L_0x029d
        L_0x028e:
            b.u.c.s r8 = r0.f691t
            int r3 = r8.mo4933e(r3)
            b.u.c.s r8 = r0.f691t
            int r8 = r8.mo4939k()
            int r3 = r3 - r8
            int r8 = r0.f683A
        L_0x029d:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x02a2
            int r6 = r6 + r8
            goto L_0x02a3
        L_0x02a2:
            int r7 = r7 - r8
        L_0x02a3:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            boolean r8 = r3.f701d
            if (r8 == 0) goto L_0x02ae
            boolean r8 = r0.f694w
            if (r8 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02ae:
            boolean r8 = r0.f694w
            if (r8 == 0) goto L_0x02b4
        L_0x02b2:
            r8 = r4
            goto L_0x02b5
        L_0x02b4:
            r8 = r9
        L_0x02b5:
            r0.mo900w1(r1, r2, r3, r8)
            r16.mo1179q(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            boolean r8 = r16.mo947z1()
            r3.f718l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r3.f715i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            boolean r8 = r3.f701d
            if (r8 == 0) goto L_0x0319
            int r8 = r3.f699b
            int r3 = r3.f700c
            r0.mo908G1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r3.f714h = r6
            r0.mo923g1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r6 = r3.f708b
            int r8 = r3.f710d
            int r3 = r3.f709c
            if (r3 <= 0) goto L_0x02eb
            int r7 = r7 + r3
        L_0x02eb:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            int r10 = r3.f699b
            int r3 = r3.f700c
            r0.mo907F1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r3.f714h = r7
            int r7 = r3.f710d
            int r10 = r3.f711e
            int r7 = r7 + r10
            r3.f710d = r7
            r0.mo923g1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r7 = r3.f708b
            int r3 = r3.f709c
            if (r3 <= 0) goto L_0x035f
            r0.mo908G1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f690s
            r6.f714h = r3
            r0.mo923g1(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r6 = r3.f708b
            goto L_0x035f
        L_0x0319:
            int r8 = r3.f699b
            int r3 = r3.f700c
            r0.mo907F1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r3.f714h = r7
            r0.mo923g1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r7 = r3.f708b
            int r8 = r3.f710d
            int r3 = r3.f709c
            if (r3 <= 0) goto L_0x0332
            int r6 = r6 + r3
        L_0x0332:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f685C
            int r10 = r3.f699b
            int r3 = r3.f700c
            r0.mo908G1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            r3.f714h = r6
            int r6 = r3.f710d
            int r10 = r3.f711e
            int r6 = r6 + r10
            r3.f710d = r6
            r0.mo923g1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r6 = r3.f708b
            int r3 = r3.f709c
            if (r3 <= 0) goto L_0x035f
            r0.mo907F1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f690s
            r7.f714h = r3
            r0.mo923g1(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f690s
            int r7 = r3.f708b
        L_0x035f:
            int r3 = r16.mo1186y()
            if (r3 <= 0) goto L_0x0383
            boolean r3 = r0.f694w
            boolean r8 = r0.f695x
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0377
            int r3 = r0.mo938q1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo939r1(r6, r1, r2, r5)
            goto L_0x0381
        L_0x0377:
            int r3 = r0.mo939r1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo938q1(r7, r1, r2, r5)
        L_0x0381:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x0383:
            boolean r3 = r2.f876k
            if (r3 == 0) goto L_0x0419
            int r3 = r16.mo1186y()
            if (r3 == 0) goto L_0x0419
            boolean r3 = r2.f872g
            if (r3 != 0) goto L_0x0419
            boolean r3 = r16.mo879Y0()
            if (r3 != 0) goto L_0x0399
            goto L_0x0419
        L_0x0399:
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f844d
            int r8 = r3.size()
            android.view.View r10 = r0.mo1184x(r5)
            int r10 = r0.mo1157R(r10)
            r11 = r5
            r12 = r11
            r13 = r12
        L_0x03aa:
            if (r11 >= r8) goto L_0x03da
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C0156z) r14
            boolean r15 = r14.mo1243l()
            if (r15 == 0) goto L_0x03b9
            goto L_0x03d6
        L_0x03b9:
            int r15 = r14.mo1236e()
            if (r15 >= r10) goto L_0x03c1
            r15 = r9
            goto L_0x03c2
        L_0x03c1:
            r15 = r5
        L_0x03c2:
            boolean r9 = r0.f694w
            if (r15 == r9) goto L_0x03c8
            r9 = r4
            goto L_0x03c9
        L_0x03c8:
            r9 = 1
        L_0x03c9:
            b.u.c.s r15 = r0.f691t
            android.view.View r14 = r14.f888a
            int r14 = r15.mo4931c(r14)
            if (r9 != r4) goto L_0x03d5
            int r12 = r12 + r14
            goto L_0x03d6
        L_0x03d5:
            int r13 = r13 + r14
        L_0x03d6:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x03aa
        L_0x03da:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f690s
            r4.f717k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03fa
            android.view.View r4 = r16.mo942t1()
            int r4 = r0.mo1157R(r4)
            r0.mo908G1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f690s
            r4.f714h = r12
            r4.f709c = r5
            r4.mo953a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f690s
            r0.mo923g1(r1, r4, r2, r5)
        L_0x03fa:
            if (r13 <= 0) goto L_0x0415
            android.view.View r4 = r16.mo940s1()
            int r4 = r0.mo1157R(r4)
            r0.mo907F1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f690s
            r4.f714h = r13
            r4.f709c = r5
            r4.mo953a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f690s
            r0.mo923g1(r1, r4, r2, r5)
        L_0x0415:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f690s
            r1.f717k = r3
        L_0x0419:
            boolean r1 = r2.f872g
            if (r1 != 0) goto L_0x0426
            b.u.c.s r1 = r0.f691t
            int r2 = r1.mo4940l()
            r1.f5358b = r2
            goto L_0x042b
        L_0x0426:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f685C
            r1.mo951d()
        L_0x042b:
            boolean r1 = r0.f695x
            r0.f692u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo895u0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    /* renamed from: u1 */
    public boolean mo943u1() {
        return mo1147K() == 1;
    }

    /* renamed from: v0 */
    public void mo897v0(RecyclerView.C0153w wVar) {
        this.f684B = null;
        this.f697z = -1;
        this.f683A = Integer.MIN_VALUE;
        this.f685C.mo951d();
    }

    /* renamed from: v1 */
    public void mo898v1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, C0117c cVar, C0116b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c = cVar.mo955c(rVar);
        if (c == null) {
            bVar.f704b = true;
            return;
        }
        RecyclerView.C0139m mVar = (RecyclerView.C0139m) c.getLayoutParams();
        if (cVar.f717k == null) {
            if (this.f694w == (cVar.f712f == -1)) {
                mo1170c(c, -1, false);
            } else {
                mo1170c(c, 0, false);
            }
        } else {
            if (this.f694w == (cVar.f712f == -1)) {
                mo1170c(c, -1, true);
            } else {
                mo1170c(c, 0, true);
            }
        }
        RecyclerView.C0139m mVar2 = (RecyclerView.C0139m) c.getLayoutParams();
        Rect L = this.f809b.mo970L(c);
        int z = RecyclerView.C0134l.m520z(this.f823p, this.f821n, mo1154P() + mo1152O() + mVar2.leftMargin + mVar2.rightMargin + L.left + L.right + 0, mVar2.width, mo919e());
        int z2 = RecyclerView.C0134l.m520z(this.f824q, this.f822o, mo1151N() + mo1156Q() + mVar2.topMargin + mVar2.bottomMargin + L.top + L.bottom + 0, mVar2.height, mo921f());
        if (mo1160T0(c, z, z2, mVar2)) {
            c.measure(z, z2);
        }
        bVar.f703a = this.f691t.mo4931c(c);
        if (this.f689r == 1) {
            if (mo943u1()) {
                i5 = this.f823p - mo1154P();
                i4 = i5 - this.f691t.mo4932d(c);
            } else {
                i4 = mo1152O();
                i5 = this.f691t.mo4932d(c) + i4;
            }
            int i6 = cVar.f712f;
            int i7 = cVar.f708b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f703a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f703a + i7;
            }
        } else {
            int Q = mo1156Q();
            int d = this.f691t.mo4932d(c) + Q;
            int i8 = cVar.f712f;
            int i9 = cVar.f708b;
            if (i8 == -1) {
                i2 = i9;
                i3 = Q;
                i = d;
                i4 = i9 - bVar.f703a;
            } else {
                i3 = Q;
                i2 = bVar.f703a + i9;
                i = d;
                i4 = i9;
            }
        }
        mo1167a0(c, i4, i3, i2, i);
        if (mVar.mo1195c() || mVar.mo1194b()) {
            bVar.f705c = true;
        }
        bVar.f706d = c.hasFocusable();
    }

    /* renamed from: w1 */
    public void mo900w1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, C0115a aVar, int i) {
    }

    /* renamed from: x1 */
    public final void mo944x1(RecyclerView.C0145r rVar, C0117c cVar) {
        if (cVar.f707a && !cVar.f718l) {
            int i = cVar.f713g;
            int i2 = cVar.f715i;
            if (cVar.f712f == -1) {
                int y = mo1186y();
                if (i >= 0) {
                    int f = (this.f691t.mo4934f() - i) + i2;
                    if (this.f694w) {
                        for (int i3 = 0; i3 < y; i3++) {
                            View x = mo1184x(i3);
                            if (this.f691t.mo4933e(x) < f || this.f691t.mo4942o(x) < f) {
                                mo945y1(rVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = y - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View x2 = mo1184x(i5);
                        if (this.f691t.mo4933e(x2) < f || this.f691t.mo4942o(x2) < f) {
                            mo945y1(rVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int y2 = mo1186y();
                if (this.f694w) {
                    int i7 = y2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View x3 = mo1184x(i8);
                        if (this.f691t.mo4930b(x3) > i6 || this.f691t.mo4941n(x3) > i6) {
                            mo945y1(rVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < y2; i9++) {
                    View x4 = mo1184x(i9);
                    if (this.f691t.mo4930b(x4) > i6 || this.f691t.mo4941n(x4) > i6) {
                        mo945y1(rVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: y1 */
    public final void mo945y1(RecyclerView.C0145r rVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo1142H0(i3, rVar);
                }
                return;
            }
            while (i > i2) {
                mo1142H0(i, rVar);
                i--;
            }
        }
    }

    /* renamed from: z0 */
    public void mo946z0(Parcelable parcelable) {
        if (parcelable instanceof C0118d) {
            this.f684B = (C0118d) parcelable;
            mo1148K0();
        }
    }

    /* renamed from: z1 */
    public boolean mo947z1() {
        return this.f691t.mo4937i() == 0 && this.f691t.mo4934f() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0134l.C0138d S = RecyclerView.C0134l.m517S(context, attributeSet, i, i2);
        mo905C1(S.f827a);
        boolean z = S.f829c;
        mo917d((String) null);
        if (z != this.f693v) {
            this.f693v = z;
            mo1148K0();
        }
        mo864D1(S.f830d);
    }
}
