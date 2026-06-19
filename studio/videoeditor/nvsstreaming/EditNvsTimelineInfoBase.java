package com.bilibili.studio.videoeditor.nvsstreaming;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/nvsstreaming/EditNvsTimelineInfoBase.class */
@Keep
public class EditNvsTimelineInfoBase {
    public static final int DEFAULT_AUDIO_CHANNEL_COUNT = 2;
    public static final int DEFAULT_FPS = 30;
    public static final int DEFAULT_SAMPLE_RATE = 44100;
    private boolean enableRenderOrderByZValue;
    private int mAudioChannelCount;
    private int mFps;
    private ResolutionType mResolutionType;
    private int mSampleRate;
    private int mVideoBitrate;
    private Size mVideoSize;

    public EditNvsTimelineInfoBase() {
        this.mResolutionType = ResolutionType.RES_1080;
        this.enableRenderOrderByZValue = false;
        this.mVideoSize = new Size(0, 0);
        this.mFps = 30;
        this.mSampleRate = DEFAULT_SAMPLE_RATE;
        this.mAudioChannelCount = 2;
    }

    public EditNvsTimelineInfoBase(Size size, int i7, int i8, int i9, int i10) {
        this.mResolutionType = ResolutionType.RES_1080;
        this.enableRenderOrderByZValue = false;
        this.mVideoSize = size;
        this.mVideoBitrate = i7;
        this.mFps = i8;
        this.mSampleRate = i9;
        this.mAudioChannelCount = i10;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditNvsTimelineInfoBase m10486clone() {
        EditNvsTimelineInfoBase editNvsTimelineInfoBase = new EditNvsTimelineInfoBase(this.mVideoSize, this.mVideoBitrate, this.mFps, this.mSampleRate, this.mAudioChannelCount);
        editNvsTimelineInfoBase.setResolutionType(this.mResolutionType);
        editNvsTimelineInfoBase.setEnableRenderOrderByZValue(this.enableRenderOrderByZValue);
        return editNvsTimelineInfoBase;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditNvsTimelineInfoBase)) {
            return false;
        }
        EditNvsTimelineInfoBase editNvsTimelineInfoBase = (EditNvsTimelineInfoBase) obj;
        if (this.mVideoBitrate != editNvsTimelineInfoBase.mVideoBitrate || this.mFps != editNvsTimelineInfoBase.mFps || this.mSampleRate != editNvsTimelineInfoBase.mSampleRate || this.mAudioChannelCount != editNvsTimelineInfoBase.mAudioChannelCount || this.enableRenderOrderByZValue != editNvsTimelineInfoBase.enableRenderOrderByZValue || !Objects.equals(this.mVideoSize, editNvsTimelineInfoBase.mVideoSize) || this.mResolutionType != editNvsTimelineInfoBase.mResolutionType) {
            z6 = false;
        }
        return z6;
    }

    public int getAudioChannelCount() {
        return this.mAudioChannelCount;
    }

    public boolean getEnableRenderOrderByZValue() {
        return this.enableRenderOrderByZValue;
    }

    public int getFps() {
        return this.mFps;
    }

    public ResolutionType getResolutionType() {
        return this.mResolutionType;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getVideoBitrate() {
        return this.mVideoBitrate;
    }

    public Size getVideoSize() {
        return this.mVideoSize;
    }

    public int hashCode() {
        return Objects.hash(this.mVideoSize, Integer.valueOf(this.mVideoBitrate), Integer.valueOf(this.mFps), Integer.valueOf(this.mSampleRate), Integer.valueOf(this.mAudioChannelCount), this.mResolutionType, Boolean.valueOf(this.enableRenderOrderByZValue));
    }

    public boolean isVideoSizeInvalid() {
        Size size = this.mVideoSize;
        return size == null || size.getWidth() <= 0 || this.mVideoSize.getHeight() <= 0;
    }

    public void setAudioChannelCount(int i7) {
        this.mAudioChannelCount = i7;
    }

    public void setEnableRenderOrderByZValue(boolean z6) {
        this.enableRenderOrderByZValue = z6;
    }

    public void setFps(int i7) {
        this.mFps = i7;
    }

    public void setResolutionType(ResolutionType resolutionType) {
        this.mResolutionType = resolutionType;
    }

    public void setSampleRate(int i7) {
        this.mSampleRate = i7;
    }

    public void setVideoBitrate(int i7) {
        this.mVideoBitrate = i7;
    }

    public void setVideoSize(Size size) {
        this.mVideoSize = size;
    }
}
