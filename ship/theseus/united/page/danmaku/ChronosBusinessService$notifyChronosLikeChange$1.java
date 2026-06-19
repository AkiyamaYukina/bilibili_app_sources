package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.ShipChainChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosLikeChange$1.class */
final class ChronosBusinessService$notifyChronosLikeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChronosBusinessService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosLikeChange$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChronosBusinessService chronosBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(Long l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long l7 = (Long) this.L$0;
            long jLongValue = l7 != null ? l7.longValue() : 0L;
            ShipChainChange.Request request = new ShipChainChange.Request();
            request.setLikeNum(Boxing.boxLong(jLongValue));
            IRemoteHandler remoteHandler = this.this$0.f99336g.getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.updateRelationshipChainChanged(request);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$notifyChronosLikeChange$1(ChronosBusinessService chronosBusinessService, Continuation<? super ChronosBusinessService$notifyChronosLikeChange$1> continuation) {
        super(2, continuation);
        this.this$0 = chronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChronosBusinessService$notifyChronosLikeChange$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final StateFlow<StatData> stateFlow = this.this$0.f99339k.f104004m;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Long>(stateFlow) { // from class: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f99361a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f99362a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f99362a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1$2$1
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
                            goto L91
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            com.bilibili.ship.theseus.united.page.view.StatData r0 = (com.bilibili.ship.theseus.united.page.view.StatData) r0
                            r6 = r0
                            r0 = r6
                            if (r0 == 0) goto L77
                            r0 = r6
                            long r0 = r0.f104022d
                            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                            r6 = r0
                            goto L79
                        L77:
                            r0 = 0
                            r6 = r0
                        L79:
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f99362a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto L91
                            r0 = r9
                            return r0
                        L91:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$notifyChronosLikeChange$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f99361a = stateFlow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f99361a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
