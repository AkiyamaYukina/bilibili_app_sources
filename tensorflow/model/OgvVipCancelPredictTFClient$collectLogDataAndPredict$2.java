package com.bilibili.tensorflow.model;

import com.bilibili.lib.neuron.internal.model.NeuronEvent;
import com.bilibili.tensorflow.utils.CoroutineUtilsKt;
import ed0.f;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2.class */
public final class OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<T> f110761a = (OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<T>) new Object();

    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends Integer>>>, Object> {
        final com.bilibili.tensorflow.utils.c $filterHelper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.tensorflow.utils.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$filterHelper = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$filterHelper, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<Integer>>> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            f.b();
            final MutableSharedFlow<NeuronEvent> mutableSharedFlow = CoroutineUtilsKt.f110812a;
            final com.bilibili.tensorflow.utils.c cVar = this.$filterHelper;
            return new Flow<List<? extends Integer>>(mutableSharedFlow, cVar) { // from class: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MutableSharedFlow f110762a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.tensorflow.utils.c f110763b;

                /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f110764a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final com.bilibili.tensorflow.utils.c f110765b;

                    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector, com.bilibili.tensorflow.utils.c cVar) {
                        this.f110764a = flowCollector;
                        this.f110765b = cVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 274
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f110762a = mutableSharedFlow;
                    this.f110763b = cVar;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f110762a.collect(new AnonymousClass2(flowCollector, this.f110763b), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = OgvVipCancelPredictTFClient.f110759f;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$collectLogDataAndPredict$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MappedByteBuffer f110766a;

        public a(MappedByteBuffer mappedByteBuffer) {
            this.f110766a = mappedByteBuffer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0188  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #0 {Exception -> 0x0086, blocks: (B:13:0x007e, B:17:0x0093, B:48:0x0192, B:19:0x00a3, B:42:0x0158, B:21:0x00b3, B:35:0x0112, B:37:0x0118, B:52:0x01c8, B:53:0x01d3, B:22:0x00bb, B:29:0x00e9, B:31:0x0104, B:25:0x00d3), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8 A[Catch: Exception -> 0x0086, TRY_ENTER, TryCatch #0 {Exception -> 0x0086, blocks: (B:13:0x007e, B:17:0x0093, B:48:0x0192, B:19:0x00a3, B:42:0x0158, B:21:0x00b3, B:35:0x0112, B:37:0x0118, B:52:0x01c8, B:53:0x01d3, B:22:0x00bb, B:29:0x00e9, B:31:0x0104, B:25:0x00d3), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Boolean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2.emit(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
