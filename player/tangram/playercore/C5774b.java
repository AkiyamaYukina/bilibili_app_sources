package com.bilibili.player.tangram.playercore;

import com.bilibili.lib.media.resource.PlayIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/b.class */
public final class C5774b {
    @Nullable
    public static final com.bilibili.player.tangram.basic.a a(@NotNull PlayIndex playIndex) {
        int i7;
        com.bilibili.player.tangram.basic.a aVar;
        int i8 = playIndex.mQuality;
        if (i8 <= 0) {
            aVar = null;
        } else {
            if (i8 < 0) {
                i7 = 0;
            } else {
                i7 = i8;
                if (i8 == 15) {
                    i7 = 16;
                }
            }
            aVar = new com.bilibili.player.tangram.basic.a(i7);
        }
        return aVar;
    }
}
