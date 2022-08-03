package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.C0221b;
import p009b.p017b.p018c.C0222a;
import p009b.p017b.p019d.p020a.C0265a;
import p009b.p017b.p024g.C0284b;
import p009b.p017b.p024g.C0289f;
import p009b.p017b.p024g.p025i.C0307g;
import p009b.p017b.p024g.p025i.C0311i;
import p009b.p017b.p024g.p025i.C0322m;
import p009b.p017b.p024g.p025i.C0331r;
import p009b.p017b.p026h.C0335a0;
import p009b.p017b.p026h.C0336a1;
import p009b.p017b.p026h.C0346c;
import p009b.p017b.p026h.C0362e0;
import p009b.p017b.p026h.C0363e1;
import p009b.p017b.p026h.C0383l;
import p009b.p017b.p026h.C0407q0;
import p009b.p017b.p026h.C0436y0;
import p009b.p086k.p098j.C1496p;
import p009b.p104m.p105a.C1527a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public CharSequence f340A;

    /* renamed from: B */
    public ColorStateList f341B;

    /* renamed from: C */
    public ColorStateList f342C;

    /* renamed from: D */
    public boolean f343D;

    /* renamed from: E */
    public boolean f344E;

    /* renamed from: F */
    public final ArrayList<View> f345F;

    /* renamed from: G */
    public final ArrayList<View> f346G;

    /* renamed from: H */
    public final int[] f347H;

    /* renamed from: I */
    public C0076f f348I;

    /* renamed from: J */
    public final ActionMenuView.C0051e f349J;

    /* renamed from: K */
    public C0336a1 f350K;

    /* renamed from: L */
    public C0346c f351L;

    /* renamed from: M */
    public C0074d f352M;

    /* renamed from: N */
    public boolean f353N;

    /* renamed from: O */
    public final Runnable f354O;

    /* renamed from: c */
    public ActionMenuView f355c;

    /* renamed from: d */
    public TextView f356d;

    /* renamed from: e */
    public TextView f357e;

    /* renamed from: f */
    public ImageButton f358f;

    /* renamed from: g */
    public ImageView f359g;

    /* renamed from: h */
    public Drawable f360h;

    /* renamed from: i */
    public CharSequence f361i;

    /* renamed from: j */
    public ImageButton f362j;

    /* renamed from: k */
    public View f363k;

    /* renamed from: l */
    public Context f364l;

    /* renamed from: m */
    public int f365m;

    /* renamed from: n */
    public int f366n;

    /* renamed from: o */
    public int f367o;

    /* renamed from: p */
    public int f368p;

    /* renamed from: q */
    public int f369q;

    /* renamed from: r */
    public int f370r;

    /* renamed from: s */
    public int f371s;

    /* renamed from: t */
    public int f372t;

    /* renamed from: u */
    public int f373u;

    /* renamed from: v */
    public C0407q0 f374v;

    /* renamed from: w */
    public int f375w;

    /* renamed from: x */
    public int f376x;

    /* renamed from: y */
    public int f377y;

    /* renamed from: z */
    public CharSequence f378z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0071a implements ActionMenuView.C0051e {
        public C0071a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0072b implements Runnable {
        public C0072b() {
        }

        public void run() {
            Toolbar.this.mo487v();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0073c implements View.OnClickListener {
        public C0073c() {
        }

        public void onClick(View view) {
            C0074d dVar = Toolbar.this.f352M;
            C0311i iVar = dVar == null ? null : dVar.f383d;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0074d implements C0322m {

        /* renamed from: c */
        public C0307g f382c;

        /* renamed from: d */
        public C0311i f383d;

        public C0074d() {
        }

        /* renamed from: a */
        public void mo490a(C0307g gVar, boolean z) {
        }

        /* renamed from: c */
        public void mo491c(Context context, C0307g gVar) {
            C0311i iVar;
            C0307g gVar2 = this.f382c;
            if (!(gVar2 == null || (iVar = this.f383d) == null)) {
                gVar2.mo1967d(iVar);
            }
            this.f382c = gVar;
        }

        /* renamed from: e */
        public void mo492e(Parcelable parcelable) {
        }

        /* renamed from: f */
        public boolean mo493f(C0331r rVar) {
            return false;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public void mo495h(boolean z) {
            if (this.f383d != null) {
                C0307g gVar = this.f382c;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f382c.getItem(i) == this.f383d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo498k(this.f382c, this.f383d);
                }
            }
        }

        /* renamed from: i */
        public boolean mo496i() {
            return false;
        }

        /* renamed from: j */
        public Parcelable mo497j() {
            return null;
        }

        /* renamed from: k */
        public boolean mo498k(C0307g gVar, C0311i iVar) {
            View view = Toolbar.this.f363k;
            if (view instanceof C0284b) {
                ((C0284b) view).mo315e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f363k);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f362j);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f363k = null;
            int size = toolbar3.f346G.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.f346G.get(size));
                } else {
                    toolbar3.f346G.clear();
                    this.f383d = null;
                    Toolbar.this.requestLayout();
                    iVar.f1592C = false;
                    iVar.f1607n.mo1986q(false);
                    return true;
                }
            }
        }

        /* renamed from: l */
        public boolean mo499l(C0307g gVar, C0311i iVar) {
            Toolbar.this.mo395c();
            ViewParent parent = Toolbar.this.f362j.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f362j);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f362j);
            }
            Toolbar.this.f363k = iVar.getActionView();
            this.f383d = iVar;
            ViewParent parent2 = Toolbar.this.f363k.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f363k);
                }
                C0075e h = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h.f1181a = 8388611 | (toolbar4.f368p & 112);
                h.f385b = 2;
                toolbar4.f363k.setLayoutParams(h);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f363k);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((C0075e) childAt.getLayoutParams()).f385b == 2 || childAt == toolbar6.f355c)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f346G.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.f1592C = true;
            iVar.f1607n.mo1986q(false);
            View view = Toolbar.this.f363k;
            if (view instanceof C0284b) {
                ((C0284b) view).mo313c();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0075e extends C0222a.C0223a {

        /* renamed from: b */
        public int f385b = 0;

        public C0075e(int i, int i2) {
            super(i, i2);
            this.f1181a = 8388627;
        }

        public C0075e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0075e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0075e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0075e(C0075e eVar) {
            super((C0222a.C0223a) eVar);
            this.f385b = eVar.f385b;
        }

        public C0075e(C0222a.C0223a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0076f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0077g extends C1527a {
        public static final Parcelable.Creator<C0077g> CREATOR = new C0078a();

        /* renamed from: e */
        public int f386e;

        /* renamed from: f */
        public boolean f387f;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class C0078a implements Parcelable.ClassLoaderCreator<C0077g> {
            public Object createFromParcel(Parcel parcel) {
                return new C0077g(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0077g[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0077g(parcel, classLoader);
            }
        }

        public C0077g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f386e = parcel.readInt();
            this.f387f = parcel.readInt() != 0;
        }

        public C0077g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4660c, i);
            parcel.writeInt(this.f386e);
            parcel.writeInt(this.f387f ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f377y = 8388627;
        this.f345F = new ArrayList<>();
        this.f346G = new ArrayList<>();
        this.f347H = new int[2];
        this.f349J = new C0071a();
        this.f354O = new C0072b();
        Context context2 = getContext();
        int[] iArr = C0221b.f1177w;
        C0436y0 r = C0436y0.m1555r(context2, attributeSet, iArr, i, 0);
        C1496p.m3609o(this, context, iArr, attributeSet, r.f2015b, i, 0);
        this.f366n = r.mo2656m(28, 0);
        this.f367o = r.mo2656m(19, 0);
        this.f377y = r.mo2654k(0, this.f377y);
        this.f368p = r.mo2654k(2, 48);
        int e = r.mo2648e(22, 0);
        e = r.mo2659p(27) ? r.mo2648e(27, e) : e;
        this.f373u = e;
        this.f372t = e;
        this.f371s = e;
        this.f370r = e;
        int e2 = r.mo2648e(25, -1);
        if (e2 >= 0) {
            this.f370r = e2;
        }
        int e3 = r.mo2648e(24, -1);
        if (e3 >= 0) {
            this.f371s = e3;
        }
        int e4 = r.mo2648e(26, -1);
        if (e4 >= 0) {
            this.f372t = e4;
        }
        int e5 = r.mo2648e(23, -1);
        if (e5 >= 0) {
            this.f373u = e5;
        }
        this.f369q = r.mo2649f(13, -1);
        int e6 = r.mo2648e(9, Integer.MIN_VALUE);
        int e7 = r.mo2648e(5, Integer.MIN_VALUE);
        int f = r.mo2649f(7, 0);
        int f2 = r.mo2649f(8, 0);
        mo397d();
        C0407q0 q0Var = this.f374v;
        q0Var.f1920h = false;
        if (f != Integer.MIN_VALUE) {
            q0Var.f1917e = f;
            q0Var.f1913a = f;
        }
        if (f2 != Integer.MIN_VALUE) {
            q0Var.f1918f = f2;
            q0Var.f1914b = f2;
        }
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            q0Var.mo2527a(e6, e7);
        }
        this.f375w = r.mo2648e(10, Integer.MIN_VALUE);
        this.f376x = r.mo2648e(6, Integer.MIN_VALUE);
        this.f360h = r.mo2650g(4);
        this.f361i = r.mo2658o(3);
        CharSequence o = r.mo2658o(21);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = r.mo2658o(18);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.f364l = getContext();
        setPopupTheme(r.mo2656m(17, 0));
        Drawable g = r.mo2650g(16);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence o3 = r.mo2658o(15);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable g2 = r.mo2650g(11);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence o4 = r.mo2658o(12);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        if (r.mo2659p(29)) {
            setTitleTextColor(r.mo2646c(29));
        }
        if (r.mo2659p(20)) {
            setSubtitleTextColor(r.mo2646c(20));
        }
        if (r.mo2659p(14)) {
            getMenuInflater().inflate(r.mo2656m(14, 0), getMenu());
        }
        r.f2015b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0289f(getContext());
    }

    /* renamed from: a */
    public final void mo393a(List<View> list, int i) {
        AtomicInteger atomicInteger = C1496p.f4584a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0075e eVar = (C0075e) childAt.getLayoutParams();
                if (eVar.f385b == 0 && mo486u(childAt) && mo436j(eVar.f1181a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0075e eVar2 = (C0075e) childAt2.getLayoutParams();
            if (eVar2.f385b == 0 && mo486u(childAt2) && mo436j(eVar2.f1181a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void mo394b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0075e h = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0075e) layoutParams;
        h.f385b = 1;
        if (!z || this.f363k == null) {
            addView(view, h);
            return;
        }
        view.setLayoutParams(h);
        this.f346G.add(view);
    }

    /* renamed from: c */
    public void mo395c() {
        if (this.f362j == null) {
            C0383l lVar = new C0383l(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f362j = lVar;
            lVar.setImageDrawable(this.f360h);
            this.f362j.setContentDescription(this.f361i);
            C0075e h = generateDefaultLayoutParams();
            h.f1181a = 8388611 | (this.f368p & 112);
            h.f385b = 2;
            this.f362j.setLayoutParams(h);
            this.f362j.setOnClickListener(new C0073c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0075e);
    }

    /* renamed from: d */
    public final void mo397d() {
        if (this.f374v == null) {
            this.f374v = new C0407q0();
        }
    }

    /* renamed from: e */
    public final void mo398e() {
        mo399f();
        ActionMenuView actionMenuView = this.f355c;
        if (actionMenuView.f233r == null) {
            C0307g gVar = (C0307g) actionMenuView.getMenu();
            if (this.f352M == null) {
                this.f352M = new C0074d();
            }
            this.f355c.setExpandedActionViewsExclusive(true);
            gVar.mo1962b(this.f352M, this.f364l);
        }
    }

    /* renamed from: f */
    public final void mo399f() {
        if (this.f355c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f355c = actionMenuView;
            actionMenuView.setPopupTheme(this.f365m);
            this.f355c.setOnMenuItemClickListener(this.f349J);
            ActionMenuView actionMenuView2 = this.f355c;
            actionMenuView2.f238w = null;
            actionMenuView2.f239x = null;
            C0075e h = generateDefaultLayoutParams();
            h.f1181a = 8388613 | (this.f368p & 112);
            this.f355c.setLayoutParams(h);
            mo394b(this.f355c, false);
        }
    }

    /* renamed from: g */
    public final void mo400g() {
        if (this.f358f == null) {
            this.f358f = new C0383l(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            C0075e h = generateDefaultLayoutParams();
            h.f1181a = 8388611 | (this.f368p & 112);
            this.f358f.setLayoutParams(h);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0075e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f362j;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f362j;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0407q0 q0Var = this.f374v;
        if (q0Var != null) {
            return q0Var.f1919g ? q0Var.f1913a : q0Var.f1914b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f376x;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0407q0 q0Var = this.f374v;
        if (q0Var != null) {
            return q0Var.f1913a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0407q0 q0Var = this.f374v;
        if (q0Var != null) {
            return q0Var.f1914b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0407q0 q0Var = this.f374v;
        if (q0Var != null) {
            return q0Var.f1919g ? q0Var.f1914b : q0Var.f1913a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f375w;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f233r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f355c
            r1 = 0
            if (r0 == 0) goto L_0x0011
            b.b.g.i.g r0 = r0.f233r
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f376x
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = C1496p.f4584a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = C1496p.f4584a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f375w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f359g;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f359g;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo398e();
        return this.f355c.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f358f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f358f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0346c getOuterActionMenuPresenter() {
        return this.f351L;
    }

    public Drawable getOverflowIcon() {
        mo398e();
        return this.f355c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f364l;
    }

    public int getPopupTheme() {
        return this.f365m;
    }

    public CharSequence getSubtitle() {
        return this.f340A;
    }

    public final TextView getSubtitleTextView() {
        return this.f357e;
    }

    public CharSequence getTitle() {
        return this.f378z;
    }

    public int getTitleMarginBottom() {
        return this.f373u;
    }

    public int getTitleMarginEnd() {
        return this.f371s;
    }

    public int getTitleMarginStart() {
        return this.f370r;
    }

    public int getTitleMarginTop() {
        return this.f372t;
    }

    public final TextView getTitleTextView() {
        return this.f356d;
    }

    public C0362e0 getWrapper() {
        if (this.f350K == null) {
            this.f350K = new C0336a1(this, true);
        }
        return this.f350K;
    }

    /* renamed from: h */
    public C0075e generateDefaultLayoutParams() {
        return new C0075e(-2, -2);
    }

    /* renamed from: i */
    public C0075e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0075e ? new C0075e((C0075e) layoutParams) : layoutParams instanceof C0222a.C0223a ? new C0075e((C0222a.C0223a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0075e((ViewGroup.MarginLayoutParams) layoutParams) : new C0075e(layoutParams);
    }

    /* renamed from: j */
    public final int mo436j(int i) {
        AtomicInteger atomicInteger = C1496p.f4584a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int mo437k(View view, int i) {
        C0075e eVar = (C0075e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f1181a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f377y & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: l */
    public final int mo438l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* renamed from: m */
    public final int mo439m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public void mo440n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: o */
    public final boolean mo441o(View view) {
        return view.getParent() == this || this.f346G.contains(view);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f354O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f344E = false;
        }
        if (!this.f344E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f344E = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f344E = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0333 A[LOOP:3: B:120:0x0331->B:121:0x0333, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.concurrent.atomic.AtomicInteger r1 = p009b.p086k.p098j.C1496p.f4584a
            int r1 = r20.getLayoutDirection()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f347H
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r20.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            android.widget.ImageButton r13 = r0.f358f
            boolean r13 = r0.mo486u(r13)
            if (r13 == 0) goto L_0x0055
            android.widget.ImageButton r13 = r0.f358f
            if (r1 == 0) goto L_0x0050
            int r13 = r0.mo452r(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.mo451q(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f362j
            boolean r15 = r0.mo486u(r15)
            if (r15 == 0) goto L_0x006c
            android.widget.ImageButton r15 = r0.f362j
            if (r1 == 0) goto L_0x0068
            int r14 = r0.mo452r(r15, r14, r11, r12)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.mo451q(r15, r13, r11, r12)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f355c
            boolean r15 = r0.mo486u(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f355c
            if (r1 == 0) goto L_0x007d
            int r13 = r0.mo451q(r15, r13, r11, r12)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.mo452r(r15, r14, r11, r12)
        L_0x0081:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f363k
            boolean r13 = r0.mo486u(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f363k
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.mo452r(r13, r10, r11, r12)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.mo451q(r13, r2, r11, r12)
        L_0x00bc:
            android.widget.ImageView r13 = r0.f359g
            boolean r13 = r0.mo486u(r13)
            if (r13 == 0) goto L_0x00d1
            android.widget.ImageView r13 = r0.f359g
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.mo452r(r13, r10, r11, r12)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.mo451q(r13, r2, r11, r12)
        L_0x00d1:
            android.widget.TextView r13 = r0.f356d
            boolean r13 = r0.mo486u(r13)
            android.widget.TextView r14 = r0.f357e
            boolean r14 = r0.mo486u(r14)
            if (r13 == 0) goto L_0x00f8
            android.widget.TextView r15 = r0.f356d
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0075e) r15
            int r3 = r15.topMargin
            r24 = r7
            android.widget.TextView r7 = r0.f356d
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r24 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            android.widget.TextView r3 = r0.f357e
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0075e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f357e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r23 = r12
            goto L_0x0287
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            android.widget.TextView r3 = r0.f356d
            goto L_0x0129
        L_0x0127:
            android.widget.TextView r3 = r0.f357e
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            android.widget.TextView r4 = r0.f357e
            goto L_0x0130
        L_0x012e:
            android.widget.TextView r4 = r0.f356d
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0075e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0075e) r4
            if (r13 == 0) goto L_0x0146
            android.widget.TextView r15 = r0.f356d
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f357e
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.f377y
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019d
            r6 = 80
            if (r15 == r6) goto L_0x018f
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.f372t
            r25 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0178
            int r6 = r15 + r12
            goto L_0x018d
        L_0x0178:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f373u
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018d
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018d:
            int r8 = r8 + r6
            goto L_0x01ac
        L_0x018f:
            r25 = r2
            r23 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f373u
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01ac
        L_0x019d:
            r25 = r2
            r23 = r12
            int r2 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f372t
            int r8 = r2 + r3
        L_0x01ac:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b3
            int r1 = r0.f370r
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01eb
            android.widget.TextView r1 = r0.f356d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0075e) r1
            android.widget.TextView r2 = r0.f356d
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f356d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f356d
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f371s
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ec
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            if (r14 == 0) goto L_0x0212
            android.widget.TextView r1 = r0.f357e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0075e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f357e
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f357e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f357e
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f371s
            int r1 = r10 - r1
            goto L_0x0213
        L_0x0212:
            r1 = r10
        L_0x0213:
            if (r17 == 0) goto L_0x021a
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021a:
            r2 = r25
            goto L_0x0287
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.f370r
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r25
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0259
            android.widget.TextView r1 = r0.f356d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0075e) r1
            android.widget.TextView r2 = r0.f356d
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f356d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f356d
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f371s
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r14 == 0) goto L_0x027e
            android.widget.TextView r1 = r0.f357e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0075e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f357e
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f357e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f357e
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f371s
            int r1 = r1 + r4
            goto L_0x027f
        L_0x027e:
            r1 = r3
        L_0x027f:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0287
        L_0x0286:
            r2 = r3
        L_0x0287:
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            r3 = 3
            r0.mo393a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0295:
            if (r2 >= r1) goto L_0x02a8
            java.util.ArrayList<android.view.View> r4 = r0.f345F
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.mo451q(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0295
        L_0x02a8:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            r2 = 5
            r0.mo393a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            int r1 = r1.size()
            r2 = 0
        L_0x02b7:
            if (r2 >= r1) goto L_0x02c8
            java.util.ArrayList<android.view.View> r4 = r0.f345F
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo452r(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02c8:
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            r2 = 1
            r0.mo393a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02dc:
            if (r5 >= r4) goto L_0x030f
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.C0075e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02dc
        L_0x030f:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031f
            goto L_0x0326
        L_0x031f:
            if (r6 <= r10) goto L_0x0325
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0326
        L_0x0325:
            r3 = r4
        L_0x0326:
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x0331:
            if (r3 >= r1) goto L_0x0342
            java.util.ArrayList<android.view.View> r4 = r0.f345F
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo451q(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x0331
        L_0x0342:
            java.util.ArrayList<android.view.View> r1 = r0.f345F
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f347H;
        boolean z = true;
        int i10 = 0;
        if (C0363e1.m1405b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (mo486u(this.f358f)) {
            mo485t(this.f358f, i, 0, i2, 0, this.f369q);
            i5 = mo438l(this.f358f) + this.f358f.getMeasuredWidth();
            i4 = Math.max(0, mo439m(this.f358f) + this.f358f.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.f358f.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo486u(this.f362j)) {
            mo485t(this.f362j, i, 0, i2, 0, this.f369q);
            i5 = mo438l(this.f362j) + this.f362j.getMeasuredWidth();
            i4 = Math.max(i4, mo439m(this.f362j) + this.f362j.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f362j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (mo486u(this.f355c)) {
            mo485t(this.f355c, i, max, i2, 0, this.f369q);
            i6 = mo438l(this.f355c) + this.f355c.getMeasuredWidth();
            i4 = Math.max(i4, mo439m(this.f355c) + this.f355c.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f355c.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo486u(this.f363k)) {
            max2 += mo453s(this.f363k, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo439m(this.f363k) + this.f363k.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f363k.getMeasuredState());
        }
        if (mo486u(this.f359g)) {
            max2 += mo453s(this.f359g, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo439m(this.f359g) + this.f359g.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f359g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0075e) childAt.getLayoutParams()).f385b == 0 && mo486u(childAt)) {
                View view = childAt;
                max2 += mo453s(childAt, i, max2, i2, 0, iArr);
                View view2 = view;
                i4 = Math.max(i4, mo439m(view2) + view.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
            }
        }
        int i12 = this.f372t + this.f373u;
        int i13 = this.f370r + this.f371s;
        if (mo486u(this.f356d)) {
            mo453s(this.f356d, i, max2 + i13, i2, i12, iArr);
            int l = mo438l(this.f356d) + this.f356d.getMeasuredWidth();
            i7 = mo439m(this.f356d) + this.f356d.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.f356d.getMeasuredState());
            i8 = l;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (mo486u(this.f357e)) {
            i8 = Math.max(i8, mo453s(this.f357e, i, max2 + i13, i2, i7 + i12, iArr));
            i7 = mo439m(this.f357e) + this.f357e.getMeasuredHeight() + i7;
            i9 = View.combineMeasuredStates(i9, this.f357e.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f353N) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (mo486u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        z = false;
        if (!z) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0077g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0077g gVar = (C0077g) parcelable;
        super.onRestoreInstanceState(gVar.f4660c);
        ActionMenuView actionMenuView = this.f355c;
        C0307g gVar2 = actionMenuView != null ? actionMenuView.f233r : null;
        int i = gVar.f386e;
        if (!(i == 0 || this.f352M == null || gVar2 == null || (findItem = gVar2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f387f) {
            removeCallbacks(this.f354O);
            post(this.f354O);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.mo397d()
            b.b.h.q0 r0 = r2.f374v
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f1919g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f1919g = r1
            boolean r3 = r0.f1920h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f1916d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f1917e
        L_0x0023:
            r0.f1913a = r1
            int r1 = r0.f1915c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f1915c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f1917e
        L_0x0031:
            r0.f1913a = r1
            int r1 = r0.f1916d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f1917e
            r0.f1913a = r3
        L_0x003c:
            int r1 = r0.f1918f
        L_0x003e:
            r0.f1914b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        C0311i iVar;
        C0077g gVar = new C0077g(super.onSaveInstanceState());
        C0074d dVar = this.f352M;
        if (!(dVar == null || (iVar = dVar.f383d) == null)) {
            gVar.f386e = iVar.f1594a;
        }
        gVar.f387f = mo450p();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f343D = false;
        }
        if (!this.f343D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f343D = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f343D = false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo450p() {
        ActionMenuView actionMenuView = this.f355c;
        if (actionMenuView != null) {
            C0346c cVar = actionMenuView.f237v;
            if (cVar != null && cVar.mo2283o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final int mo451q(View view, int i, int[] iArr, int i2) {
        C0075e eVar = (C0075e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = mo437k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + eVar.rightMargin + max;
    }

    /* renamed from: r */
    public final int mo452r(View view, int i, int[] iArr, int i2) {
        C0075e eVar = (C0075e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = mo437k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: s */
    public final int mo453s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo395c();
        }
        ImageButton imageButton = this.f362j;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0265a.m1035a(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo395c();
            this.f362j.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f362j;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f360h);
        }
    }

    public void setCollapsible(boolean z) {
        this.f353N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f376x) {
            this.f376x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f375w) {
            this.f375w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0265a.m1035a(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f359g == null) {
                this.f359g = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!mo441o(this.f359g)) {
                mo394b(this.f359g, true);
            }
        } else {
            ImageView imageView = this.f359g;
            if (imageView != null && mo441o(imageView)) {
                removeView(this.f359g);
                this.f346G.remove(this.f359g);
            }
        }
        ImageView imageView2 = this.f359g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f359g == null) {
            this.f359g = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.f359g;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo400g();
        }
        ImageButton imageButton = this.f358f;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0265a.m1035a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo400g();
            if (!mo441o(this.f358f)) {
                mo394b(this.f358f, true);
            }
        } else {
            ImageButton imageButton = this.f358f;
            if (imageButton != null && mo441o(imageButton)) {
                removeView(this.f358f);
                this.f346G.remove(this.f358f);
            }
        }
        ImageButton imageButton2 = this.f358f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo400g();
        this.f358f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0076f fVar) {
        this.f348I = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo398e();
        this.f355c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f365m != i) {
            this.f365m = i;
            if (i == 0) {
                this.f364l = getContext();
            } else {
                this.f364l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f357e == null) {
                Context context = getContext();
                C0335a0 a0Var = new C0335a0(context, (AttributeSet) null);
                this.f357e = a0Var;
                a0Var.setSingleLine();
                this.f357e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f367o;
                if (i != 0) {
                    this.f357e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f342C;
                if (colorStateList != null) {
                    this.f357e.setTextColor(colorStateList);
                }
            }
            if (!mo441o(this.f357e)) {
                mo394b(this.f357e, true);
            }
        } else {
            TextView textView = this.f357e;
            if (textView != null && mo441o(textView)) {
                removeView(this.f357e);
                this.f346G.remove(this.f357e);
            }
        }
        TextView textView2 = this.f357e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f340A = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f342C = colorStateList;
        TextView textView = this.f357e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f356d == null) {
                Context context = getContext();
                C0335a0 a0Var = new C0335a0(context, (AttributeSet) null);
                this.f356d = a0Var;
                a0Var.setSingleLine();
                this.f356d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f366n;
                if (i != 0) {
                    this.f356d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f341B;
                if (colorStateList != null) {
                    this.f356d.setTextColor(colorStateList);
                }
            }
            if (!mo441o(this.f356d)) {
                mo394b(this.f356d, true);
            }
        } else {
            TextView textView = this.f356d;
            if (textView != null && mo441o(textView)) {
                removeView(this.f356d);
                this.f346G.remove(this.f356d);
            }
        }
        TextView textView2 = this.f356d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f378z = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f373u = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f371s = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f370r = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f372t = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f341B = colorStateList;
        TextView textView = this.f356d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final void mo485t(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: u */
    public final boolean mo486u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: v */
    public boolean mo487v() {
        ActionMenuView actionMenuView = this.f355c;
        if (actionMenuView != null) {
            C0346c cVar = actionMenuView.f237v;
            if (cVar != null && cVar.mo2284p()) {
                return true;
            }
        }
        return false;
    }
}
