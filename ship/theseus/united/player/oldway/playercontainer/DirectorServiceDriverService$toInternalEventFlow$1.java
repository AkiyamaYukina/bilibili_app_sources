package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.player.tangram.playercore.A;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$toInternalEventFlow$1.class */
final class DirectorServiceDriverService$toInternalEventFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableSharedFlow<k.c> $flow;
    final com.bilibili.ship.theseus.keel.player.j $playable;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$toInternalEventFlow$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableSharedFlow<k.c> f104759a;

        public a(MutableSharedFlow<k.c> mutableSharedFlow) {
            this.f104759a = mutableSharedFlow;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit;
            com.bilibili.player.tangram.playercore.A a7 = (com.bilibili.player.tangram.playercore.A) obj;
            boolean z6 = a7 instanceof A.e;
            MutableSharedFlow<k.c> mutableSharedFlow = this.f104759a;
            if (z6) {
                objEmit = mutableSharedFlow.emit(new k.c.b(CollectionsKt.emptyList()), continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
            } else if (a7 instanceof A.f) {
                objEmit = mutableSharedFlow.emit(k.c.c.a, continuation);
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
    public DirectorServiceDriverService$toInternalEventFlow$1(com.bilibili.ship.theseus.keel.player.j jVar, MutableSharedFlow<k.c> mutableSharedFlow, Continuation<? super DirectorServiceDriverService$toInternalEventFlow$1> continuation) {
        super(2, continuation);
        this.$playable = jVar;
        this.$flow = mutableSharedFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectorServiceDriverService$toInternalEventFlow$1(this.$playable, this.$flow, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<com.bilibili.player.tangram.playercore.A> flowV = this.$playable.v();
            a aVar = new a(this.$flow);
            this.label = 1;
            if (flowV.collect(aVar, this) == coroutine_suspended) {
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
