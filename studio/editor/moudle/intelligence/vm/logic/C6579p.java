package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import bolts.Continuation;
import bolts.Task;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.multi.BiliEditorMultiAsrManager;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/p.class */
public final class C6579p extends C6571h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Lazy<List<Bw0.b>> f107845p = LazyKt.lazy(new FZ0.b(11));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public volatile Bw0.d f107846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f107847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f107848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f107849o;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/p$a.class */
    public static final class a extends TypeToken<List<? extends Bw0.b>> {
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.p$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/p$b.class */
    public static final class b {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h
    public final void f(@NotNull final String str, @NotNull final com.bilibili.studio.editor.moudle.intelligence.vm.l lVar) {
        String strC;
        if (this.f130976c) {
            BLog.e("SmartMusic", "continueASR fail isCanceled=true");
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C9270a.b(this, str, "asr", null, null, 12);
        BiliEditorMultiAsrManager biliEditorMultiAsrManager = BiliEditorMultiAsrManager.f105608a;
        String str2 = this.f107815e;
        AsrSource asrSource = AsrSource.INTELLIGENCE;
        Function2 function2 = new Function2(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6579p f107834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107835c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f107836d;

            {
                this.f107833a = jCurrentTimeMillis;
                this.f107834b = this;
                this.f107835c = lVar;
                this.f107836d = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                List list = (List) obj;
                AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj2;
                BLog.e("SmartMusic", "continueFast onSuccess captionList=" + list + ",extraMsg=" + asrExtraMsg);
                this.f107834b.i(list, asrExtraMsg, this.f107835c, System.currentTimeMillis() - this.f107833a, this.f107836d);
                return Unit.INSTANCE;
            }
        };
        Function1 function1 = new Function1(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6579p f107838b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107839c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f107840d;

            {
                this.f107837a = jCurrentTimeMillis;
                this.f107838b = this;
                this.f107839c = lVar;
                this.f107840d = str;
            }

            public final Object invoke(Object obj) {
                AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj;
                BLog.e("SmartMusic", "continueFast onFailed extraMsg=" + asrExtraMsg);
                this.f107838b.i(null, asrExtraMsg, this.f107839c, System.currentTimeMillis() - this.f107837a, this.f107840d);
                return Unit.INSTANCE;
            }
        };
        Function0 function0 = new Function0(jCurrentTimeMillis, lVar, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6579p f107842b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107843c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.intelligence.vm.l f107844d;

            {
                this.f107841a = jCurrentTimeMillis;
                this.f107842b = this;
                this.f107843c = str;
                this.f107844d = lVar;
            }

            public final Object invoke() {
                BLog.e("SmartMusic", "continueFast onCancel");
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f107841a;
                C9270a.a(this.f107842b, this.f107843c, "asr", jCurrentTimeMillis2, false, "asr cancel", null, null, 224);
                this.f107844d.a(jCurrentTimeMillis2, "continueFast onCancel");
                return Unit.INSTANCE;
            }
        };
        if (str2 == null) {
            biliEditorMultiAsrManager.getClass();
            strC = BiliEditorMultiAsrManager.c();
        } else {
            biliEditorMultiAsrManager.getClass();
            strC = str2;
        }
        com.bilibili.studio.editor.asr.b.g(8, strC, true);
        if (asrSource == AsrSource.EDITOR) {
            com.bilibili.studio.editor.asr.b.c(true);
        }
        biliEditorMultiAsrManager.e(false, strC, asrSource, biliEditorMultiAsrManager.b(this.f130974a, true, false, false), new com.bilibili.studio.editor.asr.multi.g(function2, null, function1, function0, null, 18));
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h
    public final void g() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h
    public final void h(@NotNull final String str, @NotNull final com.bilibili.studio.editor.moudle.intelligence.vm.o oVar) {
        EditVideoInfo editVideoInfo = this.f130974a;
        if (editVideoInfo == null) {
            oVar.b();
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C9270a.b(this, str, "fast_asr", null, null, 12);
        if (com.bilibili.studio.videoeditor.extension.f.v(editVideoInfo)) {
            C9270a.a(this, str, "fast_asr", 0L, true, "all image", null, MapsKt.mapOf(TuplesKt.to("complete_success", "1")), 96);
            oVar.d(null, 0L);
        } else {
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            C9270a.b(this, str, "config_parse", null, null, 12);
            Task.callInBackground(new Object()).continueWith(new Continuation(jCurrentTimeMillis2, this, str, oVar, jCurrentTimeMillis) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f107828a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6579p f107829b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f107830c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.studio.editor.moudle.intelligence.vm.o f107831d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f107832e;

                {
                    this.f107828a = jCurrentTimeMillis2;
                    this.f107829b = this;
                    this.f107830c = str;
                    this.f107831d = oVar;
                    this.f107832e = jCurrentTimeMillis;
                }

                @Override // bolts.Continuation
                public final Object then(Task task) {
                    long j7 = this.f107828a;
                    C6579p c6579p = this.f107829b;
                    String str2 = this.f107830c;
                    com.bilibili.studio.editor.moudle.intelligence.vm.o oVar2 = this.f107831d;
                    long j8 = this.f107832e;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    Collection collection = (Collection) task.getResult();
                    boolean z6 = collection == null || collection.isEmpty();
                    if (z6) {
                        BLog.e("SmartMusic", zw0.b.r());
                    }
                    C9270a.a(c6579p, str2, "config_parse", jCurrentTimeMillis3 - j7, !z6, !z6 ? "" : "parse asr config failed", null, null, 224);
                    c6579p.f107847m = true;
                    c6579p.j(oVar2, j8);
                    return Unit.INSTANCE;
                }
            }, Task.UI_THREAD_EXECUTOR);
            BiliEditorMultiAsrManager.f105608a.d(str, AsrSource.INTELLIGENCE, editVideoInfo, new Function2(this, str, oVar, jCurrentTimeMillis) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6579p f107821a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f107822b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.studio.editor.moudle.intelligence.vm.o f107823c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f107824d;

                {
                    this.f107821a = this;
                    this.f107822b = str;
                    this.f107823c = oVar;
                    this.f107824d = jCurrentTimeMillis;
                }

                public final Object invoke(Object obj, Object obj2) {
                    C6579p c6579p = this.f107821a;
                    String str2 = this.f107822b;
                    com.bilibili.studio.editor.moudle.intelligence.vm.o oVar2 = this.f107823c;
                    long j7 = this.f107824d;
                    Bw0.d dVar = (Bw0.d) obj;
                    AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj2;
                    c6579p.getClass();
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - j7;
                    BLog.e("SmartMusic", "startASR onSuccess =" + dVar + ",costTime=" + jCurrentTimeMillis3);
                    c6579p.f107848n = true;
                    if (dVar == null) {
                        C9270a.a(c6579p, str2, "fast_asr", jCurrentTimeMillis3, false, "audioTypeLabel and audioUseLabel is empty", null, null, 224);
                        c6579p.f107846l = null;
                        c6579p.j(oVar2, j7);
                    } else {
                        int fastAsrResult = asrExtraMsg.getFastAsrResult();
                        c6579p.f107849o = fastAsrResult;
                        C9270a.a(c6579p, str2, "fast_asr", jCurrentTimeMillis3, fastAsrResult == 1 || fastAsrResult == 3 || fastAsrResult == 4, asrExtraMsg.getMsgForReport(), null, MapsKt.mapOf(TuplesKt.to("complete_success", fastAsrResult == 1 || fastAsrResult == 4 ? "1" : "0")), 96);
                        c6579p.f107846l = dVar;
                        c6579p.j(oVar2, j7);
                    }
                    return Unit.INSTANCE;
                }
            }, new Function0(jCurrentTimeMillis, this, str) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f107825a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6579p f107826b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f107827c;

                {
                    this.f107825a = jCurrentTimeMillis;
                    this.f107826b = this;
                    this.f107827c = str;
                }

                public final Object invoke() {
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - this.f107825a;
                    v0.b(jCurrentTimeMillis3, "startASR onCancel costTime=", "SmartMusic");
                    C9270a.a(this.f107826b, this.f107827c, "fast_asr", jCurrentTimeMillis3, false, "fast asr cancel", null, null, 224);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final void i(List list, AsrExtraMsg asrExtraMsg, com.bilibili.studio.editor.moudle.intelligence.vm.l lVar, long j7, String str) {
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

    public final void j(com.bilibili.studio.editor.moudle.intelligence.vm.o oVar, long j7) {
        Object obj;
        if (!this.f107847m || !this.f107848n) {
            BLog.e("SmartMusic", "isReadConfigReadyNew=" + this.f107847m + ",isFastASRReady=" + this.f107848n);
            return;
        }
        Bw0.d dVar = this.f107846l;
        Bw0.d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = Bw0.d.f1010d;
        }
        Iterator it = ((List) f107845p.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            Bw0.b bVar = (Bw0.b) next;
            double d7 = 100;
            double d8 = dVar2.f1011a * d7;
            double d9 = dVar2.f1012b;
            double d10 = d9 * d7;
            double d11 = dVar2.f1013c;
            double d12 = d7 * d11;
            boolean z6 = d8 != 0.0d ? d8 > ((double) bVar.f1006d.get(0).floatValue()) : d8 >= ((double) bVar.f1006d.get(0).floatValue());
            boolean z7 = d10 != 0.0d ? d10 > ((double) bVar.f1007e.get(0).floatValue()) : d10 >= ((double) bVar.f1007e.get(0).floatValue());
            boolean z8 = d12 != 0.0d ? d12 > ((double) bVar.f1008f.get(0).floatValue()) : d12 >= ((double) bVar.f1008f.get(0).floatValue());
            if (z6) {
                if (dVar2.f1011a <= bVar.f1006d.get(1).floatValue() && z7 && d9 <= bVar.f1007e.get(1).floatValue() && z8 && d11 <= bVar.f1008f.get(1).floatValue()) {
                    obj = next;
                    break;
                }
            }
        }
        Bw0.b bVar2 = (Bw0.b) obj;
        IntelligenceAudioConfig intelligenceAudioConfig = new IntelligenceAudioConfig();
        intelligenceAudioConfig.autoBgm = bVar2 != null ? Intrinsics.areEqual(bVar2.f1003a, Boolean.TRUE) : false;
        intelligenceAudioConfig.autoASR = bVar2 != null ? Intrinsics.areEqual(bVar2.f1005c, Boolean.TRUE) : false;
        intelligenceAudioConfig.audioVolume = bVar2 != null ? bVar2.f1004b : null;
        intelligenceAudioConfig.audioSrcVolume = bVar2 != null ? bVar2.f1009g : null;
        intelligenceAudioConfig.musicRate = Double.valueOf(dVar2.f1011a);
        intelligenceAudioConfig.singRate = Double.valueOf(dVar2.f1012b);
        intelligenceAudioConfig.speechRate = Double.valueOf(dVar2.f1013c);
        intelligenceAudioConfig.fastAsrResult = this.f107849o;
        oVar.d(intelligenceAudioConfig, System.currentTimeMillis() - j7);
    }
}
