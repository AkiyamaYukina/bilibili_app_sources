package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$showQualityFloatLayer$2.class */
public final class DownloadFloatLayerService$showQualityFloatLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvVideoDownloadDialog $dialog;
    Object L$0;
    Object L$1;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$showQualityFloatLayer$2(DownloadFloatLayerService downloadFloatLayerService, OgvVideoDownloadDialog ogvVideoDownloadDialog, Continuation<? super DownloadFloatLayerService$showQualityFloatLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = downloadFloatLayerService;
        this.$dialog = ogvVideoDownloadDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$showQualityFloatLayer$2(this.this$0, this.$dialog, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                gVar2 = gVar3;
                th = th;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        gVar = this.this$0.f92437k;
        OgvVideoDownloadDialog ogvVideoDownloadDialog = this.$dialog;
        gVar.f("QualityFloatLayer");
        try {
            this.L$0 = gVar;
            this.L$1 = "QualityFloatLayer";
            this.label = 1;
            if (ogvVideoDownloadDialog.j(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "QualityFloatLayer";
            gVar.j(str);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "QualityFloatLayer";
            gVar2 = gVar;
            gVar2.j(str);
            throw th;
        }
    }
}
