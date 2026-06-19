package com.bilibili.studio.centerplus.statistics;

import F3.N1;
import O4.b;
import androidx.fragment.app.z;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.centerplus.util.blink.BlinkEffectManager;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/statistics/BlinkEffectReport.class */
public final class BlinkEffectReport {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String EFFECT_TYPE_BMM = "bmm";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static BlinkEffectReport f105193b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105194a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/statistics/BlinkEffectReport$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlinkEffectReport instance() {
            if (BlinkEffectReport.f105193b == null) {
                synchronized (this) {
                    if (BlinkEffectReport.f105193b == null) {
                        BlinkEffectReport.f105193b = new BlinkEffectReport();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return BlinkEffectReport.f105193b;
        }
    }

    public BlinkEffectReport() {
        String strDd = DeviceDecision.INSTANCE.dd("blink_effect_sdk_config", "bmm");
        this.f105194a = strDd != null ? strDd : "bmm";
    }

    public static /* synthetic */ void reportDownloadModResult$default(BlinkEffectReport blinkEffectReport, String str, int i7, Float f7, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            f7 = null;
        }
        if ((i9 & 8) != 0) {
            i8 = 2;
        }
        blinkEffectReport.reportDownloadModResult(str, i7, f7, i8);
    }

    public static /* synthetic */ void reportRequestMod$default(BlinkEffectReport blinkEffectReport, String str, String str2, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i7 = 2;
        }
        blinkEffectReport.reportRequestMod(str, str2, i7);
    }

    public static /* synthetic */ void reportUpdateMod$default(BlinkEffectReport blinkEffectReport, String str, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 2;
        }
        blinkEffectReport.reportUpdateMod(str, i7);
    }

    public final void a(Map<String, String> map) {
        map.put("beauty_sdk", this.f105194a);
        Neurons.trackT(true, "live.effect.mod.load.track", map, 1, new N1(12));
    }

    public final void reportCheckBmmModReady(@NotNull Map<String, String> map) {
        map.put("action", "check_bmm_mod_ready");
        a(map);
    }

    public final void reportCheckByteEffectModReady(boolean z6, boolean z7) {
        HashMap mapC = b.c("action", "check_byteeffect_mod_ready");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_status", String.valueOf(z7));
        jsonObject.addProperty("beauty_res_status", String.valueOf(z6));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportCheckModReady(@NotNull String str, boolean z6, int i7) {
        HashMap mapC = b.c("action", "check_mod_ready");
        mapC.put("from_source", i7 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        jsonObject.addProperty("mod_support", String.valueOf(z6));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportCreateInstanceResult(@NotNull String str, boolean z6) {
        HashMap mapC = b.c("action", "create_instance");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("instance_name", str);
        jsonObject.addProperty(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(z6));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportDownloadModResult(@NotNull String str, int i7, @Nullable Float f7, int i8) {
        HashMap mapC = b.c("action", "download_mod_result");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        jsonObject.addProperty("mod_download_result", String.valueOf(i7));
        if (f7 != null) {
            jsonObject.addProperty("mod_download_progress", String.valueOf(f7.floatValue()));
        }
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        mapC.put("from_source", i8 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        a(mapC);
    }

    public final void reportInitBeautyReader(@NotNull String str, @NotNull String str2) {
        HashMap mapC = b.c("action", "init_beauty_reader");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action_log", z.a("auroraInitResPath:", str, ", auroraBeautyResPath: ", str2));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportLoadModResult(@NotNull String str, @NotNull String str2, boolean z6) {
        HashMap mapC = b.c("action", "real_load_mod");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        jsonObject.addProperty("mod_path", str2);
        jsonObject.addProperty("load_result", String.valueOf(z6));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportLoadModel(@NotNull String str, boolean z6) {
        HashMap mapC = b.c("action", "real_load_model");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("model_name", str);
        jsonObject.addProperty(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(z6));
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportModReadyError(int i7) {
        HashMap mapC = b.c("action", "mod_ready_error");
        mapC.put("from_source", i7 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        a(mapC);
    }

    public final void reportModReadyOk(int i7) {
        HashMap mapC = b.c("action", "mod_ready_ok");
        mapC.put("from_source", i7 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        a(mapC);
    }

    public final void reportRequestBeautyResResult(int i7, int i8) {
        HashMap mapC = b.c("action", "requestBeautyRes");
        mapC.put("from_source", i8 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("beauty_res_result", i7 != 0 ? i7 != 1 ? i7 != 2 ? "" : "download failed" : "list is empty" : "download beauty res ok");
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportRequestMod(@NotNull String str, @Nullable String str2, int i7) {
        HashMap mapA = W.a("action", "request_mod", "mod_name", str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        mapA.put("mod_version", str3);
        mapA.put("from_source", i7 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        a(mapA);
    }

    public final void reportRequestResultMod(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        HashMap mapC = b.c("action", "request_mod_result");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        jsonObject.addProperty("mod_version", str2);
        jsonObject.addProperty("mod_max_version", str3);
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapC);
    }

    public final void reportTriggerUpdateMod(@NotNull String str, int i7) {
        HashMap mapA = W.a("action", "trigger_update_mod", "mod_name", str);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        mapA.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        a(mapA);
    }

    public final void reportUpdateMod(@NotNull String str, int i7) {
        HashMap mapC = b.c("action", "update_mod");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mod_name", str);
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, GsonKt.toJsonString(jsonObject));
        mapC.put("from_source", i7 == 1 ? "center_plus" : BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL);
        a(mapC);
    }
}
