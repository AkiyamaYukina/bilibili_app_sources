package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.studio.material.util.UtilsKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;
import tv.danmaku.biliplayerv2.service.IPlayerPerformanceListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2.class */
final class PCSPlayableImpl$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    private Object L$0;
    int label;
    final PCSPlayableImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSPlayableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BLog.i("PCSPlayableImpl$run$2$1-invokeSuspend", "[tangram-player-core-PCSPlayableImpl$run$2$1-invokeSuspend] Start collecting FirstFrame event for firstFrameDeferred...");
                final MutableSharedFlow<A> mutableSharedFlow = this.this$0.f79422k;
                Flow<Object> flow = new Flow<Object>(mutableSharedFlow) { // from class: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f79427a;

                    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f79428a;

                        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2$1.class */
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
                            this.f79428a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2$1 r0 = (com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2$1 r0 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1$2$1
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
                                boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.A.c
                                if (r0 == 0) goto L82
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f79428a
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
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$1$invokeSuspend$$inlined$firstIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f79427a = mutableSharedFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f79427a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                Object objFirst = FlowKt.first(flow, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            A.c cVar = (A.c) obj;
            defpackage.a.b("[tangram-player-core-PCSPlayableImpl$run$2$1-invokeSuspend] ", androidx.compose.ui.input.pointer.k.a(cVar.f79328a, "Completing firstFrameDeferred with ", UtilsKt.DOT), "PCSPlayableImpl$run$2$1-invokeSuspend");
            this.this$0.f79424m.complete(Boxing.boxLong(cVar.f79328a));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSPlayableImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PCSPlayableImpl f79429a;

            public a(PCSPlayableImpl pCSPlayableImpl) {
                this.f79429a = pCSPlayableImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit;
                ResolveAndPlayPlayable.c cVar = (ResolveAndPlayPlayable.c) obj;
                boolean z6 = cVar instanceof ResolveAndPlayPlayable.c.a;
                PCSPlayableImpl pCSPlayableImpl = this.f79429a;
                if (z6) {
                    objEmit = pCSPlayableImpl.f79422k.emit(A.e.f79330a, continuation);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = Unit.INSTANCE;
                    }
                } else if (cVar instanceof ResolveAndPlayPlayable.c.C0510c) {
                    objEmit = pCSPlayableImpl.f79422k.emit(A.f.f79331a, continuation);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = Unit.INSTANCE;
                    }
                } else {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSPlayableImpl pCSPlayableImpl = this.this$0;
                ResolveAndPlayPlayable<InterfaceC5778f> resolveAndPlayPlayable = pCSPlayableImpl.f79417e;
                a aVar = new a(pCSPlayableImpl);
                this.label = 1;
                if (resolveAndPlayPlayable.f79303b.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSPlayableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSPlayableImpl pCSPlayableImpl = this.this$0;
                this.label = 1;
                Object objCollect = IPlayerCoreServiceKtxKt.h(pCSPlayableImpl.f79416d).collect(new x(pCSPlayableImpl), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSPlayableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSPlayableImpl pCSPlayableImpl = this.this$0;
                com.bilibili.player.tangram.basic.g gVar = pCSPlayableImpl.f79414b;
                this.label = 1;
                if (gVar.e(pCSPlayableImpl, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$run$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSPlayableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C5776d c5776d = this.this$0.f79419g;
                this.label = 1;
                c5776d.getClass();
                BLog.i("NetworkEnvByPlayCoreImpl-runNetworkCollector", "[tangram-player-core-NetworkEnvByPlayCoreImpl-runNetworkCollector] start play core network collector");
                Object objD = c5776d.d((ContinuationImpl) this);
                if (objD != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objD = Unit.INSTANCE;
                }
                if (objD == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$run$2(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$run$2> continuation) {
        super(2, continuation);
        this.this$0 = pCSPlayableImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSPlayableImpl$run$2 pCSPlayableImpl$run$2 = new PCSPlayableImpl$run$2(this.this$0, continuation);
        pCSPlayableImpl$run$2.L$0 = obj;
        return pCSPlayableImpl$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PCSPlayableImpl pCSPlayableImpl = this.this$0;
                pCSPlayableImpl.f79423l = coroutineScope;
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(pCSPlayableImpl, null), 1, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
                PCSPlayableImpl pCSPlayableImpl2 = this.this$0;
                pCSPlayableImpl2.getClass();
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PCSPlayableImpl$errorEffectOnPlay$1(pCSPlayableImpl2, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PCSPlayableImpl$errorEffectOnPlay$2(pCSPlayableImpl2, null), 3, (Object) null);
                ResolveAndPlayPlayable<InterfaceC5778f> resolveAndPlayPlayable = this.this$0.f79417e;
                this.label = 1;
                if (resolveAndPlayPlayable.D(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            BLog.i("PCSPlayableImpl$run$2-invokeSuspend", "[tangram-player-core-PCSPlayableImpl$run$2-invokeSuspend] Removing playerPerformanceListener.");
            this.this$0.f79416d.setPlayerPerformanceListener((IPlayerPerformanceListener) null);
            throw th;
        }
    }
}
