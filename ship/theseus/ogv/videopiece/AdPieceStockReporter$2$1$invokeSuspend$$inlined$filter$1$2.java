package com.bilibili.ship.theseus.ogv.videopiece;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2.class */
public final class AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f94792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdPieceStockReporter f94793b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2 adPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2, Continuation continuation) {
            super(continuation);
            this.this$0 = adPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2(FlowCollector flowCollector, AdPieceStockReporter adPieceStockReporter) {
        this.f94792a = flowCollector;
        this.f94793b = adPieceStockReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
