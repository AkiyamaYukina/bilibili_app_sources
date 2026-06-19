package com.bilibili.opd.app.bizcommon.imageselector.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintRelativeLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/SquareRelativeLayout.class */
@StabilityInferred(parameters = 0)
public class SquareRelativeLayout extends TintRelativeLayout {
    public SquareRelativeLayout(@Nullable Context context) {
        super(context);
    }

    public SquareRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i7);
    }
}
