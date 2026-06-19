package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardApiServiceKt$operationCard$1.class */
final class OgvVideoCardApiServiceKt$operationCard$1 extends ContinuationImpl {
    long J$0;
    boolean Z$0;
    int label;
    Object result;

    public OgvVideoCardApiServiceKt$operationCard$1(Continuation<? super OgvVideoCardApiServiceKt$operationCard$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, 0L, 0L, false, null, 0, null, this);
    }
}
