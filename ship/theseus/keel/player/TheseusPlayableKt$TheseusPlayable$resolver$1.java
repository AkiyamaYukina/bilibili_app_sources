package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.player.tangram.playercore.B;
import com.bilibili.player.tangram.playercore.E;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.u;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.v;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolver$1.class */
final class TheseusPlayableKt$TheseusPlayable$resolver$1 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
    final Deferred<Unit> $allowedIntoCore;
    final Deferred<Unit> $allowedToPullMedia;
    final MutableSharedFlow<PlayViewUniteReply> $beforeApplyingPlayViewReply;
    final a $cachedPlayData;
    final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
    final Ref.ObjectRef<Fragment> $fragment;
    final Function0<Boolean> $isDolbyHdrMemoryActive;
    final boolean $isFullScreen;
    final Ref.BooleanRef $needClientAttrResolving;
    final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
    final com.bilibili.player.tangram.basic.d $playStateProvider;
    final GeminiCommonPlayableParams $playableParams;
    final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
    final h $player;
    final IPlayerCoreService $playerCoreService;
    final PlayerParamsV2 $playerParams;
    final ii1.a $profiler;
    final v $progressManipulationService;
    final f $runWithVideoPiece;
    final g $sharedPlayData;
    final Ref.BooleanRef $usesTrialQuality;
    final E $videoQualityStrategy;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusPlayableKt$TheseusPlayable$resolver$1(MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, Ref.BooleanRef booleanRef, Function0<Boolean> function0, h hVar, ii1.a aVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef2, MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow, E e7, Function1<? super PlayViewUniteReply, ExtraInfo> function1, v vVar, a aVar2, g gVar, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function02, f fVar, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, Continuation<? super TheseusPlayableKt$TheseusPlayable$resolver$1> continuation) {
        super(2, continuation);
        this.$playableParamsFlow = mutableStateFlow;
        this.$needClientAttrResolving = booleanRef;
        this.$isDolbyHdrMemoryActive = function0;
        this.$player = hVar;
        this.$profiler = aVar;
        this.$fragment = objectRef;
        this.$usesTrialQuality = booleanRef2;
        this.$beforeApplyingPlayViewReply = mutableSharedFlow;
        this.$videoQualityStrategy = e7;
        this.$extractExtraInfo = function1;
        this.$progressManipulationService = vVar;
        this.$cachedPlayData = aVar2;
        this.$sharedPlayData = gVar;
        this.$playerCoreService = iPlayerCoreService;
        this.$isFullScreen = z6;
        this.$playerParams = playerParamsV2;
        this.$playableParams = geminiCommonPlayableParams;
        this.$obtainIjkSupplementReportParams = function02;
        this.$runWithVideoPiece = fVar;
        this.$playStateProvider = dVar;
        this.$allowedToPullMedia = deferred;
        this.$allowedIntoCore = deferred2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayableKt$TheseusPlayable$resolver$1 theseusPlayableKt$TheseusPlayable$resolver$1 = new TheseusPlayableKt$TheseusPlayable$resolver$1(this.$playableParamsFlow, this.$needClientAttrResolving, this.$isDolbyHdrMemoryActive, this.$player, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$beforeApplyingPlayViewReply, this.$videoQualityStrategy, this.$extractExtraInfo, this.$progressManipulationService, this.$cachedPlayData, this.$sharedPlayData, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$runWithVideoPiece, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, continuation);
        theseusPlayableKt$TheseusPlayable$resolver$1.L$0 = obj;
        return theseusPlayableKt$TheseusPlayable$resolver$1;
    }

    public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
        return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            B b7 = (B) this.L$0;
            GeminiCommonResolverParams resolveParams = ((GeminiCommonPlayableParams) this.$playableParamsFlow.getValue()).getResolveParams();
            if (this.$needClientAttrResolving.element) {
                resolveParams.setClientAttr(resolveParams.getClientAttr() | com.bilibili.playerbizcommon.utils.e.f80284a.a());
                if (p.o() && ((Boolean) this.$isDolbyHdrMemoryActive.invoke()).booleanValue()) {
                    resolveParams.setClientAttr(resolveParams.getClientAttr() | 1);
                }
                this.$needClientAttrResolving.element = false;
            }
            ii1.a aVar = this.$profiler;
            Ref.ObjectRef<Fragment> objectRef = this.$fragment;
            Ref.BooleanRef booleanRef = this.$usesTrialQuality;
            MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow = this.$beforeApplyingPlayViewReply;
            E e7 = this.$videoQualityStrategy;
            Function1<PlayViewUniteReply, ExtraInfo> function1 = this.$extractExtraInfo;
            v vVar = this.$progressManipulationService;
            MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow = this.$playableParamsFlow;
            a aVar2 = this.$cachedPlayData;
            g gVar = this.$sharedPlayData;
            h hVar = this.$player;
            IPlayerCoreService iPlayerCoreService = this.$playerCoreService;
            boolean z6 = this.$isFullScreen;
            PlayerParamsV2 playerParamsV2 = this.$playerParams;
            GeminiCommonPlayableParams geminiCommonPlayableParams = this.$playableParams;
            Function0<Map<String, String>> function0 = this.$obtainIjkSupplementReportParams;
            f fVar = this.$runWithVideoPiece;
            com.bilibili.player.tangram.basic.d dVar = this.$playStateProvider;
            Deferred<Unit> deferred = this.$allowedToPullMedia;
            Deferred<Unit> deferred2 = this.$allowedIntoCore;
            j jVarJ = hVar.j();
            u uVarO = jVarJ != null ? jVarJ.o() : null;
            this.label = 1;
            Object objL = p.l(b7, aVar, objectRef, booleanRef, mutableSharedFlow, e7, function1, vVar, mutableStateFlow, aVar2, gVar, hVar, iPlayerCoreService, z6, playerParamsV2, geminiCommonPlayableParams, function0, fVar, dVar, deferred, deferred2, resolveParams, uVarO, this);
            obj = objL;
            if (objL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
