package com.bilibili.ship.theseus.playlist.di.cache;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/PlaylistDummyActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDummyActionDelegate implements yk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f95402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<l> f95403d;

    @Inject
    public PlaylistDummyActionDelegate(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull h hVar, @NotNull Flow<l> flow) {
        this.f95400a = coroutineScope;
        this.f95401b = playlistSchedulingService;
        this.f95402c = hVar;
        this.f95403d = flow;
    }

    @NotNull
    public final StateFlow<PlayNetworkEnv> e() {
        return FlowKt.stateIn(FlowKt.flattenMerge$default(FlowKt.mapLatest(this.f95403d, new PlaylistDummyActionDelegate$getNetworkEnvFlow$1(null)), 0, 1, (Object) null), this.f95400a, SharingStarted.Companion.getEagerly(), PlayNetworkEnv.b.f79289a);
    }

    public final void g() {
        BuildersKt.launch$default(this.f95400a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistDummyActionDelegate$onPlayerPreviousWidgetClick$1(this, null), 3, (Object) null);
    }

    public final void h() {
        BuildersKt.launch$default(this.f95400a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistDummyActionDelegate$onPlayerNextWidgetClick$1(this, null), 3, (Object) null);
    }

    public final boolean i0() {
        return true;
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f95400a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f95402c
            com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L22
            r0 = r3
            com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = r0.f()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L22
            r0 = r3
            java.lang.String r0 = r0.getTitle()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L25
        L22:
            java.lang.String r0 = ""
            r3 = r0
        L25:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.cache.PlaylistDummyActionDelegate.u():java.lang.String");
    }
}
