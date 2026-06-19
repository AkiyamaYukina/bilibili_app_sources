package com.bilibili.ship.theseus.playlist;

import android.view.ViewGroup;
import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initContainerManager$1.class */
final class PlaylistService$initContainerManager$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$initContainerManager$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initContainerManager$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<E.c, Continuation<? super Unit>, Object> {
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

        public final Object invoke(E.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                E.c cVar = (E.c) this.L$0;
                if (cVar == null) {
                    return Unit.INSTANCE;
                }
                FloatLayerManager floatLayerManager = this.this$0.f94952u;
                ViewGroup viewGroup = cVar.f94962a;
                this.label = 1;
                if (floatLayerManager.a(viewGroup, this) == coroutine_suspended) {
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
    public PlaylistService$initContainerManager$1(E e7, Continuation<? super PlaylistService$initContainerManager$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$initContainerManager$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            E e7 = this.this$0;
            Flow<E.c> flow = e7.f94945n;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(e7, null);
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
