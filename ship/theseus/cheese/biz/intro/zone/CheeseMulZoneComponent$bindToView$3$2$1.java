package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.a;
import fu0.T;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseMulZoneComponent$bindToView$3$2$1.class */
public final class CheeseMulZoneComponent$bindToView$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final T $binding;
    final d $seasonZone;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseMulZoneComponent$bindToView$3$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseMulZoneComponent$bindToView$3$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final d $seasonZone;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, d dVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$seasonZone = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$seasonZone, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f90302b.tryEmit(new a.AbstractC0646a.C0647a(this.$seasonZone));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseMulZoneComponent$bindToView$3$2$1(T t7, a aVar, d dVar, Continuation<? super CheeseMulZoneComponent$bindToView$3$2$1> continuation) {
        super(2, continuation);
        this.$binding = t7;
        this.this$0 = aVar;
        this.$seasonZone = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseMulZoneComponent$bindToView$3$2$1(this.$binding, this.this$0, this.$seasonZone, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowA = UIComponentExtKt.a(this.$binding.f119496c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$seasonZone, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
