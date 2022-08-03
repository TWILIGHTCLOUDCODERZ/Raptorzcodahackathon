package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.lang.ref.WeakReference;
import p009b.p017b.C0221b;
import p009b.p017b.p018c.C0253o;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f75A;

    /* renamed from: B */
    public int f76B = 0;

    /* renamed from: C */
    public Drawable f77C;

    /* renamed from: D */
    public ImageView f78D;

    /* renamed from: E */
    public TextView f79E;

    /* renamed from: F */
    public TextView f80F;

    /* renamed from: G */
    public View f81G;

    /* renamed from: H */
    public ListAdapter f82H;

    /* renamed from: I */
    public int f83I = -1;

    /* renamed from: J */
    public int f84J;

    /* renamed from: K */
    public int f85K;

    /* renamed from: L */
    public int f86L;

    /* renamed from: M */
    public int f87M;

    /* renamed from: N */
    public int f88N;

    /* renamed from: O */
    public int f89O;

    /* renamed from: P */
    public boolean f90P;

    /* renamed from: Q */
    public Handler f91Q;

    /* renamed from: R */
    public final View.OnClickListener f92R = new C0035a();

    /* renamed from: a */
    public final Context f93a;

    /* renamed from: b */
    public final C0253o f94b;

    /* renamed from: c */
    public final Window f95c;

    /* renamed from: d */
    public final int f96d;

    /* renamed from: e */
    public CharSequence f97e;

    /* renamed from: f */
    public CharSequence f98f;

    /* renamed from: g */
    public ListView f99g;

    /* renamed from: h */
    public View f100h;

    /* renamed from: i */
    public int f101i;

    /* renamed from: j */
    public int f102j;

    /* renamed from: k */
    public int f103k;

    /* renamed from: l */
    public int f104l;

    /* renamed from: m */
    public int f105m;

    /* renamed from: n */
    public boolean f106n = false;

    /* renamed from: o */
    public Button f107o;

    /* renamed from: p */
    public CharSequence f108p;

    /* renamed from: q */
    public Message f109q;

    /* renamed from: r */
    public Drawable f110r;

    /* renamed from: s */
    public Button f111s;

    /* renamed from: t */
    public CharSequence f112t;

    /* renamed from: u */
    public Message f113u;

    /* renamed from: v */
    public Drawable f114v;

    /* renamed from: w */
    public Button f115w;

    /* renamed from: x */
    public CharSequence f116x;

    /* renamed from: y */
    public Message f117y;

    /* renamed from: z */
    public Drawable f118z;

    public static class RecycleListView extends ListView {

        /* renamed from: c */
        public final int f119c;

        /* renamed from: d */
        public final int f120d;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221b.f1173s);
            this.f120d = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f119c = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0035a implements View.OnClickListener {
        public C0035a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f117y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f107o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f109q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f111s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f113u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f115w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f117y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f91Q
                r1 = 1
                b.b.c.o r3 = r3.f94b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0035a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0036b {

        /* renamed from: a */
        public final Context f122a;

        /* renamed from: b */
        public final LayoutInflater f123b;

        /* renamed from: c */
        public Drawable f124c;

        /* renamed from: d */
        public CharSequence f125d;

        /* renamed from: e */
        public View f126e;

        /* renamed from: f */
        public CharSequence f127f;

        /* renamed from: g */
        public CharSequence f128g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f129h;

        /* renamed from: i */
        public CharSequence f130i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f131j;

        /* renamed from: k */
        public CharSequence f132k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f133l;

        /* renamed from: m */
        public DialogInterface.OnDismissListener f134m;

        /* renamed from: n */
        public DialogInterface.OnKeyListener f135n;

        /* renamed from: o */
        public ListAdapter f136o;

        /* renamed from: p */
        public DialogInterface.OnClickListener f137p;

        /* renamed from: q */
        public boolean f138q;

        /* renamed from: r */
        public int f139r = -1;

        public C0036b(Context context) {
            this.f122a = context;
            this.f123b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0037c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f140a;

        public C0037c(DialogInterface dialogInterface) {
            this.f140a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f140a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0038d extends ArrayAdapter<CharSequence> {
        public C0038d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0253o oVar, Window window) {
        this.f93a = context;
        this.f94b = oVar;
        this.f95c = window;
        this.f91Q = new C0037c(oVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0221b.f1159e, R.attr.alertDialogStyle, 0);
        this.f84J = obtainStyledAttributes.getResourceId(0, 0);
        this.f85K = obtainStyledAttributes.getResourceId(2, 0);
        this.f86L = obtainStyledAttributes.getResourceId(4, 0);
        this.f87M = obtainStyledAttributes.getResourceId(5, 0);
        this.f88N = obtainStyledAttributes.getResourceId(7, 0);
        this.f89O = obtainStyledAttributes.getResourceId(3, 0);
        this.f90P = obtainStyledAttributes.getBoolean(6, true);
        this.f96d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        oVar.mo1667a().mo1605t(1);
    }

    /* renamed from: a */
    public static boolean m32a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m32a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m33c(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo95b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup mo96d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public void mo97e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f91Q.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f116x = charSequence;
            this.f117y = obtainMessage;
            this.f118z = null;
        } else if (i == -2) {
            this.f112t = charSequence;
            this.f113u = obtainMessage;
            this.f114v = null;
        } else if (i == -1) {
            this.f108p = charSequence;
            this.f109q = obtainMessage;
            this.f110r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
