package com.bilibili.ship.theseus.united.page.interactvideo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$1.class */
final class TheseusInteractVideoService$runNode$1 extends ContinuationImpl {
    int label;
    Object result;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$runNode$1(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super TheseusInteractVideoService$runNode$1> continuation) {
        super(continuation);
        this.this$0 = theseusInteractVideoService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TheseusInteractVideoService.g(this.this$0, null, null, null, null, null, this);
    }
}
