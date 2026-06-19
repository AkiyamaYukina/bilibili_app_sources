package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameAbExpInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameAbExpInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "exp_end_time")
    private long expEndTime;

    @JSONField(name = "exp_start_time")
    private long expStartTime;

    @JSONField(name = "ext_info")
    @Nullable
    private JSONObject extInfo;

    @JSONField(name = "hit_exp")
    private boolean hitExp;

    @JSONField(name = "app_name")
    @Nullable
    private String appName = "";

    @JSONField(name = "group_id")
    @Nullable
    private String groupId = "";

    @JSONField(name = "group_name")
    @Nullable
    private String groupName = "";

    @JSONField(name = "exp_id")
    @Nullable
    private String expId = "";

    @JSONField(name = "exp_name")
    @Nullable
    private String expName = "";

    @JSONField(name = "message")
    @Nullable
    private String message = "";

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    public final long getExpEndTime() {
        return this.expEndTime;
    }

    @Nullable
    public final String getExpId() {
        return this.expId;
    }

    @Nullable
    public final String getExpName() {
        return this.expName;
    }

    public final long getExpStartTime() {
        return this.expStartTime;
    }

    @Nullable
    public final JSONObject getExtInfo() {
        return this.extInfo;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    public final boolean getHitExp() {
        return this.hitExp;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setExpEndTime(long j7) {
        this.expEndTime = j7;
    }

    public final void setExpId(@Nullable String str) {
        this.expId = str;
    }

    public final void setExpName(@Nullable String str) {
        this.expName = str;
    }

    public final void setExpStartTime(long j7) {
        this.expStartTime = j7;
    }

    public final void setExtInfo(@Nullable JSONObject jSONObject) {
        this.extInfo = jSONObject;
    }

    public final void setGroupId(@Nullable String str) {
        this.groupId = str;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setHitExp(boolean z6) {
        this.hitExp = z6;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @NotNull
    public final String toJsonString() {
        return JSON.toJSONString(this);
    }
}
