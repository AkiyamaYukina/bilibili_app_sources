package com.bilibili.studio.editor.moudle.intelligence.frame;

import com.bilibili.commons.tuple.Pair;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rz0.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/FrameUtils$getMultipleFramesSync$1$1$1.class */
public final class FrameUtils$getMultipleFramesSync$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<File, Boolean>>, Object> {
    final i $frameTask;
    final Pair<Long, Integer> $pair;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameUtils$getMultipleFramesSync$1$1$1(i iVar, Pair<Long, Integer> pair, Continuation<? super FrameUtils$getMultipleFramesSync$1$1$1> continuation) {
        super(2, continuation);
        this.$frameTask = iVar;
        this.$pair = pair;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrameUtils$getMultipleFramesSync$1$1$1(this.$frameTask, this.$pair, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<File, Boolean>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        i iVar = this.$frameTask;
        Long l7 = (Long) this.$pair.getLeft();
        long jLongValue = l7 != null ? l7.longValue() : -1L;
        Integer num = (Integer) this.$pair.getRight();
        return iVar.e(num != null ? num.intValue() : -1, jLongValue, "");
    }
}
