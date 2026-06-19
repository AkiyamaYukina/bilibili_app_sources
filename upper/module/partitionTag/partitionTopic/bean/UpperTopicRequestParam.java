package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import O4.a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.paging.M;
import androidx.room.B;
import c6.P;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/UpperTopicRequestParam.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpperTopicRequestParam implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private String aiUploadId = "";
    private boolean canCreateTopic;
    private boolean canEditTopic;
    private long childTypeId;

    @Nullable
    private String cover;

    @Nullable
    private String cover43;
    private boolean cover43Auth;

    @Nullable
    private String desc;

    @Nullable
    private String filename;
    private long missionId;
    private long pid;

    @Nullable
    private String relationFrom;
    private boolean showTopicList;

    @Nullable
    private String title;

    @Nullable
    private String topicDesc;
    private long topicId;

    @Nullable
    private String topicName;
    private boolean topicOpt;

    @Nullable
    private String topicParent;
    private int topicSourceType;

    @Nullable
    private String uploadId;

    @NotNull
    public final String getAiUploadId() {
        return this.aiUploadId;
    }

    public final boolean getCanCreateTopic() {
        return this.canCreateTopic;
    }

    public final boolean getCanEditTopic() {
        return this.canEditTopic;
    }

    public final long getChildTypeId() {
        return this.childTypeId;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getCover43() {
        return this.cover43;
    }

    public final boolean getCover43Auth() {
        return this.cover43Auth;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    public final long getMissionId() {
        return this.missionId;
    }

    public final long getPid() {
        return this.pid;
    }

    @Nullable
    public final String getRelationFrom() {
        return this.relationFrom;
    }

    public final boolean getShowTopicList() {
        return this.showTopicList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTopicDesc() {
        return this.topicDesc;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @Nullable
    public final String getTopicName() {
        return this.topicName;
    }

    public final boolean getTopicOpt() {
        return this.topicOpt;
    }

    @Nullable
    public final String getTopicParent() {
        return this.topicParent;
    }

    public final int getTopicSourceType() {
        return this.topicSourceType;
    }

    @Nullable
    public final String getUploadId() {
        return this.uploadId;
    }

    public final void setAiUploadId(@NotNull String str) {
        this.aiUploadId = str;
    }

    public final void setCanCreateTopic(boolean z6) {
        this.canCreateTopic = z6;
    }

    public final void setCanEditTopic(boolean z6) {
        this.canEditTopic = z6;
    }

    public final void setChildTypeId(long j7) {
        this.childTypeId = j7;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCover43(@Nullable String str) {
        this.cover43 = str;
    }

    public final void setCover43Auth(boolean z6) {
        this.cover43Auth = z6;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setFilename(@Nullable String str) {
        this.filename = str;
    }

    public final void setMissionId(long j7) {
        this.missionId = j7;
    }

    public final void setPid(long j7) {
        this.pid = j7;
    }

    public final void setRelationFrom(@Nullable String str) {
        this.relationFrom = str;
    }

    public final void setShowTopicList(boolean z6) {
        this.showTopicList = z6;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTopicDesc(@Nullable String str) {
        this.topicDesc = str;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }

    public final void setTopicName(@Nullable String str) {
        this.topicName = str;
    }

    public final void setTopicOpt(boolean z6) {
        this.topicOpt = z6;
    }

    public final void setTopicParent(@Nullable String str) {
        this.topicParent = str;
    }

    public final void setTopicSourceType(int i7) {
        this.topicSourceType = i7;
    }

    public final void setUploadId(@Nullable String str) {
        this.uploadId = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.childTypeId;
        long j8 = this.missionId;
        long j9 = this.topicId;
        String str = this.topicName;
        String str2 = this.topicDesc;
        int i7 = this.topicSourceType;
        String str3 = this.title;
        String str4 = this.cover;
        String str5 = this.desc;
        String str6 = this.filename;
        String str7 = this.uploadId;
        boolean z6 = this.canCreateTopic;
        boolean z7 = this.showTopicList;
        String str8 = this.relationFrom;
        boolean z8 = this.topicOpt;
        String str9 = this.aiUploadId;
        long j10 = this.pid;
        StringBuilder sbA = z.a(j7, "UpperTopicRequestParam(childTypeId=", ", missionId=");
        sbA.append(j8);
        J1.z.a(j9, ", topicId=", ", topicName=", sbA);
        B.a(str, ", topicDesc=", str2, ", topicSourceType=", sbA);
        M.a(i7, ", title=", str3, ", cover=", sbA);
        B.a(str4, ", desc=", str5, ", filename=", sbA);
        B.a(str6, ", uploadId=", str7, ", canCreateTopic=", sbA);
        P.a(", canCreateTopic=", ", showTopicList=", sbA, z6, z6);
        a.d(", relationFrom=", str8, ", topicOpt=", sbA, z7);
        a.d(", aiUploadId=", str9, "，pid=", sbA, z8);
        return android.support.v4.media.session.a.a(sbA, j10, ")");
    }
}
