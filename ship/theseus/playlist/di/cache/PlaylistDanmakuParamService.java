package com.bilibili.ship.theseus.playlist.di.cache;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.ship.theseus.playlist.D;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.united.di.BusinessType;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/PlaylistDanmakuParamService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDanmakuParamService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95398a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.PlaylistDanmakuParamService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/PlaylistDanmakuParamService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IInteractLayerService $interactLayerService;
        final PlaylistRepository $playlistRepository;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.PlaylistDanmakuParamService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/PlaylistDanmakuParamService$1$1.class */
        public static final class C07741 extends SuspendLambda implements Function2<PlaylistRepository.e, Continuation<? super Unit>, Object> {
            final IInteractLayerService $interactLayerService;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.PlaylistDanmakuParamService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/PlaylistDanmakuParamService$1$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f95399a;

                static {
                    int[] iArr = new int[BusinessType.values().length];
                    try {
                        iArr[BusinessType.OGV.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[BusinessType.CHEESE.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    f95399a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07741(IInteractLayerService iInteractLayerService, Continuation<? super C07741> continuation) {
                super(2, continuation);
                this.$interactLayerService = iInteractLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07741 c07741 = new C07741(this.$interactLayerService, continuation);
                c07741.L$0 = obj;
                return c07741;
            }

            public final Object invoke(PlaylistRepository.e eVar, Continuation<? super Unit> continuation) {
                return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaylistRepository.e eVar = (PlaylistRepository.e) this.L$0;
                PlaylistRepository.e eVar2 = PlaylistRepository.f95077Q;
                if (Intrinsics.areEqual(PlaylistRepository.f95077Q, eVar)) {
                    return Unit.INSTANCE;
                }
                int i7 = a.f95399a[D.a(eVar.f95137a).ordinal()];
                ChronosBiz chronosBiz = i7 != 1 ? i7 != 2 ? ChronosBiz.BIZ_UGC : ChronosBiz.BIZ_PUGV : ChronosBiz.BIZ_OGV;
                ChronosScene chronosScene = ConnectivityMonitor.getInstance().isNetworkActive() ? ChronosScene.SCENE_DETAIL : ChronosScene.SCENE_OFFLINE;
                defpackage.a.b("[theseus-playlist-PlaylistDanmakuParamService$1$1-invokeSuspend] ", "setSceneAndBizParams: " + chronosScene + ", " + chronosBiz, "PlaylistDanmakuParamService$1$1-invokeSuspend");
                this.$interactLayerService.setSceneAndBizParams(chronosScene, chronosBiz);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistRepository playlistRepository, IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playlistRepository = playlistRepository;
            this.$interactLayerService = iInteractLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playlistRepository, this.$interactLayerService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PlaylistRepository.e> stateFlow = this.$playlistRepository.f95111s;
                C07741 c07741 = new C07741(this.$interactLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c07741, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PlaylistDanmakuParamService(@NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull PlaylistRepository playlistRepository) {
        this.f95398a = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(playlistRepository, iInteractLayerService, null), 3, (Object) null);
    }
}
