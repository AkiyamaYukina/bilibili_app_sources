package com.bilibili.upper.module.cover_v2.widgets;

import EH0.p;
import SH0.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.mobile.BLMobileHumanActionNative;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiRatioPlaceHolderView.class */
@StabilityInferred(parameters = 0)
public final class MultiRatioPlaceHolderView extends FrameLayout {
    public MultiRatioPlaceHolderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        float size = View.MeasureSpec.getSize(i7);
        int i9 = b.f22895a;
        p.f4125a.getClass();
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (size / (p.g() ? 1.7772512f : 1.3392857f)), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }
}
