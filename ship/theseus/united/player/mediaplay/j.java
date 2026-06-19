package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bilibili.player.tangram.basic.c;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/j.class */
public final class j {
    @NotNull
    public static final com.bilibili.player.tangram.basic.c a() {
        int i7;
        com.bilibili.player.tangram.basic.c bVar;
        if (PlayerSettingHelper.isQualityAutoSwitch()) {
            bVar = c.a.f79321a;
        } else {
            int defaultQuality = PlayerSettingHelper.getDefaultQuality();
            if (defaultQuality < 0) {
                i7 = 0;
            } else {
                i7 = defaultQuality;
                if (defaultQuality == 15) {
                    i7 = 16;
                }
            }
            bVar = new c.b(i7);
        }
        return bVar;
    }
}
