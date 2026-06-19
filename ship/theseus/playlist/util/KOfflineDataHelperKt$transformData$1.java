package com.bilibili.ship.theseus.playlist.util;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/KOfflineDataHelperKt$transformData$1.class */
final class KOfflineDataHelperKt$transformData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    Object result;

    public KOfflineDataHelperKt$transformData$1(Continuation<? super KOfflineDataHelperKt$transformData$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KOfflineDataHelperKt.b(null, this);
    }
}
