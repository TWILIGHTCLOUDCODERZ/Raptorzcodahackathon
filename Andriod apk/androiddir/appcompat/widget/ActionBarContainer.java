package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.C0221b;
import p009b.p017b.p026h.C0338b;
import p009b.p017b.p026h.C0409r0;
import p009b.p086k.p098j.C1496p;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: c */
    public boolean f172c;

    /* renamed from: d */
    public View f173d;

    /* renamed from: e */
    public View f174e;

    /* renamed from: f */
    public View f175f;

    /* renamed from: g */
    public Drawable f176g;

    /* renamed from: h */
    public Drawable f177h;

    /* renamed from: i */
    public Drawable f178i;

    /* renamed from: j */
    public boolean f179j;

    /* renamed from: k */
    public boolean f180k;

    /* renamed from: l */
    public int f181l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0338b bVar = new C0338b(this);
        AtomicInteger atomicInteger = C1496p.f4584a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221b.f1155a);
        boolean z = false;
        this.f176g = obtainStyledAttributes.getDrawable(0);
        this.f177h = obtainStyledAttributes.getDrawable(2);
        this.f181l = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f179j = true;
            this.f178i = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f179j ? this.f176g == null && this.f177h == null : this.f178i == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo141a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo142b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f176g;
        if (drawable != null && drawable.isStateful()) {
            this.f176g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f177h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f177h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f178i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f178i.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f173d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f176g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f177h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f178i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f174e = findViewById(R.id.action_bar);
        this.f175f = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f172c || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f173d
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f179j
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f178i
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f176g
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f174e
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.f176g
            android.view.View r7 = r4.f174e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f174e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f174e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f174e
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f175f
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f176g
            android.view.View r7 = r4.f175f
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f175f
            int r8 = r8.getTop()
            android.view.View r0 = r4.f175f
            int r0 = r0.getRight()
            android.view.View r2 = r4.f175f
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f176g
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f180k = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f177h
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f174e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f181l
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f174e
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f173d
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f174e
            boolean r0 = r3.mo142b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f174e
        L_0x0042:
            int r0 = r3.mo141a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f175f
            boolean r0 = r3.mo142b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f175f
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f173d
            int r1 = r3.mo141a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f176g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f176g);
        }
        this.f176g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f174e;
            if (view != null) {
                this.f176g.setBounds(view.getLeft(), this.f174e.getTop(), this.f174e.getRight(), this.f174e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f179j ? !(this.f176g == null && this.f177h == null) : this.f178i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f178i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f178i);
        }
        this.f178i = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f179j && (drawable2 = this.f178i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f179j ? this.f176g == null && this.f177h == null : this.f178i == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f177h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f177h);
        }
        this.f177h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f180k && (drawable2 = this.f177h) != null) {
                drawable2.setBounds(this.f173d.getLeft(), this.f173d.getTop(), this.f173d.getRight(), this.f173d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f179j ? !(this.f176g == null && this.f177h == null) : this.f178i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0409r0 r0Var) {
        View view = this.f173d;
        if (view != null) {
            removeView(view);
        }
        this.f173d = r0Var;
        if (r0Var != null) {
            addView(r0Var);
            ViewGroup.LayoutParams layoutParams = r0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            r0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f172c = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f176g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f177h;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f178i;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f176g && !this.f179j) || (drawable == this.f177h && this.f180k) || ((drawable == this.f178i && this.f179j) || super.verifyDrawable(drawable));
    }
}
