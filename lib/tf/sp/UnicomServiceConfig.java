package com.bilibili.lib.tf.sp;

import androidx.annotation.NonNull;
import com.bilibili.lib.tf.TfResourceConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/sp/UnicomServiceConfig.class */
public class UnicomServiceConfig {

    @NonNull
    public final String activeUrl;

    @NonNull
    public final TfResourceConfig cardResource;
    public final boolean cdnTransformNewUrlHttps;
    public final boolean httpsCdnTransform;

    @NonNull
    public final TfResourceConfig packgeResource;

    public UnicomServiceConfig(@NonNull String str, @NonNull TfResourceConfig tfResourceConfig, @NonNull TfResourceConfig tfResourceConfig2, boolean z6, boolean z7) {
        this.activeUrl = str;
        this.cardResource = tfResourceConfig;
        this.packgeResource = tfResourceConfig2;
        this.httpsCdnTransform = z6;
        this.cdnTransformNewUrlHttps = z7;
    }
}
