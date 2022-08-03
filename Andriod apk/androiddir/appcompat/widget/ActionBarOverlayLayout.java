package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.p018c.C0260s;
import p009b.p017b.p024g.p025i.C0322m;
import p009b.p017b.p026h.C0359d0;
import p009b.p017b.p026h.C0362e0;
import p009b.p086k.p090d.C1389b;
import p009b.p086k.p098j.C1449a0;
import p009b.p086k.p098j.C1488h;
import p009b.p086k.p098j.C1489i;
import p009b.p086k.p098j.C1490j;
import p009b.p086k.p098j.C1496p;
import p133c.p149b.p152b.p153a.C2108a;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0359d0, C1488h, C1489i {

    /* renamed from: H */
    public static final int[] f195H = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public C0045d f196A;

    /* renamed from: B */
    public OverScroller f197B;

    /* renamed from: C */
    public ViewPropertyAnimator f198C;

    /* renamed from: D */
    public final AnimatorListenerAdapter f199D;

    /* renamed from: E */
    public final Runnable f200E;

    /* renamed from: F */
    public final Runnable f201F;

    /* renamed from: G */
    public final C1490j f202G;

    /* renamed from: c */
    public int f203c;

    /* renamed from: d */
    public int f204d = 0;

    /* renamed from: e */
    public ContentFrameLayout f205e;

    /* renamed from: f */
    public ActionBarContainer f206f;

    /* renamed from: g */
    public C0362e0 f207g;

    /* renamed from: h */
    public Drawable f208h;

    /* renamed from: i */
    public boolean f209i;

    /* renamed from: j */
    public boolean f210j;

    /* renamed from: k */
    public boolean f211k;

    /* renamed from: l */
    public boolean f212l;

    /* renamed from: m */
    public boolean f213m;

    /* renamed from: n */
    public int f214n;

    /* renamed from: o */
    public int f215o;

    /* renamed from: p */
    public final Rect f216p = new Rect();

    /* renamed from: q */
    public final Rect f217q = new Rect();

    /* renamed from: r */
    public final Rect f218r = new Rect();

    /* renamed from: s */
    public final Rect f219s = new Rect();

    /* renamed from: t */
    public final Rect f220t = new Rect();

    /* renamed from: u */
    public final Rect f221u = new Rect();

    /* renamed from: v */
    public final Rect f222v = new Rect();

    /* renamed from: w */
    public C1449a0 f223w;

    /* renamed from: x */
    public C1449a0 f224x;

    /* renamed from: y */
    public C1449a0 f225y;

    /* renamed from: z */
    public C1449a0 f226z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0042a extends AnimatorListenerAdapter {
        public C0042a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f198C = null;
            actionBarOverlayLayout.f213m = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f198C = null;
            actionBarOverlayLayout.f213m = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0043b implements Runnable {
        public C0043b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo221q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f198C = actionBarOverlayLayout.f206f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f199D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0044c implements Runnable {
        public C0044c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo221q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f198C = actionBarOverlayLayout.f206f.animate().translationY((float) (-ActionBarOverlayLayout.this.f206f.getHeight())).setListener(ActionBarOverlayLayout.this.f199D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0045d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0046e extends ViewGroup.MarginLayoutParams {
        public C0046e(int i, int i2) {
            super(i, i2);
        }

        public C0046e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0046e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1449a0 a0Var = C1449a0.f4501b;
        this.f223w = a0Var;
        this.f224x = a0Var;
        this.f225y = a0Var;
        this.f226z = a0Var;
        this.f199D = new C0042a();
        this.f200E = new C0043b();
        this.f201F = new C0044c();
        mo222r(context);
        this.f202G = new C1490j();
    }

    /* renamed from: a */
    public void mo182a(Menu menu, C0322m.C0323a aVar) {
        mo223s();
        this.f207g.mo2224a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo183b() {
        mo223s();
        return this.f207g.mo2225b();
    }

    /* renamed from: c */
    public void mo184c() {
        mo223s();
        this.f207g.mo2226c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0046e;
    }

    /* renamed from: d */
    public boolean mo186d() {
        mo223s();
        return this.f207g.mo2228d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f208h != null && !this.f209i) {
            if (this.f206f.getVisibility() == 0) {
                i = (int) (this.f206f.getTranslationY() + ((float) this.f206f.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f208h.setBounds(0, i, getWidth(), this.f208h.getIntrinsicHeight() + i);
            this.f208h.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo188e() {
        mo223s();
        return this.f207g.mo2229e();
    }

    /* renamed from: f */
    public boolean mo189f() {
        mo223s();
        return this.f207g.mo2230f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public boolean mo191g() {
        mo223s();
        return this.f207g.mo2231g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0046e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0046e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0046e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f206f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f202G.mo4272a();
    }

    public CharSequence getTitle() {
        mo223s();
        return this.f207g.getTitle();
    }

    /* renamed from: h */
    public void mo198h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: i */
    public void mo199i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo200j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo201k(int i) {
        mo223s();
        if (i == 2) {
            this.f207g.mo2245s();
        } else if (i == 5) {
            this.f207g.mo2250t();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo202l() {
        mo223s();
        this.f207g.mo2234h();
    }

    /* renamed from: m */
    public void mo203m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: n */
    public void mo204n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo205o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo223s();
        C1449a0 i = C1449a0.m3479i(windowInsets, this);
        boolean p = mo220p(this.f206f, new Rect(i.mo4200b(), i.mo4202d(), i.mo4201c(), i.mo4199a()), true, true, false, true);
        Rect rect = this.f216p;
        AtomicInteger atomicInteger = C1496p.f4584a;
        WindowInsets g = i.mo4205g();
        if (g != null) {
            C1449a0.m3479i(computeSystemWindowInsets(g, rect), this);
        } else {
            rect.setEmpty();
        }
        Rect rect2 = this.f216p;
        C1449a0 i2 = i.f4502a.mo4213i(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f223w = i2;
        boolean z = true;
        if (!this.f224x.equals(i2)) {
            this.f224x = this.f223w;
            p = true;
        }
        if (!this.f217q.equals(this.f216p)) {
            this.f217q.set(this.f216p);
        } else {
            z = p;
        }
        if (z) {
            requestLayout();
        }
        return i.f4502a.mo4222a().f4502a.mo4218c().f4502a.mo4217b().mo4205g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo222r(getContext());
        AtomicInteger atomicInteger = C1496p.f4584a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo221q();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0046e eVar = (C0046e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        C1449a0 a0Var;
        mo223s();
        measureChildWithMargins(this.f206f, i, 0, i2, 0);
        C0046e eVar = (C0046e) this.f206f.getLayoutParams();
        int max = Math.max(0, this.f206f.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f206f.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f206f.getMeasuredState());
        AtomicInteger atomicInteger = C1496p.f4584a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i3 = this.f203c;
            if (this.f211k && this.f206f.getTabContainer() != null) {
                i3 += this.f203c;
            }
        } else {
            i3 = this.f206f.getVisibility() != 8 ? this.f206f.getMeasuredHeight() : 0;
        }
        this.f218r.set(this.f216p);
        C1449a0 a0Var2 = this.f223w;
        this.f225y = a0Var2;
        if (this.f210j || z) {
            C1389b a = C1389b.m3393a(a0Var2.mo4200b(), this.f225y.mo4202d() + i3, this.f225y.mo4201c(), this.f225y.mo4199a() + 0);
            C1449a0 a0Var3 = this.f225y;
            int i4 = Build.VERSION.SDK_INT;
            C1449a0.C1453d cVar = i4 >= 30 ? new C1449a0.C1452c(a0Var3) : i4 >= 29 ? new C1449a0.C1451b(a0Var3) : new C1449a0.C1450a(a0Var3);
            cVar.mo4209c(a);
            a0Var = cVar.mo4207a();
        } else {
            Rect rect = this.f218r;
            rect.top += i3;
            rect.bottom += 0;
            a0Var = a0Var2.f4502a.mo4213i(0, i3, 0, 0);
        }
        this.f225y = a0Var;
        mo220p(this.f205e, this.f218r, true, true, true, true);
        if (!this.f226z.equals(this.f225y)) {
            C1449a0 a0Var4 = this.f225y;
            this.f226z = a0Var4;
            C1496p.m3597c(this.f205e, a0Var4);
        }
        measureChildWithMargins(this.f205e, i, 0, i2, 0);
        C0046e eVar2 = (C0046e) this.f205e.getLayoutParams();
        int max3 = Math.max(max, this.f205e.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f205e.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f205e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f212l || !z) {
            return false;
        }
        this.f197B.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f197B.getFinalY() > this.f206f.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo221q();
            this.f201F.run();
        } else {
            mo221q();
            this.f200E.run();
        }
        this.f213m = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f214n + i2;
        this.f214n = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (p009b.p017b.p018c.C0260s) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            b.k.j.j r1 = r0.f202G
            r1.f4578a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f214n = r1
            r0.mo221q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f196A
            if (r1 == 0) goto L_0x001d
            b.b.c.s r1 = (p009b.p017b.p018c.C0260s) r1
            b.b.g.g r2 = r1.f1326t
            if (r2 == 0) goto L_0x001d
            r2.mo1837a()
            r2 = 0
            r1.f1326t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f206f.getVisibility() != 0) {
            return false;
        }
        return this.f212l;
    }

    public void onStopNestedScroll(View view) {
        if (this.f212l && !this.f213m) {
            if (this.f214n <= this.f206f.getHeight()) {
                mo221q();
                postDelayed(this.f200E, 600);
            } else {
                mo221q();
                postDelayed(this.f201F, 600);
            }
        }
        C0045d dVar = this.f196A;
        if (dVar != null) {
            Objects.requireNonNull((C0260s) dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo223s();
        int i2 = this.f215o ^ i;
        this.f215o = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C0045d dVar = this.f196A;
        if (dVar != null) {
            ((C0260s) dVar).f1322p = !z2;
            if (z || !z2) {
                C0260s sVar = (C0260s) dVar;
                if (sVar.f1323q) {
                    sVar.f1323q = false;
                    sVar.mo1694g(true);
                }
            } else {
                C0260s sVar2 = (C0260s) dVar;
                if (!sVar2.f1323q) {
                    sVar2.f1323q = true;
                    sVar2.mo1694g(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f196A != null) {
            AtomicInteger atomicInteger = C1496p.f4584a;
            requestApplyInsets();
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f204d = i;
        C0045d dVar = this.f196A;
        if (dVar != null) {
            ((C0260s) dVar).f1321o = i;
        }
    }

    /* renamed from: p */
    public final boolean mo220p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0046e eVar = (C0046e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: q */
    public void mo221q() {
        removeCallbacks(this.f200E);
        removeCallbacks(this.f201F);
        ViewPropertyAnimator viewPropertyAnimator = this.f198C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void mo222r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f195H);
        boolean z = false;
        this.f203c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f208h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f209i = z;
        this.f197B = new OverScroller(context);
    }

    /* renamed from: s */
    public void mo223s() {
        C0362e0 e0Var;
        if (this.f205e == null) {
            this.f205e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f206f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0362e0) {
                e0Var = (C0362e0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                e0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder o = C2108a.m5005o("Can't make a decor toolbar out of ");
                o.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(o.toString());
            }
            this.f207g = e0Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo221q();
        this.f206f.setTranslationY((float) (-Math.max(0, Math.min(i, this.f206f.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0045d dVar) {
        this.f196A = dVar;
        if (getWindowToken() != null) {
            ((C0260s) this.f196A).f1321o = this.f204d;
            int i = this.f215o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AtomicInteger atomicInteger = C1496p.f4584a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f211k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f212l) {
            this.f212l = z;
            if (!z) {
                mo221q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo223s();
        this.f207g.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo223s();
        this.f207g.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo223s();
        this.f207g.mo2242p(i);
    }

    public void setOverlayMode(boolean z) {
        this.f210j = z;
        this.f209i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo223s();
        this.f207g.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo223s();
        this.f207g.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
