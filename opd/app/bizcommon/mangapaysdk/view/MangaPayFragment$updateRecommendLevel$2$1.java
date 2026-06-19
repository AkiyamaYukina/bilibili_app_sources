package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$updateRecommendLevel$2$1.class */
final class MangaPayFragment$updateRecommendLevel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super Unit>, Object> $afterUpdateAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$updateRecommendLevel$2$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super MangaPayFragment$updateRecommendLevel$2$1> continuation) {
        super(2, continuation);
        this.$afterUpdateAction = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$updateRecommendLevel$2$1(this.$afterUpdateAction, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super Unit>, Object> function1 = this.$afterUpdateAction;
            this.label = 1;
            if (function1.invoke(this) == coroutine_suspended) {
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
