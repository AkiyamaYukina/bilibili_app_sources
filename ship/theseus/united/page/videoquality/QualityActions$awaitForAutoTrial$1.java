package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityActions$awaitForAutoTrial$1.class */
final class QualityActions$awaitForAutoTrial$1 extends ContinuationImpl {
    int label;
    Object result;
    final InterfaceC6436j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityActions$awaitForAutoTrial$1(InterfaceC6436j interfaceC6436j, Continuation<? super QualityActions$awaitForAutoTrial$1> continuation) {
        super(continuation);
        this.this$0 = interfaceC6436j;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InterfaceC6436j.b(this.this$0, this);
    }
}
