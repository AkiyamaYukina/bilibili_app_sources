package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.PlayNextOperationAction;
import com.bilibili.ship.theseus.united.page.restrictionlayer.t;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/a.class */
public final class a implements t<PlayNextOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaylistSchedulingService f95397a;

    public a(PlaylistSchedulingService playlistSchedulingService) {
        this.f95397a = playlistSchedulingService;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(PlayNextOperationAction playNextOperationAction) {
        PlayNextOperationAction playNextOperationAction2 = playNextOperationAction;
        StringBuilder sbA = z.a(playNextOperationAction2.f102624a, "playNext action: aid=", ", cid=");
        sbA.append(playNextOperationAction2.f102625b);
        defpackage.a.b("[theseus-playlist-PlayListUGCCustomizedOperationActionHandlerModule$playNext$$inlined$OperationActionHandler$1-handle] ", sbA.toString(), "PlayListUGCCustomizedOperationActionHandlerModule$playNext$$inlined$OperationActionHandler$1-handle");
        this.f95397a.f(playNextOperationAction2.f102624a, playNextOperationAction2.f102625b, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<PlayNextOperationAction> b() {
        return PlayNextOperationAction.class;
    }
}
