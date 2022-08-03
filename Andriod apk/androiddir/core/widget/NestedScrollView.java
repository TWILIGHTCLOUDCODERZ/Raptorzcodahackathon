package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.p018c.C0226b;
import p009b.p086k.p098j.C1447a;
import p009b.p086k.p098j.C1486f;
import p009b.p086k.p098j.C1487g;
import p009b.p086k.p098j.C1489i;
import p009b.p086k.p098j.C1490j;
import p009b.p086k.p098j.C1496p;
import p009b.p086k.p098j.p099b0.C1463b;
import p133c.p149b.p152b.p153a.C2108a;

public class NestedScrollView extends FrameLayout implements C1489i, C1486f {

    /* renamed from: C */
    public static final C0103a f606C = new C0103a();

    /* renamed from: D */
    public static final int[] f607D = {16843130};

    /* renamed from: A */
    public float f608A;

    /* renamed from: B */
    public C0104b f609B;

    /* renamed from: c */
    public long f610c;

    /* renamed from: d */
    public final Rect f611d = new Rect();

    /* renamed from: e */
    public OverScroller f612e = new OverScroller(getContext());

    /* renamed from: f */
    public EdgeEffect f613f;

    /* renamed from: g */
    public EdgeEffect f614g;

    /* renamed from: h */
    public int f615h;

    /* renamed from: i */
    public boolean f616i = true;

    /* renamed from: j */
    public boolean f617j = false;

    /* renamed from: k */
    public View f618k = null;

    /* renamed from: l */
    public boolean f619l = false;

    /* renamed from: m */
    public VelocityTracker f620m;

    /* renamed from: n */
    public boolean f621n;

    /* renamed from: o */
    public boolean f622o = true;

    /* renamed from: p */
    public int f623p;

    /* renamed from: q */
    public int f624q;

    /* renamed from: r */
    public int f625r;

    /* renamed from: s */
    public int f626s = -1;

    /* renamed from: t */
    public final int[] f627t = new int[2];

    /* renamed from: u */
    public final int[] f628u = new int[2];

    /* renamed from: v */
    public int f629v;

    /* renamed from: w */
    public int f630w;

    /* renamed from: x */
    public C0105c f631x;

    /* renamed from: y */
    public final C1490j f632y;

    /* renamed from: z */
    public final C1487g f633z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0103a extends C1447a {
        /* renamed from: c */
        public void mo831c(View view, AccessibilityEvent accessibilityEvent) {
            this.f4498a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        /* renamed from: d */
        public void mo832d(View view, C1463b bVar) {
            int scrollRange;
            this.f4498a.onInitializeAccessibilityNodeInfo(view, bVar.f4531a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f4531a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.f4531a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.mo4227a(C1463b.C1464a.f4536g);
                    bVar.mo4227a(C1463b.C1464a.f4540k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.mo4227a(C1463b.C1464a.f4535f);
                    bVar.mo4227a(C1463b.C1464a.f4541l);
                }
            }
        }

        /* renamed from: g */
        public boolean mo833g(View view, int i, Bundle bundle) {
            int min;
            if (super.mo833g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo754B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo754B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0104b {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0105c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0105c> CREATOR = new C0106a();

        /* renamed from: c */
        public int f634c;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class C0106a implements Parcelable.Creator<C0105c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0105c(parcel);
            }

            public Object[] newArray(int i) {
                return new C0105c[i];
            }
        }

        public C0105c(Parcel parcel) {
            super(parcel);
            this.f634c = parcel.readInt();
        }

        public C0105c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("HorizontalScrollView.SavedState{");
            o.append(Integer.toHexString(System.identityHashCode(this)));
            o.append(" scrollPosition=");
            return C2108a.m4999i(o, this.f634c, "}");
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f634c);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f623p = viewConfiguration.getScaledTouchSlop();
        this.f624q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f625r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f607D, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f632y = new C1490j();
        this.f633z = new C1487g(this);
        setNestedScrollingEnabled(true);
        C1496p.m3610p(this, f606C);
    }

    /* renamed from: c */
    public static int m258c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f608A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f608A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f608A;
    }

    /* renamed from: s */
    public static boolean m259s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m259s((View) parent, view2);
    }

    /* renamed from: A */
    public final void mo753A(View view) {
        view.getDrawingRect(this.f611d);
        offsetDescendantRectToMyCoords(view, this.f611d);
        int d = mo769d(this.f611d);
        if (d != 0) {
            scrollBy(0, d);
        }
    }

    /* renamed from: B */
    public final void mo754B(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f610c > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f612e;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo829y(z);
            } else {
                if (!this.f612e.isFinished()) {
                    mo756a();
                }
                scrollBy(i, i2);
            }
            this.f610c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: C */
    public boolean mo755C(int i, int i2) {
        return this.f633z.mo4270i(i, i2);
    }

    /* renamed from: a */
    public final void mo756a() {
        this.f612e.abortAnimation();
        this.f633z.mo4271j(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo761b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo824t(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo777f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f611d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f611d);
            mo777f(mo769d(this.f611d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo824t(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f612e.isFinished()) {
            this.f612e.computeScrollOffset();
            int currY = this.f612e.getCurrY();
            int i = currY - this.f630w;
            this.f630w = currY;
            int[] iArr = this.f628u;
            boolean z = false;
            iArr[1] = 0;
            mo776e(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f628u[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo827w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f628u;
                iArr2[1] = 0;
                this.f633z.mo4267f(0, scrollY2, 0, i3, this.f627t, 1, iArr2);
                i2 = i3 - this.f628u[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    mo786k();
                    if (i2 < 0) {
                        if (this.f613f.isFinished()) {
                            edgeEffect = this.f613f;
                        }
                    } else if (this.f614g.isFinished()) {
                        edgeEffect = this.f614g;
                    }
                    edgeEffect.onAbsorb((int) this.f612e.getCurrVelocity());
                }
                mo756a();
            }
            if (!this.f612e.isFinished()) {
                AtomicInteger atomicInteger = C1496p.f4584a;
                postInvalidateOnAnimation();
                return;
            }
            this.f633z.mo4271j(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public int mo769d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo787l(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f633z.mo4262a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f633z.mo4263b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo776e(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f633z.mo4266e(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f613f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f613f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f613f.setSize(width, height);
                if (this.f613f.draw(canvas)) {
                    AtomicInteger atomicInteger = C1496p.f4584a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.f614g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i2 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f614g.setSize(width2, height2);
                if (this.f614g.draw(canvas)) {
                    AtomicInteger atomicInteger2 = C1496p.f4584a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo776e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f633z.mo4264c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: f */
    public final void mo777f(int i) {
        if (i == 0) {
            return;
        }
        if (this.f622o) {
            mo754B(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: g */
    public final void mo778g() {
        this.f619l = false;
        mo828x();
        this.f633z.mo4271j(0);
        EdgeEffect edgeEffect = this.f613f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f614g.onRelease();
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f632y.mo4272a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo198h(View view, View view2, int i, int i2) {
        C1490j jVar = this.f632y;
        if (i2 == 1) {
            jVar.f4579b = i;
        } else {
            jVar.f4578a = i;
        }
        mo755C(2, i2);
    }

    public boolean hasNestedScrollingParent() {
        return mo811r(0);
    }

    /* renamed from: i */
    public void mo199i(View view, int i) {
        C1490j jVar = this.f632y;
        if (i == 1) {
            jVar.f4579b = 0;
        } else {
            jVar.f4578a = 0;
        }
        this.f633z.mo4271j(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f633z.f4576d;
    }

    /* renamed from: j */
    public void mo200j(View view, int i, int i2, int[] iArr, int i3) {
        mo776e(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: k */
    public final void mo786k() {
        if (getOverScrollMode() == 2) {
            this.f613f = null;
            this.f614g = null;
        } else if (this.f613f == null) {
            Context context = getContext();
            this.f613f = new EdgeEffect(context);
            this.f614g = new EdgeEffect(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo787l(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f611d
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fa
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00eb
            r4 = 20
            if (r0 == r4) goto L_0x00db
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fa
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00be
            android.graphics.Rect r7 = r6.f611d
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d0
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f611d
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d0
            int r1 = r1 - r0
            goto L_0x00ce
        L_0x00be:
            android.graphics.Rect r7 = r6.f611d
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f611d
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d0
            r1 = r2
        L_0x00ce:
            r7.top = r1
        L_0x00d0:
            android.graphics.Rect r7 = r6.f611d
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo830z(r5, r1, r0)
            goto L_0x00fa
        L_0x00db:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e6
            boolean r2 = r6.mo761b(r3)
            goto L_0x00fa
        L_0x00e6:
            boolean r2 = r6.mo810q(r3)
            goto L_0x00fa
        L_0x00eb:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f6
            boolean r2 = r6.mo761b(r5)
            goto L_0x00fa
        L_0x00f6:
            boolean r2 = r6.mo810q(r5)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo787l(android.view.KeyEvent):boolean");
    }

    /* renamed from: m */
    public void mo203m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo825u(i4, i5, iArr);
    }

    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo204n(View view, int i, int i2, int i3, int i4, int i5) {
        mo825u(i4, i5, (int[]) null);
    }

    /* renamed from: o */
    public boolean mo205o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f617j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f619l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.f619l
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ae
            r4 = -1
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0117
        L_0x001f:
            r11.mo826v(r12)
            goto L_0x0117
        L_0x0024:
            int r0 = r11.f626s
            if (r0 != r4) goto L_0x002a
            goto L_0x0117
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0117
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f615h
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f623p
            if (r4 <= r5) goto L_0x0117
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0117
            r11.f619l = r2
            r11.f615h = r0
            android.view.VelocityTracker r0 = r11.f620m
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f620m = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f620m
            r0.addMovement(r12)
            r11.f629v = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0117
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0117
        L_0x0085:
            r11.f619l = r3
            r11.f626s = r4
            r11.mo828x()
            android.widget.OverScroller r4 = r11.f612e
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.concurrent.atomic.AtomicInteger r12 = p009b.p086k.p098j.C1496p.f4584a
            r11.postInvalidateOnAnimation()
        L_0x00a8:
            b.k.j.g r12 = r11.f633z
            r12.mo4271j(r3)
            goto L_0x0117
        L_0x00ae:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e2
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e2
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e2
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e2
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e2
            r4 = r2
            goto L_0x00e3
        L_0x00e2:
            r4 = r3
        L_0x00e3:
            if (r4 != 0) goto L_0x00eb
            r11.f619l = r3
            r11.mo828x()
            goto L_0x0117
        L_0x00eb:
            r11.f615h = r0
            int r0 = r12.getPointerId(r3)
            r11.f626s = r0
            android.view.VelocityTracker r0 = r11.f620m
            if (r0 != 0) goto L_0x00fe
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f620m = r0
            goto L_0x0101
        L_0x00fe:
            r0.clear()
        L_0x0101:
            android.view.VelocityTracker r0 = r11.f620m
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f612e
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f612e
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.f619l = r12
            r11.mo755C(r1, r3)
        L_0x0117:
            boolean r12 = r11.f619l
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f616i = false;
        View view = this.f618k;
        if (view != null && m259s(view, this)) {
            mo753A(this.f618k);
        }
        this.f618k = null;
        if (!this.f617j) {
            if (this.f631x != null) {
                scrollTo(getScrollX(), this.f631x.f634c);
                this.f631x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c = m258c(scrollY, paddingTop, i5);
            if (c != scrollY) {
                scrollTo(getScrollX(), c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f617j = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f621n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo809p((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo776e(i, i2, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo825u(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f632y.f4578a = i;
        mo755C(2, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ mo824t(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0105c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0105c cVar = (C0105c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f631x = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0105c cVar = new C0105c(super.onSaveInstanceState());
        cVar.f634c = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0104b bVar = this.f609B;
        if (bVar != null) {
            C0226b bVar2 = (C0226b) bVar;
            AlertController.m33c(this, bVar2.f1182a, bVar2.f1183b);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo824t(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f611d);
            offsetDescendantRectToMyCoords(findFocus, this.f611d);
            mo777f(mo769d(this.f611d));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f632y.f4578a = 0;
        this.f633z.mo4271j(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r9.f612e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        if (r9.f612e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            android.view.VelocityTracker r0 = r9.f620m
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f620m = r0
        L_0x000e:
            int r0 = r23.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.f629v = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int r1 = r9.f629v
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0214
            r3 = -1
            if (r0 == r13) goto L_0x01c7
            if (r0 == r1) goto L_0x0081
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x024a
        L_0x0036:
            r22.mo826v(r23)
            int r0 = r9.f626s
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f615h = r0
            goto L_0x024a
        L_0x0048:
            int r0 = r23.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f615h = r1
            int r0 = r10.getPointerId(r0)
            r9.f626s = r0
            goto L_0x024a
        L_0x005b:
            boolean r0 = r9.f619l
            if (r0 == 0) goto L_0x020e
            int r0 = r22.getChildCount()
            if (r0 <= 0) goto L_0x020e
            android.widget.OverScroller r14 = r9.f612e
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x020e
            goto L_0x0209
        L_0x0081:
            int r0 = r9.f626s
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00a4
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = p133c.p149b.p152b.p153a.C2108a.m5005o(r0)
            int r1 = r9.f626s
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x024a
        L_0x00a4:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f615h
            int r0 = r0 - r6
            boolean r1 = r9.f619l
            if (r1 != 0) goto L_0x00ca
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f623p
            if (r1 <= r2) goto L_0x00ca
            android.view.ViewParent r1 = r22.getParent()
            if (r1 == 0) goto L_0x00c1
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x00c1:
            r9.f619l = r13
            int r1 = r9.f623p
            if (r0 <= 0) goto L_0x00c9
            int r0 = r0 - r1
            goto L_0x00ca
        L_0x00c9:
            int r0 = r0 + r1
        L_0x00ca:
            r7 = r0
            boolean r0 = r9.f619l
            if (r0 == 0) goto L_0x024a
            r1 = 0
            int[] r3 = r9.f628u
            int[] r4 = r9.f627t
            r5 = 0
            r0 = r22
            r2 = r7
            boolean r0 = r0.mo776e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ec
            int[] r0 = r9.f628u
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f629v
            int[] r1 = r9.f627t
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f629v = r0
        L_0x00ec:
            r15 = r7
            int[] r0 = r9.f627t
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f615h = r6
            int r16 = r22.getScrollY()
            int r8 = r22.getScrollRange()
            int r0 = r22.getOverScrollMode()
            if (r0 == 0) goto L_0x010a
            if (r0 != r13) goto L_0x0107
            if (r8 <= 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r17 = r11
            goto L_0x010c
        L_0x010a:
            r17 = r13
        L_0x010c:
            r1 = 0
            r3 = 0
            int r4 = r22.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r22
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.mo827w(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x012f
            boolean r0 = r9.mo811r(r11)
            if (r0 != 0) goto L_0x012f
            android.view.VelocityTracker r0 = r9.f620m
            r0.clear()
        L_0x012f:
            int r0 = r22.getScrollY()
            int r3 = r0 - r16
            int r5 = r15 - r3
            int[] r8 = r9.f628u
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.f627t
            r7 = 0
            b.k.j.g r1 = r9.f633z
            r1.mo4267f(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.f615h
            int[] r1 = r9.f627t
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.f615h = r0
            int r0 = r9.f629v
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f629v = r0
            if (r17 == 0) goto L_0x024a
            int[] r0 = r9.f628u
            r0 = r0[r13]
            int r15 = r15 - r0
            r22.mo786k()
            int r0 = r16 + r15
            if (r0 >= 0) goto L_0x0184
            android.widget.EdgeEffect r0 = r9.f613f
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r10.getX(r14)
            int r3 = r22.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f614g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f614g
            goto L_0x01ab
        L_0x0184:
            r1 = r21
            if (r0 <= r1) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f614g
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.getX(r14)
            int r4 = r22.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f613f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f613f
        L_0x01ab:
            r0.onRelease()
        L_0x01ae:
            android.widget.EdgeEffect r0 = r9.f613f
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01c0
            android.widget.EdgeEffect r0 = r9.f614g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024a
        L_0x01c0:
            java.util.concurrent.atomic.AtomicInteger r0 = p009b.p086k.p098j.C1496p.f4584a
            r22.postInvalidateOnAnimation()
            goto L_0x024a
        L_0x01c7:
            android.view.VelocityTracker r0 = r9.f620m
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f625r
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f626s
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f624q
            if (r1 < r4) goto L_0x01ef
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x020e
            r9.dispatchNestedFling(r2, r1, r13)
            r9.mo809p(r0)
            goto L_0x020e
        L_0x01ef:
            android.widget.OverScroller r14 = r9.f612e
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x020e
        L_0x0209:
            java.util.concurrent.atomic.AtomicInteger r0 = p009b.p086k.p098j.C1496p.f4584a
            r22.postInvalidateOnAnimation()
        L_0x020e:
            r9.f626s = r3
            r22.mo778g()
            goto L_0x024a
        L_0x0214:
            int r0 = r22.getChildCount()
            if (r0 != 0) goto L_0x021b
            return r11
        L_0x021b:
            android.widget.OverScroller r0 = r9.f612e
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.f619l = r0
            if (r0 == 0) goto L_0x022f
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x022f
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x022f:
            android.widget.OverScroller r0 = r9.f612e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
            r22.mo756a()
        L_0x023a:
            float r0 = r23.getY()
            int r0 = (int) r0
            r9.f615h = r0
            int r0 = r10.getPointerId(r11)
            r9.f626s = r0
            r9.mo755C(r1, r11)
        L_0x024a:
            android.view.VelocityTracker r0 = r9.f620m
            if (r0 == 0) goto L_0x0251
            r0.addMovement(r12)
        L_0x0251:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo809p(int i) {
        if (getChildCount() > 0) {
            this.f612e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo829y(true);
        }
    }

    /* renamed from: q */
    public boolean mo810q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f611d;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f611d.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f611d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f611d;
        return mo830z(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean mo811r(int i) {
        return this.f633z.mo4268g(i) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f616i) {
            mo753A(view2);
        } else {
            this.f618k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d = mo769d(rect);
        boolean z2 = d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, d);
            } else {
                mo754B(0, d, 250, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo828x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f616i = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c = m258c(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c2 = m258c(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c != getScrollX() || c2 != getScrollY()) {
                super.scrollTo(c, c2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f621n) {
            this.f621n = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1487g gVar = this.f633z;
        if (gVar.f4576d) {
            View view = gVar.f4575c;
            AtomicInteger atomicInteger = C1496p.f4584a;
            view.stopNestedScroll();
        }
        gVar.f4576d = z;
    }

    public void setOnScrollChangeListener(C0104b bVar) {
        this.f609B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f622o = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f633z.mo4270i(i, 0);
    }

    public void stopNestedScroll() {
        this.f633z.mo4271j(0);
    }

    /* renamed from: t */
    public final boolean mo824t(View view, int i, int i2) {
        view.getDrawingRect(this.f611d);
        offsetDescendantRectToMyCoords(view, this.f611d);
        return this.f611d.bottom + i >= getScrollY() && this.f611d.top - i <= getScrollY() + i2;
    }

    /* renamed from: u */
    public final void mo825u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f633z.mo4265d(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: v */
    public final void mo826v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f626s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f615h = (int) motionEvent.getY(i);
            this.f626s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f620m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: w */
    public boolean mo827w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !mo811r(1)) {
            this.f612e.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    /* renamed from: x */
    public final void mo828x() {
        VelocityTracker velocityTracker = this.f620m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f620m = null;
        }
    }

    /* renamed from: y */
    public final void mo829y(boolean z) {
        if (z) {
            mo755C(2, 1);
        } else {
            this.f633z.mo4271j(1);
        }
        this.f630w = getScrollY();
        AtomicInteger atomicInteger = C1496p.f4584a;
        postInvalidateOnAnimation();
    }

    /* renamed from: z */
    public final boolean mo830z(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            mo777f(z2 ? i5 - scrollY : i6 - i7);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }
}
