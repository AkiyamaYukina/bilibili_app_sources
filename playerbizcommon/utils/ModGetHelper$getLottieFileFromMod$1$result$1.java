package com.bilibili.playerbizcommon.utils;

import com.airbnb.lottie.LottieComposition;
import java.io.File;
import java.io.FileInputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/ModGetHelper$getLottieFileFromMod$1$result$1.class */
public final class ModGetHelper$getLottieFileFromMod$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LottieComposition>, Object> {
    final File $lottieFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModGetHelper$getLottieFileFromMod$1$result$1(File file, Continuation<? super ModGetHelper$getLottieFileFromMod$1$result$1> continuation) {
        super(2, continuation);
        this.$lottieFile = file;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModGetHelper$getLottieFileFromMod$1$result$1(this.$lottieFile, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LottieComposition> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return LottieComposition.Factory.fromInputStreamSync(new FileInputStream(this.$lottieFile));
    }
}
