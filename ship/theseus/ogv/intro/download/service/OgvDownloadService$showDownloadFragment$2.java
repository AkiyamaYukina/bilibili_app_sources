package com.bilibili.ship.theseus.ogv.intro.download.service;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadService$showDownloadFragment$2.class */
public final class OgvDownloadService$showDownloadFragment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvDownloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDownloadService$showDownloadFragment$2(OgvDownloadService ogvDownloadService, Continuation<? super OgvDownloadService$showDownloadFragment$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvDownloadService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvDownloadService$showDownloadFragment$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PageReportService.i(this.this$0.f92382d, "united.player-video-detail.caching.panel.show", null, 6);
            OgvDownloadService ogvDownloadService = this.this$0;
            this.label = 1;
            if (OgvDownloadService.a(ogvDownloadService, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
