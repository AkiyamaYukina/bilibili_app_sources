package com.bilibili.mini.player.biz;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/DefaultMiniPlayerBizManager$getNextPlayableParamsInternal$1.class */
final class DefaultMiniPlayerBizManager$getNextPlayableParamsInternal$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMiniPlayerBizManager$getNextPlayableParamsInternal$1(b bVar, Continuation<? super DefaultMiniPlayerBizManager$getNextPlayableParamsInternal$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.j(this.this$0, this);
    }
}
