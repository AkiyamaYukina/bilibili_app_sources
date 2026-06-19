package com.bilibili.studio.editor.moudle.aistory.processor;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2.class */
public final class AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f105726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AIStoryGenTagProcessor f105727b;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2 aIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2, Continuation continuation) {
            super(continuation);
            this.this$0 = aIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2(FlowCollector flowCollector, AIStoryGenTagProcessor aIStoryGenTagProcessor) {
        this.f105726a = flowCollector;
        this.f105727b = aIStoryGenTagProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$4$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
