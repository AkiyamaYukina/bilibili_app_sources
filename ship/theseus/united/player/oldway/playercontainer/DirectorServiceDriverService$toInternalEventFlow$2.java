package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$toInternalEventFlow$2.class */
final class DirectorServiceDriverService$toInternalEventFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableSharedFlow<k.c> $flow;
    final com.bilibili.ship.theseus.keel.player.j $playable;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.DirectorServiceDriverService$toInternalEventFlow$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$toInternalEventFlow$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$toInternalEventFlow$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableSharedFlow<k.c> f104760a;

        public a(MutableSharedFlow<k.c> mutableSharedFlow) {
            this.f104760a = mutableSharedFlow;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit;
            PlayerAvailability playerAvailability = (PlayerAvailability) obj;
            if (playerAvailability == PlayerAvailability.COMPLETED || playerAvailability == PlayerAvailability.FORBIDDEN) {
                objEmit = this.f104760a.emit(k.c.a.a, continuation);
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
    public DirectorServiceDriverService$toInternalEventFlow$2(com.bilibili.ship.theseus.keel.player.j jVar, MutableSharedFlow<k.c> mutableSharedFlow, Continuation<? super DirectorServiceDriverService$toInternalEventFlow$2> continuation) {
        super(2, continuation);
        this.$playable = jVar;
        this.$flow = mutableSharedFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectorServiceDriverService$toInternalEventFlow$2(this.$playable, this.$flow, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayerAvailability> flowD = this.$playable.d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
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
        Flow<PlayerAvailability> flowD2 = this.$playable.d();
        a aVar = new a(this.$flow);
        this.label = 2;
        if (flowD2.collect(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
