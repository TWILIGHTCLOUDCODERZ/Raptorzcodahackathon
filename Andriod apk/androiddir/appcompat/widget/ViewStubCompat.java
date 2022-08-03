package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p009b.p017b.C0221b;

public final class ViewStubCompat extends View {

    /* renamed from: c */
    public int f388c = 0;

    /* renamed from: d */
    public int f389d;

    /* renamed from: e */
    public WeakReference<View> f390e;

    /* renamed from: f */
    public LayoutInflater f391f;

    /* renamed from: g */
    public C0079a f392g;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0079a {
        /* renamed from: a */
        void mo516a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221b.f1180z, 0, 0);
        this.f389d = obtainStyledAttributes.getResourceId(2, -1);
        this.f388c = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo504a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f388c != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f391f;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f388c, viewGroup, false);
            int i = this.f389d;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f390e = new WeakReference<>(inflate);
            C0079a aVar = this.f392g;
            if (aVar != null) {
                aVar.mo516a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f389d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f391f;
    }

    public int getLayoutResource() {
        return this.f388c;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f389d = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f391f = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f388c = i;
    }

    public void setOnInflateListener(C0079a aVar) {
        this.f392g = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f390e;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo504a();
        }
    }
}
