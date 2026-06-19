package com.bilibili.ship.theseus.ogv.intro.download.service;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadService$showDownloadFloatLayer$1.class */
final class OgvDownloadService$showDownloadFloatLayer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvDownloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDownloadService$showDownloadFloatLayer$1(OgvDownloadService ogvDownloadService, Continuation<? super OgvDownloadService$showDownloadFloatLayer$1> continuation) {
        super(continuation);
        this.this$0 = ogvDownloadService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvDownloadService.a(this.this$0, this);
    }
}
