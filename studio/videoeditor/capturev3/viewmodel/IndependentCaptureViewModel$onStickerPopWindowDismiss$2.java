package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/IndependentCaptureViewModel$onStickerPopWindowDismiss$2.class */
public final class IndependentCaptureViewModel$onStickerPopWindowDismiss$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final IndependentCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentCaptureViewModel$onStickerPopWindowDismiss$2(IndependentCaptureViewModel independentCaptureViewModel, Continuation<? super IndependentCaptureViewModel$onStickerPopWindowDismiss$2> continuation) {
        super(2, continuation);
        this.this$0 = independentCaptureViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndependentCaptureViewModel$onStickerPopWindowDismiss$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel$onStickerPopWindowDismiss$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
