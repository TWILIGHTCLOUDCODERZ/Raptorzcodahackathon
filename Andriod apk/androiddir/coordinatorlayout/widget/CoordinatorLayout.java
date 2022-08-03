package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p084j.C1334a;
import p009b.p084j.p085b.C1335a;
import p009b.p084j.p085b.C1336b;
import p009b.p086k.p088c.C1375a;
import p009b.p086k.p097i.C1445c;
import p009b.p086k.p097i.C1446d;
import p009b.p086k.p098j.C1449a0;
import p009b.p086k.p098j.C1488h;
import p009b.p086k.p098j.C1489i;
import p009b.p086k.p098j.C1490j;
import p009b.p086k.p098j.C1491k;
import p009b.p086k.p098j.C1496p;
import p009b.p104m.p105a.C1527a;
import p133c.p149b.p152b.p153a.C2108a;

public class CoordinatorLayout extends ViewGroup implements C1488h, C1489i {

    /* renamed from: A */
    public static final C1445c<Rect> f537A = new C1446d(12);

    /* renamed from: w */
    public static final String f538w;

    /* renamed from: x */
    public static final Class<?>[] f539x = {Context.class, AttributeSet.class};

    /* renamed from: y */
    public static final ThreadLocal<Map<String, Constructor<C0092c>>> f540y = new ThreadLocal<>();

    /* renamed from: z */
    public static final Comparator<View> f541z = new C0099i();

    /* renamed from: c */
    public final List<View> f542c = new ArrayList();

    /* renamed from: d */
    public final C1335a<View> f543d = new C1335a<>();

    /* renamed from: e */
    public final List<View> f544e = new ArrayList();

    /* renamed from: f */
    public final List<View> f545f = new ArrayList();

    /* renamed from: g */
    public Paint f546g;

    /* renamed from: h */
    public final int[] f547h = new int[2];

    /* renamed from: i */
    public final int[] f548i = new int[2];

    /* renamed from: j */
    public boolean f549j;

    /* renamed from: k */
    public boolean f550k;

    /* renamed from: l */
    public int[] f551l;

    /* renamed from: m */
    public View f552m;

    /* renamed from: n */
    public View f553n;

    /* renamed from: o */
    public C0096g f554o;

    /* renamed from: p */
    public boolean f555p;

    /* renamed from: q */
    public C1449a0 f556q;

    /* renamed from: r */
    public boolean f557r;

    /* renamed from: s */
    public Drawable f558s;

    /* renamed from: t */
    public ViewGroup.OnHierarchyChangeListener f559t;

    /* renamed from: u */
    public C1491k f560u;

    /* renamed from: v */
    public final C1490j f561v = new C1490j();

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0090a implements C1491k {
        public C0090a() {
        }

        /* renamed from: a */
        public C1449a0 mo692a(View view, C1449a0 a0Var) {
            C0092c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f556q, a0Var)) {
                coordinatorLayout.f556q = a0Var;
                boolean z = true;
                boolean z2 = a0Var.mo4202d() > 0;
                coordinatorLayout.f557r = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!a0Var.mo4204f()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        AtomicInteger atomicInteger = C1496p.f4584a;
                        if (childAt.getFitsSystemWindows() && (cVar = ((C0095f) childAt.getLayoutParams()).f564a) != null) {
                            a0Var = cVar.mo699e(a0Var);
                            if (a0Var.mo4204f()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return a0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0091b {
        C0092c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0092c<V extends View> {
        public C0092c() {
        }

        public C0092c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo694A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo695a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: b */
        public int mo696b() {
            return -16777216;
        }

        /* renamed from: c */
        public float mo697c() {
            return 0.0f;
        }

        /* renamed from: d */
        public boolean mo698d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: e */
        public C1449a0 mo699e(C1449a0 a0Var) {
            return a0Var;
        }

        /* renamed from: f */
        public void mo700f(C0095f fVar) {
        }

        /* renamed from: g */
        public boolean mo701g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: h */
        public void mo702h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: i */
        public void mo703i() {
        }

        /* renamed from: j */
        public boolean mo704j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: k */
        public boolean mo705k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: l */
        public boolean mo706l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: m */
        public boolean mo707m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo708n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: o */
        public void mo709o() {
        }

        /* renamed from: p */
        public void mo710p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo709o();
            }
        }

        @Deprecated
        /* renamed from: q */
        public void mo711q() {
        }

        /* renamed from: r */
        public void mo712r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                mo711q();
            }
        }

        @Deprecated
        /* renamed from: s */
        public void mo713s() {
        }

        /* renamed from: t */
        public boolean mo714t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: u */
        public void mo715u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: v */
        public Parcelable mo716v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: w */
        public boolean mo717w() {
            return false;
        }

        /* renamed from: x */
        public boolean mo718x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo717w();
            }
            return false;
        }

        @Deprecated
        /* renamed from: y */
        public void mo719y() {
        }

        /* renamed from: z */
        public void mo720z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo719y();
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0093d {
        Class<? extends C0092c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0094e implements ViewGroup.OnHierarchyChangeListener {
        public C0094e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f559t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo674q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f559t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0095f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0092c f564a;

        /* renamed from: b */
        public boolean f565b = false;

        /* renamed from: c */
        public int f566c = 0;

        /* renamed from: d */
        public int f567d = 0;

        /* renamed from: e */
        public int f568e = -1;

        /* renamed from: f */
        public int f569f = -1;

        /* renamed from: g */
        public int f570g = 0;

        /* renamed from: h */
        public int f571h = 0;

        /* renamed from: i */
        public int f572i;

        /* renamed from: j */
        public int f573j;

        /* renamed from: k */
        public View f574k;

        /* renamed from: l */
        public View f575l;

        /* renamed from: m */
        public boolean f576m;

        /* renamed from: n */
        public boolean f577n;

        /* renamed from: o */
        public boolean f578o;

        /* renamed from: p */
        public boolean f579p;

        /* renamed from: q */
        public final Rect f580q = new Rect();

        public C0095f(int i, int i2) {
            super(i, i2);
        }

        public C0095f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0092c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1334a.f4237b);
            this.f566c = obtainStyledAttributes.getInteger(0, 0);
            this.f569f = obtainStyledAttributes.getResourceId(1, -1);
            this.f567d = obtainStyledAttributes.getInteger(2, 0);
            this.f568e = obtainStyledAttributes.getInteger(6, -1);
            this.f570g = obtainStyledAttributes.getInt(5, 0);
            this.f571h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f565b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f538w;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f538w;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<C0092c>>> threadLocal = CoordinatorLayout.f540y;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f539x);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (C0092c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e) {
                        throw new RuntimeException(C2108a.m4997g("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f564a = cVar;
            }
            obtainStyledAttributes.recycle();
            C0092c cVar2 = this.f564a;
            if (cVar2 != null) {
                cVar2.mo700f(this);
            }
        }

        public C0095f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0095f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0095f(C0095f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public boolean mo724a(int i) {
            if (i == 0) {
                return this.f577n;
            }
            if (i != 1) {
                return false;
            }
            return this.f578o;
        }

        /* renamed from: b */
        public void mo725b(int i, boolean z) {
            if (i == 0) {
                this.f577n = z;
            } else if (i == 1) {
                this.f578o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0096g implements ViewTreeObserver.OnPreDrawListener {
        public C0096g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo674q(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0097h extends C1527a {
        public static final Parcelable.Creator<C0097h> CREATOR = new C0098a();

        /* renamed from: e */
        public SparseArray<Parcelable> f582e;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0098a implements Parcelable.ClassLoaderCreator<C0097h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0097h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0097h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0097h(parcel, classLoader);
            }
        }

        public C0097h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f582e = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f582e.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0097h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4660c, i);
            SparseArray<Parcelable> sparseArray = this.f582e;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f582e.keyAt(i2);
                parcelableArr[i2] = this.f582e.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0099i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            float z = ((View) obj).getZ();
            float z2 = ((View) obj2).getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f538w = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f541z = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f539x = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f540y = r0
            b.k.i.d r0 = new b.k.i.d
            r1 = 12
            r0.<init>(r1)
            f537A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = C1334a.f4236a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f551l = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f551l.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f551l;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.f558s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        mo691y();
        super.setOnHierarchyChangeListener(new C0094e());
        AtomicInteger atomicInteger = C1496p.f4584a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static Rect m188a() {
        Rect a = f537A.mo4182a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: b */
    public final void mo637b(C0095f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: c */
    public void mo638c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo644f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0095f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public List<View> mo640d(View view) {
        C1335a<View> aVar = this.f543d;
        int i = aVar.f4239b.f3755e;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList k = aVar.f4239b.mo3775k(i2);
            if (k != null && k.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f4239b.mo3770h(i2));
            }
        }
        this.f545f.clear();
        if (arrayList != null) {
            this.f545f.addAll(arrayList);
        }
        return this.f545f;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0095f fVar = (C0095f) view.getLayoutParams();
        C0092c cVar = fVar.f564a;
        if (cVar != null) {
            float c = cVar.mo697c();
            if (c > 0.0f) {
                if (this.f546g == null) {
                    this.f546g = new Paint();
                }
                this.f546g.setColor(fVar.f564a.mo696b());
                Paint paint = this.f546g;
                int round = Math.round(c * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f546g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f558s;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public List<View> mo643e(View view) {
        List orDefault = this.f543d.f4239b.getOrDefault(view, null);
        this.f545f.clear();
        if (orDefault != null) {
            this.f545f.addAll(orDefault);
        }
        return this.f545f;
    }

    /* renamed from: f */
    public void mo644f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C1336b.f4242a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C1336b.f4242a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1336b.m3279a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C1336b.f4243b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: g */
    public final void mo645g(int i, Rect rect, Rect rect2, C0095f fVar, int i2, int i3) {
        int i4 = fVar.f566c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = fVar.f567d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0095f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0095f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo686u();
        return Collections.unmodifiableList(this.f542c);
    }

    public final C1449a0 getLastWindowInsets() {
        return this.f556q;
    }

    public int getNestedScrollAxes() {
        return this.f561v.mo4272a();
    }

    public Drawable getStatusBarBackground() {
        return this.f558s;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public void mo198h(View view, View view2, int i, int i2) {
        C0092c cVar;
        C1490j jVar = this.f561v;
        if (i2 == 1) {
            jVar.f4579b = i;
        } else {
            jVar.f4578a = i;
        }
        this.f553n = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0095f fVar = (C0095f) getChildAt(i3).getLayoutParams();
            if (fVar.mo724a(i2) && (cVar = fVar.f564a) != null && i2 == 0) {
                cVar.mo713s();
            }
        }
    }

    /* renamed from: i */
    public void mo199i(View view, int i) {
        C1490j jVar = this.f561v;
        if (i == 1) {
            jVar.f4579b = 0;
        } else {
            jVar.f4578a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0095f fVar = (C0095f) childAt.getLayoutParams();
            if (fVar.mo724a(i)) {
                C0092c cVar = fVar.f564a;
                if (cVar != null) {
                    cVar.mo720z(this, childAt, view, i);
                }
                fVar.mo725b(i, false);
                fVar.f579p = false;
            }
        }
        this.f553n = null;
    }

    /* renamed from: j */
    public void mo200j(View view, int i, int i2, int[] iArr, int i3) {
        C0092c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0095f fVar = (C0095f) childAt.getLayoutParams();
                if (fVar.mo724a(i3) && (cVar = fVar.f564a) != null) {
                    int[] iArr2 = this.f547h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo710p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f547h;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f547h;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo674q(1);
        }
    }

    /* renamed from: k */
    public final int mo655k(int i) {
        StringBuilder sb;
        int[] iArr = this.f551l;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: l */
    public C0095f mo656l(View view) {
        C0095f fVar = (C0095f) view.getLayoutParams();
        if (!fVar.f565b) {
            if (view instanceof C0091b) {
                C0092c behavior = ((C0091b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                C0092c cVar = fVar.f564a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.mo703i();
                    }
                    fVar.f564a = behavior;
                    fVar.f565b = true;
                    if (behavior != null) {
                        behavior.mo700f(fVar);
                    }
                }
            } else {
                C0093d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0093d) cls.getAnnotation(C0093d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        C0092c cVar2 = (C0092c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        C0092c cVar3 = fVar.f564a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.mo703i();
                            }
                            fVar.f564a = cVar2;
                            fVar.f565b = true;
                            if (cVar2 != null) {
                                cVar2.mo700f(fVar);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder o = C2108a.m5005o("Default behavior class ");
                        o.append(dVar.value().getName());
                        o.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", o.toString(), e);
                    }
                }
            }
            fVar.f565b = true;
        }
        return fVar;
    }

    /* renamed from: m */
    public void mo203m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0092c cVar;
        boolean z;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0095f fVar = (C0095f) childAt.getLayoutParams();
                if (fVar.mo724a(i5) && (cVar = fVar.f564a) != null) {
                    int[] iArr2 = this.f547h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo712r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f547h;
                    i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        i6 = Math.max(i8, this.f547h[1]);
                    } else {
                        z = true;
                        i6 = Math.min(i8, this.f547h[1]);
                    }
                    i8 = i6;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            mo674q(1);
        }
    }

    /* renamed from: n */
    public void mo204n(View view, int i, int i2, int i3, int i4, int i5) {
        mo203m(view, i, i2, i3, i4, 0, this.f548i);
    }

    /* renamed from: o */
    public boolean mo205o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0095f fVar = (C0095f) childAt.getLayoutParams();
                C0092c cVar = fVar.f564a;
                if (cVar != null) {
                    boolean x = cVar.mo718x(this, childAt, view, view2, i, i2);
                    z |= x;
                    fVar.mo725b(i3, x);
                } else {
                    fVar.mo725b(i3, false);
                }
            }
            i4++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo687v(false);
        if (this.f555p) {
            if (this.f554o == null) {
                this.f554o = new C0096g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f554o);
        }
        if (this.f556q == null) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f550k = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo687v(false);
        if (this.f555p && this.f554o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f554o);
        }
        View view = this.f553n;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f550k = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f557r && this.f558s != null) {
            C1449a0 a0Var = this.f556q;
            int d = a0Var != null ? a0Var.mo4202d() : 0;
            if (d > 0) {
                this.f558s.setBounds(0, 0, getWidth(), d);
                this.f558s.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo687v(true);
        }
        boolean t = mo685t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo687v(true);
        }
        return t;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0092c cVar;
        AtomicInteger atomicInteger = C1496p.f4584a;
        int layoutDirection = getLayoutDirection();
        int size = this.f542c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f542c.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((C0095f) view.getLayoutParams()).f564a) == null || !cVar.mo705k(this, view, layoutDirection))) {
                mo675r(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        if (r0.mo706l(r30, r20, r8, r21, r23, 0) == false) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo686u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = r8
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r7.getChildAt(r1)
            b.j.b.a<android.view.View> r4 = r7.f543d
            b.g.h<T, java.util.ArrayList<T>> r5 = r4.f4239b
            int r5 = r5.f3755e
            r6 = r8
        L_0x0019:
            if (r6 >= r5) goto L_0x0030
            b.g.h<T, java.util.ArrayList<T>> r9 = r4.f4239b
            java.lang.Object r9 = r9.mo3775k(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0030:
            r3 = r8
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r8
        L_0x0039:
            boolean r1 = r7.f555p
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.f550k
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f554o
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f554o = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f554o
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r7.f555p = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r7.f550k
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f554o
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f554o
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r7.f555p = r8
        L_0x006d:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.concurrent.atomic.AtomicInteger r3 = p009b.p086k.p098j.C1496p.f4584a
            int r11 = r30.getLayoutDirection()
            if (r11 != r2) goto L_0x0087
            r12 = r2
            goto L_0x0088
        L_0x0087:
            r12 = r8
        L_0x0088:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            b.k.j.a0 r3 = r7.f556q
            if (r3 == 0) goto L_0x00b1
            boolean r3 = r30.getFitsSystemWindows()
            if (r3 == 0) goto L_0x00b1
            r19 = r2
            goto L_0x00b3
        L_0x00b1:
            r19 = r8
        L_0x00b3:
            java.util.List<android.view.View> r2 = r7.f542c
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = r8
            r3 = r2
        L_0x00bd:
            if (r3 >= r6) goto L_0x01d6
            java.util.List<android.view.View> r0 = r7.f542c
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00d9
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01cd
        L_0x00d9:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0095f) r1
            int r0 = r1.f568e
            if (r0 < 0) goto L_0x0123
            if (r13 == 0) goto L_0x0123
            int r0 = r7.mo655k(r0)
            int r8 = r1.f566c
            if (r8 != 0) goto L_0x00f1
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f1:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x00fe
            if (r12 == 0) goto L_0x0103
        L_0x00fe:
            r2 = 5
            if (r8 != r2) goto L_0x010f
            if (r12 == 0) goto L_0x010f
        L_0x0103:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r8 = r0
            r21 = r2
            goto L_0x0127
        L_0x010f:
            if (r8 != r2) goto L_0x0113
            if (r12 == 0) goto L_0x0118
        L_0x0113:
            r2 = 3
            if (r8 != r2) goto L_0x0121
            if (r12 == 0) goto L_0x0121
        L_0x0118:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x0127
        L_0x0121:
            r8 = 0
            goto L_0x0125
        L_0x0123:
            r22 = r2
        L_0x0125:
            r21 = r8
        L_0x0127:
            if (r19 == 0) goto L_0x0159
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0159
            b.k.j.a0 r0 = r7.f556q
            int r0 = r0.mo4200b()
            b.k.j.a0 r2 = r7.f556q
            int r2 = r2.mo4201c()
            int r2 = r2 + r0
            b.k.j.a0 r0 = r7.f556q
            int r0 = r0.mo4202d()
            b.k.j.a0 r8 = r7.f556q
            int r8 = r8.mo4199a()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x015d
        L_0x0159:
            r8 = r31
            r23 = r32
        L_0x015d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f564a
            if (r0 == 0) goto L_0x0183
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo706l(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x019d
            goto L_0x0190
        L_0x0183:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x0190:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x019d:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01cd:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00bd
        L_0x01d6:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0092c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0095f fVar = (C0095f) childAt.getLayoutParams();
                if (fVar.mo724a(0) && (cVar = fVar.f564a) != null) {
                    z2 |= cVar.mo707m();
                }
            }
        }
        if (z2) {
            mo674q(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0092c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0095f fVar = (C0095f) childAt.getLayoutParams();
                if (fVar.mo724a(0) && (cVar = fVar.f564a) != null) {
                    z |= cVar.mo708n(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo200j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo203m(view, i, i2, i3, i4, 0, this.f548i);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo198h(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0097h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0097h hVar = (C0097h) parcelable;
        super.onRestoreInstanceState(hVar.f4660c);
        SparseArray<Parcelable> sparseArray = hVar.f582e;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0092c cVar = mo656l(childAt).f564a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.mo715u(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable v;
        C0097h hVar = new C0097h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0092c cVar = ((C0095f) childAt.getLayoutParams()).f564a;
            if (!(id == -1 || cVar == null || (v = cVar.mo716v(this, childAt)) == null)) {
                sparseArray.append(id, v);
            }
        }
        hVar.f582e = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo205o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo199i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f552m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo685t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f552m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0095f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f564a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f552m
            boolean r6 = r6.mo694A(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f552m
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo687v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo673p(View view, int i, int i2) {
        Rect a = m188a();
        mo644f(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            f537A.mo4183b(a);
        }
    }

    /* renamed from: q */
    public final void mo674q(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        int i11;
        int i12;
        C0095f fVar;
        C0092c cVar;
        int i13 = i;
        AtomicInteger atomicInteger = C1496p.f4584a;
        int layoutDirection = getLayoutDirection();
        int size = this.f542c.size();
        Rect a = m188a();
        Rect a2 = m188a();
        Rect a3 = m188a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f542c.get(i14);
            C0095f fVar2 = (C0095f) view.getLayoutParams();
            if (i13 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = a3;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f575l == this.f542c.get(i15)) {
                        C0095f fVar3 = (C0095f) view.getLayoutParams();
                        if (fVar3.f574k != null) {
                            Rect a4 = m188a();
                            Rect a5 = m188a();
                            Rect a6 = m188a();
                            mo644f(fVar3.f574k, a4);
                            mo638c(view, false, a5);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i16 = measuredWidth;
                            Rect rect3 = a6;
                            i11 = i14;
                            Rect rect4 = a5;
                            Rect rect5 = a4;
                            C0095f fVar4 = fVar3;
                            i10 = i15;
                            rect2 = a3;
                            fVar = fVar2;
                            mo645g(layoutDirection, a4, rect3, fVar3, i16, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z4 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            C0095f fVar5 = fVar4;
                            mo637b(fVar5, rect6, i16, measuredHeight);
                            int i17 = rect6.left - rect4.left;
                            int i18 = rect6.top - rect4.top;
                            if (i17 != 0) {
                                AtomicInteger atomicInteger2 = C1496p.f4584a;
                                view.offsetLeftAndRight(i17);
                            }
                            if (i18 != 0) {
                                AtomicInteger atomicInteger3 = C1496p.f4584a;
                                view.offsetTopAndBottom(i18);
                            }
                            if (z4 && (cVar = fVar5.f564a) != null) {
                                cVar.mo701g(this, view, fVar5.f574k);
                            }
                            rect5.setEmpty();
                            C1445c<Rect> cVar2 = f537A;
                            cVar2.mo4183b(rect5);
                            rect4.setEmpty();
                            cVar2.mo4183b(rect4);
                            rect6.setEmpty();
                            cVar2.mo4183b(rect6);
                            i15 = i10 + 1;
                            fVar2 = fVar;
                            size = i12;
                            i14 = i11;
                            a3 = rect2;
                        }
                    }
                    i10 = i15;
                    i12 = size;
                    rect2 = a3;
                    i11 = i14;
                    fVar = fVar2;
                    i15 = i10 + 1;
                    fVar2 = fVar;
                    size = i12;
                    i14 = i11;
                    a3 = rect2;
                }
                int i19 = size;
                Rect rect7 = a3;
                i2 = i14;
                C0095f fVar6 = fVar2;
                mo638c(view, true, a2);
                if (fVar6.f570g != 0 && !a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.f570g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i20 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i21 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar6.f571h != 0 && view.getVisibility() == 0) {
                    AtomicInteger atomicInteger4 = C1496p.f4584a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0095f fVar7 = (C0095f) view.getLayoutParams();
                        C0092c cVar3 = fVar7.f564a;
                        Rect a7 = m188a();
                        Rect a8 = m188a();
                        a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar3 == null || !cVar3.mo695a(this, view, a7)) {
                            a7.set(a8);
                        } else if (!a8.contains(a7)) {
                            StringBuilder o = C2108a.m5005o("Rect should be within the child's bounds. Rect:");
                            o.append(a7.toShortString());
                            o.append(" | Bounds:");
                            o.append(a8.toShortString());
                            throw new IllegalArgumentException(o.toString());
                        }
                        a8.setEmpty();
                        C1445c<Rect> cVar4 = f537A;
                        cVar4.mo4183b(a8);
                        if (!a7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.f571h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (a7.top - fVar7.topMargin) - fVar7.f573j) >= (i9 = a.top)) {
                                z2 = false;
                            } else {
                                mo690x(view, i9 - i8);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - fVar7.bottomMargin) + fVar7.f573j) < (i7 = a.bottom)) {
                                mo690x(view, height - i7);
                                z2 = true;
                            }
                            if (!z2) {
                                mo690x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (a7.left - fVar7.leftMargin) - fVar7.f572i) >= (i6 = a.left)) {
                                z3 = false;
                            } else {
                                mo689w(view, i6 - i5);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a7.right) - fVar7.rightMargin) + fVar7.f572i) < (i4 = a.right)) {
                                mo689w(view, width - i4);
                                z3 = true;
                            }
                            if (!z3) {
                                mo689w(view, 0);
                            }
                        }
                        a7.setEmpty();
                        cVar4.mo4183b(a7);
                    }
                }
                if (i13 != 2) {
                    rect = rect7;
                    rect.set(((C0095f) view.getLayoutParams()).f580q);
                    if (rect.equals(a2)) {
                        i3 = i19;
                    } else {
                        ((C0095f) view.getLayoutParams()).f580q.set(a2);
                    }
                } else {
                    rect = rect7;
                }
                i3 = i19;
                for (int i22 = i2 + 1; i22 < i3; i22++) {
                    View view2 = this.f542c.get(i22);
                    C0095f fVar8 = (C0095f) view2.getLayoutParams();
                    C0092c cVar5 = fVar8.f564a;
                    if (cVar5 != null && cVar5.mo698d(this, view2, view)) {
                        if (i13 != 0 || !fVar8.f579p) {
                            if (i13 != 2) {
                                z = cVar5.mo701g(this, view2, view);
                            } else {
                                cVar5.mo702h(this, view2, view);
                                z = true;
                            }
                            if (i13 == 1) {
                                fVar8.f579p = z;
                            }
                        } else {
                            fVar8.f579p = false;
                        }
                    }
                }
            }
            i14 = i2 + 1;
            size = i3;
            a3 = rect;
        }
        Rect rect8 = a3;
        a.setEmpty();
        C1445c<Rect> cVar6 = f537A;
        cVar6.mo4183b(a);
        a2.setEmpty();
        cVar6.mo4183b(a2);
        rect8.setEmpty();
        cVar6.mo4183b(rect8);
    }

    /* renamed from: r */
    public void mo675r(View view, int i) {
        C0095f fVar = (C0095f) view.getLayoutParams();
        View view2 = fVar.f574k;
        int i2 = 0;
        if (view2 == null && fVar.f569f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a = m188a();
            Rect a2 = m188a();
            try {
                mo644f(view2, a);
                C0095f fVar2 = (C0095f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                mo645g(i, a, a2, fVar2, measuredWidth, measuredHeight);
                mo637b(fVar2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                a.setEmpty();
                C1445c<Rect> cVar = f537A;
                cVar.mo4183b(a);
                a2.setEmpty();
                cVar.mo4183b(a2);
            }
        } else {
            int i3 = fVar.f568e;
            if (i3 >= 0) {
                C0095f fVar3 = (C0095f) view.getLayoutParams();
                int i4 = fVar3.f566c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int k = mo655k(i3) - measuredWidth2;
                if (i5 == 1) {
                    k += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    k += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(k, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C0095f fVar4 = (C0095f) view.getLayoutParams();
            Rect a3 = m188a();
            a3.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.f556q != null) {
                AtomicInteger atomicInteger = C1496p.f4584a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a3.left = this.f556q.mo4200b() + a3.left;
                    a3.top = this.f556q.mo4202d() + a3.top;
                    a3.right -= this.f556q.mo4201c();
                    a3.bottom -= this.f556q.mo4199a();
                }
            }
            Rect a4 = m188a();
            int i7 = fVar4.f566c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), a3, a4, i);
            view.layout(a4.left, a4.top, a4.right, a4.bottom);
            a3.setEmpty();
            C1445c<Rect> cVar2 = f537A;
            cVar2.mo4183b(a3);
            a4.setEmpty();
            cVar2.mo4183b(a4);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0092c cVar = ((C0095f) view.getLayoutParams()).f564a;
        if (cVar == null || !cVar.mo714t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f549j) {
            mo687v(false);
            this.f549j = true;
        }
    }

    /* renamed from: s */
    public void mo678s(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo691y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f559t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f558s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f558s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f558s.setState(getDrawableState());
                }
                Drawable drawable4 = this.f558s;
                AtomicInteger atomicInteger = C1496p.f4584a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f558s.setVisible(getVisibility() == 0, false);
                this.f558s.setCallback(this);
            }
            AtomicInteger atomicInteger2 = C1496p.f4584a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C1375a.f4363a;
            drawable = context.getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f558s;
        if (drawable != null && drawable.isVisible() != z) {
            this.f558s.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final boolean mo685t(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f544e;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f541z;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0095f fVar = (C0095f) view.getLayoutParams();
            C0092c cVar = fVar.f564a;
            boolean z4 = true;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.mo704j(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = cVar.mo694A(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.f552m = view;
                    }
                }
                C0092c cVar2 = fVar.f564a;
                if (cVar2 == null) {
                    fVar.f576m = false;
                }
                boolean z5 = fVar.f576m;
                if (z5) {
                    z = true;
                } else {
                    z = (cVar2 != null && cVar2.mo697c() > 0.0f) | z5;
                    fVar.f576m = z;
                }
                if (!z || z5) {
                    z4 = false;
                }
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.mo704j(this, view, motionEvent3);
                } else if (i2 == 1) {
                    cVar.mo694A(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo686u() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.f542c
            r0.clear()
            b.j.b.a<android.view.View> r0 = r12.f543d
            b.g.h<T, java.util.ArrayList<T>> r1 = r0.f4239b
            int r1 = r1.f3755e
            r2 = 0
            r3 = r2
        L_0x000d:
            if (r3 >= r1) goto L_0x0024
            b.g.h<T, java.util.ArrayList<T>> r4 = r0.f4239b
            java.lang.Object r4 = r4.mo3775k(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0021
            r4.clear()
            b.k.i.c<java.util.ArrayList<T>> r5 = r0.f4238a
            r5.mo4183b(r4)
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            b.g.h<T, java.util.ArrayList<T>> r0 = r0.f4239b
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x002e:
            if (r1 >= r0) goto L_0x0190
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r12.mo656l(r3)
            int r5 = r4.f569f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0045
            r4.f575l = r7
            r4.f574k = r7
            goto L_0x00c3
        L_0x0045:
            android.view.View r5 = r4.f574k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f569f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.f574k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r12) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.f575l = r7
            r4.f574k = r7
        L_0x006f:
            r5 = r2
            goto L_0x0074
        L_0x0071:
            r4.f575l = r5
            r5 = r8
        L_0x0074:
            if (r5 != 0) goto L_0x00c3
        L_0x0076:
            int r5 = r4.f569f
            android.view.View r5 = r12.findViewById(r5)
            r4.f574k = r5
            if (r5 == 0) goto L_0x00b9
            if (r5 != r12) goto L_0x0091
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0089
            goto L_0x00bf
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0091:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0095:
            if (r6 == r12) goto L_0x00b6
            if (r6 == 0) goto L_0x00b6
            if (r6 != r3) goto L_0x00aa
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00bf
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b1
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b1:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0095
        L_0x00b6:
            r4.f575l = r5
            goto L_0x00c3
        L_0x00b9:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x016b
        L_0x00bf:
            r4.f575l = r7
            r4.f574k = r7
        L_0x00c3:
            b.j.b.a<android.view.View> r5 = r12.f543d
            r5.mo4044a(r3)
            r5 = r2
        L_0x00c9:
            if (r5 >= r0) goto L_0x0167
            if (r5 != r1) goto L_0x00cf
            goto L_0x0163
        L_0x00cf:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f575l
            if (r6 == r9) goto L_0x0106
            java.util.concurrent.atomic.AtomicInteger r9 = p009b.p086k.p098j.C1496p.f4584a
            int r9 = r12.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0095f) r10
            int r10 = r10.f570g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x00f6
            int r11 = r4.f571h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00f6
            r9 = r8
            goto L_0x00f7
        L_0x00f6:
            r9 = r2
        L_0x00f7:
            if (r9 != 0) goto L_0x0106
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.f564a
            if (r9 == 0) goto L_0x0104
            boolean r9 = r9.mo698d(r12, r3, r6)
            if (r9 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r9 = r2
            goto L_0x0107
        L_0x0106:
            r9 = r8
        L_0x0107:
            if (r9 == 0) goto L_0x0163
            b.j.b.a<android.view.View> r9 = r12.f543d
            b.g.h<T, java.util.ArrayList<T>> r9 = r9.f4239b
            int r9 = r9.mo3764e(r6)
            if (r9 < 0) goto L_0x0115
            r9 = r8
            goto L_0x0116
        L_0x0115:
            r9 = r2
        L_0x0116:
            if (r9 != 0) goto L_0x011d
            b.j.b.a<android.view.View> r9 = r12.f543d
            r9.mo4044a(r6)
        L_0x011d:
            b.j.b.a<android.view.View> r9 = r12.f543d
            b.g.h<T, java.util.ArrayList<T>> r10 = r9.f4239b
            int r10 = r10.mo3764e(r6)
            if (r10 < 0) goto L_0x0129
            r10 = r8
            goto L_0x012a
        L_0x0129:
            r10 = r2
        L_0x012a:
            if (r10 == 0) goto L_0x015b
            b.g.h<T, java.util.ArrayList<T>> r10 = r9.f4239b
            int r10 = r10.mo3764e(r3)
            if (r10 < 0) goto L_0x0136
            r10 = r8
            goto L_0x0137
        L_0x0136:
            r10 = r2
        L_0x0137:
            if (r10 == 0) goto L_0x015b
            b.g.h<T, java.util.ArrayList<T>> r10 = r9.f4239b
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0157
            b.k.i.c<java.util.ArrayList<T>> r10 = r9.f4238a
            java.lang.Object r10 = r10.mo4182a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0152
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0152:
            b.g.h<T, java.util.ArrayList<T>> r9 = r9.f4239b
            r9.put(r6, r10)
        L_0x0157:
            r10.add(r3)
            goto L_0x0163
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0163:
            int r5 = r5 + 1
            goto L_0x00c9
        L_0x0167:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x016b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = p133c.p149b.p152b.p153a.C2108a.m5005o(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f569f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0190:
            java.util.List<android.view.View> r0 = r12.f542c
            b.j.b.a<android.view.View> r1 = r12.f543d
            java.util.ArrayList<T> r3 = r1.f4240c
            r3.clear()
            java.util.HashSet<T> r3 = r1.f4241d
            r3.clear()
            b.g.h<T, java.util.ArrayList<T>> r3 = r1.f4239b
            int r3 = r3.f3755e
        L_0x01a2:
            if (r2 >= r3) goto L_0x01b4
            b.g.h<T, java.util.ArrayList<T>> r4 = r1.f4239b
            java.lang.Object r4 = r4.mo3770h(r2)
            java.util.ArrayList<T> r5 = r1.f4240c
            java.util.HashSet<T> r6 = r1.f4241d
            r1.mo4045b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01a2
        L_0x01b4:
            java.util.ArrayList<T> r1 = r1.f4240c
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.f542c
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo686u():void");
    }

    /* renamed from: v */
    public final void mo687v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0092c cVar = ((C0095f) childAt.getLayoutParams()).f564a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.mo704j(this, childAt, obtain);
                } else {
                    cVar.mo694A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0095f) getChildAt(i2).getLayoutParams()).f576m = false;
        }
        this.f552m = null;
        this.f549j = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f558s;
    }

    /* renamed from: w */
    public final void mo689w(View view, int i) {
        C0095f fVar = (C0095f) view.getLayoutParams();
        int i2 = fVar.f572i;
        if (i2 != i) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            view.offsetLeftAndRight(i - i2);
            fVar.f572i = i;
        }
    }

    /* renamed from: x */
    public final void mo690x(View view, int i) {
        C0095f fVar = (C0095f) view.getLayoutParams();
        int i2 = fVar.f573j;
        if (i2 != i) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            view.offsetTopAndBottom(i - i2);
            fVar.f573j = i;
        }
    }

    /* renamed from: y */
    public final void mo691y() {
        AtomicInteger atomicInteger = C1496p.f4584a;
        if (getFitsSystemWindows()) {
            if (this.f560u == null) {
                this.f560u = new C0090a();
            }
            C1496p.m3611q(this, this.f560u);
            setSystemUiVisibility(1280);
            return;
        }
        C1496p.m3611q(this, (C1491k) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0095f) {
            return new C0095f((C0095f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0095f((ViewGroup.MarginLayoutParams) layoutParams) : new C0095f(layoutParams);
    }
}
