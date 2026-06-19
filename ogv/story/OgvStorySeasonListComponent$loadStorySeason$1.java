package com.bilibili.ogv.story;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListComponent$loadStorySeason$1.class */
final class OgvStorySeasonListComponent$loadStorySeason$1 extends ContinuationImpl {
    int label;
    Object result;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStorySeasonListComponent$loadStorySeason$1(o oVar, Continuation<? super OgvStorySeasonListComponent$loadStorySeason$1> continuation) {
        super(continuation);
        this.this$0 = oVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o.e(this.this$0, this);
    }
}
