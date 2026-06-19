package com.bilibili.player.tangram.playercore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$awaitAssetUpdateRequest$1.class */
final class PCSFacadeImpl$awaitAssetUpdateRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PCSFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$awaitAssetUpdateRequest$1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$awaitAssetUpdateRequest$1> continuation) {
        super(continuation);
        this.this$0 = pCSFacadeImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PCSFacadeImpl.e(this.this$0, null, this);
    }
}
