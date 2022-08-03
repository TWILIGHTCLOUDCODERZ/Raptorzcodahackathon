package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: c */
    public final int f393c = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: d */
    public final int f394d = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f393c * 2), this.f394d), 1073741824), i2);
    }
}
