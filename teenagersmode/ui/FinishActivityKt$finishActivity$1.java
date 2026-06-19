package com.bilibili.teenagersmode.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/FinishActivityKt$finishActivity$1.class */
final class FinishActivityKt$finishActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $setResult;
    final Fragment $this_finishActivity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishActivityKt$finishActivity$1(boolean z6, Fragment fragment, Continuation<? super FinishActivityKt$finishActivity$1> continuation) {
        super(2, continuation);
        this.$setResult = z6;
        this.$this_finishActivity = fragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinishActivityKt$finishActivity$1(this.$setResult, this.$this_finishActivity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivityP3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$setResult && (fragmentActivityP3 = this.$this_finishActivity.p3()) != null) {
            fragmentActivityP3.setResult(-1);
        }
        FragmentActivity fragmentActivityP32 = this.$this_finishActivity.p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.finish();
        }
        return Unit.INSTANCE;
    }
}
