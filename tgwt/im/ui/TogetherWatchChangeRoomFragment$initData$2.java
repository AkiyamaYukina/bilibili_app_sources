package com.bilibili.tgwt.im.ui;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import sl0.C8597a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment$initData$2.class */
final class TogetherWatchChangeRoomFragment$initData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TogetherWatchChangeRoomFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment$initData$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchChangeRoomFragment f111291a;

        public a(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment) {
            this.f111291a = togetherWatchChangeRoomFragment;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f111291a.m10570if(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChangeRoomFragment$initData$2(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment, Continuation<? super TogetherWatchChangeRoomFragment$initData$2> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchChangeRoomFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChangeRoomFragment$initData$2(this.this$0, continuation);
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
            TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment = this.this$0;
            MutableStateFlow<C8597a> mutableStateFlow = togetherWatchChangeRoomFragment.f111286m;
            a aVar = new a(togetherWatchChangeRoomFragment);
            this.label = 1;
            if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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
