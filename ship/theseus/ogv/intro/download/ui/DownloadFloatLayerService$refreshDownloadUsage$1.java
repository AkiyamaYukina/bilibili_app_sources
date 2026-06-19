package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$refreshDownloadUsage$1.class */
final class DownloadFloatLayerService$refreshDownloadUsage$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    Object result;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$refreshDownloadUsage$1(DownloadFloatLayerService downloadFloatLayerService, Continuation<? super DownloadFloatLayerService$refreshDownloadUsage$1> continuation) {
        super(continuation);
        this.this$0 = downloadFloatLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DownloadFloatLayerService.b(this.this$0, null, this);
    }
}
