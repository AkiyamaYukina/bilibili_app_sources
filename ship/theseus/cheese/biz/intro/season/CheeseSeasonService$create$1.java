package com.bilibili.ship.theseus.cheese.biz.intro.season;

import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$create$1.class */
public final class CheeseSeasonService$create$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<a> $bindView;
    final Ref.ObjectRef<String> $count;
    final Ref.ObjectRef<C6353o> $data;
    int label;
    final CheeseSeasonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<a> $bindView;
        final Ref.ObjectRef<String> $count;
        final Ref.ObjectRef<C6353o> $data;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<a> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bindView = objectRef;
            this.$data = objectRef2;
            this.$count = objectRef3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, this.$data, this.$count, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
            return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C7893a.C1318a.C1319a c1319a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
            if (c1318a == null || (c1319a = c1318a.f123395a) == null) {
                return Unit.INSTANCE;
            }
            CheeseSeasonService.a(this.$data, this.$count, c1319a.f123397a);
            a aVar = (a) this.$bindView.element;
            if (aVar != null) {
                aVar.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseSeasonService$create$1(CheeseSeasonService cheeseSeasonService, Ref.ObjectRef<a> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super CheeseSeasonService$create$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseSeasonService;
        this.$bindView = objectRef;
        this.$data = objectRef2;
        this.$count = objectRef3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseSeasonService$create$1(this.this$0, this.$bindView, this.$data, this.$count, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<C7893a.C1318a> stateFlow = this.this$0.f90035e.f123393f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, this.$data, this.$count, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
