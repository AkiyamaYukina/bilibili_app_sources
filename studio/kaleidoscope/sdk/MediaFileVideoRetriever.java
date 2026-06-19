package com.bilibili.studio.kaleidoscope.sdk;

import android.os.Handler;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MediaFileVideoRetriever.class */
public interface MediaFileVideoRetriever {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MediaFileVideoRetriever$MeidaFileVideoRetrieverCallback.class */
    public interface MeidaFileVideoRetrieverCallback {
        void notifyFinsih(long j7, int i7);

        void notifyProgress(long j7, float f7);

        void notifySengmentData(long j7, VideoFrameInfo videoFrameInfo, ByteBuffer byteBuffer);

        void notifySengmentData(long j7, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10);
    }

    void cancelTask(long j7);

    long decodeVideoSegment(String str, long j7, long j8, int i7, int i8, int i9, int i10);

    Object getMediaFileVideoRetriever();

    void release();

    void setMediaFileVideoRetriever(Object obj);

    void setMeidaFileVideoRetrieverCallback(MeidaFileVideoRetrieverCallback meidaFileVideoRetrieverCallback, Handler handler);
}
