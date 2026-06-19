package com.bilibili.module.list;

import Ah0.InterfaceC1403c;
import android.content.Context;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/list/IInlineAutoPlayV2Service.class */
public interface IInlineAutoPlayV2Service {
    @NotNull
    String getAutoPlaySettingText(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState);

    boolean getHasShowFreeDataToast();

    @NotNull
    String getInlineSettingTitle();

    @NotNull
    String getInlineSwitchDesc(@NotNull Context context);

    boolean getShowInlinePlayTip();

    boolean getShowInlinePlayToast();

    @NotNull
    String getStyleDesc(@NotNull Context context);

    @NotNull
    InterfaceC1403c getTipAndToastText();

    void setShowFreeDataToast(boolean z6);

    void setShowInlinePlayTip(boolean z6);

    void setShowInlinePlayToast(boolean z6);
}
