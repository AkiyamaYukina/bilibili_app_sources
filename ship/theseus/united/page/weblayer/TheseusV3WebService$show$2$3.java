package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$3.class */
final class TheseusV3WebService$show$2$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.BooleanRef $active;
    final Ref.ObjectRef<PlayerV3WebGeneralUIComponent> $activeWebUiComponent;
    final Ref.ObjectRef<String> $finishReason;
    int label;
    final l this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f104177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<PlayerV3WebGeneralUIComponent> f104178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f104179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.ObjectRef<String> f104180d;

        public a(l lVar, Ref.ObjectRef<PlayerV3WebGeneralUIComponent> objectRef, Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef2) {
            this.f104177a = lVar;
            this.f104178b = objectRef;
            this.f104179c = booleanRef;
            this.f104180d = objectRef2;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ((TheseusV3WebRepository.a) obj).getClass();
            BuildersKt.launch$default(this.f104177a.f104269a, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new TheseusV3WebService$show$requestClose$1(this.f104178b, this.f104179c, null, null, this.f104180d, null, null), 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$2$3(l lVar, Ref.ObjectRef<PlayerV3WebGeneralUIComponent> objectRef, Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef2, Continuation<? super TheseusV3WebService$show$2$3> continuation) {
        super(1, continuation);
        this.this$0 = lVar;
        this.$activeWebUiComponent = objectRef;
        this.$active = booleanRef;
        this.$finishReason = objectRef2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusV3WebService$show$2$3(this.this$0, this.$activeWebUiComponent, this.$active, this.$finishReason, continuation);
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
            l lVar = this.this$0;
            SharedFlow<TheseusV3WebRepository.a> sharedFlow = lVar.f104277j.f104172d;
            a aVar = new a(lVar, this.$activeWebUiComponent, this.$active, this.$finishReason);
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
