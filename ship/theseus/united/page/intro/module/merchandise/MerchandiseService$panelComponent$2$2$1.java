package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$panelComponent$2$2$1.class */
final class MerchandiseService$panelComponent$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final f $component;
    int label;
    final MerchandiseService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$panelComponent$2$2$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MerchandiseService f100567a;

        public a(MerchandiseService merchandiseService) {
            this.f100567a = merchandiseService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            int iIntValue = ((Number) obj).intValue();
            MerchandiseService merchandiseService = this.f100567a;
            if (iIntValue != 3) {
                if (iIntValue == 5 && merchandiseService.f100564o) {
                    merchandiseService.f100564o = false;
                    Function0<Unit> function0 = merchandiseService.f100563n;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            } else if (!merchandiseService.f100564o) {
                merchandiseService.f100564o = true;
                Function0<Unit> function02 = merchandiseService.f100562m;
                if (function02 != null) {
                    function02.invoke();
                }
                PageReportService.i(merchandiseService.f100552b, "united.player-video-detail.mall-float.0.show", MapsKt.plus(merchandiseService.c(), merchandiseService.d()), 4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchandiseService$panelComponent$2$2$1(f fVar, MerchandiseService merchandiseService, Continuation<? super MerchandiseService$panelComponent$2$2$1> continuation) {
        super(2, continuation);
        this.$component = fVar;
        this.this$0 = merchandiseService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MerchandiseService$panelComponent$2$2$1(this.$component, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Integer> stateFlow = this.$component.h;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
