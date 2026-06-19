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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$prepareModelAndPredict$tfByteBuffer$1.class */
final class VipOpenMembershipPredictTFClient$prepareModelAndPredict$tfByteBuffer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MappedByteBuffer>, Object> {
    final File $tfFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOpenMembershipPredictTFClient$prepareModelAndPredict$tfByteBuffer$1(File file, Continuation<? super VipOpenMembershipPredictTFClient$prepareModelAndPredict$tfByteBuffer$1> continuation) {
        super(2, continuation);
        this.$tfFile = file;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipOpenMembershipPredictTFClient$prepareModelAndPredict$tfByteBuffer$1(this.$tfFile, continuation);
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
        FileInputStream fileInputStream = new FileInputStream(this.$tfFile);
        try {
            MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, this.$tfFile.length());
            CloseableKt.closeFinally(fileInputStream, (Throwable) null);
            return map;
        } finally {
        }
    }
}
