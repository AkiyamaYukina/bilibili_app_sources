package com.bilibili.topix.compose.create;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment$CreatePage$2$1$1$1.class */
public final class CreateTopicComposeFragment$CreatePage$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FocusRequester $nameFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicComposeFragment$CreatePage$2$1$1$1(FocusRequester focusRequester, Continuation<? super CreateTopicComposeFragment$CreatePage$2$1$1$1> continuation) {
        super(2, continuation);
        this.$nameFocus = focusRequester;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTopicComposeFragment$CreatePage$2$1$1$1(this.$nameFocus, continuation);
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
        FocusRequester.m2409requestFocus3ESFkO8$default(this.$nameFocus, 0, 1, null);
        return Unit.INSTANCE;
    }
}
