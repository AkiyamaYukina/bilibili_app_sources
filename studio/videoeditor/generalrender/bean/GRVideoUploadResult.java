package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRVideoUploadResult.class */
@Keep
public final class GRVideoUploadResult {

    @NotNull
    private String status;

    @NotNull
    private GRUploadInfoResult uploadInfo;

    @Nullable
    private JSONObject videoInfo;

    @JSONCreator
    public GRVideoUploadResult(@JSONField(name = NotificationCompat.CATEGORY_STATUS) @NotNull String str, @JSONField(name = "videoInfo") @Nullable JSONObject jSONObject, @JSONField(name = "uploadInfo") @NotNull GRUploadInfoResult gRUploadInfoResult) {
        this.status = str;
        this.videoInfo = jSONObject;
        this.uploadInfo = gRUploadInfoResult;
    }

    public static /* synthetic */ GRVideoUploadResult copy$default(GRVideoUploadResult gRVideoUploadResult, String str, JSONObject jSONObject, GRUploadInfoResult gRUploadInfoResult, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRVideoUploadResult.status;
        }
        if ((i7 & 2) != 0) {
            jSONObject = gRVideoUploadResult.videoInfo;
        }
        if ((i7 & 4) != 0) {
            gRUploadInfoResult = gRVideoUploadResult.uploadInfo;
        }
        return gRVideoUploadResult.copy(str, jSONObject, gRUploadInfoResult);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final JSONObject component2() {
        return this.videoInfo;
    }

    @NotNull
    public final GRUploadInfoResult component3() {
        return this.uploadInfo;
    }

    @NotNull
    public final GRVideoUploadResult copy(@JSONField(name = NotificationCompat.CATEGORY_STATUS) @NotNull String str, @JSONField(name = "videoInfo") @Nullable JSONObject jSONObject, @JSONField(name = "uploadInfo") @NotNull GRUploadInfoResult gRUploadInfoResult) {
        return new GRVideoUploadResult(str, jSONObject, gRUploadInfoResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRVideoUploadResult)) {
            return false;
        }
        GRVideoUploadResult gRVideoUploadResult = (GRVideoUploadResult) obj;
        return Intrinsics.areEqual(this.status, gRVideoUploadResult.status) && Intrinsics.areEqual(this.videoInfo, gRVideoUploadResult.videoInfo) && Intrinsics.areEqual(this.uploadInfo, gRVideoUploadResult.uploadInfo);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final GRUploadInfoResult getUploadInfo() {
        return this.uploadInfo;
    }

    @Nullable
    public final JSONObject getVideoInfo() {
        return this.videoInfo;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode();
        JSONObject jSONObject = this.videoInfo;
        return this.uploadInfo.hashCode() + (((iHashCode * 31) + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31);
    }

    public final void setStatus(@NotNull String str) {
        this.status = str;
    }

    public final void setUploadInfo(@NotNull GRUploadInfoResult gRUploadInfoResult) {
        this.uploadInfo = gRUploadInfoResult;
    }

    public final void setVideoInfo(@Nullable JSONObject jSONObject) {
        this.videoInfo = jSONObject;
    }

    @NotNull
    public String toString() {
        return "GRVideoUploadResult(status=" + this.status + ", videoInfo=" + this.videoInfo + ", uploadInfo=" + this.uploadInfo + ")";
    }
}
