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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p009b.p086k.p098j.p099b0.C1463b;
import p009b.p121u.C1716a;
import p009b.p121u.p122c.C1746m;
import p009b.p121u.p122c.C1750n;
import p009b.p121u.p122c.C1751o;
import p009b.p121u.p122c.C1756s;
import p133c.p149b.p152b.p153a.C2108a;

public class StaggeredGridLayoutManager extends RecyclerView.C0134l implements RecyclerView.C0150v.C0152b {

    /* renamed from: A */
    public BitSet f906A;

    /* renamed from: B */
    public int f907B;

    /* renamed from: C */
    public int f908C;

    /* renamed from: D */
    public C0160d f909D;

    /* renamed from: E */
    public int f910E;

    /* renamed from: F */
    public boolean f911F;

    /* renamed from: G */
    public boolean f912G;

    /* renamed from: H */
    public C0163e f913H;

    /* renamed from: I */
    public int f914I;

    /* renamed from: J */
    public final Rect f915J;

    /* renamed from: K */
    public final C0158b f916K;

    /* renamed from: L */
    public boolean f917L;

    /* renamed from: M */
    public int[] f918M;

    /* renamed from: N */
    public final Runnable f919N;

    /* renamed from: r */
    public int f920r = -1;

    /* renamed from: s */
    public C0165f[] f921s;

    /* renamed from: t */
    public C1756s f922t;

    /* renamed from: u */
    public C1756s f923u;

    /* renamed from: v */
    public int f924v;

    /* renamed from: w */
    public int f925w;

    /* renamed from: x */
    public final C1750n f926x;

    /* renamed from: y */
    public boolean f927y;

    /* renamed from: z */
    public boolean f928z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0157a implements Runnable {
        public C0157a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo1259a1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0158b {

        /* renamed from: a */
        public int f930a;

        /* renamed from: b */
        public int f931b;

        /* renamed from: c */
        public boolean f932c;

        /* renamed from: d */
        public boolean f933d;

        /* renamed from: e */
        public boolean f934e;

        /* renamed from: f */
        public int[] f935f;

        public C0158b() {
            mo1287b();
        }

        /* renamed from: a */
        public void mo1286a() {
            this.f931b = this.f932c ? StaggeredGridLayoutManager.this.f922t.mo4935g() : StaggeredGridLayoutManager.this.f922t.mo4939k();
        }

        /* renamed from: b */
        public void mo1287b() {
            this.f930a = -1;
            this.f931b = Integer.MIN_VALUE;
            this.f932c = false;
            this.f933d = false;
            this.f934e = false;
            int[] iArr = this.f935f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0159c extends RecyclerView.C0139m {

        /* renamed from: e */
        public C0165f f937e;

        public C0159c(int i, int i2) {
            super(i, i2);
        }

        public C0159c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0159c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0159c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0160d {

        /* renamed from: a */
        public int[] f938a;

        /* renamed from: b */
        public List<C0161a> f939b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0161a implements Parcelable {
            public static final Parcelable.Creator<C0161a> CREATOR = new C0162a();

            /* renamed from: c */
            public int f940c;

            /* renamed from: d */
            public int f941d;

            /* renamed from: e */
            public int[] f942e;

            /* renamed from: f */
            public boolean f943f;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            public static class C0162a implements Parcelable.Creator<C0161a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0161a(parcel);
                }

                public Object[] newArray(int i) {
                    return new C0161a[i];
                }
            }

            public C0161a() {
            }

            public C0161a(Parcel parcel) {
                this.f940c = parcel.readInt();
                this.f941d = parcel.readInt();
                this.f943f = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f942e = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder o = C2108a.m5005o("FullSpanItem{mPosition=");
                o.append(this.f940c);
                o.append(", mGapDir=");
                o.append(this.f941d);
                o.append(", mHasUnwantedGapAfter=");
                o.append(this.f943f);
                o.append(", mGapPerSpan=");
                o.append(Arrays.toString(this.f942e));
                o.append('}');
                return o.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f940c);
                parcel.writeInt(this.f941d);
                parcel.writeInt(this.f943f ? 1 : 0);
                int[] iArr = this.f942e;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f942e);
            }
        }

        /* renamed from: a */
        public void mo1288a() {
            int[] iArr = this.f938a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f939b = null;
        }

        /* renamed from: b */
        public void mo1289b(int i) {
            int[] iArr = this.f938a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f938a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f938a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f938a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public C0161a mo1290c(int i) {
            List<C0161a> list = this.f939b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0161a aVar = this.f939b.get(size);
                if (aVar.f940c == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1291d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f938a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f939b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.mo1290c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f939b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f939b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f939b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0160d.C0161a) r3
                int r3 = r3.f940c
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f939b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0160d.C0161a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f939b
                r3.remove(r2)
                int r0 = r0.f940c
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f938a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f938a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f938a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0160d.mo1291d(int):int");
        }

        /* renamed from: e */
        public void mo1292e(int i, int i2) {
            int[] iArr = this.f938a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1289b(i3);
                int[] iArr2 = this.f938a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f938a, i, i3, -1);
                List<C0161a> list = this.f939b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0161a aVar = this.f939b.get(size);
                        int i4 = aVar.f940c;
                        if (i4 >= i) {
                            aVar.f940c = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo1293f(int i, int i2) {
            int[] iArr = this.f938a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1289b(i3);
                int[] iArr2 = this.f938a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f938a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<C0161a> list = this.f939b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0161a aVar = this.f939b.get(size);
                        int i4 = aVar.f940c;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f939b.remove(size);
                            } else {
                                aVar.f940c = i4 - i2;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0163e implements Parcelable {
        public static final Parcelable.Creator<C0163e> CREATOR = new C0164a();

        /* renamed from: c */
        public int f944c;

        /* renamed from: d */
        public int f945d;

        /* renamed from: e */
        public int f946e;

        /* renamed from: f */
        public int[] f947f;

        /* renamed from: g */
        public int f948g;

        /* renamed from: h */
        public int[] f949h;

        /* renamed from: i */
        public List<C0160d.C0161a> f950i;

        /* renamed from: j */
        public boolean f951j;

        /* renamed from: k */
        public boolean f952k;

        /* renamed from: l */
        public boolean f953l;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class C0164a implements Parcelable.Creator<C0163e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0163e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0163e[i];
            }
        }

        public C0163e() {
        }

        public C0163e(Parcel parcel) {
            this.f944c = parcel.readInt();
            this.f945d = parcel.readInt();
            int readInt = parcel.readInt();
            this.f946e = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f947f = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f948g = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f949h = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f951j = parcel.readInt() == 1;
            this.f952k = parcel.readInt() == 1;
            this.f953l = parcel.readInt() == 1 ? true : z;
            this.f950i = parcel.readArrayList(C0160d.C0161a.class.getClassLoader());
        }

        public C0163e(C0163e eVar) {
            this.f946e = eVar.f946e;
            this.f944c = eVar.f944c;
            this.f945d = eVar.f945d;
            this.f947f = eVar.f947f;
            this.f948g = eVar.f948g;
            this.f949h = eVar.f949h;
            this.f951j = eVar.f951j;
            this.f952k = eVar.f952k;
            this.f953l = eVar.f953l;
            this.f950i = eVar.f950i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f944c);
            parcel.writeInt(this.f945d);
            parcel.writeInt(this.f946e);
            if (this.f946e > 0) {
                parcel.writeIntArray(this.f947f);
            }
            parcel.writeInt(this.f948g);
            if (this.f948g > 0) {
                parcel.writeIntArray(this.f949h);
            }
            parcel.writeInt(this.f951j ? 1 : 0);
            parcel.writeInt(this.f952k ? 1 : 0);
            parcel.writeInt(this.f953l ? 1 : 0);
            parcel.writeList(this.f950i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0165f {

        /* renamed from: a */
        public ArrayList<View> f954a = new ArrayList<>();

        /* renamed from: b */
        public int f955b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f956c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f957d = 0;

        /* renamed from: e */
        public final int f958e;

        public C0165f(int i) {
            this.f958e = i;
        }

        /* renamed from: a */
        public void mo1303a(View view) {
            C0159c j = mo1312j(view);
            j.f937e = this;
            this.f954a.add(view);
            this.f956c = Integer.MIN_VALUE;
            if (this.f954a.size() == 1) {
                this.f955b = Integer.MIN_VALUE;
            }
            if (j.mo1195c() || j.mo1194b()) {
                this.f957d = StaggeredGridLayoutManager.this.f922t.mo4931c(view) + this.f957d;
            }
        }

        /* renamed from: b */
        public void mo1304b() {
            ArrayList<View> arrayList = this.f954a;
            View view = arrayList.get(arrayList.size() - 1);
            C0159c j = mo1312j(view);
            this.f956c = StaggeredGridLayoutManager.this.f922t.mo4930b(view);
            Objects.requireNonNull(j);
        }

        /* renamed from: c */
        public void mo1305c() {
            View view = this.f954a.get(0);
            C0159c j = mo1312j(view);
            this.f955b = StaggeredGridLayoutManager.this.f922t.mo4933e(view);
            Objects.requireNonNull(j);
        }

        /* renamed from: d */
        public void mo1306d() {
            this.f954a.clear();
            this.f955b = Integer.MIN_VALUE;
            this.f956c = Integer.MIN_VALUE;
            this.f957d = 0;
        }

        /* renamed from: e */
        public int mo1307e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f927y) {
                i2 = this.f954a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f954a.size();
            }
            return mo1309g(i2, i, true);
        }

        /* renamed from: f */
        public int mo1308f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f927y) {
                i2 = 0;
                i = this.f954a.size();
            } else {
                i2 = this.f954a.size() - 1;
                i = -1;
            }
            return mo1309g(i2, i, true);
        }

        /* renamed from: g */
        public int mo1309g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.f922t.mo4939k();
            int g = StaggeredGridLayoutManager.this.f922t.mo4935g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f954a.get(i);
                int e = StaggeredGridLayoutManager.this.f922t.mo4933e(view);
                int b = StaggeredGridLayoutManager.this.f922t.mo4930b(view);
                boolean z2 = false;
                boolean z3 = !z ? e < g : e <= g;
                if (!z ? b > k : b >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e < k || b > g)) {
                    return StaggeredGridLayoutManager.this.mo1157R(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: h */
        public int mo1310h(int i) {
            int i2 = this.f956c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f954a.size() == 0) {
                return i;
            }
            mo1304b();
            return this.f956c;
        }

        /* renamed from: i */
        public View mo1311i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f954a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f954a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f927y && staggeredGridLayoutManager.mo1157R(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f927y && staggeredGridLayoutManager2.mo1157R(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f954a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f954a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f927y && staggeredGridLayoutManager3.mo1157R(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f927y && staggeredGridLayoutManager4.mo1157R(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: j */
        public C0159c mo1312j(View view) {
            return (C0159c) view.getLayoutParams();
        }

        /* renamed from: k */
        public int mo1313k(int i) {
            int i2 = this.f955b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f954a.size() == 0) {
                return i;
            }
            mo1305c();
            return this.f955b;
        }

        /* renamed from: l */
        public void mo1314l() {
            int size = this.f954a.size();
            View remove = this.f954a.remove(size - 1);
            C0159c j = mo1312j(remove);
            j.f937e = null;
            if (j.mo1195c() || j.mo1194b()) {
                this.f957d -= StaggeredGridLayoutManager.this.f922t.mo4931c(remove);
            }
            if (size == 1) {
                this.f955b = Integer.MIN_VALUE;
            }
            this.f956c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public void mo1315m() {
            View remove = this.f954a.remove(0);
            C0159c j = mo1312j(remove);
            j.f937e = null;
            if (this.f954a.size() == 0) {
                this.f956c = Integer.MIN_VALUE;
            }
            if (j.mo1195c() || j.mo1194b()) {
                this.f957d -= StaggeredGridLayoutManager.this.f922t.mo4931c(remove);
            }
            this.f955b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public void mo1316n(View view) {
            C0159c j = mo1312j(view);
            j.f937e = this;
            this.f954a.add(0, view);
            this.f955b = Integer.MIN_VALUE;
            if (this.f954a.size() == 1) {
                this.f956c = Integer.MIN_VALUE;
            }
            if (j.mo1195c() || j.mo1194b()) {
                this.f957d = StaggeredGridLayoutManager.this.f922t.mo4931c(view) + this.f957d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f927y = false;
        this.f928z = false;
        this.f907B = -1;
        this.f908C = Integer.MIN_VALUE;
        this.f909D = new C0160d();
        this.f910E = 2;
        this.f915J = new Rect();
        this.f916K = new C0158b();
        this.f917L = true;
        this.f919N = new C0157a();
        RecyclerView.C0134l.C0138d S = RecyclerView.C0134l.m517S(context, attributeSet, i, i2);
        int i3 = S.f827a;
        if (i3 == 0 || i3 == 1) {
            mo917d((String) null);
            if (i3 != this.f924v) {
                this.f924v = i3;
                C1756s sVar = this.f922t;
                this.f922t = this.f923u;
                this.f923u = sVar;
                mo1148K0();
            }
            int i4 = S.f828b;
            mo917d((String) null);
            if (i4 != this.f920r) {
                this.f909D.mo1288a();
                mo1148K0();
                this.f920r = i4;
                this.f906A = new BitSet(this.f920r);
                this.f921s = new C0165f[this.f920r];
                for (int i5 = 0; i5 < this.f920r; i5++) {
                    this.f921s[i5] = new C0165f(i5);
                }
                mo1148K0();
            }
            boolean z = S.f829c;
            mo917d((String) null);
            C0163e eVar = this.f913H;
            if (!(eVar == null || eVar.f951j == z)) {
                eVar.f951j = z;
            }
            this.f927y = z;
            mo1148K0();
            this.f926x = new C1750n();
            this.f922t = C1756s.m4290a(this, this.f924v);
            this.f923u = C1756s.m4290a(this, 1 - this.f924v);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: A */
    public int mo863A(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return this.f924v == 1 ? this.f920r : super.mo863A(rVar, wVar);
    }

    /* renamed from: A0 */
    public Parcelable mo902A0() {
        int i;
        int i2;
        int[] iArr;
        C0163e eVar = this.f913H;
        if (eVar != null) {
            return new C0163e(eVar);
        }
        C0163e eVar2 = new C0163e();
        eVar2.f951j = this.f927y;
        eVar2.f952k = this.f911F;
        eVar2.f953l = this.f912G;
        C0160d dVar = this.f909D;
        if (dVar == null || (iArr = dVar.f938a) == null) {
            eVar2.f948g = 0;
        } else {
            eVar2.f949h = iArr;
            eVar2.f948g = iArr.length;
            eVar2.f950i = dVar.f939b;
        }
        int i3 = -1;
        if (mo1186y() > 0) {
            eVar2.f944c = this.f911F ? mo1269k1() : mo1268j1();
            View f1 = this.f928z ? mo1264f1(true) : mo1265g1(true);
            if (f1 != null) {
                i3 = mo1157R(f1);
            }
            eVar2.f945d = i3;
            int i4 = this.f920r;
            eVar2.f946e = i4;
            eVar2.f947f = new int[i4];
            for (int i5 = 0; i5 < this.f920r; i5++) {
                if (this.f911F) {
                    i = this.f921s[i5].mo1310h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f922t.mo4935g();
                    } else {
                        eVar2.f947f[i5] = i;
                    }
                } else {
                    i = this.f921s[i5].mo1313k(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f922t.mo4939k();
                    } else {
                        eVar2.f947f[i5] = i;
                    }
                }
                i -= i2;
                eVar2.f947f[i5] = i;
            }
        } else {
            eVar2.f944c = -1;
            eVar2.f945d = -1;
            eVar2.f946e = 0;
        }
        return eVar2;
    }

    /* renamed from: A1 */
    public final void mo1254A1(int i, int i2) {
        for (int i3 = 0; i3 < this.f920r; i3++) {
            if (!this.f921s[i3].f954a.isEmpty()) {
                mo1256C1(this.f921s[i3], i, i2);
            }
        }
    }

    /* renamed from: B0 */
    public void mo1130B0(int i) {
        if (i == 0) {
            mo1259a1();
        }
    }

    /* renamed from: B1 */
    public final void mo1255B1(int i, RecyclerView.C0153w wVar) {
        int i2;
        int i3;
        int i4;
        C1750n nVar = this.f926x;
        boolean z = false;
        nVar.f5340b = 0;
        nVar.f5341c = i;
        RecyclerView.C0150v vVar = this.f814g;
        if (!(vVar != null && vVar.f855e) || (i4 = wVar.f866a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f928z == (i4 < i)) {
                i3 = this.f922t.mo4940l();
                i2 = 0;
            } else {
                i2 = this.f922t.mo4940l();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.f809b;
        if (recyclerView != null && recyclerView.f762i) {
            this.f926x.f5344f = this.f922t.mo4939k() - i2;
            this.f926x.f5345g = this.f922t.mo4935g() + i3;
        } else {
            this.f926x.f5345g = this.f922t.mo4934f() + i3;
            this.f926x.f5344f = -i2;
        }
        C1750n nVar2 = this.f926x;
        nVar2.f5346h = false;
        nVar2.f5339a = true;
        if (this.f922t.mo4937i() == 0 && this.f922t.mo4934f() == 0) {
            z = true;
        }
        nVar2.f5347i = z;
    }

    /* renamed from: C1 */
    public final void mo1256C1(C0165f fVar, int i, int i2) {
        int i3 = fVar.f957d;
        if (i == -1) {
            int i4 = fVar.f955b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.mo1305c();
                i4 = fVar.f955b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f956c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.mo1304b();
                i5 = fVar.f956c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f906A.set(fVar.f958e, false);
    }

    /* renamed from: D1 */
    public final int mo1257D1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: L0 */
    public int mo869L0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return mo1283y1(i, rVar, wVar);
    }

    /* renamed from: M0 */
    public void mo909M0(int i) {
        C0163e eVar = this.f913H;
        if (!(eVar == null || eVar.f944c == i)) {
            eVar.f947f = null;
            eVar.f946e = 0;
            eVar.f944c = -1;
            eVar.f945d = -1;
        }
        this.f907B = i;
        this.f908C = Integer.MIN_VALUE;
        mo1148K0();
    }

    /* renamed from: N0 */
    public int mo872N0(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return mo1283y1(i, rVar, wVar);
    }

    /* renamed from: Q0 */
    public void mo876Q0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int P = mo1154P() + mo1152O();
        int N = mo1151N() + mo1156Q();
        if (this.f924v == 1) {
            i4 = RecyclerView.C0134l.m519h(i2, rect.height() + N, mo1149L());
            i3 = RecyclerView.C0134l.m519h(i, (this.f925w * this.f920r) + P, mo1150M());
        } else {
            i3 = RecyclerView.C0134l.m519h(i, rect.width() + P, mo1150M());
            i4 = RecyclerView.C0134l.m519h(i2, (this.f925w * this.f920r) + N, mo1149L());
        }
        this.f809b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: T */
    public int mo878T(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        return this.f924v == 0 ? this.f920r : super.mo878T(rVar, wVar);
    }

    /* renamed from: W */
    public boolean mo911W() {
        return this.f910E != 0;
    }

    /* renamed from: W0 */
    public void mo912W0(RecyclerView recyclerView, RecyclerView.C0153w wVar, int i) {
        C1751o oVar = new C1751o(recyclerView.getContext());
        oVar.f851a = i;
        mo1165X0(oVar);
    }

    /* renamed from: Y0 */
    public boolean mo879Y0() {
        return this.f913H == null;
    }

    /* renamed from: Z0 */
    public final int mo1258Z0(int i) {
        if (mo1186y() == 0) {
            return this.f928z ? 1 : -1;
        }
        return (i < mo1268j1()) != this.f928z ? -1 : 1;
    }

    /* renamed from: a */
    public PointF mo914a(int i) {
        int Z0 = mo1258Z0(i);
        PointF pointF = new PointF();
        if (Z0 == 0) {
            return null;
        }
        if (this.f924v == 0) {
            pointF.x = (float) Z0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) Z0;
        }
        return pointF;
    }

    /* renamed from: a1 */
    public boolean mo1259a1() {
        int i;
        if (!(mo1186y() == 0 || this.f910E == 0 || !this.f816i)) {
            if (this.f928z) {
                i = mo1269k1();
                mo1268j1();
            } else {
                i = mo1268j1();
                mo1269k1();
            }
            if (i == 0 && mo1273o1() != null) {
                this.f909D.mo1288a();
                this.f815h = true;
                mo1148K0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public void mo1169b0(int i) {
        super.mo1169b0(i);
        for (int i2 = 0; i2 < this.f920r; i2++) {
            C0165f fVar = this.f921s[i2];
            int i3 = fVar.f955b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f955b = i3 + i;
            }
            int i4 = fVar.f956c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f956c = i4 + i;
            }
        }
    }

    /* renamed from: b1 */
    public final int mo1260b1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        return C1716a.m4161g(wVar, this.f922t, mo1265g1(!this.f917L), mo1264f1(!this.f917L), this, this.f917L);
    }

    /* renamed from: c0 */
    public void mo1171c0(int i) {
        super.mo1171c0(i);
        for (int i2 = 0; i2 < this.f920r; i2++) {
            C0165f fVar = this.f921s[i2];
            int i3 = fVar.f955b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f955b = i3 + i;
            }
            int i4 = fVar.f956c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f956c = i4 + i;
            }
        }
    }

    /* renamed from: c1 */
    public final int mo1261c1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        return C1716a.m4162h(wVar, this.f922t, mo1265g1(!this.f917L), mo1264f1(!this.f917L), this, this.f917L, this.f928z);
    }

    /* renamed from: d */
    public void mo917d(String str) {
        RecyclerView recyclerView;
        if (this.f913H == null && (recyclerView = this.f809b) != null) {
            recyclerView.mo1035i(str);
        }
    }

    /* renamed from: d1 */
    public final int mo1262d1(RecyclerView.C0153w wVar) {
        if (mo1186y() == 0) {
            return 0;
        }
        return C1716a.m4163i(wVar, this.f922t, mo1265g1(!this.f917L), mo1264f1(!this.f917L), this, this.f917L);
    }

    /* renamed from: e */
    public boolean mo919e() {
        return this.f924v == 0;
    }

    /* renamed from: e1 */
    public final int mo1263e1(RecyclerView.C0145r rVar, C1750n nVar, RecyclerView.C0153w wVar) {
        int i;
        C0165f fVar;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        RecyclerView.C0145r rVar2 = rVar;
        C1750n nVar2 = nVar;
        boolean z4 = false;
        this.f906A.set(0, this.f920r, true);
        if (this.f926x.f5347i) {
            i = nVar2.f5343e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = nVar2.f5343e == 1 ? nVar2.f5345g + nVar2.f5340b : nVar2.f5344f - nVar2.f5340b;
        }
        mo1254A1(nVar2.f5343e, i);
        int g = this.f928z ? this.f922t.mo4935g() : this.f922t.mo4939k();
        boolean z5 = false;
        while (true) {
            int i14 = nVar2.f5341c;
            if (!((i14 < 0 || i14 >= wVar.mo1226b()) ? z4 : true) || (!this.f926x.f5347i && this.f906A.isEmpty())) {
                boolean z6 = z4;
            } else {
                View view = rVar2.mo1212j(nVar2.f5341c, z4, Long.MAX_VALUE).f888a;
                nVar2.f5341c += nVar2.f5342d;
                C0159c cVar = (C0159c) view.getLayoutParams();
                int a = cVar.mo1193a();
                int[] iArr = this.f909D.f938a;
                int i15 = (iArr == null || a >= iArr.length) ? -1 : iArr[a];
                if (i15 == -1 ? true : z4) {
                    if (mo1277s1(nVar2.f5343e)) {
                        i13 = this.f920r - 1;
                        i12 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.f920r;
                        i13 = z4;
                        i11 = 1;
                    }
                    C0165f fVar2 = null;
                    if (nVar2.f5343e == 1) {
                        int k = this.f922t.mo4939k();
                        int i16 = Integer.MAX_VALUE;
                        while (i13 != i12) {
                            C0165f fVar3 = this.f921s[i13];
                            int h = fVar3.mo1310h(k);
                            if (h < i16) {
                                fVar2 = fVar3;
                                i16 = h;
                            }
                            i13 += i11;
                        }
                    } else {
                        int g2 = this.f922t.mo4935g();
                        int i17 = Integer.MIN_VALUE;
                        while (i13 != i12) {
                            C0165f fVar4 = this.f921s[i13];
                            int k2 = fVar4.mo1313k(g2);
                            if (k2 > i17) {
                                fVar2 = fVar4;
                                i17 = k2;
                            }
                            i13 += i11;
                        }
                    }
                    fVar = fVar2;
                    C0160d dVar = this.f909D;
                    dVar.mo1289b(a);
                    dVar.f938a[a] = fVar.f958e;
                } else {
                    fVar = this.f921s[i15];
                }
                C0165f fVar5 = fVar;
                cVar.f937e = fVar5;
                if (nVar2.f5343e == 1) {
                    z = false;
                    mo1170c(view, -1, false);
                } else {
                    z = false;
                    mo1170c(view, 0, false);
                }
                if (this.f924v == 1) {
                    i3 = RecyclerView.C0134l.m520z(this.f925w, this.f821n, z ? 1 : 0, cVar.width, z);
                    i2 = RecyclerView.C0134l.m520z(this.f824q, this.f822o, mo1151N() + mo1156Q(), cVar.height, true);
                    z2 = false;
                } else {
                    i3 = RecyclerView.C0134l.m520z(this.f823p, this.f821n, mo1154P() + mo1152O(), cVar.width, true);
                    z2 = false;
                    i2 = RecyclerView.C0134l.m520z(this.f925w, this.f822o, 0, cVar.height, false);
                }
                mo1275q1(view, i3, i2, z2);
                if (nVar2.f5343e == 1) {
                    i5 = fVar5.mo1310h(g);
                    i4 = this.f922t.mo4931c(view) + i5;
                } else {
                    i4 = fVar5.mo1313k(g);
                    i5 = i4 - this.f922t.mo4931c(view);
                }
                int i18 = nVar2.f5343e;
                C0165f fVar6 = cVar.f937e;
                if (i18 == 1) {
                    fVar6.mo1303a(view);
                } else {
                    fVar6.mo1316n(view);
                }
                if (!mo1274p1() || this.f924v != 1) {
                    i6 = this.f923u.mo4939k() + (fVar5.f958e * this.f925w);
                    i7 = this.f923u.mo4931c(view) + i6;
                } else {
                    i7 = this.f923u.mo4935g() - (((this.f920r - 1) - fVar5.f958e) * this.f925w);
                    i6 = i7 - this.f923u.mo4931c(view);
                }
                if (this.f924v == 1) {
                    i9 = i7;
                    i8 = i4;
                    i10 = i6;
                    i6 = i5;
                } else {
                    i8 = i7;
                    i9 = i4;
                    i10 = i5;
                }
                mo1167a0(view, i10, i6, i9, i8);
                mo1256C1(fVar5, this.f926x.f5343e, i);
                mo1279u1(rVar2, this.f926x);
                if (!this.f926x.f5346h || !view.hasFocusable()) {
                    z3 = false;
                } else {
                    z3 = false;
                    this.f906A.set(fVar5.f958e, false);
                }
                z4 = z3;
                z5 = true;
            }
        }
        boolean z62 = z4;
        if (!z5) {
            mo1279u1(rVar2, this.f926x);
        }
        int k3 = this.f926x.f5343e == -1 ? this.f922t.mo4939k() - mo1271m1(this.f922t.mo4939k()) : mo1270l1(this.f922t.mo4935g()) - this.f922t.mo4935g();
        if (k3 > 0) {
            return Math.min(nVar2.f5340b, k3);
        }
        return z62 ? 1 : 0;
    }

    /* renamed from: f */
    public boolean mo921f() {
        return this.f924v == 1;
    }

    /* renamed from: f1 */
    public View mo1264f1(boolean z) {
        int k = this.f922t.mo4939k();
        int g = this.f922t.mo4935g();
        View view = null;
        for (int y = mo1186y() - 1; y >= 0; y--) {
            View x = mo1184x(y);
            int e = this.f922t.mo4933e(x);
            int b = this.f922t.mo4930b(x);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: g */
    public boolean mo881g(RecyclerView.C0139m mVar) {
        return mVar instanceof C0159c;
    }

    /* renamed from: g1 */
    public View mo1265g1(boolean z) {
        int k = this.f922t.mo4939k();
        int g = this.f922t.mo4935g();
        int y = mo1186y();
        View view = null;
        for (int i = 0; i < y; i++) {
            View x = mo1184x(i);
            int e = this.f922t.mo4933e(x);
            if (this.f922t.mo4930b(x) > k && e < g) {
                if (e >= k || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: h0 */
    public void mo924h0(RecyclerView recyclerView, RecyclerView.C0145r rVar) {
        mo1175g0();
        Runnable runnable = this.f919N;
        RecyclerView recyclerView2 = this.f809b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f920r; i++) {
            this.f921s[i].mo1306d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: h1 */
    public final void mo1266h1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, boolean z) {
        int g;
        int l1 = mo1270l1(Integer.MIN_VALUE);
        if (l1 != Integer.MIN_VALUE && (g = this.f922t.mo4935g() - l1) > 0) {
            int i = g - (-mo1283y1(-g, rVar, wVar));
            if (z && i > 0) {
                this.f922t.mo4943p(i);
            }
        }
    }

    /* renamed from: i */
    public void mo926i(int i, int i2, RecyclerView.C0153w wVar, RecyclerView.C0134l.C0137c cVar) {
        int i3;
        int i4;
        if (this.f924v != 0) {
            i = i2;
        }
        if (mo1186y() != 0 && i != 0) {
            mo1278t1(i, wVar);
            int[] iArr = this.f918M;
            if (iArr == null || iArr.length < this.f920r) {
                this.f918M = new int[this.f920r];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f920r; i6++) {
                C1750n nVar = this.f926x;
                if (nVar.f5342d == -1) {
                    i4 = nVar.f5344f;
                    i3 = this.f921s[i6].mo1313k(i4);
                } else {
                    i4 = this.f921s[i6].mo1310h(nVar.f5345g);
                    i3 = this.f926x.f5345g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f918M[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f918M, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f926x.f5341c;
                if (i9 >= 0 && i9 < wVar.mo1226b()) {
                    ((C1746m.C1748b) cVar).mo4923a(this.f926x.f5341c, this.f918M[i8]);
                    C1750n nVar2 = this.f926x;
                    nVar2.f5341c += nVar2.f5342d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f924v == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f924v == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (mo1274p1() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        if (mo1274p1() == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo882i0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0145r r11, androidx.recyclerview.widget.RecyclerView.C0153w r12) {
        /*
            r8 = this;
            int r0 = r8.mo1186y()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.mo1181s(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.mo1282x1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r10 == r2) goto L_0x004e
            r4 = 2
            if (r10 == r4) goto L_0x0042
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f924v
            if (r10 != r2) goto L_0x0040
            goto L_0x0059
        L_0x0031:
            int r10 = r8.f924v
            if (r10 != 0) goto L_0x0040
            goto L_0x0059
        L_0x0036:
            int r10 = r8.f924v
            if (r10 != r2) goto L_0x0040
            goto L_0x005b
        L_0x003b:
            int r10 = r8.f924v
            if (r10 != 0) goto L_0x0040
            goto L_0x005b
        L_0x0040:
            r10 = r0
            goto L_0x005c
        L_0x0042:
            int r10 = r8.f924v
            if (r10 != r2) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            boolean r10 = r8.mo1274p1()
            if (r10 == 0) goto L_0x0059
            goto L_0x005b
        L_0x004e:
            int r10 = r8.f924v
            if (r10 != r2) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            boolean r10 = r8.mo1274p1()
            if (r10 == 0) goto L_0x005b
        L_0x0059:
            r10 = r2
            goto L_0x005c
        L_0x005b:
            r10 = r3
        L_0x005c:
            if (r10 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0159c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f937e
            if (r10 != r2) goto L_0x0071
            int r4 = r8.mo1269k1()
            goto L_0x0075
        L_0x0071:
            int r4 = r8.mo1268j1()
        L_0x0075:
            r8.mo1255B1(r4, r12)
            r8.mo1284z1(r10)
            b.u.c.n r5 = r8.f926x
            int r6 = r5.f5342d
            int r6 = r6 + r4
            r5.f5341c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            b.u.c.s r7 = r8.f922t
            int r7 = r7.mo4940l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f5340b = r6
            b.u.c.n r5 = r8.f926x
            r5.f5346h = r2
            r6 = 0
            r5.f5339a = r6
            r8.mo1263e1(r11, r5, r12)
            boolean r11 = r8.f928z
            r8.f911F = r11
            android.view.View r11 = r0.mo1311i(r4, r10)
            if (r11 == 0) goto L_0x00a7
            if (r11 == r9) goto L_0x00a7
            return r11
        L_0x00a7:
            boolean r11 = r8.mo1277s1(r10)
            if (r11 == 0) goto L_0x00c2
            int r11 = r8.f920r
            int r11 = r11 - r2
        L_0x00b0:
            if (r11 < 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f921s
            r12 = r12[r11]
            android.view.View r12 = r12.mo1311i(r4, r10)
            if (r12 == 0) goto L_0x00bf
            if (r12 == r9) goto L_0x00bf
            return r12
        L_0x00bf:
            int r11 = r11 + -1
            goto L_0x00b0
        L_0x00c2:
            r11 = r6
        L_0x00c3:
            int r12 = r8.f920r
            if (r11 >= r12) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f921s
            r12 = r12[r11]
            android.view.View r12 = r12.mo1311i(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r11 = r8.f927y
            r11 = r11 ^ r2
            if (r10 != r3) goto L_0x00de
            r12 = r2
            goto L_0x00df
        L_0x00de:
            r12 = r6
        L_0x00df:
            if (r11 != r12) goto L_0x00e3
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            if (r11 == 0) goto L_0x00eb
            int r12 = r0.mo1307e()
            goto L_0x00ef
        L_0x00eb:
            int r12 = r0.mo1308f()
        L_0x00ef:
            android.view.View r12 = r8.mo941t(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 == r9) goto L_0x00f8
            return r12
        L_0x00f8:
            boolean r10 = r8.mo1277s1(r10)
            if (r10 == 0) goto L_0x0125
            int r10 = r8.f920r
            int r10 = r10 - r2
        L_0x0101:
            if (r10 < 0) goto L_0x0146
            int r12 = r0.f958e
            if (r10 != r12) goto L_0x0108
            goto L_0x0122
        L_0x0108:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f921s
            if (r11 == 0) goto L_0x0113
            r12 = r12[r10]
            int r12 = r12.mo1307e()
            goto L_0x0119
        L_0x0113:
            r12 = r12[r10]
            int r12 = r12.mo1308f()
        L_0x0119:
            android.view.View r12 = r8.mo941t(r12)
            if (r12 == 0) goto L_0x0122
            if (r12 == r9) goto L_0x0122
            return r12
        L_0x0122:
            int r10 = r10 + -1
            goto L_0x0101
        L_0x0125:
            int r10 = r8.f920r
            if (r6 >= r10) goto L_0x0146
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f921s
            if (r11 == 0) goto L_0x0134
            r10 = r10[r6]
            int r10 = r10.mo1307e()
            goto L_0x013a
        L_0x0134:
            r10 = r10[r6]
            int r10 = r10.mo1308f()
        L_0x013a:
            android.view.View r10 = r8.mo941t(r10)
            if (r10 == 0) goto L_0x0143
            if (r10 == r9) goto L_0x0143
            return r10
        L_0x0143:
            int r6 = r6 + 1
            goto L_0x0125
        L_0x0146:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo882i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* renamed from: i1 */
    public final void mo1267i1(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, boolean z) {
        int k;
        int m1 = mo1271m1(Integer.MAX_VALUE);
        if (m1 != Integer.MAX_VALUE && (k = m1 - this.f922t.mo4939k()) > 0) {
            int y1 = k - mo1283y1(k, rVar, wVar);
            if (z && y1 > 0) {
                this.f922t.mo4943p(-y1);
            }
        }
    }

    /* renamed from: j0 */
    public void mo929j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0145r rVar = this.f809b.f752d;
        mo1176k0(accessibilityEvent);
        if (mo1186y() > 0) {
            View g1 = mo1265g1(false);
            View f1 = mo1264f1(false);
            if (g1 != null && f1 != null) {
                int R = mo1157R(g1);
                int R2 = mo1157R(f1);
                if (R < R2) {
                    accessibilityEvent.setFromIndex(R);
                    accessibilityEvent.setToIndex(R2);
                    return;
                }
                accessibilityEvent.setFromIndex(R2);
                accessibilityEvent.setToIndex(R);
            }
        }
    }

    /* renamed from: j1 */
    public int mo1268j1() {
        if (mo1186y() == 0) {
            return 0;
        }
        return mo1157R(mo1184x(0));
    }

    /* renamed from: k */
    public int mo931k(RecyclerView.C0153w wVar) {
        return mo1260b1(wVar);
    }

    /* renamed from: k1 */
    public int mo1269k1() {
        int y = mo1186y();
        if (y == 0) {
            return 0;
        }
        return mo1157R(mo1184x(y - 1));
    }

    /* renamed from: l */
    public int mo883l(RecyclerView.C0153w wVar) {
        return mo1261c1(wVar);
    }

    /* renamed from: l1 */
    public final int mo1270l1(int i) {
        int h = this.f921s[0].mo1310h(i);
        for (int i2 = 1; i2 < this.f920r; i2++) {
            int h2 = this.f921s[i2].mo1310h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: m */
    public int mo884m(RecyclerView.C0153w wVar) {
        return mo1262d1(wVar);
    }

    /* renamed from: m0 */
    public void mo885m0(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar, View view, C1463b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0159c)) {
            mo1177l0(view, bVar);
            return;
        }
        C0159c cVar = (C0159c) layoutParams;
        if (this.f924v == 0) {
            C0165f fVar = cVar.f937e;
            i4 = fVar == null ? -1 : fVar.f958e;
            i3 = 1;
            i2 = -1;
            i = -1;
        } else {
            C0165f fVar2 = cVar.f937e;
            i2 = fVar2 == null ? -1 : fVar2.f958e;
            i = 1;
            i4 = -1;
            i3 = -1;
        }
        bVar.mo4236j(C1463b.C1466c.m3547a(i4, i3, i2, i, false, false));
    }

    /* renamed from: m1 */
    public final int mo1271m1(int i) {
        int k = this.f921s[0].mo1313k(i);
        for (int i2 = 1; i2 < this.f920r; i2++) {
            int k2 = this.f921s[i2].mo1313k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* renamed from: n */
    public int mo935n(RecyclerView.C0153w wVar) {
        return mo1260b1(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1272n1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f928z
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo1269k1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo1268j1()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f909D
            r4.mo1291d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f909D
            r9.mo1293f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f909D
            r7.mo1292e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f909D
            r9.mo1293f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f909D
            r9.mo1292e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f928z
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo1268j1()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo1269k1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo1148K0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1272n1(int, int, int):void");
    }

    /* renamed from: o */
    public int mo886o(RecyclerView.C0153w wVar) {
        return mo1261c1(wVar);
    }

    /* renamed from: o0 */
    public void mo887o0(RecyclerView recyclerView, int i, int i2) {
        mo1272n1(i, i2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1273o1() {
        /*
            r12 = this;
            int r0 = r12.mo1186y()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f920r
            r2.<init>(r3)
            int r3 = r12.f920r
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f924v
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo1274p1()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f928z
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00eb
            android.view.View r7 = r12.mo1184x(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0159c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f937e
            int r9 = r9.f958e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f937e
            boolean r10 = r12.f928z
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f956c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.mo1304b()
            int r10 = r9.f956c
        L_0x0056:
            b.u.c.s r11 = r12.f922t
            int r11 = r11.mo4935g()
            if (r10 >= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f954a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0082
        L_0x006a:
            int r10 = r9.f955b
            if (r10 == r11) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r9.mo1305c()
            int r10 = r9.f955b
        L_0x0074:
            b.u.c.s r11 = r12.f922t
            int r11 = r11.mo4939k()
            if (r10 <= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f954a
            java.lang.Object r10 = r10.get(r4)
        L_0x0082:
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.mo1312j(r10)
            java.util.Objects.requireNonNull(r9)
            r9 = r1
            goto L_0x008e
        L_0x008d:
            r9 = r4
        L_0x008e:
            if (r9 == 0) goto L_0x0091
            return r7
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f937e
            int r9 = r9.f958e
            r2.clear(r9)
        L_0x0098:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00e8
            android.view.View r9 = r12.mo1184x(r9)
            boolean r10 = r12.f928z
            if (r10 == 0) goto L_0x00b6
            b.u.c.s r10 = r12.f922t
            int r10 = r10.mo4930b(r7)
            b.u.c.s r11 = r12.f922t
            int r11 = r11.mo4930b(r9)
            if (r10 >= r11) goto L_0x00b3
            return r7
        L_0x00b3:
            if (r10 != r11) goto L_0x00c9
            goto L_0x00c7
        L_0x00b6:
            b.u.c.s r10 = r12.f922t
            int r10 = r10.mo4933e(r7)
            b.u.c.s r11 = r12.f922t
            int r11 = r11.mo4933e(r9)
            if (r10 <= r11) goto L_0x00c5
            return r7
        L_0x00c5:
            if (r10 != r11) goto L_0x00c9
        L_0x00c7:
            r10 = r1
            goto L_0x00ca
        L_0x00c9:
            r10 = r4
        L_0x00ca:
            if (r10 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0159c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f937e
            int r8 = r8.f958e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f937e
            int r9 = r9.f958e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00df
            r8 = r1
            goto L_0x00e0
        L_0x00df:
            r8 = r4
        L_0x00e0:
            if (r3 >= 0) goto L_0x00e4
            r9 = r1
            goto L_0x00e5
        L_0x00e4:
            r9 = r4
        L_0x00e5:
            if (r8 == r9) goto L_0x00e8
            return r7
        L_0x00e8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1273o1():android.view.View");
    }

    /* renamed from: p */
    public int mo888p(RecyclerView.C0153w wVar) {
        return mo1262d1(wVar);
    }

    /* renamed from: p0 */
    public void mo889p0(RecyclerView recyclerView) {
        this.f909D.mo1288a();
        mo1148K0();
    }

    /* renamed from: p1 */
    public boolean mo1274p1() {
        return mo1147K() == 1;
    }

    /* renamed from: q0 */
    public void mo891q0(RecyclerView recyclerView, int i, int i2, int i3) {
        mo1272n1(i, i2, 8);
    }

    /* renamed from: q1 */
    public final void mo1275q1(View view, int i, int i2, boolean z) {
        Rect rect = this.f915J;
        RecyclerView recyclerView = this.f809b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.mo970L(view));
        }
        C0159c cVar = (C0159c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect2 = this.f915J;
        int D1 = mo1257D1(i, i3 + rect2.left, cVar.rightMargin + rect2.right);
        int i4 = cVar.topMargin;
        Rect rect3 = this.f915J;
        int D12 = mo1257D1(i2, i4 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z ? mo1163V0(view, D1, D12, cVar) : mo1160T0(view, D1, D12, cVar)) {
            view.measure(D1, D12);
        }
    }

    /* renamed from: r0 */
    public void mo892r0(RecyclerView recyclerView, int i, int i2) {
        mo1272n1(i, i2, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f4, code lost:
        if (mo1259a1() != false) goto L_0x03f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1276r1(androidx.recyclerview.widget.RecyclerView.C0145r r12, androidx.recyclerview.widget.RecyclerView.C0153w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f916K
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f913H
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f907B
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo1226b()
            if (r1 != 0) goto L_0x0018
            r11.mo1136E0(r12)
            r0.mo1287b()
            return
        L_0x0018:
            boolean r1 = r0.f934e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f907B
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f913H
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e7
            r0.mo1287b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            if (r6 == 0) goto L_0x00b8
            int r7 = r6.f946e
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f920r
            if (r7 != r9) goto L_0x006f
            r6 = r3
        L_0x003f:
            int r7 = r11.f920r
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f921s
            r7 = r7[r6]
            r7.mo1306d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f913H
            int[] r9 = r7.f947f
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f952k
            if (r7 == 0) goto L_0x005d
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4935g()
            goto L_0x0063
        L_0x005d:
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4939k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f921s
            r7 = r7[r6]
            r7.f955b = r9
            r7.f956c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f947f = r8
            r6.f946e = r3
            r6.f948g = r3
            r6.f949h = r8
            r6.f950i = r8
            int r7 = r6.f945d
            r6.f944c = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            boolean r7 = r6.f953l
            r11.f912G = r7
            boolean r6 = r6.f951j
            r11.mo917d(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f913H
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f951j
            if (r8 == r6) goto L_0x0092
            r7.f951j = r6
        L_0x0092:
            r11.f927y = r6
            r11.mo1148K0()
            r11.mo1282x1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            int r7 = r6.f944c
            if (r7 == r2) goto L_0x00a5
            r11.f907B = r7
            boolean r7 = r6.f952k
            goto L_0x00a7
        L_0x00a5:
            boolean r7 = r11.f928z
        L_0x00a7:
            r0.f932c = r7
            int r7 = r6.f948g
            if (r7 <= r4) goto L_0x00bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.f909D
            int[] r8 = r6.f949h
            r7.f938a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f950i
            r7.f939b = r6
            goto L_0x00bf
        L_0x00b8:
            r11.mo1282x1()
            boolean r6 = r11.f928z
            r0.f932c = r6
        L_0x00bf:
            boolean r6 = r13.f872g
            if (r6 != 0) goto L_0x01a8
            int r6 = r11.f907B
            if (r6 != r2) goto L_0x00c9
            goto L_0x01a8
        L_0x00c9:
            if (r6 < 0) goto L_0x01a4
            int r7 = r13.mo1226b()
            if (r6 < r7) goto L_0x00d3
            goto L_0x01a4
        L_0x00d3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            if (r6 == 0) goto L_0x00e8
            int r7 = r6.f944c
            if (r7 == r2) goto L_0x00e8
            int r6 = r6.f946e
            if (r6 >= r4) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r0.f931b = r5
            int r6 = r11.f907B
            r0.f930a = r6
            goto L_0x01a2
        L_0x00e8:
            int r6 = r11.f907B
            android.view.View r6 = r11.mo941t(r6)
            if (r6 == 0) goto L_0x0170
            boolean r7 = r11.f928z
            if (r7 == 0) goto L_0x00f9
            int r7 = r11.mo1269k1()
            goto L_0x00fd
        L_0x00f9:
            int r7 = r11.mo1268j1()
        L_0x00fd:
            r0.f930a = r7
            int r7 = r11.f908C
            if (r7 == r5) goto L_0x0128
            boolean r7 = r0.f932c
            if (r7 == 0) goto L_0x0117
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4935g()
            int r8 = r11.f908C
            int r7 = r7 - r8
            b.u.c.s r8 = r11.f922t
            int r6 = r8.mo4930b(r6)
            goto L_0x0126
        L_0x0117:
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4939k()
            int r8 = r11.f908C
            int r7 = r7 + r8
            b.u.c.s r8 = r11.f922t
            int r6 = r8.mo4933e(r6)
        L_0x0126:
            int r7 = r7 - r6
            goto L_0x016a
        L_0x0128:
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4931c(r6)
            b.u.c.s r8 = r11.f922t
            int r8 = r8.mo4940l()
            if (r7 <= r8) goto L_0x0148
            boolean r6 = r0.f932c
            if (r6 == 0) goto L_0x0141
            b.u.c.s r6 = r11.f922t
            int r6 = r6.mo4935g()
            goto L_0x0158
        L_0x0141:
            b.u.c.s r6 = r11.f922t
            int r6 = r6.mo4939k()
            goto L_0x0158
        L_0x0148:
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4933e(r6)
            b.u.c.s r8 = r11.f922t
            int r8 = r8.mo4939k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x015b
            int r6 = -r7
        L_0x0158:
            r0.f931b = r6
            goto L_0x01a2
        L_0x015b:
            b.u.c.s r7 = r11.f922t
            int r7 = r7.mo4935g()
            b.u.c.s r8 = r11.f922t
            int r6 = r8.mo4930b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x016d
        L_0x016a:
            r0.f931b = r7
            goto L_0x01a2
        L_0x016d:
            r0.f931b = r5
            goto L_0x01a2
        L_0x0170:
            int r6 = r11.f907B
            r0.f930a = r6
            int r7 = r11.f908C
            if (r7 != r5) goto L_0x0187
            int r6 = r11.mo1258Z0(r6)
            if (r6 != r4) goto L_0x0180
            r6 = r4
            goto L_0x0181
        L_0x0180:
            r6 = r3
        L_0x0181:
            r0.f932c = r6
            r0.mo1286a()
            goto L_0x01a0
        L_0x0187:
            boolean r6 = r0.f932c
            if (r6 == 0) goto L_0x0195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            b.u.c.s r6 = r6.f922t
            int r6 = r6.mo4935g()
            int r6 = r6 - r7
            goto L_0x019e
        L_0x0195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            b.u.c.s r6 = r6.f922t
            int r6 = r6.mo4939k()
            int r6 = r6 + r7
        L_0x019e:
            r0.f931b = r6
        L_0x01a0:
            r0.f933d = r4
        L_0x01a2:
            r6 = r4
            goto L_0x01a9
        L_0x01a4:
            r11.f907B = r2
            r11.f908C = r5
        L_0x01a8:
            r6 = r3
        L_0x01a9:
            if (r6 == 0) goto L_0x01ac
            goto L_0x01e5
        L_0x01ac:
            boolean r6 = r11.f911F
            int r7 = r13.mo1226b()
            if (r6 == 0) goto L_0x01c8
            int r6 = r11.mo1186y()
        L_0x01b8:
            int r6 = r6 + r2
            if (r6 < 0) goto L_0x01e0
            android.view.View r8 = r11.mo1184x(r6)
            int r8 = r11.mo1157R(r8)
            if (r8 < 0) goto L_0x01b8
            if (r8 >= r7) goto L_0x01b8
            goto L_0x01e1
        L_0x01c8:
            int r6 = r11.mo1186y()
            r8 = r3
        L_0x01cd:
            if (r8 >= r6) goto L_0x01e0
            android.view.View r9 = r11.mo1184x(r8)
            int r9 = r11.mo1157R(r9)
            if (r9 < 0) goto L_0x01dd
            if (r9 >= r7) goto L_0x01dd
            r8 = r9
            goto L_0x01e1
        L_0x01dd:
            int r8 = r8 + 1
            goto L_0x01cd
        L_0x01e0:
            r8 = r3
        L_0x01e1:
            r0.f930a = r8
            r0.f931b = r5
        L_0x01e5:
            r0.f934e = r4
        L_0x01e7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            if (r6 != 0) goto L_0x0204
            int r6 = r11.f907B
            if (r6 != r2) goto L_0x0204
            boolean r6 = r0.f932c
            boolean r7 = r11.f911F
            if (r6 != r7) goto L_0x01fd
            boolean r6 = r11.mo1274p1()
            boolean r7 = r11.f912G
            if (r6 == r7) goto L_0x0204
        L_0x01fd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.f909D
            r6.mo1288a()
            r0.f933d = r4
        L_0x0204:
            int r6 = r11.mo1186y()
            if (r6 <= 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f913H
            if (r6 == 0) goto L_0x0212
            int r6 = r6.f946e
            if (r6 >= r4) goto L_0x02bc
        L_0x0212:
            boolean r6 = r0.f933d
            if (r6 == 0) goto L_0x0231
            r1 = r3
        L_0x0217:
            int r6 = r11.f920r
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f921s
            r6 = r6[r1]
            r6.mo1306d()
            int r6 = r0.f931b
            if (r6 == r5) goto L_0x022e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f921s
            r7 = r7[r1]
            r7.f955b = r6
            r7.f956c = r6
        L_0x022e:
            int r1 = r1 + 1
            goto L_0x0217
        L_0x0231:
            if (r1 != 0) goto L_0x0253
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f916K
            int[] r1 = r1.f935f
            if (r1 != 0) goto L_0x023a
            goto L_0x0253
        L_0x023a:
            r1 = r3
        L_0x023b:
            int r6 = r11.f920r
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f921s
            r6 = r6[r1]
            r6.mo1306d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f916K
            int[] r7 = r7.f935f
            r7 = r7[r1]
            r6.f955b = r7
            r6.f956c = r7
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0253:
            r1 = r3
        L_0x0254:
            int r6 = r11.f920r
            if (r1 >= r6) goto L_0x0294
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f921s
            r6 = r6[r1]
            boolean r7 = r11.f928z
            int r8 = r0.f931b
            if (r7 == 0) goto L_0x0267
            int r9 = r6.mo1310h(r5)
            goto L_0x026b
        L_0x0267:
            int r9 = r6.mo1313k(r5)
        L_0x026b:
            r6.mo1306d()
            if (r9 != r5) goto L_0x0271
            goto L_0x0291
        L_0x0271:
            if (r7 == 0) goto L_0x027d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            b.u.c.s r10 = r10.f922t
            int r10 = r10.mo4935g()
            if (r9 < r10) goto L_0x0291
        L_0x027d:
            if (r7 != 0) goto L_0x028a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            b.u.c.s r7 = r7.f922t
            int r7 = r7.mo4939k()
            if (r9 <= r7) goto L_0x028a
            goto L_0x0291
        L_0x028a:
            if (r8 == r5) goto L_0x028d
            int r9 = r9 + r8
        L_0x028d:
            r6.f956c = r9
            r6.f955b = r9
        L_0x0291:
            int r1 = r1 + 1
            goto L_0x0254
        L_0x0294:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f916K
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f921s
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f935f
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02ac
        L_0x02a3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f921s
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f935f = r8
        L_0x02ac:
            r8 = r3
        L_0x02ad:
            if (r8 >= r7) goto L_0x02bc
            int[] r9 = r1.f935f
            r10 = r6[r8]
            int r10 = r10.mo1313k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02ad
        L_0x02bc:
            r11.mo1179q(r12)
            b.u.c.n r1 = r11.f926x
            r1.f5339a = r3
            b.u.c.s r1 = r11.f923u
            int r1 = r1.mo4940l()
            int r6 = r11.f920r
            int r6 = r1 / r6
            r11.f925w = r6
            b.u.c.s r6 = r11.f923u
            int r6 = r6.mo4937i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r11.f914I = r1
            int r1 = r0.f930a
            r11.mo1255B1(r1, r13)
            boolean r1 = r0.f932c
            if (r1 == 0) goto L_0x02f0
            r11.mo1284z1(r2)
            b.u.c.n r1 = r11.f926x
            r11.mo1263e1(r12, r1, r13)
            r11.mo1284z1(r4)
            goto L_0x02fb
        L_0x02f0:
            r11.mo1284z1(r4)
            b.u.c.n r1 = r11.f926x
            r11.mo1263e1(r12, r1, r13)
            r11.mo1284z1(r2)
        L_0x02fb:
            b.u.c.n r1 = r11.f926x
            int r2 = r0.f930a
            int r6 = r1.f5342d
            int r2 = r2 + r6
            r1.f5341c = r2
            r11.mo1263e1(r12, r1, r13)
            b.u.c.s r1 = r11.f923u
            int r1 = r1.mo4937i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0313
            goto L_0x03b5
        L_0x0313:
            r1 = 0
            int r2 = r11.mo1186y()
            r6 = r3
        L_0x0319:
            if (r6 >= r2) goto L_0x033b
            android.view.View r7 = r11.mo1184x(r6)
            b.u.c.s r8 = r11.f923u
            int r8 = r8.mo4931c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x032b
            goto L_0x0338
        L_0x032b:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0159c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0338:
            int r6 = r6 + 1
            goto L_0x0319
        L_0x033b:
            int r6 = r11.f925w
            int r7 = r11.f920r
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            b.u.c.s r7 = r11.f923u
            int r7 = r7.mo4937i()
            if (r7 != r5) goto L_0x0357
            b.u.c.s r5 = r11.f923u
            int r5 = r5.mo4940l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0357:
            int r5 = r11.f920r
            int r5 = r1 / r5
            r11.f925w = r5
            b.u.c.s r5 = r11.f923u
            int r5 = r5.mo4937i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.f914I = r1
            int r1 = r11.f925w
            if (r1 != r6) goto L_0x036e
            goto L_0x03b5
        L_0x036e:
            r1 = r3
        L_0x036f:
            if (r1 >= r2) goto L_0x03b5
            android.view.View r5 = r11.mo1184x(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0159c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.mo1274p1()
            if (r8 == 0) goto L_0x039e
            int r8 = r11.f924v
            if (r8 != r4) goto L_0x039e
            int r8 = r11.f920r
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f937e
            int r7 = r7.f958e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f925w
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03b2
        L_0x039e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f937e
            int r7 = r7.f958e
            int r8 = r11.f925w
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f924v
            int r8 = r8 - r7
            if (r9 != r4) goto L_0x03af
            r5.offsetLeftAndRight(r8)
            goto L_0x03b2
        L_0x03af:
            r5.offsetTopAndBottom(r8)
        L_0x03b2:
            int r1 = r1 + 1
            goto L_0x036f
        L_0x03b5:
            int r1 = r11.mo1186y()
            if (r1 <= 0) goto L_0x03cc
            boolean r1 = r11.f928z
            if (r1 == 0) goto L_0x03c6
            r11.mo1266h1(r12, r13, r4)
            r11.mo1267i1(r12, r13, r3)
            goto L_0x03cc
        L_0x03c6:
            r11.mo1267i1(r12, r13, r4)
            r11.mo1266h1(r12, r13, r3)
        L_0x03cc:
            if (r14 == 0) goto L_0x03f7
            boolean r14 = r13.f872g
            if (r14 != 0) goto L_0x03f7
            int r14 = r11.f910E
            if (r14 == 0) goto L_0x03e4
            int r14 = r11.mo1186y()
            if (r14 <= 0) goto L_0x03e4
            android.view.View r14 = r11.mo1273o1()
            if (r14 == 0) goto L_0x03e4
            r14 = r4
            goto L_0x03e5
        L_0x03e4:
            r14 = r3
        L_0x03e5:
            if (r14 == 0) goto L_0x03f7
            java.lang.Runnable r14 = r11.f919N
            androidx.recyclerview.widget.RecyclerView r1 = r11.f809b
            if (r1 == 0) goto L_0x03f0
            r1.removeCallbacks(r14)
        L_0x03f0:
            boolean r14 = r11.mo1259a1()
            if (r14 == 0) goto L_0x03f7
            goto L_0x03f8
        L_0x03f7:
            r4 = r3
        L_0x03f8:
            boolean r14 = r13.f872g
            if (r14 == 0) goto L_0x0401
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f916K
            r14.mo1287b()
        L_0x0401:
            boolean r14 = r0.f932c
            r11.f911F = r14
            boolean r14 = r11.mo1274p1()
            r11.f912G = r14
            if (r4 == 0) goto L_0x0415
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f916K
            r14.mo1287b()
            r11.mo1276r1(r12, r13, r3)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1276r1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    /* renamed from: s1 */
    public final boolean mo1277s1(int i) {
        if (this.f924v == 0) {
            return (i == -1) != this.f928z;
        }
        return ((i == -1) == this.f928z) == mo1274p1();
    }

    /* renamed from: t0 */
    public void mo893t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo1272n1(i, i2, 4);
    }

    /* renamed from: t1 */
    public void mo1278t1(int i, RecyclerView.C0153w wVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo1269k1();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo1268j1();
        }
        this.f926x.f5339a = true;
        mo1255B1(i3, wVar);
        mo1284z1(i2);
        C1750n nVar = this.f926x;
        nVar.f5341c = i3 + nVar.f5342d;
        nVar.f5340b = Math.abs(i);
    }

    /* renamed from: u */
    public RecyclerView.C0139m mo894u() {
        return this.f924v == 0 ? new C0159c(-2, -1) : new C0159c(-1, -2);
    }

    /* renamed from: u0 */
    public void mo895u0(RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        mo1276r1(rVar, wVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f5343e == -1) goto L_0x0013;
     */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1279u1(androidx.recyclerview.widget.RecyclerView.C0145r r5, p009b.p121u.p122c.C1750n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f5339a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f5347i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f5340b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f5343e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f5345g
        L_0x0015:
            r4.mo1280v1(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f5344f
        L_0x001b:
            r4.mo1281w1(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f5343e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f5344f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f921s
            r1 = r1[r2]
            int r1 = r1.mo1313k(r0)
        L_0x002f:
            int r2 = r4.f920r
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f921s
            r2 = r2[r3]
            int r2 = r2.mo1313k(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f5345g
            int r6 = r6.f5340b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f5345g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f921s
            r1 = r1[r2]
            int r1 = r1.mo1310h(r0)
        L_0x005a:
            int r2 = r4.f920r
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f921s
            r2 = r2[r3]
            int r2 = r2.mo1310h(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f5345g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f5344f
            int r6 = r6.f5340b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1279u1(androidx.recyclerview.widget.RecyclerView$r, b.u.c.n):void");
    }

    /* renamed from: v */
    public RecyclerView.C0139m mo896v(Context context, AttributeSet attributeSet) {
        return new C0159c(context, attributeSet);
    }

    /* renamed from: v0 */
    public void mo897v0(RecyclerView.C0153w wVar) {
        this.f907B = -1;
        this.f908C = Integer.MIN_VALUE;
        this.f913H = null;
        this.f916K.mo1287b();
    }

    /* renamed from: v1 */
    public final void mo1280v1(RecyclerView.C0145r rVar, int i) {
        int y = mo1186y() - 1;
        while (y >= 0) {
            View x = mo1184x(y);
            if (this.f922t.mo4933e(x) >= i && this.f922t.mo4942o(x) >= i) {
                C0159c cVar = (C0159c) x.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f937e.f954a.size() != 1) {
                    cVar.f937e.mo1314l();
                    mo1140G0(x, rVar);
                    y--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public RecyclerView.C0139m mo899w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0159c((ViewGroup.MarginLayoutParams) layoutParams) : new C0159c(layoutParams);
    }

    /* renamed from: w1 */
    public final void mo1281w1(RecyclerView.C0145r rVar, int i) {
        while (mo1186y() > 0) {
            View x = mo1184x(0);
            if (this.f922t.mo4930b(x) <= i && this.f922t.mo4941n(x) <= i) {
                C0159c cVar = (C0159c) x.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f937e.f954a.size() != 1) {
                    cVar.f937e.mo1315m();
                    mo1140G0(x, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x1 */
    public final void mo1282x1() {
        this.f928z = (this.f924v == 1 || !mo1274p1()) ? this.f927y : !this.f927y;
    }

    /* renamed from: y1 */
    public int mo1283y1(int i, RecyclerView.C0145r rVar, RecyclerView.C0153w wVar) {
        if (mo1186y() == 0 || i == 0) {
            return 0;
        }
        mo1278t1(i, wVar);
        int e1 = mo1263e1(rVar, this.f926x, wVar);
        if (this.f926x.f5340b >= e1) {
            i = i < 0 ? -e1 : e1;
        }
        this.f922t.mo4943p(-i);
        this.f911F = this.f928z;
        C1750n nVar = this.f926x;
        nVar.f5340b = 0;
        mo1279u1(rVar, nVar);
        return i;
    }

    /* renamed from: z0 */
    public void mo946z0(Parcelable parcelable) {
        if (parcelable instanceof C0163e) {
            this.f913H = (C0163e) parcelable;
            mo1148K0();
        }
    }

    /* renamed from: z1 */
    public final void mo1284z1(int i) {
        C1750n nVar = this.f926x;
        nVar.f5343e = i;
        int i2 = 1;
        if (this.f928z != (i == -1)) {
            i2 = -1;
        }
        nVar.f5342d = i2;
    }
}
