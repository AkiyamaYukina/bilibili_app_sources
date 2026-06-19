package com.bilibili.studio.videoeditor.extension;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/CoroutineScopeExtKt$runAsyncBlock$1$res$1.class */
public final class CoroutineScopeExtKt$runAsyncBlock$1$res$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final int $cur;
    final List<Function1<Continuation<? super T>, Object>> $tasks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeExtKt$runAsyncBlock$1$res$1(List<? extends Function1<? super Continuation<? super T>, ? extends Object>> list, int i7, Continuation<? super CoroutineScopeExtKt$runAsyncBlock$1$res$1> continuation) {
        super(2, continuation);
        this.$tasks = list;
        this.$cur = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineScopeExtKt$runAsyncBlock$1$res$1(this.$tasks, this.$cur, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super T>, Object> function1 = this.$tasks.get(this.$cur);
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            obj = objInvoke;
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
