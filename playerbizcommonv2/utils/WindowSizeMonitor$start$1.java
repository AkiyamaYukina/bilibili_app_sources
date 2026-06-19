package com.bilibili.playerbizcommonv2.utils;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/WindowSizeMonitor$start$1.class */
final class WindowSizeMonitor$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final r $delegate;
    int label;
    final B this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/WindowSizeMonitor$start$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B f81906a;

        public a(B b7) {
            this.f81906a = b7;
        }

        public final Object emit(Object obj, Continuation continuation) {
            WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
            B b7 = this.f81906a;
            if (!Intrinsics.areEqual(b7.f81894f, windowSizeClass)) {
                PlayerLog.i("BiliPlayerV2", "[" + b7.f81891c + "] window size changed: " + b7.f81894f + " -> " + windowSizeClass);
                b7.f81894f = windowSizeClass;
                b7.f81892d.invoke(windowSizeClass);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowSizeMonitor$start$1(r rVar, B b7, Continuation<? super WindowSizeMonitor$start$1> continuation) {
        super(2, continuation);
        this.$delegate = rVar;
        this.this$0 = b7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WindowSizeMonitor$start$1(this.$delegate, this.this$0, continuation);
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
            StateFlow<WindowSizeClass> windowSizeFlow = this.$delegate.getWindowSizeFlow();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (windowSizeFlow.collect(aVar, this) == coroutine_suspended) {
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
