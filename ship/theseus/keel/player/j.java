package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.playercore.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/j.class */
public interface j extends v {
    @Nullable
    Fragment O();

    void P(boolean z6);

    @Nullable
    Object a(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    GeminiCommonPlayableParams f();

    @NotNull
    Flow<PlayViewUniteReply> g();

    void j(@NotNull GeminiCommonPlayableParams geminiCommonPlayableParams);

    @NotNull
    StateFlow<GeminiCommonPlayableParams> l();

    @NotNull
    default WithVideoProgress p() {
        return this;
    }

    boolean z();
}
