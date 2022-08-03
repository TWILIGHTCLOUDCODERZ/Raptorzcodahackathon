package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import p009b.p017b.p024g.p025i.C0307g;
import p009b.p017b.p024g.p025i.C0311i;
import p009b.p017b.p024g.p025i.C0322m;
import p009b.p017b.p024g.p025i.C0324n;
import p009b.p017b.p026h.C0346c;
import p009b.p017b.p026h.C0363e1;
import p009b.p017b.p026h.C0379j0;
import p133c.p149b.p152b.p153a.C2108a;

public class ActionMenuView extends C0379j0 implements C0307g.C0309b, C0324n {

    /* renamed from: A */
    public int f230A;

    /* renamed from: B */
    public int f231B;

    /* renamed from: C */
    public C0051e f232C;

    /* renamed from: r */
    public C0307g f233r;

    /* renamed from: s */
    public Context f234s;

    /* renamed from: t */
    public int f235t = 0;

    /* renamed from: u */
    public boolean f236u;

    /* renamed from: v */
    public C0346c f237v;

    /* renamed from: w */
    public C0322m.C0323a f238w;

    /* renamed from: x */
    public C0307g.C0308a f239x;

    /* renamed from: y */
    public boolean f240y;

    /* renamed from: z */
    public int f241z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0047a {
        /* renamed from: a */
        boolean mo102a();

        /* renamed from: b */
        boolean mo103b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0048b implements C0322m.C0323a {
        /* renamed from: a */
        public void mo266a(C0307g gVar, boolean z) {
        }

        /* renamed from: b */
        public boolean mo267b(C0307g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0049c extends C0379j0.C0380a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f242a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f243b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f244c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f245d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f246e;

        /* renamed from: f */
        public boolean f247f;

        public C0049c(int i, int i2) {
            super(i, i2);
            this.f242a = false;
        }

        public C0049c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0049c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0049c(C0049c cVar) {
            super(cVar);
            this.f242a = cVar.f242a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0050d implements C0307g.C0308a {
        public C0050d() {
        }

        /* renamed from: a */
        public boolean mo268a(C0307g gVar, MenuItem menuItem) {
            C0051e eVar = ActionMenuView.this.f232C;
            if (eVar == null) {
                return false;
            }
            Toolbar.C0076f fVar = Toolbar.this.f348I;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }

        /* renamed from: b */
        public void mo269b(C0307g gVar) {
            C0307g.C0308a aVar = ActionMenuView.this.f239x;
            if (aVar != null) {
                aVar.mo269b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0051e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f230A = (int) (56.0f * f);
        this.f231B = (int) (f * 4.0f);
        this.f234s = context;
    }

    /* renamed from: t */
    public static int m75t(View view, int i, int i2, int i3, int i4) {
        C0049c cVar = (C0049c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo105e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f242a && z2) {
            z = true;
        }
        cVar.f245d = z;
        cVar.f243b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public boolean mo124a(C0311i iVar) {
        return this.f233r.mo1990s(iVar, (C0322m) null, 0);
    }

    /* renamed from: b */
    public void mo125b(C0307g gVar) {
        this.f233r = gVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0049c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0049c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f233r == null) {
            Context context = getContext();
            C0307g gVar = new C0307g(context);
            this.f233r = gVar;
            gVar.f1567e = new C0050d();
            C0346c cVar = new C0346c(context);
            this.f237v = cVar;
            cVar.f1739o = true;
            cVar.f1740p = true;
            C0322m.C0323a aVar = this.f238w;
            if (aVar == null) {
                aVar = new C0048b();
            }
            cVar.f1504g = aVar;
            this.f233r.mo1962b(cVar, this.f234s);
            C0346c cVar2 = this.f237v;
            cVar2.f1507j = this;
            this.f233r = cVar2.f1502e;
        }
        return this.f233r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0346c cVar = this.f237v;
        C0346c.C0350d dVar = cVar.f1736l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f1738n) {
            return cVar.f1737m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f235t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: i */
    public C0379j0.C0380a mo251i(AttributeSet attributeSet) {
        return new C0049c(getContext(), attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0346c cVar = this.f237v;
        if (cVar != null) {
            cVar.mo495h(false);
            if (this.f237v.mo2283o()) {
                this.f237v.mo2281g();
                this.f237v.mo2284p();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0346c cVar = this.f237v;
        if (cVar != null) {
            cVar.mo2279b();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f240y) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0363e1.m1405b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0049c cVar = (C0049c) childAt.getLayoutParams();
                if (cVar.f242a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo259s(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo259s(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int i16 = 0;
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                C0049c cVar2 = (C0049c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f242a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i16++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i16 < childCount) {
            View childAt4 = getChildAt(i16);
            C0049c cVar3 = (C0049c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f242a) {
                int i19 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = C2108a.m4992b(measuredWidth4, cVar3.rightMargin, max, i19);
            }
            i16++;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        C0307g gVar;
        boolean z4 = this.f240y;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f240y = z5;
        if (z4 != z5) {
            this.f241z = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f240y || (gVar = this.f233r) == null || size == this.f241z)) {
            this.f241z = size;
            gVar.mo1986q(true);
        }
        int childCount = getChildCount();
        if (!this.f240y || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                C0049c cVar = (C0049c) getChildAt(i8).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f230A;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.f231B;
                    i6 = i21;
                    z3 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z3 = false;
                }
                C0049c cVar2 = (C0049c) childAt.getLayoutParams();
                cVar2.f247f = z3;
                cVar2.f244c = z3 ? 1 : 0;
                cVar2.f243b = z3;
                cVar2.f245d = z3;
                cVar2.leftMargin = z3;
                cVar2.rightMargin = z3;
                cVar2.f246e = z7 && ((ActionMenuItemView) childAt).mo105e();
                int t = m75t(childAt, i13, cVar2.f242a ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, t);
                if (cVar2.f245d) {
                    i17++;
                }
                if (cVar2.f242a) {
                    z6 = true;
                }
                i11 -= t;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (t == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i11 <= 0) {
                i3 = i15;
                z = z9;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    C0049c cVar3 = (C0049c) getChildAt(i26).getLayoutParams();
                    boolean z10 = z9;
                    if (cVar3.f245d) {
                        int i29 = cVar3.f243b;
                        if (i29 < i25) {
                            j2 = 1 << i26;
                            i25 = i29;
                            i27 = 1;
                        } else if (i29 == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z9 = z10;
                    i15 = i28;
                }
                i3 = i15;
                z = z9;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    C0049c cVar4 = (C0049c) childAt2.getLayoutParams();
                    int i32 = i17;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar4.f243b == i30) {
                            j |= j3;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !cVar4.f246e || i11 != 1) {
                            z2 = z8;
                        } else {
                            int i33 = this.f231B;
                            z2 = z8;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        cVar4.f243b++;
                        cVar4.f247f = true;
                        i11--;
                    }
                    i31++;
                    i17 = i32;
                    z8 = z2;
                }
                i15 = i3;
                z9 = true;
            }
        }
        i3 = i15;
        z = z9;
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C0049c) getChildAt(0).getLayoutParams()).f246e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((C0049c) getChildAt(i34).getLayoutParams()).f246e) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0049c cVar5 = (C0049c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f244c = i35;
                        cVar5.f247f = true;
                        if (i36 == 0 && !cVar5.f246e) {
                            cVar5.leftMargin = (-i35) / 2;
                        }
                        z = true;
                    } else if (cVar5.f242a) {
                        cVar5.f244c = i35;
                        cVar5.f247f = true;
                        cVar5.rightMargin = (-i35) / 2;
                        z = true;
                    } else {
                        if (i36 != 0) {
                            cVar5.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            cVar5.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0049c cVar6 = (C0049c) childAt4.getLayoutParams();
                if (cVar6.f247f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f243b * i13) + cVar6.f244c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    /* renamed from: q */
    public C0049c mo250h() {
        C0049c cVar = new C0049c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: r */
    public C0049c mo252j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo250h();
        }
        C0049c cVar = layoutParams instanceof C0049c ? new C0049c((C0049c) layoutParams) : new C0049c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: s */
    public boolean mo259s(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0047a)) {
            z = false | ((C0047a) childAt).mo102a();
        }
        return (i <= 0 || !(childAt2 instanceof C0047a)) ? z : z | ((C0047a) childAt2).mo103b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f237v.f1744t = z;
    }

    public void setOnMenuItemClickListener(C0051e eVar) {
        this.f232C = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0346c cVar = this.f237v;
        C0346c.C0350d dVar = cVar.f1736l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f1738n = true;
        cVar.f1737m = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f236u = z;
    }

    public void setPopupTheme(int i) {
        if (this.f235t != i) {
            this.f235t = i;
            if (i == 0) {
                this.f234s = getContext();
            } else {
                this.f234s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0346c cVar) {
        this.f237v = cVar;
        cVar.f1507j = this;
        this.f233r = cVar.f1502e;
    }
}
