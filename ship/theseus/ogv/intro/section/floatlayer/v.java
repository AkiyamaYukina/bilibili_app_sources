package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.ship.theseus.ogv.season.NewestEp;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonRights;
import com.bilibili.ship.theseus.ogv.season.Publish;
import com.bilibili.ship.theseus.ogv.season.TestSwitch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/v.class */
public interface v {
    @Nullable
    NewestEp a();

    @NotNull
    TestSwitch b();

    @NotNull
    com.bilibili.ogv.pub.season.a c();

    @NotNull
    Publish getPublish();

    @NotNull
    OgvSeasonRights getRights();

    long getSeasonId();
}
