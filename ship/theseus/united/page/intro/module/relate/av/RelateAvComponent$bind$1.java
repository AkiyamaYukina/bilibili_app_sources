package com.bilibili.ship.theseus.united.page.intro.module.relate.av;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/av/RelateAvComponent$bind$1.class */
public final class RelateAvComponent$bind$1 extends ContinuationImpl {
    int label;
    Object result;
    final RelateAvComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelateAvComponent$bind$1(RelateAvComponent relateAvComponent, Continuation<? super RelateAvComponent$bind$1> continuation) {
        super(continuation);
        this.this$0 = relateAvComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
