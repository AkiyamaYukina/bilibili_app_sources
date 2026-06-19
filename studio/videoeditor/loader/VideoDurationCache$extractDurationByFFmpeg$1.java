package com.bilibili.studio.videoeditor.loader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/VideoDurationCache$extractDurationByFFmpeg$1.class */
final class VideoDurationCache$extractDurationByFFmpeg$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final VideoDurationCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDurationCache$extractDurationByFFmpeg$1(VideoDurationCache videoDurationCache, Continuation<? super VideoDurationCache$extractDurationByFFmpeg$1> continuation) {
        super(continuation);
        this.this$0 = videoDurationCache;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        VideoDurationCache videoDurationCache = this.this$0;
        VideoDurationCache videoDurationCache2 = VideoDurationCache.f109773a;
        return videoDurationCache.c(null, this);
    }
}
