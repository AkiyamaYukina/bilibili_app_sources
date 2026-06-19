package com.bilibili.paycoin;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.paycoin.PayCoinsView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$updatePayCoinDrawableAndPrompt$1.class */
public final class PayCoinsView$updatePayCoinDrawableAndPrompt$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $res22;
    final Ref.IntRef $stringBizPrompt;
    final int $stringPrompt;
    final String $uri22;
    int label;
    final PayCoinsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayCoinsView$updatePayCoinDrawableAndPrompt$1(PayCoinsView payCoinsView, String str, int i7, int i8, Ref.IntRef intRef, Continuation<? super PayCoinsView$updatePayCoinDrawableAndPrompt$1> continuation) {
        super(2, continuation);
        this.this$0 = payCoinsView;
        this.$uri22 = str;
        this.$res22 = i7;
        this.$stringPrompt = i8;
        this.$stringBizPrompt = intRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayCoinsView$updatePayCoinDrawableAndPrompt$1(this.this$0, this.$uri22, this.$res22, this.$stringPrompt, this.$stringBizPrompt, continuation);
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
            ImageView imageView = this.this$0.f74729e;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
                imageView2 = null;
            }
            String str = this.$uri22;
            this.label = 1;
            Object objA = PayCoinsView.b.a(imageView2, str, this);
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
            ImageView imageView3 = this.this$0.f74729e;
            ImageView imageView4 = imageView3;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
                imageView4 = null;
            }
            imageView4.setImageResource(this.$res22);
            TextView textView = this.this$0.f74732i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrompt");
                textView = null;
            }
            textView.setText(this.$stringPrompt);
        } else {
            TextView textView2 = this.this$0.f74732i;
            TextView textView3 = textView2;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrompt");
                textView3 = null;
            }
            textView3.setText(this.$stringBizPrompt.element);
            ImageView imageView5 = this.this$0.f74729e;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
                imageView5 = null;
            }
            imageView5.setImageDrawable(drawable);
        }
        return Unit.INSTANCE;
    }
}
