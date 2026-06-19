package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$newFacade$1.class */
final class FlattenedPCSFacade$newFacade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $index;
    int label;
    final FlattenedPCSFacade this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$newFacade$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$newFacade$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlattenedPCSFacade.c, Continuation<? super Boolean>, Object> {
        final int $index;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$index = i7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(FlattenedPCSFacade.c cVar, Continuation<? super Boolean> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FlattenedPCSFacade.c cVar = (FlattenedPCSFacade.c) this.L$0;
            boolean z6 = false;
            if (cVar != null) {
                z6 = false;
                if (cVar.f79380a == this.$index) {
                    z6 = true;
                }
            }
            return Boxing.boxBoolean(z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$newFacade$1(FlattenedPCSFacade flattenedPCSFacade, int i7, Continuation<? super FlattenedPCSFacade$newFacade$1> continuation) {
        super(2, continuation);
        this.this$0 = flattenedPCSFacade;
        this.$index = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlattenedPCSFacade$newFacade$1(this.this$0, this.$index, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<FlattenedPCSFacade.c> mutableStateFlow = this.this$0.f79363m;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, null);
            this.label = 1;
            if (FlowKt.first(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
            ResultKt.throwOnFailure(obj);
        }
        Deferred<Unit> deferred = this.this$0.f79360j;
        this.label = 2;
        if (deferred.await(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
