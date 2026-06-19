package com.bilibili.studio.videoeditor.extension;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/CoroutineScopeExtKt$runAsyncBlock$1.class */
public final class CoroutineScopeExtKt$runAsyncBlock$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final int $concurrency;
    final List<Function1<Continuation<? super T>, Object>> $tasks;
    final CoroutineScope $this_runAsyncBlock;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeExtKt$runAsyncBlock$1(List<? extends Function1<? super Continuation<? super T>, ? extends Object>> list, int i7, CoroutineScope coroutineScope, Continuation<? super CoroutineScopeExtKt$runAsyncBlock$1> continuation) {
        super(2, continuation);
        this.$tasks = list;
        this.$concurrency = i7;
        this.$this_runAsyncBlock = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutineScopeExtKt$runAsyncBlock$1 coroutineScopeExtKt$runAsyncBlock$1 = new CoroutineScopeExtKt$runAsyncBlock$1(this.$tasks, this.$concurrency, this.$this_runAsyncBlock, continuation);
        coroutineScopeExtKt$runAsyncBlock$1.L$0 = obj;
        return coroutineScopeExtKt$runAsyncBlock$1;
    }

    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x017d -> B:23:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.CoroutineScopeExtKt$runAsyncBlock$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
