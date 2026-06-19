package com.bilibili.mall;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/IMallShoppingTipCardView.class */
public interface IMallShoppingTipCardView {
    void bindData(@Nullable Object obj, @Nullable IMallShoppingTipCardCallback iMallShoppingTipCardCallback);

    int getLayoutResource();

    void onClear();

    void onHide();

    void onShow();

    void onViewCreated(@NotNull View view);
}
