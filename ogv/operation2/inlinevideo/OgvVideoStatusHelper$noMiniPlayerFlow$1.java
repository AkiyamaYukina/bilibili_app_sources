package com.bilibili.ogv.operation2.inlinevideo;

import com.bilibili.mini.player.common.manager.MiniScreenPlayerCloseEvent;
import com.bilibili.mini.player.common.manager.MiniScreenPlayerOpenEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper$noMiniPlayerFlow$1.class */
public final class OgvVideoStatusHelper$noMiniPlayerFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final OgvVideoStatusHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoStatusHelper$noMiniPlayerFlow$1(OgvVideoStatusHelper ogvVideoStatusHelper, Continuation<? super OgvVideoStatusHelper$noMiniPlayerFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoStatusHelper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVideoStatusHelper$noMiniPlayerFlow$1 ogvVideoStatusHelper$noMiniPlayerFlow$1 = new OgvVideoStatusHelper$noMiniPlayerFlow$1(this.this$0, continuation);
        ogvVideoStatusHelper$noMiniPlayerFlow$1.L$0 = obj;
        return ogvVideoStatusHelper$noMiniPlayerFlow$1;
    }

    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.this$0.d());
            this.L$0 = flowCollector2;
            this.label = 1;
            flowCollector = flowCollector2;
            if (flowCollector2.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        final Flow flowMerge = FlowKt.merge(new Flow[]{com.bilibili.ogv.infra.violet.c.a(MiniScreenPlayerCloseEvent.class), com.bilibili.ogv.infra.violet.c.a(MiniScreenPlayerOpenEvent.class)});
        final OgvVideoStatusHelper ogvVideoStatusHelper = this.this$0;
        Flow<Boolean> flow = new Flow<Boolean>(flowMerge, ogvVideoStatusHelper) { // from class: com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Flow f70901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final OgvVideoStatusHelper f70902b;

            /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final FlowCollector f70903a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final OgvVideoStatusHelper f70904b;

                /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, OgvVideoStatusHelper ogvVideoStatusHelper) {
                    this.f70903a = flowCollector;
                    this.f70904b = ogvVideoStatusHelper;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L8f
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f70903a
                        r10 = r0
                        r0 = r6
                        com.bilibili.bus.IData r0 = (com.bilibili.bus.IData) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper r0 = r0.f70904b
                        boolean r0 = r0.d()
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r10
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L8f
                        r0 = r9
                        return r0
                    L8f:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.OgvVideoStatusHelper$noMiniPlayerFlow$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f70901a = flowMerge;
                this.f70902b = ogvVideoStatusHelper;
            }

            public Object collect(FlowCollector flowCollector4, Continuation continuation) {
                Object objCollect = this.f70901a.collect(new AnonymousClass2(flowCollector4, this.f70902b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
