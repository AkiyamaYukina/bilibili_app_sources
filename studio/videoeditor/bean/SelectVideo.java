package com.bilibili.studio.videoeditor.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/SelectVideo.class */
@Keep
public class SelectVideo implements Serializable {
    public static final String MIME_TYPE_IMAGE_PREFIX = "image";
    public static final String MIME_TYPE_VIDEO_PREFIX = "video";
    public int bizFrom;
    public long duration;
    public int height;
    public long id;
    public long imageDuration;
    private int mRoleInTheme;
    public String mimeType;
    public float playRate;
    public long videoBitrate;
    public int videoFps;
    public String videoPath;
    public String voiceFx;
    public int width;

    public SelectVideo() {
        this.playRate = 1.0f;
        this.mRoleInTheme = 0;
        this.bizFrom = 0;
        this.voiceFx = "";
        this.id = 0L;
    }

    public SelectVideo(String str) {
        this.playRate = 1.0f;
        this.mRoleInTheme = 0;
        this.bizFrom = 0;
        this.voiceFx = "";
        this.id = 0L;
        this.videoPath = str;
    }

    public SelectVideo(@Nullable String str, int i7) {
        this.playRate = 1.0f;
        this.mRoleInTheme = 0;
        this.voiceFx = "";
        this.id = 0L;
        this.videoPath = str;
        this.bizFrom = i7;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SelectVideo m10404clone() {
        SelectVideo selectVideo = new SelectVideo(this.videoPath);
        selectVideo.playRate = this.playRate;
        selectVideo.bizFrom = this.bizFrom;
        selectVideo.voiceFx = this.voiceFx;
        selectVideo.setRoleInTheme(this.mRoleInTheme);
        selectVideo.duration = this.duration;
        selectVideo.mimeType = this.mimeType;
        selectVideo.width = this.width;
        selectVideo.height = this.height;
        selectVideo.videoBitrate = this.videoBitrate;
        selectVideo.videoFps = this.videoFps;
        selectVideo.id = this.id;
        selectVideo.imageDuration = this.imageDuration;
        return selectVideo;
    }

    public int getRoleInTheme() {
        return this.mRoleInTheme;
    }

    public boolean isImage() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("image");
    }

    public boolean isVideo() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("video");
    }

    public void setRoleInTheme(int i7) {
        this.mRoleInTheme = i7;
    }
}
