package com.bilibili.ship.theseus.united.page.popupwindow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/PopupWindowRepository$dismissPopupWindow$1.class */
final class PopupWindowRepository$dismissPopupWindow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $type;
    int label;
    final PopupWindowRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupWindowRepository$dismissPopupWindow$1(PopupWindowRepository popupWindowRepository, int i7, Continuation<? super PopupWindowRepository$dismissPopupWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = popupWindowRepository;
        this.$type = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PopupWindowRepository$dismissPopupWindow$1(this.this$0, this.$type, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Integer> mutableSharedFlow = this.this$0.f102417g;
            Integer numBoxInt = Boxing.boxInt(this.$type);
            this.label = 1;
            if (mutableSharedFlow.emit(numBoxInt, this) == coroutine_suspended) {
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
