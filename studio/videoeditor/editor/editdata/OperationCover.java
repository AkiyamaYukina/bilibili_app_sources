package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/OperationCover.class */
@Keep
public class OperationCover {
    private float captionScale;
    private int captionTempId;

    @Nullable
    private String captionText;

    @Nullable
    private String cropPath;

    @Nullable
    private String localPath;
    private int location;

    @Nullable
    private String offsetXY;
    private long topicId;

    public float getCaptionScale() {
        return this.captionScale;
    }

    public int getCaptionTempId() {
        return this.captionTempId;
    }

    @Nullable
    public String getCaptionText() {
        return this.captionText;
    }

    @Nullable
    public String getCropPath() {
        return this.cropPath;
    }

    @Nullable
    public String getLocalPath() {
        return this.localPath;
    }

    public int getLocation() {
        return this.location;
    }

    @Nullable
    public String getOffsetXY() {
        return this.offsetXY;
    }

    public long getTopicId() {
        return this.topicId;
    }

    public void setCaptionScale(float f7) {
        this.captionScale = f7;
    }

    public void setCaptionTempId(int i7) {
        this.captionTempId = i7;
    }

    public void setCaptionText(@Nullable String str) {
        this.captionText = str;
    }

    public void setCropPath(@Nullable String str) {
        this.cropPath = str;
    }

    public void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public void setLocation(int i7) {
        this.location = i7;
    }

    public void setOffsetXY(@Nullable String str) {
        this.offsetXY = str;
    }

    public void setTopicId(long j7) {
        this.topicId = j7;
    }
}
