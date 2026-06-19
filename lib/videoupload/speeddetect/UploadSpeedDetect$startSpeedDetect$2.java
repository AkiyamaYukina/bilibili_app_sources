package com.bilibili.lib.videoupload.speeddetect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadSpeedDetect$startSpeedDetect$2.class */
public final class UploadSpeedDetect$startSpeedDetect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public UploadSpeedDetect$startSpeedDetect$2(Continuation<? super UploadSpeedDetect$startSpeedDetect$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadSpeedDetect$startSpeedDetect$2 uploadSpeedDetect$startSpeedDetect$2 = new UploadSpeedDetect$startSpeedDetect$2(continuation);
        uploadSpeedDetect$startSpeedDetect$2.L$0 = obj;
        return uploadSpeedDetect$startSpeedDetect$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0187 A[EDGE_INSN: B:104:0x0187->B:35:0x0187 BREAK  A[LOOP:0: B:28:0x0124->B:34:0x017d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00cf -> B:27:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.speeddetect.UploadSpeedDetect$startSpeedDetect$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
