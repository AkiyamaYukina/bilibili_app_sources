package com.bilibili.tensorflow.model.mem;

import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$tfStrictByteBuffer$1.class */
public final class OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$tfStrictByteBuffer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MappedByteBuffer>, Object> {
    final File $tfStrictFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$tfStrictByteBuffer$1(File file, Continuation<? super OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$tfStrictByteBuffer$1> continuation) {
        super(2, continuation);
        this.$tfStrictFile = file;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$tfStrictByteBuffer$1(this.$tfStrictFile, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MappedByteBuffer> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FileInputStream fileInputStream = new FileInputStream(this.$tfStrictFile);
        try {
            MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, this.$tfStrictFile.length());
            CloseableKt.closeFinally(fileInputStream, (Throwable) null);
            return map;
        } finally {
        }
    }
}
