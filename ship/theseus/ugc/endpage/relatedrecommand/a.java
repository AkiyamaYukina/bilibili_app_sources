package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/a.class */
public interface a {
    boolean a(@NotNull RelateCard relateCard, boolean z6);

    @Nullable
    RunningUIComponent b(@NotNull RelateCard relateCard, int i7, @NotNull ScreenModeType screenModeType);
}
