package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.text.Spannable;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$showPrimaryTitle$2$2$1.class */
public final class CheesePrimaryComponent$showPrimaryTitle$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Spannable>, Object> {
    final S $it;
    final TextView $tvTitle;
    int label;
    final C6081b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryComponent$showPrimaryTitle$2$2$1(C6081b c6081b, S s7, TextView textView, Continuation<? super CheesePrimaryComponent$showPrimaryTitle$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c6081b;
        this.$it = s7;
        this.$tvTitle = textView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePrimaryComponent$showPrimaryTitle$2$2$1(this.this$0, this.$it, this.$tvTitle, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Spannable> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6081b c6081b = this.this$0;
            S s7 = this.$it;
            TextView textView = this.$tvTitle;
            this.label = 1;
            Object objD = C6081b.d(c6081b, s7, textView, this);
            obj = objD;
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
