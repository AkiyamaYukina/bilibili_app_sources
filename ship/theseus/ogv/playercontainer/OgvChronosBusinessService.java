package com.bilibili.ship.theseus.ogv.playercontainer;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.community.Community;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.follow.FollowSeasonResult;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.FetchBusinessData;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.InvokeCommandDetailPanel;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OpenUrlScheme;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.ReportSubtitle;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateFullscreenState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdatePreference;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateShipChain;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService.class */
@StabilityInferred(parameters = 0)
public final class OgvChronosBusinessService implements RpcInvokeObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChronosBusinessService f94275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f94277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f94278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f94280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f94281g;

    @NotNull
    public final EpisodeExtraInfoRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7893a f94283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final RelationRepository f94284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f94285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IToastService f94286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Context f94287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f94288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f94289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C8043a f94290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final UpdateCurrentWork.Response f94291r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvChronosBusinessService;
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
                OgvChronosBusinessService ogvChronosBusinessService = this.this$0;
                this.label = 1;
                long j7 = ogvChronosBusinessService.f94279e.f94449a;
                com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                Object objCollectLatest = FlowKt.collectLatest(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new OgvChronosBusinessService$notifyChronosFollowSeasonChange$2(ogvChronosBusinessService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvChronosBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Long> $currentEpisodeCid;
            Object L$0;
            int label;
            final OgvChronosBusinessService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<Long> objectRef, OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentEpisodeCid = objectRef;
                this.this$0 = ogvChronosBusinessService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentEpisodeCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                    Ref.ObjectRef<Long> objectRef = this.$currentEpisodeCid;
                    if (objectRef.element == null && extraInfo != null) {
                        C7893a.C1318a c1318aC = this.this$0.f94283j.c();
                        objectRef.element = c1318aC != null ? Boxing.boxLong(c1318aC.f123395a.f123398b) : null;
                        com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.f94288o;
                        this.label = 1;
                        if (jVar.u(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IRemoteHandler remoteHandler = this.this$0.f94285l.getRemoteHandler();
                if (remoteHandler != null) {
                    remoteHandler.updateCurrentWorkInfo(this.this$0.b());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvChronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.ObjectRef objectRefB = G0.g.b(obj);
                OgvChronosBusinessService ogvChronosBusinessService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = ogvChronosBusinessService.h.f99566b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRefB, ogvChronosBusinessService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$onTriggerTripleLike$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$onTriggerTripleLike$1.class */
    public static final class C62111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62111(OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super C62111> continuation) {
            super(2, continuation);
            this.this$0 = ogvChronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62111(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.this$0.f94279e.f94449a;
                com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                com.bilibili.community.follow.b bVar2 = bVar;
                if (bVar == null) {
                    bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                }
                if (!bVar2.a) {
                    com.bilibili.ship.theseus.ogv.intro.community.a aVar = this.this$0.f94289p;
                    this.label = 1;
                    if (aVar.a(false, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$onUpdateFavoState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$onUpdateFavoState$1.class */
    public static final class C62121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $favo;
        final String $ids;
        final List<com.bilibili.community.favorite.f> $resources;
        int label;
        final OgvChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62121(OgvChronosBusinessService ogvChronosBusinessService, boolean z6, String str, List<com.bilibili.community.favorite.f> list, Continuation<? super C62121> continuation) {
            super(2, continuation);
            this.this$0 = ogvChronosBusinessService;
            this.$favo = z6;
            this.$ids = str;
            this.$resources = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62121(this.this$0, this.$favo, this.$ids, this.$resources, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvChronosBusinessService ogvChronosBusinessService = this.this$0;
                long j7 = ogvChronosBusinessService.f94279e.f94449a;
                long jA = ogvChronosBusinessService.f94280f.a();
                boolean z6 = this.$favo;
                com.bilibili.community.favorite.e eVar = new com.bilibili.community.favorite.e(jA, this.$favo, this.$resources, z6 ? this.$ids : "", z6 ? "" : this.$ids, Boxing.boxLong(j7), this.this$0.f94290q.a().f123881c, this.this$0.f94290q.a().f123880b, PageViewTracker.getInstance().currentPolarisActionId(), 32);
                Community community = Community.a;
                this.label = 1;
                objA = community.a(eVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objA = ((Result) obj).unbox-impl();
            }
            OgvChronosBusinessService ogvChronosBusinessService2 = this.this$0;
            boolean z7 = this.$favo;
            if (Result.isSuccess-impl(objA)) {
                ogvChronosBusinessService2.f94284k.n(z7);
                OgvChronosBusinessService.a(ogvChronosBusinessService2, ogvChronosBusinessService2.f94287n.getString(2131847339));
            }
            OgvChronosBusinessService ogvChronosBusinessService3 = this.this$0;
            if (Result.exceptionOrNull-impl(objA) != null) {
                OgvChronosBusinessService.a(ogvChronosBusinessService3, ogvChronosBusinessService3.f94287n.getString(2131845879));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvChronosBusinessService$onUpdateSeasonFollowState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$onUpdateSeasonFollowState$1.class */
    public static final class C62131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62131(OgvChronosBusinessService ogvChronosBusinessService, Continuation<? super C62131> continuation) {
            super(2, continuation);
            this.this$0 = ogvChronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62131(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.this$0.f94279e.f94449a;
                Community community = Community.a;
                com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(Community.h(j7).a, j7, (Long) null);
                this.label = 1;
                Object objG = community.g(dVar, this);
                obj2 = objG;
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).unbox-impl();
            }
            OgvChronosBusinessService ogvChronosBusinessService = this.this$0;
            if (Result.isSuccess-impl(obj2)) {
                FollowSeasonResult followSeasonResult = (FollowSeasonResult) obj2;
                if (followSeasonResult.b.length() > 0) {
                    ToastHelper.showToastShort(ogvChronosBusinessService.f94287n, followSeasonResult.b);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public OgvChronosBusinessService(@NotNull ChronosBusinessService chronosBusinessService, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull OgvSeason ogvSeason, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull C7893a c7893a, @NotNull RelationRepository relationRepository, @NotNull IInteractLayerService iInteractLayerService, @NotNull IToastService iToastService, @NotNull Context context, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull C8043a c8043a) {
        this.f94275a = chronosBusinessService;
        this.f94276b = coroutineScope;
        this.f94277c = bVar;
        this.f94278d = dVar;
        this.f94279e = ogvSeason;
        this.f94280f = ogvEpisode;
        this.f94281g = cVar;
        this.h = episodeExtraInfoRepository;
        this.f94282i = ogvCurrentEpisodeRepository;
        this.f94283j = c7893a;
        this.f94284k = relationRepository;
        this.f94285l = iInteractLayerService;
        this.f94286m = iToastService;
        this.f94287n = context;
        this.f94288o = jVar;
        this.f94289p = aVar;
        this.f94290q = c8043a;
        UpdateCurrentWork.Response response = new UpdateCurrentWork.Response();
        response.setWorkId(String.valueOf(ogvEpisode.a()));
        response.setVideoId(String.valueOf(jVar.f().getCid()));
        this.f94291r = response;
        iInteractLayerService.setSceneAndBizParams(ChronosScene.SCENE_DETAIL, ChronosBiz.BIZ_OGV);
        iInteractLayerService.enableReply(false);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final void a(OgvChronosBusinessService ogvChronosBusinessService, String str) {
        ogvChronosBusinessService.getClass();
        ogvChronosBusinessService.f94286m.showToast(new PlayerToast.Builder().toastItemType(17).location(33).duration(2000L).setExtraString("extra_title", str).build());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final GetWorkInfo.Response b() throws NoWhenBranchMatchedException {
        ExtraInfo extraInfoA = this.h.a();
        if (extraInfoA == null) {
            return new GetWorkInfo.Response();
        }
        GetWorkInfo.Response response = new GetWorkInfo.Response();
        OgvEpisode ogvEpisode = this.f94280f;
        response.setWorkId(String.valueOf(ogvEpisode.a()));
        response.setVideoId(String.valueOf(this.f94288o.f().getCid()));
        String str = ogvEpisode.f93563j;
        response.setWorkTitle(str);
        response.setVideoTitle(str);
        response.setDuration(Long.valueOf(ogvEpisode.c()));
        List<OgvEpisode> listE = this.f94282i.e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((OgvEpisode) it.next()).f93561g));
        }
        response.setVideoList((String[]) arrayList.toArray(new String[0]));
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f94278d;
        response.setUpperId(new String[]{String.valueOf(dVar.f())});
        response.setUpperAvatar(dVar.b());
        response.setUpperName(dVar.g());
        response.setEpId(String.valueOf(ogvEpisode.f93555a));
        response.setSeasonId(String.valueOf(this.f94279e.f94449a));
        response.setSeasonType(Long.valueOf(r0.f94450b.f71782a));
        response.setHasPaymentToast(Boolean.FALSE);
        FragmentVideo fragmentVideo = (FragmentVideo) vv0.d.f128454b.a(extraInfoA);
        response.setAttachment(fragmentVideo != null ? com.bilibili.ship.theseus.united.page.danmaku.i.a(fragmentVideo) : null);
        return response;
    }

    @Nullable
    public final FetchBusinessData.Response fetchBusinessData(@NotNull String str, @Nullable Object obj) {
        return this.f94275a.fetchBusinessData(str, obj);
    }

    @Nullable
    public final GetOnlineInfo.Response getOnlineInfo() {
        return this.f94275a.getOnlineInfo();
    }

    @Nullable
    public final int[] getPlayerComponentsHeight() {
        return this.f94275a.getPlayerComponentsHeight();
    }

    @NotNull
    public final UpdateShipChain.Response getRelationshipChain() {
        UpdateShipChain.Response response = new UpdateShipChain.Response();
        RelationRepository relationRepository = this.f94284k;
        response.setLikeState(Boolean.valueOf(relationRepository.j()));
        response.setLikeNum(Long.valueOf(relationRepository.l()));
        response.setDislikeState(Boolean.valueOf(relationRepository.h()));
        response.setCoinState(Boolean.valueOf(relationRepository.g()));
        response.setCoinNum(Long.valueOf(relationRepository.a()));
        response.setFavoriteState(Boolean.valueOf(relationRepository.i()));
        response.setFollowState(Boolean.valueOf(this.f94278d.d()));
        long j7 = this.f94279e.f94449a;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        com.bilibili.community.follow.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
        }
        response.setFollowSeasonState(Boolean.valueOf(bVar2.a));
        return response;
    }

    public final void notifyDanmakuExperiment(@Nullable String str, boolean z6) {
        this.f94275a.notifyDanmakuExperiment(str, z6);
    }

    public final void notifyDanmakuSent(@Nullable String str) {
        this.f94275a.notifyDanmakuSent(str);
    }

    public final void onDanmakuReply(@NotNull String str, @NotNull String str2, long j7, @NotNull String str3) {
        this.f94275a.onDanmakuReply(str, str2, j7, str3);
    }

    public final void onInvokeDanmakuInputPanel(@Nullable InvokeCommandDetailPanel.CommandDetailParams commandDetailParams) {
        this.f94275a.onInvokeDanmakuInputPanel(commandDetailParams);
    }

    @NotNull
    public final UpdateCurrentWork.Response onRpcGetCurrentWork() {
        return this.f94291r;
    }

    @NotNull
    public final GetWorkInfo.Response onRpcGetWorkInfo() {
        return b();
    }

    public final void onShowDanmakuFeedback(@NotNull DanmakuFeedbackInfo danmakuFeedbackInfo, @NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f94275a.onShowDanmakuFeedback(danmakuFeedbackInfo, str, map, function8);
    }

    public final void onTriggerTripleLike() {
        this.f94275a.onTriggerTripleLike();
        BuildersKt.launch$default(this.f94276b, (CoroutineContext) null, (CoroutineStart) null, new C62111(this, null), 3, (Object) null);
    }

    public final void onUpdateClockInState(@NotNull UpdateVideoDetailState.CheckInState checkInState) {
        this.f94275a.onUpdateClockInState(checkInState);
    }

    public final void onUpdateCoinState(boolean z6) {
        this.f94275a.onUpdateCoinState(z6);
    }

    public final boolean onUpdateCurrentWork(@Nullable UpdateCurrentWork.Request request) {
        return true;
    }

    public final void onUpdateDislikeState(boolean z6) {
        this.f94275a.onUpdateDislikeState(z6);
    }

    public final void onUpdateFavoState(boolean z6) {
        boolean z7;
        if (C0.b()) {
            z7 = true;
        } else {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            z7 = false;
        }
        if (z7) {
            BuildersKt.launch$default(this.f94276b, (CoroutineContext) null, (CoroutineStart) null, new C62121(this, z6, "0", CollectionsKt.listOf(new com.bilibili.community.favorite.f(this.f94280f.f93555a, 24)), null), 3, (Object) null);
        }
    }

    public final void onUpdateFollowState(boolean z6) {
        this.f94275a.onUpdateFollowState(z6);
    }

    public final void onUpdateLikeState(boolean z6) {
        this.f94275a.onUpdateLikeState(z6);
    }

    @Deprecated(message = "使用明确的行为定义，而不是使用这个聚合体")
    public final void onUpdateRelationshipChain(@Nullable UpdateShipChain.Request request) {
        this.f94275a.onUpdateRelationshipChain(request);
    }

    public final void onUpdateReserveState(@NotNull UpdateVideoDetailState.ReserveState reserveState) {
        this.f94275a.onUpdateReserveState(reserveState);
    }

    public final void onUpdateSeasonFollowState(boolean z6) {
        boolean z7;
        if (C0.b()) {
            z7 = true;
        } else {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            z7 = false;
        }
        if (z7) {
            BuildersKt.launch$default(this.f94276b, (CoroutineContext) null, (CoroutineStart) null, new C62131(this, null), 3, (Object) null);
        }
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        this.f94275a.onUpdateStaffFollowState(list);
    }

    public final boolean openURLSchema(@NotNull Uri uri, @Nullable OpenUrlScheme.BizParams bizParams) {
        String queryParameter;
        boolean z6 = false;
        if (Intrinsics.areEqual(uri.getAuthority(), "chronos")) {
            z6 = false;
            if (uri.getPathSegments().contains("inner_player")) {
                String queryParameter2 = uri.getQueryParameter("scheme");
                if (queryParameter2 == null || (queryParameter = uri.getQueryParameter("biz")) == null) {
                    z6 = false;
                } else {
                    String queryParameter3 = uri.getQueryParameter("type");
                    String str = queryParameter3;
                    if (queryParameter3 == null) {
                        str = "half";
                    }
                    if (Intrinsics.areEqual(str, "fillLandscape")) {
                        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f94281g;
                        if (!cVar.h().f102988b) {
                            cVar.e();
                        }
                    }
                    BuildersKt.launch$default(this.f94276b, (CoroutineContext) null, (CoroutineStart) null, new OgvChronosBusinessService$openUrlScheme$1(this, queryParameter2, queryParameter, str, null), 3, (Object) null);
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final boolean openURLScheme(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable OpenUrlScheme.BizParams bizParams, @Nullable Integer num2) {
        boolean z6 = false;
        if (num != null && num.intValue() == 1 && str2 != null) {
            String queryParameter = Uri.parse(str).getQueryParameter("type");
            String str3 = queryParameter;
            if (queryParameter == null) {
                str3 = "half";
            }
            if (Intrinsics.areEqual(str3, "fillLandscape")) {
                com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f94281g;
                if (!cVar.h().f102988b) {
                    cVar.e();
                }
            }
            BuildersKt.launch$default(this.f94276b, (CoroutineContext) null, (CoroutineStart) null, new OgvChronosBusinessService$openUrlScheme$2(this, str, str2, str3, null), 3, (Object) null);
            z6 = true;
        }
        return z6;
    }

    public final void showDanmakuFeedbackWebview(@NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f94275a.showDanmakuFeedbackWebview(str, map, function8);
    }

    public final void showPlayerNaPage(@NotNull String str) {
        this.f94275a.showPlayerNaPage(str);
    }

    public final void showPlayerWebView(@NotNull String str) {
        this.f94275a.showPlayerWebView(str);
    }

    public final boolean showSubtitleReportDialog(@Nullable ReportSubtitle.SubtitleMeta subtitleMeta, @Nullable ReportSubtitle.SubtitleMeta subtitleMeta2) {
        return this.f94275a.showSubtitleReportDialog(subtitleMeta, subtitleMeta2);
    }

    public final void updateDanmakuInputPanel(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<Object, ? super Map<String, byte[]>, Unit> function2) {
        this.f94275a.updateDanmakuInputPanel(str, bool, bool2, function2);
    }

    @Nullable
    public final UpdateFullscreenState.Response updateFullscreenState(@Nullable Boolean bool, @Nullable Boolean bool2) {
        return this.f94275a.updateFullscreenState(bool, bool2);
    }

    @Nullable
    public final UpdatePreference.Response updatePreference(@NotNull String str, @Nullable String str2) {
        return this.f94275a.updatePreference(str, str2);
    }
}
