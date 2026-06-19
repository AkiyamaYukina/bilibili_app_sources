package com.bilibili.ship.theseus.united.page.playview;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playview/PlayViewRepository$requestPlayView$1.class */
final class PlayViewRepository$requestPlayView$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayViewRepository$requestPlayView$1(d dVar, Continuation<? super PlayViewRepository$requestPlayView$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = this.this$0.a(0L, null, 0L, null, null, null, null, null, 0L, null, null, 0, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
