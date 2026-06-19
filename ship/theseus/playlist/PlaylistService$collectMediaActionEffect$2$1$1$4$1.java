package com.bilibili.ship.theseus.playlist;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2$1$1$4$1.class */
final class PlaylistService$collectMediaActionEffect$2$1$1$4$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $dismissFlow;
    final WindowSizeClass $initialWindowSize;
    int label;
    final E this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2$1$1$4$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowSizeClass f95174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableStateFlow<Boolean> f95175b;

        public a(WindowSizeClass windowSizeClass, MutableStateFlow<Boolean> mutableStateFlow) {
            this.f95174a = windowSizeClass;
            this.f95175b = mutableStateFlow;
        }

        public final Object emit(Object obj, Continuation continuation) {
            if (!Intrinsics.areEqual(this.f95174a, (WindowSizeClass) obj)) {
                this.f95175b.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectMediaActionEffect$2$1$1$4$1(E e7, WindowSizeClass windowSizeClass, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super PlaylistService$collectMediaActionEffect$2$1$1$4$1> continuation) {
        super(1, continuation);
        this.this$0 = e7;
        this.$initialWindowSize = windowSizeClass;
        this.$dismissFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlaylistService$collectMediaActionEffect$2$1$1$4$1(this.this$0, this.$initialWindowSize, this.$dismissFlow, continuation);
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
            StateFlow<WindowSizeClass> stateFlow = this.this$0.f94950s.f102939c;
            a aVar = new a(this.$initialWindowSize, this.$dismissFlow);
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
