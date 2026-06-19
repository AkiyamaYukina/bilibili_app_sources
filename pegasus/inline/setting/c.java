package com.bilibili.pegasus.inline.setting;

import Ah0.InterfaceC1403c;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import j4.t;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/c.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("pegasus_inline_auto_play_service_v2")
public final class c implements IInlineAutoPlayV2Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f78192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f78193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78195d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/c$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78196a;

        static {
            int[] iArr = new int[PegasusInlineSwitchState.values().length];
            try {
                iArr[PegasusInlineSwitchState.ALL_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PegasusInlineSwitchState.WIFI_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PegasusInlineSwitchState.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f78196a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public c() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f78192a = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Object());
        this.f78193b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Object());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getAutoPlaySettingText(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState) throws NoWhenBranchMatchedException {
        String inlineAutoPlayNetworkAll;
        int i7 = a.f78196a[pegasusInlineSwitchState.ordinal()];
        Lazy lazy = this.f78193b;
        if (i7 == 1) {
            inlineAutoPlayNetworkAll = ((AutoPlaySetting) lazy.getValue()).getInlineAutoPlayNetworkAll();
        } else if (i7 == 2) {
            inlineAutoPlayNetworkAll = ((AutoPlaySetting) lazy.getValue()).getInlineAutoPlayWifi();
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            inlineAutoPlayNetworkAll = ((AutoPlaySetting) lazy.getValue()).getInlineAutoPlayOff();
        }
        return inlineAutoPlayNetworkAll;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getHasShowFreeDataToast() {
        return this.f78195d;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getInlineSettingTitle() {
        return ((AutoPlaySetting) this.f78193b.getValue()).getInlineAutoPlayTitle();
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getInlineSwitchDesc(@NotNull Context context) {
        IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);
        return iPegasusInlineConfig == null ? "" : getAutoPlaySettingText(iPegasusInlineConfig.getCurrentState());
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getShowInlinePlayTip() {
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        boolean z6 = false;
        if (bLKVSharedPreference != null) {
            z6 = bLKVSharedPreference.getBoolean("inline_player_has_show_toast", false);
        }
        t.a("has show pegasus inline 4g toast = ", "PegasusInlineSettingService", z6);
        return z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final boolean getShowInlinePlayToast() {
        t.a("get has show 4G toast state = ", "PegasusInlineSettingService", this.f78194c);
        return this.f78194c;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final String getStyleDesc(@NotNull Context context) {
        return PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) ? context.getString(2131845132) : context.getString(2131845123);
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    @NotNull
    public final InterfaceC1403c getTipAndToastText() {
        return (InlinePlayToastBean) this.f78192a.getValue();
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowFreeDataToast(boolean z6) {
        this.f78195d = z6;
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayTip(boolean z6) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference != null && (editorEdit = bLKVSharedPreference.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("inline_player_has_show_toast", z6)) != null) {
            editorPutBoolean.apply();
        }
        this.f78194c = true;
        t.a("set has show pegasus inline 4g toast = ", "PegasusInlineSettingService", z6);
    }

    @Override // com.bilibili.module.list.IInlineAutoPlayV2Service
    public final void setShowInlinePlayToast(boolean z6) {
        this.f78194c = z6;
        t.a("set has show 4G toast state = ", "PegasusInlineSettingService", z6);
    }
}
