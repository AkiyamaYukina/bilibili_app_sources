package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import Ah0.InterfaceC1403c;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import j4.t;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/c.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("channel_baike_inline_service_name")
public final class c implements IInlineAutoPlayV2Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f75148a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75150c;

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getAutoPlaySettingText(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getHasShowFreeDataToast() {
        return this.f75150c;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getInlineSettingTitle() {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getInlineSwitchDesc(@NotNull Context context) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getShowInlinePlayTip() {
        return true;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getShowInlinePlayToast() {
        t.a("get has show 4G toast state = ", "BaikeInlineSettingV2Service", this.f75149b);
        return this.f75149b;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getStyleDesc(@NotNull Context context) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final InterfaceC1403c getTipAndToastText() {
        return this.f75148a;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowFreeDataToast(boolean z6) {
        this.f75150c = z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayTip(boolean z6) {
        this.f75149b = true;
        t.a("set has show search inline 4g toast = ", "BaikeInlineSettingV2Service", z6);
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayToast(boolean z6) {
        this.f75149b = z6;
        t.a("set has show 4G toast state = ", "BaikeInlineSettingV2Service", z6);
    }
}
