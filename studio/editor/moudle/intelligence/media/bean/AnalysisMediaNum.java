package com.bilibili.studio.editor.moudle.intelligence.media.bean;

import androidx.annotation.Keep;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/bean/AnalysisMediaNum.class */
@Keep
public class AnalysisMediaNum {
    public int filterCount = 0;
    public int videoCount = 0;
    public int imageCount = 0;
    public int videoCacheCount = 0;
    public int imageCacheCount = 0;

    public int getNoCacheCount() {
        return ((this.videoCount + this.imageCount) - this.videoCacheCount) - this.imageCacheCount;
    }

    public int getValidCount() {
        return this.videoCount + this.imageCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnalysisMediaNum{filter=");
        sb.append(this.filterCount);
        sb.append(", video=");
        sb.append(this.videoCount);
        sb.append(", image=");
        sb.append(this.imageCount);
        sb.append(", videoCache=");
        sb.append(this.videoCacheCount);
        sb.append(", imageCache=");
        return C3269h.a(sb, this.imageCacheCount, '}');
    }
}
