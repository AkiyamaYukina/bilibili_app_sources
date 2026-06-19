package com.bilibili.ship.theseus.cheese.biz.intro.pack;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageService$createPackage$1.class */
public final class CheesePackageService$createPackage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final CheesePackageComponent $component;
    final s $pugvPackage;
    int label;
    final CheesePackageService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageService$createPackage$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePackageService f89515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f89516b;

        public a(CheesePackageService cheesePackageService, s sVar) {
            this.f89515a = cheesePackageService;
            this.f89516b = sVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            this.f89515a.b((v) obj, this.f89516b, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePackageService$createPackage$1(CheesePackageComponent cheesePackageComponent, CheesePackageService cheesePackageService, s sVar, Continuation<? super CheesePackageService$createPackage$1> continuation) {
        super(1, continuation);
        this.$component = cheesePackageComponent;
        this.this$0 = cheesePackageService;
        this.$pugvPackage = sVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheesePackageService$createPackage$1(this.$component, this.this$0, this.$pugvPackage, continuation);
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
            SharedFlow<v> sharedFlow = this.$component.f89442c;
            a aVar = new a(this.this$0, this.$pugvPackage);
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
