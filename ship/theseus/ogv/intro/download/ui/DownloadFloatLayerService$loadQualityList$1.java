package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$loadQualityList$1.class */
final class DownloadFloatLayerService$loadQualityList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$loadQualityList$1(DownloadFloatLayerService downloadFloatLayerService, Continuation<? super DownloadFloatLayerService$loadQualityList$1> continuation) {
        super(continuation);
        this.this$0 = downloadFloatLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DownloadFloatLayerService.a(this.this$0, null, null, this);
    }
}
