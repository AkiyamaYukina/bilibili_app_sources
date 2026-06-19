package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoNextInfo;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1.class */
public final class PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1 implements AutoContinuousInterceptService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f94998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8043a f94999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaylistSchedulingService f95000c;

    public PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1(t tVar, C8043a c8043a, PlaylistSchedulingService playlistSchedulingService) {
        this.f94998a = tVar;
        this.f94999b = c8043a;
        this.f95000c = playlistSchedulingService;
    }

    @Override // com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.a
    public final void a(AutoNextInfo autoNextInfo, boolean z6) {
        this.f95000c.f(autoNextInfo.f98166k, autoNextInfo.f98167l, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object next(kotlin.coroutines.Continuation<? super com.bilibili.ship.theseus.ugc.play.schedule.AutoNextInfo> r18) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1.next(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
