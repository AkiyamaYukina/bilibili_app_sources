package com.bilibili.topix.detail;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2.class */
public final class BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f112648a;

    /* JADX INFO: renamed from: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2 baseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2, Continuation continuation) {
            super(continuation);
            this.this$0 = baseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector) {
        this.f112648a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
