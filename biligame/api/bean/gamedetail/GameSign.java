package com.bilibili.biligame.api.bean.gamedetail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameSign.class */
@StabilityInferred(parameters = 0)
@Bson
public class GameSign {
    public static final int $stable = 8;

    @SerializedName("activity_id")
    @Nullable
    private String activityId;

    @SerializedName("activity_status")
    private int activityStatus;

    @SerializedName("activity_type")
    private int activityType;

    @SerializedName("end_time")
    private long endTime;

    @SerializedName("game_base_id")
    private int gameBaseId;

    @SerializedName("max_sign_times")
    private int maxSignTimes;

    @SerializedName("sign_task_info_list")
    @Nullable
    private List<SignTaskInfo> signTaskInfoList;

    @SerializedName("start_time")
    private long startTime;

    @SerializedName("title")
    @Nullable
    private String title;

    @SerializedName("user_sign_info")
    @Nullable
    private UserSignInfo userSignInfo;

    public GameSign() {
        this(null, 0L, 0L, 0, 0, null, 0, 0, null, null, 1023, null);
    }

    public GameSign(@Nullable String str, long j7, long j8, int i7, int i8, @Nullable String str2, int i9, int i10, @Nullable List<SignTaskInfo> list, @Nullable UserSignInfo userSignInfo) {
        this.activityId = str;
        this.startTime = j7;
        this.endTime = j8;
        this.activityType = i7;
        this.activityStatus = i8;
        this.title = str2;
        this.gameBaseId = i9;
        this.maxSignTimes = i10;
        this.signTaskInfoList = list;
        this.userSignInfo = userSignInfo;
    }

    public /* synthetic */ GameSign(String str, long j7, long j8, int i7, int i8, String str2, int i9, int i10, List list, UserSignInfo userSignInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0L : j7, (i11 & 4) != 0 ? 0L : j8, (i11 & 8) != 0 ? 0 : i7, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? 0 : i9, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : userSignInfo);
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    public final int getActivityStatus() {
        return this.activityStatus;
    }

    public final int getActivityType() {
        return this.activityType;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final int getMaxSignTimes() {
        return this.maxSignTimes;
    }

    @Nullable
    public final List<SignTaskInfo> getSignTaskInfoList() {
        return this.signTaskInfoList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final UserSignInfo getUserSignInfo() {
        return this.userSignInfo;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setActivityStatus(int i7) {
        this.activityStatus = i7;
    }

    public final void setActivityType(int i7) {
        this.activityType = i7;
    }

    public final void setEndTime(long j7) {
        this.endTime = j7;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setMaxSignTimes(int i7) {
        this.maxSignTimes = i7;
    }

    public final void setSignTaskInfoList(@Nullable List<SignTaskInfo> list) {
        this.signTaskInfoList = list;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUserSignInfo(@Nullable UserSignInfo userSignInfo) {
        this.userSignInfo = userSignInfo;
    }
}
