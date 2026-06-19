package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.A;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;
import tv.danmaku.biliplayerv2.service.J;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2.class */
final class PCSFacadeImpl$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final long $realTargetPosition;
    final boolean $seeksAccurately;
    private Object L$0;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
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
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                this.label = 1;
                pCSFacadeImpl.getClass();
                Object objJ = IPlayerCoreServiceKtxKt.j(pCSFacadeImpl.f79384a, new i(pCSFacadeImpl), this);
                if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objJ = Unit.INSTANCE;
                }
                if (objJ == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $realTargetPosition;
        final boolean $seeksAccurately;
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PCSFacadeImpl pCSFacadeImpl, long j7, boolean z6, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
            this.$realTargetPosition = j7;
            this.$seeksAccurately = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$realTargetPosition, this.$seeksAccurately, continuation);
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
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                long j7 = this.$realTargetPosition;
                boolean z6 = this.$seeksAccurately;
                this.label = 1;
                if (PCSFacadeImpl.s(pCSFacadeImpl, j7, z6, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
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
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                this.label = 1;
                Object objCollect = pCSFacadeImpl.f79386c.f().collect(new j(pCSFacadeImpl), this);
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PCSFacadeImpl f79408a;

            public a(PCSFacadeImpl pCSFacadeImpl) {
                this.f79408a = pCSFacadeImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                J j7 = (J) obj;
                this.f79408a.f79389f.invoke(new A.b(j7.a, j7.b));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
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
                Flow flowD = IPlayerCoreServiceKtxKt.d(this.this$0.f79384a);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowD.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$run$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$run$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
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
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                this.label = 1;
                pCSFacadeImpl.getClass();
                Object objCollect = FlowKt.onEach(FlowKt.asFlow(new IntRange(1, Integer.MAX_VALUE)), new PCSFacadeImpl$collectPosition$2(null)).collect(new l(pCSFacadeImpl), this);
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
    public PCSFacadeImpl$run$2(PCSFacadeImpl pCSFacadeImpl, long j7, boolean z6, Continuation<? super PCSFacadeImpl$run$2> continuation) {
        super(2, continuation);
        this.this$0 = pCSFacadeImpl;
        this.$realTargetPosition = j7;
        this.$seeksAccurately = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$run$2 pCSFacadeImpl$run$2 = new PCSFacadeImpl$run$2(this.this$0, this.$realTargetPosition, this.$seeksAccurately, continuation);
        pCSFacadeImpl$run$2.L$0 = obj;
        return pCSFacadeImpl$run$2;
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
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1(this.this$0, null), 1, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass2(this.this$0, this.$realTargetPosition, this.$seeksAccurately, null), 1, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
    }
}
