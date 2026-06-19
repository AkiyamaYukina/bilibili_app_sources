package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$showDownloadFloatDialog$3$1.class */
public final class DownloadFloatLayerService$showDownloadFloatDialog$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final OgvVideoDownloadDialog $dialog;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$showDownloadFloatDialog$3$1(OgvVideoDownloadDialog ogvVideoDownloadDialog, Continuation<? super DownloadFloatLayerService$showDownloadFloatDialog$3$1> continuation) {
        super(1, continuation);
        this.$dialog = ogvVideoDownloadDialog;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DownloadFloatLayerService$showDownloadFloatDialog$3$1(this.$dialog, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvVideoDownloadDialog ogvVideoDownloadDialog = this.$dialog;
            this.label = 1;
            if (ogvVideoDownloadDialog.j(this) == coroutine_suspended) {
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
