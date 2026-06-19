package com.bilibili.ogvcommon.image;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/image/c.class */
public interface c {
    default void onFailure() {
    }

    default void onResult(@NotNull Bitmap bitmap) {
    }
}
