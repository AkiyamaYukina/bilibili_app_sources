package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.PlayConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    @NotNull
    public static PlayConfig a() {
        PlayConfig playConfig = new PlayConfig();
        playConfig.a = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.BACKGROUNDPLAY);
        playConfig.b = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.FLIPCONF);
        playConfig.c = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.CASTCONF);
        playConfig.d = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.FEEDBACK);
        playConfig.e = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.SUBTITLE);
        playConfig.f = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.PLAYBACKRATE);
        playConfig.g = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.TIMEUP);
        playConfig.h = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.PLAYBACKMODE);
        playConfig.i = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.SCALEMODE);
        playConfig.j = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.LIKE);
        playConfig.k = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.DISLIKE);
        playConfig.l = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.COIN);
        playConfig.m = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.CHARGE);
        playConfig.n = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.SHARE);
        playConfig.o = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.SNAPSHOT);
        playConfig.z = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.INNERDANMAKUSETTINGSWITCH);
        playConfig.q = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.LOCKSCREEN);
        playConfig.r = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.RECOMMEND);
        playConfig.s = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.PLAYBACKSPEED);
        playConfig.t = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.QUALITY);
        playConfig.u = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.PAGES);
        playConfig.v = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.NEXT);
        playConfig.w = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.DANMAKU);
        playConfig.B = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.TOGETHERWATCHENTER);
        playConfig.C = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.TOGETHERWATCHFULLENTER);
        playConfig.D = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.DOLBY);
        playConfig.F = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.SKIP_HEAD_TAIL);
        playConfig.G = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.COLORFILTER);
        playConfig.p = new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.SCREENRECORD);
        playConfig.x = new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.MINIPLAYER);
        return playConfig;
    }
}
