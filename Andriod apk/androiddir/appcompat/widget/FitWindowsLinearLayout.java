package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p009b.p017b.p026h.C0372h0;

public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: c */
    public C0372h0 f263c;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        C0372h0 h0Var = this.f263c;
        if (h0Var != null) {
            h0Var.mo2380a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0372h0 h0Var) {
        this.f263c = h0Var;
    }
}
