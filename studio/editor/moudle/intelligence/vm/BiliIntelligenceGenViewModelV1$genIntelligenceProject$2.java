package com.bilibili.studio.editor.moudle.intelligence.vm;

import android.app.Application;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.frame.FrameSceneType;
import com.bilibili.studio.editor.moudle.intelligence.frame.d;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.AiFrameConfig;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.timecal.PartTimeStrategyConfig;
import com.bilibili.studio.editor.moudle.intelligence.frame.task.RunTaskType;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6581s;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6586x;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.CountDownTimerC6585w;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.N;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.U;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.y;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenViewModelV1$genIntelligenceProject$2.class */
final class BiliIntelligenceGenViewModelV1$genIntelligenceProject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliIntelligenceGenViewModelV1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliIntelligenceGenViewModelV1$genIntelligenceProject$2(BiliIntelligenceGenViewModelV1 biliIntelligenceGenViewModelV1, Continuation<? super BiliIntelligenceGenViewModelV1$genIntelligenceProject$2> continuation) {
        super(2, continuation);
        this.this$0 = biliIntelligenceGenViewModelV1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliIntelligenceGenViewModelV1$genIntelligenceProject$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AiFrameConfig.IntelligenceFrameConfig intelligenceFrameConfig;
        AiFrameConfig.IntelligenceFrameConfig intelligenceFrameConfig2;
        EditVideoInfo editVideoInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        j jVar = this.this$0.f107594p;
        yz0.a aVar = jVar.f107650u;
        aVar.f = "";
        aVar.a = false;
        aVar.c = false;
        aVar.g = null;
        j.g("[智能成片][素材取帧] 开始");
        a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_extract_frame");
        }
        N n7 = jVar.f107639j;
        if (n7 != null && (editVideoInfo = n7.f130974a) != null) {
            Application application = BiliContext.application();
            editVideoInfo.setUploadId(application == null ? C3751q.a(System.currentTimeMillis(), "none_") : ec.a.a(BiliAccounts.get(application).mid(), System.currentTimeMillis(), "_"));
        }
        N n8 = jVar.f107639j;
        if (n8 != null) {
            EditVideoInfo editVideoInfo2 = n8.f130974a;
            String uploadId = editVideoInfo2 != null ? editVideoInfo2.getUploadId() : null;
            if (uploadId != null) {
                jVar.f107641l = uploadId;
            }
        }
        y yVar = jVar.f107634d;
        if (yVar != null) {
            String str = jVar.f107640k;
            n nVar = new n(jVar);
            EditVideoInfo editVideoInfo3 = yVar.f130974a;
            if (editVideoInfo3 == null) {
                yVar.f107875f.set(true);
                nVar.a(3, 0L);
            } else {
                C9270a.b(yVar, str, "extract_frame", null, null, 12);
                List<SelectVideo> selectVideoList = editVideoInfo3.getSelectVideoList();
                if (selectVideoList == null || selectVideoList.isEmpty()) {
                    C9270a.a(yVar, str, "extract_frame", 0L, false, "material is empty", null, null, 224);
                    yVar.f107875f.set(true);
                    nVar.a(3, 0L);
                } else {
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    d.b bVar = new d.b();
                    Lazy lazy = pz0.a.a;
                    PartTimeStrategyConfig partTimeStrategyConfig = new PartTimeStrategyConfig();
                    AiFrameConfig aiFrameConfigA = pz0.a.a();
                    if (aiFrameConfigA != null && (intelligenceFrameConfig2 = aiFrameConfigA.intelligenceConfig) != null) {
                        partTimeStrategyConfig.totalFrameCount = intelligenceFrameConfig2.totalFrameCount;
                        partTimeStrategyConfig.materialMaxFrameCount = intelligenceFrameConfig2.materialFrameCount;
                        partTimeStrategyConfig.minFrameInterval = intelligenceFrameConfig2.minFrameInterval * ((long) 1000);
                    }
                    bVar.f107315b = new pz0.g(partTimeStrategyConfig);
                    bVar.f107314a = new com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.a(str);
                    bVar.f107316c = new com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.a();
                    bVar.f107318e = RunTaskType.NET;
                    bVar.f107319f = FrameSceneType.INTELLIGENCE;
                    com.bilibili.studio.editor.moudle.intelligence.frame.d dVarA = bVar.a();
                    yVar.f107873d = dVarA;
                    dVarA.c(String.valueOf(editVideoInfo3.getDraftId()), "IntelligenceFrameLogicV2-start");
                    Ref.IntRef intRef = new Ref.IntRef();
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    com.bilibili.studio.editor.moudle.intelligence.frame.d dVar = yVar.f107873d;
                    if (dVar != null) {
                        dVar.f107300a = new C6586x(yVar, longRef, str, nVar, arrayList, intRef, editVideoInfo3, intRef2);
                    }
                    List<FileTimePart> listB = Ow0.a.b(10000L, editVideoInfo3.getSelectVideoList());
                    if (((ArrayList) listB).isEmpty()) {
                        C9270a.a(yVar, str, "extract_frame", 0L, false, "material is empty", null, null, 224);
                        nVar.a(3, 0L);
                    } else {
                        com.bilibili.studio.editor.moudle.intelligence.frame.d dVar2 = yVar.f107873d;
                        if (dVar2 != null) {
                            dVar2.d(String.valueOf(editVideoInfo3.getDraftId()), str, listB);
                        }
                        AiFrameConfig aiFrameConfigA2 = pz0.a.a();
                        CountDownTimerC6585w countDownTimerC6585w = new CountDownTimerC6585w((aiFrameConfigA2 == null || (intelligenceFrameConfig = aiFrameConfigA2.intelligenceConfig) == null) ? 3000L : intelligenceFrameConfig.frameWaitTime, yVar);
                        yVar.f107874e = countDownTimerC6585w;
                        countDownTimerC6585w.start();
                    }
                }
            }
        }
        j.g("[智能成片][快速ASR] 开始");
        a.InterfaceC1197a interfaceC1197a2 = jVar.f107602a;
        if (interfaceC1197a2 != null) {
            interfaceC1197a2.b("step_fast_asr");
        }
        IntelligenceAudioConfig intelligenceAudioConfig = new IntelligenceAudioConfig();
        intelligenceAudioConfig.autoASR = false;
        intelligenceAudioConfig.autoBgm = true;
        Xz0.d dVar3 = Xz0.d.f28458a;
        String str2 = jVar.f107640k;
        dVar3.getClass();
        Xz0.d.f(str2, "start", "");
        C6571h c6571h = jVar.f107637g;
        if (c6571h != null) {
            c6571h.h(jVar.f107640k, new o(jVar, intelligenceAudioConfig));
        }
        long j7 = jVar.f107642m;
        if (j7 > 0) {
            j.g("[智能成片][智能模板] ID下载模板开始，id=" + j7);
            a.InterfaceC1197a interfaceC1197a3 = jVar.f107602a;
            if (interfaceC1197a3 != null) {
                interfaceC1197a3.b("step_template_download");
            }
            T t7 = jVar.h;
            if (t7 != null) {
                long j8 = jVar.f107642m;
                boolean z6 = jVar.f107643n;
                boolean z7 = jVar.f107644o;
                m mVar = new m(jVar);
                long jCurrentTimeMillis = System.currentTimeMillis();
                t7.h = z7 ? "server" : z6 ? "config" : "external";
                String str3 = t7.f107773k;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        C9270a.b(t7, str3, "get_template_info", t7.h, null, 8);
                    }
                }
                BiliTemplateEngineManager biliTemplateEngineManager = C6581s.f107856a;
                C6581s.f107858c = System.currentTimeMillis();
                TC0.g gVar = (TC0.g) ServiceGenerator.createService(TC0.g.class);
                com.bilibili.studio.editor.timeline.d.f108285a.getClass();
                String auroraVersion = AuroraVersion.getAuroraVersion();
                if (auroraVersion == null) {
                    auroraVersion = "";
                }
                gVar.getTemplateItemListById(String.valueOf(j8), 0, "mon", auroraVersion, MontageVersion.getVersion()).enqueue(new U(t7, mVar, jCurrentTimeMillis));
            }
        }
        return Unit.INSTANCE;
    }
}
