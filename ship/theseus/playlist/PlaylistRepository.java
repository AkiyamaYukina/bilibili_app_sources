package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService;
import com.bilibili.ship.theseus.playlist.util.f;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.videoplayer.coreV2.VideoBizType;
import vl0.C8833a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository.class */
@StabilityInferred(parameters = 0)
public final class PlaylistRepository {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public static final e f95077Q = new e(new MultiTypeMedia(0, null, null, null, 0, null, 0, 0, 0, 0, null, 0, null, 0, 0, null, 0, null, null, 0, null, 0, null, false, false, 0, null, null, false, 0.0d, null, null, false, false, false, false, null, 0, null, 0, -1, 255), null, 14);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f95078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f95079B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f95080C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<d> f95081D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final StateFlow<d> f95082E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.ship.theseus.united.report.b> f95083F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.ship.theseus.united.report.b> f95084G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f95085H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f95086I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f95087J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f95088K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f95089L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f95090M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f95091N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f95092O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f95093P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f95095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f95096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f95097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f95098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f95100g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlaylistInfo> f95101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<PlaylistInfo> f95102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlaylistOrderEnum> f95103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<PlaylistOrderEnum> f95104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f95105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f95106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<MultiTypeMedia>> f95107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<MultiTypeMedia>> f95108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f95109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<e> f95110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<e> f95111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OfflineDanmakuInputService.a> f95112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StateFlow<OfflineDanmakuInputService.a> f95113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f95114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f95115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f95116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f95117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f95118z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f95120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f95122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f95123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f95125g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f95126i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f95127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f95128k;

        public a(int i7, long j7, int i8, boolean z6, int i9, int i10, boolean z7, boolean z8, boolean z9, @NotNull String str, @NotNull String str2) {
            this.f95119a = i7;
            this.f95120b = j7;
            this.f95121c = i8;
            this.f95122d = z6;
            this.f95123e = i9;
            this.f95124f = i10;
            this.f95125g = z7;
            this.h = z8;
            this.f95126i = z9;
            this.f95127j = str;
            this.f95128k = str2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95131c;

        public b() {
            this(false, true, true);
        }

        public b(boolean z6, boolean z7, boolean z8) {
            this.f95129a = z6;
            this.f95130b = z7;
            this.f95131c = z8;
        }

        public static b a(b bVar, boolean z6, boolean z7, boolean z8, int i7) {
            if ((i7 & 1) != 0) {
                z6 = bVar.f95129a;
            }
            if ((i7 & 2) != 0) {
                z7 = bVar.f95130b;
            }
            if ((i7 & 4) != 0) {
                z8 = bVar.f95131c;
            }
            bVar.getClass();
            return new b(z6, z7, z8);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f95129a == bVar.f95129a && this.f95130b == bVar.f95130b && this.f95131c == bVar.f95131c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95131c) + androidx.compose.animation.z.a(Boolean.hashCode(this.f95129a) * 31, 31, this.f95130b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadState(loading=");
            sb.append(this.f95129a);
            sb.append(", hasPrePage=");
            sb.append(this.f95130b);
            sb.append(", hasNextPage=");
            return androidx.appcompat.app.i.a(sb, this.f95131c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$c.class */
    public interface c {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final MultiTypeMedia f95132a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f95133b;

            public a(@NotNull MultiTypeMedia multiTypeMedia, boolean z6) {
                this.f95132a = multiTypeMedia;
                this.f95133b = z6;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$c$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final MultiTypeMedia f95134a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f95135b;

            public b(@NotNull MultiTypeMedia multiTypeMedia, boolean z6) {
                this.f95134a = multiTypeMedia;
                this.f95135b = z6;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d.class */
    @StabilityInferred(parameters = 0)
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95136a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c extends d {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistRepository$d$d, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$d.class */
        @StabilityInferred(parameters = 0)
        public static final class C0769d extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$e.class */
        @StabilityInferred(parameters = 0)
        public static final class e extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$f.class */
        @StabilityInferred(parameters = 0)
        public static final class f extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$g.class */
        @StabilityInferred(parameters = 0)
        public static final class g extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$h.class */
        @StabilityInferred(parameters = 0)
        public static final class h extends d {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$d$i.class */
        @StabilityInferred(parameters = 0)
        public static final class i extends d {
        }

        public d(MultiTypeMedia multiTypeMedia) {
            this.f95136a = multiTypeMedia;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Ou0.c f95138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final ev0.l f95139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final ev0.i f95140d;

        public /* synthetic */ e(MultiTypeMedia multiTypeMedia, Ou0.c cVar, int i7) {
            this(multiTypeMedia, (i7 & 2) != 0 ? multiTypeMedia.b() : cVar, null, null);
        }

        public e(@NotNull MultiTypeMedia multiTypeMedia, @Nullable Ou0.c cVar, @Nullable ev0.l lVar, @Nullable ev0.i iVar) {
            this.f95137a = multiTypeMedia;
            this.f95138b = cVar;
            this.f95139c = lVar;
            this.f95140d = iVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f95137a, eVar.f95137a) && Intrinsics.areEqual(this.f95138b, eVar.f95138b) && Intrinsics.areEqual(this.f95139c, eVar.f95139c) && Intrinsics.areEqual(this.f95140d, eVar.f95140d);
        }

        public final int hashCode() {
            int iHashCode = this.f95137a.hashCode();
            int iHashCode2 = 0;
            Ou0.c cVar = this.f95138b;
            int iHashCode3 = cVar == null ? 0 : cVar.hashCode();
            ev0.l lVar = this.f95139c;
            int iHashCode4 = lVar == null ? 0 : lVar.hashCode();
            ev0.i iVar = this.f95140d;
            if (iVar != null) {
                iHashCode2 = iVar.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            return "PlayingMedia(media=" + this.f95137a + ", episode=" + this.f95138b + ", sharedPlayData=" + this.f95139c + ", landingPosition=" + this.f95140d + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$f.class */
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95141a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlaylistOrderEnum.LATEST_PUBLISH.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f95141a = iArr;
        }
    }

    @Inject
    public PlaylistRepository(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistInfo playlistInfo, @NotNull List<MultiTypeMedia> list, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull a aVar, @NotNull PageReportService pageReportService) {
        PlaylistOrderEnum playlistOrderEnum;
        this.f95094a = coroutineScope;
        this.f95095b = c8043a;
        this.f95096c = hVar;
        this.f95097d = aVar;
        this.f95098e = pageReportService;
        boolean zAreEqual = Intrinsics.areEqual(aVar.f95127j, "publish_play");
        this.f95099f = zAreEqual;
        String str = aVar.f95128k;
        this.f95100g = str;
        this.h = Intrinsics.areEqual(str, "default_and_auto_fold");
        MutableStateFlow<PlaylistInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(playlistInfo);
        this.f95101i = MutableStateFlow;
        this.f95102j = FlowKt.asStateFlow(MutableStateFlow);
        boolean z6 = aVar.f95122d;
        int i7 = aVar.f95121c;
        if (zAreEqual) {
            playlistOrderEnum = i7 == 2 ? PlaylistOrderEnum.MOST_PLAY : PlaylistOrderEnum.LATEST_PUBLISH;
        } else {
            playlistOrderEnum = aVar.f95125g ? !z6 : z6 ? PlaylistOrderEnum.NORMAL : PlaylistOrderEnum.REVERSE;
        }
        MutableStateFlow<PlaylistOrderEnum> MutableStateFlow2 = StateFlowKt.MutableStateFlow(playlistOrderEnum);
        this.f95103k = MutableStateFlow2;
        this.f95104l = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f95105m = MutableStateFlow3;
        this.f95106n = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<MultiTypeMedia>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(list);
        this.f95107o = MutableStateFlow4;
        this.f95108p = FlowKt.asStateFlow(MutableStateFlow4);
        this.f95109q = a(list);
        MutableStateFlow<e> MutableStateFlow5 = StateFlowKt.MutableStateFlow(f95077Q);
        this.f95110r = MutableStateFlow5;
        this.f95111s = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<OfflineDanmakuInputService.a> MutableStateFlow6 = StateFlowKt.MutableStateFlow((Object) null);
        this.f95112t = MutableStateFlow6;
        this.f95113u = FlowKt.asStateFlow(MutableStateFlow6);
        MutableSharedFlow<c> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95114v = mutableSharedFlowMutableSharedFlow$default;
        this.f95115w = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95116x = mutableSharedFlowMutableSharedFlow$default2;
        this.f95117y = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f95118z = MutableStateFlow7;
        this.f95078A = FlowKt.asStateFlow(MutableStateFlow7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95079B = mutableSharedFlowMutableSharedFlow$default3;
        this.f95080C = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableStateFlow<d> MutableStateFlow8 = StateFlowKt.MutableStateFlow(new d(new MultiTypeMedia(0, null, null, null, 0, null, 0L, 0, 0L, 0, null, 0, null, 0L, 0, null, 0L, null, null, 0L, null, 0, null, false, false, 0, null, null, false, 0.0d, null, null, false, false, false, false, null, 0, null, 0, -1, 255)));
        this.f95081D = MutableStateFlow8;
        this.f95082E = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<com.bilibili.ship.theseus.united.report.b> MutableStateFlow9 = StateFlowKt.MutableStateFlow(new com.bilibili.ship.theseus.united.report.b(0));
        this.f95083F = MutableStateFlow9;
        this.f95084G = FlowKt.asStateFlow(MutableStateFlow9);
        boolean z7 = aVar.f95126i;
        this.f95085H = z7 ? 99999999L : aVar.f95120b;
        this.f95086I = i7;
        int i8 = aVar.f95119a;
        this.f95087J = i8;
        this.f95088K = z6;
        this.f95089L = aVar.f95123e;
        this.f95090M = aVar.f95124f;
        this.f95091N = aVar.h;
        this.f95092O = z7;
        this.f95093P = i8 == 3;
    }

    public static boolean a(List list) {
        boolean z6;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z6 = true;
        } else {
            Iterator it = list2.iterator();
            loop0: while (true) {
                z6 = true;
                if (!it.hasNext()) {
                    break;
                }
                MultiTypeMedia multiTypeMedia = (MultiTypeMedia) it.next();
                List<Ou0.c> list3 = multiTypeMedia.f95225M;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (Ou0.c cVar : list3) {
                        BiliAccounts biliAccounts = com.bilibili.ship.theseus.playlist.util.f.f96126a;
                        if (f.a.a(multiTypeMedia, cVar) instanceof d.i) {
                            z6 = false;
                            break loop0;
                        }
                    }
                }
            }
        }
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(com.bilibili.ship.theseus.playlist.PlaylistOrderEnum r3, int r4) throws kotlin.NoWhenBranchMatchedException {
        /*
            int[] r0 = com.bilibili.ship.theseus.playlist.PlaylistRepository.f.f95141a
            r1 = r3
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = 1
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L53
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L4d
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L3e
            r0 = r7
            r1 = 4
            if (r0 == r1) goto L39
            r0 = r7
            r1 = 5
            if (r0 != r1) goto L31
            r0 = r6
            r5 = r0
            goto L53
        L31:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L39:
            r0 = 3
            r5 = r0
            goto L53
        L3e:
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L48
            r0 = r6
            r5 = r0
            goto L53
        L48:
            r0 = 2
            r5 = r0
            goto L53
        L4d:
            r0 = r4
            if (r0 != 0) goto L48
            r0 = r6
            r5 = r0
        L53:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistRepository.g(com.bilibili.ship.theseus.playlist.PlaylistOrderEnum, int):int");
    }

    @NotNull
    public final List<GeminiCommonPlayableParams> b() {
        Video.PlayableParams playableParams;
        com.bilibili.ship.theseus.keel.player.j jVarJ = this.f95096c.j();
        if (jVarJ != null) {
            Video.PlayableParams playableParamsF = jVarJ.f();
            if (playableParamsF != null) {
                ArrayList arrayList = new ArrayList();
                for (MultiTypeMedia multiTypeMedia : d()) {
                    for (Ou0.c cVar : multiTypeMedia.f95225M) {
                        BiliAccounts biliAccounts = com.bilibili.ship.theseus.playlist.util.f.f96126a;
                        if (f.a.a(multiTypeMedia, cVar) instanceof d.i) {
                            boolean zT = multiTypeMedia.t();
                            PageReportService pageReportService = this.f95098e;
                            C8043a c8043a = this.f95095b;
                            String str = multiTypeMedia.f95233f;
                            boolean z6 = multiTypeMedia.f95219G;
                            if (zT) {
                                long j7 = cVar.f18091d;
                                long cid = playableParamsF.getCid();
                                long j8 = cVar.f18089b;
                                long j9 = cVar.f18090c;
                                if (cid == j8) {
                                    playableParams = playableParamsF;
                                } else {
                                    Video.PlayableParams geminiCommonPlayableParams = new GeminiCommonPlayableParams();
                                    geminiCommonPlayableParams.setAvid(cVar.f18088a);
                                    geminiCommonPlayableParams.setBvId(multiTypeMedia.f());
                                    geminiCommonPlayableParams.setEpIdForReport(j7);
                                    geminiCommonPlayableParams.setSeasonId(j9);
                                    geminiCommonPlayableParams.setCid(j8);
                                    geminiCommonPlayableParams.setTitle(cVar.f18096j);
                                    geminiCommonPlayableParams.setSmallWindow(true);
                                    geminiCommonPlayableParams.setFromSpmid(playableParamsF.getSpmid());
                                    geminiCommonPlayableParams.setSpmid(playableParamsF.getSpmid());
                                    geminiCommonPlayableParams.setTrackId(playableParamsF.getTrackId());
                                    geminiCommonPlayableParams.setCover(str);
                                    geminiCommonPlayableParams.setFromScene(playableParamsF.getFromScene());
                                    geminiCommonPlayableParams.setDisplayRotate(1 / cVar.f18092e.a());
                                    geminiCommonPlayableParams.setPlayStatus("1");
                                    geminiCommonPlayableParams.setType(4);
                                    geminiCommonPlayableParams.setFrom(z6 ? "downloaded" : "bangumi");
                                    geminiCommonPlayableParams.setFromAutoPlay(c8043a.a().f123885g);
                                    playableParams = geminiCommonPlayableParams;
                                }
                                Video.PlayableParams playableParams2 = playableParams;
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put("report_flow_data", c8043a.a().f123884f);
                                mapCreateMapBuilder.putAll(pageReportService.f102492e);
                                playableParams2.setLegacyExtra(MapsKt.build(mapCreateMapBuilder));
                                playableParams2.setExtraJsonParams(MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("from_outer_spmid", c8043a.a().f123883e), TuplesKt.to("material_no", "0")}));
                                playableParams2.setExtraContentForResolve(MapsKt.mapOf(new Pair[]{TuplesKt.to("ep_id", String.valueOf(j7)), TuplesKt.to("season_id", String.valueOf(j9)), TuplesKt.to("inline_scene", InlineScene.UNKNOWN.toString()), TuplesKt.to("is_need_view_info", "true"), TuplesKt.to("is_preview", "0"), TuplesKt.to("SMALL_WINDOW", "true"), TuplesKt.to("material_no", "0"), TuplesKt.to("WAS_HE_INLINE", "false"), TuplesKt.to("security_level", C8833a.a()), TuplesKt.to("not_support_drm_type", C8833a.f128290b)}));
                                playableParams2.setBizType(VideoBizType.PGC);
                                playableParams2.setForceLocalOnly(z6);
                                playableParams2.setNeedResolveFromLocalCache(z6);
                                arrayList.add(playableParams2);
                            } else if (multiTypeMedia.u()) {
                                GeminiCommonPlayableParams geminiCommonPlayableParams2 = new GeminiCommonPlayableParams();
                                geminiCommonPlayableParams2.setAvid(cVar.f18088a);
                                geminiCommonPlayableParams2.setBvId(multiTypeMedia.f());
                                geminiCommonPlayableParams2.setTitle(cVar.f18096j);
                                geminiCommonPlayableParams2.setCover(str);
                                geminiCommonPlayableParams2.setSmallWindow(true);
                                geminiCommonPlayableParams2.setSpmid(playableParamsF.getSpmid());
                                geminiCommonPlayableParams2.setFromSpmid(playableParamsF.getSpmid());
                                geminiCommonPlayableParams2.setTrackId(playableParamsF.getTrackId());
                                geminiCommonPlayableParams2.setFromScene(playableParamsF.getFromScene());
                                geminiCommonPlayableParams2.setDisplayRotate(1 / cVar.f18092e.a());
                                geminiCommonPlayableParams2.setType(10);
                                geminiCommonPlayableParams2.setPlayType("3");
                                geminiCommonPlayableParams2.setPlayStatus("1");
                                VideoBizType videoBizType = VideoBizType.PUGV;
                                geminiCommonPlayableParams2.setBizType(videoBizType);
                                geminiCommonPlayableParams2.setFrom(z6 ? "downloaded" : "pugv");
                                geminiCommonPlayableParams2.setFromAutoPlay(c8043a.a().f123885g);
                                geminiCommonPlayableParams2.setEpIdForReport(cVar.f18091d);
                                geminiCommonPlayableParams2.setSeasonId(cVar.f18090c);
                                geminiCommonPlayableParams2.setCid(cVar.f18089b);
                                Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                                mapCreateMapBuilder2.put("biz_type", "3");
                                mapCreateMapBuilder2.put("security_level", C8833a.a());
                                geminiCommonPlayableParams2.setExtraContentForResolve(MapsKt.build(mapCreateMapBuilder2));
                                Map mapCreateMapBuilder3 = MapsKt.createMapBuilder();
                                mapCreateMapBuilder3.putAll(pageReportService.f102492e);
                                geminiCommonPlayableParams2.setLegacyExtra(MapsKt.build(mapCreateMapBuilder3));
                                geminiCommonPlayableParams2.setBizType(videoBizType);
                                geminiCommonPlayableParams2.setForceLocalOnly(z6);
                                geminiCommonPlayableParams2.setNeedResolveFromLocalCache(z6);
                                arrayList.add(geminiCommonPlayableParams2);
                            } else {
                                GeminiCommonPlayableParams geminiCommonPlayableParams3 = new GeminiCommonPlayableParams();
                                geminiCommonPlayableParams3.setAvid(cVar.f18088a);
                                geminiCommonPlayableParams3.setCid(cVar.f18089b);
                                geminiCommonPlayableParams3.setTitle(multiTypeMedia.f95225M.size() > 1 ? cVar.f18096j : multiTypeMedia.f95247u);
                                geminiCommonPlayableParams3.setDisplayRotate(1.0f / cVar.f18092e.a());
                                geminiCommonPlayableParams3.setFromSpmid(playableParamsF.getSpmid());
                                geminiCommonPlayableParams3.setSpmid(playableParamsF.getSpmid());
                                geminiCommonPlayableParams3.setTrackId(playableParamsF.getTrackId());
                                geminiCommonPlayableParams3.setFrom(z6 ? "downloaded" : "vupload");
                                geminiCommonPlayableParams3.setCover(str);
                                geminiCommonPlayableParams3.setFromScene(playableParamsF.getFromScene());
                                geminiCommonPlayableParams3.setFromAutoPlay(c8043a.a().f123885g);
                                Map mapCreateMapBuilder4 = MapsKt.createMapBuilder();
                                mapCreateMapBuilder4.put("report_flow_data", c8043a.a().f123884f);
                                mapCreateMapBuilder4.putAll(pageReportService.f102492e);
                                geminiCommonPlayableParams3.setLegacyExtra(MapsKt.build(mapCreateMapBuilder4));
                                geminiCommonPlayableParams3.setBizType(VideoBizType.UGC);
                                geminiCommonPlayableParams3.setForceLocalOnly(z6);
                                geminiCommonPlayableParams3.setNeedResolveFromLocalCache(z6);
                                arrayList.add(geminiCommonPlayableParams3);
                            }
                        }
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final e c() {
        return (e) this.f95111s.getValue();
    }

    @NotNull
    public final List<MultiTypeMedia> d() {
        return (List) this.f95108p.getValue();
    }

    @NotNull
    public final PlaylistInfo e() {
        return (PlaylistInfo) this.f95102j.getValue();
    }

    @NotNull
    public final PlaylistOrderEnum f() {
        return (PlaylistOrderEnum) this.f95104l.getValue();
    }

    public final String h(int i7, int i8, long j7) {
        return LJ0.c.a(LogReportStrategy.TAG_DEFAULT, "music").path("playlist/playpage/" + this.f95085H).appendQueryParameter("page_type", String.valueOf(i7)).appendQueryParameter("from_spmid", this.f95095b.a().f123881c).appendQueryParameter("oid", String.valueOf(j7)).appendQueryParameter("otype", String.valueOf(i8)).build().toString();
    }

    public final void i(@NotNull List<MultiTypeMedia> list) {
        this.f95107o.setValue(list);
        BuildersKt.launch$default(this.f95094a, Dispatchers.getDefault(), (CoroutineStart) null, new PlaylistRepository$updateMediaList$1(this, list, null), 2, (Object) null);
    }

    public final void j(@NotNull Function1<? super List<MultiTypeMedia>, ? extends List<MultiTypeMedia>> function1) {
        MutableStateFlow<List<MultiTypeMedia>> mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.f95107o;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, function1.invoke(value)));
    }

    public final void k(@NotNull d dVar) {
        MutableStateFlow<d> mutableStateFlow;
        Object value;
        d dVar2;
        do {
            mutableStateFlow = this.f95081D;
            value = mutableStateFlow.getValue();
            dVar2 = (d) value;
            if (!(dVar2 instanceof d.e)) {
                dVar2 = dVar;
            }
        } while (!mutableStateFlow.compareAndSet(value, dVar2));
    }

    public final void l(int i7) {
        this.f95083F.setValue(new com.bilibili.ship.theseus.united.report.b(i7));
    }
}
