package com.bilibili.studio.editor.asr.zip2ai;

import F3.U2;
import Xz0.g;
import Y9.p;
import androidx.fragment.app.A;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.service.PlaybackCaptureService;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.module.vip.combine.m;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.f;
import com.bilibili.studio.videoeditor.extension.k;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/AsrZip2AiTask.class */
public final class AsrZip2AiTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Job f105677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile int f105678d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AsrZip2AiTask f105675a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f105676b = LazyKt.lazy(new U2(10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static volatile String f105679e = "";

    public static String a(EditVideoInfo editVideoInfo) {
        String strP;
        List<BClip> bClipList;
        String uploadId = editVideoInfo.getUploadId();
        EditVideoClip mainVideoTrack = editVideoInfo.getMainVideoTrack();
        if (mainVideoTrack == null || (bClipList = mainVideoTrack.getBClipList()) == null) {
            strP = null;
        } else {
            List<BClip> list = bClipList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String str = ((BClip) obj).asrCacheKey;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            strP = CollectionsKt.p(arrayList, "-", (CharSequence) null, (CharSequence) null, new p(2), 30);
        }
        List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
        String strP2 = null;
        if (recordInfoList != null) {
            List<RecordInfo> list2 = recordInfoList;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                String str2 = ((RecordInfo) obj2).asrCacheKey;
                if (str2 != null && str2.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            strP2 = CollectionsKt.p(arrayList2, "-", (CharSequence) null, (CharSequence) null, new m(1), 30);
        }
        return B0.a.a(uploadId, "-", DigestUtils.md5(strP + "-" + strP2));
    }

    public static void b() {
        Lazy lazy = zw0.b.f130950a;
        if (DeviceDecision.INSTANCE.getBoolean("uper.enable_asr_upload_analysis", false)) {
            Job job = f105677c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            e eVar = e.f105683a;
            try {
                FileUtils.deleteDirectory((File) e.f105684b.getValue());
            } catch (Exception e7) {
                M.b("ZipAsrResult release fail: ", e7.getMessage(), "ZipAsrResult");
            }
            f105679e = "";
            f105678d = 1;
        }
    }

    public static void c(AsrFrom asrFrom, long j7, int i7, int i8, Long l7, AsrStep asrStep, AsrAiTaskStatus asrAiTaskStatus, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        String status = asrAiTaskStatus.getStatus();
        StringBuilder sb = new StringBuilder("step=");
        sb.append(asrStep);
        sb.append(" spend=");
        sb.append(jCurrentTimeMillis);
        sb.append(" videoCount=");
        sb.append(i7);
        sb.append(" size=");
        sb.append(l7);
        BLog.e("AsrZip2AiTask", A.a(" success=", status, " msg=", str, sb));
        Xz0.d dVar = Xz0.d.f28458a;
        String value = asrFrom.getValue();
        long jLongValue = l7 != null ? l7.longValue() : 0L;
        int i9 = f105678d;
        String strName = asrStep.name();
        String status2 = asrAiTaskStatus.getStatus();
        dVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", value);
        linkedHashMap.put("video_count", String.valueOf(i7));
        linkedHashMap.put("record_count", String.valueOf(i8));
        linkedHashMap.put(TextSource.CFG_SIZE, String.valueOf(jLongValue));
        linkedHashMap.put("num", String.valueOf(i9));
        linkedHashMap.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("step", strName);
        linkedHashMap.put(PlaybackCaptureService.KEY_RESULT_CODE, status2);
        linkedHashMap.put("result_msg", str);
        g.c(linkedHashMap);
        Neurons.trackT$default(false, "creation.asr-analysis.upload.track", linkedHashMap, 0, (Function0) null, 24, (Object) null);
    }

    public static /* synthetic */ void d(AsrZip2AiTask asrZip2AiTask, AsrFrom asrFrom, long j7, int i7, int i8, Long l7, AsrStep asrStep, AsrAiTaskStatus asrAiTaskStatus, int i9) {
        if ((i9 & 64) != 0) {
            asrAiTaskStatus = AsrAiTaskStatus.SUCCESS;
        }
        asrZip2AiTask.getClass();
        c(asrFrom, j7, i7, i8, l7, asrStep, asrAiTaskStatus, "");
    }

    public final void e(@Nullable EditVideoInfo editVideoInfo, @NotNull AsrFrom asrFrom) {
        int i7;
        List<BClip> bClipList;
        synchronized (this) {
            Lazy lazy = zw0.b.f130950a;
            DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
            if (deviceDecision.getBoolean("uper.enable_asr_upload_analysis", false)) {
                int i8 = f105678d;
                f105678d = i8 + 1;
                if (i8 >= k.b(deviceDecision.dd("uper.asr_upload_analysis_max_time", "0"))) {
                    return;
                }
                if (editVideoInfo == null) {
                    return;
                }
                if (asrFrom == AsrFrom.DRAFT || asrFrom == AsrFrom.INTELLIGENCE || asrFrom == AsrFrom.AUTO) {
                    if (!f.u(editVideoInfo)) {
                        return;
                    }
                }
                String strA = a(editVideoInfo);
                if (Intrinsics.areEqual(f105679e, strA)) {
                    BLog.e("AsrZip2AiTask", "cache return");
                    return;
                }
                f105679e = strA;
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = System.currentTimeMillis();
                Ref.IntRef intRef = new Ref.IntRef();
                EditVideoClip mainVideoTrack = editVideoInfo.getMainVideoTrack();
                if (mainVideoTrack == null || (bClipList = mainVideoTrack.getBClipList()) == null) {
                    i7 = 0;
                } else {
                    List<BClip> list = bClipList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        int i9 = 0;
                        while (true) {
                            i7 = i9;
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = ((BClip) it.next()).asrCacheKey;
                            if (str != null && str.length() != 0) {
                                int i10 = i9 + 1;
                                i9 = i10;
                                if (i10 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                    i9 = i10;
                                }
                            }
                        }
                    } else {
                        i7 = 0;
                    }
                }
                intRef.element = i7;
                Ref.IntRef intRef2 = new Ref.IntRef();
                List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
                int i11 = 0;
                if (recordInfoList != null) {
                    List<RecordInfo> list2 = recordInfoList;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        int i12 = 0;
                        while (true) {
                            i11 = i12;
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str2 = ((RecordInfo) it2.next()).asrCacheKey;
                            if (str2 != null && str2.length() != 0) {
                                int i13 = i12 + 1;
                                i12 = i13;
                                if (i13 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                    i12 = i13;
                                }
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                }
                intRef2.element = i11;
                Job job = f105677c;
                if (job != null && job.isActive()) {
                    Job job2 = f105677c;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    d(this, asrFrom, longRef.element, intRef.element, intRef2.element, 0L, AsrStep.START, AsrAiTaskStatus.CANCEL, 128);
                }
                f105677c = BuildersKt.launch$default((CoroutineScope) f105676b.getValue(), (CoroutineContext) null, (CoroutineStart) null, new AsrZip2AiTask$run$1(longRef, asrFrom, intRef, intRef2, editVideoInfo, null), 3, (Object) null);
            }
        }
    }
}
