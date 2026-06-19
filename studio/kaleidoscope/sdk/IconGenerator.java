package com.bilibili.studio.kaleidoscope.sdk;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/IconGenerator.class */
public interface IconGenerator {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/IconGenerator$IconCallback.class */
    public interface IconCallback {
        void onIconReady(Bitmap bitmap, long j7, long j8);
    }

    long getIcon(String str, long j7, int i7);

    long getIcon(String str, long j7, int i7, int i8);

    Bitmap getIconFromCache(String str, long j7, int i7);

    Bitmap getIconFromCache(String str, long j7, int i7, int i8);

    Object getIconGenerator();

    boolean isReleased();

    void release();

    void setIconCallback(IconCallback iconCallback);

    void setIconGenerator(Object obj);
}
