package com.bilibili.search2.panel;

import Ah0.InterfaceC1403c;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import j4.t;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/g.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("search_inline_auto_play_service_v2")
public final class g implements IInlineAutoPlayV2Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f87002a = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Object());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87004c;

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getAutoPlaySettingText(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getHasShowFreeDataToast() {
        return this.f87004c;
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
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        boolean z6 = false;
        if (bLKVSharedPreference != null) {
            z6 = bLKVSharedPreference.getBoolean("search_inline_player_has_show_toast", false);
        }
        t.a("has show search inline 4g toast = ", "SearchInlineSettingV2Service", z6);
        return z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getShowInlinePlayToast() {
        t.a("get has show 4G toast state = ", "SearchInlineSettingV2Service", this.f87003b);
        return this.f87003b;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getStyleDesc(@NotNull Context context) {
        return "";
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final InterfaceC1403c getTipAndToastText() {
        return (SearchInlinePlayToastBean) this.f87002a.getValue();
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowFreeDataToast(boolean z6) {
        this.f87004c = z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayTip(boolean z6) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference != null && (editorEdit = bLKVSharedPreference.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("search_inline_player_has_show_toast", z6)) != null) {
            editorPutBoolean.apply();
        }
        this.f87003b = true;
        t.a("set has show search inline 4g toast = ", "SearchInlineSettingV2Service", z6);
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayToast(boolean z6) {
        this.f87003b = z6;
        t.a("set has show 4G toast state = ", "SearchInlineSettingV2Service", z6);
    }
}
