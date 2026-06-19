package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import F3.O1;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.C4618g;
import com.alibaba.fastjson.JSONObject;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/a.class */
public class a extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f109314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HashMap<String, Integer> f109315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f109316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f109317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f109318g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f109319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f109322l;

    public a(@NotNull Application application) {
        super(application);
        this.f109314c = "contribution";
        this.f109319i = true;
        this.f109320j = 30;
        this.f109322l = -1;
    }

    public static void K0(@NotNull String str) {
        List<String> list = HB0.a.f8154a;
        HashMap mapC = O4.b.c("countdown_status", str);
        mapC.put("first_entrance", j.a("first_entrance"));
        mapC.put("track_id", g.d());
        mapC.put("router_topic_id", g.f28463b);
        Neurons.reportClick(false, "creation.video-shoot.countdown.0.click", mapC);
    }

    public static void L0(@NotNull String str) {
        List<String> list = HB0.a.f8154a;
        HashMap mapC = O4.b.c("button_name", str);
        mapC.put("first_entrance", j.a("first_entrance"));
        mapC.put("track_id", g.d());
        mapC.put("router_topic_id", g.f28463b);
        Neurons.reportClick(false, "creation.video-shoot.resume-draft.0.click", mapC);
    }

    public static void M0(int i7) {
        List<String> list = HB0.a.f8154a;
        HashMap map = new HashMap();
        List<String> list2 = HB0.a.f8154a;
        if (i7 < list2.size()) {
            map.put("button_name", list2.get(i7));
        }
        map.put("first_entrance", j.a("first_entrance"));
        map.put("track_id", g.d());
        map.put("router_topic_id", g.f28463b);
        Neurons.reportClick(false, "creation.video-shoot.quit-shoot-float.0.click", map);
    }

    public static void N0(boolean z6) {
        List<String> list = HB0.a.f8154a;
        HashMap mapC = O4.b.c("flash_status", z6 ? "open" : "close");
        mapC.put("first_entrance", j.a("first_entrance"));
        mapC.put("track_id", g.d());
        mapC.put("router_topic_id", g.f28463b);
        Neurons.reportClick(false, "creation.video-shoot.flash-lamp.0.click", mapC);
    }

    public static void P0(@Nullable String str) {
        int i7;
        String str2 = CenterPlusStatisticsHelper.f105195a;
        HashMap map = new HashMap();
        map.put("capture_id", CenterPlusStatisticsHelper.f105197c);
        int iF = com.bilibili.studio.videoeditor.media.performance.a.e().f();
        if (iF != 0) {
            i7 = 3;
            if (iF != 1) {
                i7 = iF != 2 ? iF != 3 ? 3 : 1 : 2;
            }
        } else {
            i7 = 0;
        }
        map.put("device_level", String.valueOf(i7));
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        map.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str3);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportNewBMMCaptureShow...params = " + map, new Object[0]);
        Neurons.trackT(false, "creation.new-bmm.capture.show.track", map, 1, new O1(9));
    }

    public static void Q0() {
        HB0.b bVar = HB0.b.f8155a;
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        g.c(mapB);
        String strL = HB0.b.l("creation.video-shoot.0.0.pv", mapB);
        HB0.b.o(strL, mapB);
        BLog.dfmt("BiliUpperNeuronsReport", "capturePagePVEnd...params = " + mapB, new Object[0]);
        PageViewTracker.end("creation.video-shoot.0.0.pv", 0, strL, mapB);
    }

    public static void R0() {
        HB0.b bVar = HB0.b.f8155a;
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        g.c(mapB);
        String strL = HB0.b.l("creation.video-shoot.0.0.pv", mapB);
        BLog.dfmt("BiliUpperNeuronsReport", "capturePagePVStart...params = " + mapB, new Object[0]);
        PageViewTracker.start("creation.video-shoot.0.0.pv", 0, strL, null);
    }

    public static void T0(int i7) {
        JSONObject jSONObjectF = C6635h.f();
        jSONObjectF.put("view_from", (Object) Integer.valueOf(i7));
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"shoot_musiclist_show", "show", jSONObjectF.toJSONString()});
    }

    public static void U0(@Nullable Integer num, @Nullable String str) {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_upload_click", "click", com.bilibili.biligame.web2.j.a(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str).toJSONString(), (num == null || num.intValue() == 0) ? null : String.valueOf(num.intValue())});
    }

    public static boolean Z0() {
        return (((float) DensityUtil.getDevicesWidthPixels(BiliContext.application())) * 1.0f) / ((float) DensityUtil.getDevicesHeightPixels(BiliContext.application())) < 0.5625f;
    }

    public final void J0(int i7, @NotNull String str) {
        if (this.f109315d == null) {
            this.f109315d = new HashMap<>(16);
        }
        HashMap<String, Integer> map = this.f109315d;
        if (map != null) {
            map.put(str, Integer.valueOf(i7));
        }
    }

    public final void O0(@Nullable StickerListItemV3 stickerListItemV3) {
        if (this.f109317f < 10) {
            return;
        }
        int i7 = stickerListItemV3 != null ? stickerListItemV3.stickerInfo.j : -1;
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_fps_click", "click", this.f109314c, com.bilibili.app.authorspace.local.service.j.a(this.h, ""), C4618g.a(i7, ""), Build.MODEL, Build.VERSION.RELEASE});
        String str = CenterPlusStatisticsHelper.f105195a;
        long j7 = this.h;
        boolean z6 = i7 > 0;
        HashMap map = new HashMap();
        map.put("fps", String.valueOf(j7));
        map.put("memory", String.valueOf(CenterPlusStatisticsHelper.a()));
        map.put("is_use_sticker", String.valueOf(z6));
        map.put(EditCustomizeSticker.TAG_ID, String.valueOf(i7));
        map.put("engine_type", String.valueOf(3));
        BLog.dfmt("CenterPlusStatisticsHelper", "reportPerformance...params = " + map, new Object[0]);
        Neurons.trackT(false, "creation.center-plus.performance.track", map, 1, new O1(9));
        this.h = 0L;
        this.f109318g = 0L;
        this.f109317f = 0L;
    }

    public final void S0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        List<String> list = HB0.a.f8154a;
        String str4 = this.f109314c;
        int i7 = Z0() ? 2 : 1;
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap mapB2 = HB0.a.b(str4, str);
        HashMap map = (HashMap) mapB;
        map.putAll(mapB2);
        map.put("activity_id", str2);
        P4.a.a(i7, Constant.IN_KEY_LOCATION, str3, "screen_type", map);
        HB0.b bVar = HB0.b.f8155a;
        HB0.b.o(HB0.b.l("creation.video-shoot.shoot-interface.all.show", mapB), mapB);
        g.c(mapB);
        BLog.dfmt("BiliUpperNeuronsReport", "captureShootAllShow...params = " + mapB, new Object[0]);
        Neurons.reportExposure$default(false, "creation.video-shoot.shoot-interface.all.show", mapB, (List) null, 8, (Object) null);
    }

    public final void V0(int i7, @Nullable String str, boolean z6) {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_sticker_select_click", "click", this.f109314c, C4618g.a(i7, ""), z6 ? "1" : "2", str});
    }

    public final void X0(@Nullable String str) {
        String str2 = this.f109314c;
        JSONObject jSONObjectD = C6635h.d();
        jSONObjectD.put("class", (Object) str);
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"shoot_sticker_tab_show", "show", str2, jSONObjectD.toJSONString()});
    }

    public final void Y0(int i7, @Nullable String str) {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_sticker_confirm_click", "click", this.f109314c, C4618g.a(i7, ""), str});
    }

    public void a1(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ToastHelper.cancel();
        ToastHelper.showToastShort(BiliContext.application(), str);
    }
}
