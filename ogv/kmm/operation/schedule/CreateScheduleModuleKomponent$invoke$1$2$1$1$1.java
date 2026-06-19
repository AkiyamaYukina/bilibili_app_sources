package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/CreateScheduleModuleKomponent$invoke$1$2$1$1$1.class */
final class CreateScheduleModuleKomponent$invoke$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final LazyListState $dateListState;
    final int $scrollOffset;
    final MutableIntState $selectedTabIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateScheduleModuleKomponent$invoke$1$2$1$1$1(LazyListState lazyListState, int i7, MutableIntState mutableIntState, Continuation<? super CreateScheduleModuleKomponent$invoke$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$dateListState = lazyListState;
        this.$scrollOffset = i7;
        this.$selectedTabIndex$delegate = mutableIntState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateScheduleModuleKomponent$invoke$1$2$1$1$1(this.$dateListState, this.$scrollOffset, this.$selectedTabIndex$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$dateListState;
            int intValue = this.$selectedTabIndex$delegate.getIntValue();
            int i8 = this.$scrollOffset;
            this.label = 1;
            if (lazyListState.animateScrollToItem(intValue, i8, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
