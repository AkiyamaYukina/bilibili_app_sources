package com.bilibili.ship.theseus.ogv.restrictionlayer;

import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ogv.infra.coroutine.b;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2.class */
final class OgvRestrictionLayerDriver$handleVideoForbidden$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final OgvRestrictionLayerDriver this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvRestrictionLayerDriver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, Continuation<AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvRestrictionLayerDriver;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            OgvRestrictionLayerDriver ogvRestrictionLayerDriver;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ogvRestrictionLayerDriver = this.this$0;
                final StateFlow<ExtraInfo> stateFlow = ogvRestrictionLayerDriver.f94425b;
                Flow<RestrictionLayerVo> flow = new Flow<RestrictionLayerVo>(stateFlow) { // from class: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f94431a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f94432a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f94432a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1$2$1
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
                                goto L94
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
                                com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L7a
                                tb0.h r0 = vv0.d.f128457e
                                r1 = r6
                                java.lang.Object r0 = r0.a(r1)
                                com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo) r0
                                r6 = r0
                                goto L7c
                            L7a:
                                r0 = 0
                                r6 = r0
                            L7c:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f94432a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L94
                                r0 = r9
                                return r0
                            L94:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f94431a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f94431a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = ogvRestrictionLayerDriver;
                this.label = 1;
                Object objA = b.a(flow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
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
                ogvRestrictionLayerDriver = (OgvRestrictionLayerDriver) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            RestrictionLayerVo restrictionLayerVoA = OgvRestrictionLayerDriver.a(ogvRestrictionLayerDriver, (RestrictionLayerVo) obj);
            OgvRestrictionLayerDriver ogvRestrictionLayerDriver2 = this.this$0;
            G g7 = ogvRestrictionLayerDriver2.f94426c;
            String str = ogvRestrictionLayerDriver2.f94428e.f94465r;
            this.L$0 = null;
            this.label = 2;
            if (G.c(g7, restrictionLayerVoA, true, false, str, false, null, this, 52) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvRestrictionLayerDriver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, Continuation<AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvRestrictionLayerDriver;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<ExtraInfo> stateFlow = this.this$0.f94425b;
                Flow<s> flow = new Flow<s>(stateFlow) { // from class: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f94433a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f94434a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f94434a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1$2$1
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
                                goto L94
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
                                com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L7a
                                tb0.h r0 = Ju0.a.f11701i
                                r1 = r6
                                java.lang.Object r0 = r0.a(r1)
                                com.bilibili.ship.theseus.united.page.restrictionlayer.s r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.s) r0
                                r6 = r0
                                goto L7c
                            L7a:
                                r0 = 0
                                r6 = r0
                            L7c:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f94434a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L94
                                r0 = r9
                                return r0
                            L94:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$handleVideoForbidden$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f94433a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f94433a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                Object objA = b.a(flow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            s sVar = (s) obj;
            s sVarA = sVar;
            if (sVar instanceof P) {
                sVarA = P.a((P) sVar, "united.player-video-detail.auto-pay.0.0", null, true, 13);
            }
            this.this$0.f94429f.a(sVarA);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvRestrictionLayerDriver$handleVideoForbidden$2(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, Continuation<OgvRestrictionLayerDriver$handleVideoForbidden$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvRestrictionLayerDriver;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvRestrictionLayerDriver$handleVideoForbidden$2 ogvRestrictionLayerDriver$handleVideoForbidden$2 = new OgvRestrictionLayerDriver$handleVideoForbidden$2(this.this$0, continuation);
        ogvRestrictionLayerDriver$handleVideoForbidden$2.L$0 = obj;
        return ogvRestrictionLayerDriver$handleVideoForbidden$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
    }
}
