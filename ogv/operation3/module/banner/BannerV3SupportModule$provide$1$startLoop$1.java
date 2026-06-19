package com.bilibili.ogv.operation3.module.banner;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/BannerV3SupportModule$provide$1$startLoop$1.class */
final class BannerV3SupportModule$provide$1$startLoop$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    Object result;

    public BannerV3SupportModule$provide$1$startLoop$1(Continuation<? super BannerV3SupportModule$provide$1$startLoop$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(null, this);
    }
}
