package com.bilibili.ogv.story;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$startVipBarExpandedAnim$1.class */
final class OgvStoryBottomVm$startVipBarExpandedAnim$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvStoryBottomVm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStoryBottomVm$startVipBarExpandedAnim$1(OgvStoryBottomVm ogvStoryBottomVm, Continuation<? super OgvStoryBottomVm$startVipBarExpandedAnim$1> continuation) {
        super(continuation);
        this.this$0 = ogvStoryBottomVm;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvStoryBottomVm.m(this.this$0, null, 0L, this);
    }
}
