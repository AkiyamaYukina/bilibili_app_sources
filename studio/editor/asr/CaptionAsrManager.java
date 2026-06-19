package com.bilibili.studio.editor.asr;

import Cw0.i;
import Cw0.o;
import Fm0.C1896d;
import Iw0.a;
import cn.com.chinatelecom.account.api.d.m;
import com.alibaba.fastjson.JSON;
import com.bilibili.bililive.videoliveplayer.net.beans.topoperation.LiveTopMultiVoiceHatPlayInfo;
import com.bilibili.bililive.videoliveplayer.ui.roomv3.multivoice.beans.MultiVoicePlayInfo;
import com.bilibili.gripper.api.blconfig.GDynamicConfig;
import com.bilibili.gripper.api.log.GLog;
import com.bilibili.gripper.container.image.producer.InitImageKt;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2;
import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.core.bean.AsrCreateTaskResultNew;
import com.bilibili.studio.editor.asr.core.bean.AsrRequestParam;
import com.bilibili.studio.editor.asr.core.config.AsrStep;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6564a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6565b;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.generalrender.model.t;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.mall.ui.page.base.MallWebFragmentV2;
import com.mall.ui.page.base.task.k;
import com.mall.ui.page.common.fragmentation.SupportRootContainerFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import mL.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import video.biz.offline.list.logic.model.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/CaptionAsrManager.class */
@Deprecated(message = "旧版编辑器ASR")
public final class CaptionAsrManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Hw0.c f105512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105513c;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f105518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f105519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f105520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Dw0.a f105521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f105522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public AsrSource f105523n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Iw0.a f105511a = new Iw0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<AudioInfo> f105514d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<AudioInfo> f105515e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<c> f105516f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<AsrResultWrapper> f105517g = new CopyOnWriteArrayList<>();

    public static final Object a(CaptionAsrManager captionAsrManager, AudioInfo audioInfo, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        long jCurrentTimeMillis = System.currentTimeMillis();
        captionAsrManager.f105511a.b(audioInfo, new f(jCurrentTimeMillis, captionAsrManager, audioInfo, cancellableContinuationImpl), new g(jCurrentTimeMillis, captionAsrManager, audioInfo, cancellableContinuationImpl), new h(jCurrentTimeMillis, captionAsrManager, audioInfo), i.f105580a);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static boolean d(AudioInfo audioInfo) {
        boolean z6 = false;
        if (audioInfo.getFrom() == 0) {
            z6 = false;
            if (audioInfo.getHasExtract()) {
                String audioFilePath = audioInfo.getAudioFilePath();
                z6 = false;
                if (!((audioFilePath == null || audioFilePath.length() == 0) ? false : m.b(audioFilePath))) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void b() {
        synchronized (this) {
            BLog.i("CaptionAsrManager", "cancel:" + this.h);
            this.h = 2;
            Hw0.c cVar = this.f105512b;
            if (cVar != null) {
                cVar.b(this.f105522m, this.f105513c, this.f105518i, this.f105519j, this.f105514d, this.f105523n);
            }
            Job jobLaunch$default = BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new CaptionAsrManager$cancel$1(this, null), 2, (Object) null);
            if (t.f109653a == null) {
                t.f109653a = new ConcurrentHashMap<>();
            }
            CopyOnWriteArrayList<Job> copyOnWriteArrayList = t.f109653a.get("ASR_VIDEO_CONVERT");
            if (copyOnWriteArrayList == null) {
                t.f109653a.put("ASR_VIDEO_CONVERT", new CopyOnWriteArrayList<>());
            } else {
                copyOnWriteArrayList.add(jobLaunch$default);
            }
            Iterator<c> it = this.f105516f.iterator();
            while (it.hasNext()) {
                ((Lw0.h) Lw0.h.f14848e.getValue()).a(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0636  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instruction units count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.CaptionAsrManager.c():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.CaptionAsrManager.e():void");
    }

    public final void f() {
        this.f105513c = 0L;
        this.f105518i = 0L;
        this.f105519j = 0L;
        this.f105520k = 0L;
        this.h = 0;
        this.f105514d.clear();
        this.f105516f.clear();
        this.f105517g.clear();
        this.f105515e.clear();
    }

    public final void g() {
        synchronized (this) {
            BLog.i("CaptionAsrManager", "resumeTask waitingAsrDeque:" + this.f105515e.size());
            e();
            if (c()) {
                return;
            }
            if (!this.f105515e.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator<AudioInfo> it = this.f105515e.iterator();
                while (it.hasNext()) {
                    AudioInfo next = it.next();
                    BLog.i("CaptionAsrManager", "resumeTask: hasExtract:" + next.getHasExtract());
                    if (next.getHasExtract()) {
                        it.remove();
                        arrayList.add(next);
                    }
                }
                BLog.i("CaptionAsrManager", "resumeTask: audioInfoList:" + arrayList.size());
                if (!arrayList.isEmpty()) {
                    h(arrayList);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.studio.editor.asr.c, java.lang.Object] */
    public final void h(List<AudioInfo> list) {
        Cw0.i iVar;
        com.bilibili.bplus.im.protobuf.a.b(this.h, ((ArrayList) list).size(), "startAsrRequest:", " audioInfoList:", "CaptionAsrManager");
        j(false);
        Hw0.c cVar = this.f105512b;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            cVar.f8830i = System.currentTimeMillis();
        }
        final Lw0.h hVar = (Lw0.h) Lw0.h.f14848e.getValue();
        final ?? obj = new Object();
        obj.f105525a = list;
        this.f105516f.add((c) obj);
        obj.f105526b = new ID0.b(2, this, obj);
        obj.f105527c = new R5.i(this, 2);
        obj.f105528d = new com.bilibili.app.gemini.player.feature.gif.a(1, this, (Object) obj);
        obj.f105529e = new com.bilibili.biligame.widget.viewholder.d(3, this, (Object) obj);
        Dw0.a aVar = this.f105521l;
        ((ConcurrentHashMap) hVar.f14851c.getValue()).put(obj, new ArrayList());
        for (final AudioInfo audioInfo : list) {
            if (aVar == null || !aVar.f3233a) {
                iVar = new Cw0.i(new AsrRequestParam(audioInfo.getAudioFilePath(), audioInfo.getCaptionType()));
            } else {
                final o oVar = new o(new AsrRequestParam(audioInfo.getAudioFilePath(), audioInfo.getCaptionType()), audioInfo.getReportId());
                oVar.f1856l = new Function1(hVar, oVar, obj, audioInfo) { // from class: Lw0.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final h f14840a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final o f14841b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final com.bilibili.studio.editor.asr.c f14842c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final AudioInfo f14843d;

                    {
                        this.f14840a = hVar;
                        this.f14841b = oVar;
                        this.f14842c = obj;
                        this.f14843d = audioInfo;
                    }

                    public final Object invoke(Object obj2) {
                        this.f14840a.c(this.f14841b, this.f14842c, this.f14843d, (String) obj2, null);
                        return Unit.INSTANCE;
                    }
                };
                iVar = oVar;
            }
            final Cw0.i iVar2 = iVar;
            final Cw0.i iVar3 = iVar;
            final int i7 = 0;
            final Cw0.i iVar4 = iVar;
            iVar.c(aVar == null ? new Object() : aVar, new Function1(iVar2, hVar, obj, audioInfo) { // from class: Lw0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final h f14844a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i f14845b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.studio.editor.asr.c f14846c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final AudioInfo f14847d;

                {
                    this.f14844a = hVar;
                    this.f14845b = iVar2;
                    this.f14846c = obj;
                    this.f14847d = audioInfo;
                }

                public final Object invoke(Object obj2) {
                    List list2;
                    String str = (String) obj2;
                    h hVar2 = this.f14844a;
                    i iVar5 = this.f14845b;
                    boolean z6 = iVar5 instanceof o;
                    com.bilibili.studio.editor.asr.c cVar2 = this.f14846c;
                    if (z6 && (list2 = (List) ((ConcurrentHashMap) hVar2.f14852d.getValue()).get(cVar2)) != null) {
                        list2.remove(iVar5);
                    }
                    Map<AsrStep, Long> map = iVar5.f1839e;
                    com.bilibili.studio.editor.asr.core.remote.f fVar = iVar5.f1838d;
                    String taskId = null;
                    if (fVar != null) {
                        AsrCreateTaskResultNew asrCreateTaskResultNew = fVar.f105558f;
                        taskId = null;
                        if (asrCreateTaskResultNew != null) {
                            taskId = asrCreateTaskResultNew.getTaskId();
                        }
                    }
                    AudioInfo audioInfo2 = this.f14847d;
                    com.bilibili.studio.editor.asr.b.i("success", "", "0", audioInfo2, map, taskId, false);
                    hVar2.b(cVar2, new AsrResultWrapper(audioInfo2, null, null, str, 6, null));
                    return Unit.INSTANCE;
                }
            }, new Function1(iVar3, hVar, obj, audioInfo) { // from class: Lw0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AudioInfo f14827a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i f14828b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final h f14829c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.studio.editor.asr.c f14830d;

                {
                    this.f14827a = audioInfo;
                    this.f14828b = iVar3;
                    this.f14829c = hVar;
                    this.f14830d = obj;
                }

                public final Object invoke(Object obj2) {
                    AsrBaseException asrBaseException = (AsrBaseException) obj2;
                    String message = asrBaseException.getMessage();
                    int code = asrBaseException.getCode();
                    i iVar5 = this.f14828b;
                    Map<AsrStep, Long> map = iVar5.f1839e;
                    com.bilibili.studio.editor.asr.core.remote.f fVar = iVar5.f1838d;
                    String taskId = null;
                    if (fVar != null) {
                        AsrCreateTaskResultNew asrCreateTaskResultNew = fVar.f105558f;
                        taskId = null;
                        if (asrCreateTaskResultNew != null) {
                            taskId = asrCreateTaskResultNew.getTaskId();
                        }
                    }
                    AudioInfo audioInfo2 = this.f14827a;
                    com.bilibili.studio.editor.asr.b.i("failed", message, String.valueOf(code), audioInfo2, map, taskId, false);
                    AsrResultWrapper asrResultWrapper = new AsrResultWrapper(audioInfo2, null, asrBaseException, null, 10, null);
                    h hVar2 = this.f14829c;
                    com.bilibili.studio.editor.asr.c cVar2 = this.f14830d;
                    hVar2.b(cVar2, asrResultWrapper);
                    if (iVar5 instanceof o) {
                        hVar2.c((o) iVar5, cVar2, audioInfo2, null, asrBaseException);
                    }
                    return Unit.INSTANCE;
                }
            }, new Function0(i7, audioInfo, iVar4) { // from class: Lw0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f14831a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f14832b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f14833c;

                {
                    this.f14831a = i7;
                    this.f14832b = audioInfo;
                    this.f14833c = iVar4;
                }

                public final Object invoke() {
                    List list2;
                    String pkId = null;
                    switch (this.f14831a) {
                        case 0:
                            i iVar5 = (i) this.f14833c;
                            Map<AsrStep, Long> map = iVar5.f1839e;
                            com.bilibili.studio.editor.asr.core.remote.f fVar = iVar5.f1838d;
                            String taskId = null;
                            if (fVar != null) {
                                AsrCreateTaskResultNew asrCreateTaskResultNew = fVar.f105558f;
                                taskId = null;
                                if (asrCreateTaskResultNew != null) {
                                    taskId = asrCreateTaskResultNew.getTaskId();
                                }
                            }
                            com.bilibili.studio.editor.asr.b.i("cancel", "", "5", (AudioInfo) this.f14832b, map, taskId, false);
                            break;
                        case 1:
                            GDynamicConfig gDynamicConfig = (GDynamicConfig) this.f14833c;
                            List listListOf = CollectionsKt.listOf("dynamic-all-gif2");
                            Random random = InitImageKt.a;
                            try {
                                String strConfig = gDynamicConfig.config("imageload.default_image_mp4_style", "");
                                list2 = listListOf;
                                if (strConfig != null) {
                                    List array = JSON.parseArray(strConfig, String.class);
                                    list2 = null;
                                    if (array != null) {
                                        list2 = null;
                                        if (!array.isEmpty()) {
                                            list2 = array;
                                        }
                                    }
                                    if (list2 == null) {
                                        list2 = listListOf;
                                    }
                                }
                            } catch (Exception e7) {
                                ((GLog) this.f14832b).e("BImageLoaderHelper", "parse error", new IllegalArgumentException("Illegal fawkes config, check the value of imageload.default_image_mp4_style", e7));
                                list2 = listListOf;
                            }
                            break;
                        case 2:
                            ((KH.g) this.f14832b).invoke(((IOException) this.f14833c).getMessage());
                            break;
                        case 3:
                            LiveTopMultiVoiceHatPlayInfo liveTopMultiVoiceHatPlayInfo = new LiveTopMultiVoiceHatPlayInfo();
                            iL.a aVar2 = (iL.a) this.f14832b;
                            aVar2.g = liveTopMultiVoiceHatPlayInfo;
                            MultiVoicePlayInfo multiVoicePlayInfo = ((bI.a) this.f14833c).d;
                            if (multiVoicePlayInfo != null) {
                                pkId = multiVoicePlayInfo.getPkId();
                            }
                            liveTopMultiVoiceHatPlayInfo.setPkId(pkId);
                            a.a aVar3 = ((aL.a) aVar2).a.g;
                            LiveTopMultiVoiceHatPlayInfo liveTopMultiVoiceHatPlayInfo2 = aVar2.g;
                            aVar2.i(liveTopMultiVoiceHatPlayInfo2);
                            aVar3.a(liveTopMultiVoiceHatPlayInfo2);
                            break;
                        default:
                            ((Function1) this.f14832b).invoke(((l) this.f14833c).a);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            List list2 = (List) ((ConcurrentHashMap) hVar.f14851c.getValue()).get(obj);
            if (list2 != null) {
                list2.add(iVar);
            }
            final Cw0.i iVar5 = iVar;
            final int i8 = 0;
            ((ThreadPoolExecutor) hVar.f14849a.getValue()).execute(new Runnable(iVar5, i8) { // from class: Lw0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f14838a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f14839b;

                {
                    this.f14838a = i8;
                    this.f14839b = iVar5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MallWebFragmentV2 mallWebFragmentV2;
                    HybridWebViewV2 hybridWebViewV2;
                    switch (this.f14838a) {
                        case 0:
                            ((i) this.f14839b).d();
                            break;
                        default:
                            SupportRootContainerFragment fragment = ((k) this.f14839b).getFragment();
                            if (fragment instanceof SupportRootContainerFragment) {
                                nR0.c cVar2 = fragment.d;
                                if (cVar2 != null) {
                                    cVar2.Zd();
                                }
                                break;
                            } else if (fragment instanceof nR0.c) {
                                ((nR0.c) fragment).Zd();
                                break;
                            } else if ((fragment instanceof MallWebFragmentV2) && (hybridWebViewV2 = (mallWebFragmentV2 = (MallWebFragmentV2) fragment).f73673d) != null && hybridWebViewV2.getWebView() != null) {
                                C1896d.b(mallWebFragmentV2.f73673d.getWebView(), "if (window.inAppMessageDidDismissWithRefresh) {window.inAppMessageDidDismissWithRefresh(); }");
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Dw0.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.studio.editor.asr.e, java.lang.Object] */
    public final void i(@Nullable String str, @NotNull AsrSource asrSource, @NotNull EditVideoInfo editVideoInfo, @NotNull C6564a c6564a, @Nullable C6565b c6565b) {
        this.h = 1;
        f();
        if (str == null || str.length() == 0) {
            this.f105522m = ec.a.a(com.bilibili.adcommon.utils.a.a(), System.currentTimeMillis(), "_");
        } else {
            this.f105522m = str;
        }
        this.f105523n = asrSource;
        this.f105513c = System.currentTimeMillis();
        b.g(12, this.f105522m, false);
        if (this.f105523n == AsrSource.EDITOR) {
            b.c(false);
        }
        ?? obj = new Object();
        obj.f3233a = true;
        this.f105521l = obj;
        List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
        if (recordInfoList != null) {
            for (RecordInfo recordInfo : recordInfoList) {
                this.f105514d.add(new AudioInfo(String.valueOf(recordInfo.getId()), recordInfo.capTimeDuration, recordInfo.getPath(), recordInfo.getTrimIn(), recordInfo.getTrimOut(), recordInfo.inPoint, recordInfo.outPoint, (float) recordInfo.speed, null, 1, true, null, this.f105522m, null, 10496, null));
            }
        }
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList != null) {
            for (BClip bClip : userTrackBClipList) {
                if (bClip.clipMediaType == 1) {
                    CopyOnWriteArrayList<AudioInfo> copyOnWriteArrayList = this.f105514d;
                    long duration = bClip.getDuration(false);
                    String strB = a.C0057a.b(bClip.getTrimIn(), bClip.getTrimOut(), bClip.videoPath);
                    String str2 = bClip.id;
                    String str3 = strB;
                    if (strB == null) {
                        str3 = "";
                    }
                    copyOnWriteArrayList.add(new AudioInfo(str2, duration, str3, bClip.getTrimIn(), bClip.getTrimOut(), bClip.getInPoint(), bClip.getOutPoint(), bClip.playRate, null, 0, false, bClip.videoPath, this.f105522m, null, 9472, null));
                }
            }
        }
        this.f105515e.addAll(this.f105514d);
        this.f105512b = new Hw0.c(new Object(), new com.bilibili.gripper.e(1), new com.bilibili.gripper.f(1), c6565b, c6564a, this.f105514d.size());
        g();
        Job jobLaunch$default = BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new CaptionAsrManager$convertVideoToAudio$1(this, null), 2, (Object) null);
        if (t.f109653a == null) {
            t.f109653a = new ConcurrentHashMap<>();
        }
        CopyOnWriteArrayList<Job> copyOnWriteArrayList2 = t.f109653a.get("ASR_VIDEO_CONVERT");
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.add(jobLaunch$default);
        } else {
            t.f109653a.put("ASR_VIDEO_CONVERT", new CopyOnWriteArrayList<>());
        }
    }

    public final void j(boolean z6) {
        if (this.f105520k == 0) {
            this.f105520k = System.currentTimeMillis();
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f105516f;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            this.f105519j = (System.currentTimeMillis() - this.f105520k) + this.f105519j;
            if (z6) {
                this.f105520k = 0L;
            }
        }
    }
}
