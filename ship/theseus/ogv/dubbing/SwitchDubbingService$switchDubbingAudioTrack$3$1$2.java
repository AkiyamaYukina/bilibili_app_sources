package com.bilibili.ship.theseus.ogv.dubbing;

import com.bilibili.player.tangram.playercore.A;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$2.class */
public final class SwitchDubbingService$switchDubbingAudioTrack$3$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$switchDubbingAudioTrack$3$1$2(q qVar, Continuation<? super SwitchDubbingService$switchDubbingAudioTrack$3$1$2> continuation) {
        super(1, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SwitchDubbingService$switchDubbingAudioTrack$3$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<A> flowV = this.this$0.f91895k.v();
            Flow<Object> flow = new Flow<Object>(flowV) { // from class: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f91833a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f91834a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f91834a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r9 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L82
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.A.b
                            if (r0 == 0) goto L82
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f91834a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L82
                            r0 = r10
                            return r0
                        L82:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$2$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f91833a = flowV;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f91833a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (FlowKt.first(flow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        q qVar = this.this$0;
        q.a(qVar, qVar.h.getString(2131855526));
        return Unit.INSTANCE;
    }
}
