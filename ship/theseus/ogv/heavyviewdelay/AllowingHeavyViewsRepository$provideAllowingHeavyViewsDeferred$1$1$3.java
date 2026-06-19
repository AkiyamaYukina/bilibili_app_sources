package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3.class */
public final class AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.heavyviewdelay.AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3$1.class */
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
    public AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3(a aVar, Continuation<? super AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<PlayerAvailability> mutableStateFlow = this.this$0.f92196b.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3-invokeSuspend", "[theseus-ogv-AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$3-invokeSuspend] Allowing heavy views on player forbidden.");
        return Unit.INSTANCE;
    }
}
