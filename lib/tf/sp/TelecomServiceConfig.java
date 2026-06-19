package com.bilibili.lib.tf.sp;

import androidx.annotation.NonNull;
import com.bilibili.lib.tf.TfResourceConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/sp/TelecomServiceConfig.class */
public class TelecomServiceConfig {

    @NonNull
    public final String activeUrl;

    @NonNull
    public final TfResourceConfig cardResource;

    public TelecomServiceConfig(@NonNull String str, @NonNull TfResourceConfig tfResourceConfig) {
        this.activeUrl = str;
        this.cardResource = tfResourceConfig;
    }
}
