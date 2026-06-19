package com.bilibili.lib.tf.freedata.util;

import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.tf.TfTransformResp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/TfTransformKt.class */
public final class TfTransformKt {
    public static final boolean isSuccessful(@NotNull TfTransformResp tfTransformResp) {
        return tfTransformResp.getCode() == TfCode.OK && tfTransformResp.getTf();
    }
}
