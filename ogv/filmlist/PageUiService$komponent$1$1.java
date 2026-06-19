package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/PageUiService$komponent$1$1.class */
final class PageUiService$komponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<s> $uiState$delegate;
    int label;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$1(KomponentScope<? super Unit> komponentScope, B b7, MutableState<s> mutableState, Toaster toaster, Continuation<? super PageUiService$komponent$1$1> continuation) {
        super(2, continuation);
        this.$this_Komponent = komponentScope;
        this.this$0 = b7;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageUiService$komponent$1$1(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster, continuation);
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
        B.a(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster);
        return Unit.INSTANCE;
    }
}
