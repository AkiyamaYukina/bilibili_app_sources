package com.bilibili.ship.theseus.playlist.di.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.videodetail.merchandise.y;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.playlist.InterfaceC6217d;
import com.bilibili.ship.theseus.playlist.PlaylistOrderEnum;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f95739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC6217d f95740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f95741d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<j, Boolean, Continuation<? super Pair<? extends j, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(j jVar, boolean z6, Continuation<? super Pair<? extends j, Boolean>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(jVar, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((j) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<? extends j, Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends j, ? extends Boolean>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = playlistReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<? extends j, Boolean> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    j jVar = (j) pair.component1();
                    boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                    if (jVar != null && !zBooleanValue) {
                        GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) jVar.l().getValue();
                        String str = (String) geminiCommonPlayableParams.getExtraContentForResolve().get("ep_id");
                        String str2 = (String) geminiCommonPlayableParams.getExtraContentForResolve().get("season_id");
                        Integer epStatus = geminiCommonPlayableParams.getEpStatus();
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        mapCreateMapBuilder.put("cid", String.valueOf(geminiCommonPlayableParams.getCid()));
                        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(geminiCommonPlayableParams.getAvid()));
                        if (str != null) {
                            mapCreateMapBuilder.put("ep_id", str);
                        }
                        if (str2 != null) {
                            mapCreateMapBuilder.put("season_id", str2);
                        }
                        if (epStatus != null) {
                            mapCreateMapBuilder.put("ep_status", String.valueOf(epStatus.intValue()));
                        }
                        Map<String, String> mapBuild = MapsKt.build(mapCreateMapBuilder);
                        PageReportService pageReportService = this.this$0.f95739b;
                        this.label = 1;
                        if (pageReportService.e(mapBuild, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportParamsProviderService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(j jVar, boolean z6, Continuation continuation) {
            return new Pair(jVar, Boxing.boxBoolean(z6));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(FlowKt.asStateFlow(this.this$0.f95741d.f91111e), this.this$0.f95740c.a(), AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Map<String, String> $playlistParams;
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistReportParamsProviderService playlistReportParamsProviderService, Map<String, String> map, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportParamsProviderService;
            this.$playlistParams = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$playlistParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportService pageReportService = this.this$0.f95739b;
                Map<String, String> map = this.$playlistParams;
                this.label = 1;
                if (pageReportService.e(map, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Map<String, String> $playlistParams;
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlaylistReportParamsProviderService playlistReportParamsProviderService, Map<String, String> map, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportParamsProviderService;
            this.$playlistParams = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$playlistParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportService pageReportService = this.this$0.f95739b;
                Map<String, String> map = this.$playlistParams;
                this.label = 1;
                if (pageReportService.d(map, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Map<String, String> $playlistParams;
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlaylistReportParamsProviderService playlistReportParamsProviderService, Map<String, String> map, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportParamsProviderService;
            this.$playlistParams = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$playlistParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportService pageReportService = this.this$0.f95739b;
                Map<String, String> map = this.$playlistParams;
                this.label = 1;
                if (pageReportService.c(map, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = (com.bilibili.player.tangram.basic.a) obj;
                return anonymousClass1;
            }

            /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
                    if (aVar != null) {
                        PageReportService pageReportService = this.this$0.f95739b;
                        Map mapA = y.a(aVar.f79320a, "play_qn");
                        this.label = 1;
                        if (pageReportService.d(mapA, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistReportParamsProviderService playlistReportParamsProviderService = this.this$0;
                MutableStateFlow<com.bilibili.player.tangram.basic.a> mutableStateFlow = playlistReportParamsProviderService.f95741d.f91109c.f79295b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistReportParamsProviderService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlaylistRepository $playlistRepo;
        int label;
        final PlaylistReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.playlist.PlaylistReportParamsProviderService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/PlaylistReportParamsProviderService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlaylistOrderEnum, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlaylistOrderEnum playlistOrderEnum, Continuation<? super Unit> continuation) {
                return create(playlistOrderEnum, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlaylistOrderEnum playlistOrderEnum = (PlaylistOrderEnum) this.L$0;
                    PageReportService pageReportService = this.this$0.f95739b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("playlist_sort_type", playlistOrderEnum.reportValue()));
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(PlaylistRepository playlistRepository, PlaylistReportParamsProviderService playlistReportParamsProviderService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$playlistRepo = playlistRepository;
            this.this$0 = playlistReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$playlistRepo, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PlaylistOrderEnum> stateFlow = this.$playlistRepo.f95104l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public PlaylistReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull PageReportService pageReportService, @NotNull InterfaceC6217d interfaceC6217d, @NotNull h hVar) {
        this.f95738a = coroutineScope;
        this.f95739b = pageReportService;
        this.f95740c = interfaceC6217d;
        this.f95741d = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("playlist_id", String.valueOf(playlistRepository.f95085H)), TuplesKt.to("playlist_type", String.valueOf(playlistRepository.f95087J))});
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, mapMapOf, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, mapMapOf, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, mapMapOf, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(playlistRepository, this, null), 3, (Object) null);
    }
}
