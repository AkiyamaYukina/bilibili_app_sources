package com.bilibili.studio.videoeditor.editor.common;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/common/PreviewItem.class */
@Keep
public class PreviewItem implements Cloneable, Serializable {
    public static final int SRC_LOCAL = 0;
    public static final int SRC_REMOTE = 1;
    public static final int SRC_UNDEFINED = -1;
    private int mResId;
    private int mSrc;
    private String mUrl;

    public PreviewItem() {
        this.mUrl = "";
        this.mSrc = -1;
    }

    public PreviewItem(int i7, int i8) {
        this.mUrl = "";
        this.mSrc = i7;
        this.mResId = i8;
    }

    public PreviewItem(int i7, @Nullable String str) {
        this.mUrl = "";
        this.mSrc = i7;
        this.mUrl = str == null ? "" : str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PreviewItem m10444clone() throws CloneNotSupportedException {
        return (PreviewItem) super.clone();
    }

    public int getLocalResId() {
        return this.mResId;
    }

    public String getRemoteUrl() {
        return this.mUrl;
    }

    public int getResId() {
        return this.mResId;
    }

    public int getSrc() {
        return this.mSrc;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setResId(int i7) {
        this.mResId = i7;
    }

    public void setSrc(int i7) {
        this.mSrc = i7;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public boolean useLocalPreview() {
        return this.mSrc == 0;
    }
}
