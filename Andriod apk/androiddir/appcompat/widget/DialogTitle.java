package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import p009b.p017b.C0221b;
import p009b.p017b.p026h.C0335a0;

public class DialogTitle extends C0335a0 {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0221b.f1176v, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }
}
