package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.c;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/D.class */
public final class D {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int a(@NotNull com.bilibili.player.tangram.basic.c cVar) throws NoWhenBranchMatchedException {
        int i7;
        if (cVar instanceof c.a) {
            i7 = 0;
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i7 = ((c.b) cVar).f79322a;
        }
        return i7;
    }
}
