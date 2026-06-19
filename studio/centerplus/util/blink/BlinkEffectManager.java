package com.bilibili.studio.centerplus.util.blink;

import I3.P1;
import com.bilibili.api.BiliConfig;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.live.LiveStreamModResourceOutService;
import com.bilibili.studio.videoeditor.BiliSenseMeModManager;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import defpackage.a;
import ew0.C7014a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/blink/BlinkEffectManager.class */
public final class BlinkEffectManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String EFFECT_BMM_MOD_POOL = "uper";

    @NotNull
    public static final String EFFECT_BYTEEFFECT_MOD_POOL = "blink";

    @NotNull
    public static final String EFFECT_TYPE_BMM = "bmm";

    @NotNull
    public static final String EFFECT_TYPE_BYTE = "byte_effect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static BlinkEffectManager f105284c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile String f105285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f105286b = LazyKt.lazy(new P1(10));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/blink/BlinkEffectManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlinkEffectManager instance() {
            if (BlinkEffectManager.f105284c == null) {
                synchronized (this) {
                    if (BlinkEffectManager.f105284c == null) {
                        BlinkEffectManager.f105284c = new BlinkEffectManager();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return BlinkEffectManager.f105284c;
        }
    }

    @NotNull
    public final String[] getBlinkModResourceList() {
        return isByteEffect() ? ((C7014a) this.f105286b.getValue()).f117679a ? new String[]{ByteEffectModRes.BYTEEFFECT_SO_64.getModName(), ByteEffectModRes.BYTEEFFECT_LIC.getModName(), ByteEffectModRes.BYTEEFFECT_MODEL.getModName()} : new String[]{ByteEffectModRes.BYTEEFFECT_SO_32.getModName(), ByteEffectModRes.BYTEEFFECT_LIC.getModName(), ByteEffectModRes.BYTEEFFECT_MODEL.getModName()} : new String[]{"android_aurora_resources", "android_aurora_thirdparty", ConfigV3.f(), ConfigV3.c(), ConfigV3.d(), ConfigV3.e(), ConfigV3.h(), BiliSenseMeModManager.MOD_NAME_BLIVE_CV_MODELS, "android_cv_model_3", ConfigV3.j(), ConfigV3.k()};
    }

    @NotNull
    public final String getModPool() {
        return !isByteEffect() ? "uper" : EFFECT_BYTEEFFECT_MOD_POOL;
    }

    public final void initEffectSdkType() {
        LiveStreamModResourceOutService liveStreamModResourceOutService = (LiveStreamModResourceOutService) BLRouter.get$default(BLRouter.INSTANCE, LiveStreamModResourceOutService.class, (String) null, 2, (Object) null);
        if (liveStreamModResourceOutService == null) {
            this.f105285a = EFFECT_TYPE_BYTE;
            a.b("live tribe uninstall init effectSdkType: ", this.f105285a, "BlinkEffect");
        } else {
            liveStreamModResourceOutService.initEffectSdkType();
            this.f105285a = liveStreamModResourceOutService.getEffectSdkType();
        }
    }

    public final boolean isByteEffect() {
        return Intrinsics.areEqual(this.f105285a, EFFECT_TYPE_BYTE);
    }

    public final boolean isLiveAllModResourceEnable() {
        return new SharedPreferencesHelper(BiliContext.application(), "blink_module_sp").optBoolean("is_blink_dependence_mod_disable" + BiliConfig.getBiliVersionCode() + this.f105285a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isLiveByteEffectModSupportVersion(@org.jetbrains.annotations.NotNull com.bilibili.lib.mod.ModResource r7) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.util.blink.BlinkEffectManager.isLiveByteEffectModSupportVersion(com.bilibili.lib.mod.ModResource):boolean");
    }

    public final void makeLiveAllModResourceEnable() {
        new SharedPreferencesHelper(BiliContext.application(), "blink_module_sp").edit().putBoolean("is_blink_dependence_mod_disable" + BiliConfig.getBiliVersionCode() + this.f105285a, true).apply();
    }

    public final void setBmmBeautyResPath(@NotNull String str) {
        BLog.i("BlinkEffectManager", "setBmmBeautyResPath path: " + str);
        new SharedPreferencesHelper(BiliContext.application(), "blink_module_sp").edit().putString("blink_bmm_beauty_res" + BiliConfig.getBiliVersionCode(), str).apply();
    }
}
