package com.bilibili.studio.kaleidoscope.sdk;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoFrameRetriever.class */
public interface VideoFrameRetriever {
    Bitmap getFrameAtTimeWithCustomVideoFrameHeight(long j7, int i7);

    Object getVideoFrameRetriever();

    void release();

    void setVideoFrameRetriever(Object obj);
}
