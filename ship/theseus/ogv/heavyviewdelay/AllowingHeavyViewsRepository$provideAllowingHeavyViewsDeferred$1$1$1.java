package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1.class */
public final class AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.heavyviewdelay.AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<j, Continuation<? super Long>, Object> {
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

        public final Object invoke(j jVar, Continuation<? super Long> continuation) {
            return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxLong(((Number) obj).longValue());
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.throwOnFailure(obj);
            j jVar = (j) this.L$0;
            if (jVar == null) {
                this.label = 2;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
            this.label = 1;
            Object objU = jVar.u(this);
            obj = objU;
            if (objU == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Boxing.boxLong(((Number) obj).longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1(a aVar, Continuation<? super AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowMapLatest = FlowKt.mapLatest(FlowKt.asStateFlow(this.this$0.f92196b.f91111e), new AnonymousClass1(null));
            this.label = 1;
            if (FlowKt.first(flowMapLatest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1-invokeSuspend", "[theseus-ogv-AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1$1$1-invokeSuspend] Allowing heavy views on first frame.");
        return Unit.INSTANCE;
    }
}
