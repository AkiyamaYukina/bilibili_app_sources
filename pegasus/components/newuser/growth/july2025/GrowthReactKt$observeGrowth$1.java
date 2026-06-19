package com.bilibili.pegasus.components.newuser.growth.july2025;

import Mh.c;
import Rg0.InterfaceC2843a;
import Rg0.c;
import android.app.Activity;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/newuser/growth/july2025/GrowthReactKt$observeGrowth$1.class */
final class GrowthReactKt$observeGrowth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $activity;
    final Mh.b $growthCenter;
    final InterfaceC2843a $logConsumer;
    final c $loginPageStateHolder;
    final Function0<Unit> $tryInterestChoose;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/newuser/growth/july2025/GrowthReactKt$observeGrowth$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2843a f77099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0<Unit> f77100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoroutineScope f77101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Activity f77102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f77103e;

        public a(InterfaceC2843a interfaceC2843a, Function0<Unit> function0, CoroutineScope coroutineScope, Activity activity, c cVar) {
            this.f77099a = interfaceC2843a;
            this.f77100b = function0;
            this.f77101c = coroutineScope;
            this.f77102d = activity;
            this.f77103e = cVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            Mh.c cVar = (Mh.c) obj;
            this.f77099a.a("event: " + cVar);
            if (cVar instanceof c.a) {
                BLog.i("pegasus-new.clipboard_and_interest_2025_07", "onLog, " + cVar);
            } else if (Intrinsics.areEqual(cVar, c.b.a)) {
                this.f77100b.invoke();
            } else {
                if (!(cVar instanceof c.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f77101c.getCoroutineContext()), (CoroutineContext) null, (CoroutineStart) null, new GrowthReactKt$observeGrowth$1$1$1(this.f77102d, this.f77103e, cVar, this.f77100b, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrowthReactKt$observeGrowth$1(Mh.b bVar, InterfaceC2843a interfaceC2843a, Function0<Unit> function0, Activity activity, Rg0.c cVar, Continuation<? super GrowthReactKt$observeGrowth$1> continuation) {
        super(2, continuation);
        this.$growthCenter = bVar;
        this.$logConsumer = interfaceC2843a;
        this.$tryInterestChoose = function0;
        this.$activity = activity;
        this.$loginPageStateHolder = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GrowthReactKt$observeGrowth$1 growthReactKt$observeGrowth$1 = new GrowthReactKt$observeGrowth$1(this.$growthCenter, this.$logConsumer, this.$tryInterestChoose, this.$activity, this.$loginPageStateHolder, continuation);
        growthReactKt$observeGrowth$1.L$0 = obj;
        return growthReactKt$observeGrowth$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        SharedFlow event;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Mh.b bVar = this.$growthCenter;
            if (bVar == null || (event = bVar.getEvent()) == null) {
                return Unit.INSTANCE;
            }
            a aVar = new a(this.$logConsumer, this.$tryInterestChoose, coroutineScope, this.$activity, this.$loginPageStateHolder);
            this.label = 1;
            if (event.collect(aVar, this) == coroutine_suspended) {
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
