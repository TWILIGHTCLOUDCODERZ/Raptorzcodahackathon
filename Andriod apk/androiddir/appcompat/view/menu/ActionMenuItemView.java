package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import p009b.p017b.C0220a;
import p009b.p017b.C0221b;
import p009b.p017b.p024g.p025i.C0307g;
import p009b.p017b.p024g.p025i.C0311i;
import p009b.p017b.p024g.p025i.C0324n;
import p009b.p017b.p024g.p025i.C0327p;
import p009b.p017b.p026h.C0335a0;
import p009b.p017b.p026h.C0346c;
import p009b.p017b.p026h.C0374i0;

public class ActionMenuItemView extends C0335a0 implements C0324n.C0325a, View.OnClickListener, ActionMenuView.C0047a {

    /* renamed from: h */
    public C0311i f141h;

    /* renamed from: i */
    public CharSequence f142i;

    /* renamed from: j */
    public Drawable f143j;

    /* renamed from: k */
    public C0307g.C0309b f144k;

    /* renamed from: l */
    public C0374i0 f145l;

    /* renamed from: m */
    public C0040b f146m;

    /* renamed from: n */
    public boolean f147n = mo107i();

    /* renamed from: o */
    public boolean f148o;

    /* renamed from: p */
    public int f149p;

    /* renamed from: q */
    public int f150q;

    /* renamed from: r */
    public int f151r;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0039a extends C0374i0 {
        public C0039a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0327p mo122b() {
            C0346c.C0347a aVar;
            C0040b bVar = ActionMenuItemView.this.f146m;
            if (bVar == null || (aVar = C0346c.this.f1748x) == null) {
                return null;
            }
            return aVar.mo2119a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo122b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo123c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                b.b.g.i.g$b r1 = r0.f144k
                r2 = 0
                if (r1 == 0) goto L_0x001c
                b.b.g.i.i r0 = r0.f141h
                boolean r0 = r1.mo124a(r0)
                if (r0 == 0) goto L_0x001c
                b.b.g.i.p r0 = r3.mo122b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo1914b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0039a.mo123c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0040b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221b.f1157c, 0, 0);
        this.f149p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f151r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f150q = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public boolean mo102a() {
        return mo105e();
    }

    /* renamed from: b */
    public boolean mo103b() {
        return mo105e() && this.f141h.getIcon() == null;
    }

    /* renamed from: d */
    public void mo104d(C0311i iVar, int i) {
        this.f141h = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.f1594a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f145l == null) {
            this.f145l = new C0039a();
        }
    }

    /* renamed from: e */
    public boolean mo105e() {
        return !TextUtils.isEmpty(getText());
    }

    public C0311i getItemData() {
        return this.f141h;
    }

    /* renamed from: i */
    public final boolean mo107i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: k */
    public final void mo108k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f142i);
        if (this.f143j != null) {
            if (!((this.f141h.f1618y & 4) == 4) || (!this.f147n && !this.f148o)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f142i : null);
        CharSequence charSequence2 = this.f141h.f1610q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f141h.f1598e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f141h.f1611r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f141h.f1598e;
            }
            C0220a.m867r(this, charSequence);
            return;
        }
        C0220a.m867r(this, charSequence3);
    }

    public void onClick(View view) {
        C0307g.C0309b bVar = this.f144k;
        if (bVar != null) {
            bVar.mo124a(this.f141h);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f147n = mo107i();
        mo108k();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean e = mo105e();
        if (e && (i3 = this.f150q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f149p) : this.f149p;
        if (mode != 1073741824 && this.f149p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!e && this.f143j != null) {
            super.setPadding((getMeasuredWidth() - this.f143j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0374i0 i0Var;
        if (!this.f141h.hasSubMenu() || (i0Var = this.f145l) == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f148o != z) {
            this.f148o = z;
            C0311i iVar = this.f141h;
            if (iVar != null) {
                iVar.f1607n.mo1983p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f143j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f151r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo108k();
    }

    public void setItemInvoker(C0307g.C0309b bVar) {
        this.f144k = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f150q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0040b bVar) {
        this.f146m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f142i = charSequence;
        mo108k();
    }
}
