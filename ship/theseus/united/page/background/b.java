package com.bilibili.ship.theseus.united.page.background;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/b.class */
public interface b {
    long a(@NotNull PlayViewUniteReply playViewUniteReply);

    @Nullable
    Object b(@NotNull Continuation<? super GeminiCommonPlayableParams> continuation);
}
