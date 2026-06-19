package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import com.bilibili.ship.theseus.cheese.biz.intro.desc.h;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C7004w;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$createDescImageComponent$1.class */
public final class CheeseDescService$createDescImageComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final c $component;
    final MutableStateFlow<i> $stateFlow;
    int label;
    final CheeseDescService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$createDescImageComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseDescService f89382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableStateFlow<i> f89383b;

        public a(CheeseDescService cheeseDescService, MutableStateFlow<i> mutableStateFlow) {
            this.f89382a = cheeseDescService;
            this.f89383b = mutableStateFlow;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            MutableStateFlow<i> mutableStateFlow;
            Object value;
            i iVar;
            C7004w c7004w;
            List<j> list;
            h hVar = (h) obj;
            boolean z6 = hVar instanceof h.d;
            CheeseDescService cheeseDescService = this.f89382a;
            if (z6) {
                cheeseDescService.f89379f = true;
                PageReportService.i(cheeseDescService.f89375b, "pugv.detail.intro.0.show", null, 6);
            } else if (hVar instanceof h.c) {
                int i7 = ((h.c) hVar).f89409a;
                cheeseDescService.getClass();
                PageReportService.i(cheeseDescService.f89375b, "pugv.detail.class-intro.cell.show", MapsKt.mapOf(TuplesKt.to("pic_position", String.valueOf(i7))), 4);
            } else if (hVar instanceof h.a) {
                PageReportService.i(cheeseDescService.f89375b, "pugv.detail.intro.3.show", null, 6);
            } else {
                if (!(hVar instanceof h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                do {
                    mutableStateFlow = this.f89383b;
                    value = mutableStateFlow.getValue();
                    iVar = (i) value;
                    c7004w = iVar.f89411a;
                    list = iVar.f89414d;
                } while (!mutableStateFlow.compareAndSet(value, new i(c7004w, iVar.f89412b, iVar.f89413c, list, iVar.f89415e, true)));
                PageReportService.g(cheeseDescService.f89375b, "pugv.detail.intro.3.click", null, 6);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDescService$createDescImageComponent$1(c cVar, CheeseDescService cheeseDescService, MutableStateFlow<i> mutableStateFlow, Continuation<? super CheeseDescService$createDescImageComponent$1> continuation) {
        super(1, continuation);
        this.$component = cVar;
        this.this$0 = cheeseDescService;
        this.$stateFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseDescService$createDescImageComponent$1(this.$component, this.this$0, this.$stateFlow, continuation);
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
            MutableSharedFlow<h> mutableSharedFlow = this.$component.f89391b;
            a aVar = new a(this.this$0, this.$stateFlow);
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
