package com.bilibili.studio.videoeditor.annual.bean.report;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/report/ReportUploadTaskInfo.class */
@Keep
public final class ReportUploadTaskInfo {

    @Nullable
    private String bizId;
    private long fileLength;

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;
    private long id;
    private boolean isFreeTrafic;
    private long mid;

    @Nullable
    private String profile = "";

    @Nullable
    private String uposUri;

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    public final long getFileLength() {
        return this.fileLength;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getId() {
        return this.id;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getProfile() {
        return this.profile;
    }

    @Nullable
    public final String getUposUri() {
        return this.uposUri;
    }

    public final boolean isFreeTrafic() {
        return this.isFreeTrafic;
    }

    public final void setBizId(@Nullable String str) {
        this.bizId = str;
    }

    public final void setFileLength(long j7) {
        this.fileLength = j7;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setFreeTrafic(boolean z6) {
        this.isFreeTrafic = z6;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setProfile(@Nullable String str) {
        this.profile = str;
    }

    public final void setUposUri(@Nullable String str) {
        this.uposUri = str;
    }
}
