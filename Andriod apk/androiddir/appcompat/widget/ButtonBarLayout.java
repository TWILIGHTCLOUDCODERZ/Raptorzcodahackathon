package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.C0221b;
import p009b.p086k.p098j.C1496p;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c */
    public boolean f252c;

    /* renamed from: d */
    public int f253d = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0221b.f1165k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1496p.m3609o(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f252c = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int mo286a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo287b() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f252c) {
            if (size > this.f253d && mo287b()) {
                setStacked(false);
            }
            this.f253d = size;
        }
        if (mo287b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f252c && !mo287b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = mo286a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (mo287b()) {
                int a2 = mo286a(a + 1);
                i4 = a2 >= 0 ? getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        AtomicInteger atomicInteger = C1496p.f4584a;
        if (getMinimumHeight() != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f252c != z) {
            this.f252c = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
