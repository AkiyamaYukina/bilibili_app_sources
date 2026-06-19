package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import android.app.Activity;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/GRUrlDownloadManager$downloadVideoChunk$1.class */
final class GRUrlDownloadManager$downloadVideoChunk$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $act;
    final InterfaceC2297a $callback;
    final GRResourceInfo $info;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRUrlDownloadManager$downloadVideoChunk$1(InterfaceC2297a interfaceC2297a, GRResourceInfo gRResourceInfo, Activity activity, p pVar, Continuation<? super GRUrlDownloadManager$downloadVideoChunk$1> continuation) {
        super(2, continuation);
        this.$callback = interfaceC2297a;
        this.$info = gRResourceInfo;
        this.$act = activity;
        this.this$0 = pVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GRUrlDownloadManager$downloadVideoChunk$1(this.$callback, this.$info, this.$act, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ed  */
    /* JADX WARN: Type inference failed for: r0v203, types: [java.io.RandomAccessFile] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.GRUrlDownloadManager$downloadVideoChunk$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
