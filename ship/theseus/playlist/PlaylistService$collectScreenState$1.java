package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectScreenState$1.class */
final class PlaylistService$collectScreenState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectScreenState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectScreenState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final E this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(E e7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = e7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((c.a) this.L$0).f102988b) {
                this.this$0.f94953v.setValue(E.b.C0762b.f94961a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectScreenState$1(E e7, Continuation<? super PlaylistService$collectScreenState$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$collectScreenState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowC = this.this$0.f94951t.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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
