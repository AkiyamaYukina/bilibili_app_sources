package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.runtime.MutableIntState;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/CreateScheduleModuleKomponent$invoke$1$2$1$2$1.class */
final class CreateScheduleModuleKomponent$invoke$1$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<i> $dates;
    final MutableIntState $selectedTabIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateScheduleModuleKomponent$invoke$1$2$1$2$1(List<i> list, MutableIntState mutableIntState, Continuation<? super CreateScheduleModuleKomponent$invoke$1$2$1$2$1> continuation) {
        super(2, continuation);
        this.$dates = list;
        this.$selectedTabIndex$delegate = mutableIntState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateScheduleModuleKomponent$invoke$1$2$1$2$1(this.$dates, this.$selectedTabIndex$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableIntState mutableIntState = this.$selectedTabIndex$delegate;
        Iterator<i> it = this.$dates.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().f68791a.f68760a.f68756e) {
                break;
            }
            i7++;
        }
        mutableIntState.setIntValue(i7);
        return Unit.INSTANCE;
    }
}
