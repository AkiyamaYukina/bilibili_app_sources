package com.bilibili.ship.theseus.cheese.biz.intro.season;

import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$create$2.class */
public final class CheeseSeasonService$create$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<a> $bindView;
    final Ref.ObjectRef<String> $count;
    final Ref.ObjectRef<C6353o> $data;
    final C6353o $seasonData;
    int label;
    final CheeseSeasonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonService$create$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$create$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<a> $bindView;
        final Ref.ObjectRef<String> $count;
        final Ref.ObjectRef<C6353o> $data;
        final C6353o $seasonData;
        boolean Z$0;
        int label;
        final CheeseSeasonService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, CheeseSeasonService cheeseSeasonService, Ref.ObjectRef<a> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = objectRef;
            this.$seasonData = c6353o;
            this.this$0 = cheeseSeasonService;
            this.$bindView = objectRef2;
            this.$count = objectRef3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$seasonData, this.this$0, this.$bindView, this.$count, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            this.$data.element = z6 ? C6354p.a(this.$seasonData) : this.$seasonData;
            Ref.ObjectRef<C6353o> objectRef = this.$data;
            Ref.ObjectRef<String> objectRef2 = this.$count;
            C7893a.C1318a c1318aC = this.this$0.f90035e.c();
            CheeseSeasonService.a(objectRef, objectRef2, c1318aC != null ? c1318aC.f123395a.f123397a : 0L);
            a aVar = (a) this.$bindView.element;
            if (aVar != null) {
                aVar.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseSeasonService$create$2(CheeseSeasonService cheeseSeasonService, Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, Ref.ObjectRef<a> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super CheeseSeasonService$create$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseSeasonService;
        this.$data = objectRef;
        this.$seasonData = c6353o;
        this.$bindView = objectRef2;
        this.$count = objectRef3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseSeasonService$create$2(this.this$0, this.$data, this.$seasonData, this.$bindView, this.$count, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseSeasonService cheeseSeasonService = this.this$0;
            MutableStateFlow mutableStateFlow = cheeseSeasonService.f90036f.f101701b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$seasonData, cheeseSeasonService, this.$bindView, this.$count, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
