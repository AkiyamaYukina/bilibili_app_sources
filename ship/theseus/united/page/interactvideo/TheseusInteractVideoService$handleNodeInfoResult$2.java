package com.bilibili.ship.theseus.united.page.interactvideo;

import androidx.compose.foundation.lazy.D;
import androidx.fragment.app.z;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1;
import com.bilibili.playerbizcommon.features.interactvideo.model.HiddenVar;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.playerbizcommon.features.interactvideo.model.PreloadInfo;
import com.bilibili.playerbizcommon.features.interactvideo.model.Video;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.interactvideo.c;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoUpdateSceneInfo$Request;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$handleNodeInfoResult$2.class */
final class TheseusInteractVideoService$handleNodeInfoResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GeminiCommonPlayableParams $playableParams;
    final TheseusInteractVideoService.b $result;
    private Object L$0;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$handleNodeInfoResult$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$handleNodeInfoResult$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GeminiCommonPlayableParams $playableParams;
        final TheseusInteractVideoService.b $result;
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$handleNodeInfoResult$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$handleNodeInfoResult$2$1$1.class */
        public static final class C09961 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C09961(Continuation<? super C09961> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09961 c09961 = new C09961(continuation);
                c09961.L$0 = obj;
                return c09961;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusInteractVideoService theseusInteractVideoService, TheseusInteractVideoService.b bVar, GeminiCommonPlayableParams geminiCommonPlayableParams, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
            this.$result = bVar;
            this.$playableParams = geminiCommonPlayableParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$result, this.$playableParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<PlayerAvailability> mutableStateFlow = this.this$0.f99894k.f91107a.f79286c;
                C09961 c09961 = new C09961(null);
                this.label = 1;
                if (FlowKt.first(mutableStateFlow, c09961, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.l(((TheseusInteractVideoService.b.C0995b) this.$result).f99921a);
            com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f99894k.j();
            if (jVarJ != null) {
                jVarJ.j(this.$playableParams);
            }
            TheseusInteractVideoService theseusInteractVideoService = this.this$0;
            InteractNode interactNode = ((TheseusInteractVideoService.b.C0995b) this.$result).f99921a;
            theseusInteractVideoService.getClass();
            List<HiddenVar> hiddenvars = interactNode.getHiddenvars();
            List<HiddenVar> list = hiddenvars;
            if (list != null && !list.isEmpty()) {
                for (HiddenVar hiddenVar : hiddenvars) {
                    theseusInteractVideoService.f99880Q.put(hiddenVar.getId(), Float.valueOf(hiddenVar.getValue()));
                }
            }
            TheseusInteractVideoService theseusInteractVideoService2 = this.this$0;
            InteractNode interactNode2 = ((TheseusInteractVideoService.b.C0995b) this.$result).f99921a;
            theseusInteractVideoService2.getClass();
            InteractiveVideoUpdateSceneInfo$Request interactiveVideoUpdateSceneInfo$Request = new InteractiveVideoUpdateSceneInfo$Request();
            interactiveVideoUpdateSceneInfo$Request.setScene(theseusInteractVideoService2.i(interactNode2));
            interactiveVideoUpdateSceneInfo$Request.setEvalHiddenVarAction(CollectionsKt.p(theseusInteractVideoService2.f99880Q.entrySet(), ReporterMap.SEMICOLON, (CharSequence) null, (CharSequence) null, new D(1), 30));
            ti1.a chronosMessageSender = theseusInteractVideoService2.f99889e.getChronosMessageSender();
            if (chronosMessageSender != null) {
            }
            defpackage.a.b("[theseus-united-TheseusInteractVideoService-syncSceneInfo] ", z.a("syncSceneInfo:", interactiveVideoUpdateSceneInfo$Request.getScene(), " :", interactiveVideoUpdateSceneInfo$Request.getEvalHiddenVarAction()), "TheseusInteractVideoService-syncSceneInfo");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$handleNodeInfoResult$2(GeminiCommonPlayableParams geminiCommonPlayableParams, TheseusInteractVideoService.b bVar, TheseusInteractVideoService theseusInteractVideoService, Continuation<? super TheseusInteractVideoService$handleNodeInfoResult$2> continuation) {
        super(2, continuation);
        this.$playableParams = geminiCommonPlayableParams;
        this.$result = bVar;
        this.this$0 = theseusInteractVideoService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusInteractVideoService$handleNodeInfoResult$2 theseusInteractVideoService$handleNodeInfoResult$2 = new TheseusInteractVideoService$handleNodeInfoResult$2(this.$playableParams, this.$result, this.this$0, continuation);
        theseusInteractVideoService$handleNodeInfoResult$2.L$0 = obj;
        return theseusInteractVideoService$handleNodeInfoResult$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List<Video> videos;
        GeminiCommonPlayableParams geminiCommonPlayableParams;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        this.$playableParams.setTitle(((TheseusInteractVideoService.b.C0995b) this.$result).f99921a.getTitle());
        d dVar = this.this$0.f99865B;
        if (dVar != null && dVar.a()) {
            dVar.f99962c.updateFunctionWidgetConfiguration(dVar.f99963d, new c.a(1));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$result, this.$playableParams, null), 3, (Object) null);
        this.this$0.f99873J.N();
        BLog.i("TheseusInteractVideoService$handleNodeInfoResult$2-invokeSuspend", "[theseus-united-TheseusInteractVideoService$handleNodeInfoResult$2-invokeSuspend] Handling node info success");
        HashMap map = new HashMap();
        PreloadInfo preloadInfo = ((TheseusInteractVideoService.b.C0995b) this.$result).f99921a.getPreloadInfo();
        if (preloadInfo != null && (videos = preloadInfo.getVideos()) != null) {
            List<Video> list = videos;
            GeminiCommonPlayableParams geminiCommonPlayableParams2 = this.$playableParams;
            TheseusInteractVideoService theseusInteractVideoService = this.this$0;
            for (Video video : list) {
                if (geminiCommonPlayableParams2.getCid() != video.getCid()) {
                    theseusInteractVideoService.getClass();
                    geminiCommonPlayableParams = (GeminiCommonPlayableParams) new Gson().fromJson(new Gson().toJson(geminiCommonPlayableParams2, GeminiCommonPlayableParams.class), GeminiCommonPlayableParams.class);
                    geminiCommonPlayableParams.setCid(video.getCid());
                } else {
                    geminiCommonPlayableParams = geminiCommonPlayableParams2;
                }
                theseusInteractVideoService.getClass();
                map.put(Boxing.boxLong(video.getCid()), com.bilibili.ship.theseus.united.player.mediaplay.q.a(theseusInteractVideoService.f99887c, geminiCommonPlayableParams, new SequentialPCSPlayableKt$withPreloadingStage$1(theseusInteractVideoService.f99894k, StateFlowKt.MutableStateFlow(Boolean.FALSE), theseusInteractVideoService.f99872I), null, null, null, null, null, 120));
            }
        }
        TheseusInteractVideoService theseusInteractVideoService2 = this.this$0;
        theseusInteractVideoService2.f99881R = map;
        theseusInteractVideoService2.f99869F = 0;
        return Unit.INSTANCE;
    }
}
