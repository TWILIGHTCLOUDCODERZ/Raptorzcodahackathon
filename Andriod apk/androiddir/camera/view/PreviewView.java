package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p009b.p017b.C0220a;
import p009b.p049e.p058b.C0861e3;
import p009b.p049e.p058b.C0887g3;
import p009b.p049e.p058b.C1157u2;
import p009b.p049e.p058b.C1168w2;
import p009b.p049e.p058b.C1170x0;
import p009b.p049e.p058b.C1172x2;
import p009b.p049e.p058b.p059i3.C1004k0;
import p009b.p049e.p058b.p059i3.C1006l;
import p009b.p049e.p058b.p059i3.C1008l1;
import p009b.p049e.p058b.p059i3.C1012m0;
import p009b.p049e.p058b.p059i3.C1028q1;
import p009b.p049e.p067d.C1195a0;
import p009b.p049e.p067d.C1197b0;
import p009b.p049e.p067d.C1202d;
import p009b.p049e.p067d.C1204e;
import p009b.p049e.p067d.C1205f;
import p009b.p049e.p067d.C1206g;
import p009b.p049e.p067d.C1216q;
import p009b.p049e.p067d.C1219t;
import p009b.p049e.p067d.C1220u;
import p009b.p049e.p067d.C1221v;
import p009b.p049e.p067d.C1223w;
import p009b.p049e.p067d.C1224x;
import p009b.p049e.p067d.C1225y;
import p009b.p049e.p067d.p068c0.p069a.p070a.C1199a;
import p009b.p049e.p067d.p068c0.p069a.p070a.C1201c;
import p009b.p049e.p067d.p071d0.C1203a;
import p009b.p086k.p087b.C1341c;
import p009b.p086k.p088c.C1375a;
import p009b.p086k.p098j.C1496p;
import p009b.p114q.C1675n;
import p133c.p149b.p152b.p153a.C2108a;

public final class PreviewView extends FrameLayout {

    /* renamed from: c */
    public C0082b f405c = C0082b.PERFORMANCE;

    /* renamed from: d */
    public C1221v f406d;

    /* renamed from: e */
    public final C1220u f407e;

    /* renamed from: f */
    public final C1675n<C0085e> f408f;

    /* renamed from: g */
    public final AtomicReference<C1219t> f409g;

    /* renamed from: h */
    public C1223w f410h;

    /* renamed from: i */
    public final ScaleGestureDetector f411i;

    /* renamed from: j */
    public final View.OnLayoutChangeListener f412j;

    /* renamed from: k */
    public final C1172x2.C1176d f413k;

    /* renamed from: androidx.camera.view.PreviewView$a */
    public class C0081a implements C1172x2.C1176d {
        public C0081a() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public void mo557a(C0861e3 e3Var) {
            C1221v vVar;
            if (!C0220a.m863n()) {
                C1375a.m3375b(PreviewView.this.getContext()).execute(new C1205f(this, e3Var));
                return;
            }
            C1157u2.m2791a("PreviewView", "Surface requested by Preview.", (Throwable) null);
            C1012m0 m0Var = e3Var.f2947c;
            Executor b = C1375a.m3375b(PreviewView.this.getContext());
            C1204e eVar = new C1204e(this, m0Var, e3Var);
            e3Var.f2954j = eVar;
            e3Var.f2955k = b;
            C0861e3.C0868g gVar = e3Var.f2953i;
            if (gVar != null) {
                b.execute(new C1170x0(eVar, gVar));
            }
            PreviewView previewView = PreviewView.this;
            C0082b bVar = previewView.f405c;
            boolean equals = e3Var.f2947c.mo3199g().mo2892c().equals("androidx.camera.camera2.legacy");
            boolean z = true;
            boolean z2 = C1199a.f3634a.mo3489a(C1201c.class) != null;
            if (!e3Var.f2946b && Build.VERSION.SDK_INT > 24 && !equals && !z2) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    z = false;
                } else if (ordinal != 1) {
                    throw new IllegalArgumentException("Invalid implementation mode: " + bVar);
                }
            }
            if (z) {
                PreviewView previewView2 = PreviewView.this;
                vVar = new C1195a0(previewView2, previewView2.f407e);
            } else {
                PreviewView previewView3 = PreviewView.this;
                vVar = new C1225y(previewView3, previewView3.f407e);
            }
            previewView.f406d = vVar;
            C1004k0 g = m0Var.mo3199g();
            PreviewView previewView4 = PreviewView.this;
            C1219t tVar = new C1219t(g, previewView4.f408f, previewView4.f406d);
            PreviewView.this.f409g.set(tVar);
            C1028q1<C1012m0.C1013a> l = m0Var.mo3204l();
            Executor b2 = C1375a.m3375b(PreviewView.this.getContext());
            C1008l1 l1Var = (C1008l1) l;
            synchronized (l1Var.f3225b) {
                C1008l1.C1009a aVar = l1Var.f3225b.get(tVar);
                if (aVar != null) {
                    aVar.f3226a.set(false);
                }
                C1008l1.C1009a aVar2 = new C1008l1.C1009a(b2, tVar);
                l1Var.f3225b.put(tVar, aVar2);
                C0220a.m864o().execute(new C1006l(l1Var, aVar, aVar2));
            }
            PreviewView.this.f406d.mo3605e(e3Var, new C1202d(this, tVar, m0Var));
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    public enum C0082b {
        PERFORMANCE(0),
        COMPATIBLE(1);
        

        /* renamed from: c */
        public final int f418c;

        /* access modifiers changed from: public */
        C0082b(int i) {
            this.f418c = i;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    public class C0083c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C0083c() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Objects.requireNonNull(PreviewView.this);
            return true;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    public enum C0084d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: c */
        public final int f427c;

        /* access modifiers changed from: public */
        C0084d(int i) {
            this.f427c = i;
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$e */
    public enum C0085e {
        IDLE,
        STREAMING
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        C1220u uVar = new C1220u();
        this.f407e = uVar;
        this.f408f = new C1675n<>(C0085e.IDLE);
        this.f409g = new AtomicReference<>();
        this.f410h = new C1223w(uVar);
        this.f412j = new C1206g(this);
        this.f413k = new C0081a();
        C0220a.m853d();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C1224x.f3681a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C1496p.m3609o(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, uVar.f3676g.f427c);
            C0084d[] values = C0084d.values();
            for (int i = 0; i < 6; i++) {
                C0084d dVar = values[i];
                if (dVar.f427c == integer) {
                    setScaleType(dVar);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    C0082b[] values2 = C0082b.values();
                    for (int i2 = 0; i2 < 2; i2++) {
                        C0082b bVar = values2[i2];
                        if (bVar.f418c == integer2) {
                            setImplementationMode(bVar);
                            obtainStyledAttributes.recycle();
                            this.f411i = new ScaleGestureDetector(context, new C0083c());
                            if (getBackground() == null) {
                                Context context2 = getContext();
                                Object obj = C1375a.f4363a;
                                setBackgroundColor(context2.getColor(17170444));
                                return;
                            }
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    StringBuilder o = C2108a.m5005o("Unexpected scale type: ");
                    o.append(getScaleType());
                    throw new IllegalStateException(o.toString());
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo540a() {
        C1221v vVar = this.f406d;
        if (vVar != null) {
            vVar.mo3625f();
        }
        C1223w wVar = this.f410h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        Objects.requireNonNull(wVar);
        C0220a.m853d();
        synchronized (wVar) {
            if (size.getWidth() != 0) {
                if (size.getHeight() != 0) {
                    wVar.f3680a.mo3619a(size, layoutDirection);
                }
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap b;
        C0220a.m853d();
        C1221v vVar = this.f406d;
        if (vVar == null || (b = vVar.mo3602b()) == null) {
            return null;
        }
        C1220u uVar = vVar.f3679c;
        Size size = new Size(vVar.f3678b.getWidth(), vVar.f3678b.getHeight());
        int layoutDirection = vVar.f3678b.getLayoutDirection();
        if (!uVar.mo3624f()) {
            return b;
        }
        Matrix d = uVar.mo3622d();
        RectF e = uVar.mo3623e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / ((float) uVar.f3670a.getWidth()), e.height() / ((float) uVar.f3670a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(b, matrix, new Paint(7));
        return createBitmap;
    }

    public C1216q getController() {
        C0220a.m853d();
        return null;
    }

    public C0082b getImplementationMode() {
        C0220a.m853d();
        return this.f405c;
    }

    public C1168w2 getMeteringPointFactory() {
        C0220a.m853d();
        return this.f410h;
    }

    public C1203a getOutputTransform() {
        Matrix matrix;
        C0220a.m853d();
        try {
            matrix = this.f407e.mo3621c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = this.f407e.f3671b;
        if (matrix == null || rect == null) {
            C1157u2.m2791a("PreviewView", "Transform info is not ready", (Throwable) null);
            return null;
        }
        RectF rectF = C1197b0.f3632a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(C1197b0.f3632a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.f406d instanceof C1195a0) {
            matrix.postConcat(getMatrix());
        } else {
            C1157u2.m2796f("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.", (Throwable) null);
        }
        return new C1203a(matrix, new Size(rect.width(), rect.height()));
    }

    public LiveData<C0085e> getPreviewStreamState() {
        return this.f408f;
    }

    public C0084d getScaleType() {
        C0220a.m853d();
        return this.f407e.f3676g;
    }

    public C1172x2.C1176d getSurfaceProvider() {
        C0220a.m853d();
        return this.f413k;
    }

    public C0887g3 getViewPort() {
        C0220a.m853d();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        C0220a.m853d();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        C1341c.m3308i(rational, "The crop aspect ratio must be set.");
        return new C0887g3(viewPortScaleType, rational, rotation, layoutDirection);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f412j);
        C1221v vVar = this.f406d;
        if (vVar != null) {
            vVar.mo3603c();
        }
        getDisplay();
        getViewPort();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f412j);
        C1221v vVar = this.f406d;
        if (vVar != null) {
            vVar.mo3604d();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setController(C1216q qVar) {
        C0220a.m853d();
        getDisplay();
        getViewPort();
    }

    public void setImplementationMode(C0082b bVar) {
        C0220a.m853d();
        this.f405c = bVar;
    }

    public void setScaleType(C0084d dVar) {
        C0220a.m853d();
        this.f407e.f3676g = dVar;
        mo540a();
        getDisplay();
        getViewPort();
    }
}
