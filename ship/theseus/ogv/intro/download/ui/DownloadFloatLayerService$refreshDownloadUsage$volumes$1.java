package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$refreshDownloadUsage$volumes$1.class */
final class DownloadFloatLayerService$refreshDownloadUsage$volumes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Long, ? extends Long>>, Object> {
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$refreshDownloadUsage$volumes$1(DownloadFloatLayerService downloadFloatLayerService, Continuation<? super DownloadFloatLayerService$refreshDownloadUsage$volumes$1> continuation) {
        super(2, continuation);
        this.this$0 = downloadFloatLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$refreshDownloadUsage$volumes$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<Long, Long>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Cu0.a aVar = Cu0.a.f1797a;
        Context context = this.this$0.f92432e;
        aVar.getClass();
        MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
        return mainCommonService != null ? mainCommonService.getVideoCacheVolume(context) : null;
    }
}
