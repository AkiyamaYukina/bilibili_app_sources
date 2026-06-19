package com.bilibili.studio.videoeditor.generalrender.bean;

import I.E;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import cf.c;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRRenderTaskStatusResult.class */
@Keep
public final class GRRenderTaskStatusResult {

    @Nullable
    private Integer errCode;

    @Nullable
    private String message;

    @Nullable
    private Float progress;

    @Nullable
    private String sign;

    @NotNull
    private String status;

    @Nullable
    private Long taskId;

    @Nullable
    private String url;

    @JSONCreator
    public GRRenderTaskStatusResult(@JSONField(name = "taskId") @Nullable Long l7, @JSONField(name = NotificationCompat.CATEGORY_STATUS) @NotNull String str, @JSONField(name = NotificationCompat.CATEGORY_PROGRESS) @Nullable Float f7, @JSONField(name = "url") @Nullable String str2, @JSONField(name = "errCode") @Nullable Integer num, @JSONField(name = "message") @Nullable String str3, @JSONField(name = "sign") @Nullable String str4) {
        this.taskId = l7;
        this.status = str;
        this.progress = f7;
        this.url = str2;
        this.errCode = num;
        this.message = str3;
        this.sign = str4;
    }

    public /* synthetic */ GRRenderTaskStatusResult(Long l7, String str, Float f7, String str2, Integer num, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l7, str, f7, str2, (i7 & 16) != 0 ? null : num, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ GRRenderTaskStatusResult copy$default(GRRenderTaskStatusResult gRRenderTaskStatusResult, Long l7, String str, Float f7, String str2, Integer num, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l7 = gRRenderTaskStatusResult.taskId;
        }
        if ((i7 & 2) != 0) {
            str = gRRenderTaskStatusResult.status;
        }
        if ((i7 & 4) != 0) {
            f7 = gRRenderTaskStatusResult.progress;
        }
        if ((i7 & 8) != 0) {
            str2 = gRRenderTaskStatusResult.url;
        }
        if ((i7 & 16) != 0) {
            num = gRRenderTaskStatusResult.errCode;
        }
        if ((i7 & 32) != 0) {
            str3 = gRRenderTaskStatusResult.message;
        }
        if ((i7 & 64) != 0) {
            str4 = gRRenderTaskStatusResult.sign;
        }
        return gRRenderTaskStatusResult.copy(l7, str, f7, str2, num, str3, str4);
    }

    @Nullable
    public final Long component1() {
        return this.taskId;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    @Nullable
    public final Float component3() {
        return this.progress;
    }

    @Nullable
    public final String component4() {
        return this.url;
    }

    @Nullable
    public final Integer component5() {
        return this.errCode;
    }

    @Nullable
    public final String component6() {
        return this.message;
    }

    @Nullable
    public final String component7() {
        return this.sign;
    }

    @NotNull
    public final GRRenderTaskStatusResult copy(@JSONField(name = "taskId") @Nullable Long l7, @JSONField(name = NotificationCompat.CATEGORY_STATUS) @NotNull String str, @JSONField(name = NotificationCompat.CATEGORY_PROGRESS) @Nullable Float f7, @JSONField(name = "url") @Nullable String str2, @JSONField(name = "errCode") @Nullable Integer num, @JSONField(name = "message") @Nullable String str3, @JSONField(name = "sign") @Nullable String str4) {
        return new GRRenderTaskStatusResult(l7, str, f7, str2, num, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRRenderTaskStatusResult)) {
            return false;
        }
        GRRenderTaskStatusResult gRRenderTaskStatusResult = (GRRenderTaskStatusResult) obj;
        return Intrinsics.areEqual(this.taskId, gRRenderTaskStatusResult.taskId) && Intrinsics.areEqual(this.status, gRRenderTaskStatusResult.status) && Intrinsics.areEqual(this.progress, gRRenderTaskStatusResult.progress) && Intrinsics.areEqual(this.url, gRRenderTaskStatusResult.url) && Intrinsics.areEqual(this.errCode, gRRenderTaskStatusResult.errCode) && Intrinsics.areEqual(this.message, gRRenderTaskStatusResult.message) && Intrinsics.areEqual(this.sign, gRRenderTaskStatusResult.sign);
    }

    @Nullable
    public final Integer getErrCode() {
        return this.errCode;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Float getProgress() {
        return this.progress;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l7 = this.taskId;
        int iHashCode = 0;
        int iA = E.a((l7 == null ? 0 : l7.hashCode()) * 31, 31, this.status);
        Float f7 = this.progress;
        int iHashCode2 = f7 == null ? 0 : f7.hashCode();
        String str = this.url;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.errCode;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.message;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sign;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return ((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final void setErrCode(@Nullable Integer num) {
        this.errCode = num;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setProgress(@Nullable Float f7) {
        this.progress = f7;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setStatus(@NotNull String str) {
        this.status = str;
    }

    public final void setTaskId(@Nullable Long l7) {
        this.taskId = l7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        Long l7 = this.taskId;
        String str = this.status;
        Float f7 = this.progress;
        String str2 = this.url;
        Integer num = this.errCode;
        String str3 = this.message;
        String str4 = this.sign;
        StringBuilder sbA = c.a("GRRenderTaskStatusResult(taskId=", ", status=", str, l7, ", progress=");
        sbA.append(f7);
        sbA.append(", url=");
        sbA.append(str2);
        sbA.append(", errCode=");
        y3.c.a(num, ", message=", str3, ", sign=", sbA);
        return C8770a.a(sbA, str4, ")");
    }
}
