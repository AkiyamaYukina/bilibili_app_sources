package com.bilibili.studio.editor.moudle.sticker.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.mobile.BLMobileHumanActionNative;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/SquareSimpleDraweeView.class */
public class SquareSimpleDraweeView extends BiliImageView {
    public SquareSimpleDraweeView(Context context) {
        super(context);
    }

    public SquareSimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(ImageView.getDefaultSize(0, i7), ImageView.getDefaultSize(0, i8));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
