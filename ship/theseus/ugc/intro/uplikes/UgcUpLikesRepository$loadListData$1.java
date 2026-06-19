package com.bilibili.ship.theseus.ugc.intro.uplikes;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesRepository$loadListData$1.class */
final class UgcUpLikesRepository$loadListData$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    Object result;
    final h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesRepository$loadListData$1(h hVar, Continuation<? super UgcUpLikesRepository$loadListData$1> continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, false, this);
    }
}
