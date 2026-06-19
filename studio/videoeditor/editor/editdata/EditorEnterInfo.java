package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditorEnterInfo.class */
@Keep
public final class EditorEnterInfo {
    private int imageCount;
    private int intelligenceFrom;

    @NotNull
    private String materialPageLoad;
    private boolean needIntelligence;
    private long templateId;
    private boolean templateIsConfig;
    private boolean templateIsServer;
    private int videoCount;
    private long videoDuration;

    public EditorEnterInfo() {
        this(0, 0);
    }

    public EditorEnterInfo(int i7, int i8) {
        this.materialPageLoad = "";
        this.videoCount = i7;
        this.imageCount = i8;
    }

    public final int getImageCount() {
        return this.imageCount;
    }

    public final int getIntelligenceFrom() {
        return this.intelligenceFrom;
    }

    @NotNull
    public final String getMaterialPageLoad() {
        return this.materialPageLoad;
    }

    public final boolean getNeedIntelligence() {
        return this.needIntelligence;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final boolean getTemplateIsConfig() {
        return this.templateIsConfig;
    }

    public final boolean getTemplateIsServer() {
        return this.templateIsServer;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final void setImageCount(int i7) {
        this.imageCount = i7;
    }

    public final void setIntelligenceFrom(int i7) {
        this.intelligenceFrom = i7;
    }

    public final void setMaterialPageLoad(@NotNull String str) {
        this.materialPageLoad = str;
    }

    public final void setNeedIntelligence(boolean z6) {
        this.needIntelligence = z6;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    public final void setTemplateIsConfig(boolean z6) {
        this.templateIsConfig = z6;
    }

    public final void setTemplateIsServer(boolean z6) {
        this.templateIsServer = z6;
    }

    public final void setVideoCount(int i7) {
        this.videoCount = i7;
    }

    public final void setVideoDuration(long j7) {
        this.videoDuration = j7;
    }
}
