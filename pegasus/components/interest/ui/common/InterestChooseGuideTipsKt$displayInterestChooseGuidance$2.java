package com.bilibili.pegasus.components.interest.ui.common;

import androidx.fragment.app.Fragment;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGuide;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/InterestChooseGuideTipsKt$displayInterestChooseGuidance$2.class */
final class InterestChooseGuideTipsKt$displayInterestChooseGuidance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final InterestChooseGuide $guide;
    final Fragment $this_displayInterestChooseGuidance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseGuideTipsKt$displayInterestChooseGuidance$2(Fragment fragment, InterestChooseGuide interestChooseGuide, Continuation<? super InterestChooseGuideTipsKt$displayInterestChooseGuidance$2> continuation) {
        super(2, continuation);
        this.$this_displayInterestChooseGuidance = fragment;
        this.$guide = interestChooseGuide;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseGuideTipsKt$displayInterestChooseGuidance$2(this.$this_displayInterestChooseGuidance, this.$guide, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCallbackFlow = FlowKt.callbackFlow(new InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1(this.$this_displayInterestChooseGuidance, this.$guide, null));
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowCallbackFlow, this);
            obj = objFirstOrNull;
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }
}
