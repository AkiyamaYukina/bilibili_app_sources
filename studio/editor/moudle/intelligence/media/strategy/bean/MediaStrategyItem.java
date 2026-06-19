package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/MediaStrategyItem.class */
@Keep
public class MediaStrategyItem {
    public static final String SOURCE_FROM_ALBUM = "相册";
    public static final String SOURCE_FROM_ALL = "全部";
    public static final String SOURCE_FROM_OTHER = "其他";
    private MediaDateAttr dateAttr;
    private boolean isVideo;
    private String label;
    private String modVersion;
    private ImageItem source;
    private boolean isCoverAnalysisLabel = false;
    private int priority = Integer.MAX_VALUE;
    private String materialKey = "";
    private String sourceType = null;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MediaStrategyItem m10107clone() {
        MediaStrategyItem mediaStrategyItem = new MediaStrategyItem();
        ImageItem imageItem = this.source;
        if (imageItem != null) {
            mediaStrategyItem.source = imageItem.m10468clone();
        }
        mediaStrategyItem.label = this.label;
        mediaStrategyItem.isCoverAnalysisLabel = this.isCoverAnalysisLabel;
        mediaStrategyItem.modVersion = this.modVersion;
        mediaStrategyItem.isVideo = this.isVideo;
        mediaStrategyItem.priority = this.priority;
        mediaStrategyItem.dateAttr = this.dateAttr;
        mediaStrategyItem.materialKey = this.materialKey;
        mediaStrategyItem.sourceType = this.sourceType;
        return mediaStrategyItem;
    }

    public MediaDateAttr getDateAttr() {
        return this.dateAttr;
    }

    @Nullable
    public String getLabel() {
        return this.label;
    }

    public String getMaterialKey() {
        return this.materialKey;
    }

    public String getModVersion() {
        return this.modVersion;
    }

    public int getPriority() {
        return this.priority;
    }

    public ImageItem getSource() {
        return this.source;
    }

    public String getSourceType() {
        if (!TextUtils.isEmpty(this.sourceType)) {
            return this.sourceType;
        }
        String str = this.source.path;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = SOURCE_FROM_OTHER;
        if (zIsEmpty) {
            return SOURCE_FROM_OTHER;
        }
        if (this.isVideo) {
            if (str.contains("录屏") || StringsKt.l(str, "Camera") || StringsKt.l(str, "Picture")) {
                str2 = SOURCE_FROM_ALBUM;
            }
            this.sourceType = str2;
        } else {
            if (StringsKt.l(str, "ScreenShot") || StringsKt.l(str, "Camera")) {
                str2 = SOURCE_FROM_ALBUM;
            }
            this.sourceType = str2;
        }
        return this.sourceType;
    }

    public boolean isCoverAnalysisLabel() {
        return this.isCoverAnalysisLabel;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public void setCoverAnalysisLabel(boolean z6) {
        this.isCoverAnalysisLabel = z6;
    }

    public void setDateAttr(MediaDateAttr mediaDateAttr) {
        this.dateAttr = mediaDateAttr;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setMaterialKey(String str) {
        this.materialKey = str;
    }

    public void setModVersion(String str) {
        this.modVersion = str;
    }

    public void setPriority(int i7) {
        this.priority = i7;
    }

    public void setSource(ImageItem imageItem) {
        this.source = imageItem;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setVideo(boolean z6) {
        this.isVideo = z6;
    }

    @NonNull
    public String toString() {
        ImageItem imageItem = this.source;
        return "MediaStrategyItem{label='" + this.label + ", priority=" + this.priority + ", modVersion=" + this.modVersion + ", isVideo='" + this.isVideo + ", source='" + (imageItem != null ? imageItem.path : "") + '}';
    }
}
