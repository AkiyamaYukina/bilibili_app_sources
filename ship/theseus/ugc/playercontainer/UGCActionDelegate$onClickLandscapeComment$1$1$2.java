package com.bilibili.ship.theseus.ugc.playercontainer;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$onClickLandscapeComment$1$1$2.class */
public final class UGCActionDelegate$onClickLandscapeComment$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final UGCActionDelegate this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$onClickLandscapeComment$1$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$onClickLandscapeComment$1$1$2$1.class */
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
            return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.FORBIDDEN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCActionDelegate$onClickLandscapeComment$1$1$2(UGCActionDelegate uGCActionDelegate, Continuation<? super UGCActionDelegate$onClickLandscapeComment$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = uGCActionDelegate;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UGCActionDelegate$onClickLandscapeComment$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<PlayerAvailability> flowD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f98238e.j();
            if (jVarJ != null && (flowD = jVarJ.d()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                Object objFirst = FlowKt.first(flowD, anonymousClass1, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
