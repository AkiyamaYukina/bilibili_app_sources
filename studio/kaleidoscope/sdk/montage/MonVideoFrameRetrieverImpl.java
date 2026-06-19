package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bilibili.montage.avutil.MontageVideoFrameRetriever;
import com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoFrameRetrieverImpl.class */
public final class MonVideoFrameRetrieverImpl implements VideoFrameRetriever {
    private static final String TAG = "Mon.VFR.Impl";
    private MontageVideoFrameRetriever mMontageVideoFrameRetriever;

    private MonVideoFrameRetrieverImpl(@NonNull MontageVideoFrameRetriever montageVideoFrameRetriever) {
        this.mMontageVideoFrameRetriever = montageVideoFrameRetriever;
    }

    @NonNull
    public static VideoFrameRetriever box(@NonNull MontageVideoFrameRetriever montageVideoFrameRetriever) {
        return new MonVideoFrameRetrieverImpl(montageVideoFrameRetriever);
    }

    @NonNull
    public static MontageVideoFrameRetriever unbox(@NonNull VideoFrameRetriever videoFrameRetriever) {
        return (MontageVideoFrameRetriever) videoFrameRetriever.getVideoFrameRetriever();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever
    public Bitmap getFrameAtTimeWithCustomVideoFrameHeight(long j7, int i7) {
        return this.mMontageVideoFrameRetriever.getFrameAtTimeWithCustomVideoFrameHeight(j7, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever
    public Object getVideoFrameRetriever() {
        return this.mMontageVideoFrameRetriever;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever
    public void release() {
        this.mMontageVideoFrameRetriever.release();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever
    public void setVideoFrameRetriever(Object obj) {
        this.mMontageVideoFrameRetriever = (MontageVideoFrameRetriever) obj;
    }
}
