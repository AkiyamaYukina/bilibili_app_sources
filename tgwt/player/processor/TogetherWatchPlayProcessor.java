package com.bilibili.tgwt.player.processor;

import android.content.Context;
import android.os.Handler;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.datawrapper.ContinuingType;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ogvcommon.play.resolver.ViewInfoExtraVo;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.chatroom.PlayStatus;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchPlayProcessor {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final long f111588L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f111589M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public PlayStatus f111590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f111591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public PlayStatus f111592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public final com.bilibili.tgwt.player.widget.l f111594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public final com.bilibili.tgwt.player.widget.m f111595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final n f111596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f111597H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final b f111598I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final c f111599J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final d f111600K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f111601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayControlService f111605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ChatService f111606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlayHistoryService f111607g;

    @NotNull
    public final NewSectionService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SeekBizService f111608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BangumiPreloadPlayHandlerService f111609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lifecycle f111610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f111612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Kl.a f111613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Rl.e f111614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Handler f111615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f111616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f111617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f111618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f111619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f111620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f111621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f111622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public PlayStatus f111623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f111624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f111625z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchPlayProcessor f111626a;

        public a(TogetherWatchPlayProcessor togetherWatchPlayProcessor) {
            this.f111626a = togetherWatchPlayProcessor;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111626a;
            com.bilibili.tgwt.player.widget.m mVar = togetherWatchPlayProcessor.f111595F;
            if (mVar != null) {
                mVar.f111839a.getPlayerServiceController().v(mVar);
            }
            CoroutineScopeKt.cancel$default(togetherWatchPlayProcessor.f111593D, (CancellationException) null, 1, (Object) null);
            togetherWatchPlayProcessor.f111614o.j().unregisterSeekObserver(togetherWatchPlayProcessor.f111598I);
            d dVar = togetherWatchPlayProcessor.f111600K;
            BangumiPlayerContainerService bangumiPlayerContainerService = togetherWatchPlayProcessor.f111602b;
            bangumiPlayerContainerService.removeVideoPlayEventListener(dVar);
            bangumiPlayerContainerService.unregisterPlayerState(togetherWatchPlayProcessor.f111599J);
            togetherWatchPlayProcessor.f111615p.removeCallbacks(togetherWatchPlayProcessor.f111596G);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111626a;
            if (togetherWatchPlayProcessor.f111616q) {
                return;
            }
            togetherWatchPlayProcessor.e();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$b.class */
    public static final class b implements PlayerSeekObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchPlayProcessor f111627a;

        public b(TogetherWatchPlayProcessor togetherWatchPlayProcessor) {
            this.f111627a = togetherWatchPlayProcessor;
        }

        public final void onSeekComplete(long j7) {
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111627a;
            if (togetherWatchPlayProcessor.f111597H) {
                togetherWatchPlayProcessor.f111597H = false;
                int iK = togetherWatchPlayProcessor.f111614o.k();
                if (iK == 4) {
                    togetherWatchPlayProcessor.f111590A = PlayStatus.PLAYING;
                } else if (iK == 5) {
                    togetherWatchPlayProcessor.f111590A = PlayStatus.PAUSE;
                }
                Duration.Companion companion = Duration.Companion;
                togetherWatchPlayProcessor.f111591B = DurationKt.toDuration(j7, DurationUnit.MILLISECONDS);
                togetherWatchPlayProcessor.a();
            }
        }

        public final void onSeekStart(long j7) {
            super.onSeekStart(j7);
            this.f111627a.f111597H = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$c.class */
    public static final class c implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchPlayProcessor f111628a;

        public c(TogetherWatchPlayProcessor togetherWatchPlayProcessor) {
            this.f111628a = togetherWatchPlayProcessor;
        }

        public final void onPlayerStateChanged(int i7) {
            ChatRoomInfo chatRoomInfo;
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111628a;
            boolean z6 = togetherWatchPlayProcessor.f111616q;
            boolean z7 = false;
            ChatRoomManagerService chatRoomManagerService = togetherWatchPlayProcessor.f111603c;
            if (!z6) {
                togetherWatchPlayProcessor.d();
                if (i7 == 4) {
                    if (togetherWatchPlayProcessor.f111620u) {
                        togetherWatchPlayProcessor.f111620u = false;
                        if (togetherWatchPlayProcessor.f111621v && chatRoomManagerService.i() != null) {
                            togetherWatchPlayProcessor.f111621v = false;
                            togetherWatchPlayProcessor.b(chatRoomManagerService.i(), false);
                        }
                    } else {
                        togetherWatchPlayProcessor.e();
                    }
                    com.bilibili.tgwt.player.widget.l lVar = togetherWatchPlayProcessor.f111594E;
                    if (lVar != null) {
                        lVar.b();
                        return;
                    }
                    return;
                }
                if (i7 != 5) {
                    return;
                }
                if (togetherWatchPlayProcessor.f111619t) {
                    togetherWatchPlayProcessor.f111619t = false;
                    if (!togetherWatchPlayProcessor.f111622w || chatRoomManagerService.i() == null) {
                        return;
                    }
                    togetherWatchPlayProcessor.f111622w = false;
                    togetherWatchPlayProcessor.b(chatRoomManagerService.i(), false);
                    return;
                }
                if (togetherWatchPlayProcessor.f111624y) {
                    togetherWatchPlayProcessor.e();
                    togetherWatchPlayProcessor.f111624y = false;
                    return;
                } else {
                    if (togetherWatchPlayProcessor.f111625z) {
                        togetherWatchPlayProcessor.e();
                        togetherWatchPlayProcessor.f111625z = false;
                        return;
                    }
                    return;
                }
            }
            BangumiUniformSeason season = togetherWatchPlayProcessor.f111604d.getSeason();
            if (season != null && (chatRoomInfo = season.E) != null && chatRoomInfo.u() == 0) {
                togetherWatchPlayProcessor.f111607g.onPlayerStateChanged(i7, ContextUtilKt.requireActivity(togetherWatchPlayProcessor.f111601a));
            }
            Lifecycle lifecycle = togetherWatchPlayProcessor.f111610k;
            if (lifecycle.getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                if (i7 == 5) {
                    z7 = true;
                }
                chatRoomManagerService.f110928u = z7;
            }
            Rl.e eVar = togetherWatchPlayProcessor.f111614o;
            if (i7 == 4) {
                PlayStatus playStatus = PlayStatus.PLAYING;
                togetherWatchPlayProcessor.f111590A = playStatus;
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    togetherWatchPlayProcessor.f111592C = playStatus;
                }
                togetherWatchPlayProcessor.f111591B = eVar.a();
                togetherWatchPlayProcessor.a();
                return;
            }
            if (i7 == 5) {
                PlayStatus playStatus2 = PlayStatus.PAUSE;
                togetherWatchPlayProcessor.f111590A = playStatus2;
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    togetherWatchPlayProcessor.f111592C = playStatus2;
                }
                togetherWatchPlayProcessor.f111591B = eVar.a();
                togetherWatchPlayProcessor.a();
                return;
            }
            if (i7 != 6) {
                return;
            }
            PlayStatus playStatus3 = PlayStatus.COMPLETED;
            togetherWatchPlayProcessor.f111590A = playStatus3;
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                togetherWatchPlayProcessor.f111592C = playStatus3;
            }
            togetherWatchPlayProcessor.f111591B = eVar.a();
            togetherWatchPlayProcessor.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$d.class */
    public static final class d implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchPlayProcessor f111629a;

        public d(TogetherWatchPlayProcessor togetherWatchPlayProcessor) {
            this.f111629a = togetherWatchPlayProcessor;
        }

        public final void onResolveFailed(Video video, Video.PlayableParams playableParams, String str) {
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111629a;
            togetherWatchPlayProcessor.f111602b.getPlayerServiceController().j().stop();
            togetherWatchPlayProcessor.f111590A = PlayStatus.PAUSE;
            togetherWatchPlayProcessor.f111591B = Duration.Companion.getZERO-UwyO8pc();
            togetherWatchPlayProcessor.a();
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        f111588L = DurationKt.toDuration(3, DurationUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [com.bilibili.tgwt.player.processor.n] */
    @Inject
    public TogetherWatchPlayProcessor(@NotNull Context context, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull NewSeasonService newSeasonService, @NotNull PlayControlService playControlService, @NotNull ChatService chatService, @NotNull PlayHistoryService playHistoryService, @NotNull NewSectionService newSectionService, @NotNull SeekBizService seekBizService, @NotNull com.bilibili.tgwt.watermark.b bVar, @NotNull BangumiPreloadPlayHandlerService bangumiPreloadPlayHandlerService, @NotNull Lifecycle lifecycle, @NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull Kl.a aVar) {
        this.f111601a = context;
        this.f111602b = bangumiPlayerContainerService;
        this.f111603c = chatRoomManagerService;
        this.f111604d = newSeasonService;
        this.f111605e = playControlService;
        this.f111606f = chatService;
        this.f111607g = playHistoryService;
        this.h = newSectionService;
        this.f111608i = seekBizService;
        this.f111609j = bangumiPreloadPlayHandlerService;
        this.f111610k = lifecycle;
        this.f111611l = coroutineScope;
        this.f111612m = biliAccounts;
        this.f111613n = aVar;
        this.f111614o = bangumiPlayerContainerService.getPlayerServiceController();
        this.f111615p = new Handler(context.getMainLooper());
        BangumiUniformSeason season = newSeasonService.getSeason();
        boolean z6 = false;
        if (season != null) {
            ChatRoomInfo chatRoomInfo = season.E;
            z6 = false;
            if (chatRoomInfo != null) {
                z6 = false;
                if (chatRoomInfo.n() == biliAccounts.mid()) {
                    z6 = true;
                }
            }
        }
        this.f111616q = z6;
        this.f111617r = true;
        PlayStatus playStatus = PlayStatus.PAUSE;
        this.f111623x = playStatus;
        this.f111590A = playStatus;
        this.f111591B = Duration.Companion.getZERO-UwyO8pc();
        this.f111592C = playStatus;
        this.f111593D = X9.n.b();
        this.f111596G = new Runnable(this) { // from class: com.bilibili.tgwt.player.processor.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TogetherWatchPlayProcessor f111682a;

            {
                this.f111682a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRoomInfo chatRoomInfo2;
                BangumiUniformSeason season2;
                ChatRoomInfo chatRoomInfo3;
                TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.f111682a;
                BangumiUniformSeason season3 = togetherWatchPlayProcessor.f111604d.getSeason();
                if (season3 == null || (chatRoomInfo2 = season3.E) == null) {
                    return;
                }
                if (chatRoomInfo2.u() != 6 || togetherWatchPlayProcessor.f111618s) {
                    BuildersKt.launch$default(togetherWatchPlayProcessor.f111593D, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2(togetherWatchPlayProcessor, chatRoomInfo2, null), 3, (Object) null);
                    return;
                }
                togetherWatchPlayProcessor.f111618s = true;
                ChatRoomState chatRoomStateI = togetherWatchPlayProcessor.f111603c.i();
                if (chatRoomStateI == null || (season2 = togetherWatchPlayProcessor.f111604d.getSeason()) == null || (chatRoomInfo3 = season2.E) == null || chatRoomStateI.d() != chatRoomInfo3.t()) {
                    return;
                }
                int iK = chatRoomStateI.k();
                int value = PlayStatus.PAUSE.getValue();
                Rl.e eVar = togetherWatchPlayProcessor.f111614o;
                if (iK == value) {
                    eVar.q();
                } else if (iK == PlayStatus.PLAYING.getValue()) {
                    eVar.r();
                } else {
                    PlayStatus.COMPLETED.getValue();
                }
                Duration.Companion companion = Duration.Companion;
                long j7 = RangesKt.coerceAtMost(Duration.box-impl(DurationKt.toDuration(chatRoomStateI.g(), DurationUnit.SECONDS)), Duration.box-impl(eVar.g())).unbox-impl();
                if (Duration.equals-impl0(Duration.minus-LRDsOJo(j7, eVar.a()), Duration.Companion.getZERO-UwyO8pc())) {
                    return;
                }
                eVar.w(j7);
            }
        };
        this.f111598I = new b(this);
        c cVar = new c(this);
        this.f111599J = cVar;
        d dVar = new d(this);
        this.f111600K = dVar;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService.f110924q), new TogetherWatchPlayProcessor$start$1(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(newSeasonService.getSeasonObservable(), new TogetherWatchPlayProcessor$start$2(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(playControlService.getCurrentEpisodeFlow(), new TogetherWatchPlayProcessor$start$3(this, null)), coroutineScope);
        this.f111594E = new com.bilibili.tgwt.player.widget.l(context, chatRoomManagerService, newSeasonService, bangumiPlayerContainerService);
        this.f111595F = new com.bilibili.tgwt.player.widget.m(context, bVar, bangumiPlayerContainerService);
        bangumiPlayerContainerService.addVideoPlayEventListener(dVar);
        bangumiPlayerContainerService.registerPlayerState(cVar, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10});
        lifecycle.addObserver(new a(this));
    }

    public final void a() {
        Handler handler = this.f111615p;
        n nVar = this.f111596G;
        handler.removeCallbacks(nVar);
        handler.postDelayed(nVar, Duration.getInWholeMilliseconds-impl(f111588L));
    }

    public final void b(ChatRoomState chatRoomState, boolean z6) {
        ChatRoomInfo chatRoomInfo;
        com.bilibili.tgwt.player.widget.l lVar = this.f111594E;
        NewSeasonService newSeasonService = this.f111604d;
        BangumiUniformSeason season = newSeasonService.getSeason();
        if (season == null || (chatRoomInfo = season.E) == null || chatRoomState.d() != chatRoomInfo.t()) {
            return;
        }
        PlayControlService playControlService = this.f111605e;
        BangumiUniformEpisode currentPlayedEpisode = playControlService.getCurrentPlayedEpisode();
        long seasonId = newSeasonService.getSeasonId();
        if (currentPlayedEpisode != null) {
            if (chatRoomState.j() != seasonId) {
                this.f111624y = true;
                return;
            } else if (chatRoomState.c() != currentPlayedEpisode.a()) {
                if (this.h.getEpById(chatRoomState.c()) != null) {
                    PlayControlService.switchEpisode$default(this.f111605e, chatRoomState.c(), (ContinuingType) null, 2, (Object) null);
                    this.f111625z = true;
                    return;
                }
                return;
            }
        }
        Rl.e eVar = this.f111614o;
        int iK = eVar.k();
        if ((iK != 5 || this.f111621v || this.f111623x != PlayStatus.PLAYING || z6) && !this.f111624y) {
            ViewInfoExtraVo viewInfoExtraVo = (ViewInfoExtraVo) playControlService.viewInfoExtraFlow().getValue();
            boolean zE = viewInfoExtraVo != null ? viewInfoExtraVo.e() : false;
            if ((currentPlayedEpisode == null || !zE) && this.f111603c.f110900N != ChatService.GuestWatchMode.Free) {
                Duration.Companion companion = Duration.Companion;
                long jG = chatRoomState.g();
                DurationUnit durationUnit = DurationUnit.SECONDS;
                long duration = DurationKt.toDuration(jG, durationUnit);
                long jG2 = duration;
                if (Duration.compareTo-LRDsOJo(duration, eVar.g()) > 0) {
                    jG2 = eVar.g();
                    if (iK == 6) {
                        return;
                    }
                }
                if (Duration.compareTo-LRDsOJo(Duration.getAbsoluteValue-UwyO8pc(Duration.minus-LRDsOJo(jG2, eVar.a())), DurationKt.toDuration(5, durationUnit)) >= 0) {
                    eVar.w(jG2);
                }
                int iK2 = chatRoomState.k();
                PlayStatus playStatus = PlayStatus.PAUSE;
                if (iK2 == playStatus.getValue()) {
                    if (lVar != null) {
                        lVar.a();
                    }
                    if (iK == 0 || iK == 1 || iK == 2 || iK == 3 || iK == 4 || iK == 6 || iK == 100) {
                        this.f111619t = true;
                        this.f111623x = playStatus;
                        if (iK == 4) {
                            eVar.q();
                        } else {
                            this.f111622w = true;
                        }
                    }
                } else if (chatRoomState.k() != PlayStatus.COMPLETED.getValue()) {
                    if (lVar != null) {
                        lVar.b();
                    }
                    if (iK == 0 || iK == 1 || iK == 2 || iK == 3 || iK == 5 || iK == 6 || iK == 101) {
                        this.f111623x = PlayStatus.PLAYING;
                        this.f111620u = true;
                        if (iK == 5 || iK == 6) {
                            eVar.r();
                        } else {
                            this.f111621v = true;
                        }
                    }
                }
                d();
            }
        }
    }

    public final void c() {
        ChatRoomInfo chatRoomInfo;
        if (this.f111616q) {
            BangumiUniformSeason season = this.f111604d.getSeason();
            Integer numValueOf = (season == null || (chatRoomInfo = season.E) == null) ? null : Integer.valueOf(chatRoomInfo.u());
            BangumiPreloadPlayHandlerService bangumiPreloadPlayHandlerService = this.f111609j;
            boolean z6 = true;
            if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
                bangumiPreloadPlayHandlerService.setAutoPlay(true);
            } else {
                if (this.f111592C != PlayStatus.PLAYING) {
                    z6 = false;
                }
                bangumiPreloadPlayHandlerService.setAutoPlay(z6);
            }
        }
        this.f111619t = false;
        this.f111620u = false;
        this.f111621v = false;
        this.f111622w = false;
        PlayStatus playStatus = PlayStatus.PAUSE;
        this.f111623x = playStatus;
        this.f111590A = playStatus;
        this.f111591B = Duration.Companion.getZERO-UwyO8pc();
        if (!this.f111616q) {
            this.f111606f.u(ChatService.GuestWatchMode.Follow);
            com.bilibili.tgwt.player.widget.l lVar = this.f111594E;
            if (lVar != null) {
                lVar.a();
            }
        }
        com.bilibili.tgwt.player.widget.m mVar = this.f111595F;
        if (mVar != null) {
            mVar.f111839a.getPlayerServiceController().v(mVar);
            mVar.f111839a.getPlayerServiceController().b.addPlayerLayer(BuiltInLayer.LayerToast, mVar);
        }
    }

    public final void d() {
        boolean z6 = this.f111614o.k() == 5 && this.f111623x == PlayStatus.PLAYING;
        if (this.f111610k.getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
            this.f111603c.f110928u = z6;
        }
    }

    public final void e() {
        BLog.i("TogetherWatchPlayProcessor-syncPlayState", "[together-watch-TogetherWatchPlayProcessor-syncPlayState] 客态主动请求主态播放状态");
        if (this.f111603c.f110900N == ChatService.GuestWatchMode.Free) {
            return;
        }
        BuildersKt.launch$default(this.f111593D, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchPlayProcessor$syncPlayState$1(this, null), 3, (Object) null);
    }
}
