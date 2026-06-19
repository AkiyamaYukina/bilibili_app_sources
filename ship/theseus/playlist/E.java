package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.uicomponent.C6257f;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E.class */
@StabilityInferred(parameters = 0)
public final class E extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f94937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlaylistLoadService f94938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6241f f94939g;

    @NotNull
    public final y h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f94940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f94941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final t f94942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageReportService f94943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f94944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<c> f94945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f94946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Context f94947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f94948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PlaylistErrorStateService f94949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f94950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f94951t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final FloatLayerManager f94952u = new FloatLayerManager();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f94953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f94954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f94955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f94956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public Job f94957z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f94958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f94959b;

        public a(@NotNull b bVar, boolean z6) {
            this.f94958a = z6;
            this.f94959b = bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f94960a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -311570018;
            }

            @NotNull
            public final String toString() {
                return "Expand";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.E$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0762b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0762b f94961a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0762b);
            }

            public final int hashCode() {
                return -239890258;
            }

            @NotNull
            public final String toString() {
                return "Hidden";
            }
        }

        default boolean isExpanded() {
            return this instanceof a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f94962a;

        public c(@NotNull ViewGroup viewGroup) {
            this.f94962a = viewGroup;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/E$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94963a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.LATEST_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f94963a = iArr;
        }
    }

    @Inject
    public E(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull C6241f c6241f, @NotNull y yVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull t tVar, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull Flow<c> flow, @NotNull a aVar, @NotNull Context context, @NotNull FragmentActivity fragmentActivity, @NotNull PlaylistErrorStateService playlistErrorStateService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f94936d = coroutineScope;
        this.f94937e = playlistRepository;
        this.f94938f = playlistLoadService;
        this.f94939g = c6241f;
        this.h = yVar;
        this.f94940i = theseusFloatLayerService;
        this.f94941j = playlistSchedulingService;
        this.f94942k = tVar;
        this.f94943l = pageReportService;
        this.f94944m = gVar;
        this.f94945n = flow;
        this.f94946o = aVar;
        this.f94947p = context;
        this.f94948q = fragmentActivity;
        this.f94949r = playlistErrorStateService;
        this.f94950s = aVar2;
        this.f94951t = cVar;
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(aVar.f94959b);
        this.f94953v = MutableStateFlow;
        StateFlow<b> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.f94954w = stateFlowAsStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f94955x = MutableStateFlow2;
        StateFlow<Integer> stateFlowAsStateFlow2 = FlowKt.asStateFlow(MutableStateFlow2);
        this.f94956y = stateFlowAsStateFlow2;
        boolean z6 = playlistRepository.f95099f;
        StringBuilder sb = new StringBuilder("PlaylistService init, initialUIState=");
        b bVar = aVar.f94959b;
        sb.append(bVar);
        sb.append(", isSortWayPublishPlay=");
        sb.append(z6);
        BLog.i("PlaylistService-<init>", "[theseus-playlist-PlaylistService-<init>] " + sb.toString());
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initContainerManager$1(this, null), 3, (Object) null);
        StateFlow<PlaylistRepository.e> stateFlow = playlistRepository.f95111s;
        StateFlow<PlaylistInfo> stateFlow2 = playlistRepository.f95102j;
        boolean z7 = playlistRepository.f95092O;
        if (!z7) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initFloatingTitle$1(this, new C6257f(new C6257f.a(FlowKt.combine(stateFlow2, stateFlow, new PlaylistService$initFloatingTitle$floatingTitle$1(null)), FlowKt.combine(this.f129911c, stateFlowAsStateFlow, new PlaylistService$initFloatingTitle$floatingTitle$2(null)), stateFlowAsStateFlow2), new A8.h(this, 4)), null), 3, (Object) null);
        }
        com.bilibili.ship.theseus.playlist.uicomponent.D d7 = new com.bilibili.ship.theseus.playlist.uicomponent.D(new D.g(FlowKt.combine(stateFlow2, stateFlow, playlistRepository.f95104l, playlistRepository.f95106n, new PlaylistService$initPlaylist$component$1(this, null)), FlowKt.mapLatest(playlistRepository.f95108p, new PlaylistService$initPlaylist$component$2(this, null)), playlistLoadService.f95050g, stateFlowAsStateFlow, playlistRepository.f95080C, aVar2.f102939c, introContentSizeRepository.f100020a, playlistRepository.f95087J, !z7));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$1(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$2(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$3(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$4(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$5(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initPlaylist$6(this, d7, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$collectOfflineEffect$1(d7, this, null), 3, (Object) null);
        if (!z7 && !Intrinsics.areEqual(bVar, b.C0762b.f94961a)) {
            this.f94957z = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$initAutoHideJob$1(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$lockRatioIfNeeded$1(this, null), 3, (Object) null);
        if (playlistRepository.h) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$collectScreenState$1(this, null), 3, (Object) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.playlist.E r6, com.bilibili.ship.theseus.playlist.uicomponent.D r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$1
            if (r0 == 0) goto L30
            r0 = r8
            com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$1 r0 = (com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L30
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L3a
        L30:
            com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$1 r0 = new com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L3a:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L66
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L88
        L66:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$2 r0 = new com.bilibili.ship.theseus.playlist.PlaylistService$collectBottomSheetActionEffect$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L88
            r0 = r10
            return r0
        L88:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.E.c(com.bilibili.ship.theseus.playlist.E, com.bilibili.ship.theseus.playlist.uicomponent.D, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void d(E e7) {
        if (e7.f94937e.h) {
            Job job = e7.f94957z;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            e7.f94957z = BuildersKt.launch$default(e7.f94936d, (CoroutineContext) null, (CoroutineStart) null, new PlaylistService$startAutoHideJob$1(e7, null), 3, (Object) null);
        }
    }
}
