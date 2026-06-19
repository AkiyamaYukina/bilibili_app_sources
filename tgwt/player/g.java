package com.bilibili.tgwt.player;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.PlayerParamsV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/g.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class g implements Factory<PlayerParamsV2> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/g$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f111550a = new Object();
    }

    public final Object get() {
        PlayerParamsV2 playerParamsV2 = new PlayerParamsV2();
        playerParamsV2.setPlayerDataSource(new com.bilibili.bangumi.logic.page.detail.playerdatasource.a());
        playerParamsV2.getConfig().setInitialControlContainerType(ControlContainerType.NONE);
        playerParamsV2.getConfig().setUpdateVideoRenderViewPortEnable(true);
        playerParamsV2.getConfig().setControlContainerShowForever(false);
        playerParamsV2.getConfig().setControlContainerInheritsVisibility(true);
        return (PlayerParamsV2) Preconditions.checkNotNullFromProvides(playerParamsV2);
    }
}
