package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$jumpToMasterPiece$1.class */
public final class FlattenedPCSFacade$jumpToMasterPiece$1 extends ContinuationImpl {
    int label;
    Object result;
    final FlattenedPCSFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$jumpToMasterPiece$1(FlattenedPCSFacade flattenedPCSFacade, Continuation<? super FlattenedPCSFacade$jumpToMasterPiece$1> continuation) {
        super(continuation);
        this.this$0 = flattenedPCSFacade;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(0L, false, this);
    }
}
