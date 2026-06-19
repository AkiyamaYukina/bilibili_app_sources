package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import com.bilibili.ship.theseus.cheese.biz.intro.desc.h;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$createDescTextComponent$1.class */
public final class CheeseDescService$createDescTextComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final g $component;
    int label;
    final CheeseDescService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$createDescTextComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseDescService f89384a;

        public a(CheeseDescService cheeseDescService) {
            this.f89384a = cheeseDescService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            if (((h) obj) instanceof h.d) {
                CheeseDescService cheeseDescService = this.f89384a;
                cheeseDescService.f89379f = true;
                PageReportService.i(cheeseDescService.f89375b, "pugv.detail.intro.0.show", null, 6);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDescService$createDescTextComponent$1(g gVar, CheeseDescService cheeseDescService, Continuation<? super CheeseDescService$createDescTextComponent$1> continuation) {
        super(1, continuation);
        this.$component = gVar;
        this.this$0 = cheeseDescService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseDescService$createDescTextComponent$1(this.$component, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<h> mutableSharedFlow = this.$component.f89406b;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
