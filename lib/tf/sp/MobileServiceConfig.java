package com.bilibili.lib.tf.sp;

import androidx.annotation.NonNull;
import com.bilibili.lib.tf.TfResourceConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/sp/MobileServiceConfig.class */
public class MobileServiceConfig {

    @NonNull
    public final String activeUrl;

    @NonNull
    public final TfResourceConfig cardResource;

    @NonNull
    public final TfResourceConfig packgeResource;

    public MobileServiceConfig(@NonNull String str, @NonNull TfResourceConfig tfResourceConfig, @NonNull TfResourceConfig tfResourceConfig2) {
        this.activeUrl = str;
        this.cardResource = tfResourceConfig;
        this.packgeResource = tfResourceConfig2;
    }
}
