package com.bilibili.ship.theseus.keel.player;

import android.util.Log;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.playercore.B;
import com.bilibili.player.tangram.playercore.C;
import com.bilibili.player.tangram.playercore.E;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.PCSFacadeImpl;
import com.bilibili.player.tangram.playercore.v;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5.class */
final class TheseusPlayableKt$TheseusPlayable$5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Deferred<Unit> $allowedIntoCore;
    final Deferred<Unit> $allowedToPullMedia;
    final MutableSharedFlow<PlayViewUniteReply> $beforeApplyingPlayViewReply;
    final a $cachedPlayData;
    final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
    final b $fastPlayData;
    final Ref.ObjectRef<Fragment> $fragment;
    final v $internal;
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
    final e $preload;
    final PlayViewUniteReply $preloadedPlayViewReply;
    final ii1.a $profiler;
    final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
    final f $runWithVideoPiece;
    final g $sharedPlayData;
    final Ref.BooleanRef $usesTrialQuality;
    final E $videoQualityStrategy;
    int I$0;
    int I$1;
    int I$2;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final boolean $isFullScreen;
        final MediaResource $mediaResource;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final g $sharedPlayData;
        final E $videoQualityStrategy;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MediaResource mediaResource, g gVar, IPlayerCoreService iPlayerCoreService, h hVar, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, E e7, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, tv.danmaku.biliplayerv2.service.v vVar, f fVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mediaResource = mediaResource;
            this.$sharedPlayData = gVar;
            this.$playerCoreService = iPlayerCoreService;
            this.$player = hVar;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$videoQualityStrategy = e7;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
            this.$progressManipulationService = vVar;
            this.$runWithVideoPiece = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mediaResource, this.$sharedPlayData, this.$playerCoreService, this.$player, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, this.$runWithVideoPiece, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            B b7 = (B) this.L$0;
            Log.i("TheseusPlayableKt$TheseusPlayable$5$1-invokeSuspend", "[gemini-TheseusPlayableKt$TheseusPlayable$5$1-invokeSuspend] Shared play resolving...");
            PCSFacadeImpl pCSFacadeImplE = p.e(b7, this.$playerCoreService, this.$player, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, p.d(this.$playerCoreService, this.$player, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$mediaResource, this.$sharedPlayData.f91105c, true, null, null, 1536));
            f fVar = this.$runWithVideoPiece;
            g gVar = this.$sharedPlayData;
            return p.b(pCSFacadeImplE, fVar, gVar.f91103a, gVar.f91104b);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
        final b $fastPlayData;
        final Ref.ObjectRef<Fragment> $fragment;
        final boolean $isFullScreen;
        final MediaResource $mediaResource;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final e $preloadData;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final Ref.BooleanRef $usesTrialQuality;
        final E $videoQualityStrategy;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C, Continuation<? super MediaResource>, Object> {
            final B $$this$resolve;
            final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
            final Ref.ObjectRef<Fragment> $fragment;
            final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
            final h $player;
            final ii1.a $profiler;
            final Ref.BooleanRef $usesTrialQuality;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(B b7, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, h hVar, ii1.a aVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Function1<? super PlayViewUniteReply, ExtraInfo> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$resolve = b7;
                this.$playableParamsFlow = mutableStateFlow;
                this.$player = hVar;
                this.$profiler = aVar;
                this.$fragment = objectRef;
                this.$usesTrialQuality = booleanRef;
                this.$extractExtraInfo = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$resolve, this.$playableParamsFlow, this.$player, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C c7, Continuation<? super MediaResource> continuation) {
                return create(c7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C c7 = (C) this.L$0;
                    B b7 = this.$$this$resolve;
                    MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow = this.$playableParamsFlow;
                    h hVar = this.$player;
                    ii1.a aVar = this.$profiler;
                    Ref.ObjectRef<Fragment> objectRef = this.$fragment;
                    Ref.BooleanRef booleanRef = this.$usesTrialQuality;
                    Function1<PlayViewUniteReply, ExtraInfo> function1 = this.$extractExtraInfo;
                    this.label = 1;
                    Object objM = p.m(b7, mutableStateFlow, hVar, aVar, objectRef, booleanRef, function1, c7, this);
                    obj = objM;
                    if (objM == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ii1.a aVar, MediaResource mediaResource, b bVar, e eVar, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, h hVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Function1<? super PlayViewUniteReply, ExtraInfo> function1, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, E e7, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, tv.danmaku.biliplayerv2.service.v vVar, f fVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$profiler = aVar;
            this.$mediaResource = mediaResource;
            this.$fastPlayData = bVar;
            this.$preloadData = eVar;
            this.$playableParamsFlow = mutableStateFlow;
            this.$player = hVar;
            this.$fragment = objectRef;
            this.$usesTrialQuality = booleanRef;
            this.$extractExtraInfo = function1;
            this.$playerCoreService = iPlayerCoreService;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$videoQualityStrategy = e7;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
            this.$progressManipulationService = vVar;
            this.$runWithVideoPiece = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$profiler, this.$mediaResource, this.$fastPlayData, this.$preloadData, this.$playableParamsFlow, this.$player, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, this.$runWithVideoPiece, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            B b7 = (B) this.L$0;
            Log.i("TheseusPlayableKt$TheseusPlayable$5$2-invokeSuspend", "[gemini-TheseusPlayableKt$TheseusPlayable$5$2-invokeSuspend] Fast play resolving...");
            ii1.a aVar = this.$profiler;
            if (aVar != null) {
                aVar.a("start_resolve_play_url", (Map) null);
            }
            try {
                IPlayerCoreService iPlayerCoreService = this.$playerCoreService;
                h hVar = this.$player;
                boolean z6 = this.$isFullScreen;
                PlayerParamsV2 playerParamsV2 = this.$playerParams;
                GeminiCommonPlayableParams geminiCommonPlayableParams = this.$playableParams;
                Function0<Map<String, String>> function0 = this.$obtainIjkSupplementReportParams;
                MediaResource mediaResource = this.$mediaResource;
                sb0.c cVar = this.$fastPlayData.f91084d;
                e eVar = this.$preloadData;
                PCSFacadeImpl pCSFacadeImplE = p.e(b7, this.$playerCoreService, this.$player, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, p.d(iPlayerCoreService, hVar, z6, playerParamsV2, geminiCommonPlayableParams, function0, mediaResource, cVar, false, eVar != null ? eVar.f91099b : null, new AnonymousClass1(b7, this.$playableParamsFlow, hVar, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, null), 256));
                f fVar = this.$runWithVideoPiece;
                b bVar = this.$fastPlayData;
                return p.b(pCSFacadeImplE, fVar, bVar.f91081a, bVar.f91082b);
            } finally {
                ii1.a aVar2 = this.$profiler;
                if (aVar2 != null) {
                    aVar2.a("end_resolve_play_url", (Map) null);
                }
                ii1.a aVar3 = this.$profiler;
                if (aVar3 != null) {
                    aVar3.a("resolve_play_url_fire", (Map) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final a $cachedPlayData;
        final boolean $isFullScreen;
        final MediaResource $mediaResource;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final E $videoQualityStrategy;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ii1.a aVar, MediaResource mediaResource, a aVar2, IPlayerCoreService iPlayerCoreService, h hVar, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, E e7, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, tv.danmaku.biliplayerv2.service.v vVar, f fVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$profiler = aVar;
            this.$mediaResource = mediaResource;
            this.$cachedPlayData = aVar2;
            this.$playerCoreService = iPlayerCoreService;
            this.$player = hVar;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$videoQualityStrategy = e7;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
            this.$progressManipulationService = vVar;
            this.$runWithVideoPiece = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$profiler, this.$mediaResource, this.$cachedPlayData, this.$playerCoreService, this.$player, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, this.$runWithVideoPiece, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            B b7 = (B) this.L$0;
            Log.i("TheseusPlayableKt$TheseusPlayable$5$3-invokeSuspend", "[gemini-TheseusPlayableKt$TheseusPlayable$5$3-invokeSuspend] Offline cache play resolving...");
            ii1.a aVar = this.$profiler;
            if (aVar != null) {
                aVar.a("start_resolve_play_url", (Map) null);
            }
            try {
                PCSFacadeImpl pCSFacadeImplE = p.e(b7, this.$playerCoreService, this.$player, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, p.d(this.$playerCoreService, this.$player, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$mediaResource, this.$cachedPlayData.f91080c, false, null, null, 1792));
                f fVar = this.$runWithVideoPiece;
                a aVar2 = this.$cachedPlayData;
                return p.b(pCSFacadeImplE, fVar, aVar2.f91078a, aVar2.f91079b);
            } finally {
                ii1.a aVar3 = this.$profiler;
                if (aVar3 != null) {
                    aVar3.a("end_resolve_play_url", (Map) null);
                }
                ii1.a aVar4 = this.$profiler;
                if (aVar4 != null) {
                    aVar4.a("resolve_play_url_fire", (Map) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
        final Ref.ObjectRef<Fragment> $fragment;
        final boolean $isFullScreen;
        final MediaResource $mediaResource;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final e $preload;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final Ref.BooleanRef $usesTrialQuality;
        final E $videoQualityStrategy;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C, Continuation<? super MediaResource>, Object> {
            final B $$this$resolve;
            final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
            final Ref.ObjectRef<Fragment> $fragment;
            final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
            final h $player;
            final ii1.a $profiler;
            final Ref.BooleanRef $usesTrialQuality;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(B b7, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, h hVar, ii1.a aVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Function1<? super PlayViewUniteReply, ExtraInfo> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$resolve = b7;
                this.$playableParamsFlow = mutableStateFlow;
                this.$player = hVar;
                this.$profiler = aVar;
                this.$fragment = objectRef;
                this.$usesTrialQuality = booleanRef;
                this.$extractExtraInfo = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$resolve, this.$playableParamsFlow, this.$player, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C c7, Continuation<? super MediaResource> continuation) {
                return create(c7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C c7 = (C) this.L$0;
                    B b7 = this.$$this$resolve;
                    MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow = this.$playableParamsFlow;
                    h hVar = this.$player;
                    ii1.a aVar = this.$profiler;
                    Ref.ObjectRef<Fragment> objectRef = this.$fragment;
                    Ref.BooleanRef booleanRef = this.$usesTrialQuality;
                    Function1<PlayViewUniteReply, ExtraInfo> function1 = this.$extractExtraInfo;
                    this.label = 1;
                    Object objM = p.m(b7, mutableStateFlow, hVar, aVar, objectRef, booleanRef, function1, c7, this);
                    obj = objM;
                    if (objM == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(ii1.a aVar, MediaResource mediaResource, e eVar, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, h hVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Function1<? super PlayViewUniteReply, ExtraInfo> function1, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, E e7, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, tv.danmaku.biliplayerv2.service.v vVar, f fVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$profiler = aVar;
            this.$mediaResource = mediaResource;
            this.$preload = eVar;
            this.$playableParamsFlow = mutableStateFlow;
            this.$player = hVar;
            this.$fragment = objectRef;
            this.$usesTrialQuality = booleanRef;
            this.$extractExtraInfo = function1;
            this.$playerCoreService = iPlayerCoreService;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$videoQualityStrategy = e7;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
            this.$progressManipulationService = vVar;
            this.$runWithVideoPiece = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$profiler, this.$mediaResource, this.$preload, this.$playableParamsFlow, this.$player, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$videoQualityStrategy, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, this.$runWithVideoPiece, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:7:0x0030, B:9:0x0063, B:17:0x007f, B:16:0x0078), top: B:36:0x0030 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final MutableSharedFlow<PlayViewUniteReply> $beforeApplyingPlayViewReply;
        final a $cachedPlayData;
        final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
        final Ref.ObjectRef<Fragment> $fragment;
        final v $internal;
        final boolean $isFullScreen;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final PlayViewUniteReply $preloadedPlayViewReply;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final g $sharedPlayData;
        final Ref.BooleanRef $usesTrialQuality;
        final E $videoQualityStrategy;
        private Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(PlayViewUniteReply playViewUniteReply, v vVar, Ref.ObjectRef<Fragment> objectRef, MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow, E e7, Function1<? super PlayViewUniteReply, ExtraInfo> function1, tv.danmaku.biliplayerv2.service.v vVar2, ii1.a aVar, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, a aVar2, g gVar, h hVar, Ref.BooleanRef booleanRef, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, f fVar, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$preloadedPlayViewReply = playViewUniteReply;
            this.$internal = vVar;
            this.$fragment = objectRef;
            this.$beforeApplyingPlayViewReply = mutableSharedFlow;
            this.$videoQualityStrategy = e7;
            this.$extractExtraInfo = function1;
            this.$progressManipulationService = vVar2;
            this.$profiler = aVar;
            this.$playableParamsFlow = mutableStateFlow;
            this.$cachedPlayData = aVar2;
            this.$sharedPlayData = gVar;
            this.$player = hVar;
            this.$usesTrialQuality = booleanRef;
            this.$playerCoreService = iPlayerCoreService;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$runWithVideoPiece = fVar;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$preloadedPlayViewReply, this.$internal, this.$fragment, this.$beforeApplyingPlayViewReply, this.$videoQualityStrategy, this.$extractExtraInfo, this.$progressManipulationService, this.$profiler, this.$playableParamsFlow, this.$cachedPlayData, this.$sharedPlayData, this.$player, this.$usesTrialQuality, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$runWithVideoPiece, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x024d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 599
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final MutableSharedFlow<PlayViewUniteReply> $beforeApplyingPlayViewReply;
        final a $cachedPlayData;
        final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
        final Ref.ObjectRef<Fragment> $fragment;
        final boolean $isFullScreen;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final PlayViewUniteReply $preloadedPlayViewReply;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final g $sharedPlayData;
        final Ref.BooleanRef $usesTrialQuality;
        final E $videoQualityStrategy;
        private Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(PlayViewUniteReply playViewUniteReply, Ref.ObjectRef<Fragment> objectRef, MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow, E e7, Function1<? super PlayViewUniteReply, ExtraInfo> function1, tv.danmaku.biliplayerv2.service.v vVar, ii1.a aVar, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, a aVar2, g gVar, h hVar, Ref.BooleanRef booleanRef, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, f fVar, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$preloadedPlayViewReply = playViewUniteReply;
            this.$fragment = objectRef;
            this.$beforeApplyingPlayViewReply = mutableSharedFlow;
            this.$videoQualityStrategy = e7;
            this.$extractExtraInfo = function1;
            this.$progressManipulationService = vVar;
            this.$profiler = aVar;
            this.$playableParamsFlow = mutableStateFlow;
            this.$cachedPlayData = aVar2;
            this.$sharedPlayData = gVar;
            this.$player = hVar;
            this.$usesTrialQuality = booleanRef;
            this.$playerCoreService = iPlayerCoreService;
            this.$isFullScreen = z6;
            this.$playerParams = playerParamsV2;
            this.$playableParams = geminiCommonPlayableParams;
            this.$obtainIjkSupplementReportParams = function0;
            this.$runWithVideoPiece = fVar;
            this.$playStateProvider = dVar;
            this.$allowedToPullMedia = deferred;
            this.$allowedIntoCore = deferred2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$preloadedPlayViewReply, this.$fragment, this.$beforeApplyingPlayViewReply, this.$videoQualityStrategy, this.$extractExtraInfo, this.$progressManipulationService, this.$profiler, this.$playableParamsFlow, this.$cachedPlayData, this.$sharedPlayData, this.$player, this.$usesTrialQuality, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$runWithVideoPiece, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Function1<PlayViewUniteReply, ExtraInfo> function1;
            g gVar;
            h hVar;
            Ref.ObjectRef<Fragment> objectRef;
            IPlayerCoreService iPlayerCoreService;
            boolean z6;
            PlayerParamsV2 playerParamsV2;
            GeminiCommonPlayableParams geminiCommonPlayableParams;
            f fVar;
            com.bilibili.player.tangram.basic.d dVar;
            Deferred<Unit> deferred;
            Deferred<Unit> deferred2;
            Object objH;
            E e7;
            Function0<Map<String, String>> function0;
            Ref.BooleanRef booleanRef;
            a aVar;
            MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow;
            ii1.a aVar2;
            tv.danmaku.biliplayerv2.service.v vVar;
            B b7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                B b8 = (B) this.L$0;
                function1 = this.$extractExtraInfo;
                tv.danmaku.biliplayerv2.service.v vVar2 = this.$progressManipulationService;
                ii1.a aVar3 = this.$profiler;
                MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow2 = this.$playableParamsFlow;
                a aVar4 = this.$cachedPlayData;
                gVar = this.$sharedPlayData;
                hVar = this.$player;
                objectRef = this.$fragment;
                Ref.BooleanRef booleanRef2 = this.$usesTrialQuality;
                iPlayerCoreService = this.$playerCoreService;
                z6 = this.$isFullScreen;
                playerParamsV2 = this.$playerParams;
                geminiCommonPlayableParams = this.$playableParams;
                Function0<Map<String, String>> function02 = this.$obtainIjkSupplementReportParams;
                fVar = this.$runWithVideoPiece;
                E e8 = this.$videoQualityStrategy;
                dVar = this.$playStateProvider;
                deferred = this.$allowedToPullMedia;
                deferred2 = this.$allowedIntoCore;
                MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow = this.$beforeApplyingPlayViewReply;
                PlayViewUniteReply playViewUniteReply = this.$preloadedPlayViewReply;
                this.L$0 = b8;
                this.L$1 = function1;
                this.L$2 = vVar2;
                this.L$3 = aVar3;
                this.L$4 = mutableStateFlow2;
                this.L$5 = aVar4;
                this.L$6 = gVar;
                this.L$7 = hVar;
                this.L$8 = objectRef;
                this.L$9 = booleanRef2;
                this.L$10 = iPlayerCoreService;
                this.L$11 = playerParamsV2;
                this.L$12 = geminiCommonPlayableParams;
                this.L$13 = function02;
                this.L$14 = fVar;
                this.L$15 = e8;
                this.L$16 = dVar;
                this.L$17 = deferred;
                this.L$18 = deferred2;
                this.Z$0 = z6;
                this.label = 1;
                objH = p.h(objectRef, mutableSharedFlow, e8, playViewUniteReply, this);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                e7 = e8;
                function0 = function02;
                booleanRef = booleanRef2;
                aVar = aVar4;
                mutableStateFlow = mutableStateFlow2;
                aVar2 = aVar3;
                vVar = vVar2;
                b7 = b8;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                z6 = this.Z$0;
                Deferred<Unit> deferred3 = (Deferred) this.L$18;
                Deferred<Unit> deferred4 = (Deferred) this.L$17;
                com.bilibili.player.tangram.basic.d dVar2 = (com.bilibili.player.tangram.basic.d) this.L$16;
                E e9 = (E) this.L$15;
                f fVar2 = (f) this.L$14;
                function0 = (Function0) this.L$13;
                geminiCommonPlayableParams = (GeminiCommonPlayableParams) this.L$12;
                playerParamsV2 = (PlayerParamsV2) this.L$11;
                iPlayerCoreService = (IPlayerCoreService) this.L$10;
                booleanRef = (Ref.BooleanRef) this.L$9;
                objectRef = (Ref.ObjectRef) this.L$8;
                hVar = (h) this.L$7;
                gVar = (g) this.L$6;
                aVar = (a) this.L$5;
                mutableStateFlow = (MutableStateFlow) this.L$4;
                aVar2 = (ii1.a) this.L$3;
                vVar = (tv.danmaku.biliplayerv2.service.v) this.L$2;
                function1 = (Function1) this.L$1;
                b7 = (B) this.L$0;
                ResultKt.throwOnFailure(obj);
                objH = obj;
                e7 = e9;
                dVar = dVar2;
                fVar = fVar2;
                deferred = deferred4;
                deferred2 = deferred3;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.L$14 = null;
            this.L$15 = null;
            this.L$16 = null;
            this.L$17 = null;
            this.L$18 = null;
            this.label = 2;
            Object objJ = p.j(b7, function1, vVar, aVar2, mutableStateFlow, aVar, gVar, hVar, objectRef, booleanRef, iPlayerCoreService, z6, playerParamsV2, geminiCommonPlayableParams, function0, fVar, e7, dVar, deferred, deferred2, (PlayViewUniteReply) objH, null, this);
            obj = objJ;
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<GeminiCommonPlayableParams, Continuation<? super Boolean>, Object> {
        final GeminiCommonPlayableParams $playableParams;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(GeminiCommonPlayableParams geminiCommonPlayableParams, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$playableParams = geminiCommonPlayableParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$playableParams, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        public final Object invoke(GeminiCommonPlayableParams geminiCommonPlayableParams, Continuation<? super Boolean> continuation) {
            return create(geminiCommonPlayableParams, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!Intrinsics.areEqual((GeminiCommonPlayableParams) this.L$0, this.$playableParams));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$5$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<B, Continuation<? super InterfaceC5778f>, Object> {
        final Deferred<Unit> $allowedIntoCore;
        final Deferred<Unit> $allowedToPullMedia;
        final MutableSharedFlow<PlayViewUniteReply> $beforeApplyingPlayViewReply;
        final a $cachedPlayData;
        final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
        final Ref.ObjectRef<Fragment> $fragment;
        final v $internal;
        final Function0<Boolean> $isDolbyHdrMemoryActive;
        final boolean $isFullScreen;
        final Function0<Map<String, String>> $obtainIjkSupplementReportParams;
        final com.bilibili.player.tangram.basic.d $playStateProvider;
        final GeminiCommonPlayableParams $playableParams;
        final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        final h $player;
        final IPlayerCoreService $playerCoreService;
        final PlayerParamsV2 $playerParams;
        final ii1.a $profiler;
        final tv.danmaku.biliplayerv2.service.v $progressManipulationService;
        final f $runWithVideoPiece;
        final g $sharedPlayData;
        final Ref.BooleanRef $usesTrialQuality;
        final E $videoQualityStrategy;
        private Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, Function0<Boolean> function0, v vVar, ii1.a aVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow, E e7, Function1<? super PlayViewUniteReply, ExtraInfo> function1, tv.danmaku.biliplayerv2.service.v vVar2, a aVar2, g gVar, h hVar, IPlayerCoreService iPlayerCoreService, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function02, f fVar, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.$playableParamsFlow = mutableStateFlow;
            this.$isDolbyHdrMemoryActive = function0;
            this.$internal = vVar;
            this.$profiler = aVar;
            this.$fragment = objectRef;
            this.$usesTrialQuality = booleanRef;
            this.$beforeApplyingPlayViewReply = mutableSharedFlow;
            this.$videoQualityStrategy = e7;
            this.$extractExtraInfo = function1;
            this.$progressManipulationService = vVar2;
            this.$cachedPlayData = aVar2;
            this.$sharedPlayData = gVar;
            this.$player = hVar;
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
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.$playableParamsFlow, this.$isDolbyHdrMemoryActive, this.$internal, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$beforeApplyingPlayViewReply, this.$videoQualityStrategy, this.$extractExtraInfo, this.$progressManipulationService, this.$cachedPlayData, this.$sharedPlayData, this.$player, this.$playerCoreService, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$runWithVideoPiece, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, continuation);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        public final Object invoke(B b7, Continuation<? super InterfaceC5778f> continuation) {
            return create(b7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x02ef  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 761
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5.AnonymousClass8.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusPlayableKt$TheseusPlayable$5(g gVar, e eVar, IPlayerCoreService iPlayerCoreService, v vVar, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, b bVar, E e7, a aVar, PlayViewUniteReply playViewUniteReply, Ref.BooleanRef booleanRef, h hVar, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, com.bilibili.player.tangram.basic.d dVar, Deferred<Unit> deferred, Deferred<Unit> deferred2, tv.danmaku.biliplayerv2.service.v vVar2, f fVar, ii1.a aVar2, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef2, Function1<? super PlayViewUniteReply, ExtraInfo> function1, MutableSharedFlow<PlayViewUniteReply> mutableSharedFlow, Function0<Boolean> function02, Continuation<? super TheseusPlayableKt$TheseusPlayable$5> continuation) {
        super(1, continuation);
        this.$sharedPlayData = gVar;
        this.$preload = eVar;
        this.$playerCoreService = iPlayerCoreService;
        this.$internal = vVar;
        this.$playableParamsFlow = mutableStateFlow;
        this.$fastPlayData = bVar;
        this.$videoQualityStrategy = e7;
        this.$cachedPlayData = aVar;
        this.$preloadedPlayViewReply = playViewUniteReply;
        this.$needClientAttrResolving = booleanRef;
        this.$player = hVar;
        this.$isFullScreen = z6;
        this.$playerParams = playerParamsV2;
        this.$playableParams = geminiCommonPlayableParams;
        this.$obtainIjkSupplementReportParams = function0;
        this.$playStateProvider = dVar;
        this.$allowedToPullMedia = deferred;
        this.$allowedIntoCore = deferred2;
        this.$progressManipulationService = vVar2;
        this.$runWithVideoPiece = fVar;
        this.$profiler = aVar2;
        this.$fragment = objectRef;
        this.$usesTrialQuality = booleanRef2;
        this.$extractExtraInfo = function1;
        this.$beforeApplyingPlayViewReply = mutableSharedFlow;
        this.$isDolbyHdrMemoryActive = function02;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayableKt$TheseusPlayable$5(this.$sharedPlayData, this.$preload, this.$playerCoreService, this.$internal, this.$playableParamsFlow, this.$fastPlayData, this.$videoQualityStrategy, this.$cachedPlayData, this.$preloadedPlayViewReply, this.$needClientAttrResolving, this.$player, this.$isFullScreen, this.$playerParams, this.$playableParams, this.$obtainIjkSupplementReportParams, this.$playStateProvider, this.$allowedToPullMedia, this.$allowedIntoCore, this.$progressManipulationService, this.$runWithVideoPiece, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, this.$beforeApplyingPlayViewReply, this.$isDolbyHdrMemoryActive, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
