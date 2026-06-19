package com.bilibili.opd.app.bizcommon.context.download.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/bean/PreloadResourceBean.class */
@Keep
public final class PreloadResourceBean {

    @Nullable
    private String duration;

    @Nullable
    private String fileName;

    @Nullable
    private String link;

    @Nullable
    private String md5;

    @Nullable
    private String modName;

    @Nullable
    private String modPoolName;

    @Nullable
    private Integer postcore;

    @Nullable
    private Integer projectId;

    @Nullable
    private String resourceType;

    @Nullable
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getModName() {
        return this.modName;
    }

    @Nullable
    public final String getModPoolName() {
        return this.modPoolName;
    }

    @Nullable
    public final Integer getPostcore() {
        return this.postcore;
    }

    @Nullable
    public final Integer getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    public final void setDuration(@Nullable String str) {
        this.duration = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setModName(@Nullable String str) {
        this.modName = str;
    }

    public final void setModPoolName(@Nullable String str) {
        this.modPoolName = str;
    }

    public final void setPostcore(@Nullable Integer num) {
        this.postcore = num;
    }

    public final void setProjectId(@Nullable Integer num) {
        this.projectId = num;
    }

    public final void setResourceType(@Nullable String str) {
        this.resourceType = str;
    }
}
