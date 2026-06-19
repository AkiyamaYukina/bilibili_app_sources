package com.bilibili.ship.theseus.cheese.biz.intro.series;

import com.bilibili.ship.theseus.cheese.biz.intro.series.a;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesService$createSeriesComponent$1.class */
public final class CheeseSeriesService$createSeriesComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final d $cheeseSeriesData;
    final com.bilibili.ship.theseus.cheese.biz.intro.series.a $component;
    int label;
    final CheeseSeriesService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesService$createSeriesComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheeseSeriesService f90086b;

        public a(d dVar, CheeseSeriesService cheeseSeriesService) {
            this.f90085a = dVar;
            this.f90086b = cheeseSeriesService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            Unit unit;
            a.c cVar = (a.c) obj;
            boolean z6 = cVar instanceof a.c.C0638a;
            d dVar = this.f90085a;
            CheeseSeriesService cheeseSeriesService = this.f90086b;
            if (z6) {
                e eVar = (e) CollectionsKt.getOrNull(dVar.f90106b, ((a.c.C0638a) cVar).f90094a);
                if (eVar == null) {
                    unit = Unit.INSTANCE;
                } else {
                    cheeseSeriesService.f90082b.b(eVar.f90107a);
                    PageReportService.g(cheeseSeriesService.f90081a, "pugv.detail.classdate.0.click", MapsKt.mapOf(TuplesKt.to("class_date", eVar.f90110d)), 4);
                    unit = Unit.INSTANCE;
                }
            } else {
                if (!(cVar instanceof a.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVar2 = (e) CollectionsKt.getOrNull(dVar.f90106b, ((a.c.b) cVar).f90095a);
                if (eVar2 != null && cheeseSeriesService.f90084d.add(Long.valueOf(eVar2.f90107a))) {
                    PageReportService.i(cheeseSeriesService.f90081a, "pugv.detail.classdate.0.show", MapsKt.mapOf(TuplesKt.to("class_date", eVar2.f90110d)), 4);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseSeriesService$createSeriesComponent$1(com.bilibili.ship.theseus.cheese.biz.intro.series.a aVar, d dVar, CheeseSeriesService cheeseSeriesService, Continuation<? super CheeseSeriesService$createSeriesComponent$1> continuation) {
        super(1, continuation);
        this.$component = aVar;
        this.$cheeseSeriesData = dVar;
        this.this$0 = cheeseSeriesService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseSeriesService$createSeriesComponent$1(this.$component, this.$cheeseSeriesData, this.this$0, continuation);
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
            SharedFlow<a.c> sharedFlow = this.$component.f90089c;
            a aVar = new a(this.$cheeseSeriesData, this.this$0);
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
