package com.bilibili.paycoin;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bilibili.paycoin.PayCoinsView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$updateThunder$1.class */
final class PayCoinsView$updateThunder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $resThunder;
    final String $uriThunder;
    int label;
    final PayCoinsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayCoinsView$updateThunder$1(PayCoinsView payCoinsView, String str, int i7, Continuation<? super PayCoinsView$updateThunder$1> continuation) {
        super(2, continuation);
        this.this$0 = payCoinsView;
        this.$uriThunder = str;
        this.$resThunder = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayCoinsView$updateThunder$1(this.this$0, this.$uriThunder, this.$resThunder, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            int i8 = PayCoinsView.f74712M;
            View view = this.this$0.f74741r;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThunder");
                view2 = null;
            }
            String str = this.$uriThunder;
            this.label = 1;
            Object objA = PayCoinsView.b.a(view2, str, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Drawable drawable = (Drawable) obj;
        if (drawable == null) {
            View view3 = this.this$0.f74741r;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThunder");
                view3 = null;
            }
            view3.setBackgroundResource(this.$resThunder);
        } else {
            View view4 = this.this$0.f74741r;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThunder");
                view4 = null;
            }
            view4.setBackground(drawable);
        }
        return Unit.INSTANCE;
    }
}
