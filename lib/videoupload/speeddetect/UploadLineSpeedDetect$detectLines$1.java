package com.bilibili.lib.videoupload.speeddetect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadLineSpeedDetect$detectLines$1.class */
public final class UploadLineSpeedDetect$detectLines$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private Object L$0;
    Object L$1;
    int label;

    public UploadLineSpeedDetect$detectLines$1(Continuation<? super UploadLineSpeedDetect$detectLines$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploadLineSpeedDetect$detectLines$1 uploadLineSpeedDetect$detectLines$1 = new UploadLineSpeedDetect$detectLines$1(continuation);
        uploadLineSpeedDetect$detectLines$1.L$0 = obj;
        return uploadLineSpeedDetect$detectLines$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0373: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:168:0x0373 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0341 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect$detectLines$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
