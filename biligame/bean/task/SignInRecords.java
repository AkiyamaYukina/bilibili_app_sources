package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignInRecords.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SignInRecords {
    public static final int $stable = 8;

    @JSONField(name = "sign_in_record_id")
    @Nullable
    private String signInRecordId;

    @JSONField(name = "sign_in_time")
    private long signInTime;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @Nullable
    public final String getSignInRecordId() {
        return this.signInRecordId;
    }

    public final long getSignInTime() {
        return this.signInTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setSignInRecordId(@Nullable String str) {
        this.signInRecordId = str;
    }

    public final void setSignInTime(long j7) {
        this.signInTime = j7;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }
}
