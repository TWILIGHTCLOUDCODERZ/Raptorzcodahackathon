package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import p009b.p072f.C1231b;
import p009b.p072f.p073c.C1232a;
import p009b.p072f.p073c.C1233b;
import p009b.p072f.p073c.C1234c;
import p009b.p072f.p073c.C1235d;

public class CardView extends FrameLayout {

    /* renamed from: j */
    public static final int[] f431j = {16842801};

    /* renamed from: k */
    public static final C1234c f432k = new C1232a();

    /* renamed from: c */
    public boolean f433c;

    /* renamed from: d */
    public boolean f434d;

    /* renamed from: e */
    public int f435e;

    /* renamed from: f */
    public int f436f;

    /* renamed from: g */
    public final Rect f437g;

    /* renamed from: h */
    public final Rect f438h = new Rect();

    /* renamed from: i */
    public final C1233b f439i;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0086a implements C1233b {

        /* renamed from: a */
        public Drawable f440a;

        public C0086a() {
        }

        /* renamed from: a */
        public boolean mo581a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: b */
        public void mo582b(int i, int i2, int i3, int i4) {
            CardView.this.f438h.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f437g;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        ColorStateList colorStateList;
        Resources resources;
        int i;
        Rect rect = new Rect();
        this.f437g = rect;
        C0086a aVar = new C0086a();
        this.f439i = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1231b.f3693a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f431j);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i = R.color.cardview_dark_background;
            }
            colorStateList = ColorStateList.valueOf(resources.getColor(i));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f433c = obtainStyledAttributes.getBoolean(7, false);
        this.f434d = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f435e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f436f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1235d dVar = new C1235d(colorStateList, dimension);
        aVar.f440a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((C1232a) f432k).mo3636b(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1235d) ((C0086a) this.f439i).f440a).f3701h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f437g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f437g.left;
    }

    public int getContentPaddingRight() {
        return this.f437g.right;
    }

    public int getContentPaddingTop() {
        return this.f437g.top;
    }

    public float getMaxCardElevation() {
        return ((C1235d) ((C0086a) this.f439i).f440a).f3698e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f434d;
    }

    public float getRadius() {
        return ((C1235d) ((C0086a) this.f439i).f440a).f3694a;
    }

    public boolean getUseCompatPadding() {
        return this.f433c;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        C1233b bVar = this.f439i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C1235d dVar = (C1235d) ((C0086a) bVar).f440a;
        dVar.mo3638b(valueOf);
        dVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ((C1232a) f432k).mo3636b(this.f439i, f);
    }

    public void setMinimumHeight(int i) {
        this.f436f = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f435e = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f434d) {
            this.f434d = z;
            C1234c cVar = f432k;
            C1233b bVar = this.f439i;
            C1232a aVar = (C1232a) cVar;
            aVar.mo3636b(bVar, aVar.mo3635a(bVar).f3698e);
        }
    }

    public void setRadius(float f) {
        C1235d dVar = (C1235d) ((C0086a) this.f439i).f440a;
        if (f != dVar.f3694a) {
            dVar.f3694a = f;
            dVar.mo3639c((Rect) null);
            dVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f433c != z) {
            this.f433c = z;
            C1234c cVar = f432k;
            C1233b bVar = this.f439i;
            C1232a aVar = (C1232a) cVar;
            aVar.mo3636b(bVar, aVar.mo3635a(bVar).f3698e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1235d dVar = (C1235d) ((C0086a) this.f439i).f440a;
        dVar.mo3638b(colorStateList);
        dVar.invalidateSelf();
    }
}
