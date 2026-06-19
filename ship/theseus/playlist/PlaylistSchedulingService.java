package com.bilibili.ship.theseus.playlist;

import H3.C2024b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playset.detail.widget.C5924i;
import com.bilibili.ship.theseus.playlist.InterfaceC6214a;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.VideoDimension;
import com.bilibili.ship.theseus.playlist.util.f;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import lv0.C7893a;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistSchedulingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f95143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f95144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6240e f95145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f95146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f95147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95148g;

    @NotNull
    public final PlaylistLoadService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f95149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C8043a f95150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7893a f95151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f95152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PlaylistReportService f95153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f95154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f95155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final InterfaceC6217d f95156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C8043a f95157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final t f95158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f95159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.background.e f95160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f95161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Job f95162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final List<C6251p> f95163w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f95164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f95165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final ev0.l f95166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public TabPage.LocatableTag f95167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f95168e;

        public a(long j7, long j8, @Nullable ev0.l lVar, @Nullable TabPage.LocatableTag locatableTag, @Nullable String str) {
            this.f95164a = j7;
            this.f95165b = j8;
            this.f95166c = lVar;
            this.f95167d = locatableTag;
            this.f95168e = str;
        }
    }

    @Inject
    public PlaylistSchedulingService(@NotNull CoroutineScope coroutineScope, @NotNull a aVar, @NotNull InterfaceC7008a interfaceC7008a, @NotNull InterfaceC6240e interfaceC6240e, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull BackgroundPlayService backgroundPlayService, @NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull C8043a c8043a, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar2, @NotNull PlaylistReportService playlistReportService, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull InterfaceC6217d interfaceC6217d, @NotNull C8043a c8043a2, @NotNull t tVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.united.page.background.e eVar) {
        this.f95142a = coroutineScope;
        this.f95143b = aVar;
        this.f95144c = interfaceC7008a;
        this.f95145d = interfaceC6240e;
        this.f95146e = iPlayerCoreService;
        this.f95147f = backgroundPlayService;
        this.f95148g = playlistRepository;
        this.h = playlistLoadService;
        this.f95149i = hVar;
        this.f95150j = c8043a;
        this.f95151k = c7893a;
        this.f95152l = aVar2;
        this.f95153m = playlistReportService;
        this.f95154n = pageBackgroundPlayRepository;
        this.f95155o = pageNestedScrollFusionRepository;
        this.f95156p = interfaceC6217d;
        this.f95157q = c8043a2;
        this.f95158r = tVar;
        this.f95159s = gVar;
        this.f95160t = eVar;
        Lazy lazy = LazyKt.lazy(new C2024b(8));
        this.f95161u = lazy;
        this.f95163w = new ArrayList();
        if (((Boolean) lazy.getValue()).booleanValue()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$collectBeforePlayView$1(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$collectPlayerCompleted$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$collectPlayerForbidden$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$collectPlayingMedia$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$collectPagePlayingEpisode$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$handleInitial$1(this, null), 3, (Object) null);
    }

    public static final void a(PlaylistSchedulingService playlistSchedulingService) {
        playlistSchedulingService.getClass();
        BLog.i("PlaylistSchedulingService-initFromDefault", "[theseus-playlist-PlaylistSchedulingService-initFromDefault] Initial play from default index 0.");
        PlaylistRepository playlistRepository = playlistSchedulingService.f95148g;
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) CollectionsKt.first(playlistRepository.d());
        g(playlistSchedulingService, multiTypeMedia, multiTypeMedia.b(), null, null, 12);
        int i7 = multiTypeMedia.f95236j;
        if (i7 == 0 || i7 < playlistRepository.e().f95279l - 5) {
            return;
        }
        playlistSchedulingService.h.g();
    }

    public static void g(PlaylistSchedulingService playlistSchedulingService, MultiTypeMedia multiTypeMedia, Ou0.c cVar, ev0.l lVar, ev0.i iVar, int i7) {
        MutableStateFlow<PlaylistRepository.e> mutableStateFlow;
        Object value;
        PlaylistRepository.e eVar;
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        if ((i7 & 8) != 0) {
            iVar = null;
        }
        do {
            PlaylistRepository playlistRepository = playlistSchedulingService.f95148g;
            mutableStateFlow = playlistRepository.f95110r;
            value = mutableStateFlow.getValue();
            PlaylistRepository.e eVar2 = (PlaylistRepository.e) value;
            eVar = new PlaylistRepository.e(multiTypeMedia, cVar, lVar, iVar);
            playlistRepository.j(new C5924i(1, eVar, eVar2));
        } while (!mutableStateFlow.compareAndSet(value, eVar));
    }

    public static /* synthetic */ Object i(PlaylistSchedulingService playlistSchedulingService, boolean z6, boolean z7, Continuation continuation, int i7) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return playlistSchedulingService.h(z6, z7, false, continuation);
    }

    public static /* synthetic */ Object k(PlaylistSchedulingService playlistSchedulingService, boolean z6, SuspendLambda suspendLambda, int i7) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return playlistSchedulingService.j(false, z6, false, suspendLambda);
    }

    public static InterfaceC7008a.C1258a m(PlaylistSchedulingService playlistSchedulingService, MultiTypeMedia multiTypeMedia, Ou0.c cVar, ev0.i iVar, String str, int i7) {
        if ((i7 & 16) != 0) {
            str = null;
        }
        playlistSchedulingService.getClass();
        long jD = cVar != null ? cVar.f18088a : multiTypeMedia.d();
        long j7 = cVar != null ? cVar.f18089b : 0L;
        C8043a c8043a = playlistSchedulingService.f95150j;
        String str2 = c8043a.a().f123879a;
        String str3 = c8043a.a().f123882d;
        String str4 = c8043a.a().f123881c;
        PlayerMultiLangStore.f79562a.getClass();
        InterfaceC7008a.C1258a c1258a = new InterfaceC7008a.C1258a(jD, null, j7, str2, str4, null, str3, iVar, null, str, null, PlayerMultiLangStore.h, 0L, false, 0, false, 62754);
        if (multiTypeMedia.t()) {
            c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.e.f98758a.a, new com.bilibili.ship.theseus.united.bean.d(cVar != null ? Long.valueOf(cVar.f18090c) : null, null, cVar != null ? Long.valueOf(cVar.f18091d) : null, null, null, 58));
        } else if (multiTypeMedia.u()) {
            c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.c.f98751a.a, new com.bilibili.ship.theseus.united.bean.b((Long) null, (Long) null, (Long) null, (String) null, cVar != null ? cVar.f18097k : null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4079));
        }
        a aVar = playlistSchedulingService.f95143b;
        TabPage.LocatableTag locatableTag = aVar.f95167d;
        if (locatableTag != null) {
            c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.page.tab.t.f103210a.a, new TheseusTabPagerService.a(locatableTag));
            aVar.f95167d = null;
        }
        return c1258a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$getNext$1
            if (r0 == 0) goto L27
            r0 = r7
            com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$getNext$1 r0 = (com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$getNext$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L31
        L27:
            com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$getNext$1 r0 = new com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$getNext$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L31:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5d
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L52
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r7 = r0
            goto L82
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r6
            com.bilibili.ship.theseus.playlist.t r0 = r0.f95158r
            com.bilibili.ship.theseus.playlist.u r0 = r0.a()
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = r7
            java.lang.Object r0 = r0.b(r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L82
            r0 = r10
            return r0
        L82:
            r0 = r7
            com.bilibili.ship.theseus.playlist.a r0 = (com.bilibili.ship.theseus.playlist.InterfaceC6214a) r0
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "next of iterator: "
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r0 = r0.toString()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "[theseus-playlist-PlaylistSchedulingService-getNext] "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "PlaylistSchedulingService-getNext"
            r1 = r10
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = r7
            com.bilibili.ship.theseus.playlist.PlaylistRepository$e r0 = com.bilibili.ship.theseus.playlist.D.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c(InterfaceC6214a interfaceC6214a, boolean z6, boolean z7, ContinuationImpl continuationImpl) throws NoWhenBranchMatchedException {
        MutableStateFlow<PlaylistRepository.e> mutableStateFlow;
        Object value;
        Object objA;
        if (Intrinsics.areEqual(interfaceC6214a, InterfaceC6214a.c.f95189a)) {
            BLog.i("PlaylistSchedulingService-handleContinuous", "[theseus-playlist-PlaylistSchedulingService-handleContinuous] no media to schedule, do nothing.");
        } else {
            boolean zAreEqual = Intrinsics.areEqual(interfaceC6214a, InterfaceC6214a.d.f95190a);
            com.bilibili.ship.theseus.keel.player.h hVar = this.f95149i;
            if (zAreEqual) {
                BLog.i("PlaylistSchedulingService-handleContinuous", "[theseus-playlist-PlaylistSchedulingService-handleContinuous] player paused from EndPagePause.");
                hVar.pause();
            } else {
                if (Intrinsics.areEqual(interfaceC6214a, InterfaceC6214a.f.f95192a)) {
                    if (this.f95146e.getState() < 3) {
                        objA = Unit.INSTANCE;
                    } else {
                        BLog.i("PlaylistSchedulingService-rewindCurrent", "[theseus-playlist-PlaylistSchedulingService-rewindCurrent] rewind current media.");
                        hVar.p();
                        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
                        if (jVarJ != null) {
                            objA = jVarJ.a(continuationImpl);
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                        } else {
                            objA = Unit.INSTANCE;
                        }
                    }
                    return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
                }
                int i7 = 99;
                if (!this.f95154n.d() && z6) {
                    i7 = 0;
                }
                PlaylistRepository playlistRepository = this.f95148g;
                playlistRepository.l(i7);
                PlaylistRepository.e eVarB = D.b(interfaceC6214a);
                if (eVarB != null) {
                    do {
                        mutableStateFlow = playlistRepository.f95110r;
                        value = mutableStateFlow.getValue();
                        playlistRepository.j(new C5924i(1, eVarB, (PlaylistRepository.e) value));
                    } while (!mutableStateFlow.compareAndSet(value, eVarB));
                }
                if (z7 || (interfaceC6214a instanceof InterfaceC6214a.e)) {
                    Job job = this.f95162v;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.f95162v = BuildersKt.launch$default(this.f95142a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSchedulingService$scrollToPlayingMedia$1(this, null), 3, (Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.playlist.C6251p r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$keepAutoSchedulingInterceptorRegistration$1
            if (r0 == 0) goto L28
            r0 = r7
            com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$keepAutoSchedulingInterceptorRegistration$1 r0 = (com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$keepAutoSchedulingInterceptorRegistration$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L33
        L28:
            com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$keepAutoSchedulingInterceptorRegistration$1 r0 = new com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$keepAutoSchedulingInterceptorRegistration$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
        L33:
            r0 = r9
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L70
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L59
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.playlist.p r0 = (com.bilibili.ship.theseus.playlist.C6251p) r0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto La0
        L6c:
            r6 = move-exception
            goto Lb3
        L70:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.util.List<com.bilibili.ship.theseus.playlist.p> r0 = r0.f95163w
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r7 = r0
            r0 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r11
            if (r0 != r1) goto La0
            r0 = r11
            return r0
        La0:
            r0 = r6
            r7 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r9 = r0
            r0 = r6
            r7 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r7 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L6c
        Lb3:
            r0 = r5
            java.util.List<com.bilibili.ship.theseus.playlist.p> r0 = r0.f95163w
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1 = r7
            boolean r0 = r0.remove(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService.d(com.bilibili.ship.theseus.playlist.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ev0.g e(MultiTypeMedia multiTypeMedia, Ou0.c cVar) {
        ev0.g gVar = null;
        if (this.f95148g.f95092O) {
            gVar = null;
            if (cVar != null) {
                BusinessType businessTypeA = D.a(multiTypeMedia);
                String str = this.f95150j.a().f123879a;
                String str2 = (multiTypeMedia.t() || multiTypeMedia.f95225M.size() > 1) ? cVar.f18096j : multiTypeMedia.f95247u;
                VideoDimension videoDimension = cVar.f18092e;
                int i7 = videoDimension.f95332a;
                int i8 = i7;
                if (i7 == 0) {
                    i8 = Ou0.a.f18081a.f95332a;
                }
                int i9 = videoDimension.f95333b;
                int i10 = i9;
                if (i9 == 0) {
                    i10 = Ou0.a.f18081a.f95333b;
                }
                gVar = new ev0.g(businessTypeA, cVar.f18088a, cVar.f18089b, str2, cVar.f18095i, cVar.f18101o, new com.bilibili.ship.theseus.united.bean.VideoDimension(i8, i10), multiTypeMedia.t() ? new com.bilibili.ship.theseus.united.bean.d(Long.valueOf(cVar.f18090c), null, Long.valueOf(cVar.f18091d), null, null, 58) : null);
            }
        }
        return gVar;
    }

    public final void f(long j7, long j8, @Nullable ev0.i iVar) {
        Object next;
        Object next2;
        Iterator<T> it = this.f95148g.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((MultiTypeMedia) next).d() == j7) {
                    break;
                }
            }
        }
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) next;
        if (multiTypeMedia == null) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-playlist-PlaylistSchedulingService-play] ", androidx.compose.ui.input.pointer.k.a(j7, "Can not find avid=", " in playlist!"), "PlaylistSchedulingService-play", (Throwable) null);
            return;
        }
        Iterator<T> it2 = multiTypeMedia.f95225M.iterator();
        do {
            next2 = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next2 = it2.next();
            }
        } while (((Ou0.c) next2).f18089b != j8);
        g(this, multiTypeMedia, (Ou0.c) next2, null, iVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r7, boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService.h(boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(boolean r7, boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService.j(boolean, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void l() {
        PlaylistRepository.e eVarC = this.f95148g.c();
        long jD = eVarC.f95137a.d();
        Ou0.c cVar = eVarC.f95138b;
        BLog.i("PlaylistSchedulingService-restoreLastPlayed", "[theseus-playlist-PlaylistSchedulingService-restoreLastPlayed] " + ("Try to restore last played item, avid = " + jD + " cid = " + (cVar != null ? Long.valueOf(cVar.f18089b) : null)));
        n(eVarC);
    }

    public final void n(PlaylistRepository.e eVar) {
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        MultiTypeMedia multiTypeMedia = eVar.f95137a;
        Ou0.c cVar = eVar.f95138b;
        if (cVar == null) {
            BLog.e("PlaylistSchedulingService-tryToSwitchEpisode", "[theseus-playlist-PlaylistSchedulingService-tryToSwitchEpisode] can not switch episode: episode==null", (Throwable) null);
            return;
        }
        BiliAccounts biliAccounts = com.bilibili.ship.theseus.playlist.util.f.f96126a;
        PlaylistRepository.d dVarA = f.a.a(multiTypeMedia, cVar);
        PlaylistRepository playlistRepository = this.f95148g;
        playlistRepository.k(dVarA);
        if (dVarA instanceof PlaylistRepository.d.i) {
            long j7 = cVar.f18088a;
            long j8 = cVar.f18089b;
            this.f95151k.e(new C7893a.C1318a(j7, j8));
            StringBuilder sb = new StringBuilder("try to switch episode, aid = ");
            sb.append(j7);
            defpackage.a.b("[theseus-playlist-PlaylistSchedulingService-tryToSwitchEpisode] ", Ld.c.a(sb, j8, " cid = "), "PlaylistSchedulingService-tryToSwitchEpisode");
            do {
                mutableStateFlow = this.f95157q.f123876a;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C8044b.a((C8044b) value, null, null, null, null, ((com.bilibili.ship.theseus.united.report.b) playlistRepository.f95084G.getValue()).f104838a, 63)));
            this.f95145d.a(m(this, eVar.f95137a, eVar.f95138b, eVar.f95140d, null, 20), eVar.f95139c, null, e(eVar.f95137a, cVar));
        }
    }
}
