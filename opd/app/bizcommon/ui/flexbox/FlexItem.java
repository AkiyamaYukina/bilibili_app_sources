package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.os.Parcelable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexItem.class */
interface FlexItem extends Parcelable {
    int getAlignSelf();

    float getFlexBasisPercent();

    float getFlexGrow();

    float getFlexShrink();

    int getHeight();

    int getMarginBottom();

    int getMarginLeft();

    int getMarginRight();

    int getMarginTop();

    int getMaxHeight();

    int getMaxWidth();

    int getMinHeight();

    int getMinWidth();

    int getOrder();

    int getWidth();

    boolean isWrapBefore();

    void setMinHeight(int i7);

    void setMinWidth(int i7);
}
