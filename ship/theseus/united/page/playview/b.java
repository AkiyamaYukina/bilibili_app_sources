package com.bilibili.ship.theseus.united.page.playview;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playview/b.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata
public final class b implements Factory<com.bilibili.ship.theseus.united.player.mediaplay.c> {
    public static com.bilibili.ship.theseus.united.player.mediaplay.c a(PlayViewUniteReply playViewUniteReply) {
        return (com.bilibili.ship.theseus.united.player.mediaplay.c) Preconditions.checkNotNullFromProvides(a.b(playViewUniteReply));
    }
}
