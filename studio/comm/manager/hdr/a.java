package com.bilibili.studio.comm.manager.hdr;

import Co.m;
import T9.e;
import android.app.Application;
import android.os.Build;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.adcommon.utils.i;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.studio.videoeditor.util.V;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IjkCodecHelper;
import yw0.C9104b;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/hdr/a.class */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f105396e = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new m(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f105398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f105399c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f105397a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile float f105400d = 2.0f;

    /* JADX INFO: renamed from: com.bilibili.studio.comm.manager.hdr.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/hdr/a$a.class */
    public static final class C1185a {
        @NotNull
        public static a a() {
            return (a) a.f105396e.getValue();
        }
    }

    public a() {
        new UpperHdrConfig();
    }

    public final float a() {
        if (!zw0.b.e()) {
            return this.f105400d;
        }
        if (!this.f105397a.get()) {
            b();
        }
        return this.f105400d;
    }

    public final void b() {
        synchronized (this) {
            if (!zw0.b.e()) {
                this.f105397a.set(true);
                return;
            }
            d();
            c();
            this.f105399c = this.f105399c && this.f105398b;
            this.f105397a.set(true);
            BLog.e("UpperHdrManager", "initHdrAbility isSupportHdrPreview=" + this.f105398b + ",colorGainForSDKToHDR=" + this.f105400d + ",isSupportHdrExport=" + this.f105399c);
        }
    }

    public final void c() {
        boolean z6 = true;
        Lazy lazy = zw0.b.f130950a;
        String str = (String) ConfigManager.Companion.config().get("upper.capabilities_white_list_mon_v1", "");
        try {
            JSONObject object = JSON.parseObject(str != null ? str : "");
            if (!Intrinsics.areEqual((Boolean) object.get("enable"), Boolean.TRUE)) {
                this.f105399c = false;
                return;
            }
            JSONArray jSONArray = (JSONArray) object.get("whiteList");
            if (jSONArray != null && jSONArray.size() != 0) {
                JSONObject jSONObject = object.getJSONObject("gainMap");
                String str2 = Build.BRAND;
                String str3 = Build.MODEL;
                int size = jSONArray.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        z6 = false;
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    if (jSONObject2 != null) {
                        Object obj = jSONObject2.get(str2);
                        List list = obj instanceof List ? (List) obj : null;
                        if (!V.e(list) && list.contains(str3)) {
                            i.a("initIsSupportHdr in white list:true，brand=", str2, ",model=", str3, "UpperHdrManager");
                            break;
                        }
                    }
                    i7++;
                }
                this.f105399c = z6;
                float floatValue = jSONObject.getFloatValue(Build.BRAND);
                Float fValueOf = Float.valueOf(floatValue);
                BLog.e("UpperHdrManager", "initColorGain gainColor=" + fValueOf);
                if (!Intrinsics.areEqual(0.0f, fValueOf)) {
                    this.f105400d = floatValue;
                }
                BLog.e("UpperHdrManager", "initHdrExport isSupportHdrExport=" + this.f105399c + ",colorGainForSDKToHDR=" + this.f105400d);
                return;
            }
            this.f105399c = false;
        } catch (Exception e7) {
            e7.printStackTrace();
            M.b("initHdrExport error e=", e7.getMessage(), "UpperHdrManager");
        }
    }

    public final void d() {
        int iB;
        Application application = BiliContext.application();
        boolean z6 = true;
        int i7 = 1;
        if (application == null || (iB = j.a(application).b("key_upper_support_preview", -1)) == -1) {
            Application application2 = BiliContext.application();
            WindowManager windowManager = null;
            Object systemService = application2 != null ? application2.getSystemService("window") : null;
            if (systemService instanceof WindowManager) {
                windowManager = (WindowManager) systemService;
            }
            this.f105398b = IjkCodecHelper.isHDRSupport(windowManager);
            Application application3 = BiliContext.application();
            if (application3 != null) {
                if (!this.f105398b) {
                    i7 = 2;
                }
                j.a(application3).c("key_upper_support_preview", i7);
            }
            e.a("initHdrPreview initHdrPreviewFromCodec=", "UpperHdrManager", this.f105398b);
        } else {
            if (iB != 1) {
                z6 = false;
            }
            this.f105398b = z6;
        }
        Y0.c.c("initHdrPreview isSupportHdrPreview=", "UpperHdrManager", this.f105398b);
    }

    public final boolean e() {
        if (!zw0.b.e()) {
            return false;
        }
        if (!this.f105397a.get()) {
            b();
        }
        return this.f105399c;
    }

    public final boolean f(@NotNull String str) {
        BLog.e("UpperHdrManager", "isSupportHdrFile enableHdr=" + zw0.b.e() + ",isSupportHdr=" + this.f105398b);
        if (!zw0.b.e()) {
            return !C9104b.c(str);
        }
        if (this.f105398b) {
            return true;
        }
        return !C9104b.d(str);
    }

    public final boolean g() {
        if (!zw0.b.e()) {
            return false;
        }
        if (!this.f105397a.get()) {
            b();
        }
        return this.f105398b;
    }
}
