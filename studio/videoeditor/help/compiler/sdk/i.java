package com.bilibili.studio.videoeditor.help.compiler.sdk;

import G.p;
import HG0.t1;
import P50.n;
import R50.r;
import Xz0.j;
import Xz0.k;
import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.compose.ui.platform.C4481p;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videocompile.BVideoCompiler;
import com.bilibili.studio.videocompile.IBVideoCompileCallback;
import com.bilibili.studio.videocompile.IBVideoCompileDataReport;
import com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting;
import com.bilibili.studio.videocompile.IBVideoCompileLogger;
import com.bilibili.studio.videocompile.data.BVideoCompileCancelData;
import com.bilibili.studio.videocompile.data.BVideoCompileFailData;
import com.bilibili.studio.videocompile.data.d;
import com.bilibili.studio.videocompile.define.BVideoCompileRetryType;
import com.bilibili.studio.videocompile.internal.strategy.H265Strategy;
import com.bilibili.studio.videoeditor.bean.RecordVR;
import com.bilibili.studio.videoeditor.help.mux.MuxInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.videoeditor.config.BExportConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kntr.common.upper.trace.EventLevel;
import kntr.common.upper.trace.ITraceManager;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pw0.C8360a;
import q4.M;
import sw0.C8631d;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/i.class */
public final class i implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static volatile i f109694p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Context f109695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Handler f109696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Context f109697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MuxInfo f109698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public r f109699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public n f109700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public UpperTimeline f109701g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f109702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f109703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f109704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f109705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public CopyOnWriteArrayList<CC0.g> f109706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f109707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Integer f109708o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/i$a.class */
    public static final class a {
        @NotNull
        public static i a(@NotNull Context context) {
            if (i.f109694p == null) {
                synchronized (Reflection.getOrCreateKotlinClass(i.class)) {
                    if (i.f109694p == null) {
                        i iVar = new i();
                        iVar.f109695a = context;
                        iVar.f109696b = new Handler(Looper.getMainLooper());
                        iVar.f109706m = new CopyOnWriteArrayList<>();
                        iVar.f109707n = "h264";
                        i.f109694p = iVar;
                        final i iVar2 = i.f109694p;
                        iVar2.getClass();
                        Application application = BiliContext.application();
                        if (application != null) {
                            BVideoCompiler.init(application, new IBVideoCompileGlobalSetting(iVar2) { // from class: com.bilibili.studio.videoeditor.help.compiler.sdk.VideoCompilerSdk$bvideoInit$1$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final i f109682a;

                                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/VideoCompilerSdk$bvideoInit$1$1$a.class */
                                public static final class a implements IBVideoCompileDataReport {
                                    @Override // com.bilibili.studio.videocompile.IBVideoCompileDataReport
                                    public final void report(boolean z6, String str, Map<String, String> map) {
                                        Neurons.reportClick(z6, str, map);
                                    }

                                    @Override // com.bilibili.studio.videocompile.IBVideoCompileDataReport
                                    public final void trackT(boolean z6, String str, Map<String, String> map) {
                                        Neurons.trackT$default(z6, str, map, 0, new AT0.c(8), 8, (Object) null);
                                    }
                                }

                                {
                                    this.f109682a = iVar2;
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final String dd(String str, String str2) {
                                    return DeviceDecision.INSTANCE.dd(str, str2);
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final boolean enableDebug() {
                                    return false;
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final String getBuvid() {
                                    return BuvidHelper.getBuvid();
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final String getConfig(String str, String str2) {
                                    return (String) ConfigManager.Companion.config().get(str, str2);
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.videocompile.IBVideoCompileDataReport, java.lang.Object] */
                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final IBVideoCompileDataReport getDataReport() {
                                    return new Object();
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final int getDeviceType() {
                                    return com.bilibili.studio.videoeditor.media.performance.a.e().f109842d == 3 ? 2 : 1;
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.videocompile.IBVideoCompileLogger, java.lang.Object] */
                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final IBVideoCompileLogger getLogger() {
                                    return new Object();
                                }

                                @Override // com.bilibili.studio.videocompile.IBVideoCompileGlobalSetting
                                public final String getOutputFileDir() {
                                    File fileG = AC0.i.g(this.f109682a.f109697c.getApplicationContext());
                                    return fileG == null ? "" : p.a(fileG.getPath(), "/");
                                }
                            });
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            i.f109694p.f109697c = context;
            return i.f109694p;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/i$b.class */
    public static final class b implements IBVideoCompileCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f109709a;

        public b(i iVar) {
            this.f109709a = iVar;
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileCanceled(int i7) {
            Map<String, String> mapEmptyMap;
            BLog.e("VideoCompilerSdk", "===onCompileCanceled== " + i7);
            com.bilibili.studio.videocompile.data.d data = BVideoCompiler.getData();
            if (data != null) {
                d.a aVar = data.f108725f;
                mapEmptyMap = aVar == null ? MapsKt.emptyMap() : new BVideoCompileCancelData(data.f108720a, data.f108721b, aVar).createMapData();
            } else {
                mapEmptyMap = null;
            }
            if (pw0.b.b()) {
                C8631d c8631d = C8631d.f127390b;
                EventLevel eventLevel = EventLevel.ERROR;
                Map<String, String> mapEmptyMap2 = mapEmptyMap;
                if (mapEmptyMap == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                ITraceManager.end$default(c8631d, "视频导出", "uper_export_video_cancel", "【视频导出】取消导出", eventLevel, (String) null, mapEmptyMap2, false, 80, (Object) null);
            } else {
                C8360a c8360a = sw0.f.f127393a;
                if (c8360a != null) {
                    c8360a.f125646i = "end";
                    c8360a.f125640b = "error";
                    c8360a.f125642d = "【视频导出】取消导出";
                    c8360a.f125641c = "uper_export_video_cancel";
                    c8360a.b(mapEmptyMap);
                    c8360a.a();
                }
            }
            BVideoCompiler.release();
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileFailed(int i7, String str) {
            T7.a.a(i7, "===onCompileFailed== ", "VideoCompilerSdk");
            Map<String, String> mapEmptyMap = null;
            if (i7 == 301) {
                com.bilibili.studio.videocompile.data.d data = BVideoCompiler.getData();
                if (data != null) {
                    d.c cVar = data.f108724e;
                    mapEmptyMap = cVar == null ? MapsKt.emptyMap() : new BVideoCompileFailData(data.f108720a, data.f108721b, cVar).createMapData();
                }
                if (pw0.b.b()) {
                    C8631d c8631d = C8631d.f127390b;
                    EventLevel eventLevel = EventLevel.ERROR;
                    Map<String, String> mapEmptyMap2 = mapEmptyMap;
                    if (mapEmptyMap == null) {
                        mapEmptyMap2 = MapsKt.emptyMap();
                    }
                    ITraceManager.end$default(c8631d, "视频导出", "uper_export_video_cancel", "【视频导出】取消导出", eventLevel, (String) null, mapEmptyMap2, false, 80, (Object) null);
                } else {
                    C8360a c8360a = sw0.f.f127393a;
                    if (c8360a != null) {
                        c8360a.f125646i = "end";
                        c8360a.f125640b = "error";
                        c8360a.f125642d = "【视频导出】取消导出";
                        c8360a.f125641c = "uper_export_video_cancel";
                        c8360a.b(mapEmptyMap);
                        c8360a.a();
                    }
                }
            } else {
                com.bilibili.studio.videocompile.data.d data2 = BVideoCompiler.getData();
                Map<String, String> mapEmptyMap3 = null;
                if (data2 != null) {
                    d.c cVar2 = data2.f108724e;
                    mapEmptyMap3 = cVar2 == null ? MapsKt.emptyMap() : new BVideoCompileFailData(data2.f108720a, data2.f108721b, cVar2).createMapData();
                }
                if (pw0.b.b()) {
                    C8631d c8631d2 = C8631d.f127390b;
                    EventLevel eventLevel2 = EventLevel.ERROR;
                    Map<String, String> mapEmptyMap4 = mapEmptyMap3;
                    if (mapEmptyMap3 == null) {
                        mapEmptyMap4 = MapsKt.emptyMap();
                    }
                    ITraceManager.end$default(c8631d2, "视频导出", "uper_export_video_failure", "【视频导出】导出失败", eventLevel2, (String) null, mapEmptyMap4, false, 80, (Object) null);
                } else {
                    C8360a c8360a2 = sw0.f.f127393a;
                    if (c8360a2 != null) {
                        c8360a2.f125646i = "end";
                        c8360a2.f125640b = "error";
                        c8360a2.f125642d = "【视频导出】导出失败";
                        c8360a2.f125641c = "uper_export_video_failure";
                        c8360a2.b(mapEmptyMap3);
                        c8360a2.a();
                    }
                }
            }
            this.f109709a.j(i7, str);
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileFinished(String str, String str2, boolean z6) {
            Map<String, String> mapEmptyMap;
            StringBuilder sbA = G0.b.a("===onCompileFinished= videoPath= ", str, " + ， dcimPath=== ", str2, ", isSkipTranscode= ");
            sbA.append(z6);
            BLog.e("VideoCompilerSdk", sbA.toString());
            com.bilibili.studio.videocompile.data.d data = BVideoCompiler.getData();
            if (data != null) {
                d.f fVar = data.f108723d;
                mapEmptyMap = fVar == null ? MapsKt.emptyMap() : new com.bilibili.studio.videocompile.data.c(data.f108720a, data.f108721b, fVar).createMapData();
            } else {
                mapEmptyMap = null;
            }
            if (pw0.b.b()) {
                C8631d c8631d = C8631d.f127390b;
                Map<String, String> mapEmptyMap2 = mapEmptyMap;
                if (mapEmptyMap == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                ITraceManager.end$default(c8631d, "视频导出", "uper_export_video_success", "【视频导出】导出成功", (EventLevel) null, (String) null, mapEmptyMap2, false, 88, (Object) null);
            } else {
                C8360a c8360a = sw0.f.f127393a;
                if (c8360a != null) {
                    c8360a.f125646i = "process";
                    c8360a.f125640b = "info";
                    c8360a.f125642d = "【视频导出】导出成功";
                    c8360a.f125641c = "uper_export_video_success";
                    c8360a.b(mapEmptyMap);
                    c8360a.a();
                }
            }
            boolean zB = yY.d.b(str2);
            i iVar = this.f109709a;
            if (zB) {
                i.a(iVar, str, str);
            } else {
                i.a(iVar, str, str2);
            }
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileProgress(float f7) {
            final int i7 = (int) f7;
            final i iVar = this.f109709a;
            if (iVar.h) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                iVar.f109696b.post(new Runnable(iVar, i7) { // from class: com.bilibili.studio.videoeditor.help.compiler.sdk.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final i f109692a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f109693b;

                    {
                        this.f109692a = iVar;
                        this.f109693b = i7;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i iVar2 = this.f109692a;
                        int i8 = this.f109693b;
                        Iterator<CC0.g> it = iVar2.f109706m.iterator();
                        while (it.hasNext()) {
                            it.next().m(i8);
                        }
                    }
                });
                return;
            }
            Iterator<CC0.g> it = iVar.f109706m.iterator();
            while (it.hasNext()) {
                it.next().m(i7);
            }
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileRetryed(BVideoCompileRetryType bVideoCompileRetryType) {
            M.b("===onCompileRetryed= retryType= ", bVideoCompileRetryType.name(), "VideoCompilerSdk");
        }

        @Override // com.bilibili.studio.videocompile.IBVideoCompileCallback
        public final void onCompileStart() {
            Map<String, String> mapEmptyMap;
            BLog.e("VideoCompilerSdk", "==== onCompileStart==");
            com.bilibili.studio.videocompile.data.d data = BVideoCompiler.getData();
            if (data != null) {
                d.C1203d c1203d = data.f108722c;
                mapEmptyMap = c1203d == null ? MapsKt.emptyMap() : new com.bilibili.studio.videocompile.data.a(data.f108720a, data.f108721b, c1203d).createMapData();
            } else {
                mapEmptyMap = null;
            }
            if (pw0.b.b()) {
                C8631d c8631d = C8631d.f127390b;
                String strA = j.a("track_id");
                Map<String, String> mapEmptyMap2 = mapEmptyMap;
                if (mapEmptyMap == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                c8631d.start("centerplus_publish_video", strA, "视频导出", "uper_export_video_start", "【视频导出】开始导出", mapEmptyMap2);
                return;
            }
            C8360a c8360a = new C8360a();
            c8360a.h = "视频导出";
            c8360a.f125639a = "centerplus_publish_video";
            c8360a.f125644f = j.a("track_id");
            sw0.f.f127393a = c8360a;
            c8360a.f125646i = "start";
            c8360a.f125640b = "info";
            c8360a.f125642d = "【视频导出】开始导出";
            c8360a.f125641c = "uper_export_video_start";
            c8360a.b(mapEmptyMap);
            c8360a.a();
        }
    }

    public static final void a(i iVar, String str, String str2) {
        List<RecordInfo> list;
        MuxInfo muxInfo = iVar.f109698d;
        if (muxInfo != null && (list = muxInfo.recordInfoList) != null && list.size() > 0) {
            Context context = iVar.f109695a;
            String str3 = iVar.f109698d.dstMediaPath;
            if (!TextUtils.isEmpty(str3)) {
                SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(context.getApplicationContext());
                String strOptString = sharedPreferencesHelper.optString("video_record_gen_list", "");
                if (!TextUtils.isEmpty(strOptString)) {
                    ArrayList arrayList = new ArrayList();
                    List<RecordVR> array = JSON.parseArray(strOptString, RecordVR.class);
                    if (array != null && array.size() > 0) {
                        for (RecordVR recordVR : array) {
                            if (recordVR.getVideoPath() != null && recordVR.getVideoPath().equals(str3)) {
                                arrayList.add(recordVR);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                array.remove((RecordVR) it.next());
                            }
                            sharedPreferencesHelper.edit().putString("video_record_gen_list", JSON.toJSONString(array)).apply();
                        }
                    }
                }
            }
        }
        if (yY.d.b(str) || yY.d.b(str2)) {
            iVar.j(1, "mMuxInfo.dstMediaPath is empty");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            iVar.j(2, "file not exist");
            return;
        }
        SharedPreferencesHelper sharedPreferencesHelper2 = new SharedPreferencesHelper(iVar.f109695a.getApplicationContext());
        String strOptString2 = sharedPreferencesHelper2.optString("video_gen_suc_list", "");
        if (TextUtils.isEmpty(strOptString2)) {
            sharedPreferencesHelper2.edit().putString("video_gen_suc_list", JSON.toJSONString(C4481p.a(str))).apply();
        } else {
            List array2 = JSON.parseArray(strOptString2, String.class);
            if (array2 != null) {
                Iterator it2 = array2.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).equalsIgnoreCase(str)) {
                        break;
                    }
                }
                array2.add(str);
                sharedPreferencesHelper2.edit().putString("video_gen_suc_list", JSON.toJSONString(array2)).apply();
            } else {
                array2.add(str);
                sharedPreferencesHelper2.edit().putString("video_gen_suc_list", JSON.toJSONString(array2)).apply();
            }
        }
        BLog.e("VideoCompilerSdk", "onMuxCompileFinished  fileSize is " + file.length() + "$");
        MuxInfo muxInfo2 = iVar.f109698d;
        if (muxInfo2 != null) {
            muxInfo2.dstDCIMPath = str2;
        }
        String str4 = iVar.f109704k;
        String str5 = muxInfo2.dstMediaPath;
        if (((Boolean) zw0.b.f130963o.getValue()).booleanValue()) {
            Task.callInBackground(new CC0.e(str4, str5, 2));
        }
        MuxInfo muxInfo3 = iVar.f109698d;
        final String str6 = muxInfo3.dstMediaPath;
        final boolean z6 = muxInfo3.isFastVideo;
        final String str7 = muxInfo3.publishNavId;
        if (str6 != null && str6.length() != 0) {
            final int i7 = 2;
            final String str8 = "creation.video-quality.after-synthetic.0.show";
            Task.callInBackground(new Callable(i7, str6, str8, str7, z6) { // from class: CC0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f1524a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f1525b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f1526c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f1527d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f1528e;

                {
                    this.f1524a = str6;
                    this.f1525b = i7;
                    this.f1526c = z6;
                    this.f1527d = str8;
                    this.f1528e = str7;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str9 = this.f1524a;
                    int i8 = this.f1525b;
                    String str10 = this.f1527d;
                    String str11 = this.f1528e;
                    try {
                        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                        j.c("router_topic_id", Xz0.g.f28463b);
                        Map mapB = j.b(k.f28474a);
                        HashMap map = (HashMap) mapB;
                        map.put("first_entrance", j.a("first_entrance"));
                        map.put("send_type", j.a("send_type"));
                        map.put("track_id", Xz0.g.d());
                        LinkedHashMap linkedHashMap = (LinkedHashMap) f.b(str9, true);
                        String str12 = (String) linkedHashMap.get("resolution");
                        String str13 = str12;
                        if (str12 == null) {
                            str13 = "";
                        }
                        map.put("video_resolution", str13);
                        String str14 = (String) linkedHashMap.get("frame_rate");
                        String str15 = str14;
                        if (str14 == null) {
                            str15 = "";
                        }
                        map.put("video_framerate", str15);
                        map.put("video_shortside", f.c((String) linkedHashMap.get("resolution")));
                        map.put("video_bitrate", f.f((String) linkedHashMap.get("video_bitrate")));
                        String str16 = (String) linkedHashMap.get("file_size");
                        String str17 = str16;
                        if (str16 == null) {
                            str17 = "";
                        }
                        map.put("file_size", str17);
                        String str18 = (String) linkedHashMap.get(EditCustomizeSticker.TAG_DURATION);
                        if (str18 == null) {
                            str18 = "";
                        }
                        map.put("video_time", str18);
                        map.put("compile_version", String.valueOf(i8));
                        map.put("fast_video", this.f1526c ? "1" : "0");
                        if (Intrinsics.areEqual("creation.video-quality.after-synthetic.0.show", str10)) {
                            map.put("publish_nav_id", str11);
                        }
                        Neurons.reportExposure$default(false, str10, mapB, (List) null, 8, (Object) null);
                    } catch (Exception e7) {
                        BLog.e("GeneralCompositeReport", e7);
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        iVar.i(true);
    }

    public final void b() {
        if (d()) {
            g(-1, "cancel", "cancel by user");
            BLog.e("VideoCompilerSdk", "begin cancel");
            BVideoCompiler.cancel();
            BVideoCompiler.release();
            k.a.f108315a.b(UpperEngineScene.COMPILE_SDK);
            this.f109702i = false;
            Iterator<CC0.g> it = this.f109706m.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        }
    }

    @NotNull
    public final e c(@NotNull MuxInfo muxInfo) {
        BLog.e("VideoCompilerSdk", "initParams =====");
        this.f109698d = muxInfo;
        return this;
    }

    public final boolean d() {
        boolean z6;
        synchronized (this) {
            BLog.e("VideoCompilerSdk", "isProcessing=== " + this.f109702i);
            if (!this.f109702i && BVideoCompiler.isVideoCompiling()) {
                this.f109702i = true;
            }
            z6 = this.f109702i;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0943 A[EDGE_INSN: B:249:0x0943->B:287:0x0a42 BREAK  A[LOOP:4: B:268:0x09bd->B:377:0x09bd]] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0764 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v127, types: [UC0.i, UC0.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 3408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.compiler.sdk.i.e():void");
    }

    public final void f(@NotNull CC0.g gVar) {
        BLog.e("VideoCompilerSdk", "registMuxerListener =====");
        this.f109706m.remove(gVar);
        this.f109706m.add(gVar);
        if (this.f109702i) {
            return;
        }
        if (this.h) {
            Integer num = this.f109708o;
            j(num != null ? num.intValue() : -1, "");
        }
        if (this.f109703j) {
            i(false);
        }
    }

    public final void g(int i7, String str, String str2) {
        if (this.f109698d == null) {
            CC0.f.g("", 0, 0, 0L, 0.0d, "", "failure", -1, "mMuxInfo is null", "", this.f109707n);
            return;
        }
        File file = new File(this.f109698d.dstMediaPath);
        long jSizeOf = file.exists() ? FileUtils.sizeOf(file) : 0L;
        r rVar = this.f109699e;
        String jSONString = rVar != null ? JSON.toJSONString(rVar.v()) : "";
        MuxInfo muxInfo = this.f109698d;
        CC0.f.g(muxInfo.dstMediaPath, muxInfo.videoWidth, muxInfo.videoHeight, jSizeOf, System.currentTimeMillis() - this.f109705l, String.valueOf(new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes()), str, i7, str2, jSONString, this.f109707n);
    }

    public final void h() {
        long jSizeOf;
        BLog.e("VideoCompilerSdk", "begin start =====");
        if (!BVideoCompiler.isInit()) {
            j(23, "");
            return;
        }
        if (this.f109702i) {
            return;
        }
        H265Strategy h265Strategy = H265Strategy.f108790a;
        this.f109707n = BExportConfig.enableHevc ? "h265" : "h264";
        this.f109704k = ec.a.a(BiliAccounts.get(this.f109695a).mid(), System.currentTimeMillis(), "_");
        this.f109702i = true;
        this.f109703j = false;
        this.h = false;
        this.f109708o = null;
        this.f109705l = System.currentTimeMillis();
        CC0.f.d(this.f109704k, this.f109698d, null);
        MuxInfo muxInfo = this.f109698d;
        if (muxInfo != null) {
            String str = muxInfo.dstMediaPath;
            if (TextUtils.isEmpty(str)) {
                jSizeOf = 0;
            } else {
                try {
                    File file = new File(str);
                    jSizeOf = 0;
                    if (file.exists()) {
                        jSizeOf = FileUtils.sizeOf(file);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    jSizeOf = 0;
                }
            }
            r rVar = this.f109699e;
            String jSONString = rVar != null ? JSON.toJSONString(rVar.v()) : "";
            MuxInfo muxInfo2 = this.f109698d;
            CC0.f.g(muxInfo2.dstMediaPath, muxInfo2.videoWidth, muxInfo2.videoHeight, jSizeOf, 0.0d, String.valueOf(new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes()), "start", -1, "", jSONString, this.f109707n);
        } else {
            CC0.f.g("", 0, 0, 0L, 0.0d, "", "start", -1, "mMuxInfo is null", "", this.f109707n);
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f109696b.post(new t1(this, 3));
        } else {
            BLog.e("VideoCompilerSdk", "is main thread begin realStart =====");
            e();
        }
    }

    public final void i(boolean z6) {
        BLog.e("VideoCompilerSdk", "tellDone =====");
        BVideoCompiler.release();
        k.a.f108315a.b(UpperEngineScene.COMPILE_SDK);
        this.f109703j = true;
        this.f109702i = false;
        if (z6) {
            g(0, "success", "");
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f109696b.post(new com.bilibili.ship.theseus.ugc.weblayer.e(this, 1));
            return;
        }
        Iterator<CC0.g> it = this.f109706m.iterator();
        while (it.hasNext()) {
            it.next().g(this.f109698d.dstMediaPath);
        }
    }

    public final void j(final int i7, String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            switch (i7) {
                case -1:
                    str2 = "exception error";
                    break;
                case 0:
                default:
                    str2 = "";
                    break;
                case 1:
                    str2 = "mMuxInfo.dstMediaPath is empty";
                    break;
                case 2:
                    str2 = "file not exist";
                    break;
                case 3:
                    str2 = "mCompileProgress != 100";
                    break;
                case 4:
                    str2 = "mNvsStreamingContext == null";
                    break;
                case 5:
                    str2 = "mMuxInfo == null || mMuxInfo.bClipList == null";
                    break;
                case 6:
                    str2 = "mNvsTimeline == null";
                    break;
                case 7:
                    str2 = "nvsVideoTrack == null";
                    break;
                case 8:
                    str2 = "nvsAudioTrack == null";
                    break;
                case 9:
                    str2 = "nvsMusicTrack == null";
                    break;
                case 10:
                    str2 = "set music to audio track, buildOk: false";
                    break;
                case 11:
                    str2 = "set record to timeline, buildOk: false";
                    break;
                case 12:
                    str2 = "set clip to video track, buildOk: false";
                    break;
                case 13:
                    str2 = "set transform2dfx to video clips, buildOk: false";
                    break;
                case 14:
                    str2 = "set theme to timeline, buildOk: false";
                    break;
                case 15:
                    str2 = "set filter to video clip, buildOk: false";
                    break;
                case 16:
                    str2 = "set native audio to timeline, buildOk: false";
                    break;
                case 17:
                    str2 = "set caption to timeline, buildOk: false";
                    break;
                case 18:
                    str2 = "set fxSticker to timeline:, buildOk: false";
                    break;
                case 19:
                    str2 = "set transition to timeline:, buildOk: false";
                    break;
                case 20:
                    str2 = "set scene FxInfo to video clips:, buildOk: false";
                    break;
                case 21:
                    str2 = "set music rhythm Fx, buildOk: false";
                    break;
                case 22:
                    str2 = "set timeline video Fx, buildOk: false";
                    break;
                case 23:
                    str2 = "bvideo compiler sdk not init";
                    break;
                case 24:
                    str2 = "muxVideoTrack == null";
                    break;
                case 25:
                    str2 = "set visual effect to video track,buildOk:false";
                    break;
                case 26:
                    str2 = "set tts to audio track,build:false";
                    break;
            }
        }
        M.b("tellError ===errorMsg = ", str2, "VideoCompilerSdk");
        k.a.f108315a.b(UpperEngineScene.COMPILE_SDK);
        BVideoCompiler.release();
        this.f109702i = false;
        this.h = true;
        this.f109708o = Integer.valueOf(i7);
        g(i7, "failure", str2);
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f109696b.post(new Runnable(this, i7) { // from class: com.bilibili.studio.videoeditor.help.compiler.sdk.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i f109690a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f109691b;

                {
                    this.f109690a = this;
                    this.f109691b = i7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = this.f109690a;
                    int i8 = this.f109691b;
                    Iterator<CC0.g> it = iVar.f109706m.iterator();
                    while (it.hasNext()) {
                        it.next().onError(i8, "onCompileFailed");
                    }
                }
            });
            return;
        }
        Iterator<CC0.g> it = this.f109706m.iterator();
        while (it.hasNext()) {
            it.next().onError(i7, "onCompileFailed");
        }
    }
}
