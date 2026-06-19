package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/w.class */
public interface w {
    @NotNull
    TheseusInteractVideoService a(@NotNull GeminiCommonPlayableParams geminiCommonPlayableParams, @Nullable PlayViewUniteReply playViewUniteReply, @NotNull Function2<? super com.bilibili.ship.theseus.keel.player.j, ? super Continuation<? super Unit>, ? extends Object> function2);
}
