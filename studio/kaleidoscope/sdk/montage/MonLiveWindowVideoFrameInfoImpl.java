package com.bilibili.studio.kaleidoscope.sdk.montage;

import com.bilibili.montage.MontageLiveWindow;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonLiveWindowVideoFrameInfoImpl.class */
public final class MonLiveWindowVideoFrameInfoImpl implements LiveWindow.b {
    private MontageLiveWindow.VideoFrameInfo mVideoFrameInfo;

    public MonLiveWindowVideoFrameInfoImpl(MontageLiveWindow.VideoFrameInfo videoFrameInfo) {
        this.mVideoFrameInfo = videoFrameInfo;
    }

    public static LiveWindow.b box(MontageLiveWindow.VideoFrameInfo videoFrameInfo) {
        return new MonLiveWindowVideoFrameInfoImpl(videoFrameInfo);
    }

    public static MontageLiveWindow.VideoFrameInfo unbox(LiveWindow.b bVar) {
        return (MontageLiveWindow.VideoFrameInfo) bVar.getVideoFrameInfo();
    }

    public float getCaptionAnchorX() {
        return this.mVideoFrameInfo.captionAnchorX;
    }

    public float getCaptionAnchorY() {
        return this.mVideoFrameInfo.captionAnchorY;
    }

    public float getCaptionRotationZ() {
        return this.mVideoFrameInfo.captionRotationZ;
    }

    public float getCaptionScaleX() {
        return this.mVideoFrameInfo.captionScaleX;
    }

    public float getCaptionScaleY() {
        return this.mVideoFrameInfo.captionScaleY;
    }

    public float getCaptionTransX() {
        return this.mVideoFrameInfo.captionTransX;
    }

    public float getCaptionTransY() {
        return this.mVideoFrameInfo.captionTransY;
    }

    public long getFrameId() {
        return this.mVideoFrameInfo.frameId;
    }

    public long getStreamTime() {
        return this.mVideoFrameInfo.streamTime;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindow.b
    public Object getVideoFrameInfo() {
        return this.mVideoFrameInfo;
    }

    public void setCaptionAnchorX(float f7) {
        this.mVideoFrameInfo.captionAnchorX = f7;
    }

    public void setCaptionAnchorY(float f7) {
        this.mVideoFrameInfo.captionAnchorY = f7;
    }

    public void setCaptionRotationZ(float f7) {
        this.mVideoFrameInfo.captionRotationZ = f7;
    }

    public void setCaptionScaleX(float f7) {
        this.mVideoFrameInfo.captionScaleX = f7;
    }

    public void setCaptionScaleY(float f7) {
        this.mVideoFrameInfo.captionScaleY = f7;
    }

    public void setCaptionTransX(float f7) {
        this.mVideoFrameInfo.captionTransX = f7;
    }

    public void setCaptionTransY(float f7) {
        this.mVideoFrameInfo.captionTransY = f7;
    }

    public void setFrameId(long j7) {
        this.mVideoFrameInfo.frameId = j7;
    }

    public void setStreamTime(long j7) {
        this.mVideoFrameInfo.streamTime = j7;
    }

    public void setVideoFrameInfo(Object obj) {
        this.mVideoFrameInfo = (MontageLiveWindow.VideoFrameInfo) obj;
    }
}
