package com.bilibili.player.tangram.basic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$2.class */
final class ResolveAndPlayPlayable$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ResolveAndPlayPlayable<e> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = resolveAndPlayPlayable;
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
                ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
                d dVar = resolveAndPlayPlayable.f79302a;
                this.label = 1;
                if (dVar.o(resolveAndPlayPlayable, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ResolveAndPlayPlayable<e> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = resolveAndPlayPlayable;
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
                ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
                this.label = 1;
                resolveAndPlayPlayable.getClass();
                Object objCollectLatest = FlowKt.collectLatest(resolveAndPlayPlayable.f79303b, new ResolveAndPlayPlayable$runInnerPlayerWhenReady$2(resolveAndPlayPlayable, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ResolveAndPlayPlayable<e> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = resolveAndPlayPlayable;
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
                ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.receiveAsFlow(resolveAndPlayPlayable.f79306e), new ResolveAndPlayPlayable$receiveSeekingActions$2(resolveAndPlayPlayable, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$run$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ResolveAndPlayPlayable<e> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = resolveAndPlayPlayable;
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
                ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
                this.label = 1;
                Object objCollect = FlowKt.receiveAsFlow(resolveAndPlayPlayable.f79307f).collect(new h(resolveAndPlayPlayable), this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$run$2(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$run$2> continuation) {
        super(2, continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResolveAndPlayPlayable$run$2 resolveAndPlayPlayable$run$2 = new ResolveAndPlayPlayable$run$2(this.this$0, continuation);
        resolveAndPlayPlayable$run$2.L$0 = obj;
        return resolveAndPlayPlayable$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
