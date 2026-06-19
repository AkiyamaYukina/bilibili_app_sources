package com.bilibili.playerbizcommonv2.utils;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/PlayerExtensionsKt$suspendRunCatching$1.class */
final class PlayerExtensionsKt$suspendRunCatching$1<T> extends ContinuationImpl {
    int label;
    Object result;

    public PlayerExtensionsKt$suspendRunCatching$1(Continuation<? super PlayerExtensionsKt$suspendRunCatching$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objL = p.l(null, this);
        return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : Result.box-impl(objL);
    }
}
