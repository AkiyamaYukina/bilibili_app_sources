package com.bilibili.tensorflow.jsb;

import com.bilibili.common.webview.js.JsbDynamicServiceProvider;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/jsb/TFLiteModelServiceProvider$$asProvider$$Lambda.class */
public class TFLiteModelServiceProvider$$asProvider$$Lambda extends ProducerLambda<JsbDynamicServiceProvider> {
    public TFLiteModelServiceProvider$$asProvider$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new TFLiteModelServiceProvider$$asProvider$$Lambda(continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.tensorflow.jsb.a, java.lang.Object] */
    public Object invokeProducer() {
        return new Object().asProvider();
    }
}
