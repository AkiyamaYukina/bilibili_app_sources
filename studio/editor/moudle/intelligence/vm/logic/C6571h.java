package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import Cw0.o;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.studio.editor.asr.CaptionAsrManager;
import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.CaptionRecognition;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.mall.ui.page.home.view.HomeFragmentV3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/h.class */
public class C6571h extends C9270a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CaptionAsrManager f107814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f107815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f107817g;

    @Nullable
    public volatile Bw0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f107818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f107819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107820k;

    public C6571h(@Nullable EditVideoInfo editVideoInfo, @NotNull IntelligenceEnterResult intelligenceEnterResult) {
        super(editVideoInfo, intelligenceEnterResult);
        this.f107814d = new CaptionAsrManager();
    }

    public final void d(List list, AsrExtraMsg asrExtraMsg, com.bilibili.studio.editor.moudle.intelligence.vm.l lVar, long j7, String str) {
        int asrResult = asrExtraMsg.getAsrResult();
        boolean z6 = asrResult == 1 || asrResult == 4;
        boolean z7 = asrResult == 1 || asrResult == 3 || asrResult == 4;
        C9270a.a(this, str, "asr", j7, z7, asrExtraMsg.getMsgForReport(), null, MapsKt.mapOf(TuplesKt.to("complete_success", z6 ? "1" : "0")), 96);
        if (!z7) {
            lVar.a(j7, asrExtraMsg.getMsgForReport());
            return;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        lVar.b(asrResult, j7, list);
    }

    public final void e(com.bilibili.studio.editor.moudle.intelligence.vm.o oVar, long j7) {
        if (!this.f107818i || !this.f107819j) {
            BLog.e("SmartMusic", "isReadConfigReadyNew=" + this.f107818i + ",isFastASRReady=" + this.f107819j);
            return;
        }
        IntelligenceAudioConfig intelligenceAudioConfig = new IntelligenceAudioConfig();
        Bw0.a aVar = this.h;
        intelligenceAudioConfig.autoBgm = aVar != null && aVar.f999d;
        Bw0.a aVar2 = this.h;
        boolean z6 = false;
        if (aVar2 != null) {
            z6 = false;
            if (aVar2.f1000e) {
                z6 = true;
            }
        }
        intelligenceAudioConfig.autoASR = z6;
        Bw0.a aVar3 = this.h;
        intelligenceAudioConfig.audioVolume = aVar3 != null ? Integer.valueOf(aVar3.f1002g) : null;
        Bw0.a aVar4 = this.h;
        intelligenceAudioConfig.audioSrcVolume = aVar4 != null ? Integer.valueOf(aVar4.f1001f) : null;
        Bw0.a aVar5 = this.h;
        intelligenceAudioConfig.musicRate = aVar5 != null ? Double.valueOf(aVar5.f996a) : null;
        Bw0.a aVar6 = this.h;
        intelligenceAudioConfig.singRate = aVar6 != null ? Double.valueOf(aVar6.f997b) : null;
        Bw0.a aVar7 = this.h;
        Double dValueOf = null;
        if (aVar7 != null) {
            dValueOf = Double.valueOf(aVar7.f998c);
        }
        intelligenceAudioConfig.speechRate = dValueOf;
        intelligenceAudioConfig.fastAsrResult = this.f107820k;
        oVar.d(intelligenceAudioConfig, System.currentTimeMillis() - j7);
    }

    public void f(@NotNull final String str, @NotNull final com.bilibili.studio.editor.moudle.intelligence.vm.l lVar) {
        if (this.f130976c) {
            BLog.e("SmartMusic", "continueASR fail isCanceled=true");
            return;
        }
        this.f107817g = 1;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C9270a.b(this, str, "asr", null, null, 12);
        AsrSource asrSource = AsrSource.INTELLIGENCE;
        Function2<? super List<CaptionRecognition>, ? super AsrExtraMsg, Unit> function2 = new Function2(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6571h f107803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107804c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f107805d;

            {
                this.f107802a = jCurrentTimeMillis;
                this.f107803b = this;
                this.f107804c = lVar;
                this.f107805d = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                List list = (List) obj;
                AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj2;
                BLog.e("SmartMusic", "continueFast onSuccess captionList=" + list + ",extraMsg=" + asrExtraMsg);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j7 = this.f107802a;
                C6571h c6571h = this.f107803b;
                c6571h.f107817g = 2;
                c6571h.d(list, asrExtraMsg, this.f107804c, jCurrentTimeMillis2 - j7, this.f107805d);
                return Unit.INSTANCE;
            }
        };
        Function1<? super AsrExtraMsg, Unit> function1 = new Function1(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6571h f107807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107808c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f107809d;

            {
                this.f107806a = jCurrentTimeMillis;
                this.f107807b = this;
                this.f107808c = lVar;
                this.f107809d = str;
            }

            public final Object invoke(Object obj) {
                AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj;
                BLog.e("SmartMusic", "continueFast onFailed extraMsg=" + asrExtraMsg);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j7 = this.f107806a;
                C6571h c6571h = this.f107807b;
                c6571h.f107817g = 3;
                c6571h.d(null, asrExtraMsg, this.f107808c, jCurrentTimeMillis2 - j7, this.f107809d);
                return Unit.INSTANCE;
            }
        };
        Function0<Unit> function0 = new Function0(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6571h f107810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f107811b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107812c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107813d;

            {
                this.f107810a = this;
                this.f107811b = jCurrentTimeMillis;
                this.f107812c = str;
                this.f107813d = lVar;
            }

            public final Object invoke() {
                Unit unit;
                C6571h c6571h = this.f107810a;
                if (c6571h.f107817g != 1) {
                    unit = Unit.INSTANCE;
                } else {
                    c6571h.f107817g = 4;
                    BLog.e("SmartMusic", "continueFast onCancel");
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f107811b;
                    C9270a.a(c6571h, this.f107812c, "asr", jCurrentTimeMillis2, false, "asr cancel", null, null, 224);
                    this.f107813d.a(jCurrentTimeMillis2, "continueFast onCancel");
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        };
        CaptionAsrManager captionAsrManager = this.f107814d;
        Hw0.c cVar = captionAsrManager.f105512b;
        if (cVar != null) {
            cVar.f8823a = function2;
            cVar.f8824b = function1;
            cVar.f8825c = function0;
        }
        if (captionAsrManager.c()) {
            return;
        }
        Lw0.h hVar = (Lw0.h) Lw0.h.f14848e.getValue();
        String str2 = captionAsrManager.f105522m;
        Iterator it = ((ConcurrentHashMap) hVar.f14852d.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            for (Cw0.p pVar : (Iterable) ((Map.Entry) it.next()).getValue()) {
                if ((pVar instanceof Cw0.o) && Intrinsics.areEqual(((Cw0.o) pVar).f1854j, str2)) {
                    final Cw0.o oVar = (Cw0.o) pVar;
                    final int i7 = 0;
                    ((ThreadPoolExecutor) hVar.f14849a.getValue()).execute(new Runnable(oVar, i7) { // from class: Lw0.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f14836a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f14837b;

                        {
                            this.f14836a = i7;
                            this.f14837b = oVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f14836a) {
                                case 0:
                                    o oVar2 = (o) this.f14837b;
                                    oVar2.f1855k = false;
                                    oVar2.d();
                                    break;
                                default:
                                    HomeFragmentV3.pf((HomeFragmentV3) this.f14837b);
                                    break;
                            }
                        }
                    });
                }
            }
        }
    }

    public void g() {
        if (this.f107816f == 1 || this.f107817g == 1) {
            this.f107814d.b();
        }
        CaptionAsrManager captionAsrManager = this.f107814d;
        synchronized (captionAsrManager) {
            BLog.i("CaptionAsrManager", "release:" + captionAsrManager.h);
            captionAsrManager.h = 0;
            captionAsrManager.f105512b = null;
            captionAsrManager.b();
            captionAsrManager.f();
            ConcurrentHashMap<String, CopyOnWriteArrayList<Job>> concurrentHashMap = com.bilibili.studio.videoeditor.generalrender.model.t.f109653a;
            if (concurrentHashMap != null) {
                CopyOnWriteArrayList<Job> copyOnWriteArrayList = concurrentHashMap.get("ASR_VIDEO_CONVERT");
                Iterator<Job> it = copyOnWriteArrayList != null ? copyOnWriteArrayList.iterator() : null;
                while (it != null && it.hasNext()) {
                    Job.DefaultImpls.cancel$default(it.next(), (CancellationException) null, 1, (Object) null);
                }
                concurrentHashMap.remove("ASR_VIDEO_CONVERT");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.studio.editor.moudle.intelligence.vm.logic.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void h(@NotNull final String str, @NotNull final com.bilibili.studio.editor.moudle.intelligence.vm.o oVar) {
        EditVideoInfo editVideoInfo = this.f130974a;
        if (editVideoInfo == null) {
            oVar.b();
            return;
        }
        this.f107816f = 1;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C9270a.b(this, str, "fast_asr", null, null, 12);
        if (com.bilibili.studio.videoeditor.extension.f.v(editVideoInfo)) {
            this.f107816f = 2;
            C9270a.a(this, str, "fast_asr", 0L, true, "all image", null, MapsKt.mapOf(TuplesKt.to("complete_success", "1")), 96);
            oVar.d(null, 0L);
            return;
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        C9270a.b(this, str, "config_parse", null, null, 12);
        Task.callInBackground(new Object()).continueWith(new Continuation(jCurrentTimeMillis2, this, str, oVar, jCurrentTimeMillis) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107797a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6571h f107798b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107799c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.o f107800d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f107801e;

            {
                this.f107797a = jCurrentTimeMillis2;
                this.f107798b = this;
                this.f107799c = str;
                this.f107800d = oVar;
                this.f107801e = jCurrentTimeMillis;
            }

            @Override // bolts.Continuation
            public final Object then(Task task) {
                long j7 = this.f107797a;
                C6571h c6571h = this.f107798b;
                String str2 = this.f107799c;
                com.bilibili.studio.editor.moudle.intelligence.vm.o oVar2 = this.f107800d;
                long j8 = this.f107801e;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                boolean z6 = task.getResult() != null;
                if (!z6) {
                    BLog.e("SmartMusic", zw0.b.r());
                }
                C9270a.a(c6571h, str2, "config_parse", jCurrentTimeMillis3 - j7, z6, z6 ? "" : "parse asr config failed", null, null, 224);
                c6571h.f107818i = true;
                c6571h.e(oVar2, j8);
                return Unit.INSTANCE;
            }
        }, Task.UI_THREAD_EXECUTOR);
        this.f107814d.i(str, AsrSource.INTELLIGENCE, editVideoInfo, new C6564a(this, str, oVar, jCurrentTimeMillis), new Function0(this, jCurrentTimeMillis, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6571h f107794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f107795b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107796c;

            {
                this.f107794a = this;
                this.f107795b = jCurrentTimeMillis;
                this.f107796c = str;
            }

            public final Object invoke() {
                Unit unit;
                C6571h c6571h = this.f107794a;
                if (c6571h.f107816f != 1) {
                    unit = Unit.INSTANCE;
                } else {
                    c6571h.f107816f = 4;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - this.f107795b;
                    v0.b(jCurrentTimeMillis3, "startASR onCancel costTime=", "SmartMusic");
                    C9270a.a(c6571h, this.f107796c, "fast_asr", jCurrentTimeMillis3, false, "fast asr cancel", null, null, 224);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        });
    }
}
