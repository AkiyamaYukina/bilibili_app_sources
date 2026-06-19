package com.bilibili.ogv.infra.android.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/ViewTraversalKt$thisAndDescendants$1.class */
public final class ViewTraversalKt$thisAndDescendants$1 extends RestrictedSuspendLambda implements Function2<n<? super View>, Continuation<? super Unit>, Object> {
    final View $this_thisAndDescendants;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTraversalKt$thisAndDescendants$1(View view, Continuation<? super ViewTraversalKt$thisAndDescendants$1> continuation) {
        super(2, continuation);
        this.$this_thisAndDescendants = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ViewTraversalKt$thisAndDescendants$1 viewTraversalKt$thisAndDescendants$1 = new ViewTraversalKt$thisAndDescendants$1(this.$this_thisAndDescendants, continuation);
        viewTraversalKt$thisAndDescendants$1.L$0 = obj;
        return viewTraversalKt$thisAndDescendants$1;
    }

    public final Object invoke(n<? super View> nVar, Continuation<? super Unit> continuation) {
        return create(nVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        n nVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            n nVar2 = (n) this.L$0;
            View view = this.$this_thisAndDescendants;
            this.L$0 = nVar2;
            this.label = 1;
            nVar = nVar2;
            if (nVar2.d(view, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            n nVar3 = (n) this.L$0;
            ResultKt.throwOnFailure(obj);
            nVar = nVar3;
        }
        View view2 = this.$this_thisAndDescendants;
        if (view2 instanceof ViewGroup) {
            Sequence<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (nVar.g(descendants, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
