package com.bilibili.studio.centerplus.statistics;

import F3.O1;
import P4.a;
import Xz0.g;
import Xz0.j;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.ui.text.font.C4496a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.util.M;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.main2.W;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/statistics/CenterPlusStatisticsHelper.class */
public final class CenterPlusStatisticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f105195a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, Long> f105196b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static String f105197c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f105198d = true;

    public static long a() {
        Context applicationContext;
        Application application = BiliContext.application();
        if (application == null || (applicationContext = application.getApplicationContext()) == null) {
            return -1L;
        }
        ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j7 = memoryInfo.availMem;
        long j8 = 1024;
        return (j7 / j8) / j8;
    }

    @NotNull
    public static String b(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "" : b.g() ? "AI玩法" : b.l() : "发图文" : "模板" : "上传" : "拍摄" : "开直播";
    }

    public static void c(JSONObject jSONObject, Map map) {
        if (map != null) {
            jSONObject.put("SmoothStrength", Float.valueOf((((Integer) map.get("Strength")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("ChinLength", Float.valueOf((((Integer) map.get("Chin Length Param")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("mouthSize", Float.valueOf((((Integer) map.get("Mouth Size Param")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("shrinkFace", Float.valueOf((((Integer) map.get("Shrink Face")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("NarrowNose", Float.valueOf((((Integer) map.get("Narrow Nose Param")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("HairlineHeight", Float.valueOf((((Integer) map.get("Hairline Height Param")) != null ? r0.intValue() : 0) * 0.01f));
            jSONObject.put("eye_enlarging", Float.valueOf((((Integer) map.get("Eye Enlarging")) != null ? r0.intValue() : 0) * 0.01f));
            Integer num = (Integer) map.get("Whitening");
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            }
            jSONObject.put("whitening", Float.valueOf(iIntValue * 0.01f));
        }
    }

    public static void d(@NotNull String str) {
        BLog.wfmt("CenterPlusStatisticsHelper", C4496a.a("removeTimestamp...key = ", str), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((HashMap) f105196b).remove(str);
    }

    public static void e(int i7, @NotNull String str, @Nullable String str2, long j7, @Nullable String str3) {
        HashMap mapC = O4.b.c("key", str);
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        mapC.put(CaptureSchema.JUMP_PARAMS_EXTRA, str4);
        String str5 = str3;
        if (str3 == null) {
            str5 = "";
        }
        a.a(i7, ThirdPartyExtraBuilder.KEY_RESULT, str5, "requestState", mapC);
        mapC.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j7));
        Neurons.trackT(false, "bilibili-creation.upper.ab.result.track", mapC, 1, new O1(9));
    }

    public static void f(@Nullable String str, boolean z6) {
        HashMap map = new HashMap();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map.put("load_from", str2);
        map.put("is_direct", z6 ? "1" : "0");
        map.put("first_entrance", j.a("first_entrance"));
        g.c(map);
        Neurons.trackT(false, "bilibili-creation.reader.mod-downloading.cancel.tracker", map, 1, new O1(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(int r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.g(int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, int r12, int r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.h(java.lang.String, java.lang.String, boolean, boolean, int, int, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.i():void");
    }

    public static void j(long j7, @Nullable String str, @NotNull String str2, boolean z6, boolean z7) {
        HashMap map = new HashMap();
        map.put("is_mod_ready", z6 ? "1" : "0");
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        map.put("from_tab", str3);
        map.put("is_direct", z7 ? "1" : "0");
        map.put("is_first_install", M.f110206b ? "1" : "0");
        map.put("step", str2);
        map.put("cost_time", String.valueOf(j7));
        map.put("sdk_type", KaleidoscopeFactory.SDK_MON);
        map.put("first_entrance", j.a("first_entrance"));
        g.c(map);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportModDownloadingTime...params = " + map, new Object[0]);
        Neurons.trackT(false, "creation.center-plus.mod-downloading.result.track", map, 1, new O1(9));
    }

    public static void k(int i7, @Nullable String str, boolean z6, boolean z7) {
        HashMap map = (HashMap) f105196b;
        long jLongValue = -1;
        if (map.containsKey("modDownloadingStartTime")) {
            Long l7 = (Long) map.get("modDownloadingStartTime");
            jLongValue = -1;
            if (l7 != null) {
                jLongValue = l7.longValue();
            }
        }
        long jCurrentTimeMillis = jLongValue;
        if (jLongValue < 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            BLog.wfmt("CenterPlusStatisticsHelper", C3751q.a(jCurrentTimeMillis, "reportModDownloadingTime error: startTime < 0 new startTime="), new Object[0]);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        map2.put("start_time", String.valueOf(jCurrentTimeMillis));
        map2.put("open_time", String.valueOf(jCurrentTimeMillis2));
        a.a(i7, "is_mod_ready", String.valueOf(z6), "engine_type", map2);
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map2.put("from_tab", str2);
        map2.put("is_direct", z7 ? "1" : "0");
        map2.put("is_first_install", String.valueOf(M.f110206b));
        map2.put("first_entrance", j.a("first_entrance"));
        g.c(map2);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportModDownloadingTime...params = " + map2, new Object[0]);
        Neurons.trackT(false, "creation.center-plus.mod-downloading.time.track", map2, 1, new O1(9));
    }

    public static void l(long j7, long j8, String str, String str2) {
        HashMap map = new HashMap();
        map.put("fps", String.valueOf(j7));
        map.put("memory", String.valueOf(j8));
        map.put("chip", str);
        map.put("capture_id", f105197c);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        map.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str3);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportNewBMMPerformance...params = " + map, new Object[0]);
        Neurons.trackT(false, "creation.new-bmm.fix-time.performance.track", map, 1, new O1(9));
    }

    public static void m(long j7, @Nullable String str) {
        if (TextUtils.isEmpty(f105195a)) {
            BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new CenterPlusStatisticsHelper$reportNewBMMPerformance$1(j7, str, null), 2, (Object) null);
        } else {
            l(j7, a(), f105195a, str);
        }
    }

    public static void n(String str, Object obj, Object obj2, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionName", str);
        jSONObject.put("param1", obj);
        jSONObject.put("param2", obj2);
        HashMap mapA = W.a("action", jSONObject.toJSONString(), "capture_id", str2);
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        mapA.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str4);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportNewBMMUserAction...params = " + mapA, new Object[0]);
        mapA.put("track_id", g.d());
        Neurons.trackT(false, "creation.new-bmm.user.action.track", mapA, 1, new O1(9));
    }

    public static void o(long j7, @Nullable String str) {
        HashMap map = new HashMap();
        map.put("time", String.valueOf(j7));
        map.put("is_first_install", String.valueOf(M.f110206b));
        map.put("first_entrance", j.a("first_entrance"));
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map.put("load_from", str2);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportSubClickLoadingResourceTime...params = " + map, new Object[0]);
        Neurons.trackT(false, "bilibili-creation.center-plus.loading-resource.sub-click.time.track", map, 1, new O1(9));
    }

    public static void p(@NotNull String str) {
        BLog.wfmt("CenterPlusStatisticsHelper", C4496a.a("saveCurrentTimestamp...key = ", str), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = (HashMap) f105196b;
        map.put(str, Long.valueOf(System.currentTimeMillis()));
        BLog.wfmt("CenterPlusStatisticsHelper", "saveCurrentTimestamp...key = " + str + ", value = " + map.get(str), new Object[0]);
    }
}
