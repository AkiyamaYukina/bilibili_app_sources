package com.bilibili.ship.theseus.cheese.player.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/e.class */
public interface e {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/e$a.class */
    public interface a {
        @NotNull
        e a(@NotNull CoroutineScope coroutineScope, @NotNull PlayViewUniteReply playViewUniteReply);
    }

    @NotNull
    d a();
}
