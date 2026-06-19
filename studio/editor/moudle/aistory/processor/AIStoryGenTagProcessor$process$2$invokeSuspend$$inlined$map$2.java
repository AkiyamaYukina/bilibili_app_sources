package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2.class */
public final class AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2 implements Flow<AIStoryFrameBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$1 f105718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AIStoryGenTagProcessor f105719b;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f105720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AIStoryGenTagProcessor f105721b;

        /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2$2$1.class */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            Object result;
            final AnonymousClass2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass2;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, AIStoryGenTagProcessor aIStoryGenTagProcessor) {
            this.f105720a = flowCollector;
            this.f105721b = aIStoryGenTagProcessor;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$2(AIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$1 aIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$1, AIStoryGenTagProcessor aIStoryGenTagProcessor) {
        this.f105718a = aIStoryGenTagProcessor$process$2$invokeSuspend$$inlined$map$1;
        this.f105719b = aIStoryGenTagProcessor;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f105718a.collect(new AnonymousClass2(flowCollector, this.f105719b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
