package com.bilibili.player.tangram.playercore;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$run$2.class */
final class SequentialPCSPlayable$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    private Object L$0;
    int label;
    final SequentialPCSPlayable this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SequentialPCSPlayable this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$run$2$1$1.class */
        public static final class C05151 extends SuspendLambda implements Function2<v, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SequentialPCSPlayable this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05151(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super C05151> continuation) {
                super(2, continuation);
                this.this$0 = sequentialPCSPlayable;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05151 c05151 = new C05151(this.this$0, continuation);
                c05151.L$0 = obj;
                return c05151;
            }

            public final Object invoke(v vVar, Continuation<? super Unit> continuation) {
                return create(vVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    v vVar = (v) this.L$0;
                    if (vVar != null) {
                        SequentialPCSPlayable sequentialPCSPlayable = this.this$0;
                        this.label = 1;
                        sequentialPCSPlayable.getClass();
                        if (CoroutineScopeKt.coroutineScope(new SequentialPCSPlayable$runPlayable$2(sequentialPCSPlayable, vVar, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sequentialPCSPlayable;
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
                SequentialPCSPlayable sequentialPCSPlayable = this.this$0;
                MutableStateFlow<v> mutableStateFlow = sequentialPCSPlayable.f79431b;
                C05151 c05151 = new C05151(sequentialPCSPlayable, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c05151, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SequentialPCSPlayable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = sequentialPCSPlayable;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SequentialPCSPlayable sequentialPCSPlayable = this.this$0;
                this.label = 1;
                if (SequentialPCSPlayable.M(sequentialPCSPlayable, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$run$2(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super SequentialPCSPlayable$run$2> continuation) {
        super(2, continuation);
        this.this$0 = sequentialPCSPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequentialPCSPlayable$run$2 sequentialPCSPlayable$run$2 = new SequentialPCSPlayable$run$2(this.this$0, continuation);
        sequentialPCSPlayable$run$2.L$0 = obj;
        return sequentialPCSPlayable$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1(this.this$0, null), 1, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass2(this.this$0, null), 1, (Object) null);
            this.label = 1;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
