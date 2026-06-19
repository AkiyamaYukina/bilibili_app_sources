package com.bilibili.studio.videocompile.internal.strategy;

import Tm0.a;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/strategy/Export4KStrategy.class */
public final class Export4KStrategy {

    @NotNull
    public static final Export4KStrategy INSTANCE = new Export4KStrategy();

    public static boolean a() {
        try {
            Result.Companion companion = Result.Companion;
            String strDd = DeviceDecision.INSTANCE.dd("video_compile_module.export_4k_black_list", "");
            JSONObject jSONObject = new JSONObject(strDd != null ? strDd : "");
            String string = jSONObject.getString("osVer");
            String string2 = jSONObject.getString(a.f24207d);
            String string3 = jSONObject.getString("model");
            if (string != null && string.length() != 0) {
                String str = Build.VERSION.RELEASE;
                if (StringsKt.n(string, str)) {
                    BLog.i("Export4kStrategy", "isDeviceInBlackList : osVer not support. osVerStr: " + string + ", osVer: " + str);
                    return true;
                }
            }
            if (string3 != null && string3.length() != 0) {
                String str2 = Build.MODEL;
                if (StringsKt.n(string3, str2)) {
                    BLog.i("Export4kStrategy", "isDeviceInBlackList : model not support. modelStr: " + string3 + ", MODEL: " + str2);
                    return true;
                }
            }
            if (string2 != null && string2.length() != 0) {
                String str3 = Build.BRAND;
                if (StringsKt.n(string2, str3)) {
                    BLog.i("Export4kStrategy", "isDeviceInBlackList : brand not support. brandStr: " + string2 + ", BRAND: " + str3);
                    return true;
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
            return false;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            return false;
        }
    }

    public static boolean b() {
        try {
            Result.Companion companion = Result.Companion;
            String strDd = DeviceDecision.INSTANCE.dd("video_compile_module.export_4k_white_list", "");
            JSONObject jSONObject = new JSONObject(strDd != null ? strDd : "");
            String string = jSONObject.getString("osVer");
            String string2 = jSONObject.getString(a.f24207d);
            String string3 = jSONObject.getString("model");
            if (string2 != null && string2.length() != 0) {
                String str = Build.VERSION.RELEASE;
                if (StringsKt.n(string, str)) {
                    BLog.i("Export4kStrategy", "isDeviceInWhiteList : osVerStr support. osVerStr: " + string + ", VERSION: " + str);
                    return true;
                }
            }
            if (string2 != null && string2.length() != 0) {
                String str2 = Build.BRAND;
                if (StringsKt.n(string2, str2)) {
                    BLog.i("Export4kStrategy", "isDeviceInWhiteList : brand support. brandStr: " + string2 + ", BRAND: " + str2);
                    return true;
                }
            }
            if (string3 != null && string3.length() != 0) {
                String str3 = Build.MODEL;
                if (!StringsKt.n(string3, str3)) {
                    return false;
                }
                BLog.i("Export4kStrategy", "isDeviceInWhiteList : model support. modelStr: " + string3 + ", MODEL: " + str3);
                return true;
            }
            return false;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            return false;
        }
    }

    @JvmStatic
    public static final boolean enableExport4KByEncoder() {
        return DeviceDecision.INSTANCE.getBoolean("video_compile_module.export_4k_by_encoder", false);
    }

    @JvmStatic
    public static final boolean isSupport4KByMediaCodec() {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        try {
            INSTANCE.getClass();
        } catch (Throwable th) {
            M.b("isSupport4KByMediaCodec error:", th.getMessage(), "Export4kStrategy");
        }
        if (b()) {
            return true;
        }
        if (a()) {
            return false;
        }
        if (BiliGlobalPreferenceHelper.getInstance(FoundationAlias.getFapp().getApplicationContext()).optInteger("upper_support_export_4k_with_encoder", 0) == 2) {
            BLog.i("Export4kStrategy", "isSupport4KByMediaCodec form sp support=true");
            return true;
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (StringsKt.equals(str, BiliPushAVCodecUtils.AVC_MIME, true) || StringsKt.equals(str, BiliPushAVCodecUtils.HEVC_MIME, true)) {
                        INSTANCE.getClass();
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if ((capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) ? false : videoCapabilities.isSizeSupported(3840, 2160)) {
                            BiliGlobalPreferenceHelper.getInstance(FoundationAlias.getFapp().getApplicationContext()).setInteger("upper_support_export_4k_with_encoder", 2);
                            BLog.i("Export4kStrategy", "isSupport4KByMediaCodec support=true");
                            return true;
                        }
                    }
                }
            }
        }
        BiliGlobalPreferenceHelper.getInstance(FoundationAlias.getFapp().getApplicationContext()).setInteger("upper_support_export_4k_with_encoder", 1);
        BLog.i("Export4kStrategy", "isSupport4KByMediaCodec form sp support=false");
        return false;
    }
}
