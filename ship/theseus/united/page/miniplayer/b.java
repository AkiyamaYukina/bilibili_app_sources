package com.bilibili.ship.theseus.united.page.miniplayer;

import Rf0.f;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import c6.P;
import c6.Q;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sv0.C8627a;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b.class */
@StabilityInferred(parameters = 0)
public final class b extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f102049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lifecycle f102050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f102051g;

    @NotNull
    public final IPlayerCoreService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.a f102052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ToolbarMiniPlayerRepository f102053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MiniPlayerBlackListService f102054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final j f102055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository f102056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C8043a f102057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Flow<C8627a> f102058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final IMiniPlayerWindowManager f102059p = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f102060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f102061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f102062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<InterfaceC1071b> f102063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final SharedFlow<InterfaceC1071b> f102064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow f102065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f102066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f102067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Lifecycle.Event f102068y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final c f102069z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102070a;

        public a() {
            this(false);
        }

        public a(boolean z6) {
            this.f102070a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f102070a == ((a) obj).f102070a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102070a);
        }

        @NotNull
        public final String toString() {
            return i.a(new StringBuilder("Initial(disableInnerMiniPlay="), this.f102070a, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b$b.class */
    public interface InterfaceC1071b {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.b$b$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements InterfaceC1071b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f102071a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f102072b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f102073c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f102074d;

            public a(boolean z6, boolean z7, boolean z8, int i7) {
                z6 = (i7 & 2) != 0 ? false : z6;
                z8 = (i7 & 8) != 0 ? false : z8;
                this.f102071a = true;
                this.f102072b = z6;
                this.f102073c = z7;
                this.f102074d = z8;
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean a() {
                return this.f102071a;
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean b() {
                return this.f102072b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f102071a == aVar.f102071a && this.f102072b == aVar.f102072b && this.f102073c == aVar.f102073c && this.f102074d == aVar.f102074d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102074d) + z.a(z.a(Boolean.hashCode(this.f102071a) * 31, 31, this.f102072b), 31, this.f102073c);
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean isPlaying() {
                return this.f102073c;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("LeavePage(autoAccess=");
                sb.append(this.f102071a);
                sb.append(", finishActivity=");
                sb.append(this.f102072b);
                sb.append(", isPlaying=");
                sb.append(this.f102073c);
                sb.append(", toHomePager=");
                return i.a(sb, this.f102074d, ")");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C1072b implements InterfaceC1071b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f102075a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f102076b = true;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f102077c;

            public C1072b(boolean z6) {
                this.f102077c = z6;
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean a() {
                return this.f102075a;
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean b() {
                return this.f102076b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1072b)) {
                    return false;
                }
                C1072b c1072b = (C1072b) obj;
                return this.f102075a == c1072b.f102075a && this.f102076b == c1072b.f102076b && this.f102077c == c1072b.f102077c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102077c) + z.a(Boolean.hashCode(this.f102075a) * 31, 31, this.f102076b);
            }

            @Override // com.bilibili.ship.theseus.united.page.miniplayer.b.InterfaceC1071b
            public final boolean isPlaying() {
                return this.f102077c;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("UserClick(autoAccess=");
                sb.append(this.f102075a);
                sb.append(", finishActivity=");
                sb.append(this.f102076b);
                sb.append(", isPlaying=");
                return i.a(sb, this.f102077c, ")");
            }
        }

        boolean a();

        boolean b();

        boolean isPlaying();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/b$c.class */
    public static final class c implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102078a;

        public c(b bVar) {
            this.f102078a = bVar;
        }

        @Override // Rf0.f.a
        public final void onNegativeClick() {
            Neurons.reportClick(false, "app.miniplayer.permission-floating-window.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "0"), TuplesKt.to("spmid", this.f102078a.f102057n.a().f123880b)}));
        }

        @Override // Rf0.f.a
        public final void onPositiveClick() {
            Neurons.reportClick(false, "app.miniplayer.permission-floating-window.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "1"), TuplesKt.to("spmid", this.f102078a.f102057n.a().f123880b)}));
        }

        @Override // Rf0.f.a
        public final void onShow() {
            Neurons.reportExposure$default(false, "app.miniplayer.permission-floating-window.0.show", MapsKt.mapOf(TuplesKt.to("spmid", this.f102078a.f102057n.a().f123880b)), (List) null, 8, (Object) null);
        }
    }

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull Lifecycle lifecycle, @NotNull h hVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.a aVar, @NotNull ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, @NotNull MiniPlayerBlackListService miniPlayerBlackListService, @NotNull j jVar, @NotNull FullScreenThreePointEventRepository fullScreenThreePointEventRepository, @NotNull C8043a c8043a, @NotNull Flow<C8627a> flow) {
        this.f102048d = coroutineScope;
        this.f102049e = componentActivity;
        this.f102050f = lifecycle;
        this.f102051g = hVar;
        this.h = iPlayerCoreService;
        this.f102052i = aVar;
        this.f102053j = toolbarMiniPlayerRepository;
        this.f102054k = miniPlayerBlackListService;
        this.f102055l = jVar;
        this.f102056m = fullScreenThreePointEventRepository;
        this.f102057n = c8043a;
        this.f102058o = flow;
        MutableSharedFlow<InterfaceC1071b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f102063t = mutableSharedFlowMutableSharedFlow$default;
        this.f102064u = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f102065v = this.f129911c;
        this.f102069z = new c(this);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$collectQualityParamsScreenState$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$calculateEnterMiniPlayer$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$collectToolBarClick$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$collectBackAction$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$observerLifecycle$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$observerLifecycle$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$observerLifecycle$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$collectFullScreenThreePointClick$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMiniPlayerService$collectHalfScreenThreePointClick$1(this, null), 3, (Object) null);
    }

    public static final void c(b bVar) {
        bVar.getClass();
        boolean zB = Rf0.f.b();
        com.bilibili.ship.theseus.united.page.miniplayer.a aVar = bVar.f102052i;
        boolean zD = aVar.d();
        boolean zC = com.bilibili.ship.theseus.united.page.miniplayer.a.c();
        boolean z6 = bVar.f102067x;
        boolean z7 = bVar.f102066w;
        boolean zE = aVar.e();
        StringBuilder sbA = Q.a("permission: ", ", spEnableInnerAutoMiniPlay: ", ", spEnableAutoMiniPlay: ", zB, zD);
        P.a(", isPlaying: ", ", isCovered: ", sbA, zC, z6);
        defpackage.a.b("[theseus-united-DetailMiniPlayerService-logAutoMiniPlayerCheck] ", com.bilibili.bplus.im.protobuf.b.b(sbA, z7, "autoMiniSuppress: ", zE), "DetailMiniPlayerService-logAutoMiniPlayerCheck");
    }

    public final boolean d() {
        return ((Boolean) this.f102065v.getValue()).booleanValue();
    }

    public final void e(@NotNull InterfaceC1071b.C1072b c1072b) {
        boolean zBooleanValue = ((Boolean) this.f129911c.getValue()).booleanValue();
        ComponentActivity componentActivity = this.f102049e;
        if (zBooleanValue) {
            q.c(componentActivity.getString(2131847485));
        } else if (!Rf0.f.b()) {
            Rf0.f.a(componentActivity, null, null, null, this.f102069z);
        } else {
            this.f102061r = true;
            this.f102063t.tryEmit(c1072b);
        }
    }
}
