package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$handleNotSupport$2;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/r.class */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaylistRepository.d f95832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f95833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaylistErrorStateService f95834c;

    public /* synthetic */ r(PlaylistRepository.d dVar, CoroutineScope coroutineScope, PlaylistErrorStateService playlistErrorStateService) {
        this.f95832a = dVar;
        this.f95833b = coroutineScope;
        this.f95834c = playlistErrorStateService;
    }

    public final Object invoke() {
        return PlaylistErrorStateService$handleNotSupport$2.AnonymousClass1.invokeSuspend$lambda$1(this.f95832a, this.f95833b, this.f95834c);
    }
}
