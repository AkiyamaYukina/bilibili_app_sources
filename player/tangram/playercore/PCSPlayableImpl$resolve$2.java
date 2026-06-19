package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$resolve$2.class */
final class PCSPlayableImpl$resolve$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC5778f>, Object> {
    final Function2<B, Continuation<? super InterfaceC5778f>, Object> $resolver;
    int label;
    final PCSPlayableImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSPlayableImpl$resolve$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$resolve$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super InterfaceC5778f>, Object> {
        final Function2<B, Continuation<? super InterfaceC5778f>, Object> $resolver;
        Object L$0;
        int label;
        final PCSPlayableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super B, ? super Continuation<? super InterfaceC5778f>, ? extends Object> function2, PCSPlayableImpl pCSPlayableImpl, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$resolver = function2;
            this.this$0 = pCSPlayableImpl;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$resolver, this.this$0, continuation);
        }

        public final Object invoke(Continuation<? super InterfaceC5778f> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Function2<B, Continuation<? super InterfaceC5778f>, Object> function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                function2 = this.$resolver;
                PCSPlayableImpl pCSPlayableImpl = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                Object objQ = PCSPlayableImpl.Q(pCSPlayableImpl, null, this, 3);
                obj = objQ;
                if (objQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function2 = (Function2) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            Object objInvoke = function2.invoke(obj, this);
            obj = objInvoke;
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PCSPlayableImpl$resolve$2(Function2<? super B, ? super Continuation<? super InterfaceC5778f>, ? extends Object> function2, PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$resolve$2> continuation) {
        super(1, continuation);
        this.$resolver = function2;
        this.this$0 = pCSPlayableImpl;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PCSPlayableImpl$resolve$2(this.$resolver, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super InterfaceC5778f> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resolver, this.this$0, null);
            this.label = 1;
            tb0.h hVar = y.f79468a;
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PCSPlayableImplKt$resolveWithCorePreparingTask$2(anonymousClass1, null), this);
            obj = objCoroutineScope;
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
