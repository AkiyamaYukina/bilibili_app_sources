package com.bilibili.ship.theseus.playlist.di.driver;

import androidx.compose.runtime.internal.StabilityInferred;
import ev0.C7013f;
import ev0.InterfaceC7008a;
import ev0.g;
import ev0.h;
import ev0.j;
import ev0.l;
import javax.inject.Inject;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a.class */
@StabilityInferred(parameters = 0)
public final class a implements j, InterfaceC7008a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8043a f95467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<InterfaceC0778a> f95468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<InterfaceC0778a> f95469c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a$a.class */
    public interface InterfaceC0778a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0779a implements InterfaceC0778a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0779a f95470a = new Object();

            @NotNull
            public final String toString() {
                return "play list leave media scope";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.a$a$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements InterfaceC0778a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final j.a f95471a;

            public b(@NotNull j.a aVar) {
                this.f95471a = aVar;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.a$a$c */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements InterfaceC0778a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f95472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final h f95473b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final l f95474c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final g f95475d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f95476e;

            public c(@NotNull InterfaceC7008a.C1258a c1258a, @Nullable h hVar, @Nullable l lVar, @Nullable g gVar, boolean z6) {
                this.f95472a = c1258a;
                this.f95473b = hVar;
                this.f95474c = lVar;
                this.f95475d = gVar;
                this.f95476e = z6;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.a$a$d */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/a$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d implements InterfaceC0778a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f95477a = new Object();

            @NotNull
            public final String toString() {
                return "play list view reload";
            }
        }
    }

    @Inject
    public a(@NotNull C8043a c8043a) {
        this.f95467a = c8043a;
        MutableSharedFlow<InterfaceC0778a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 5, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f95468b = mutableSharedFlowMutableSharedFlow$default;
        this.f95469c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // ev0.InterfaceC7008a
    public final void a() {
        BLog.i("PlayListShellDriver-reloadView", "[theseus-playlist-detail-PlayListShellDriver-reloadView] play list driver shell reload view");
        this.f95468b.tryEmit(InterfaceC0778a.d.f95477a);
    }

    @Override // ev0.InterfaceC7008a
    public final void d(@NotNull InterfaceC7008a.C1258a c1258a, @Nullable h hVar, @Nullable l lVar, @Nullable g gVar, boolean z6, int i7) {
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        com.bilibili.ship.theseus.united.report.b bVarB;
        BLog.i("PlayListShellDriver-switchToNewVideo-PSWufow", "[theseus-playlist-detail-PlayListShellDriver-switchToNewVideo-PSWufow] play list driver shell switch new video");
        do {
            mutableStateFlow = this.f95467a.f123876a;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C8044b.a((C8044b) value, null, null, null, null, (lVar == null || (bVarB = C7013f.b(lVar)) == null) ? i7 : bVarB.f104838a, 63)));
        this.f95468b.tryEmit(new InterfaceC0778a.c(c1258a, hVar, lVar, gVar, z6));
    }

    @Override // ev0.j
    public final void f() {
        BLog.i("PlayListShellDriver-leaveMediaScope", "[theseus-playlist-detail-PlayListShellDriver-leaveMediaScope] play list driver shell leave media scope");
        this.f95468b.tryEmit(InterfaceC0778a.C0779a.f95470a);
    }

    @Override // ev0.j
    public final void g(@NotNull j.a aVar) {
        BLog.i("PlayListShellDriver-switchMediaScope", "[theseus-playlist-detail-PlayListShellDriver-switchMediaScope] play list driver shell switch media scope");
        this.f95468b.tryEmit(new InterfaceC0778a.b(aVar));
    }
}
