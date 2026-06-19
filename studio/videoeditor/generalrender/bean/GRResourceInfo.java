package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRResourceInfo.class */
@Keep
public class GRResourceInfo {

    @Nullable
    private String hash;

    @Nullable
    private String mimeType;

    @Nullable
    private String range;

    @Nullable
    private String source;

    @Nullable
    private String sourceType;
    private long startTime;
    private long templateId;
    private int templateLoadFrom;
    private long ttl = 86400;

    @NotNull
    private String config = "";

    @NotNull
    private String name = "";

    @NotNull
    private String path = "";

    @NotNull
    private String flowId = "";

    @NotNull
    public final String getConfig() {
        return this.config;
    }

    @NotNull
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getRange() {
        return this.range;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSourceType() {
        return this.sourceType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final int getTemplateLoadFrom() {
        return this.templateLoadFrom;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final void setConfig(@NotNull String str) {
        this.config = str;
    }

    public final void setFlowId(@NotNull String str) {
        this.flowId = str;
    }

    public final void setHash(@Nullable String str) {
        this.hash = str;
    }

    public final void setMimeType(@Nullable String str) {
        this.mimeType = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setPath(@NotNull String str) {
        this.path = str;
    }

    public final void setRange(@Nullable String str) {
        this.range = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setSourceType(@Nullable String str) {
        this.sourceType = str;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    public final void setTemplateLoadFrom(int i7) {
        this.templateLoadFrom = i7;
    }

    public final void setTtl(long j7) {
        this.ttl = j7;
    }
}
