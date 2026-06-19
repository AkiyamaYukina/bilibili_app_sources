package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import android.content.Context;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.b;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseZoneService$createSingleZoneComponent$1.class */
public final class CheeseZoneService$createSingleZoneComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $component;
    int label;
    final CheeseZoneService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseZoneService$createSingleZoneComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseZoneService f90300a;

        public a(CheeseZoneService cheeseZoneService) {
            this.f90300a = cheeseZoneService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            b.a aVar = (b.a) obj;
            boolean z6 = aVar instanceof b.a.C0648a;
            CheeseZoneService cheeseZoneService = this.f90300a;
            if (z6) {
                Context context = cheeseZoneService.f90294a;
                b.a.C0648a c0648a = (b.a.C0648a) aVar;
                qV.a.a(context, c0648a.f90311a.f90317b, cheeseZoneService.f90295b.f54246k);
                PageReportService.g(cheeseZoneService.f90297d, c0648a.f90311a.f90320e == 1 ? "pugv.detail.partition.1.click" : "pugv.detail.kaoyan-entrance.0.click", null, 6);
            } else {
                if (!(aVar instanceof b.a.C0649b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cheeseZoneService.c(((b.a.C0649b) aVar).f90312a, false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseZoneService$createSingleZoneComponent$1(b bVar, CheeseZoneService cheeseZoneService, Continuation<? super CheeseZoneService$createSingleZoneComponent$1> continuation) {
        super(1, continuation);
        this.$component = bVar;
        this.this$0 = cheeseZoneService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseZoneService$createSingleZoneComponent$1(this.$component, this.this$0, continuation);
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
            SharedFlow<b.a> sharedFlow = this.$component.f90310c;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
