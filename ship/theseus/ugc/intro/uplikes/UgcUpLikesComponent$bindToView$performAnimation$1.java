package com.bilibili.ship.theseus.ugc.intro.uplikes;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$performAnimation$1.class */
final class UgcUpLikesComponent$bindToView$performAnimation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public UgcUpLikesComponent$bindToView$performAnimation$1(Continuation<? super UgcUpLikesComponent$bindToView$performAnimation$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(null, null, null, null, this);
    }
}
