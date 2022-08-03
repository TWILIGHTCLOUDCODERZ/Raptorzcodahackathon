package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import p009b.p017b.p024g.C0282a;
import p009b.p017b.p026h.C0333a;
import p009b.p017b.p026h.C0346c;
import p009b.p017b.p026h.C0363e1;

public class ActionBarContextView extends C0333a {

    /* renamed from: k */
    public CharSequence f182k;

    /* renamed from: l */
    public CharSequence f183l;

    /* renamed from: m */
    public View f184m;

    /* renamed from: n */
    public View f185n;

    /* renamed from: o */
    public View f186o;

    /* renamed from: p */
    public LinearLayout f187p;

    /* renamed from: q */
    public TextView f188q;

    /* renamed from: r */
    public TextView f189r;

    /* renamed from: s */
    public int f190s;

    /* renamed from: t */
    public int f191t;

    /* renamed from: u */
    public boolean f192u;

    /* renamed from: v */
    public int f193v;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0041a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ C0282a f194c;

        public C0041a(ActionBarContextView actionBarContextView, C0282a aVar) {
            this.f194c = aVar;
        }

        public void onClick(View view) {
            this.f194c.mo1695c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903068(0x7f03001c, float:1.7412944E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = p009b.p017b.C0221b.f1158d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = p009b.p017b.p019d.p020a.C0265a.m1035a(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.util.concurrent.atomic.AtomicInteger r0 = p009b.p086k.p098j.C1496p.f4584a
            r3.setBackground(r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f190s = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f191t = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f1675g = r4
            r4 = 2
            r0 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.f193v = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo161f(p009b.p017b.p024g.C0282a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f184m
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f193v
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f184m = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f184m
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f184m
            r2 = 2131230784(0x7f080040, float:1.807763E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f185n = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo1697e()
            b.b.g.i.g r7 = (p009b.p017b.p024g.p025i.C0307g) r7
            b.b.h.c r0 = r6.f1674f
            if (r0 == 0) goto L_0x0041
            r0.mo2279b()
        L_0x0041:
            b.b.h.c r0 = new b.b.h.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f1674f = r0
            r2 = 1
            r0.f1739o = r2
            r0.f1740p = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            b.b.h.c r3 = r6.f1674f
            android.content.Context r4 = r6.f1672d
            r7.mo1962b(r3, r4)
            b.b.h.c r7 = r6.f1674f
            b.b.g.i.n r3 = r7.f1507j
            if (r3 != 0) goto L_0x0079
            android.view.LayoutInflater r4 = r7.f1503f
            int r5 = r7.f1505h
            android.view.View r1 = r4.inflate(r5, r6, r1)
            b.b.g.i.n r1 = (p009b.p017b.p024g.p025i.C0324n) r1
            r7.f1507j = r1
            b.b.g.i.g r4 = r7.f1502e
            r1.mo125b(r4)
            r7.mo495h(r2)
        L_0x0079:
            b.b.g.i.n r1 = r7.f1507j
            if (r3 == r1) goto L_0x0083
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f1673e = r1
            r7 = 0
            java.util.concurrent.atomic.AtomicInteger r2 = p009b.p086k.p098j.C1496p.f4584a
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f1673e
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo161f(b.b.g.a):void");
    }

    /* renamed from: g */
    public final void mo162g() {
        if (this.f187p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f187p = linearLayout;
            this.f188q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f189r = (TextView) this.f187p.findViewById(R.id.action_bar_subtitle);
            if (this.f190s != 0) {
                this.f188q.setTextAppearance(getContext(), this.f190s);
            }
            if (this.f191t != 0) {
                this.f189r.setTextAppearance(getContext(), this.f191t);
            }
        }
        this.f188q.setText(this.f182k);
        this.f189r.setText(this.f183l);
        boolean z = !TextUtils.isEmpty(this.f182k);
        boolean z2 = !TextUtils.isEmpty(this.f183l);
        int i = 0;
        this.f189r.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f187p;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f187p.getParent() == null) {
            addView(this.f187p);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f183l;
    }

    public CharSequence getTitle() {
        return this.f182k;
    }

    /* renamed from: h */
    public void mo169h() {
        removeAllViews();
        this.f186o = null;
        this.f1673e = null;
        this.f1674f = null;
        View view = this.f185n;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0346c cVar = this.f1674f;
        if (cVar != null) {
            cVar.mo2281g();
            this.f1674f.mo2282n();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f182k);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0363e1.m1405b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f184m;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f184m.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = b ? paddingRight - i5 : paddingRight + i5;
            int d = i7 + mo2173d(this.f184m, i7, paddingTop, paddingTop2, b);
            paddingRight = b ? d - i6 : d + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f187p;
        if (!(linearLayout == null || this.f186o != null || linearLayout.getVisibility() == 8)) {
            i8 += mo2173d(this.f187p, i8, paddingTop, paddingTop2, b);
        }
        int i9 = i8;
        View view2 = this.f186o;
        if (view2 != null) {
            mo2173d(view2, i9, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1673e;
        if (actionMenuView != null) {
            mo2173d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1675g;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f184m;
            if (view != null) {
                int c = mo2172c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f184m.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1673e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo2172c(this.f1673e, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f187p;
            if (linearLayout != null && this.f186o == null) {
                if (this.f192u) {
                    this.f187p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f187p.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f187p.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo2172c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f186o;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f186o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1675g <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f1675g = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f186o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f186o = view;
        if (!(view == null || (linearLayout = this.f187p) == null)) {
            removeView(linearLayout);
            this.f187p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f183l = charSequence;
        mo162g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f182k = charSequence;
        mo162g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f192u) {
            requestLayout();
        }
        this.f192u = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
