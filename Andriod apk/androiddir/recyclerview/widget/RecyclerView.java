package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p086k.p094f.C1412g;
import p009b.p086k.p098j.C1486f;
import p009b.p086k.p098j.C1487g;
import p009b.p086k.p098j.C1496p;
import p009b.p086k.p098j.C1506v;
import p009b.p086k.p098j.p099b0.C1463b;
import p009b.p104m.p105a.C1527a;
import p009b.p121u.C1717b;
import p009b.p121u.p122c.C1718a;
import p009b.p121u.p122c.C1721a0;
import p009b.p121u.p122c.C1724b;
import p009b.p121u.p122c.C1727b0;
import p009b.p121u.p122c.C1730c;
import p009b.p121u.p122c.C1731d;
import p009b.p121u.p122c.C1732e;
import p009b.p121u.p122c.C1733f;
import p009b.p121u.p122c.C1738k;
import p009b.p121u.p122c.C1741l;
import p009b.p121u.p122c.C1746m;
import p009b.p121u.p122c.C1751o;
import p009b.p121u.p122c.C1759v;
import p009b.p121u.p122c.C1760w;
import p009b.p121u.p122c.C1761x;
import p009b.p121u.p122c.C1763y;
import p133c.p149b.p152b.p153a.C2108a;

public class RecyclerView extends ViewGroup implements C1486f {

    /* renamed from: x0 */
    public static final int[] f722x0 = {16843830};

    /* renamed from: y0 */
    public static final Class<?>[] f723y0;

    /* renamed from: z0 */
    public static final Interpolator f724z0 = new C0121b();

    /* renamed from: A */
    public int f725A;

    /* renamed from: B */
    public final AccessibilityManager f726B;

    /* renamed from: C */
    public boolean f727C;

    /* renamed from: D */
    public boolean f728D;

    /* renamed from: E */
    public int f729E;

    /* renamed from: F */
    public int f730F;

    /* renamed from: G */
    public C0127h f731G;

    /* renamed from: H */
    public EdgeEffect f732H;

    /* renamed from: I */
    public EdgeEffect f733I;

    /* renamed from: J */
    public EdgeEffect f734J;

    /* renamed from: K */
    public EdgeEffect f735K;

    /* renamed from: L */
    public C0128i f736L;

    /* renamed from: M */
    public int f737M;

    /* renamed from: N */
    public int f738N;

    /* renamed from: O */
    public VelocityTracker f739O;

    /* renamed from: P */
    public int f740P;

    /* renamed from: Q */
    public int f741Q;

    /* renamed from: R */
    public int f742R;

    /* renamed from: S */
    public int f743S;

    /* renamed from: T */
    public int f744T;

    /* renamed from: U */
    public C0140n f745U;

    /* renamed from: V */
    public final int f746V;

    /* renamed from: W */
    public final int f747W;

    /* renamed from: a0 */
    public float f748a0;

    /* renamed from: b0 */
    public float f749b0;

    /* renamed from: c */
    public final C0147t f750c;

    /* renamed from: c0 */
    public boolean f751c0;

    /* renamed from: d */
    public final C0145r f752d;

    /* renamed from: d0 */
    public final C0155y f753d0;

    /* renamed from: e */
    public C0148u f754e;

    /* renamed from: e0 */
    public C1746m f755e0;

    /* renamed from: f */
    public C1718a f756f;

    /* renamed from: f0 */
    public C1746m.C1748b f757f0;

    /* renamed from: g */
    public C1724b f758g;

    /* renamed from: g0 */
    public final C0153w f759g0;

    /* renamed from: h */
    public final C1727b0 f760h;

    /* renamed from: h0 */
    public C0142p f761h0;

    /* renamed from: i */
    public boolean f762i;

    /* renamed from: i0 */
    public List<C0142p> f763i0;

    /* renamed from: j */
    public final Rect f764j;

    /* renamed from: j0 */
    public boolean f765j0;

    /* renamed from: k */
    public final Rect f766k;

    /* renamed from: k0 */
    public boolean f767k0;

    /* renamed from: l */
    public final RectF f768l;

    /* renamed from: l0 */
    public C0128i.C0130b f769l0;

    /* renamed from: m */
    public C0123d f770m;

    /* renamed from: m0 */
    public boolean f771m0;

    /* renamed from: n */
    public C0134l f772n;

    /* renamed from: n0 */
    public C1761x f773n0;

    /* renamed from: o */
    public C0146s f774o;

    /* renamed from: o0 */
    public C0126g f775o0;

    /* renamed from: p */
    public final ArrayList<C0133k> f776p;

    /* renamed from: p0 */
    public final int[] f777p0;

    /* renamed from: q */
    public final ArrayList<C0141o> f778q;

    /* renamed from: q0 */
    public C1487g f779q0;

    /* renamed from: r */
    public C0141o f780r;

    /* renamed from: r0 */
    public final int[] f781r0;

    /* renamed from: s */
    public boolean f782s;

    /* renamed from: s0 */
    public final int[] f783s0;

    /* renamed from: t */
    public boolean f784t;

    /* renamed from: t0 */
    public final int[] f785t0;

    /* renamed from: u */
    public boolean f786u;

    /* renamed from: u0 */
    public final List<C0156z> f787u0;

    /* renamed from: v */
    public boolean f788v;

    /* renamed from: v0 */
    public Runnable f789v0;

    /* renamed from: w */
    public int f790w;

    /* renamed from: w0 */
    public final C1727b0.C1729b f791w0;

    /* renamed from: x */
    public boolean f792x;

    /* renamed from: y */
    public boolean f793y;

    /* renamed from: z */
    public boolean f794z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0120a implements Runnable {
        public C0120a() {
        }

        public void run() {
            C0128i iVar = RecyclerView.this.f736L;
            if (iVar != null) {
                C1738k kVar = (C1738k) iVar;
                boolean z = !kVar.f5266h.isEmpty();
                boolean z2 = !kVar.f5268j.isEmpty();
                boolean z3 = !kVar.f5269k.isEmpty();
                boolean z4 = !kVar.f5267i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<C0156z> it = kVar.f5266h.iterator();
                    while (it.hasNext()) {
                        C0156z next = it.next();
                        View view = next.f888a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f5275q.add(next);
                        animate.setDuration(kVar.f802d).alpha(0.0f).setListener(new C1733f(kVar, next, animate, view)).start();
                    }
                    kVar.f5266h.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(kVar.f5268j);
                        kVar.f5271m.add(arrayList);
                        kVar.f5268j.clear();
                        C1730c cVar = new C1730c(kVar, arrayList);
                        if (z) {
                            View view2 = ((C1738k.C1740b) arrayList.get(0)).f5283a.f888a;
                            long j = kVar.f802d;
                            AtomicInteger atomicInteger = C1496p.f4584a;
                            view2.postOnAnimationDelayed(cVar, j);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(kVar.f5269k);
                        kVar.f5272n.add(arrayList2);
                        kVar.f5269k.clear();
                        C1731d dVar = new C1731d(kVar, arrayList2);
                        if (z) {
                            View view3 = ((C1738k.C1739a) arrayList2.get(0)).f5277a.f888a;
                            long j2 = kVar.f802d;
                            AtomicInteger atomicInteger2 = C1496p.f4584a;
                            view3.postOnAnimationDelayed(dVar, j2);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(kVar.f5267i);
                        kVar.f5270l.add(arrayList3);
                        kVar.f5267i.clear();
                        C1732e eVar = new C1732e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j3 = 0;
                            long j4 = z ? kVar.f802d : 0;
                            long j5 = z2 ? kVar.f803e : 0;
                            if (z3) {
                                j3 = kVar.f804f;
                            }
                            View view4 = ((C0156z) arrayList3.get(0)).f888a;
                            AtomicInteger atomicInteger3 = C1496p.f4584a;
                            view4.postOnAnimationDelayed(eVar, Math.max(j5, j3) + j4);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.f771m0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public static class C0121b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C0122c implements C1727b0.C1729b {
        public C0122c() {
        }

        /* renamed from: a */
        public void mo1108a(C0156z zVar, C0128i.C0131c cVar, C0128i.C0131c cVar2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            zVar.mo1250s(false);
            C1763y yVar = (C1763y) recyclerView.f736L;
            Objects.requireNonNull(yVar);
            if (cVar == null || ((i = cVar.f805a) == (i2 = cVar2.f805a) && cVar.f806b == cVar2.f806b)) {
                C1738k kVar = (C1738k) yVar;
                kVar.mo4906n(zVar);
                zVar.f888a.setAlpha(0.0f);
                kVar.f5267i.add(zVar);
                z = true;
            } else {
                z = yVar.mo4901i(zVar, i, cVar.f806b, i2, cVar2.f806b);
            }
            if (z) {
                recyclerView.mo984Z();
            }
        }

        /* renamed from: b */
        public void mo1109b(C0156z zVar, C0128i.C0131c cVar, C0128i.C0131c cVar2) {
            boolean z;
            RecyclerView.this.f752d.mo1213k(zVar);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mo1007f(zVar);
            zVar.mo1250s(false);
            C1763y yVar = (C1763y) recyclerView.f736L;
            Objects.requireNonNull(yVar);
            int i = cVar.f805a;
            int i2 = cVar.f806b;
            View view = zVar.f888a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f805a;
            int top = cVar2 == null ? view.getTop() : cVar2.f806b;
            if (zVar.mo1243l() || (i == left && i2 == top)) {
                C1738k kVar = (C1738k) yVar;
                kVar.mo4906n(zVar);
                kVar.f5266h.add(zVar);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = yVar.mo4901i(zVar, i, i2, left, top);
            }
            if (z) {
                recyclerView.mo984Z();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public static abstract class C0123d<VH extends C0156z> {

        /* renamed from: a */
        public final C0124e f797a = new C0124e();

        /* renamed from: b */
        public boolean f798b = false;

        /* renamed from: a */
        public abstract int mo1110a();

        /* renamed from: b */
        public long mo1111b(int i) {
            return -1;
        }

        /* renamed from: c */
        public abstract void mo1112c(VH vh, int i);

        /* renamed from: d */
        public abstract VH mo1113d(ViewGroup viewGroup, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static class C0124e extends Observable<C0125f> {
        /* renamed from: a */
        public boolean mo1114a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo1115b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0125f) this.mObservers.get(size)).mo1116a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static abstract class C0125f {
        /* renamed from: a */
        public void mo1116a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public interface C0126g {
        /* renamed from: a */
        int mo1117a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0127h {
        /* renamed from: a */
        public EdgeEffect mo1118a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0128i {

        /* renamed from: a */
        public C0130b f799a = null;

        /* renamed from: b */
        public ArrayList<C0129a> f800b = new ArrayList<>();

        /* renamed from: c */
        public long f801c = 120;

        /* renamed from: d */
        public long f802d = 120;

        /* renamed from: e */
        public long f803e = 250;

        /* renamed from: f */
        public long f804f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$a */
        public interface C0129a {
            /* renamed from: a */
            void mo1126a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$b */
        public interface C0130b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$c */
        public static class C0131c {

            /* renamed from: a */
            public int f805a;

            /* renamed from: b */
            public int f806b;
        }

        /* renamed from: b */
        public static int m506b(C0156z zVar) {
            int i = zVar.f897j & 14;
            if (zVar.mo1241j()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = zVar.f891d;
            RecyclerView recyclerView = zVar.f905r;
            int H = recyclerView == null ? -1 : recyclerView.mo967H(zVar);
            return (i2 == -1 || H == -1 || i2 == H) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo1119a(C0156z zVar, C0156z zVar2, C0131c cVar, C0131c cVar2);

        /* renamed from: c */
        public final void mo1120c(C0156z zVar) {
            C0130b bVar = this.f799a;
            if (bVar != null) {
                C0132j jVar = (C0132j) bVar;
                Objects.requireNonNull(jVar);
                boolean z = true;
                zVar.mo1250s(true);
                if (zVar.f895h != null && zVar.f896i == null) {
                    zVar.f895h = null;
                }
                zVar.f896i = null;
                if (!((zVar.f897j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.f888a;
                    recyclerView.mo1044l0();
                    C1724b bVar2 = recyclerView.f758g;
                    int indexOfChild = ((C1759v) bVar2.f5226a).f5363a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.mo4868l(view);
                    } else if (bVar2.f5227b.mo4873d(indexOfChild)) {
                        bVar2.f5227b.mo4875f(indexOfChild);
                        bVar2.mo4868l(view);
                        ((C1759v) bVar2.f5226a).mo4952c(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C0156z K = RecyclerView.m429K(view);
                        recyclerView.f752d.mo1213k(K);
                        recyclerView.f752d.mo1210h(K);
                    }
                    recyclerView.mo1048n0(!z);
                    if (!z && zVar.mo1245n()) {
                        RecyclerView.this.removeDetachedView(zVar.f888a, false);
                    }
                }
            }
        }

        /* renamed from: d */
        public final void mo1121d() {
            int size = this.f800b.size();
            for (int i = 0; i < size; i++) {
                this.f800b.get(i).mo1126a();
            }
            this.f800b.clear();
        }

        /* renamed from: e */
        public abstract void mo1122e(C0156z zVar);

        /* renamed from: f */
        public abstract void mo1123f();

        /* renamed from: g */
        public abstract boolean mo1124g();

        /* renamed from: h */
        public C0131c mo1125h(C0156z zVar) {
            C0131c cVar = new C0131c();
            View view = zVar.f888a;
            cVar.f805a = view.getLeft();
            cVar.f806b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public class C0132j implements C0128i.C0130b {
        public C0132j() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static abstract class C0133k {
        /* renamed from: d */
        public void mo1127d(Canvas canvas, RecyclerView recyclerView, C0153w wVar) {
        }

        /* renamed from: e */
        public void mo1128e(Canvas canvas, RecyclerView recyclerView, C0153w wVar) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0134l {

        /* renamed from: a */
        public C1724b f808a;

        /* renamed from: b */
        public RecyclerView f809b;

        /* renamed from: c */
        public final C1721a0.C1723b f810c;

        /* renamed from: d */
        public final C1721a0.C1723b f811d;

        /* renamed from: e */
        public C1721a0 f812e;

        /* renamed from: f */
        public C1721a0 f813f;

        /* renamed from: g */
        public C0150v f814g;

        /* renamed from: h */
        public boolean f815h = false;

        /* renamed from: i */
        public boolean f816i = false;

        /* renamed from: j */
        public boolean f817j = true;

        /* renamed from: k */
        public boolean f818k = true;

        /* renamed from: l */
        public int f819l;

        /* renamed from: m */
        public boolean f820m;

        /* renamed from: n */
        public int f821n;

        /* renamed from: o */
        public int f822o;

        /* renamed from: p */
        public int f823p;

        /* renamed from: q */
        public int f824q;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public class C0135a implements C1721a0.C1723b {
            public C0135a() {
            }

            /* renamed from: a */
            public int mo1188a() {
                C0134l lVar = C0134l.this;
                return lVar.f823p - lVar.mo1154P();
            }

            /* renamed from: b */
            public int mo1189b(View view) {
                return C0134l.this.mo1133D(view) - ((C0139m) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public View mo1190c(int i) {
                return C0134l.this.mo1184x(i);
            }

            /* renamed from: d */
            public int mo1191d() {
                return C0134l.this.mo1152O();
            }

            /* renamed from: e */
            public int mo1192e(View view) {
                return C0134l.this.mo1139G(view) + ((C0139m) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public class C0136b implements C1721a0.C1723b {
            public C0136b() {
            }

            /* renamed from: a */
            public int mo1188a() {
                C0134l lVar = C0134l.this;
                return lVar.f824q - lVar.mo1151N();
            }

            /* renamed from: b */
            public int mo1189b(View view) {
                return C0134l.this.mo1141H(view) - ((C0139m) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public View mo1190c(int i) {
                return C0134l.this.mo1184x(i);
            }

            /* renamed from: d */
            public int mo1191d() {
                return C0134l.this.mo1156Q();
            }

            /* renamed from: e */
            public int mo1192e(View view) {
                return C0134l.this.mo1129B(view) + ((C0139m) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public interface C0137c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$d */
        public static class C0138d {

            /* renamed from: a */
            public int f827a;

            /* renamed from: b */
            public int f828b;

            /* renamed from: c */
            public boolean f829c;

            /* renamed from: d */
            public boolean f830d;
        }

        public C0134l() {
            C0135a aVar = new C0135a();
            this.f810c = aVar;
            C0136b bVar = new C0136b();
            this.f811d = bVar;
            this.f812e = new C1721a0(aVar);
            this.f813f = new C1721a0(bVar);
        }

        /* renamed from: S */
        public static C0138d m517S(Context context, AttributeSet attributeSet, int i, int i2) {
            C0138d dVar = new C0138d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1717b.f5209a, i, i2);
            dVar.f827a = obtainStyledAttributes.getInt(0, 1);
            dVar.f828b = obtainStyledAttributes.getInt(10, 1);
            dVar.f829c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f830d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: Y */
        public static boolean m518Y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: h */
        public static int m519h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m520z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0134l.m520z(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public int mo863A(C0145r rVar, C0153w wVar) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView == null || recyclerView.f770m == null || !mo919e()) {
                return 1;
            }
            return this.f809b.f770m.mo1110a();
        }

        /* renamed from: A0 */
        public Parcelable mo902A0() {
            return null;
        }

        /* renamed from: B */
        public int mo1129B(View view) {
            return view.getBottom() + ((C0139m) view.getLayoutParams()).f832b.bottom;
        }

        /* renamed from: B0 */
        public void mo1130B0(int i) {
        }

        /* renamed from: C */
        public void mo1131C(View view, Rect rect) {
            int[] iArr = RecyclerView.f722x0;
            C0139m mVar = (C0139m) view.getLayoutParams();
            Rect rect2 = mVar.f832b;
            rect.set((view.getLeft() - rect2.left) - mVar.leftMargin, (view.getTop() - rect2.top) - mVar.topMargin, view.getRight() + rect2.right + mVar.rightMargin, view.getBottom() + rect2.bottom + mVar.bottomMargin);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[ADDED_TO_REGION] */
        /* renamed from: C0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1132C0(int r11) {
            /*
                r10 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r10.f809b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                r2 = 4096(0x1000, float:5.74E-42)
                r3 = 1
                if (r11 == r2) goto L_0x003e
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r11 == r2) goto L_0x0012
                r5 = r1
                r6 = r5
                goto L_0x006c
            L_0x0012:
                r11 = -1
                boolean r0 = r0.canScrollVertically(r11)
                if (r0 == 0) goto L_0x0027
                int r0 = r10.f824q
                int r2 = r10.mo1156Q()
                int r0 = r0 - r2
                int r2 = r10.mo1151N()
                int r0 = r0 - r2
                int r0 = -r0
                goto L_0x0028
            L_0x0027:
                r0 = r1
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r2 = r10.f809b
                boolean r11 = r2.canScrollHorizontally(r11)
                if (r11 == 0) goto L_0x006a
                int r11 = r10.f823p
                int r2 = r10.mo1152O()
                int r11 = r11 - r2
                int r2 = r10.mo1154P()
                int r11 = r11 - r2
                int r11 = -r11
                goto L_0x0067
            L_0x003e:
                boolean r11 = r0.canScrollVertically(r3)
                if (r11 == 0) goto L_0x0052
                int r11 = r10.f824q
                int r0 = r10.mo1156Q()
                int r11 = r11 - r0
                int r0 = r10.mo1151N()
                int r11 = r11 - r0
                r0 = r11
                goto L_0x0053
            L_0x0052:
                r0 = r1
            L_0x0053:
                androidx.recyclerview.widget.RecyclerView r11 = r10.f809b
                boolean r11 = r11.canScrollHorizontally(r3)
                if (r11 == 0) goto L_0x006a
                int r11 = r10.f823p
                int r2 = r10.mo1152O()
                int r11 = r11 - r2
                int r2 = r10.mo1154P()
                int r11 = r11 - r2
            L_0x0067:
                r5 = r11
                r6 = r0
                goto L_0x006c
            L_0x006a:
                r6 = r0
                r5 = r1
            L_0x006c:
                if (r6 != 0) goto L_0x0071
                if (r5 != 0) goto L_0x0071
                return r1
            L_0x0071:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f809b
                r7 = 0
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 1
                r4.mo1042k0(r5, r6, r7, r8, r9)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0134l.mo1132C0(int):boolean");
        }

        /* renamed from: D */
        public int mo1133D(View view) {
            return view.getLeft() - ((C0139m) view.getLayoutParams()).f832b.left;
        }

        /* renamed from: D0 */
        public boolean mo1134D0() {
            return false;
        }

        /* renamed from: E */
        public int mo1135E(View view) {
            Rect rect = ((C0139m) view.getLayoutParams()).f832b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: E0 */
        public void mo1136E0(C0145r rVar) {
            for (int y = mo1186y() - 1; y >= 0; y--) {
                if (!RecyclerView.m429K(mo1184x(y)).mo1251t()) {
                    mo1142H0(y, rVar);
                }
            }
        }

        /* renamed from: F */
        public int mo1137F(View view) {
            Rect rect = ((C0139m) view.getLayoutParams()).f832b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: F0 */
        public void mo1138F0(C0145r rVar) {
            int size = rVar.f841a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = rVar.f841a.get(i).f888a;
                C0156z K = RecyclerView.m429K(view);
                if (!K.mo1251t()) {
                    K.mo1250s(false);
                    if (K.mo1245n()) {
                        this.f809b.removeDetachedView(view, false);
                    }
                    C0128i iVar = this.f809b.f736L;
                    if (iVar != null) {
                        iVar.mo1122e(K);
                    }
                    K.mo1250s(true);
                    C0156z K2 = RecyclerView.m429K(view);
                    K2.f901n = null;
                    K2.f902o = false;
                    K2.mo1235d();
                    rVar.mo1210h(K2);
                }
            }
            rVar.f841a.clear();
            ArrayList<C0156z> arrayList = rVar.f842b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f809b.invalidate();
            }
        }

        /* renamed from: G */
        public int mo1139G(View view) {
            return view.getRight() + ((C0139m) view.getLayoutParams()).f832b.right;
        }

        /* renamed from: G0 */
        public void mo1140G0(View view, C0145r rVar) {
            C1724b bVar = this.f808a;
            int indexOfChild = ((C1759v) bVar.f5226a).f5363a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f5227b.mo4875f(indexOfChild)) {
                    bVar.mo4868l(view);
                }
                ((C1759v) bVar.f5226a).mo4952c(indexOfChild);
            }
            rVar.mo1209g(view);
        }

        /* renamed from: H */
        public int mo1141H(View view) {
            return view.getTop() - ((C0139m) view.getLayoutParams()).f832b.top;
        }

        /* renamed from: H0 */
        public void mo1142H0(int i, C0145r rVar) {
            View x = mo1184x(i);
            mo1144I0(i);
            rVar.mo1209g(x);
        }

        /* renamed from: I */
        public View mo1143I() {
            View focusedChild;
            RecyclerView recyclerView = this.f809b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f808a.f5228c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f808a;
            r4 = r0.mo4862f(r4);
         */
        /* renamed from: I0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1144I0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.mo1184x(r4)
                if (r0 == 0) goto L_0x0029
                b.u.c.b r0 = r3.f808a
                int r4 = r0.mo4862f(r4)
                b.u.c.b$b r1 = r0.f5226a
                b.u.c.v r1 = (p009b.p121u.p122c.C1759v) r1
                android.view.View r1 = r1.mo4950a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                b.u.c.b$a r2 = r0.f5227b
                boolean r2 = r2.mo4875f(r4)
                if (r2 == 0) goto L_0x0022
                r0.mo4868l(r1)
            L_0x0022:
                b.u.c.b$b r0 = r0.f5226a
                b.u.c.v r0 = (p009b.p121u.p122c.C1759v) r0
                r0.mo4952c(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0134l.mo1144I0(int):void");
        }

        /* renamed from: J */
        public int mo1145J() {
            RecyclerView recyclerView = this.f809b;
            C0123d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo1110a();
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* renamed from: J0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1146J0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.mo1152O()
                int r4 = r18.mo1156Q()
                int r5 = r0.f823p
                int r6 = r18.mo1154P()
                int r5 = r5 - r6
                int r6 = r0.f824q
                int r7 = r18.mo1151N()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.mo1147K()
                r11 = 1
                if (r6 != r11) goto L_0x0063
                if (r5 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L_0x006b
            L_0x0063:
                if (r10 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r10 = java.lang.Math.min(r7, r5)
            L_0x006a:
                r5 = r10
            L_0x006b:
                if (r4 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r4 = java.lang.Math.min(r8, r1)
            L_0x0072:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto L_0x00ba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L_0x0083
                goto L_0x00b7
            L_0x0083:
                int r2 = r18.mo1152O()
                int r4 = r18.mo1156Q()
                int r5 = r0.f823p
                int r6 = r18.mo1154P()
                int r5 = r5 - r6
                int r6 = r0.f824q
                int r7 = r18.mo1151N()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f809b
                android.graphics.Rect r7 = r7.f764j
                r0.mo1131C(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto L_0x00b7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto L_0x00b7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto L_0x00b7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r1 = r11
                goto L_0x00b8
            L_0x00b7:
                r1 = r3
            L_0x00b8:
                if (r1 == 0) goto L_0x00bf
            L_0x00ba:
                if (r13 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                return r3
            L_0x00c0:
                if (r22 == 0) goto L_0x00c8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto L_0x00d4
            L_0x00c8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.mo1042k0(r13, r14, r15, r16, r17)
            L_0x00d4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0134l.mo1146J0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: K */
        public int mo1147K() {
            RecyclerView recyclerView = this.f809b;
            AtomicInteger atomicInteger = C1496p.f4584a;
            return recyclerView.getLayoutDirection();
        }

        /* renamed from: K0 */
        public void mo1148K0() {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: L */
        public int mo1149L() {
            RecyclerView recyclerView = this.f809b;
            AtomicInteger atomicInteger = C1496p.f4584a;
            return recyclerView.getMinimumHeight();
        }

        /* renamed from: L0 */
        public int mo869L0(int i, C0145r rVar, C0153w wVar) {
            return 0;
        }

        /* renamed from: M */
        public int mo1150M() {
            RecyclerView recyclerView = this.f809b;
            AtomicInteger atomicInteger = C1496p.f4584a;
            return recyclerView.getMinimumWidth();
        }

        /* renamed from: M0 */
        public void mo909M0(int i) {
        }

        /* renamed from: N */
        public int mo1151N() {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: N0 */
        public int mo872N0(int i, C0145r rVar, C0153w wVar) {
            return 0;
        }

        /* renamed from: O */
        public int mo1152O() {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: O0 */
        public void mo1153O0(RecyclerView recyclerView) {
            mo1155P0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: P */
        public int mo1154P() {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: P0 */
        public void mo1155P0(int i, int i2) {
            this.f823p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f821n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f722x0;
            }
            this.f824q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f822o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f722x0;
            }
        }

        /* renamed from: Q */
        public int mo1156Q() {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: Q0 */
        public void mo876Q0(Rect rect, int i, int i2) {
            int P = mo1154P() + mo1152O() + rect.width();
            int N = mo1151N() + mo1156Q() + rect.height();
            this.f809b.setMeasuredDimension(m519h(i, P, mo1150M()), m519h(i2, N, mo1149L()));
        }

        /* renamed from: R */
        public int mo1157R(View view) {
            return ((C0139m) view.getLayoutParams()).mo1193a();
        }

        /* renamed from: R0 */
        public void mo1158R0(int i, int i2) {
            int y = mo1186y();
            if (y == 0) {
                this.f809b.mo1049o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < y; i7++) {
                View x = mo1184x(i7);
                Rect rect = this.f809b.f764j;
                mo1131C(x, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f809b.f764j.set(i4, i5, i3, i6);
            mo876Q0(this.f809b.f764j, i, i2);
        }

        /* renamed from: S0 */
        public void mo1159S0(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f809b = null;
                this.f808a = null;
                i = 0;
                this.f823p = 0;
            } else {
                this.f809b = recyclerView;
                this.f808a = recyclerView.f758g;
                this.f823p = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f824q = i;
            this.f821n = 1073741824;
            this.f822o = 1073741824;
        }

        /* renamed from: T */
        public int mo878T(C0145r rVar, C0153w wVar) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView == null || recyclerView.f770m == null || !mo921f()) {
                return 1;
            }
            return this.f809b.f770m.mo1110a();
        }

        /* renamed from: T0 */
        public boolean mo1160T0(View view, int i, int i2, C0139m mVar) {
            return view.isLayoutRequested() || !this.f817j || !m518Y(view.getWidth(), i, mVar.width) || !m518Y(view.getHeight(), i2, mVar.height);
        }

        /* renamed from: U */
        public int mo1161U() {
            return 0;
        }

        /* renamed from: U0 */
        public boolean mo910U0() {
            return false;
        }

        /* renamed from: V */
        public void mo1162V(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0139m) view.getLayoutParams()).f832b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f809b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f809b.f768l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: V0 */
        public boolean mo1163V0(View view, int i, int i2, C0139m mVar) {
            return !this.f817j || !m518Y(view.getMeasuredWidth(), i, mVar.width) || !m518Y(view.getMeasuredHeight(), i2, mVar.height);
        }

        /* renamed from: W */
        public boolean mo911W() {
            return false;
        }

        /* renamed from: W0 */
        public void mo912W0(RecyclerView recyclerView, C0153w wVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: X */
        public boolean mo1164X() {
            return false;
        }

        /* renamed from: X0 */
        public void mo1165X0(C0150v vVar) {
            C0150v vVar2 = this.f814g;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.f855e)) {
                vVar2.mo1222d();
            }
            this.f814g = vVar;
            RecyclerView recyclerView = this.f809b;
            Objects.requireNonNull(vVar);
            recyclerView.f753d0.mo1230c();
            if (vVar.f858h) {
                StringBuilder o = C2108a.m5005o("An instance of ");
                o.append(vVar.getClass().getSimpleName());
                o.append(" was started more than once. Each instance of");
                o.append(vVar.getClass().getSimpleName());
                o.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", o.toString());
            }
            vVar.f852b = recyclerView;
            vVar.f853c = this;
            int i = vVar.f851a;
            if (i != -1) {
                recyclerView.f759g0.f866a = i;
                vVar.f855e = true;
                vVar.f854d = true;
                vVar.f856f = recyclerView.f772n.mo941t(i);
                vVar.f852b.f753d0.mo1228a();
                vVar.f858h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: Y0 */
        public boolean mo879Y0() {
            return false;
        }

        /* renamed from: Z */
        public boolean mo1166Z(View view, boolean z) {
            boolean z2 = this.f812e.mo4854b(view, 24579) && this.f813f.mo4854b(view, 24579);
            return z ? z2 : !z2;
        }

        /* renamed from: a0 */
        public void mo1167a0(View view, int i, int i2, int i3, int i4) {
            C0139m mVar = (C0139m) view.getLayoutParams();
            Rect rect = mVar.f832b;
            view.layout(i + rect.left + mVar.leftMargin, i2 + rect.top + mVar.topMargin, (i3 - rect.right) - mVar.rightMargin, (i4 - rect.bottom) - mVar.bottomMargin);
        }

        /* renamed from: b */
        public void mo1168b(View view) {
            mo1170c(view, -1, false);
        }

        /* renamed from: b0 */
        public void mo1169b0(int i) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                int e = recyclerView.f758g.mo4861e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f758g.mo4860d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: c */
        public final void mo1170c(View view, int i, boolean z) {
            C0156z K = RecyclerView.m429K(view);
            if (z || K.mo1243l()) {
                this.f809b.f760h.mo4879a(K);
            } else {
                this.f809b.f760h.mo4884f(K);
            }
            C0139m mVar = (C0139m) view.getLayoutParams();
            if (K.mo1253u() || K.mo1244m()) {
                if (K.mo1244m()) {
                    K.f901n.mo1213k(K);
                } else {
                    K.mo1235d();
                }
                this.f808a.mo4858b(view, i, view.getLayoutParams(), false);
            } else {
                int i2 = -1;
                if (view.getParent() == this.f809b) {
                    int j = this.f808a.mo4866j(view);
                    if (i == -1) {
                        i = this.f808a.mo4861e();
                    }
                    if (j == -1) {
                        StringBuilder o = C2108a.m5005o("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        o.append(this.f809b.indexOfChild(view));
                        throw new IllegalStateException(C2108a.m4994d(this.f809b, o));
                    } else if (j != i) {
                        C0134l lVar = this.f809b.f772n;
                        View x = lVar.mo1184x(j);
                        if (x != null) {
                            lVar.mo1184x(j);
                            lVar.mo1180r(j);
                            C0139m mVar2 = (C0139m) x.getLayoutParams();
                            C0156z K2 = RecyclerView.m429K(x);
                            if (K2.mo1243l()) {
                                lVar.f809b.f760h.mo4879a(K2);
                            } else {
                                lVar.f809b.f760h.mo4884f(K2);
                            }
                            lVar.f808a.mo4858b(x, i, mVar2, K2.mo1243l());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + lVar.f809b.toString());
                        }
                    }
                } else {
                    this.f808a.mo4857a(view, i, false);
                    mVar.f833c = true;
                    C0150v vVar = this.f814g;
                    if (vVar != null && vVar.f855e) {
                        Objects.requireNonNull(vVar.f852b);
                        C0156z K3 = RecyclerView.m429K(view);
                        if (K3 != null) {
                            i2 = K3.mo1236e();
                        }
                        if (i2 == vVar.f851a) {
                            vVar.f856f = view;
                        }
                    }
                }
            }
            if (mVar.f834d) {
                K.f888a.invalidate();
                mVar.f834d = false;
            }
        }

        /* renamed from: c0 */
        public void mo1171c0(int i) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                int e = recyclerView.f758g.mo4861e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f758g.mo4860d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: d */
        public void mo917d(String str) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null) {
                recyclerView.mo1035i(str);
            }
        }

        /* renamed from: d0 */
        public void mo1172d0() {
        }

        /* renamed from: e */
        public boolean mo919e() {
            return false;
        }

        /* renamed from: e0 */
        public boolean mo1173e0() {
            return false;
        }

        /* renamed from: f */
        public boolean mo921f() {
            return false;
        }

        /* renamed from: f0 */
        public void mo1174f0() {
        }

        /* renamed from: g */
        public boolean mo881g(C0139m mVar) {
            return mVar != null;
        }

        @Deprecated
        /* renamed from: g0 */
        public void mo1175g0() {
        }

        /* renamed from: h0 */
        public void mo924h0(RecyclerView recyclerView, C0145r rVar) {
            mo1175g0();
        }

        /* renamed from: i */
        public void mo926i(int i, int i2, C0153w wVar, C0137c cVar) {
        }

        /* renamed from: i0 */
        public View mo882i0(View view, int i, C0145r rVar, C0153w wVar) {
            return null;
        }

        /* renamed from: j */
        public void mo928j(int i, C0137c cVar) {
        }

        /* renamed from: j0 */
        public void mo929j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f809b;
            C0145r rVar = recyclerView.f752d;
            C0153w wVar = recyclerView.f759g0;
            mo1176k0(accessibilityEvent);
        }

        /* renamed from: k */
        public int mo931k(C0153w wVar) {
            return 0;
        }

        /* renamed from: k0 */
        public void mo1176k0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f809b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f809b.canScrollVertically(-1) && !this.f809b.canScrollHorizontally(-1) && !this.f809b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0123d dVar = this.f809b.f770m;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.mo1110a());
                }
            }
        }

        /* renamed from: l */
        public int mo883l(C0153w wVar) {
            return 0;
        }

        /* renamed from: l0 */
        public void mo1177l0(View view, C1463b bVar) {
            C0156z K = RecyclerView.m429K(view);
            if (K != null && !K.mo1243l() && !this.f808a.mo4867k(K.f888a)) {
                RecyclerView recyclerView = this.f809b;
                mo885m0(recyclerView.f752d, recyclerView.f759g0, view, bVar);
            }
        }

        /* renamed from: m */
        public int mo884m(C0153w wVar) {
            return 0;
        }

        /* renamed from: m0 */
        public void mo885m0(C0145r rVar, C0153w wVar, View view, C1463b bVar) {
            int i = 0;
            int R = mo921f() ? mo1157R(view) : 0;
            if (mo919e()) {
                i = mo1157R(view);
            }
            bVar.mo4236j(C1463b.C1466c.m3547a(R, 1, i, 1, false, false));
        }

        /* renamed from: n */
        public int mo935n(C0153w wVar) {
            return 0;
        }

        /* renamed from: n0 */
        public View mo1178n0() {
            return null;
        }

        /* renamed from: o */
        public int mo886o(C0153w wVar) {
            return 0;
        }

        /* renamed from: o0 */
        public void mo887o0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: p */
        public int mo888p(C0153w wVar) {
            return 0;
        }

        /* renamed from: p0 */
        public void mo889p0(RecyclerView recyclerView) {
        }

        /* renamed from: q */
        public void mo1179q(C0145r rVar) {
            int y = mo1186y();
            while (true) {
                y--;
                if (y >= 0) {
                    View x = mo1184x(y);
                    C0156z K = RecyclerView.m429K(x);
                    if (!K.mo1251t()) {
                        if (!K.mo1241j() || K.mo1243l() || this.f809b.f770m.f798b) {
                            mo1184x(y);
                            mo1180r(y);
                            rVar.mo1211i(x);
                            this.f809b.f760h.mo4884f(K);
                        } else {
                            mo1144I0(y);
                            rVar.mo1210h(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: q0 */
        public void mo891q0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: r */
        public final void mo1180r(int i) {
            this.f808a.mo4859c(i);
        }

        /* renamed from: r0 */
        public void mo892r0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: s */
        public View mo1181s(View view) {
            View C;
            RecyclerView recyclerView = this.f809b;
            if (recyclerView == null || (C = recyclerView.mo963C(view)) == null || this.f808a.f5228c.contains(C)) {
                return null;
            }
            return C;
        }

        /* renamed from: s0 */
        public void mo1182s0() {
        }

        /* renamed from: t */
        public View mo941t(int i) {
            int y = mo1186y();
            for (int i2 = 0; i2 < y; i2++) {
                View x = mo1184x(i2);
                C0156z K = RecyclerView.m429K(x);
                if (K != null && K.mo1236e() == i && !K.mo1251t() && (this.f809b.f759g0.f872g || !K.mo1243l())) {
                    return x;
                }
            }
            return null;
        }

        /* renamed from: t0 */
        public void mo893t0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo1182s0();
        }

        /* renamed from: u */
        public abstract C0139m mo894u();

        /* renamed from: u0 */
        public void mo895u0(C0145r rVar, C0153w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: v */
        public C0139m mo896v(Context context, AttributeSet attributeSet) {
            return new C0139m(context, attributeSet);
        }

        /* renamed from: v0 */
        public void mo897v0(C0153w wVar) {
        }

        /* renamed from: w */
        public C0139m mo899w(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0139m ? new C0139m((C0139m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0139m((ViewGroup.MarginLayoutParams) layoutParams) : new C0139m(layoutParams);
        }

        /* renamed from: w0 */
        public void mo1183w0(int i, int i2) {
            this.f809b.mo1049o(i, i2);
        }

        /* renamed from: x */
        public View mo1184x(int i) {
            C1724b bVar = this.f808a;
            if (bVar == null) {
                return null;
            }
            return ((C1759v) bVar.f5226a).mo4950a(bVar.mo4862f(i));
        }

        @Deprecated
        /* renamed from: x0 */
        public boolean mo1185x0(RecyclerView recyclerView) {
            C0150v vVar = this.f814g;
            if ((vVar != null && vVar.f855e) || recyclerView.mo973O()) {
                return true;
            }
            return false;
        }

        /* renamed from: y */
        public int mo1186y() {
            C1724b bVar = this.f808a;
            if (bVar != null) {
                return bVar.mo4861e();
            }
            return 0;
        }

        /* renamed from: y0 */
        public boolean mo1187y0(RecyclerView recyclerView, View view, View view2) {
            return mo1185x0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo946z0(Parcelable parcelable) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static class C0139m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0156z f831a;

        /* renamed from: b */
        public final Rect f832b = new Rect();

        /* renamed from: c */
        public boolean f833c = true;

        /* renamed from: d */
        public boolean f834d = false;

        public C0139m(int i, int i2) {
            super(i, i2);
        }

        public C0139m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0139m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0139m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0139m(C0139m mVar) {
            super(mVar);
        }

        /* renamed from: a */
        public int mo1193a() {
            return this.f831a.mo1236e();
        }

        /* renamed from: b */
        public boolean mo1194b() {
            return this.f831a.mo1246o();
        }

        /* renamed from: c */
        public boolean mo1195c() {
            return this.f831a.mo1243l();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0140n {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface C0141o {
        /* renamed from: a */
        boolean mo1196a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo1197b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo1198c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C0142p {
        /* renamed from: a */
        public void mo1199a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo1200b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C0143q {

        /* renamed from: a */
        public SparseArray<C0144a> f835a = new SparseArray<>();

        /* renamed from: b */
        public int f836b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public static class C0144a {

            /* renamed from: a */
            public final ArrayList<C0156z> f837a = new ArrayList<>();

            /* renamed from: b */
            public int f838b = 5;

            /* renamed from: c */
            public long f839c = 0;

            /* renamed from: d */
            public long f840d = 0;
        }

        /* renamed from: a */
        public final C0144a mo1201a(int i) {
            C0144a aVar = this.f835a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0144a aVar2 = new C0144a();
            this.f835a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public long mo1202b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public final class C0145r {

        /* renamed from: a */
        public final ArrayList<C0156z> f841a;

        /* renamed from: b */
        public ArrayList<C0156z> f842b = null;

        /* renamed from: c */
        public final ArrayList<C0156z> f843c = new ArrayList<>();

        /* renamed from: d */
        public final List<C0156z> f844d;

        /* renamed from: e */
        public int f845e;

        /* renamed from: f */
        public int f846f;

        /* renamed from: g */
        public C0143q f847g;

        public C0145r() {
            ArrayList<C0156z> arrayList = new ArrayList<>();
            this.f841a = arrayList;
            this.f844d = Collections.unmodifiableList(arrayList);
            this.f845e = 2;
            this.f846f = 2;
        }

        /* renamed from: a */
        public void mo1203a(C0156z zVar, boolean z) {
            RecyclerView.m434k(zVar);
            View view = zVar.f888a;
            C1761x xVar = RecyclerView.this.f773n0;
            if (xVar != null) {
                C1761x.C1762a aVar = xVar.f5366e;
                C1496p.m3610p(view, aVar instanceof C1761x.C1762a ? aVar.f5368e.remove(view) : null);
            }
            if (z) {
                C0146s sVar = RecyclerView.this.f774o;
                if (sVar != null) {
                    sVar.mo1215a(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                C0123d dVar = recyclerView.f770m;
                if (recyclerView.f759g0 != null) {
                    recyclerView.f760h.mo4885g(zVar);
                }
            }
            zVar.f905r = null;
            C0143q d = mo1206d();
            Objects.requireNonNull(d);
            int i = zVar.f893f;
            ArrayList<C0156z> arrayList = d.mo1201a(i).f837a;
            if (d.f835a.get(i).f838b > arrayList.size()) {
                zVar.mo1248q();
                arrayList.add(zVar);
            }
        }

        /* renamed from: b */
        public void mo1204b() {
            this.f841a.clear();
            mo1207e();
        }

        /* renamed from: c */
        public int mo1205c(int i) {
            if (i < 0 || i >= RecyclerView.this.f759g0.mo1226b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f759g0.mo1226b());
                throw new IndexOutOfBoundsException(C2108a.m4994d(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f759g0.f872g) {
                return i;
            }
            return recyclerView.f756f.mo4842f(i, 0);
        }

        /* renamed from: d */
        public C0143q mo1206d() {
            if (this.f847g == null) {
                this.f847g = new C0143q();
            }
            return this.f847g;
        }

        /* renamed from: e */
        public void mo1207e() {
            for (int size = this.f843c.size() - 1; size >= 0; size--) {
                mo1208f(size);
            }
            this.f843c.clear();
            int[] iArr = RecyclerView.f722x0;
            C1746m.C1748b bVar = RecyclerView.this.f757f0;
            int[] iArr2 = bVar.f5332c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f5333d = 0;
        }

        /* renamed from: f */
        public void mo1208f(int i) {
            mo1203a(this.f843c.get(i), true);
            this.f843c.remove(i);
        }

        /* renamed from: g */
        public void mo1209g(View view) {
            C0156z K = RecyclerView.m429K(view);
            if (K.mo1245n()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.mo1244m()) {
                K.f901n.mo1213k(K);
            } else if (K.mo1253u()) {
                K.mo1235d();
            }
            mo1210h(K);
            if (RecyclerView.this.f736L != null && !K.mo1242k()) {
                RecyclerView.this.f736L.mo1122e(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1210h(androidx.recyclerview.widget.RecyclerView.C0156z r7) {
            /*
                r6 = this;
                boolean r0 = r7.mo1244m()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00d6
                android.view.View r0 = r7.f888a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00d6
            L_0x0012:
                boolean r0 = r7.mo1245n()
                if (r0 != 0) goto L_0x00bd
                boolean r0 = r7.mo1251t()
                if (r0 != 0) goto L_0x00ab
                int r0 = r7.f897j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r7.f888a
                java.util.concurrent.atomic.AtomicInteger r3 = p009b.p086k.p098j.C1496p.f4584a
                boolean r0 = r0.hasTransientState()
                if (r0 == 0) goto L_0x0030
                r0 = r2
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r3 = r3.f770m
                if (r3 == 0) goto L_0x003c
                if (r0 == 0) goto L_0x003c
                java.util.Objects.requireNonNull(r3)
            L_0x003c:
                boolean r3 = r7.mo1242k()
                if (r3 == 0) goto L_0x0099
                int r3 = r6.f846f
                if (r3 <= 0) goto L_0x008f
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.mo1238g(r3)
                if (r3 != 0) goto L_0x008f
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r6.f843c
                int r3 = r3.size()
                int r4 = r6.f846f
                if (r3 < r4) goto L_0x005f
                if (r3 <= 0) goto L_0x005f
                r6.mo1208f(r1)
                int r3 = r3 + -1
            L_0x005f:
                int[] r4 = androidx.recyclerview.widget.RecyclerView.f722x0
                if (r3 <= 0) goto L_0x0088
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.m$b r4 = r4.f757f0
                int r5 = r7.f890c
                boolean r4 = r4.mo4925c(r5)
                if (r4 != 0) goto L_0x0088
            L_0x006f:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0087
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r6.f843c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r4 = (androidx.recyclerview.widget.RecyclerView.C0156z) r4
                int r4 = r4.f890c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.m$b r5 = r5.f757f0
                boolean r4 = r5.mo4925c(r4)
                if (r4 != 0) goto L_0x006f
            L_0x0087:
                int r3 = r3 + r2
            L_0x0088:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r6.f843c
                r4.add(r3, r7)
                r3 = r2
                goto L_0x0090
            L_0x008f:
                r3 = r1
            L_0x0090:
                if (r3 != 0) goto L_0x0096
                r6.mo1203a(r7, r2)
                r1 = r2
            L_0x0096:
                r2 = r1
                r1 = r3
                goto L_0x009a
            L_0x0099:
                r2 = r1
            L_0x009a:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.b0 r3 = r3.f760h
                r3.mo4885g(r7)
                if (r1 != 0) goto L_0x00aa
                if (r2 != 0) goto L_0x00aa
                if (r0 == 0) goto L_0x00aa
                r0 = 0
                r7.f905r = r0
            L_0x00aa:
                return
            L_0x00ab:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = p133c.p149b.p152b.p153a.C2108a.m5005o(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p133c.p149b.p152b.p153a.C2108a.m4994d(r1, r0)
                r7.<init>(r0)
                throw r7
            L_0x00bd:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = p133c.p149b.p152b.p153a.C2108a.m4994d(r7, r1)
                r0.<init>(r7)
                throw r0
            L_0x00d6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = p133c.p149b.p152b.p153a.C2108a.m5005o(r3)
                boolean r4 = r7.mo1244m()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.f888a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L_0x00f3
                r1 = r2
            L_0x00f3:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = p133c.p149b.p152b.p153a.C2108a.m4994d(r7, r3)
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0145r.mo1210h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1211i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.m429K(r5)
                r0 = 12
                boolean r0 = r5.mo1238g(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0055
                boolean r0 = r5.mo1246o()
                if (r0 == 0) goto L_0x0055
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.f736L
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.util.List r3 = r5.mo1237f()
                b.u.c.k r0 = (p009b.p121u.p122c.C1738k) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0039
                boolean r0 = r0.f5369g
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5.mo1241j()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = r1
                goto L_0x0034
            L_0x0033:
                r0 = r2
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r1
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r1
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0055
            L_0x0043:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f842b
                if (r0 != 0) goto L_0x004e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f842b = r0
            L_0x004e:
                r5.f901n = r4
                r5.f902o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f842b
                goto L_0x0082
            L_0x0055:
                boolean r0 = r5.mo1241j()
                if (r0 == 0) goto L_0x007c
                boolean r0 = r5.mo1243l()
                if (r0 != 0) goto L_0x007c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.f770m
                boolean r0 = r0.f798b
                if (r0 == 0) goto L_0x006a
                goto L_0x007c
            L_0x006a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = p133c.p149b.p152b.p153a.C2108a.m5005o(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p133c.p149b.p152b.p153a.C2108a.m4994d(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007c:
                r5.f901n = r4
                r5.f902o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f841a
            L_0x0082:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0145r.mo1211i(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e5, code lost:
            if (r7.f893f != 0) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0447, code lost:
            if (r7.mo1241j() == false) goto L_0x047d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x047b, code lost:
            if ((r10 == 0 || r10 + r8 < r18) == false) goto L_0x047d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x040f  */
        /* JADX WARNING: Removed duplicated region for block: B:218:0x0430  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x0433  */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x0532  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x0539  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0156z mo1212j(int r16, boolean r17, long r18) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                if (r0 < 0) goto L_0x055b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f759g0
                int r2 = r2.mo1226b()
                if (r0 >= r2) goto L_0x055b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f759g0
                boolean r2 = r2.f872g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r1.f842b
                if (r2 == 0) goto L_0x0085
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0026
                goto L_0x0085
            L_0x0026:
                r6 = r5
            L_0x0027:
                if (r6 >= r2) goto L_0x0044
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f842b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0156z) r7
                boolean r8 = r7.mo1253u()
                if (r8 != 0) goto L_0x0041
                int r8 = r7.mo1236e()
                if (r8 != r0) goto L_0x0041
                r7.mo1233b(r3)
                goto L_0x0086
            L_0x0041:
                int r6 = r6 + 1
                goto L_0x0027
            L_0x0044:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r6.f770m
                boolean r7 = r7.f798b
                if (r7 == 0) goto L_0x0085
                b.u.c.a r6 = r6.f756f
                int r6 = r6.mo4842f(r0, r5)
                if (r6 <= 0) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f770m
                int r7 = r7.mo1110a()
                if (r6 >= r7) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f770m
                long r6 = r7.mo1111b(r6)
                r8 = r5
            L_0x0067:
                if (r8 >= r2) goto L_0x0085
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f842b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0156z) r9
                boolean r10 = r9.mo1253u()
                if (r10 != 0) goto L_0x0082
                long r10 = r9.f892e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0082
                r9.mo1233b(r3)
                r7 = r9
                goto L_0x0086
            L_0x0082:
                int r8 = r8 + 1
                goto L_0x0067
            L_0x0085:
                r7 = r4
            L_0x0086:
                if (r7 == 0) goto L_0x008b
                r2 = 1
                goto L_0x008c
            L_0x008a:
                r7 = r4
            L_0x008b:
                r2 = r5
            L_0x008c:
                r6 = -1
                if (r7 != 0) goto L_0x0244
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f841a
                int r7 = r7.size()
                r8 = r5
            L_0x0096:
                if (r8 >= r7) goto L_0x00c8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f841a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0156z) r9
                boolean r10 = r9.mo1253u()
                if (r10 != 0) goto L_0x00c5
                int r10 = r9.mo1236e()
                if (r10 != r0) goto L_0x00c5
                boolean r10 = r9.mo1241j()
                if (r10 != 0) goto L_0x00c5
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r10.f759g0
                boolean r10 = r10.f872g
                if (r10 != 0) goto L_0x00c0
                boolean r10 = r9.mo1243l()
                if (r10 != 0) goto L_0x00c5
            L_0x00c0:
                r9.mo1233b(r3)
                goto L_0x01b3
            L_0x00c5:
                int r8 = r8 + 1
                goto L_0x0096
            L_0x00c8:
                if (r17 != 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.b r7 = r7.f758g
                java.util.List<android.view.View> r8 = r7.f5228c
                int r8 = r8.size()
                r9 = r5
            L_0x00d5:
                if (r9 >= r8) goto L_0x0100
                java.util.List<android.view.View> r10 = r7.f5228c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                b.u.c.b$b r11 = r7.f5226a
                b.u.c.v r11 = (p009b.p121u.p122c.C1759v) r11
                java.util.Objects.requireNonNull(r11)
                androidx.recyclerview.widget.RecyclerView$z r11 = androidx.recyclerview.widget.RecyclerView.m429K(r10)
                int r12 = r11.mo1236e()
                if (r12 != r0) goto L_0x00fd
                boolean r12 = r11.mo1241j()
                if (r12 != 0) goto L_0x00fd
                boolean r11 = r11.mo1243l()
                if (r11 != 0) goto L_0x00fd
                goto L_0x0101
            L_0x00fd:
                int r9 = r9 + 1
                goto L_0x00d5
            L_0x0100:
                r10 = r4
            L_0x0101:
                if (r10 == 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView$z r7 = androidx.recyclerview.widget.RecyclerView.m429K(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.b r8 = r8.f758g
                b.u.c.b$b r9 = r8.f5226a
                b.u.c.v r9 = (p009b.p121u.p122c.C1759v) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f5363a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0172
                b.u.c.b$a r11 = r8.f5227b
                boolean r11 = r11.mo4873d(r9)
                if (r11 == 0) goto L_0x015b
                b.u.c.b$a r11 = r8.f5227b
                r11.mo4870a(r9)
                r8.mo4868l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.b r8 = r8.f758g
                int r8 = r8.mo4866j(r10)
                if (r8 == r6) goto L_0x0142
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.b r9 = r9.f758g
                r9.mo4859c(r8)
                r15.mo1211i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.mo1233b(r8)
                goto L_0x01b9
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p133c.p149b.p152b.p153a.C2108a.m4994d(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0172:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0189:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f843c
                int r7 = r7.size()
                r8 = r5
            L_0x0190:
                if (r8 >= r7) goto L_0x01b8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f843c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0156z) r9
                boolean r10 = r9.mo1241j()
                if (r10 != 0) goto L_0x01b5
                int r10 = r9.mo1236e()
                if (r10 != r0) goto L_0x01b5
                boolean r10 = r9.mo1239h()
                if (r10 != 0) goto L_0x01b5
                if (r17 != 0) goto L_0x01b3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f843c
                r7.remove(r8)
            L_0x01b3:
                r7 = r9
                goto L_0x01b9
            L_0x01b5:
                int r8 = r8 + 1
                goto L_0x0190
            L_0x01b8:
                r7 = r4
            L_0x01b9:
                if (r7 == 0) goto L_0x0244
                boolean r8 = r7.mo1243l()
                if (r8 == 0) goto L_0x01c8
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f759g0
                boolean r8 = r8.f872g
                goto L_0x0200
            L_0x01c8:
                int r8 = r7.f890c
                if (r8 < 0) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r9 = r9.f770m
                int r9 = r9.mo1110a()
                if (r8 >= r9) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r8.f759g0
                boolean r9 = r9.f872g
                if (r9 != 0) goto L_0x01e8
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f770m
                java.util.Objects.requireNonNull(r8)
                int r8 = r7.f893f
                if (r8 == 0) goto L_0x01e8
                goto L_0x01fd
            L_0x01e8:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f770m
                boolean r9 = r8.f798b
                if (r9 == 0) goto L_0x01ff
                long r9 = r7.f892e
                int r11 = r7.f890c
                long r11 = r8.mo1111b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fd
                goto L_0x01ff
            L_0x01fd:
                r8 = r5
                goto L_0x0200
            L_0x01ff:
                r8 = 1
            L_0x0200:
                if (r8 != 0) goto L_0x0229
                if (r17 != 0) goto L_0x0227
                r8 = 4
                r7.mo1233b(r8)
                boolean r8 = r7.mo1244m()
                if (r8 == 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f888a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$r r8 = r7.f901n
                r8.mo1213k(r7)
                goto L_0x0224
            L_0x021b:
                boolean r8 = r7.mo1253u()
                if (r8 == 0) goto L_0x0224
                r7.mo1235d()
            L_0x0224:
                r15.mo1210h(r7)
            L_0x0227:
                r7 = r4
                goto L_0x0244
            L_0x0229:
                r2 = 1
                goto L_0x0244
            L_0x022b:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p133c.p149b.p152b.p153a.C2108a.m4994d(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0244:
                r8 = 2
                if (r7 != 0) goto L_0x03f2
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.a r11 = r11.f756f
                int r11 = r11.mo4842f(r0, r5)
                if (r11 < 0) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f770m
                int r12 = r12.mo1110a()
                if (r11 >= r12) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f770m
                java.util.Objects.requireNonNull(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f770m
                boolean r13 = r12.f798b
                if (r13 == 0) goto L_0x0300
                long r12 = r12.mo1111b(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f841a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0275:
                if (r7 < 0) goto L_0x02c8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r14 = r1.f841a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C0156z) r14
                long r9 = r14.f892e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02c5
                boolean r9 = r14.mo1253u()
                if (r9 != 0) goto L_0x02c5
                int r9 = r14.f893f
                if (r9 != 0) goto L_0x02a7
                r14.mo1233b(r3)
                boolean r3 = r14.mo1243l()
                if (r3 == 0) goto L_0x02a5
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f759g0
                boolean r3 = r3.f872g
                if (r3 != 0) goto L_0x02a5
                r3 = 14
                r14.mo1249r(r8, r3)
            L_0x02a5:
                r7 = r14
                goto L_0x02fb
            L_0x02a7:
                if (r17 != 0) goto L_0x02c5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f841a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r14.f888a
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r14.f888a
                androidx.recyclerview.widget.RecyclerView$z r9 = androidx.recyclerview.widget.RecyclerView.m429K(r9)
                r9.f901n = r4
                r9.f902o = r5
                r9.mo1235d()
                r15.mo1210h(r9)
            L_0x02c5:
                int r7 = r7 + -1
                goto L_0x0275
            L_0x02c8:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f843c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02cf:
                if (r3 < 0) goto L_0x02fa
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f843c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0156z) r7
                long r9 = r7.f892e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02f7
                boolean r9 = r7.mo1239h()
                if (r9 != 0) goto L_0x02f7
                int r9 = r7.f893f
                if (r9 != 0) goto L_0x02f1
                if (r17 != 0) goto L_0x02fb
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f843c
                r9.remove(r3)
                goto L_0x02fb
            L_0x02f1:
                if (r17 != 0) goto L_0x02f7
                r15.mo1208f(r3)
                goto L_0x02fa
            L_0x02f7:
                int r3 = r3 + -1
                goto L_0x02cf
            L_0x02fa:
                r7 = r4
            L_0x02fb:
                if (r7 == 0) goto L_0x0300
                r7.f890c = r11
                r2 = 1
            L_0x0300:
                if (r7 != 0) goto L_0x0340
                androidx.recyclerview.widget.RecyclerView$q r3 = r15.mo1206d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r3 = r3.f835a
                java.lang.Object r3 = r3.get(r5)
                androidx.recyclerview.widget.RecyclerView$q$a r3 = (androidx.recyclerview.widget.RecyclerView.C0143q.C0144a) r3
                if (r3 == 0) goto L_0x0337
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r3.f837a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0337
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r3.f837a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x031f:
                if (r7 < 0) goto L_0x0337
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.C0156z) r6
                boolean r6 = r6.mo1239h()
                if (r6 != 0) goto L_0x0334
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.C0156z) r3
                goto L_0x0338
            L_0x0334:
                int r7 = r7 + -1
                goto L_0x031f
            L_0x0337:
                r3 = r4
            L_0x0338:
                if (r3 == 0) goto L_0x033f
                r3.mo1248q()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.f722x0
            L_0x033f:
                r7 = r3
            L_0x0340:
                if (r7 != 0) goto L_0x03f2
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x036b
                androidx.recyclerview.widget.RecyclerView$q r3 = r1.f847g
                androidx.recyclerview.widget.RecyclerView$q$a r3 = r3.mo1201a(r5)
                long r9 = r3.f839c
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x0367
                long r9 = r9 + r6
                int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                if (r3 >= 0) goto L_0x0365
                goto L_0x0367
            L_0x0365:
                r3 = r5
                goto L_0x0368
            L_0x0367:
                r3 = 1
            L_0x0368:
                if (r3 != 0) goto L_0x036b
                return r4
            L_0x036b:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r3.f770m
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "RV CreateView"
                int r10 = p009b.p086k.p094f.C1412g.f4423a     // Catch:{ all -> 0x03ba }
                android.os.Trace.beginSection(r9)     // Catch:{ all -> 0x03ba }
                androidx.recyclerview.widget.RecyclerView$z r3 = r4.mo1113d(r3, r5)     // Catch:{ all -> 0x03ba }
                android.view.View r4 = r3.f888a     // Catch:{ all -> 0x03ba }
                android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x03ba }
                if (r4 != 0) goto L_0x03b2
                r3.f893f = r5     // Catch:{ all -> 0x03ba }
                android.os.Trace.endSection()
                int[] r4 = androidx.recyclerview.widget.RecyclerView.f722x0
                android.view.View r4 = r3.f888a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.m428F(r4)
                if (r4 == 0) goto L_0x039b
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r4)
                r3.f889b = r9
            L_0x039b:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f847g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$q$a r6 = r4.mo1201a(r5)
                long r11 = r6.f839c
                long r9 = r4.mo1202b(r11, r9)
                r6.f839c = r9
                r7 = r3
                goto L_0x03f2
            L_0x03b2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03ba }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03ba }
                throw r0     // Catch:{ all -> 0x03ba }
            L_0x03ba:
                r0 = move-exception
                int r2 = p009b.p086k.p094f.C1412g.f4423a
                android.os.Trace.endSection()
                throw r0
            L_0x03c1:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f759g0
                int r0 = r0.mo1226b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p133c.p149b.p152b.p153a.C2108a.m4994d(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03f2:
                if (r2 == 0) goto L_0x0422
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f759g0
                boolean r3 = r3.f872g
                if (r3 != 0) goto L_0x0422
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r4 = r7.mo1238g(r3)
                if (r4 == 0) goto L_0x0422
                r7.mo1249r(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f759g0
                boolean r3 = r3.f875j
                if (r3 == 0) goto L_0x0422
                androidx.recyclerview.widget.RecyclerView.C0128i.m506b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r3 = r3.f736L
                r7.mo1237f()
                androidx.recyclerview.widget.RecyclerView$i$c r3 = r3.mo1125h(r7)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.mo988c0(r7, r3)
            L_0x0422:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f759g0
                boolean r3 = r3.f872g
                if (r3 == 0) goto L_0x0433
                boolean r3 = r7.mo1240i()
                if (r3 == 0) goto L_0x0433
                r7.f894g = r0
                goto L_0x047d
            L_0x0433:
                boolean r3 = r7.mo1240i()
                if (r3 == 0) goto L_0x0449
                int r3 = r7.f897j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0440
                r3 = 1
                goto L_0x0441
            L_0x0440:
                r3 = r5
            L_0x0441:
                if (r3 != 0) goto L_0x0449
                boolean r3 = r7.mo1241j()
                if (r3 == 0) goto L_0x047d
            L_0x0449:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.a r3 = r3.f756f
                int r3 = r3.mo4842f(r0, r5)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f905r = r4
                int r6 = r7.f893f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x0481
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f847g
                androidx.recyclerview.widget.RecyclerView$q$a r4 = r4.mo1201a(r6)
                long r10 = r4.f840d
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x047a
                long r10 = r10 + r8
                int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                if (r4 >= 0) goto L_0x0478
                goto L_0x047a
            L_0x0478:
                r4 = r5
                goto L_0x047b
            L_0x047a:
                r4 = 1
            L_0x047b:
                if (r4 != 0) goto L_0x0481
            L_0x047d:
                r0 = 1
                r3 = r5
                goto L_0x052a
            L_0x0481:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r4.f770m
                java.util.Objects.requireNonNull(r4)
                r7.f890c = r3
                boolean r6 = r4.f798b
                if (r6 == 0) goto L_0x0494
                long r10 = r4.mo1111b(r3)
                r7.f892e = r10
            L_0x0494:
                r6 = 519(0x207, float:7.27E-43)
                r10 = 1
                r7.mo1249r(r10, r6)
                int r6 = p009b.p086k.p094f.C1412g.f4423a
                java.lang.String r6 = "RV OnBindView"
                android.os.Trace.beginSection(r6)
                r7.mo1237f()
                r4.mo1112c(r7, r3)
                java.util.List<java.lang.Object> r3 = r7.f898k
                if (r3 == 0) goto L_0x04ae
                r3.clear()
            L_0x04ae:
                int r3 = r7.f897j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f897j = r3
                android.view.View r3 = r7.f888a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.C0139m
                if (r4 == 0) goto L_0x04c3
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.C0139m) r3
                r4 = 1
                r3.f833c = r4
            L_0x04c3:
                android.os.Trace.endSection()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r6 = r1.f847g
                int r10 = r7.f893f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$q$a r8 = r6.mo1201a(r10)
                long r9 = r8.f840d
                long r3 = r6.mo1202b(r9, r3)
                r8.f840d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f726B
                if (r3 == 0) goto L_0x04eb
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x04eb
                r3 = 1
                goto L_0x04ec
            L_0x04eb:
                r3 = r5
            L_0x04ec:
                if (r3 == 0) goto L_0x051e
                android.view.View r3 = r7.f888a
                java.util.concurrent.atomic.AtomicInteger r4 = p009b.p086k.p098j.C1496p.f4584a
                int r4 = r3.getImportantForAccessibility()
                r6 = 1
                if (r4 != 0) goto L_0x04fc
                r3.setImportantForAccessibility(r6)
            L_0x04fc:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                b.u.c.x r4 = r4.f773n0
                if (r4 != 0) goto L_0x0503
                goto L_0x051c
            L_0x0503:
                b.u.c.x$a r4 = r4.f5366e
                boolean r8 = r4 instanceof p009b.p121u.p122c.C1761x.C1762a
                if (r8 == 0) goto L_0x0519
                java.util.Objects.requireNonNull(r4)
                b.k.j.a r8 = p009b.p086k.p098j.C1496p.m3599e(r3)
                if (r8 == 0) goto L_0x0519
                if (r8 == r4) goto L_0x0519
                java.util.Map<android.view.View, b.k.j.a> r9 = r4.f5368e
                r9.put(r3, r8)
            L_0x0519:
                p009b.p086k.p098j.C1496p.m3610p(r3, r4)
            L_0x051c:
                r3 = r6
                goto L_0x051f
            L_0x051e:
                r3 = 1
            L_0x051f:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r4 = r4.f759g0
                boolean r4 = r4.f872g
                if (r4 == 0) goto L_0x0529
                r7.f894g = r0
            L_0x0529:
                r0 = r3
            L_0x052a:
                android.view.View r4 = r7.f888a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x0539
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                goto L_0x0547
            L_0x0539:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x054f
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
            L_0x0547:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.C0139m) r4
                android.view.View r6 = r7.f888a
                r6.setLayoutParams(r4)
                goto L_0x0551
            L_0x054f:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.C0139m) r4
            L_0x0551:
                r4.f831a = r7
                if (r2 == 0) goto L_0x0558
                if (r3 == 0) goto L_0x0558
                r5 = r0
            L_0x0558:
                r4.f834d = r5
                return r7
            L_0x055b:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f759g0
                int r0 = r0.mo1226b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p133c.p149b.p152b.p153a.C2108a.m4994d(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0145r.mo1212j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        /* renamed from: k */
        public void mo1213k(C0156z zVar) {
            (zVar.f902o ? this.f842b : this.f841a).remove(zVar);
            zVar.f901n = null;
            zVar.f902o = false;
            zVar.mo1235d();
        }

        /* renamed from: l */
        public void mo1214l() {
            C0134l lVar = RecyclerView.this.f772n;
            this.f846f = this.f845e + (lVar != null ? lVar.f819l : 0);
            for (int size = this.f843c.size() - 1; size >= 0 && this.f843c.size() > this.f846f; size--) {
                mo1208f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0146s {
        /* renamed from: a */
        void mo1215a(C0156z zVar);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public class C0147t extends C0125f {
        public C0147t() {
        }

        /* renamed from: a */
        public void mo1116a() {
            RecyclerView.this.mo1035i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f759g0.f871f = true;
            recyclerView.mo987b0(true);
            if (!RecyclerView.this.f756f.mo4843g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0148u extends C1527a {
        public static final Parcelable.Creator<C0148u> CREATOR = new C0149a();

        /* renamed from: e */
        public Parcelable f850e;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class C0149a implements Parcelable.ClassLoaderCreator<C0148u> {
            public Object createFromParcel(Parcel parcel) {
                return new C0148u(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0148u[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0148u(parcel, classLoader);
            }
        }

        public C0148u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f850e = parcel.readParcelable(classLoader == null ? C0134l.class.getClassLoader() : classLoader);
        }

        public C0148u(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4660c, i);
            parcel.writeParcelable(this.f850e, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class C0150v {

        /* renamed from: a */
        public int f851a = -1;

        /* renamed from: b */
        public RecyclerView f852b;

        /* renamed from: c */
        public C0134l f853c;

        /* renamed from: d */
        public boolean f854d;

        /* renamed from: e */
        public boolean f855e;

        /* renamed from: f */
        public View f856f;

        /* renamed from: g */
        public final C0151a f857g = new C0151a(0, 0);

        /* renamed from: h */
        public boolean f858h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C0151a {

            /* renamed from: a */
            public int f859a;

            /* renamed from: b */
            public int f860b;

            /* renamed from: c */
            public int f861c;

            /* renamed from: d */
            public int f862d = -1;

            /* renamed from: e */
            public Interpolator f863e;

            /* renamed from: f */
            public boolean f864f = false;

            /* renamed from: g */
            public int f865g = 0;

            public C0151a(int i, int i2) {
                this.f859a = i;
                this.f860b = i2;
                this.f861c = Integer.MIN_VALUE;
                this.f863e = null;
            }

            /* renamed from: a */
            public void mo1223a(RecyclerView recyclerView) {
                int i = this.f862d;
                if (i >= 0) {
                    this.f862d = -1;
                    recyclerView.mo974P(i);
                    this.f864f = false;
                } else if (this.f864f) {
                    Interpolator interpolator = this.f863e;
                    if (interpolator == null || this.f861c >= 1) {
                        int i2 = this.f861c;
                        if (i2 >= 1) {
                            recyclerView.f753d0.mo1229b(this.f859a, this.f860b, i2, interpolator);
                            int i3 = this.f865g + 1;
                            this.f865g = i3;
                            if (i3 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f864f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f865g = 0;
                }
            }

            /* renamed from: b */
            public void mo1224b(int i, int i2, int i3, Interpolator interpolator) {
                this.f859a = i;
                this.f860b = i2;
                this.f861c = i3;
                this.f863e = interpolator;
                this.f864f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$b */
        public interface C0152b {
            /* renamed from: a */
            PointF mo914a(int i);
        }

        /* renamed from: a */
        public PointF mo1219a(int i) {
            C0134l lVar = this.f853c;
            if (lVar instanceof C0152b) {
                return ((C0152b) lVar).mo914a(i);
            }
            StringBuilder o = C2108a.m5005o("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            o.append(C0152b.class.getCanonicalName());
            Log.w("RecyclerView", o.toString());
            return null;
        }

        /* renamed from: b */
        public void mo1220b(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f852b;
            int i3 = -1;
            if (this.f851a == -1 || recyclerView == null) {
                mo1222d();
            }
            if (this.f854d && this.f856f == null && this.f853c != null && (a = mo1219a(this.f851a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo1033h0((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            boolean z = false;
            this.f854d = false;
            View view = this.f856f;
            if (view != null) {
                Objects.requireNonNull(this.f852b);
                C0156z K = RecyclerView.m429K(view);
                if (K != null) {
                    i3 = K.mo1236e();
                }
                if (i3 == this.f851a) {
                    mo1221c(this.f856f, recyclerView.f759g0, this.f857g);
                    this.f857g.mo1223a(recyclerView);
                    mo1222d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f856f = null;
                }
            }
            if (this.f855e) {
                C0153w wVar = recyclerView.f759g0;
                C0151a aVar = this.f857g;
                C1751o oVar = (C1751o) this;
                if (oVar.f852b.f772n.mo1186y() == 0) {
                    oVar.mo1222d();
                } else {
                    int i4 = oVar.f5354o;
                    int i5 = i4 - i;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    oVar.f5354o = i5;
                    int i6 = oVar.f5355p;
                    int i7 = i6 - i2;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    oVar.f5355p = i7;
                    if (i5 == 0 && i7 == 0) {
                        PointF a2 = oVar.mo1219a(oVar.f851a);
                        if (a2 != null) {
                            float f2 = a2.x;
                            if (!(f2 == 0.0f && a2.y == 0.0f)) {
                                float f3 = a2.y;
                                float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                                float f4 = a2.x / sqrt;
                                a2.x = f4;
                                float f5 = a2.y / sqrt;
                                a2.y = f5;
                                oVar.f5350k = a2;
                                oVar.f5354o = (int) (f4 * 10000.0f);
                                oVar.f5355p = (int) (f5 * 10000.0f);
                                aVar.mo1224b((int) (((float) oVar.f5354o) * 1.2f), (int) (((float) oVar.f5355p) * 1.2f), (int) (((float) oVar.mo4929g(ModuleDescriptor.MODULE_VERSION)) * 1.2f), oVar.f5348i);
                            }
                        }
                        aVar.f862d = oVar.f851a;
                        oVar.mo1222d();
                    }
                }
                C0151a aVar2 = this.f857g;
                if (aVar2.f862d >= 0) {
                    z = true;
                }
                aVar2.mo1223a(recyclerView);
                if (z && this.f855e) {
                    this.f854d = true;
                    recyclerView.f753d0.mo1228a();
                }
            }
        }

        /* renamed from: c */
        public abstract void mo1221c(View view, C0153w wVar, C0151a aVar);

        /* renamed from: d */
        public final void mo1222d() {
            if (this.f855e) {
                this.f855e = false;
                C1751o oVar = (C1751o) this;
                oVar.f5355p = 0;
                oVar.f5354o = 0;
                oVar.f5350k = null;
                this.f852b.f759g0.f866a = -1;
                this.f856f = null;
                this.f851a = -1;
                this.f854d = false;
                C0134l lVar = this.f853c;
                if (lVar.f814g == this) {
                    lVar.f814g = null;
                }
                this.f853c = null;
                this.f852b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C0153w {

        /* renamed from: a */
        public int f866a = -1;

        /* renamed from: b */
        public int f867b = 0;

        /* renamed from: c */
        public int f868c = 0;

        /* renamed from: d */
        public int f869d = 1;

        /* renamed from: e */
        public int f870e = 0;

        /* renamed from: f */
        public boolean f871f = false;

        /* renamed from: g */
        public boolean f872g = false;

        /* renamed from: h */
        public boolean f873h = false;

        /* renamed from: i */
        public boolean f874i = false;

        /* renamed from: j */
        public boolean f875j = false;

        /* renamed from: k */
        public boolean f876k = false;

        /* renamed from: l */
        public int f877l;

        /* renamed from: m */
        public long f878m;

        /* renamed from: n */
        public int f879n;

        /* renamed from: a */
        public void mo1225a(int i) {
            if ((this.f869d & i) == 0) {
                StringBuilder o = C2108a.m5005o("Layout state should be one of ");
                o.append(Integer.toBinaryString(i));
                o.append(" but it is ");
                o.append(Integer.toBinaryString(this.f869d));
                throw new IllegalStateException(o.toString());
            }
        }

        /* renamed from: b */
        public int mo1226b() {
            return this.f872g ? this.f867b - this.f868c : this.f870e;
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("State{mTargetPosition=");
            o.append(this.f866a);
            o.append(", mData=");
            o.append((Object) null);
            o.append(", mItemCount=");
            o.append(this.f870e);
            o.append(", mIsMeasuring=");
            o.append(this.f874i);
            o.append(", mPreviousLayoutItemCount=");
            o.append(this.f867b);
            o.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            o.append(this.f868c);
            o.append(", mStructureChanged=");
            o.append(this.f871f);
            o.append(", mInPreLayout=");
            o.append(this.f872g);
            o.append(", mRunSimpleAnimations=");
            o.append(this.f875j);
            o.append(", mRunPredictiveAnimations=");
            o.append(this.f876k);
            o.append('}');
            return o.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class C0154x {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class C0155y implements Runnable {

        /* renamed from: c */
        public int f880c;

        /* renamed from: d */
        public int f881d;

        /* renamed from: e */
        public OverScroller f882e;

        /* renamed from: f */
        public Interpolator f883f;

        /* renamed from: g */
        public boolean f884g = false;

        /* renamed from: h */
        public boolean f885h = false;

        public C0155y() {
            Interpolator interpolator = RecyclerView.f724z0;
            this.f883f = interpolator;
            this.f882e = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public void mo1228a() {
            if (this.f884g) {
                this.f885h = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = C1496p.f4584a;
            recyclerView.postOnAnimation(this);
        }

        /* renamed from: b */
        public void mo1229b(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f = (float) width;
                float f2 = (float) i5;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, 2000);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f724z0;
            }
            if (this.f883f != interpolator) {
                this.f883f = interpolator;
                this.f882e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f881d = 0;
            this.f880c = 0;
            RecyclerView.this.setScrollState(2);
            this.f882e.startScroll(0, 0, i, i2, i6);
            mo1228a();
        }

        /* renamed from: c */
        public void mo1230c() {
            RecyclerView.this.removeCallbacks(this);
            this.f882e.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f772n == null) {
                mo1230c();
                return;
            }
            this.f885h = false;
            this.f884g = true;
            recyclerView.mo1047n();
            OverScroller overScroller = this.f882e;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f880c;
                int i4 = currY - this.f881d;
                this.f880c = currX;
                this.f881d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f785t0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo1099t(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f785t0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo1045m(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f770m != null) {
                    int[] iArr3 = recyclerView3.f785t0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo1033h0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f785t0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0150v vVar = recyclerView4.f772n.f814g;
                    if (vVar != null && !vVar.f854d && vVar.f855e) {
                        int b = recyclerView4.f759g0.mo1226b();
                        if (b == 0) {
                            vVar.mo1222d();
                        } else {
                            if (vVar.f851a >= b) {
                                vVar.f851a = b - 1;
                            }
                            vVar.mo1220b(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f776p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f785t0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo1100u(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f785t0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo1101v(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                C0150v vVar2 = recyclerView7.f772n.f814g;
                if ((vVar2 != null && vVar2.f854d) || !z) {
                    mo1228a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    C1746m mVar = recyclerView8.f755e0;
                    if (mVar != null) {
                        mVar.mo4918a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i7 < 0) {
                            recyclerView9.mo1103x();
                            if (recyclerView9.f732H.isFinished()) {
                                recyclerView9.f732H.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.mo1104y();
                            if (recyclerView9.f734J.isFinished()) {
                                recyclerView9.f734J.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.mo1105z();
                            if (recyclerView9.f733I.isFinished()) {
                                recyclerView9.f733I.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.mo1102w();
                            if (recyclerView9.f735K.isFinished()) {
                                recyclerView9.f735K.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i7 == 0 && currVelocity == 0)) {
                            AtomicInteger atomicInteger = C1496p.f4584a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    int[] iArr7 = RecyclerView.f722x0;
                    C1746m.C1748b bVar = RecyclerView.this.f757f0;
                    int[] iArr8 = bVar.f5332c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f5333d = 0;
                }
            }
            C0150v vVar3 = RecyclerView.this.f772n.f814g;
            if (vVar3 != null && vVar3.f854d) {
                vVar3.mo1220b(0, 0);
            }
            this.f884g = false;
            if (this.f885h) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                AtomicInteger atomicInteger2 = C1496p.f4584a;
                recyclerView10.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo1050o0(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0156z {

        /* renamed from: s */
        public static final List<Object> f887s = Collections.emptyList();

        /* renamed from: a */
        public final View f888a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f889b;

        /* renamed from: c */
        public int f890c = -1;

        /* renamed from: d */
        public int f891d = -1;

        /* renamed from: e */
        public long f892e = -1;

        /* renamed from: f */
        public int f893f = -1;

        /* renamed from: g */
        public int f894g = -1;

        /* renamed from: h */
        public C0156z f895h = null;

        /* renamed from: i */
        public C0156z f896i = null;

        /* renamed from: j */
        public int f897j;

        /* renamed from: k */
        public List<Object> f898k = null;

        /* renamed from: l */
        public List<Object> f899l = null;

        /* renamed from: m */
        public int f900m = 0;

        /* renamed from: n */
        public C0145r f901n = null;

        /* renamed from: o */
        public boolean f902o = false;

        /* renamed from: p */
        public int f903p = 0;

        /* renamed from: q */
        public int f904q = -1;

        /* renamed from: r */
        public RecyclerView f905r;

        public C0156z(View view) {
            if (view != null) {
                this.f888a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public void mo1232a(Object obj) {
            if (obj == null) {
                mo1233b(1024);
            } else if ((1024 & this.f897j) == 0) {
                if (this.f898k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f898k = arrayList;
                    this.f899l = Collections.unmodifiableList(arrayList);
                }
                this.f898k.add(obj);
            }
        }

        /* renamed from: b */
        public void mo1233b(int i) {
            this.f897j = i | this.f897j;
        }

        /* renamed from: c */
        public void mo1234c() {
            this.f891d = -1;
            this.f894g = -1;
        }

        /* renamed from: d */
        public void mo1235d() {
            this.f897j &= -33;
        }

        /* renamed from: e */
        public final int mo1236e() {
            int i = this.f894g;
            return i == -1 ? this.f890c : i;
        }

        /* renamed from: f */
        public List<Object> mo1237f() {
            if ((this.f897j & 1024) != 0) {
                return f887s;
            }
            List<Object> list = this.f898k;
            return (list == null || list.size() == 0) ? f887s : this.f899l;
        }

        /* renamed from: g */
        public boolean mo1238g(int i) {
            return (i & this.f897j) != 0;
        }

        /* renamed from: h */
        public boolean mo1239h() {
            return (this.f888a.getParent() == null || this.f888a.getParent() == this.f905r) ? false : true;
        }

        /* renamed from: i */
        public boolean mo1240i() {
            return (this.f897j & 1) != 0;
        }

        /* renamed from: j */
        public boolean mo1241j() {
            return (this.f897j & 4) != 0;
        }

        /* renamed from: k */
        public final boolean mo1242k() {
            if ((this.f897j & 16) == 0) {
                View view = this.f888a;
                AtomicInteger atomicInteger = C1496p.f4584a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public boolean mo1243l() {
            return (this.f897j & 8) != 0;
        }

        /* renamed from: m */
        public boolean mo1244m() {
            return this.f901n != null;
        }

        /* renamed from: n */
        public boolean mo1245n() {
            return (this.f897j & 256) != 0;
        }

        /* renamed from: o */
        public boolean mo1246o() {
            return (this.f897j & 2) != 0;
        }

        /* renamed from: p */
        public void mo1247p(int i, boolean z) {
            if (this.f891d == -1) {
                this.f891d = this.f890c;
            }
            if (this.f894g == -1) {
                this.f894g = this.f890c;
            }
            if (z) {
                this.f894g += i;
            }
            this.f890c += i;
            if (this.f888a.getLayoutParams() != null) {
                ((C0139m) this.f888a.getLayoutParams()).f833c = true;
            }
        }

        /* renamed from: q */
        public void mo1248q() {
            this.f897j = 0;
            this.f890c = -1;
            this.f891d = -1;
            this.f892e = -1;
            this.f894g = -1;
            this.f900m = 0;
            this.f895h = null;
            this.f896i = null;
            List<Object> list = this.f898k;
            if (list != null) {
                list.clear();
            }
            this.f897j &= -1025;
            this.f903p = 0;
            this.f904q = -1;
            RecyclerView.m434k(this);
        }

        /* renamed from: r */
        public void mo1249r(int i, int i2) {
            this.f897j = (i & i2) | (this.f897j & (~i2));
        }

        /* renamed from: s */
        public final void mo1250s(boolean z) {
            int i;
            int i2 = this.f900m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f900m = i3;
            if (i3 < 0) {
                this.f900m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f897j | 16;
            } else if (z && i3 == 0) {
                i = this.f897j & -17;
            } else {
                return;
            }
            this.f897j = i;
        }

        /* renamed from: t */
        public boolean mo1251t() {
            return (this.f897j & 128) != 0;
        }

        public String toString() {
            StringBuilder p = C2108a.m5006p(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            p.append(Integer.toHexString(hashCode()));
            p.append(" position=");
            p.append(this.f890c);
            p.append(" id=");
            p.append(this.f892e);
            p.append(", oldPos=");
            p.append(this.f891d);
            p.append(", pLpos:");
            p.append(this.f894g);
            StringBuilder sb = new StringBuilder(p.toString());
            if (mo1244m()) {
                sb.append(" scrap ");
                sb.append(this.f902o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo1241j()) {
                sb.append(" invalid");
            }
            if (!mo1240i()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.f897j & 2) != 0) {
                sb.append(" update");
            }
            if (mo1243l()) {
                sb.append(" removed");
            }
            if (mo1251t()) {
                sb.append(" ignored");
            }
            if (mo1245n()) {
                sb.append(" tmpDetached");
            }
            if (!mo1242k()) {
                StringBuilder o = C2108a.m5005o(" not recyclable(");
                o.append(this.f900m);
                o.append(")");
                sb.append(o.toString());
            }
            if ((this.f897j & 512) == 0 && !mo1241j()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f888a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo1253u() {
            return (this.f897j & 32) != 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f722x0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            f723y0 = r1
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            f724z0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        StringBuilder sb;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f750c = new C0147t();
        this.f752d = new C0145r();
        this.f760h = new C1727b0();
        this.f764j = new Rect();
        this.f766k = new Rect();
        this.f768l = new RectF();
        this.f776p = new ArrayList<>();
        this.f778q = new ArrayList<>();
        this.f790w = 0;
        this.f727C = false;
        this.f728D = false;
        this.f729E = 0;
        this.f730F = 0;
        this.f731G = new C0127h();
        this.f736L = new C1738k();
        this.f737M = 0;
        this.f738N = -1;
        this.f748a0 = Float.MIN_VALUE;
        this.f749b0 = Float.MIN_VALUE;
        this.f751c0 = true;
        this.f753d0 = new C0155y();
        this.f757f0 = new C1746m.C1748b();
        this.f759g0 = new C0153w();
        this.f765j0 = false;
        this.f767k0 = false;
        this.f769l0 = new C0132j();
        this.f771m0 = false;
        char c = 2;
        this.f777p0 = new int[2];
        this.f781r0 = new int[2];
        this.f783s0 = new int[2];
        this.f785t0 = new int[2];
        this.f787u0 = new ArrayList();
        this.f789v0 = new C0120a();
        this.f791w0 = new C0122c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f744T = viewConfiguration.getScaledTouchSlop();
        Method method = C1506v.f4601a;
        int i3 = Build.VERSION.SDK_INT;
        this.f748a0 = i3 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : C1506v.m3625a(viewConfiguration, context2);
        this.f749b0 = i3 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C1506v.m3625a(viewConfiguration, context2);
        this.f746V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f747W = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f736L.f799a = this.f769l0;
        this.f756f = new C1718a(new C1760w(this));
        this.f758g = new C1724b(new C1759v(this));
        AtomicInteger atomicInteger = C1496p.f4584a;
        if ((i3 >= 26 ? getImportantForAutofill() : 0) == 0 && i3 >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f726B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1761x(this));
        int[] iArr = C1717b.f5209a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f762i = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        this.f786u = z;
        int i4 = 4;
        if (z) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C2108a.m4994d(this, C2108a.m5005o("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new C1741l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i4 = 4;
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0134l.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f723y0);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        noSuchMethodException = e;
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0134l) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        int[] iArr2 = f722x0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        }
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: F */
    public static RecyclerView m428F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView F = m428F(viewGroup.getChildAt(i));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    /* renamed from: K */
    public static C0156z m429K(View view) {
        if (view == null) {
            return null;
        }
        return ((C0139m) view.getLayoutParams()).f831a;
    }

    private C1487g getScrollingChildHelper() {
        if (this.f779q0 == null) {
            this.f779q0 = new C1487g(this);
        }
        return this.f779q0;
    }

    /* renamed from: k */
    public static void m434k(C0156z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f889b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        zVar.f889b = null;
                        return;
                    } else if (view != zVar.f888a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public String mo961A() {
        StringBuilder o = C2108a.m5005o(" ");
        o.append(super.toString());
        o.append(", adapter:");
        o.append(this.f770m);
        o.append(", layout:");
        o.append(this.f772n);
        o.append(", context:");
        o.append(getContext());
        return o.toString();
    }

    /* renamed from: B */
    public final void mo962B(C0153w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f753d0.f882e;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(wVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo963C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo963C(android.view.View):android.view.View");
    }

    /* renamed from: D */
    public final boolean mo964D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f778q.size();
        int i = 0;
        while (i < size) {
            C0141o oVar = this.f778q.get(i);
            if (!oVar.mo1196a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f780r = oVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo965E(int[] iArr) {
        int e = this.f758g.mo4861e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C0156z K = m429K(this.f758g.mo4860d(i3));
            if (!K.mo1251t()) {
                int e2 = K.mo1236e();
                if (e2 < i) {
                    i = e2;
                }
                if (e2 > i2) {
                    i2 = e2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: G */
    public C0156z mo966G(int i) {
        C0156z zVar = null;
        if (this.f727C) {
            return null;
        }
        int h = this.f758g.mo4864h();
        for (int i2 = 0; i2 < h; i2++) {
            C0156z K = m429K(this.f758g.mo4863g(i2));
            if (K != null && !K.mo1243l() && mo967H(K) == i) {
                if (!this.f758g.mo4867k(K.f888a)) {
                    return K;
                }
                zVar = K;
            }
        }
        return zVar;
    }

    /* renamed from: H */
    public int mo967H(C0156z zVar) {
        if (zVar.mo1238g(524) || !zVar.mo1240i()) {
            return -1;
        }
        C1718a aVar = this.f756f;
        int i = zVar.f890c;
        int size = aVar.f5211b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1718a.C1720b bVar = aVar.f5211b.get(i2);
            int i3 = bVar.f5215a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f5216b;
                    if (i4 <= i) {
                        int i5 = bVar.f5218d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f5216b;
                    if (i6 == i) {
                        i = bVar.f5218d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f5218d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f5216b <= i) {
                i += bVar.f5218d;
            }
        }
        return i;
    }

    /* renamed from: I */
    public long mo968I(C0156z zVar) {
        if (this.f770m.f798b) {
            return zVar.f892e;
        }
        return (long) zVar.f890c;
    }

    /* renamed from: J */
    public C0156z mo969J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m429K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: L */
    public Rect mo970L(View view) {
        C0139m mVar = (C0139m) view.getLayoutParams();
        if (!mVar.f833c) {
            return mVar.f832b;
        }
        if (this.f759g0.f872g && (mVar.mo1194b() || mVar.f831a.mo1241j())) {
            return mVar.f832b;
        }
        Rect rect = mVar.f832b;
        rect.set(0, 0, 0, 0);
        int size = this.f776p.size();
        for (int i = 0; i < size; i++) {
            this.f764j.set(0, 0, 0, 0);
            Rect rect2 = this.f764j;
            Objects.requireNonNull(this.f776p.get(i));
            ((C0139m) view.getLayoutParams()).mo1193a();
            rect2.set(0, 0, 0, 0);
            int i2 = rect.left;
            Rect rect3 = this.f764j;
            rect.left = i2 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        mVar.f833c = false;
        return rect;
    }

    /* renamed from: M */
    public boolean mo971M() {
        return !this.f788v || this.f727C || this.f756f.mo4843g();
    }

    /* renamed from: N */
    public void mo972N() {
        this.f735K = null;
        this.f733I = null;
        this.f734J = null;
        this.f732H = null;
    }

    /* renamed from: O */
    public boolean mo973O() {
        return this.f729E > 0;
    }

    /* renamed from: P */
    public void mo974P(int i) {
        if (this.f772n != null) {
            setScrollState(2);
            this.f772n.mo909M0(i);
            awakenScrollBars();
        }
    }

    /* renamed from: Q */
    public void mo975Q() {
        int h = this.f758g.mo4864h();
        for (int i = 0; i < h; i++) {
            ((C0139m) this.f758g.mo4863g(i).getLayoutParams()).f833c = true;
        }
        C0145r rVar = this.f752d;
        int size = rVar.f843c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0139m mVar = (C0139m) rVar.f843c.get(i2).f888a.getLayoutParams();
            if (mVar != null) {
                mVar.f833c = true;
            }
        }
    }

    /* renamed from: R */
    public void mo976R(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f758g.mo4864h();
        for (int i4 = 0; i4 < h; i4++) {
            C0156z K = m429K(this.f758g.mo4863g(i4));
            if (K != null && !K.mo1251t()) {
                int i5 = K.f890c;
                if (i5 >= i3) {
                    K.mo1247p(-i2, z);
                } else if (i5 >= i) {
                    K.mo1233b(8);
                    K.mo1247p(-i2, z);
                    K.f890c = i - 1;
                }
                this.f759g0.f871f = true;
            }
        }
        C0145r rVar = this.f752d;
        int size = rVar.f843c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0156z zVar = rVar.f843c.get(size);
                if (zVar != null) {
                    int i6 = zVar.f890c;
                    if (i6 >= i3) {
                        zVar.mo1247p(-i2, z);
                    } else if (i6 >= i) {
                        zVar.mo1233b(8);
                        rVar.mo1208f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: S */
    public void mo977S() {
    }

    /* renamed from: T */
    public void mo978T() {
    }

    /* renamed from: U */
    public void mo979U() {
        this.f729E++;
    }

    /* renamed from: V */
    public void mo980V(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f729E - 1;
        this.f729E = i2;
        if (i2 < 1) {
            this.f729E = 0;
            if (z) {
                int i3 = this.f725A;
                this.f725A = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f726B;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f787u0.size() - 1; size >= 0; size--) {
                    C0156z zVar = this.f787u0.get(size);
                    if (zVar.f888a.getParent() == this && !zVar.mo1251t() && (i = zVar.f904q) != -1) {
                        View view = zVar.f888a;
                        AtomicInteger atomicInteger = C1496p.f4584a;
                        view.setImportantForAccessibility(i);
                        zVar.f904q = -1;
                    }
                }
                this.f787u0.clear();
            }
        }
    }

    /* renamed from: W */
    public final void mo981W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f738N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f738N = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f742R = x;
            this.f740P = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f743S = y;
            this.f741Q = y;
        }
    }

    /* renamed from: X */
    public void mo982X() {
    }

    /* renamed from: Y */
    public void mo983Y() {
    }

    /* renamed from: Z */
    public void mo984Z() {
        if (!this.f771m0 && this.f782s) {
            Runnable runnable = this.f789v0;
            AtomicInteger atomicInteger = C1496p.f4584a;
            postOnAnimation(runnable);
            this.f771m0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r6.f736L != null && r6.f772n.mo879Y0()) != false) goto L_0x0081;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo985a0() {
        /*
            r6 = this;
            boolean r0 = r6.f727C
            if (r0 == 0) goto L_0x0019
            b.u.c.a r0 = r6.f756f
            java.util.ArrayList<b.u.c.a$b> r1 = r0.f5211b
            r0.mo4848l(r1)
            java.util.ArrayList<b.u.c.a$b> r1 = r0.f5212c
            r0.mo4848l(r1)
            boolean r0 = r6.f728D
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f772n
            r0.mo889p0(r6)
        L_0x0019:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f736L
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f772n
            boolean r0 = r0.mo879Y0()
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            b.u.c.a r0 = r6.f756f
            r0.mo4846j()
            goto L_0x0037
        L_0x0032:
            b.u.c.a r0 = r6.f756f
            r0.mo4839c()
        L_0x0037:
            boolean r0 = r6.f765j0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r6.f767k0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView$w r3 = r6.f759g0
            boolean r4 = r6.f788v
            if (r4 == 0) goto L_0x0063
            androidx.recyclerview.widget.RecyclerView$i r4 = r6.f736L
            if (r4 == 0) goto L_0x0063
            boolean r4 = r6.f727C
            if (r4 != 0) goto L_0x0059
            if (r0 != 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f772n
            boolean r5 = r5.f815h
            if (r5 == 0) goto L_0x0063
        L_0x0059:
            if (r4 == 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView$d r4 = r6.f770m
            boolean r4 = r4.f798b
            if (r4 == 0) goto L_0x0063
        L_0x0061:
            r4 = r1
            goto L_0x0064
        L_0x0063:
            r4 = r2
        L_0x0064:
            r3.f875j = r4
            if (r4 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6.f727C
            if (r0 != 0) goto L_0x0080
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f736L
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f772n
            boolean r0 = r0.mo879Y0()
            if (r0 == 0) goto L_0x007c
            r0 = r1
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r3.f876k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo985a0():void");
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0134l lVar = this.f772n;
        if (lVar == null || !lVar.mo1173e0()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public void mo987b0(boolean z) {
        this.f728D = z | this.f728D;
        this.f727C = true;
        int h = this.f758g.mo4864h();
        for (int i = 0; i < h; i++) {
            C0156z K = m429K(this.f758g.mo4863g(i));
            if (K != null && !K.mo1251t()) {
                K.mo1233b(6);
            }
        }
        mo975Q();
        C0145r rVar = this.f752d;
        int size = rVar.f843c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0156z zVar = rVar.f843c.get(i2);
            if (zVar != null) {
                zVar.mo1233b(6);
                zVar.mo1232a((Object) null);
            }
        }
        C0123d dVar = RecyclerView.this.f770m;
        if (dVar == null || !dVar.f798b) {
            rVar.mo1207e();
        }
    }

    /* renamed from: c0 */
    public void mo988c0(C0156z zVar, C0128i.C0131c cVar) {
        zVar.mo1249r(0, 8192);
        if (this.f759g0.f873h && zVar.mo1246o() && !zVar.mo1243l() && !zVar.mo1251t()) {
            this.f760h.f5232b.mo3693h(mo968I(zVar), zVar);
        }
        this.f760h.mo4881c(zVar, cVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0139m) && this.f772n.mo881g((C0139m) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo919e()) {
            return this.f772n.mo931k(this.f759g0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo919e()) {
            return this.f772n.mo883l(this.f759g0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo919e()) {
            return this.f772n.mo884m(this.f759g0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo921f()) {
            return this.f772n.mo935n(this.f759g0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo921f()) {
            return this.f772n.mo886o(this.f759g0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0134l lVar = this.f772n;
        if (lVar != null && lVar.mo921f()) {
            return this.f772n.mo888p(this.f759g0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public void mo996d0() {
        C0128i iVar = this.f736L;
        if (iVar != null) {
            iVar.mo1123f();
        }
        C0134l lVar = this.f772n;
        if (lVar != null) {
            lVar.mo1136E0(this.f752d);
            this.f772n.mo1138F0(this.f752d);
        }
        this.f752d.mo1204b();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo4262a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo4263b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo4264c(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo4266e(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.f776p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f776p.get(i).mo1128e(canvas, this, this.f759g0);
        }
        EdgeEffect edgeEffect = this.f732H;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f762i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f732H;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f733I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f762i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f733I;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f734J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f762i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f734J;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f735K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f762i) {
                f2 = (float) (getPaddingRight() + (-getWidth()));
                f = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f2 = (float) (-getWidth());
                f = (float) (-getHeight());
            }
            canvas.translate(f2, f);
            EdgeEffect edgeEffect8 = this.f735K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f736L == null || this.f776p.size() <= 0 || !this.f736L.mo1124g()) {
            z3 = z;
        }
        if (z3) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public final void mo1006e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f764j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0139m) {
            C0139m mVar = (C0139m) layoutParams;
            if (!mVar.f833c) {
                Rect rect = mVar.f832b;
                Rect rect2 = this.f764j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f764j);
            offsetRectIntoDescendantCoords(view, this.f764j);
        }
        this.f772n.mo1146J0(this, view, this.f764j, !this.f788v, view2 == null);
    }

    /* renamed from: f */
    public final void mo1007f(C0156z zVar) {
        View view = zVar.f888a;
        boolean z = view.getParent() == this;
        this.f752d.mo1213k(mo969J(view));
        if (zVar.mo1245n()) {
            this.f758g.mo4858b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1724b bVar = this.f758g;
        if (!z) {
            bVar.mo4857a(view, -1, true);
            return;
        }
        int indexOfChild = ((C1759v) bVar.f5226a).f5363a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f5227b.mo4877h(indexOfChild);
            bVar.mo4865i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: f0 */
    public final void mo1008f0() {
        VelocityTracker velocityTracker = this.f739O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo1050o0(0);
        EdgeEffect edgeEffect = this.f732H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f732H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f733I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f733I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f734J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f734J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f735K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f735K.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0168, code lost:
        if (r3 > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0182, code lost:
        if (r6 > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0185, code lost:
        if (r3 < 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0188, code lost:
        if (r6 < 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0190, code lost:
        if ((r6 * r2) < 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0198, code lost:
        if ((r6 * r2) > 0) goto L_0x019b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            android.view.View r0 = r0.mo1178n0()
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$d r0 = r13.f770m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.mo973O()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.f793y
            if (r0 != 0) goto L_0x001f
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x0091
            if (r15 == r7) goto L_0x0030
            if (r15 != r1) goto L_0x0091
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            boolean r0 = r0.mo921f()
            if (r0 == 0) goto L_0x0046
            if (r15 != r7) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$l r8 = r13.f772n
            boolean r8 = r8.mo919e()
            if (r8 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            int r0 = r0.mo1147K()
            if (r0 != r1) goto L_0x005b
            r0 = r1
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r15 != r7) goto L_0x0060
            r8 = r1
            goto L_0x0061
        L_0x0060:
            r8 = r2
        L_0x0061:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0067
            r0 = 66
            goto L_0x0068
        L_0x0067:
            r0 = r5
        L_0x0068:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 == 0) goto L_0x008c
            r13.mo1047n()
            android.view.View r0 = r13.mo963C(r14)
            if (r0 != 0) goto L_0x007d
            return r6
        L_0x007d:
            r13.mo1044l0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            androidx.recyclerview.widget.RecyclerView$r r8 = r13.f752d
            androidx.recyclerview.widget.RecyclerView$w r9 = r13.f759g0
            r0.mo882i0(r14, r15, r8, r9)
            r13.mo1048n0(r2)
        L_0x008c:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b5
        L_0x0091:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b4
            r13.mo1047n()
            android.view.View r0 = r13.mo963C(r14)
            if (r0 != 0) goto L_0x00a3
            return r6
        L_0x00a3:
            r13.mo1044l0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f772n
            androidx.recyclerview.widget.RecyclerView$r r3 = r13.f752d
            androidx.recyclerview.widget.RecyclerView$w r8 = r13.f759g0
            android.view.View r0 = r0.mo882i0(r14, r15, r3, r8)
            r13.mo1048n0(r2)
            goto L_0x00b5
        L_0x00b4:
            r0 = r3
        L_0x00b5:
            if (r0 == 0) goto L_0x00cc
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00cc
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c8
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c8:
            r13.mo1006e0(r0, r6)
            return r14
        L_0x00cc:
            if (r0 == 0) goto L_0x019b
            if (r0 != r13) goto L_0x00d2
            goto L_0x019b
        L_0x00d2:
            android.view.View r3 = r13.mo963C(r0)
            if (r3 != 0) goto L_0x00db
            r1 = r2
            goto L_0x019c
        L_0x00db:
            if (r14 != 0) goto L_0x00df
            goto L_0x019c
        L_0x00df:
            android.view.View r3 = r13.mo963C(r14)
            if (r3 != 0) goto L_0x00e7
            goto L_0x019c
        L_0x00e7:
            android.graphics.Rect r3 = r13.f764j
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r3 = r13.f766k
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r2 = r13.f764j
            r13.offsetDescendantRectToMyCoords(r14, r2)
            android.graphics.Rect r2 = r13.f766k
            r13.offsetDescendantRectToMyCoords(r0, r2)
            androidx.recyclerview.widget.RecyclerView$l r2 = r13.f772n
            int r2 = r2.mo1147K()
            if (r2 != r1) goto L_0x0115
            r2 = -1
            goto L_0x0116
        L_0x0115:
            r2 = r1
        L_0x0116:
            android.graphics.Rect r3 = r13.f764j
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f766k
            int r9 = r8.left
            if (r6 < r9) goto L_0x0124
            int r10 = r3.right
            if (r10 > r9) goto L_0x012c
        L_0x0124:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x012c
            r6 = r1
            goto L_0x0139
        L_0x012c:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0134
            if (r6 < r11) goto L_0x0138
        L_0x0134:
            if (r6 <= r9) goto L_0x0138
            r6 = -1
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0143
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x014b
        L_0x0143:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x014b
            r3 = r1
            goto L_0x0158
        L_0x014b:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0153
            if (r9 < r8) goto L_0x0157
        L_0x0153:
            if (r9 <= r10) goto L_0x0157
            r3 = -1
            goto L_0x0158
        L_0x0157:
            r3 = 0
        L_0x0158:
            if (r15 == r1) goto L_0x0193
            if (r15 == r7) goto L_0x018b
            if (r15 == r5) goto L_0x0188
            if (r15 == r4) goto L_0x0185
            r2 = 66
            if (r15 == r2) goto L_0x0182
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x016b
            if (r3 <= 0) goto L_0x019b
            goto L_0x019c
        L_0x016b:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = p133c.p149b.p152b.p153a.C2108a.m4994d(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0182:
            if (r6 <= 0) goto L_0x019b
            goto L_0x019c
        L_0x0185:
            if (r3 >= 0) goto L_0x019b
            goto L_0x019c
        L_0x0188:
            if (r6 >= 0) goto L_0x019b
            goto L_0x019c
        L_0x018b:
            if (r3 > 0) goto L_0x019c
            if (r3 != 0) goto L_0x019b
            int r6 = r6 * r2
            if (r6 < 0) goto L_0x019b
            goto L_0x019c
        L_0x0193:
            if (r3 < 0) goto L_0x019c
            if (r3 != 0) goto L_0x019b
            int r6 = r6 * r2
            if (r6 > 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r1 = 0
        L_0x019c:
            if (r1 == 0) goto L_0x019f
            goto L_0x01a3
        L_0x019f:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public void mo1010g(C0133k kVar) {
        C0134l lVar = this.f772n;
        if (lVar != null) {
            lVar.mo917d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f776p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f776p.add(kVar);
        mo975Q();
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1011g0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.mo1047n()
            androidx.recyclerview.widget.RecyclerView$d r0 = r8.f770m
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.f785t0
            r0[r12] = r12
            r0[r11] = r12
            r8.mo1033h0(r9, r10, r0)
            int[] r0 = r8.f785t0
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r8.f776p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.f785t0
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r8.f781r0
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r0.mo1100u(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f785t0
            r1 = r0[r12]
            int r15 = r15 - r1
            r1 = r0[r11]
            int r1 = r16 - r1
            r2 = r0[r12]
            if (r2 != 0) goto L_0x005f
            r0 = r0[r11]
            if (r0 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r0 = r12
            goto L_0x0060
        L_0x005f:
            r0 = r11
        L_0x0060:
            int r2 = r8.f742R
            int[] r3 = r8.f781r0
            r4 = r3[r12]
            int r2 = r2 - r4
            r8.f742R = r2
            int r2 = r8.f743S
            r4 = r3[r11]
            int r2 = r2 - r4
            r8.f743S = r2
            int[] r2 = r8.f783s0
            r4 = r2[r12]
            r5 = r3[r12]
            int r4 = r4 + r5
            r2[r12] = r4
            r4 = r2[r11]
            r3 = r3[r11]
            int r4 = r4 + r3
            r2[r11] = r4
            int r2 = r17.getOverScrollMode()
            r3 = 2
            if (r2 == r3) goto L_0x0120
            if (r20 == 0) goto L_0x011d
            r2 = 8194(0x2002, float:1.1482E-41)
            int r3 = r20.getSource()
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0094
            r2 = r11
            goto L_0x0095
        L_0x0094:
            r2 = r12
        L_0x0095:
            if (r2 != 0) goto L_0x011d
            float r2 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r1 = (float) r1
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00bd
            r17.mo1103x()
            android.widget.EdgeEffect r6 = r8.f732H
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r7 - r4
            goto L_0x00d3
        L_0x00bd:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d8
            r17.mo1104y()
            android.widget.EdgeEffect r6 = r8.f734J
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r3 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
        L_0x00d3:
            r6.onPull(r15, r4)
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = r12
        L_0x00d9:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f3
            r17.mo1105z()
            android.widget.EdgeEffect r4 = r8.f733I
            float r6 = -r1
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            r4.onPull(r6, r2)
            goto L_0x010d
        L_0x00f3:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x010e
            r17.mo1102w()
            android.widget.EdgeEffect r4 = r8.f735K
            int r6 = r17.getHeight()
            float r6 = (float) r6
            float r6 = r1 / r6
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            r4.onPull(r6, r7)
        L_0x010d:
            r4 = 1
        L_0x010e:
            if (r4 != 0) goto L_0x0118
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0118
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x011d
        L_0x0118:
            java.util.concurrent.atomic.AtomicInteger r1 = p009b.p086k.p098j.C1496p.f4584a
            r17.postInvalidateOnAnimation()
        L_0x011d:
            r17.mo1045m(r18, r19)
        L_0x0120:
            if (r14 != 0) goto L_0x0124
            if (r13 == 0) goto L_0x0127
        L_0x0124:
            r8.mo1101v(r14, r13)
        L_0x0127:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x0130
            r17.invalidate()
        L_0x0130:
            if (r0 != 0) goto L_0x0139
            if (r14 != 0) goto L_0x0139
            if (r13 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r11 = r12
            goto L_0x013a
        L_0x0139:
            r11 = 1
        L_0x013a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1011g0(int, int, android.view.MotionEvent):boolean");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0134l lVar = this.f772n;
        if (lVar != null) {
            return lVar.mo894u();
        }
        throw new IllegalStateException(C2108a.m4994d(this, C2108a.m5005o("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0134l lVar = this.f772n;
        if (lVar != null) {
            return lVar.mo896v(getContext(), attributeSet);
        }
        throw new IllegalStateException(C2108a.m4994d(this, C2108a.m5005o("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0134l lVar = this.f772n;
        if (lVar != null) {
            return lVar.mo899w(layoutParams);
        }
        throw new IllegalStateException(C2108a.m4994d(this, C2108a.m5005o("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0123d getAdapter() {
        return this.f770m;
    }

    public int getBaseline() {
        C0134l lVar = this.f772n;
        if (lVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lVar);
        return -1;
    }

    public int getChildDrawingOrder(int i, int i2) {
        C0126g gVar = this.f775o0;
        return gVar == null ? super.getChildDrawingOrder(i, i2) : gVar.mo1117a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f762i;
    }

    public C1761x getCompatAccessibilityDelegate() {
        return this.f773n0;
    }

    public C0127h getEdgeEffectFactory() {
        return this.f731G;
    }

    public C0128i getItemAnimator() {
        return this.f736L;
    }

    public int getItemDecorationCount() {
        return this.f776p.size();
    }

    public C0134l getLayoutManager() {
        return this.f772n;
    }

    public int getMaxFlingVelocity() {
        return this.f747W;
    }

    public int getMinFlingVelocity() {
        return this.f746V;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public C0140n getOnFlingListener() {
        return this.f745U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f751c0;
    }

    public C0143q getRecycledViewPool() {
        return this.f752d.mo1206d();
    }

    public int getScrollState() {
        return this.f737M;
    }

    /* renamed from: h */
    public void mo1032h(C0142p pVar) {
        if (this.f763i0 == null) {
            this.f763i0 = new ArrayList();
        }
        this.f763i0.add(pVar);
    }

    /* renamed from: h0 */
    public void mo1033h0(int i, int i2, int[] iArr) {
        C0156z zVar;
        mo1044l0();
        mo979U();
        int i3 = C1412g.f4423a;
        Trace.beginSection("RV Scroll");
        mo962B(this.f759g0);
        int L0 = i != 0 ? this.f772n.mo869L0(i, this.f752d, this.f759g0) : 0;
        int N0 = i2 != 0 ? this.f772n.mo872N0(i2, this.f752d, this.f759g0) : 0;
        Trace.endSection();
        int e = this.f758g.mo4861e();
        for (int i4 = 0; i4 < e; i4++) {
            View d = this.f758g.mo4860d(i4);
            C0156z J = mo969J(d);
            if (!(J == null || (zVar = J.f896i) == null)) {
                View view = zVar.f888a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo980V(true);
        mo1048n0(false);
        if (iArr != null) {
            iArr[0] = L0;
            iArr[1] = N0;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo4269h(0);
    }

    /* renamed from: i */
    public void mo1035i(String str) {
        if (mo973O()) {
            if (str == null) {
                throw new IllegalStateException(C2108a.m4994d(this, C2108a.m5005o("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f730F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C2108a.m4994d(this, C2108a.m5005o(""))));
        }
    }

    /* renamed from: i0 */
    public void mo1036i0(int i) {
        if (!this.f793y) {
            mo1064p0();
            C0134l lVar = this.f772n;
            if (lVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lVar.mo909M0(i);
            awakenScrollBars();
        }
    }

    public boolean isAttachedToWindow() {
        return this.f782s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f793y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4576d;
    }

    /* renamed from: j */
    public final void mo1040j() {
        mo1008f0();
        setScrollState(0);
    }

    /* renamed from: j0 */
    public boolean mo1041j0(C0156z zVar, int i) {
        if (mo973O()) {
            zVar.f904q = i;
            this.f787u0.add(zVar);
            return false;
        }
        View view = zVar.f888a;
        AtomicInteger atomicInteger = C1496p.f4584a;
        view.setImportantForAccessibility(i);
        return true;
    }

    /* renamed from: k0 */
    public void mo1042k0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0134l lVar = this.f772n;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f793y) {
            int i4 = 0;
            if (!lVar.mo919e()) {
                i = 0;
            }
            if (!this.f772n.mo921f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo1046m0(i4, 1);
                    }
                    this.f753d0.mo1229b(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: l */
    public void mo1043l() {
        int h = this.f758g.mo4864h();
        for (int i = 0; i < h; i++) {
            C0156z K = m429K(this.f758g.mo4863g(i));
            if (!K.mo1251t()) {
                K.mo1234c();
            }
        }
        C0145r rVar = this.f752d;
        int size = rVar.f843c.size();
        for (int i2 = 0; i2 < size; i2++) {
            rVar.f843c.get(i2).mo1234c();
        }
        int size2 = rVar.f841a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            rVar.f841a.get(i3).mo1234c();
        }
        ArrayList<C0156z> arrayList = rVar.f842b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                rVar.f842b.get(i4).mo1234c();
            }
        }
    }

    /* renamed from: l0 */
    public void mo1044l0() {
        int i = this.f790w + 1;
        this.f790w = i;
        if (i == 1 && !this.f793y) {
            this.f792x = false;
        }
    }

    /* renamed from: m */
    public void mo1045m(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f732H;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f732H.onRelease();
            z = this.f732H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f734J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f734J.onRelease();
            z |= this.f734J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f733I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f733I.onRelease();
            z |= this.f733I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f735K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f735K.onRelease();
            z |= this.f735K.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m0 */
    public boolean mo1046m0(int i, int i2) {
        return getScrollingChildHelper().mo4270i(i, i2);
    }

    /* renamed from: n */
    public void mo1047n() {
        if (!this.f788v || this.f727C) {
            int i = C1412g.f4423a;
            Trace.beginSection("RV FullInvalidate");
            mo1065q();
            Trace.endSection();
        } else if (this.f756f.mo4843g()) {
            Objects.requireNonNull(this.f756f);
            if (this.f756f.mo4843g()) {
                int i2 = C1412g.f4423a;
                Trace.beginSection("RV FullInvalidate");
                mo1065q();
                Trace.endSection();
            }
        }
    }

    /* renamed from: n0 */
    public void mo1048n0(boolean z) {
        if (this.f790w < 1) {
            this.f790w = 1;
        }
        if (!z && !this.f793y) {
            this.f792x = false;
        }
        if (this.f790w == 1) {
            if (z && this.f792x && !this.f793y && this.f772n != null && this.f770m != null) {
                mo1065q();
            }
            if (!this.f793y) {
                this.f792x = false;
            }
        }
        this.f790w--;
    }

    /* renamed from: o */
    public void mo1049o(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = C1496p.f4584a;
        setMeasuredDimension(C0134l.m519h(i, paddingRight, getMinimumWidth()), C0134l.m519h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: o0 */
    public void mo1050o0(int i) {
        getScrollingChildHelper().mo4271j(i);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f729E = 0;
        this.f782s = true;
        this.f788v = this.f788v && !isLayoutRequested();
        C0134l lVar = this.f772n;
        if (lVar != null) {
            lVar.f816i = true;
            lVar.mo1174f0();
        }
        this.f771m0 = false;
        ThreadLocal<C1746m> threadLocal = C1746m.f5324g;
        C1746m mVar = threadLocal.get();
        this.f755e0 = mVar;
        if (mVar == null) {
            this.f755e0 = new C1746m();
            AtomicInteger atomicInteger = C1496p.f4584a;
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            C1746m mVar2 = this.f755e0;
            mVar2.f5328e = (long) (1.0E9f / f);
            threadLocal.set(mVar2);
        }
        this.f755e0.f5326c.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0128i iVar = this.f736L;
        if (iVar != null) {
            iVar.mo1123f();
        }
        mo1064p0();
        this.f782s = false;
        C0134l lVar = this.f772n;
        if (lVar != null) {
            C0145r rVar = this.f752d;
            lVar.f816i = false;
            lVar.mo924h0(this, rVar);
        }
        this.f787u0.clear();
        removeCallbacks(this.f789v0);
        Objects.requireNonNull(this.f760h);
        do {
        } while (C1727b0.C1728a.f5233d.mo4182a() != null);
        C1746m mVar = this.f755e0;
        if (mVar != null) {
            mVar.f5326c.remove(this);
            this.f755e0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f776p.size();
        for (int i = 0; i < size; i++) {
            this.f776p.get(i).mo1127d(canvas, this, this.f759g0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f772n != null && !this.f793y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f772n.mo921f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f772n.mo919e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo1011g0((int) (f * this.f748a0), (int) (f2 * this.f749b0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f772n.mo921f()) {
                        f2 = -axisValue;
                    } else if (this.f772n.mo919e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo1011g0((int) (f * this.f748a0), (int) (f2 * this.f749b0), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                mo1011g0((int) (f * this.f748a0), (int) (f2 * this.f749b0), motionEvent);
            }
            f = 0.0f;
            mo1011g0((int) (f * this.f748a0), (int) (f2 * this.f749b0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f793y) {
            return false;
        }
        this.f780r = null;
        if (mo964D(motionEvent)) {
            mo1040j();
            return true;
        }
        C0134l lVar = this.f772n;
        if (lVar == null) {
            return false;
        }
        boolean e = lVar.mo919e();
        boolean f = this.f772n.mo921f();
        if (this.f739O == null) {
            this.f739O = VelocityTracker.obtain();
        }
        this.f739O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f794z) {
                this.f794z = false;
            }
            this.f738N = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f742R = x;
            this.f740P = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f743S = y;
            this.f741Q = y;
            if (this.f737M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo1050o0(1);
            }
            int[] iArr = this.f783s0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            mo1046m0(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f739O.clear();
            mo1050o0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f738N);
            if (findPointerIndex < 0) {
                StringBuilder o = C2108a.m5005o("Error processing scroll; pointer index for id ");
                o.append(this.f738N);
                o.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", o.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f737M != 1) {
                int i = x2 - this.f740P;
                int i2 = y2 - this.f741Q;
                if (!e || Math.abs(i) <= this.f744T) {
                    z = false;
                } else {
                    this.f742R = x2;
                    z = true;
                }
                if (f && Math.abs(i2) > this.f744T) {
                    this.f743S = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo1040j();
        } else if (actionMasked == 5) {
            this.f738N = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f742R = x3;
            this.f740P = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f743S = y3;
            this.f741Q = y3;
        } else if (actionMasked == 6) {
            mo981W(motionEvent);
        }
        return this.f737M == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C1412g.f4423a;
        Trace.beginSection("RV OnLayout");
        mo1065q();
        Trace.endSection();
        this.f788v = true;
    }

    public void onMeasure(int i, int i2) {
        C0134l lVar = this.f772n;
        if (lVar == null) {
            mo1049o(i, i2);
            return;
        }
        boolean z = false;
        if (lVar.mo911W()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f772n.mo1183w0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f770m != null) {
                if (this.f759g0.f869d == 1) {
                    mo1066r();
                }
                this.f772n.mo1155P0(i, i2);
                this.f759g0.f874i = true;
                mo1072s();
                this.f772n.mo1158R0(i, i2);
                if (this.f772n.mo910U0()) {
                    this.f772n.mo1155P0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f759g0.f874i = true;
                    mo1072s();
                    this.f772n.mo1158R0(i, i2);
                }
            }
        } else if (this.f784t) {
            this.f772n.mo1183w0(i, i2);
        } else {
            C0153w wVar = this.f759g0;
            if (wVar.f876k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0123d dVar = this.f770m;
            if (dVar != null) {
                wVar.f870e = dVar.mo1110a();
            } else {
                wVar.f870e = 0;
            }
            mo1044l0();
            this.f772n.mo1183w0(i, i2);
            mo1048n0(false);
            this.f759g0.f872g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo973O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0148u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0148u uVar = (C0148u) parcelable;
        this.f754e = uVar;
        super.onRestoreInstanceState(uVar.f4660c);
        C0134l lVar = this.f772n;
        if (lVar != null && (parcelable2 = this.f754e.f850e) != null) {
            lVar.mo946z0(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        C0148u uVar = new C0148u(super.onSaveInstanceState());
        C0148u uVar2 = this.f754e;
        if (uVar2 != null) {
            uVar.f850e = uVar2.f850e;
        } else {
            C0134l lVar = this.f772n;
            uVar.f850e = lVar != null ? lVar.mo902A0() : null;
        }
        return uVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo972N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031f, code lost:
        if (r0 < r3) goto L_0x0322;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f793y
            r3 = 0
            if (r2 != 0) goto L_0x03e4
            boolean r2 = r0.f794z
            if (r2 == 0) goto L_0x000f
            goto L_0x03e4
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$o r2 = r0.f780r
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0023
            int r2 = r21.getAction()
            if (r2 != 0) goto L_0x001e
            r2 = r3
            goto L_0x0031
        L_0x001e:
            boolean r2 = r20.mo964D(r21)
            goto L_0x0031
        L_0x0023:
            r2.mo1197b(r0, r1)
            int r2 = r21.getAction()
            if (r2 == r4) goto L_0x002e
            if (r2 != r6) goto L_0x0030
        L_0x002e:
            r0.f780r = r5
        L_0x0030:
            r2 = r6
        L_0x0031:
            if (r2 == 0) goto L_0x0037
            r20.mo1040j()
            return r6
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.f772n
            if (r2 != 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r2 = r2.mo919e()
            androidx.recyclerview.widget.RecyclerView$l r7 = r0.f772n
            boolean r7 = r7.mo921f()
            android.view.VelocityTracker r8 = r0.f739O
            if (r8 != 0) goto L_0x0050
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r0.f739O = r8
        L_0x0050:
            int r8 = r21.getActionMasked()
            int r9 = r21.getActionIndex()
            if (r8 != 0) goto L_0x0060
            int[] r10 = r0.f783s0
            r10[r6] = r3
            r10[r3] = r3
        L_0x0060:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r21)
            int[] r11 = r0.f783s0
            r12 = r11[r3]
            float r12 = (float) r12
            r11 = r11[r6]
            float r11 = (float) r11
            r10.offsetLocation(r12, r11)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x03ad
            java.lang.String r12 = "RecyclerView"
            r13 = 2
            if (r8 == r6) goto L_0x0187
            if (r8 == r13) goto L_0x00aa
            if (r8 == r4) goto L_0x00a5
            r2 = 5
            if (r8 == r2) goto L_0x0089
            r2 = 6
            if (r8 == r2) goto L_0x0084
            goto L_0x0182
        L_0x0084:
            r20.mo981W(r21)
            goto L_0x0182
        L_0x0089:
            int r2 = r1.getPointerId(r9)
            r0.f738N = r2
            float r2 = r1.getX(r9)
            float r2 = r2 + r11
            int r2 = (int) r2
            r0.f742R = r2
            r0.f740P = r2
            float r1 = r1.getY(r9)
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.f743S = r1
            r0.f741Q = r1
            goto L_0x0182
        L_0x00a5:
            r20.mo1040j()
            goto L_0x0182
        L_0x00aa:
            int r4 = r0.f738N
            int r4 = r1.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x00ca
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r1 = p133c.p149b.p152b.p153a.C2108a.m5005o(r1)
            int r2 = r0.f738N
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1)
            return r3
        L_0x00ca:
            float r5 = r1.getX(r4)
            float r5 = r5 + r11
            int r5 = (int) r5
            float r4 = r1.getY(r4)
            float r4 = r4 + r11
            int r4 = (int) r4
            int r8 = r0.f742R
            int r8 = r8 - r5
            int r9 = r0.f743S
            int r9 = r9 - r4
            int r11 = r0.f737M
            if (r11 == r6) goto L_0x010f
            if (r2 == 0) goto L_0x00f5
            int r11 = r0.f744T
            if (r8 <= 0) goto L_0x00ec
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r3, r8)
            goto L_0x00f1
        L_0x00ec:
            int r8 = r8 + r11
            int r8 = java.lang.Math.min(r3, r8)
        L_0x00f1:
            if (r8 == 0) goto L_0x00f5
            r11 = r6
            goto L_0x00f6
        L_0x00f5:
            r11 = r3
        L_0x00f6:
            if (r7 == 0) goto L_0x010a
            int r12 = r0.f744T
            if (r9 <= 0) goto L_0x0102
            int r9 = r9 - r12
            int r9 = java.lang.Math.max(r3, r9)
            goto L_0x0107
        L_0x0102:
            int r9 = r9 + r12
            int r9 = java.lang.Math.min(r3, r9)
        L_0x0107:
            if (r9 == 0) goto L_0x010a
            r11 = r6
        L_0x010a:
            if (r11 == 0) goto L_0x010f
            r0.setScrollState(r6)
        L_0x010f:
            int r11 = r0.f737M
            if (r11 != r6) goto L_0x0182
            int[] r15 = r0.f785t0
            r15[r3] = r3
            r15[r6] = r3
            if (r2 == 0) goto L_0x011d
            r13 = r8
            goto L_0x011e
        L_0x011d:
            r13 = r3
        L_0x011e:
            if (r7 == 0) goto L_0x0122
            r14 = r9
            goto L_0x0123
        L_0x0122:
            r14 = r3
        L_0x0123:
            int[] r11 = r0.f781r0
            r17 = 0
            b.k.j.g r12 = r20.getScrollingChildHelper()
            r16 = r11
            boolean r11 = r12.mo4264c(r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0154
            int[] r11 = r0.f785t0
            r12 = r11[r3]
            int r8 = r8 - r12
            r11 = r11[r6]
            int r9 = r9 - r11
            int[] r11 = r0.f783s0
            r12 = r11[r3]
            int[] r13 = r0.f781r0
            r14 = r13[r3]
            int r12 = r12 + r14
            r11[r3] = r12
            r12 = r11[r6]
            r13 = r13[r6]
            int r12 = r12 + r13
            r11[r6] = r12
            android.view.ViewParent r11 = r20.getParent()
            r11.requestDisallowInterceptTouchEvent(r6)
        L_0x0154:
            int[] r11 = r0.f781r0
            r12 = r11[r3]
            int r5 = r5 - r12
            r0.f742R = r5
            r5 = r11[r6]
            int r4 = r4 - r5
            r0.f743S = r4
            if (r2 == 0) goto L_0x0164
            r2 = r8
            goto L_0x0165
        L_0x0164:
            r2 = r3
        L_0x0165:
            if (r7 == 0) goto L_0x0169
            r4 = r9
            goto L_0x016a
        L_0x0169:
            r4 = r3
        L_0x016a:
            boolean r1 = r0.mo1011g0(r2, r4, r1)
            if (r1 == 0) goto L_0x0177
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r6)
        L_0x0177:
            b.u.c.m r1 = r0.f755e0
            if (r1 == 0) goto L_0x0182
            if (r8 != 0) goto L_0x017f
            if (r9 == 0) goto L_0x0182
        L_0x017f:
            r1.mo4918a(r0, r8, r9)
        L_0x0182:
            r5 = r0
            r16 = r10
            goto L_0x03d2
        L_0x0187:
            android.view.VelocityTracker r1 = r0.f739O
            r1.addMovement(r10)
            android.view.VelocityTracker r1 = r0.f739O
            r4 = 1000(0x3e8, float:1.401E-42)
            int r8 = r0.f747W
            float r8 = (float) r8
            r1.computeCurrentVelocity(r4, r8)
            r1 = 0
            if (r2 == 0) goto L_0x01a3
            android.view.VelocityTracker r2 = r0.f739O
            int r4 = r0.f738N
            float r2 = r2.getXVelocity(r4)
            float r2 = -r2
            goto L_0x01a4
        L_0x01a3:
            r2 = r1
        L_0x01a4:
            if (r7 == 0) goto L_0x01b0
            android.view.VelocityTracker r4 = r0.f739O
            int r7 = r0.f738N
            float r4 = r4.getYVelocity(r7)
            float r4 = -r4
            goto L_0x01b1
        L_0x01b0:
            r4 = r1
        L_0x01b1:
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x01bf
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01ba
            goto L_0x01bf
        L_0x01ba:
            r5 = r0
            r16 = r10
            goto L_0x03a5
        L_0x01bf:
            int r1 = (int) r2
            int r2 = (int) r4
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f772n
            if (r4 != 0) goto L_0x01cb
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r12, r1)
            goto L_0x01f4
        L_0x01cb:
            boolean r7 = r0.f793y
            if (r7 == 0) goto L_0x01d0
            goto L_0x01f4
        L_0x01d0:
            boolean r4 = r4.mo919e()
            androidx.recyclerview.widget.RecyclerView$l r7 = r0.f772n
            boolean r7 = r7.mo921f()
            if (r4 == 0) goto L_0x01e4
            int r8 = java.lang.Math.abs(r1)
            int r9 = r0.f746V
            if (r8 >= r9) goto L_0x01e5
        L_0x01e4:
            r1 = r3
        L_0x01e5:
            if (r7 == 0) goto L_0x01ef
            int r8 = java.lang.Math.abs(r2)
            int r9 = r0.f746V
            if (r8 >= r9) goto L_0x01f0
        L_0x01ef:
            r2 = r3
        L_0x01f0:
            if (r1 != 0) goto L_0x01f9
            if (r2 != 0) goto L_0x01f9
        L_0x01f4:
            r5 = r0
            r16 = r10
            goto L_0x03a2
        L_0x01f9:
            float r8 = (float) r1
            float r9 = (float) r2
            boolean r11 = r0.dispatchNestedPreFling(r8, r9)
            if (r11 != 0) goto L_0x039e
            if (r4 != 0) goto L_0x0207
            if (r7 == 0) goto L_0x0206
            goto L_0x0207
        L_0x0206:
            r6 = r3
        L_0x0207:
            r0.dispatchNestedFling(r8, r9, r6)
            androidx.recyclerview.widget.RecyclerView$n r8 = r0.f745U
            if (r8 == 0) goto L_0x0338
            b.u.c.z r8 = (p009b.p121u.p122c.C1764z) r8
            androidx.recyclerview.widget.RecyclerView r9 = r8.f5370a
            androidx.recyclerview.widget.RecyclerView$l r9 = r9.getLayoutManager()
            if (r9 != 0) goto L_0x0219
            goto L_0x0221
        L_0x0219:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f5370a
            androidx.recyclerview.widget.RecyclerView$d r11 = r11.getAdapter()
            if (r11 != 0) goto L_0x0229
        L_0x0221:
            r21 = r4
            r18 = r7
            r16 = r10
            goto L_0x0332
        L_0x0229:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f5370a
            int r11 = r11.getMinFlingVelocity()
            int r12 = java.lang.Math.abs(r2)
            if (r12 > r11) goto L_0x0244
            int r12 = java.lang.Math.abs(r1)
            if (r12 <= r11) goto L_0x023c
            goto L_0x0244
        L_0x023c:
            r21 = r4
            r18 = r7
            r16 = r10
            goto L_0x0331
        L_0x0244:
            boolean r11 = r9 instanceof androidx.recyclerview.widget.RecyclerView.C0150v.C0152b
            if (r11 != 0) goto L_0x0249
            goto L_0x025b
        L_0x0249:
            b.u.c.u r8 = (p009b.p121u.p122c.C1758u) r8
            if (r11 != 0) goto L_0x024e
            goto L_0x0259
        L_0x024e:
            b.u.c.t r5 = new b.u.c.t
            androidx.recyclerview.widget.RecyclerView r12 = r8.f5370a
            android.content.Context r12 = r12.getContext()
            r5.<init>(r8, r12)
        L_0x0259:
            if (r5 != 0) goto L_0x0263
        L_0x025b:
            r21 = r4
            r18 = r7
            r16 = r10
            goto L_0x032d
        L_0x0263:
            int r3 = r9.mo1145J()
            if (r3 != 0) goto L_0x026a
            goto L_0x0283
        L_0x026a:
            boolean r12 = r9.mo921f()
            if (r12 == 0) goto L_0x0275
            b.u.c.s r12 = r8.mo4949f(r9)
            goto L_0x0281
        L_0x0275:
            boolean r12 = r9.mo919e()
            if (r12 == 0) goto L_0x0280
            b.u.c.s r12 = r8.mo4948e(r9)
            goto L_0x0281
        L_0x0280:
            r12 = 0
        L_0x0281:
            if (r12 != 0) goto L_0x028b
        L_0x0283:
            r21 = r4
            r18 = r7
            r16 = r10
            goto L_0x0321
        L_0x028b:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            int r15 = r9.mo1186y()
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = r4
            r0 = r17
            r4 = r18
            r19 = r16
            r16 = r10
            r10 = r19
        L_0x02a6:
            if (r4 >= r15) goto L_0x02ca
            r17 = r15
            android.view.View r15 = r9.mo1184x(r4)
            r18 = r7
            if (r15 != 0) goto L_0x02b3
            goto L_0x02c3
        L_0x02b3:
            int r7 = r8.mo4946c(r15, r12)
            if (r7 > 0) goto L_0x02bd
            if (r7 <= r13) goto L_0x02bd
            r13 = r7
            r0 = r15
        L_0x02bd:
            if (r7 < 0) goto L_0x02c3
            if (r7 >= r14) goto L_0x02c3
            r14 = r7
            r10 = r15
        L_0x02c3:
            int r4 = r4 + 1
            r15 = r17
            r7 = r18
            goto L_0x02a6
        L_0x02ca:
            r18 = r7
            boolean r4 = r9.mo919e()
            if (r4 == 0) goto L_0x02d5
            if (r1 <= 0) goto L_0x02d9
            goto L_0x02d7
        L_0x02d5:
            if (r2 <= 0) goto L_0x02d9
        L_0x02d7:
            r4 = 1
            goto L_0x02da
        L_0x02d9:
            r4 = 0
        L_0x02da:
            if (r4 == 0) goto L_0x02e3
            if (r10 == 0) goto L_0x02e3
            int r0 = r9.mo1157R(r10)
            goto L_0x0322
        L_0x02e3:
            if (r4 != 0) goto L_0x02ec
            if (r0 == 0) goto L_0x02ec
            int r0 = r9.mo1157R(r0)
            goto L_0x0322
        L_0x02ec:
            if (r4 == 0) goto L_0x02ef
            r10 = r0
        L_0x02ef:
            if (r10 != 0) goto L_0x02f2
            goto L_0x0321
        L_0x02f2:
            int r0 = r9.mo1157R(r10)
            int r7 = r9.mo1145J()
            if (r11 == 0) goto L_0x0316
            r8 = r9
            androidx.recyclerview.widget.RecyclerView$v$b r8 = (androidx.recyclerview.widget.RecyclerView.C0150v.C0152b) r8
            int r7 = r7 + -1
            android.graphics.PointF r7 = r8.mo914a(r7)
            if (r7 == 0) goto L_0x0316
            float r8 = r7.x
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x0314
            float r7 = r7.y
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0316
        L_0x0314:
            r7 = 1
            goto L_0x0317
        L_0x0316:
            r7 = 0
        L_0x0317:
            if (r7 != r4) goto L_0x031b
            r4 = -1
            goto L_0x031c
        L_0x031b:
            r4 = 1
        L_0x031c:
            int r0 = r0 + r4
            if (r0 < 0) goto L_0x0321
            if (r0 < r3) goto L_0x0322
        L_0x0321:
            r0 = -1
        L_0x0322:
            r3 = -1
            if (r0 != r3) goto L_0x0327
            r3 = 0
            goto L_0x032d
        L_0x0327:
            r5.f851a = r0
            r9.mo1165X0(r5)
            r3 = 1
        L_0x032d:
            if (r3 == 0) goto L_0x0331
            r3 = 1
            goto L_0x0332
        L_0x0331:
            r3 = 0
        L_0x0332:
            if (r3 == 0) goto L_0x033e
            r3 = 1
            r5 = r20
            goto L_0x03a2
        L_0x0338:
            r21 = r4
            r18 = r7
            r16 = r10
        L_0x033e:
            if (r6 == 0) goto L_0x039b
            if (r18 == 0) goto L_0x0345
            r4 = r21 | 2
            goto L_0x0347
        L_0x0345:
            r4 = r21
        L_0x0347:
            r0 = 1
            r5 = r20
            r5.mo1046m0(r4, r0)
            int r0 = r5.f747W
            int r3 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r9 = java.lang.Math.max(r3, r0)
            int r0 = r5.f747W
            int r1 = -r0
            int r0 = java.lang.Math.min(r2, r0)
            int r10 = java.lang.Math.max(r1, r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r5.f753d0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r2 = 2
            r1.setScrollState(r2)
            r1 = 0
            r0.f881d = r1
            r0.f880c = r1
            android.view.animation.Interpolator r1 = r0.f883f
            android.view.animation.Interpolator r2 = f724z0
            if (r1 == r2) goto L_0x0385
            r0.f883f = r2
            android.widget.OverScroller r1 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r2)
            r0.f882e = r1
        L_0x0385:
            android.widget.OverScroller r6 = r0.f882e
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.mo1228a()
            r3 = 1
            goto L_0x03a2
        L_0x039b:
            r5 = r20
            goto L_0x03a1
        L_0x039e:
            r5 = r0
            r16 = r10
        L_0x03a1:
            r3 = 0
        L_0x03a2:
            if (r3 != 0) goto L_0x03a8
            r3 = 0
        L_0x03a5:
            r5.setScrollState(r3)
        L_0x03a8:
            r20.mo1008f0()
            r0 = 1
            goto L_0x03d3
        L_0x03ad:
            r5 = r0
            r16 = r10
            int r0 = r1.getPointerId(r3)
            r5.f738N = r0
            float r0 = r21.getX()
            float r0 = r0 + r11
            int r0 = (int) r0
            r5.f742R = r0
            r5.f740P = r0
            float r0 = r21.getY()
            float r0 = r0 + r11
            int r0 = (int) r0
            r5.f743S = r0
            r5.f741Q = r0
            if (r7 == 0) goto L_0x03ce
            r2 = r2 | 2
        L_0x03ce:
            r3 = 0
            r5.mo1046m0(r2, r3)
        L_0x03d2:
            r0 = r3
        L_0x03d3:
            if (r0 != 0) goto L_0x03dd
            android.view.VelocityTracker r0 = r5.f739O
            r1 = r16
            r0.addMovement(r1)
            goto L_0x03df
        L_0x03dd:
            r1 = r16
        L_0x03df:
            r1.recycle()
            r0 = 1
            return r0
        L_0x03e4:
            r5 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo1063p(View view) {
        C0156z K = m429K(view);
        mo978T();
        C0123d dVar = this.f770m;
        if (dVar != null && K != null) {
            Objects.requireNonNull(dVar);
        }
    }

    /* renamed from: p0 */
    public void mo1064p0() {
        C0150v vVar;
        setScrollState(0);
        this.f753d0.mo1230c();
        C0134l lVar = this.f772n;
        if (lVar != null && (vVar = lVar.f814g) != null) {
            vVar.mo1222d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f6, code lost:
        if (r15.f758g.mo4867k(getFocusedChild()) == false) goto L_0x03ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1065q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f770m
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "No adapter attached; skipping layout"
            goto L_0x000f
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "No layout manager attached; skipping layout"
        L_0x000f:
            android.util.Log.e(r1, r0)
            return
        L_0x0013:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            r2 = 0
            r0.f874i = r2
            int r0 = r0.f869d
            r3 = 1
            if (r0 != r3) goto L_0x0021
            r15.mo1066r()
            goto L_0x0053
        L_0x0021:
            b.u.c.a r0 = r15.f756f
            java.util.ArrayList<b.u.c.a$b> r4 = r0.f5212c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0035
            java.util.ArrayList<b.u.c.a$b> r0 = r0.f5211b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 != 0) goto L_0x0053
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            int r0 = r0.f823p
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x0053
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            int r0 = r0.f824q
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            r0.mo1153O0(r15)
            goto L_0x005b
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            r0.mo1153O0(r15)
            r15.mo1072s()
        L_0x005b:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            r4 = 4
            r0.mo1225a(r4)
            r15.mo1044l0()
            r15.mo979U()
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            r0.f869d = r3
            boolean r0 = r0.f875j
            r5 = 0
            if (r0 == 0) goto L_0x025a
            b.u.c.b r0 = r15.f758g
            int r0 = r0.mo4861e()
            int r0 = r0 - r3
        L_0x0077:
            if (r0 < 0) goto L_0x01a3
            b.u.c.b r6 = r15.f758g
            android.view.View r6 = r6.mo4860d(r0)
            androidx.recyclerview.widget.RecyclerView$z r6 = m429K(r6)
            boolean r7 = r6.mo1251t()
            if (r7 == 0) goto L_0x008b
            goto L_0x019e
        L_0x008b:
            long r7 = r15.mo968I(r6)
            androidx.recyclerview.widget.RecyclerView$i r9 = r15.f736L
            java.util.Objects.requireNonNull(r9)
            androidx.recyclerview.widget.RecyclerView$i$c r9 = new androidx.recyclerview.widget.RecyclerView$i$c
            r9.<init>()
            android.view.View r10 = r6.f888a
            int r11 = r10.getLeft()
            r9.f805a = r11
            int r11 = r10.getTop()
            r9.f806b = r11
            r10.getRight()
            r10.getBottom()
            b.u.c.b0 r10 = r15.f760h
            b.g.e<androidx.recyclerview.widget.RecyclerView$z> r10 = r10.f5232b
            java.lang.Object r10 = r10.mo3691f(r7, r5)
            androidx.recyclerview.widget.RecyclerView$z r10 = (androidx.recyclerview.widget.RecyclerView.C0156z) r10
            if (r10 == 0) goto L_0x0199
            boolean r11 = r10.mo1251t()
            if (r11 != 0) goto L_0x0199
            b.u.c.b0 r11 = r15.f760h
            boolean r11 = r11.mo4882d(r10)
            b.u.c.b0 r12 = r15.f760h
            boolean r12 = r12.mo4882d(r6)
            if (r11 == 0) goto L_0x00d1
            if (r10 != r6) goto L_0x00d1
            goto L_0x0199
        L_0x00d1:
            b.u.c.b0 r13 = r15.f760h
            androidx.recyclerview.widget.RecyclerView$i$c r4 = r13.mo4883e(r10, r4)
            b.u.c.b0 r13 = r15.f760h
            r13.mo4880b(r6, r9)
            b.u.c.b0 r9 = r15.f760h
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$i$c r9 = r9.mo4883e(r6, r13)
            if (r4 != 0) goto L_0x016f
            b.u.c.b r4 = r15.f758g
            int r4 = r4.mo4861e()
            r9 = r2
        L_0x00ed:
            if (r9 >= r4) goto L_0x014b
            b.u.c.b r11 = r15.f758g
            android.view.View r11 = r11.mo4860d(r9)
            androidx.recyclerview.widget.RecyclerView$z r11 = m429K(r11)
            if (r11 != r6) goto L_0x00fc
            goto L_0x0148
        L_0x00fc:
            long r12 = r15.mo968I(r11)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0148
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f770m
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x012b
            boolean r0 = r0.f798b
            if (r0 == 0) goto L_0x012b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = p133c.p149b.p152b.p153a.C2108a.m4994d(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = p133c.p149b.p152b.p153a.C2108a.m4994d(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0148:
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x014b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r4.append(r7)
            r4.append(r10)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r6 = r15.mo961A()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r1, r4)
            goto L_0x019e
        L_0x016f:
            r10.mo1250s(r2)
            if (r11 == 0) goto L_0x0177
            r15.mo1007f(r10)
        L_0x0177:
            if (r10 == r6) goto L_0x018d
            if (r12 == 0) goto L_0x017e
            r15.mo1007f(r6)
        L_0x017e:
            r10.f895h = r6
            r15.mo1007f(r10)
            androidx.recyclerview.widget.RecyclerView$r r7 = r15.f752d
            r7.mo1213k(r10)
            r6.mo1250s(r2)
            r6.f896i = r10
        L_0x018d:
            androidx.recyclerview.widget.RecyclerView$i r7 = r15.f736L
            boolean r4 = r7.mo1119a(r10, r6, r4, r9)
            if (r4 == 0) goto L_0x019e
            r15.mo984Z()
            goto L_0x019e
        L_0x0199:
            b.u.c.b0 r4 = r15.f760h
            r4.mo4880b(r6, r9)
        L_0x019e:
            int r0 = r0 + -1
            r4 = 4
            goto L_0x0077
        L_0x01a3:
            b.u.c.b0 r0 = r15.f760h
            b.u.c.b0$b r1 = r15.f791w0
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r4 = r0.f5231a
            int r4 = r4.f3755e
        L_0x01ab:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x025a
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r5 = r0.f5231a
            java.lang.Object r5 = r5.mo3770h(r4)
            r7 = r5
            androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0156z) r7
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r5 = r0.f5231a
            java.lang.Object r5 = r5.mo3772i(r4)
            b.u.c.b0$a r5 = (p009b.p121u.p122c.C1727b0.C1728a) r5
            int r6 = r5.f5234a
            r8 = r6 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01c8
            goto L_0x01d0
        L_0x01c8:
            r8 = r6 & 1
            if (r8 == 0) goto L_0x01e3
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f5235b
            if (r6 != 0) goto L_0x01e0
        L_0x01d0:
            r6 = r1
            androidx.recyclerview.widget.RecyclerView$c r6 = (androidx.recyclerview.widget.RecyclerView.C0122c) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$l r8 = r6.f772n
            android.view.View r7 = r7.f888a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.f752d
            r8.mo1140G0(r7, r6)
            goto L_0x0255
        L_0x01e0:
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f5236c
            goto L_0x0240
        L_0x01e3:
            r8 = r6 & 14
            r9 = 14
            if (r8 != r9) goto L_0x01eb
            goto L_0x024b
        L_0x01eb:
            r8 = r6 & 12
            r9 = 12
            if (r8 != r9) goto L_0x0239
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f5235b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f5236c
            r12 = r1
            androidx.recyclerview.widget.RecyclerView$c r12 = (androidx.recyclerview.widget.RecyclerView.C0122c) r12
            java.util.Objects.requireNonNull(r12)
            r7.mo1250s(r2)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.f727C
            androidx.recyclerview.widget.RecyclerView$i r9 = r9.f736L
            if (r10 == 0) goto L_0x020d
            boolean r6 = r9.mo1119a(r7, r7, r6, r8)
            if (r6 == 0) goto L_0x0255
            goto L_0x0233
        L_0x020d:
            b.u.c.y r9 = (p009b.p121u.p122c.C1763y) r9
            java.util.Objects.requireNonNull(r9)
            int r10 = r6.f805a
            int r11 = r8.f805a
            if (r10 != r11) goto L_0x0224
            int r13 = r6.f806b
            int r14 = r8.f806b
            if (r13 == r14) goto L_0x021f
            goto L_0x0224
        L_0x021f:
            r9.mo1120c(r7)
            r6 = r2
            goto L_0x0231
        L_0x0224:
            int r13 = r6.f806b
            int r14 = r8.f806b
            r6 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r14
            boolean r6 = r6.mo4901i(r7, r8, r9, r10, r11)
        L_0x0231:
            if (r6 == 0) goto L_0x0255
        L_0x0233:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.mo984Z()
            goto L_0x0255
        L_0x0239:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x0247
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f5235b
            r8 = 0
        L_0x0240:
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.C0122c) r9
            r9.mo1109b(r7, r6, r8)
            goto L_0x0255
        L_0x0247:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0255
        L_0x024b:
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f5235b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f5236c
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.C0122c) r9
            r9.mo1108a(r7, r6, r8)
        L_0x0255:
            p009b.p121u.p122c.C1727b0.C1728a.m4231b(r5)
            goto L_0x01ab
        L_0x025a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            androidx.recyclerview.widget.RecyclerView$r r1 = r15.f752d
            r0.mo1138F0(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            int r1 = r0.f870e
            r0.f867b = r1
            r15.f727C = r2
            r15.f728D = r2
            r0.f875j = r2
            r0.f876k = r2
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            r0.f815h = r2
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f752d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f842b
            if (r0 == 0) goto L_0x027c
            r0.clear()
        L_0x027c:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            boolean r1 = r0.f820m
            if (r1 == 0) goto L_0x028b
            r0.f819l = r2
            r0.f820m = r2
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f752d
            r0.mo1214l()
        L_0x028b:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f772n
            androidx.recyclerview.widget.RecyclerView$w r1 = r15.f759g0
            r0.mo897v0(r1)
            r15.mo980V(r3)
            r15.mo1048n0(r2)
            b.u.c.b0 r0 = r15.f760h
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r1 = r0.f5231a
            r1.clear()
            b.g.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f5232b
            r0.mo3686b()
            int[] r0 = r15.f777p0
            r1 = r0[r2]
            r4 = r0[r3]
            r15.mo965E(r0)
            int[] r0 = r15.f777p0
            r5 = r0[r2]
            if (r5 != r1) goto L_0x02b9
            r0 = r0[r3]
            if (r0 == r4) goto L_0x02b8
            goto L_0x02b9
        L_0x02b8:
            r3 = r2
        L_0x02b9:
            if (r3 == 0) goto L_0x02be
            r15.mo1101v(r2, r2)
        L_0x02be:
            boolean r0 = r15.f751c0
            r3 = -1
            if (r0 == 0) goto L_0x03ba
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f770m
            if (r0 == 0) goto L_0x03ba
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x03ba
            int r0 = r15.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x03ba
            int r0 = r15.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x02e6
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x02e6
            goto L_0x03ba
        L_0x02e6:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x02fa
            android.view.View r0 = r15.getFocusedChild()
            b.u.c.b r1 = r15.f758g
            boolean r0 = r1.mo4867k(r0)
            if (r0 != 0) goto L_0x02fa
            goto L_0x03ba
        L_0x02fa:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            long r0 = r0.f878m
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x033f
            androidx.recyclerview.widget.RecyclerView$d r5 = r15.f770m
            boolean r5 = r5.f798b
            if (r5 == 0) goto L_0x033f
            if (r5 != 0) goto L_0x030c
            r0 = 0
            goto L_0x033d
        L_0x030c:
            b.u.c.b r5 = r15.f758g
            int r5 = r5.mo4864h()
            r6 = 0
            r7 = r2
        L_0x0314:
            if (r7 >= r5) goto L_0x033c
            b.u.c.b r8 = r15.f758g
            android.view.View r8 = r8.mo4863g(r7)
            androidx.recyclerview.widget.RecyclerView$z r8 = m429K(r8)
            if (r8 == 0) goto L_0x0339
            boolean r9 = r8.mo1243l()
            if (r9 != 0) goto L_0x0339
            long r9 = r8.f892e
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0339
            b.u.c.b r6 = r15.f758g
            android.view.View r9 = r8.f888a
            boolean r6 = r6.mo4867k(r9)
            if (r6 == 0) goto L_0x0340
            r6 = r8
        L_0x0339:
            int r7 = r7 + 1
            goto L_0x0314
        L_0x033c:
            r0 = r6
        L_0x033d:
            r8 = r0
            goto L_0x0340
        L_0x033f:
            r8 = 0
        L_0x0340:
            if (r8 == 0) goto L_0x0358
            b.u.c.b r0 = r15.f758g
            android.view.View r1 = r8.f888a
            boolean r0 = r0.mo4867k(r1)
            if (r0 != 0) goto L_0x0358
            android.view.View r0 = r8.f888a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0355
            goto L_0x0358
        L_0x0355:
            android.view.View r0 = r8.f888a
            goto L_0x039f
        L_0x0358:
            b.u.c.b r0 = r15.f758g
            int r0 = r0.mo4861e()
            if (r0 <= 0) goto L_0x039e
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            int r1 = r0.f877l
            r5 = -1
            if (r1 == r5) goto L_0x0368
            r2 = r1
        L_0x0368:
            int r0 = r0.mo1226b()
            r1 = r2
        L_0x036d:
            if (r1 >= r0) goto L_0x0384
            androidx.recyclerview.widget.RecyclerView$z r5 = r15.mo966G(r1)
            if (r5 != 0) goto L_0x0376
            goto L_0x0384
        L_0x0376:
            android.view.View r6 = r5.f888a
            boolean r6 = r6.hasFocusable()
            if (r6 == 0) goto L_0x0381
            android.view.View r0 = r5.f888a
            goto L_0x039f
        L_0x0381:
            int r1 = r1 + 1
            goto L_0x036d
        L_0x0384:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x0388:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x039e
            androidx.recyclerview.widget.RecyclerView$z r1 = r15.mo966G(r0)
            if (r1 != 0) goto L_0x0393
            goto L_0x039e
        L_0x0393:
            android.view.View r2 = r1.f888a
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x0388
            android.view.View r0 = r1.f888a
            goto L_0x039f
        L_0x039e:
            r0 = 0
        L_0x039f:
            if (r0 == 0) goto L_0x03ba
            androidx.recyclerview.widget.RecyclerView$w r1 = r15.f759g0
            int r1 = r1.f879n
            long r5 = (long) r1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x03b7
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x03b7
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x03b7
            r0 = r1
        L_0x03b7:
            r0.requestFocus()
        L_0x03ba:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f759g0
            r0.f878m = r3
            r1 = -1
            r0.f877l = r1
            r0.f879n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1065q():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[EDGE_INSN: B:99:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:100:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:101:0x00a2->B:38:0x00a2 ?: BREAK  ] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1066r() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r1 = 1
            r0.mo1225a(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r10.mo962B(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r2 = 0
            r0.f874i = r2
            r10.mo1044l0()
            b.u.c.b0 r0 = r10.f760h
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r3 = r0.f5231a
            r3.clear()
            b.g.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f5232b
            r0.mo3686b()
            r10.mo979U()
            r10.mo985a0()
            boolean r0 = r10.f751c0
            r3 = 0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r10.hasFocus()
            if (r0 == 0) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView$d r0 = r10.f770m
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r10.getFocusedChild()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r0 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            android.view.View r0 = r10.mo963C(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0049
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView$z r0 = r10.mo969J(r0)
        L_0x0049:
            r4 = -1
            r6 = -1
            if (r0 != 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r0.f878m = r4
            r0.f877l = r6
            r0.f879n = r6
            goto L_0x00a4
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$w r7 = r10.f759g0
            androidx.recyclerview.widget.RecyclerView$d r8 = r10.f770m
            boolean r8 = r8.f798b
            if (r8 == 0) goto L_0x0061
            long r4 = r0.f892e
        L_0x0061:
            r7.f878m = r4
            boolean r4 = r10.f727C
            if (r4 == 0) goto L_0x0068
            goto L_0x0075
        L_0x0068:
            boolean r4 = r0.mo1243l()
            if (r4 == 0) goto L_0x0071
            int r4 = r0.f891d
            goto L_0x007b
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView r4 = r0.f905r
            if (r4 != 0) goto L_0x0077
        L_0x0075:
            r4 = r6
            goto L_0x007b
        L_0x0077:
            int r4 = r4.mo967H(r0)
        L_0x007b:
            r7.f877l = r4
            androidx.recyclerview.widget.RecyclerView$w r4 = r10.f759g0
            android.view.View r0 = r0.f888a
        L_0x0081:
            int r5 = r0.getId()
        L_0x0085:
            boolean r7 = r0.isFocused()
            if (r7 != 0) goto L_0x00a2
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r0.hasFocus()
            if (r7 == 0) goto L_0x00a2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getFocusedChild()
            int r7 = r0.getId()
            if (r7 == r6) goto L_0x0085
            goto L_0x0081
        L_0x00a2:
            r4.f879n = r5
        L_0x00a4:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            boolean r4 = r0.f875j
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r10.f767k0
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = r2
        L_0x00b1:
            r0.f873h = r4
            r10.f767k0 = r2
            r10.f765j0 = r2
            boolean r4 = r0.f876k
            r0.f872g = r4
            androidx.recyclerview.widget.RecyclerView$d r4 = r10.f770m
            int r4 = r4.mo1110a()
            r0.f870e = r4
            int[] r0 = r10.f777p0
            r10.mo965E(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            boolean r0 = r0.f875j
            if (r0 == 0) goto L_0x0131
            b.u.c.b r0 = r10.f758g
            int r0 = r0.mo4861e()
            r4 = r2
        L_0x00d5:
            if (r4 >= r0) goto L_0x0131
            b.u.c.b r5 = r10.f758g
            android.view.View r5 = r5.mo4860d(r4)
            androidx.recyclerview.widget.RecyclerView$z r5 = m429K(r5)
            boolean r7 = r5.mo1251t()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.mo1241j()
            if (r7 == 0) goto L_0x00f4
            androidx.recyclerview.widget.RecyclerView$d r7 = r10.f770m
            boolean r7 = r7.f798b
            if (r7 != 0) goto L_0x00f4
            goto L_0x012e
        L_0x00f4:
            androidx.recyclerview.widget.RecyclerView$i r7 = r10.f736L
            androidx.recyclerview.widget.RecyclerView.C0128i.m506b(r5)
            r5.mo1237f()
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r7.mo1125h(r5)
            b.u.c.b0 r8 = r10.f760h
            r8.mo4881c(r5, r7)
            androidx.recyclerview.widget.RecyclerView$w r7 = r10.f759g0
            boolean r7 = r7.f873h
            if (r7 == 0) goto L_0x012e
            boolean r7 = r5.mo1246o()
            if (r7 == 0) goto L_0x012e
            boolean r7 = r5.mo1243l()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.mo1251t()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.mo1241j()
            if (r7 != 0) goto L_0x012e
            long r7 = r10.mo968I(r5)
            b.u.c.b0 r9 = r10.f760h
            b.g.e<androidx.recyclerview.widget.RecyclerView$z> r9 = r9.f5232b
            r9.mo3693h(r7, r5)
        L_0x012e:
            int r4 = r4 + 1
            goto L_0x00d5
        L_0x0131:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            boolean r0 = r0.f876k
            r4 = 2
            if (r0 == 0) goto L_0x01d5
            b.u.c.b r0 = r10.f758g
            int r0 = r0.mo4864h()
            r5 = r2
        L_0x013f:
            if (r5 >= r0) goto L_0x015c
            b.u.c.b r7 = r10.f758g
            android.view.View r7 = r7.mo4863g(r5)
            androidx.recyclerview.widget.RecyclerView$z r7 = m429K(r7)
            boolean r8 = r7.mo1251t()
            if (r8 != 0) goto L_0x0159
            int r8 = r7.f891d
            if (r8 != r6) goto L_0x0159
            int r8 = r7.f890c
            r7.f891d = r8
        L_0x0159:
            int r5 = r5 + 1
            goto L_0x013f
        L_0x015c:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            boolean r5 = r0.f871f
            r0.f871f = r2
            androidx.recyclerview.widget.RecyclerView$l r6 = r10.f772n
            androidx.recyclerview.widget.RecyclerView$r r7 = r10.f752d
            r6.mo895u0(r7, r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r0.f871f = r5
            r0 = r2
        L_0x016e:
            b.u.c.b r5 = r10.f758g
            int r5 = r5.mo4861e()
            if (r0 >= r5) goto L_0x01d5
            b.u.c.b r5 = r10.f758g
            android.view.View r5 = r5.mo4860d(r0)
            androidx.recyclerview.widget.RecyclerView$z r5 = m429K(r5)
            boolean r6 = r5.mo1251t()
            if (r6 == 0) goto L_0x0187
            goto L_0x01d2
        L_0x0187:
            b.u.c.b0 r6 = r10.f760h
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r6 = r6.f5231a
            java.lang.Object r6 = r6.getOrDefault(r5, r3)
            b.u.c.b0$a r6 = (p009b.p121u.p122c.C1727b0.C1728a) r6
            if (r6 == 0) goto L_0x019b
            int r6 = r6.f5234a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x019b
            r6 = r1
            goto L_0x019c
        L_0x019b:
            r6 = r2
        L_0x019c:
            if (r6 != 0) goto L_0x01d2
            androidx.recyclerview.widget.RecyclerView.C0128i.m506b(r5)
            r6 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r5.mo1238g(r6)
            androidx.recyclerview.widget.RecyclerView$i r7 = r10.f736L
            r5.mo1237f()
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r7.mo1125h(r5)
            if (r6 == 0) goto L_0x01b6
            r10.mo988c0(r5, r7)
            goto L_0x01d2
        L_0x01b6:
            b.u.c.b0 r6 = r10.f760h
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r8 = r6.f5231a
            java.lang.Object r8 = r8.getOrDefault(r5, r3)
            b.u.c.b0$a r8 = (p009b.p121u.p122c.C1727b0.C1728a) r8
            if (r8 != 0) goto L_0x01cb
            b.u.c.b0$a r8 = p009b.p121u.p122c.C1727b0.C1728a.m4230a()
            b.g.h<androidx.recyclerview.widget.RecyclerView$z, b.u.c.b0$a> r6 = r6.f5231a
            r6.put(r5, r8)
        L_0x01cb:
            int r5 = r8.f5234a
            r5 = r5 | r4
            r8.f5234a = r5
            r8.f5235b = r7
        L_0x01d2:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x01d5:
            r10.mo1043l()
            r10.mo980V(r1)
            r10.mo1048n0(r2)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f759g0
            r0.f869d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1066r():void");
    }

    public void removeDetachedView(View view, boolean z) {
        C0156z K = m429K(view);
        if (K != null) {
            if (K.mo1245n()) {
                K.f897j &= -257;
            } else if (!K.mo1251t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K);
                throw new IllegalArgumentException(C2108a.m4994d(this, sb));
            }
        }
        view.clearAnimation();
        mo1063p(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f772n.mo1187y0(this, view, view2) && view2 != null) {
            mo1006e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f772n.mo1146J0(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f778q.size();
        for (int i = 0; i < size; i++) {
            this.f778q.get(i).mo1198c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f790w != 0 || this.f793y) {
            this.f792x = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void mo1072s() {
        mo1044l0();
        mo979U();
        this.f759g0.mo1225a(6);
        this.f756f.mo4839c();
        this.f759g0.f870e = this.f770m.mo1110a();
        C0153w wVar = this.f759g0;
        wVar.f868c = 0;
        wVar.f872g = false;
        this.f772n.mo895u0(this.f752d, wVar);
        C0153w wVar2 = this.f759g0;
        wVar2.f871f = false;
        this.f754e = null;
        wVar2.f875j = wVar2.f875j && this.f736L != null;
        wVar2.f869d = 4;
        mo980V(true);
        mo1048n0(false);
    }

    public void scrollBy(int i, int i2) {
        C0134l lVar = this.f772n;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f793y) {
            boolean e = lVar.mo919e();
            boolean f = this.f772n.mo921f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                mo1011g0(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo973O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.f725A |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1761x xVar) {
        this.f773n0 = xVar;
        C1496p.m3610p(this, xVar);
    }

    public void setAdapter(C0123d dVar) {
        setLayoutFrozen(false);
        C0123d dVar2 = this.f770m;
        if (dVar2 != null) {
            dVar2.f797a.unregisterObserver(this.f750c);
            Objects.requireNonNull(this.f770m);
        }
        mo996d0();
        C1718a aVar = this.f756f;
        aVar.mo4848l(aVar.f5211b);
        aVar.mo4848l(aVar.f5212c);
        C0123d dVar3 = this.f770m;
        this.f770m = dVar;
        if (dVar != null) {
            dVar.f797a.registerObserver(this.f750c);
        }
        C0134l lVar = this.f772n;
        if (lVar != null) {
            lVar.mo1172d0();
        }
        C0145r rVar = this.f752d;
        C0123d dVar4 = this.f770m;
        rVar.mo1204b();
        C0143q d = rVar.mo1206d();
        Objects.requireNonNull(d);
        if (dVar3 != null) {
            d.f836b--;
        }
        if (d.f836b == 0) {
            for (int i = 0; i < d.f835a.size(); i++) {
                d.f835a.valueAt(i).f837a.clear();
            }
        }
        if (dVar4 != null) {
            d.f836b++;
        }
        this.f759g0.f871f = true;
        mo987b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0126g gVar) {
        if (gVar != this.f775o0) {
            this.f775o0 = gVar;
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f762i) {
            mo972N();
        }
        this.f762i = z;
        super.setClipToPadding(z);
        if (this.f788v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0127h hVar) {
        Objects.requireNonNull(hVar);
        this.f731G = hVar;
        mo972N();
    }

    public void setHasFixedSize(boolean z) {
        this.f784t = z;
    }

    public void setItemAnimator(C0128i iVar) {
        C0128i iVar2 = this.f736L;
        if (iVar2 != null) {
            iVar2.mo1123f();
            this.f736L.f799a = null;
        }
        this.f736L = iVar;
        if (iVar != null) {
            iVar.f799a = this.f769l0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0145r rVar = this.f752d;
        rVar.f845e = i;
        rVar.mo1214l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0134l lVar) {
        if (lVar != this.f772n) {
            mo1064p0();
            if (this.f772n != null) {
                C0128i iVar = this.f736L;
                if (iVar != null) {
                    iVar.mo1123f();
                }
                this.f772n.mo1136E0(this.f752d);
                this.f772n.mo1138F0(this.f752d);
                this.f752d.mo1204b();
                if (this.f782s) {
                    C0134l lVar2 = this.f772n;
                    C0145r rVar = this.f752d;
                    lVar2.f816i = false;
                    lVar2.mo924h0(this, rVar);
                }
                this.f772n.mo1159S0((RecyclerView) null);
                this.f772n = null;
            } else {
                this.f752d.mo1204b();
            }
            C1724b bVar = this.f758g;
            C1724b.C1725a aVar = bVar.f5227b;
            aVar.f5229a = 0;
            C1724b.C1725a aVar2 = aVar.f5230b;
            if (aVar2 != null) {
                aVar2.mo4876g();
            }
            int size = bVar.f5228c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1759v vVar = (C1759v) bVar.f5226a;
                Objects.requireNonNull(vVar);
                C0156z K = m429K(bVar.f5228c.get(size));
                if (K != null) {
                    vVar.f5363a.mo1041j0(K, K.f903p);
                    K.f903p = 0;
                }
                bVar.f5228c.remove(size);
            }
            C1759v vVar2 = (C1759v) bVar.f5226a;
            int b = vVar2.mo4951b();
            for (int i = 0; i < b; i++) {
                View a = vVar2.mo4950a(i);
                vVar2.f5363a.mo1063p(a);
                a.clearAnimation();
            }
            vVar2.f5363a.removeAllViews();
            this.f772n = lVar;
            if (lVar != null) {
                if (lVar.f809b == null) {
                    lVar.mo1159S0(this);
                    if (this.f782s) {
                        C0134l lVar3 = this.f772n;
                        lVar3.f816i = true;
                        lVar3.mo1174f0();
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(C2108a.m4994d(lVar.f809b, sb));
                }
            }
            this.f752d.mo1214l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1487g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4576d) {
            View view = scrollingChildHelper.f4575c;
            AtomicInteger atomicInteger = C1496p.f4584a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f4576d = z;
    }

    public void setOnFlingListener(C0140n nVar) {
        this.f745U = nVar;
    }

    @Deprecated
    public void setOnScrollListener(C0142p pVar) {
        this.f761h0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f751c0 = z;
    }

    public void setRecycledViewPool(C0143q qVar) {
        C0145r rVar = this.f752d;
        C0143q qVar2 = rVar.f847g;
        if (qVar2 != null) {
            qVar2.f836b--;
        }
        rVar.f847g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f847g.f836b++;
        }
    }

    public void setRecyclerListener(C0146s sVar) {
        this.f774o = sVar;
    }

    public void setScrollState(int i) {
        C0150v vVar;
        if (i != this.f737M) {
            this.f737M = i;
            if (i != 2) {
                this.f753d0.mo1230c();
                C0134l lVar = this.f772n;
                if (!(lVar == null || (vVar = lVar.f814g) == null)) {
                    vVar.mo1222d();
                }
            }
            C0134l lVar2 = this.f772n;
            if (lVar2 != null) {
                lVar2.mo1130B0(i);
            }
            mo982X();
            C0142p pVar = this.f761h0;
            if (pVar != null) {
                pVar.mo1199a(this, i);
            }
            List<C0142p> list = this.f763i0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.f763i0.get(size).mo1199a(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f744T = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f744T = i2;
    }

    public void setViewCacheExtension(C0154x xVar) {
        Objects.requireNonNull(this.f752d);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo4270i(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo4271j(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f793y) {
            mo1035i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f793y = false;
                if (!(!this.f792x || this.f772n == null || this.f770m == null)) {
                    requestLayout();
                }
                this.f792x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f793y = true;
            this.f794z = true;
            mo1064p0();
        }
    }

    /* renamed from: t */
    public boolean mo1099t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo4264c(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: u */
    public final void mo1100u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo4267f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: v */
    public void mo1101v(int i, int i2) {
        this.f730F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo983Y();
        C0142p pVar = this.f761h0;
        if (pVar != null) {
            pVar.mo1200b(this, i, i2);
        }
        List<C0142p> list = this.f763i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f763i0.get(size).mo1200b(this, i, i2);
            }
        }
        this.f730F--;
    }

    /* renamed from: w */
    public void mo1102w() {
        int i;
        int i2;
        if (this.f735K == null) {
            EdgeEffect a = this.f731G.mo1118a(this);
            this.f735K = a;
            if (this.f762i) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: x */
    public void mo1103x() {
        int i;
        int i2;
        if (this.f732H == null) {
            EdgeEffect a = this.f731G.mo1118a(this);
            this.f732H = a;
            if (this.f762i) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: y */
    public void mo1104y() {
        int i;
        int i2;
        if (this.f734J == null) {
            EdgeEffect a = this.f731G.mo1118a(this);
            this.f734J = a;
            if (this.f762i) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: z */
    public void mo1105z() {
        int i;
        int i2;
        if (this.f733I == null) {
            EdgeEffect a = this.f731G.mo1118a(this);
            this.f733I = a;
            if (this.f762i) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }
}
