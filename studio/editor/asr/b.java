package com.bilibili.studio.editor.asr;

import F3.C1692b;
import androidx.core.app.NotificationCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/b.class */
public final class b {
    public static long a(@Nullable List list) {
        long duration = 0;
        long j7 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                j7 = duration;
                if (!it.hasNext()) {
                    break;
                }
                duration += ((AudioInfo) it.next()).getDuration();
            }
        }
        return j7;
    }

    public static Map b() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Integer.valueOf(!Pw0.a.a(BiliContext.application()) ? 0 : ConnectivityMonitor.getInstance().isWifiActive() ? 1 : 2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            obj = 0;
        }
        return MapsKt.toMutableMap(MapsKt.mapOf(new Pair[]{TuplesKt.to("networkStatus", String.valueOf(((Number) obj).intValue())), TuplesKt.to("from", "5")}));
    }

    public static void c(boolean z6) {
        if (zw0.b.j()) {
            Xz0.d dVar = Xz0.d.f28458a;
            String str = z6 ? "1" : "0";
            dVar.getClass();
            Xz0.d.p("start", "", "0", "", "", "", str);
        }
    }

    public static void d(@NotNull String str, @Nullable String str2, @NotNull String str3, long j7, @NotNull String str4, @NotNull String str5, boolean z6) {
        if (zw0.b.j()) {
            Xz0.d dVar = Xz0.d.f28458a;
            String str6 = str2;
            if (str2 == null) {
                str6 = "";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str7 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j7 / 1000.0d)}, 1));
            String str8 = z6 ? "1" : "0";
            dVar.getClass();
            Xz0.d.p(str, str6, str3, str7, str4, str5, str8);
        }
    }

    public static /* synthetic */ void e(int i7, long j7, String str, String str2, String str3, String str4, String str5, boolean z6) {
        if ((i7 & 16) != 0) {
            str4 = "";
        }
        if ((i7 & 32) != 0) {
            str5 = "";
        }
        if ((i7 & 64) != 0) {
            z6 = false;
        }
        d(str, str2, str3, j7, str4, str5, z6);
    }

    public static void f(@Nullable String str, boolean z6, boolean z7, @Nullable AsrSource asrSource) {
        Xz0.d dVar = Xz0.d.f28458a;
        if (str == null) {
            str = "";
        }
        String str2 = z6 ? "1" : "0";
        String str3 = z7 ? "1" : "0";
        dVar.getClass();
        Xz0.d.o(str, "start", "", "0", "", "", "", "", "", str2, "", "", str3, asrSource);
    }

    public static /* synthetic */ void g(int i7, String str, boolean z6) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        f(str, true, z6, null);
    }

    public static void h(String str, String str2, String str3, String str4, long j7, long j8, long j9, long j10, long j11, boolean z6, AsrSource asrSource, int i7) {
        if ((i7 & 4096) != 0) {
            z6 = false;
        }
        Xz0.d dVar = Xz0.d.f28458a;
        if (str == null) {
            str = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        String str5 = z6 ? "1" : "0";
        dVar.getClass();
        Xz0.d.o(str, str2, str4, str3, String.valueOf(j8), String.valueOf(j9), String.valueOf(j7), String.valueOf(0), String.valueOf(0), String.valueOf(1), String.valueOf(j10), String.valueOf(j11), str5, asrSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.asr.bean.AudioInfo r11, @org.jetbrains.annotations.Nullable java.util.Map r12, @org.jetbrains.annotations.Nullable java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.b.i(java.lang.String, java.lang.String, java.lang.String, com.bilibili.studio.editor.asr.bean.AudioInfo, java.util.Map, java.lang.String, boolean):void");
    }

    public static void j(@NotNull String str, @NotNull AudioInfo audioInfo, long j7, @Nullable String str2, boolean z6) {
        Xz0.d dVar = Xz0.d.f28458a;
        String reportId = audioInfo.getReportId();
        String str3 = reportId;
        if (reportId == null) {
            str3 = "";
        }
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        long j8 = 1000;
        long trimInUs = audioInfo.getTrimInUs() / j8;
        long trimOutUs = audioInfo.getTrimOutUs() / j8;
        String videoPath = audioInfo.getVideoPath();
        String strSubstringAfterLast = videoPath != null ? videoPath.length() == 0 ? "" : StringsKt.substringAfterLast(videoPath, UtilsKt.DOT, "") : "";
        long jA = com.bilibili.studio.editor.asr.core.util.a.a(audioInfo.getVideoPath());
        long jD = AC0.i.d(audioInfo.getVideoPath());
        long jA2 = com.bilibili.studio.editor.asr.core.util.a.a(audioInfo.getAudioFilePath());
        long jD2 = AC0.i.d(audioInfo.getAudioFilePath());
        String str5 = z6 ? "1" : "0";
        dVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_id", str3);
        linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, str);
        linkedHashMap.put("error_msg", str4);
        linkedHashMap.put("trim_in", String.valueOf(trimInUs));
        linkedHashMap.put("trim_out", String.valueOf(trimOutUs));
        linkedHashMap.put("video_format", strSubstringAfterLast);
        linkedHashMap.put("video_file_size", String.valueOf(jA));
        linkedHashMap.put("video_duration", String.valueOf(jD));
        linkedHashMap.put("audio_file_size", String.valueOf(jA2));
        linkedHashMap.put("audio_duration", String.valueOf(jD2));
        linkedHashMap.put("extract_duration", String.valueOf(j7));
        linkedHashMap.put("is_new_editor", str5);
        Neurons.trackT(false, "creation.editor.video.extract.audio.track", linkedHashMap, 1, new C1692b(6));
    }

    public static /* synthetic */ void k(String str, AudioInfo audioInfo, long j7, String str2, int i7) {
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        j(str, audioInfo, j7, str2, false);
    }

    public static void l(long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Map mapB = b();
        mapB.put("taskId", str2);
        mapB.put("filePath", str3);
        mapB.put("startTime", String.valueOf(j7));
        mapB.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j8));
        Neurons.trackT(false, str, mapB, 1, new AT0.c(8));
    }
}
