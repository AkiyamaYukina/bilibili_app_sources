package com.bilibili.biligame.api.bean.gamedetail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameSignActivityDetail.class */
@StabilityInferred(parameters = 0)
@Bson
public final class GameSignActivityDetail extends GameSign {
    public static final int $stable = 8;

    @SerializedName("activity_background_color")
    @Nullable
    private String activityBackgroundColor;

    @SerializedName("activity_desc")
    @Nullable
    private String activityDesc;

    @SerializedName("activity_end")
    private boolean activityEnd;

    @SerializedName("code_end_time")
    @Nullable
    private String codeEndTime;

    @SerializedName("days_before_end")
    private int daysBeforeEnd;

    @SerializedName("description_tpl")
    @Nullable
    private String description;

    @SerializedName("game_info")
    @Nullable
    private BiligameMainGame gameInfo;

    @SerializedName("gift_usage")
    @Nullable
    private String giftUsage;

    @SerializedName("prop_pic_url")
    @Nullable
    private String propPicUrl;

    @Nullable
    private List<SignTaskInfo> signGiftList;

    public GameSignActivityDetail() {
        this(null, null, null, null, 0, false, null, null, null, null, 1023, null);
    }

    public GameSignActivityDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, boolean z6, @Nullable String str5, @Nullable BiligameMainGame biligameMainGame, @Nullable List<SignTaskInfo> list, @Nullable String str6) {
        super(null, 0L, 0L, 0, 0, null, 0, 0, null, null, 1023, null);
        this.activityDesc = str;
        this.propPicUrl = str2;
        this.giftUsage = str3;
        this.codeEndTime = str4;
        this.daysBeforeEnd = i7;
        this.activityEnd = z6;
        this.description = str5;
        this.gameInfo = biligameMainGame;
        this.signGiftList = list;
        this.activityBackgroundColor = str6;
    }

    public /* synthetic */ GameSignActivityDetail(String str, String str2, String str3, String str4, int i7, boolean z6, String str5, BiligameMainGame biligameMainGame, List list, String str6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? 0 : i7, (i8 & 32) != 0 ? false : z6, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : biligameMainGame, (i8 & 256) != 0 ? null : list, (i8 & 512) != 0 ? null : str6);
    }

    @Nullable
    public final String getActivityBackgroundColor() {
        return this.activityBackgroundColor;
    }

    @Nullable
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    public final boolean getActivityEnd() {
        return this.activityEnd;
    }

    @Nullable
    public final String getCodeEndTime() {
        return this.codeEndTime;
    }

    public final int getDaysBeforeEnd() {
        return this.daysBeforeEnd;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final BiligameMainGame getGameInfo() {
        return this.gameInfo;
    }

    @Nullable
    public final String getGiftUsage() {
        return this.giftUsage;
    }

    @Nullable
    public final String getPropPicUrl() {
        return this.propPicUrl;
    }

    @Nullable
    public final List<SignTaskInfo> getSignGiftList() {
        return this.signGiftList;
    }

    public final void setActivityBackgroundColor(@Nullable String str) {
        this.activityBackgroundColor = str;
    }

    public final void setActivityDesc(@Nullable String str) {
        this.activityDesc = str;
    }

    public final void setActivityEnd(boolean z6) {
        this.activityEnd = z6;
    }

    public final void setCodeEndTime(@Nullable String str) {
        this.codeEndTime = str;
    }

    public final void setDaysBeforeEnd(int i7) {
        this.daysBeforeEnd = i7;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setGameInfo(@Nullable BiligameMainGame biligameMainGame) {
        this.gameInfo = biligameMainGame;
    }

    public final void setGiftUsage(@Nullable String str) {
        this.giftUsage = str;
    }

    public final void setPropPicUrl(@Nullable String str) {
        this.propPicUrl = str;
    }

    public final void setSignGiftList(@Nullable List<SignTaskInfo> list) {
        this.signGiftList = list;
    }
}
