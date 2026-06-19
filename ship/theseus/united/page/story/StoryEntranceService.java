package com.bilibili.ship.theseus.united.page.story;

import J1.z;
import Zh0.InterfaceC3175a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.moduleservice.player.PlayerShareBundle;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.AutoFullscreenService;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.story.StoryEntranceService;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;
import tv.danmaku.videoplayer.coreV2.adapter.ijk.IjkMediaItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService.class */
@StabilityInferred(parameters = 0)
public final class StoryEntranceService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f103017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f103019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f103021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103022g;

    @NotNull
    public final PlayerContainer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7893a f103024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f103025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageReportService f103026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f103027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final RelationRepository f103028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f103029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f103030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StoryTransitionAnimService f103031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ev0.j f103032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.f f103033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C8043a f103034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final BusinessType f103035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final AutoFullscreenService f103036v;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryEntranceService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StoryEntranceService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryEntranceService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StoryEntranceService f103037a;

            public a(StoryEntranceService storyEntranceService) {
                this.f103037a = storyEntranceService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Bundle extras;
                Intent intent = ((StoryTransitionAnimService.b) obj).f103071a;
                StoryEntranceService storyEntranceService = this.f103037a;
                storyEntranceService.getClass();
                Bundle extras2 = null;
                defpackage.a.b("[theseus-united-StoryEntranceService-handleFullScreen2StoryBack] ", "try to play from shared: sharedId=" + (intent != null ? intent.getExtras() : null), "StoryEntranceService-handleFullScreen2StoryBack");
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra(PlayerShareBundle.SHARE_PLAYER_ID, 0)) : null;
                long longExtra = 0;
                long longExtra2 = intent != null ? intent.getLongExtra(GameCardButton.extraAvid, 0L) : 0L;
                if (intent != null) {
                    longExtra = intent.getLongExtra("cid", 0L);
                }
                if (intent != null && (extras = intent.getExtras()) != null && Fj0.a.a(extras, "force_horizon_ratio")) {
                    storyEntranceService.f103024j.f123390c = new Pair<>(Long.valueOf(longExtra), Float.valueOf(1.7777778f));
                }
                if (intent != null) {
                    extras2 = intent.getExtras();
                }
                storyEntranceService.f103033s.b(numValueOf, longExtra2, longExtra, extras2);
                StringBuilder sb = new StringBuilder("try to play from shared: sharedId=");
                sb.append(numValueOf);
                sb.append(" ");
                sb.append(longExtra2);
                defpackage.a.b("[theseus-united-StoryEntranceService-playFromFullScreen2StoryBack] ", Ld.c.a(sb, longExtra, " "), "StoryEntranceService-playFromFullScreen2StoryBack");
                storyEntranceService.f103018c.setControllerEnable(true, ControlContainerType.HALF_SCREEN);
                storyEntranceService.f103019d.setChronosVisible(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StoryEntranceService storyEntranceService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = storyEntranceService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StoryEntranceService storyEntranceService = this.this$0;
                SharedFlow<StoryTransitionAnimService.b> sharedFlow = storyEntranceService.f103031q.f103040B;
                a aVar = new a(storyEntranceService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryEntranceService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StoryEntranceService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StoryEntranceService storyEntranceService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = storyEntranceService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(StoryEntranceService storyEntranceService, boolean z6) {
            Long l7 = storyEntranceService.f103025k.f103038a;
            boolean z7 = false;
            boolean z8 = l7 != null && l7.longValue() > 0;
            String str = z6 ? "1" : "2";
            if (storyEntranceService.f103036v.f98785a && z8) {
                storyEntranceService.a(str, true);
                return true;
            }
            if (storyEntranceService.f103018c.getScreenModeType() != ScreenModeType.THUMB) {
                return false;
            }
            if (z8) {
                com.bilibili.ship.theseus.keel.player.j jVarJ = storyEntranceService.f103022g.j();
                if (jVarJ != null) {
                    ResolveAndPlayPlayable.c<InterfaceC5778f> cVarH0 = jVarJ.h0();
                    ResolveAndPlayPlayable.c.C0510c c0510c = cVarH0 instanceof ResolveAndPlayPlayable.c.C0510c ? (ResolveAndPlayPlayable.c.C0510c) cVarH0 : null;
                    InterfaceC5778f interfaceC5778f = c0510c != null ? (InterfaceC5778f) c0510c.f79314a : null;
                    FlattenedPCSFacade flattenedPCSFacade = interfaceC5778f instanceof FlattenedPCSFacade ? (FlattenedPCSFacade) interfaceC5778f : null;
                    if (flattenedPCSFacade != null) {
                        FlattenedPCSFacade.c cVar = (FlattenedPCSFacade.c) flattenedPCSFacade.f79363m.getValue();
                        boolean z9 = false;
                        if (cVar != null) {
                            z9 = false;
                            if (cVar.f79380a == flattenedPCSFacade.f79357f) {
                                z9 = true;
                            }
                        }
                        z7 = !z9;
                    }
                }
                if (z7) {
                    BLog.i("StoryEntranceService$2-invokeSuspend$lambda$0", "[theseus-united-StoryEntranceService$2-invokeSuspend$lambda$0] Do not share to story: playing video fragments.");
                    storyEntranceService.b();
                    storyEntranceService.f103021f.finish();
                    return true;
                }
                BuildersKt.launch$default(storyEntranceService.f103016a, (CoroutineContext) null, (CoroutineStart) null, new StoryEntranceService$2$1$1(storyEntranceService, str, null), 3, (Object) null);
            }
            return z8;
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
                ResultKt.throwOnFailure(obj);
                final StoryEntranceService storyEntranceService = this.this$0;
                BackActionRepository backActionRepository = storyEntranceService.f103027m;
                Function1<? super Boolean, Boolean> function1 = new Function1(storyEntranceService) { // from class: com.bilibili.ship.theseus.united.page.story.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StoryEntranceService f103083a;

                    {
                        this.f103083a = storyEntranceService;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(StoryEntranceService.AnonymousClass2.invokeSuspend$lambda$0(this.f103083a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryEntranceService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Long f103038a;

        public a(@Nullable Long l7) {
            this.f103038a = l7;
        }
    }

    @Inject
    public StoryEntranceService(@NotNull CoroutineScope coroutineScope, @NotNull IRenderContainerService iRenderContainerService, @NotNull IControlContainerService iControlContainerService, @NotNull IInteractLayerService iInteractLayerService, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull FragmentActivity fragmentActivity, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PlayerContainer playerContainer, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull C7893a c7893a, @NotNull a aVar, @NotNull PageReportService pageReportService, @NotNull BackActionRepository backActionRepository, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull StoryTransitionAnimService storyTransitionAnimService, @NotNull ev0.j jVar, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.f fVar, @NotNull C8043a c8043a, @NotNull BusinessType businessType, @NotNull AutoFullscreenService autoFullscreenService) {
        this.f103016a = coroutineScope;
        this.f103017b = iRenderContainerService;
        this.f103018c = iControlContainerService;
        this.f103019d = iInteractLayerService;
        this.f103020e = iPlayerCoreService;
        this.f103021f = fragmentActivity;
        this.f103022g = hVar;
        this.h = playerContainer;
        this.f103023i = iPlayerSettingService;
        this.f103024j = c7893a;
        this.f103025k = aVar;
        this.f103026l = pageReportService;
        this.f103027m = backActionRepository;
        this.f103028n = relationRepository;
        this.f103029o = dVar;
        this.f103030p = aVar2;
        this.f103031q = storyTransitionAnimService;
        this.f103032r = jVar;
        this.f103033s = fVar;
        this.f103034t = c8043a;
        this.f103035u = businessType;
        this.f103036v = autoFullscreenService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public final void a(@NotNull String str, boolean z6) {
        C7893a c7893a = this.f103024j;
        PlayingAreaDescription playingAreaDescriptionA = c7893a.a();
        VideoDimension videoDimension = playingAreaDescriptionA != null ? playingAreaDescriptionA.f102328c : null;
        int i7 = videoDimension != null ? videoDimension.f98735b : 0;
        int i8 = videoDimension != null ? videoDimension.f98734a : 0;
        InterfaceC3175a interfaceC3175a = (InterfaceC3175a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC3175a.class, (String) null, 2, (Object) null);
        IRenderContainerService iRenderContainerService = this.f103017b;
        AspectRatio aspectRatio = iRenderContainerService.getAspectRatio();
        AspectRatio aspectRatioB = this.f103031q.b();
        if (aspectRatioB == null) {
            aspectRatioB = aspectRatio;
        }
        if (aspectRatioB != aspectRatio) {
            iRenderContainerService.setAspectRatio(aspectRatioB);
        }
        PlayerSharingBundle playerSharingBundle = new PlayerSharingBundle();
        com.bilibili.ship.theseus.keel.player.h hVar = this.f103022g;
        boolean zC = CompoundPlayStateProviderKt.c(hVar);
        IPlayerCoreService iPlayerCoreService = this.f103020e;
        if (zC) {
            playerSharingBundle.getBundle().putBoolean("key_share_keep_render", true);
            playerSharingBundle.getBundle().putBoolean("key_share_player_adjust_layer_type", com.bilibili.playerbizcommon.utils.f.a(iPlayerCoreService.getMediaResource()));
            playerSharingBundle.getBundle().putBoolean("key_share_player_viewport_until_surface_created", true);
        }
        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
        BLog.i("StoryEntranceService-fullscreenToStory", "[theseus-united-StoryEntranceService-fullscreenToStory] " + ("is trialing vip qn: " + (jVarJ != null ? Boolean.valueOf(jVarJ.z()) : null)));
        Bundle bundle = playerSharingBundle.getBundle();
        com.bilibili.ship.theseus.keel.player.j jVarJ2 = hVar.j();
        bundle.putBoolean("key_share_player_is_trialing_vip_qn", jVarJ2 != null && jVarJ2.z());
        int currentQuality = iPlayerCoreService.getCurrentQuality();
        if (currentQuality > 0) {
            playerSharingBundle.getBundle().putInt("target_quality", currentQuality);
        }
        BLog.i("StoryEntranceService-fullscreenToStory", "[theseus-united-StoryEntranceService-fullscreenToStory] goto story");
        this.f103019d.setDanmakuSwitchShareEnable(true);
        final int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(PlayerSharingType.NORMAL, this.h, playerSharingBundle, (Function1) null);
        String str2 = z6 ? "1" : "2";
        C7893a.C1318a c1318aC = c7893a.c();
        long j7 = 0;
        long j8 = c1318aC != null ? c1318aC.f123395a.f123397a : 0L;
        if (c1318aC != null) {
            j7 = c1318aC.f123395a.f123398b;
        }
        FragmentActivity fragmentActivity = this.f103021f;
        if (iPrepareForShare > 0) {
            final long j9 = j8;
            final long j10 = j7;
            final String str3 = str2;
            final AspectRatio aspectRatio2 = aspectRatioB;
            final int i9 = i7;
            final int i10 = i8;
            BLRouter.routeTo(new RouteRequest.Builder(androidx.core.content.c.a(LogReportStrategy.TAG_DEFAULT).authority((interfaceC3175a == null || interfaceC3175a.e()) ? "story_translucent" : "story").appendPath(String.valueOf(j8)).build()).extras(new Function1(j9, j10, this, str3, iPrepareForShare, aspectRatio2, i9, i10) { // from class: com.bilibili.ship.theseus.united.page.story.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f103072a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f103073b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final StoryEntranceService f103074c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f103075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f103076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final AspectRatio f103077f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f103078g;
                public final int h;

                {
                    this.f103072a = j9;
                    this.f103073b = j10;
                    this.f103074c = this;
                    this.f103075d = str3;
                    this.f103076e = iPrepareForShare;
                    this.f103077f = aspectRatio2;
                    this.f103078g = i9;
                    this.h = i10;
                }

                public final Object invoke(Object obj) {
                    GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                    Map extraContentForResolve;
                    MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                    mutableBundleLike.put(GameCardButton.extraAvid, String.valueOf(this.f103072a));
                    mutableBundleLike.put("cid", String.valueOf(this.f103073b));
                    mutableBundleLike.put("from_spmid", "united.player-video-detail.0.0");
                    StoryEntranceService storyEntranceService = this.f103074c;
                    mutableBundleLike.put("trackid", storyEntranceService.f103034t.a().f123882d);
                    mutableBundleLike.put("report_flow_data", storyEntranceService.f103034t.a().f123884f);
                    mutableBundleLike.put("player_share", this.f103075d);
                    mutableBundleLike.put("request_from", "2");
                    mutableBundleLike.put(PlayerShareBundle.SHARE_PLAYER_TYPE, String.valueOf(PlayerSharingType.NORMAL.ordinal()));
                    mutableBundleLike.put(PlayerShareBundle.SHARE_PLAYER_ID, String.valueOf(this.f103076e));
                    mutableBundleLike.put("video_aspect", this.f103077f.toString());
                    mutableBundleLike.put("player_height", String.valueOf(this.f103078g));
                    mutableBundleLike.put("player_width", String.valueOf(this.h));
                    mutableBundleLike.put("player_rotate", "0");
                    RelationRepository relationRepository = storyEntranceService.f103028n;
                    mutableBundleLike.put("like_num", String.valueOf(relationRepository.l()));
                    mutableBundleLike.put("coin_num", String.valueOf(relationRepository.a()));
                    mutableBundleLike.put("comment_num", String.valueOf(relationRepository.b()));
                    mutableBundleLike.put("favorite_num", String.valueOf(relationRepository.f()));
                    mutableBundleLike.put("share_num", String.valueOf(relationRepository.q()));
                    mutableBundleLike.put("support_miniplayer", String.valueOf(storyEntranceService.f103023i.getCloudConfig().G()));
                    mutableBundleLike.put("goto", e.a(storyEntranceService.f103035u));
                    mutableBundleLike.put("preload_info", storyEntranceService.c());
                    com.bilibili.ship.theseus.keel.player.j jVarJ3 = storyEntranceService.f103022g.j();
                    if (jVarJ3 != null && (geminiCommonPlayableParamsF = jVarJ3.f()) != null && (extraContentForResolve = geminiCommonPlayableParamsF.getExtraContentForResolve()) != null) {
                        String str4 = (String) extraContentForResolve.get("material_no");
                        if (str4 != null) {
                            if (str4.length() <= 0) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                mutableBundleLike.put("material_no", str4);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }).overridePendingTransition(0, 0).requestCode(1101).build(), fragmentActivity);
            StringBuilder sb = new StringBuilder("share player to story : avid=");
            sb.append(j8);
            z.a(j7, ", cid=", ", playerShare=", sb);
            sb.append(str2);
            defpackage.a.b("[theseus-united-StoryEntranceService-fullscreenToStory] ", sb.toString(), "StoryEntranceService-fullscreenToStory");
        } else {
            b();
            defpackage.a.b("[theseus-united-StoryEntranceService-fullscreenToStory] ", "do not share player to story : avid=" + j8 + ", cid=" + j7, "StoryEntranceService-fullscreenToStory");
        }
        PageReportService.g(this.f103026l, "united.player.goto-vertical.0.player", MapsKt.mapOf(TuplesKt.to("aciton_type", str)), 4);
        if (c1318aC != null) {
            this.f103033s.c(c1318aC);
        }
        this.f103032r.f();
        if (z6) {
            fragmentActivity.finish();
        }
    }

    public final void b() {
        C7893a c7893a = this.f103024j;
        C7893a.C1318a c1318aC = c7893a.c();
        long j7 = 0;
        long j8 = c1318aC != null ? c1318aC.f123395a.f123397a : 0L;
        if (c1318aC != null) {
            j7 = c1318aC.f123395a.f123398b;
        }
        PlayingAreaDescription playingAreaDescriptionA = c7893a.a();
        VideoDimension videoDimension = playingAreaDescriptionA != null ? playingAreaDescriptionA.f102328c : null;
        final long j9 = j7;
        final int i7 = videoDimension != null ? videoDimension.f98735b : 0;
        final int i8 = videoDimension != null ? videoDimension.f98734a : 0;
        BLRouter.routeTo(new RouteRequest.Builder(LJ0.c.a(LogReportStrategy.TAG_DEFAULT, "story").appendPath(String.valueOf(j8)).build()).extras(new Function1(j9, this, i7, i8) { // from class: com.bilibili.ship.theseus.united.page.story.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f103079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final StoryEntranceService f103080b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f103081c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f103082d;

            {
                this.f103079a = j9;
                this.f103080b = this;
                this.f103081c = i7;
                this.f103082d = i8;
            }

            public final Object invoke(Object obj) {
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                mutableBundleLike.put("cid", String.valueOf(this.f103079a));
                mutableBundleLike.put("from_spmid", "united.player-video-detail.0.0");
                mutableBundleLike.put("story_vv_normal", "true");
                StoryEntranceService storyEntranceService = this.f103080b;
                mutableBundleLike.put("trackid", storyEntranceService.f103034t.a().f123882d);
                mutableBundleLike.put("report_flow_data", storyEntranceService.f103034t.a().f123884f);
                mutableBundleLike.put("request_from", "2");
                mutableBundleLike.put("player_height", String.valueOf(this.f103081c));
                mutableBundleLike.put("player_width", String.valueOf(this.f103082d));
                mutableBundleLike.put("player_rotate", "0");
                mutableBundleLike.put("goto", e.a(storyEntranceService.f103035u));
                mutableBundleLike.put("preload_info", storyEntranceService.c());
                return Unit.INSTANCE;
            }
        }).overridePendingTransition(0, 0).requestCode(1101).build(), this.f103021f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.story.StoryEntranceService.c():java.lang.String");
    }

    public final void d() {
        TheseusPlayerQualityParamsConfigService.ScreenState screenState = TheseusPlayerQualityParamsConfigService.ScreenState.STATE_STORY;
        IjkMediaItem currentMediaItem = this.f103020e.getCurrentMediaItem();
        IjkMediaItem ijkMediaItem = currentMediaItem instanceof IjkMediaItem ? currentMediaItem : null;
        if (ijkMediaItem == null) {
            return;
        }
        BLog.i("PlayerQualityParamsConfigService", "updateScreenState: " + screenState);
        ijkMediaItem.setScreenState(screenState.getValue());
    }
}
