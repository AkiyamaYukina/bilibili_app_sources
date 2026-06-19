package com.bilibili.ship.theseus.ogv.dubbing;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$1.class */
public final class SwitchDubbingService$switchDubbingAudioTrack$3$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$1$1.class */
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
            return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.LOADING);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.dubbing.SwitchDubbingService$switchDubbingAudioTrack$3$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$switchDubbingAudioTrack$3$1$1(q qVar, Continuation<? super SwitchDubbingService$switchDubbingAudioTrack$3$1$1> continuation) {
        super(1, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SwitchDubbingService$switchDubbingAudioTrack$3$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayerAvailability> flowD = this.this$0.f91895k.d();
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
                q qVar = this.this$0;
                q.a(qVar, qVar.h.getString(2131855524));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        q qVar2 = this.this$0;
        q.a(qVar2, qVar2.h.getString(2131855525));
        Flow<PlayerAvailability> flowD2 = this.this$0.f91895k.d();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        this.label = 2;
        if (FlowKt.first(flowD2, anonymousClass2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        q qVar3 = this.this$0;
        q.a(qVar3, qVar3.h.getString(2131855524));
        return Unit.INSTANCE;
    }
}
