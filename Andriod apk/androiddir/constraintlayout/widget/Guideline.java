package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0087a aVar = (ConstraintLayout.C0087a) getLayoutParams();
        aVar.f490a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0087a aVar = (ConstraintLayout.C0087a) getLayoutParams();
        aVar.f492b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0087a aVar = (ConstraintLayout.C0087a) getLayoutParams();
        aVar.f494c = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
