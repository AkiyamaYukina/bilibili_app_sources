package com.bilibili.lib.videoupload.speeddetect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadBandwidthDetect$startBandwidthDetect$1.class */
public final class UploadBandwidthDetect$startBandwidthDetect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public UploadBandwidthDetect$startBandwidthDetect$1(Continuation<? super UploadBandwidthDetect$startBandwidthDetect$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadBandwidthDetect$startBandwidthDetect$1 uploadBandwidthDetect$startBandwidthDetect$1 = new UploadBandwidthDetect$startBandwidthDetect$1(continuation);
        uploadBandwidthDetect$startBandwidthDetect$1.L$0 = obj;
        return uploadBandwidthDetect$startBandwidthDetect$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0278 -> B:28:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.speeddetect.UploadBandwidthDetect$startBandwidthDetect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
