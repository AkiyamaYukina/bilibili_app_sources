package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BVideo.class */
@Keep
public class BVideo implements Serializable {
    public int bizFrom;
    public long duration;
    public long frameDuration;
    public long imageDuration;
    public int mediaFileType = 1;
    public float playRate = 1.0f;
    public String videoPath;
    public String voiceFx;

    public BVideo() {
    }

    public BVideo(String str) {
        this.videoPath = str;
    }
}
