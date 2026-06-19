package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.page.playingarea.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectViews$1.class */
final class PlayingAreaCompoundServiceImpl$collectViews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectViews$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectViews$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                a.c cVar = (a.c) this.L$0;
                if (cVar == null) {
                    return Unit.INSTANCE;
                }
                PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                this.label = 1;
                playingAreaCompoundServiceImpl.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlayingAreaCompoundServiceImpl$collectContainerRatio$2(playingAreaCompoundServiceImpl, cVar, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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
    public PlayingAreaCompoundServiceImpl$collectViews$1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$collectViews$1> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayingAreaCompoundServiceImpl$collectViews$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
            Flow<a.c> flow = playingAreaCompoundServiceImpl.f102315l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingAreaCompoundServiceImpl, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
