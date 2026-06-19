package com.bilibili.pegasus.channelv3.feed.inline;

import Ah0.InterfaceC1403c;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import j4.t;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/inline/e.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("channel_movie_inline_service_name")
public final class e implements IInlineAutoPlayV2Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f75327a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75329c;

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getAutoPlaySettingText(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getHasShowFreeDataToast() {
        return this.f75329c;
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
        t.a("get has show 4G toast state = ", "ChannelMovieInlineSettingV2Service", this.f75328b);
        return this.f75328b;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getStyleDesc(@NotNull Context context) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final InterfaceC1403c getTipAndToastText() {
        return this.f75327a;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowFreeDataToast(boolean z6) {
        this.f75329c = z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayTip(boolean z6) {
        this.f75328b = true;
        t.a("set has show search inline 4g toast = ", "ChannelMovieInlineSettingV2Service", z6);
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayToast(boolean z6) {
        this.f75328b = z6;
        t.a("set has show 4G toast state = ", "ChannelMovieInlineSettingV2Service", z6);
    }
}
