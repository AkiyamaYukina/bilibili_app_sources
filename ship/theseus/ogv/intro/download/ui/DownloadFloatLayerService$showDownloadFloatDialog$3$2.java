package com.bilibili.ship.theseus.ogv.intro.download.ui;

import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$showDownloadFloatDialog$3$2.class */
public final class DownloadFloatLayerService$showDownloadFloatDialog$3$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final OgvEpisode $firstAllowDownloadEpisode;
    final n0 $vm;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$showDownloadFloatDialog$3$2(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, OgvEpisode ogvEpisode, Continuation<? super DownloadFloatLayerService$showDownloadFloatDialog$3$2> continuation) {
        super(1, continuation);
        this.this$0 = downloadFloatLayerService;
        this.$vm = n0Var;
        this.$firstAllowDownloadEpisode = ogvEpisode;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DownloadFloatLayerService$showDownloadFloatDialog$3$2(this.this$0, this.$vm, this.$firstAllowDownloadEpisode, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            DownloadFloatLayerService downloadFloatLayerService = this.this$0;
            n0 n0Var = this.$vm;
            OgvEpisode ogvEpisode = this.$firstAllowDownloadEpisode;
            this.label = 1;
            downloadFloatLayerService.getClass();
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DownloadFloatLayerService$driveState$2(downloadFloatLayerService, n0Var, ogvEpisode, null), this);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            if (objCoroutineScope == coroutine_suspended) {
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
