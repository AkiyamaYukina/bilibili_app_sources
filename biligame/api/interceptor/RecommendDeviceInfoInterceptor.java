package com.bilibili.biligame.api.interceptor;

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.appcompat.widget.C3246j;
import com.bilibili.api.BiliConfig;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.helper.a;
import com.bilibili.biligame.utils.GameAESUtil;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.opd.app.core.config.ConfigService;
import com.tencent.map.geolocation.TencentLocation;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.DeviceUtil;
import tv.danmaku.app.AppConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/RecommendDeviceInfoInterceptor.class */
public final class RecommendDeviceInfoInterceptor extends BiligameRequestInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f62172a = DeviceDecision.INSTANCE.dd("game.rec_aes_key", "0KxH3oMMCCGI8HtN");

    @Override // com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor, com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public void addCommonParam(@Nullable Map<String, String> map) {
        String strEncode;
        String country;
        String systemLocale;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        super.addCommonParam(map);
        HashMap map2 = new HashMap();
        try {
            Application application = BiliContext.application();
            int network = ConnectivityMonitor.getInstance().getNetwork();
            map2.put(TencentLocation.NETWORK_PROVIDER, network != 1 ? (network == 2 || network == 22 || network == 32 || network == 42 || network == 52) ? "mobile" : "" : "wifi");
            map2.put("mobi_app", BiliConfig.getMobiApp());
            map2.put("vendor", Build.MANUFACTURER);
            map2.put("model", Build.MODEL);
            StringBuilder sb = new StringBuilder();
            WindowManager windowManager = (WindowManager) application.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            }
            sb.append(displayMetrics.heightPixels);
            sb.append(ConfigService.ANY);
            WindowManager windowManager2 = (WindowManager) application.getSystemService("window");
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            if (windowManager2 != null) {
                windowManager2.getDefaultDisplay().getMetrics(displayMetrics2);
            }
            sb.append(displayMetrics2.widthPixels);
            map2.put("screen_size", sb.toString());
            try {
                strEncode = Uri.encode(AppConfig.SYSTEM_HTTP_UA);
            } catch (Exception e7) {
                strEncode = "";
            }
            map2.put("ua", strEncode);
            map2.put("boot_sec_time", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            try {
                country = Resources.getSystem().getConfiguration().getLocales().get(0).getCountry();
            } catch (Exception e8) {
                country = "";
            }
            map2.put("country_code", country);
            try {
                systemLocale = BiliConfig.getSystemLocale();
            } catch (Exception e9) {
                systemLocale = "";
            }
            map2.put("language", systemLocale);
            map2.put("device_name", Build.MODEL);
            map2.put("system_version", Build.VERSION.RELEASE);
            map2.put("carrier_info", a.a(application));
            try {
                strValueOf = String.valueOf(new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath()).getTotalBytes());
            } catch (Exception e10) {
                BLog.e("ADInfoHelper", e10);
                strValueOf = "";
            }
            map2.put("disk", strValueOf);
            try {
                strValueOf2 = String.valueOf(DeviceUtil.getTotalMemory(application));
            } catch (Exception e11) {
                BLog.e("ADInfoHelper", e11);
                strValueOf2 = "";
            }
            map2.put("memory", strValueOf2);
            map2.put("hardware_model", Build.MODEL);
            try {
                strValueOf3 = String.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 3600000);
            } catch (Exception e12) {
                BLog.e("ADInfoHelper", e12);
                strValueOf3 = "";
            }
            map2.put("time_zone", strValueOf3);
            map2.put("build_version", String.valueOf(BiliConfig.getBiliVersionCode()));
            int networkDetail = ConnectivityMonitor.getInstance().getNetworkDetail();
            map2.put("network_v2", networkDetail != 1 ? networkDetail != 22 ? networkDetail != 32 ? networkDetail != 42 ? networkDetail != 52 ? "0" : "5" : "4" : "3" : "2" : "1");
            map2.put("os_v", Build.VERSION.RELEASE);
            map2.put("machine", Build.MODEL);
        } catch (Exception e13) {
            BLog.d("CommonParamsHelper", e13.getLocalizedMessage());
        }
        BLog.d("RecommendDeviceInfoInterceptor", "RecommendDeviceInfoInterceptor key:" + this.f62172a);
        String jsonString = GsonKt.toJsonString(map2);
        C3246j.b("RecommendDeviceInfoInterceptor json: ", jsonString, "RecommendDeviceInfoInterceptor");
        String str = this.f62172a;
        if (str == null || str.length() == 0) {
            return;
        }
        String strEncryptAES = GameAESUtil.INSTANCE.encryptAES(this.f62172a, jsonString);
        if (map != null) {
            map.put("extra_info", strEncryptAES);
        }
    }

    @Nullable
    public final String getKey() {
        return this.f62172a;
    }
}
