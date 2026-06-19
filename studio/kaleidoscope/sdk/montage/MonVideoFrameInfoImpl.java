package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageVideoFrameInfo;
import com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoFrameInfoImpl.class */
public final class MonVideoFrameInfoImpl implements VideoFrameInfo {
    private MontageVideoFrameInfo mMontageVideoFrameInfo;

    private MonVideoFrameInfoImpl(@NonNull MontageVideoFrameInfo montageVideoFrameInfo) {
        this.mMontageVideoFrameInfo = montageVideoFrameInfo;
    }

    @NonNull
    public static VideoFrameInfo box(@NonNull MontageVideoFrameInfo montageVideoFrameInfo) {
        return new MonVideoFrameInfoImpl(montageVideoFrameInfo);
    }

    @NonNull
    public static MontageVideoFrameInfo unbox(@NonNull VideoFrameInfo videoFrameInfo) {
        return (MontageVideoFrameInfo) videoFrameInfo.getVideoFrameInfo();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public int getDisplayRotation() {
        return this.mMontageVideoFrameInfo.displayRotation;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public int getFrameHeight() {
        return this.mMontageVideoFrameInfo.frameHeight;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public long getFrameTimestamp() {
        return this.mMontageVideoFrameInfo.frameTimestamp;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public int getFrameWidth() {
        return this.mMontageVideoFrameInfo.frameWidth;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public int getPixelFormat() {
        return this.mMontageVideoFrameInfo.pixelFormat;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public Object getVideoFrameInfo() {
        return this.mMontageVideoFrameInfo;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public void setDisplayRotation(int i7) {
        this.mMontageVideoFrameInfo.displayRotation = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public void setFrameHeight(int i7) {
        this.mMontageVideoFrameInfo.frameHeight = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public void setFrameTimestamp(long j7) {
        this.mMontageVideoFrameInfo.frameTimestamp = j7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public void setFrameWidth(int i7) {
        this.mMontageVideoFrameInfo.frameWidth = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo
    public void setVideoFrameInfo(Object obj) {
        this.mMontageVideoFrameInfo = (MontageVideoFrameInfo) obj;
    }
}
