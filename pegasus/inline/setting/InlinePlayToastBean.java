package com.bilibili.pegasus.inline.setting;

import Ah0.InterfaceC1403c;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/InlinePlayToastBean.class */
@Keep
final class InlinePlayToastBean implements InterfaceC1403c {

    @JSONField(name = "4gtips_button_toast")
    @Nullable
    private String buttonToast;

    @JSONField(name = "4g_toast")
    @Nullable
    private String mobileNetworkToast;

    @JSONField(name = "4gtips_show")
    @Nullable
    private String shouldShowMobileNetworkTips;

    @JSONField(name = "4gtips_button")
    @Nullable
    private String tipButton;

    @JSONField(name = "4gtips_content")
    @Nullable
    private String tipContentText;

    @Nullable
    public final String getButtonToast() {
        return this.buttonToast;
    }

    @Nullable
    public final String getMobileNetworkToast() {
        return this.mobileNetworkToast;
    }

    @Override // Ah0.InterfaceC1403c
    @NotNull
    public String getMobileToast() {
        return d.a(2131845269, this.mobileNetworkToast);
    }

    @Nullable
    public final String getShouldShowMobileNetworkTips() {
        return this.shouldShowMobileNetworkTips;
    }

    @Nullable
    public final String getTipButton() {
        return this.tipButton;
    }

    @Override // Ah0.InterfaceC1403c
    @NotNull
    public String getTipButtonText() {
        return d.a(2131841706, this.tipButton);
    }

    @Override // Ah0.InterfaceC1403c
    @NotNull
    public String getTipButtonToast() {
        return d.a(2131845325, this.buttonToast);
    }

    @Override // Ah0.InterfaceC1403c
    @NotNull
    public String getTipContent() {
        return d.a(2131845203, this.tipContentText);
    }

    @Nullable
    public final String getTipContentText() {
        return this.tipContentText;
    }

    public boolean isShowTips() {
        return !Intrinsics.areEqual(this.shouldShowMobileNetworkTips, "0");
    }

    public final void setButtonToast(@Nullable String str) {
        this.buttonToast = str;
    }

    public final void setMobileNetworkToast(@Nullable String str) {
        this.mobileNetworkToast = str;
    }

    public final void setShouldShowMobileNetworkTips(@Nullable String str) {
        this.shouldShowMobileNetworkTips = str;
    }

    public final void setTipButton(@Nullable String str) {
        this.tipButton = str;
    }

    public final void setTipContentText(@Nullable String str) {
        this.tipContentText = str;
    }
}
