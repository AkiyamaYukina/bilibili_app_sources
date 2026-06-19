package com.bilibili.tensorflow.data.common;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/k.class */
public final class k extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        BLog.w("TfRepository$insertTfData$$inlined$CoroutineExceptionHandler$1-handleException", "[tensorflow-TfRepository$insertTfData$$inlined$CoroutineExceptionHandler$1-handleException] Exception occurred.", th);
    }
}
