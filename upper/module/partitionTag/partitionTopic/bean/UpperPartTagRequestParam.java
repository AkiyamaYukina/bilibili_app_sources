package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import G0.d;
import I1.C2157f0;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import bf.a;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBeanV5;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/UpperPartTagRequestParam.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpperPartTagRequestParam implements Serializable {
    public static final int $stable = 8;
    private long childTypeId;

    @Nullable
    private String cover;

    @Nullable
    private String cover43;

    @Nullable
    private String desc;

    @Nullable
    private String filename;
    private boolean hidType;

    @Nullable
    private List<? extends UpperTagBeanV5> recTags;
    private int tagGrayValue;

    @Nullable
    private List<String> tags;

    @Nullable
    private String title;
    private long topicId;
    private boolean topicOpt;

    @Nullable
    private String uploadId;
    private int requestType = 1;
    private long humanTypeId = -1;

    @NotNull
    private String humanTypeName = "";

    @NotNull
    private String topicName = "";

    @NotNull
    private String aiUploadId = "";

    @NotNull
    public final String getAiUploadId() {
        return this.aiUploadId;
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

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    public final boolean getHidType() {
        return this.hidType;
    }

    public final long getHumanTypeId() {
        return this.humanTypeId;
    }

    @NotNull
    public final String getHumanTypeName() {
        return this.humanTypeName;
    }

    @Nullable
    public final List<UpperTagBeanV5> getRecTags() {
        return this.recTags;
    }

    public final int getRequestType() {
        return this.requestType;
    }

    public final int getTagGrayValue() {
        return this.tagGrayValue;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final String getTopicName() {
        return this.topicName;
    }

    public final boolean getTopicOpt() {
        return this.topicOpt;
    }

    @Nullable
    public final String getUploadId() {
        return this.uploadId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isHitTagGray() {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.tagGrayValue
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L1f
            kotlin.Lazy r0 = zw0.b.f130950a
            r7 = r0
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            java.lang.String r1 = "upper.publish_tag_config"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            r6 = r0
        L21:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam.isHitTagGray():boolean");
    }

    public final void setAiUploadId(@NotNull String str) {
        this.aiUploadId = str;
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

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setFilename(@Nullable String str) {
        this.filename = str;
    }

    public final void setHidType(boolean z6) {
        this.hidType = z6;
    }

    public final void setHumanTypeId(long j7) {
        this.humanTypeId = j7;
    }

    public final void setHumanTypeName(@NotNull String str) {
        this.humanTypeName = str;
    }

    public final void setRecTags(@Nullable List<? extends UpperTagBeanV5> list) {
        this.recTags = list;
    }

    public final void setRequestType(int i7) {
        this.requestType = i7;
    }

    public final void setTagGrayValue(int i7) {
        this.tagGrayValue = i7;
    }

    public final void setTags(@Nullable List<String> list) {
        this.tags = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }

    public final void setTopicName(@NotNull String str) {
        this.topicName = str;
    }

    public final void setTopicOpt(boolean z6) {
        this.topicOpt = z6;
    }

    public final void setUploadId(@Nullable String str) {
        this.uploadId = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.requestType;
        long j7 = this.childTypeId;
        List<String> list = this.tags;
        long j8 = this.topicId;
        String str = this.title;
        String str2 = this.cover;
        String str3 = this.desc;
        String str4 = this.filename;
        String str5 = this.uploadId;
        boolean z6 = this.hidType;
        boolean z7 = this.topicOpt;
        String str6 = this.aiUploadId;
        int i8 = this.tagGrayValue;
        StringBuilder sbA = C2157f0.a(i7, j7, "UpperPartTagRequestParam(requestType=", ", childTypeId=");
        sbA.append(", tags=");
        sbA.append(list);
        sbA.append(", topicId=");
        d.a(j8, ", title=", str, sbA);
        B.a(", cover=", str2, ", desc=", str3, sbA);
        B.a(", filename=", str4, ", uploadId=", str5, sbA);
        C4638g.b(", hidType=", ", topicOpt=", sbA, z6, z7);
        a.a(i8, ", aiUploadId=", str6, "tagNone=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
