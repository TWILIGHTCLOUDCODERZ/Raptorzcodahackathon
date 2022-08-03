package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p009b.p017b.p026h.C0361e;
import p009b.p017b.p026h.C0390m;
import p009b.p017b.p026h.C0415t0;
import p009b.p017b.p026h.C0419v0;
import p009b.p017b.p026h.C0431w0;

public class AppCompatImageView extends ImageView {

    /* renamed from: c */
    public final C0361e f250c;

    /* renamed from: d */
    public final C0390m f251d;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0419v0.m1505a(context);
        C0415t0.m1496a(this, getContext());
        C0361e eVar = new C0361e(this);
        this.f250c = eVar;
        eVar.mo2314d(attributeSet, i);
        C0390m mVar = new C0390m(this);
        this.f251d = mVar;
        mVar.mo2481b(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0361e eVar = this.f250c;
        if (eVar != null) {
            eVar.mo2311a();
        }
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2480a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0361e eVar = this.f250c;
        if (eVar != null) {
            return eVar.mo2312b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0361e eVar = this.f250c;
        if (eVar != null) {
            return eVar.mo2313c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0431w0 w0Var;
        C0390m mVar = this.f251d;
        if (mVar == null || (w0Var = mVar.f1887b) == null) {
            return null;
        }
        return w0Var.f1991a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0431w0 w0Var;
        C0390m mVar = this.f251d;
        if (mVar == null || (w0Var = mVar.f1887b) == null) {
            return null;
        }
        return w0Var.f1992b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f251d.f1886a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0361e eVar = this.f250c;
        if (eVar != null) {
            eVar.mo2315e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0361e eVar = this.f250c;
        if (eVar != null) {
            eVar.mo2316f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2480a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2480a();
        }
    }

    public void setImageResource(int i) {
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2482c(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2480a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0361e eVar = this.f250c;
        if (eVar != null) {
            eVar.mo2318h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0361e eVar = this.f250c;
        if (eVar != null) {
            eVar.mo2319i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2483d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0390m mVar = this.f251d;
        if (mVar != null) {
            mVar.mo2484e(mode);
        }
    }
}
