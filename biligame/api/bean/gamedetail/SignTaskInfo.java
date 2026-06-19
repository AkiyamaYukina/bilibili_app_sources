package com.bilibili.biligame.api.bean.gamedetail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameGiftDetail;
import com.bilibili.bson.common.Bson;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/SignTaskInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class SignTaskInfo {
    public static final int $stable = 8;

    @SerializedName("activity_id")
    @Nullable
    private String activityId;

    @SerializedName("award_grant_status")
    private int awardGrantStatus;

    @SerializedName("complete_status")
    private int completeStatus;

    @SerializedName("condition_type")
    private int conditionType;

    @SerializedName("gift_info")
    @Nullable
    private BiligameGiftDetail giftInfo;

    @SerializedName("required_sign_count")
    private int requiredSignCount;

    @SerializedName("sign_date")
    private long signDate;

    @SerializedName("sign_gift_icon")
    @Nullable
    private String signGiftIcon;

    @SerializedName("task_id")
    @Nullable
    private String taskId;

    public SignTaskInfo() {
        this(null, 0L, null, 0, 0, 0, 0, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public SignTaskInfo(@Nullable String str, long j7, @Nullable String str2, int i7, int i8, int i9, int i10, @Nullable String str3, @Nullable BiligameGiftDetail biligameGiftDetail) {
        this.taskId = str;
        this.signDate = j7;
        this.activityId = str2;
        this.completeStatus = i7;
        this.awardGrantStatus = i8;
        this.conditionType = i9;
        this.requiredSignCount = i10;
        this.signGiftIcon = str3;
        this.giftInfo = biligameGiftDetail;
    }

    public /* synthetic */ SignTaskInfo(String str, long j7, String str2, int i7, int i8, int i9, int i10, String str3, BiligameGiftDetail biligameGiftDetail, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0L : j7, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? 0 : i7, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) != 0 ? 0 : i9, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : biligameGiftDetail);
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    public final int getAwardGrantStatus() {
        return this.awardGrantStatus;
    }

    public final int getCompleteStatus() {
        return this.completeStatus;
    }

    public final int getConditionType() {
        return this.conditionType;
    }

    @Nullable
    public final BiligameGiftDetail getGiftInfo() {
        return this.giftInfo;
    }

    public final int getRequiredSignCount() {
        return this.requiredSignCount;
    }

    public final long getSignDate() {
        return this.signDate;
    }

    @Nullable
    public final String getSignGiftIcon() {
        return this.signGiftIcon;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setAwardGrantStatus(int i7) {
        this.awardGrantStatus = i7;
    }

    public final void setCompleteStatus(int i7) {
        this.completeStatus = i7;
    }

    public final void setConditionType(int i7) {
        this.conditionType = i7;
    }

    public final void setGiftInfo(@Nullable BiligameGiftDetail biligameGiftDetail) {
        this.giftInfo = biligameGiftDetail;
    }

    public final void setRequiredSignCount(int i7) {
        this.requiredSignCount = i7;
    }

    public final void setSignDate(long j7) {
        this.signDate = j7;
    }

    public final void setSignGiftIcon(@Nullable String str) {
        this.signGiftIcon = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}
