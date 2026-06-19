package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/A.class */
public interface A {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/A$a.class */
    public interface a {
        @NotNull
        A a(@NotNull CoroutineScope coroutineScope, @NotNull PlayViewUniteReply playViewUniteReply);
    }

    @NotNull
    z a();
}
