package com.bilibili.music.podcast.legacy.contribute;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/RemoteContributeDataSource$getContributeList$1.class */
final class RemoteContributeDataSource$getContributeList$1 extends ContinuationImpl {
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteContributeDataSource$getContributeList$1(a aVar, Continuation<? super RemoteContributeDataSource$getContributeList$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(0, 0, 0, 0, 0, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
