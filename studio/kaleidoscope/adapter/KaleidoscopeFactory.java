package com.bilibili.studio.kaleidoscope.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/KaleidoscopeFactory.class */
public final class KaleidoscopeFactory {
    public static final String SDK_MON = "Mon";
    public static final String SDK_NVS = "Nvs";

    @Nullable
    public static Kaleidoscope newKaleidoscope(@NonNull String str) {
        return new Kaleidoscope();
    }
}
