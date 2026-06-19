package com.bilibili.biligame.api.bean.gamedetail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/UserSignInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class UserSignInfo {
    public static final int $stable = 8;

    @SerializedName("has_finish_sign_activity")
    private boolean hasFinishSignActivity;

    @SerializedName("signed_today")
    private boolean signedToday;

    @SerializedName("total_sign_count")
    private int totalSignCount;

    public UserSignInfo() {
        this(false, false, 0, 7, null);
    }

    public UserSignInfo(boolean z6, boolean z7, int i7) {
        this.hasFinishSignActivity = z6;
        this.signedToday = z7;
        this.totalSignCount = i7;
    }

    public /* synthetic */ UserSignInfo(boolean z6, boolean z7, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z6, (i8 & 2) != 0 ? false : z7, (i8 & 4) != 0 ? 0 : i7);
    }

    public final boolean getHasFinishSignActivity() {
        return this.hasFinishSignActivity;
    }

    public final boolean getSignedToday() {
        return this.signedToday;
    }

    public final int getTotalSignCount() {
        return this.totalSignCount;
    }

    public final void setHasFinishSignActivity(boolean z6) {
        this.hasFinishSignActivity = z6;
    }

    public final void setSignedToday(boolean z6) {
        this.signedToday = z6;
    }

    public final void setTotalSignCount(int i7) {
        this.totalSignCount = i7;
    }
}
