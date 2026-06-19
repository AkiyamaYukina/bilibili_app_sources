package com.bilibili.ship.theseus.ugc.play.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/media/d.class */
public interface d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/media/d$a.class */
    public interface a {
        @NotNull
        d a(@NotNull CoroutineScope coroutineScope, @NotNull PlayViewUniteReply playViewUniteReply);
    }

    @NotNull
    c a();
}
