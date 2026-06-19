package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.live.streaming.source.CommonSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.InterfaceC7786b;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInType.class */
@StabilityInferred(parameters = 0)
@Keep
public class CheckInType implements InterfaceC7786b {
    public static final int $stable = 8;

    @JSONField(name = "checkin_id")
    @Nullable
    private String checkInId;

    @JSONField(name = "checkin_status")
    @Nullable
    private Integer checkInStatus;

    @JSONField(name = "checkin_status_today")
    @Nullable
    private Integer checkInStatusToday;

    @JSONField(name = "checkin_type")
    @Nullable
    private Integer checkInType;

    @JSONField(name = "complete_checkin_days")
    @Nullable
    private Integer completeCheckInDays;

    @JSONField(name = "complete_count")
    @Nullable
    private Integer completeCount;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = "creator")
    @Nullable
    private String creator;

    @JSONField(name = "cumulative_duration")
    @Nullable
    private Integer cumulativeDuration;

    @JSONField(name = "episode_num")
    @Nullable
    private Integer episodeNum;

    @JSONField(name = GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK)
    @Nullable
    private String jumpLink;

    @JSONField(name = CommonSource.SOURCE_ID)
    @Nullable
    private String sourceId;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "total_checkin_days")
    @Nullable
    private Integer totalCheckInDays;

    public CheckInType() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public CheckInType(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str3, @Nullable String str4, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str5, @Nullable Integer num8, @Nullable String str6) {
        this.checkInId = str;
        this.checkInStatusToday = num;
        this.checkInType = num2;
        this.completeCheckInDays = num3;
        this.cover = str2;
        this.cumulativeDuration = num4;
        this.episodeNum = num5;
        this.jumpLink = str3;
        this.title = str4;
        this.totalCheckInDays = num6;
        this.checkInStatus = num7;
        this.creator = str5;
        this.completeCount = num8;
        this.sourceId = str6;
    }

    public /* synthetic */ CheckInType(String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, String str3, String str4, Integer num6, Integer num7, String str5, Integer num8, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0 : num, (i7 & 4) != 0 ? 0 : num2, (i7 & 8) != 0 ? 0 : num3, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? 0 : num4, (i7 & 64) != 0 ? 0 : num5, (i7 & 128) != 0 ? null : str3, (i7 & 256) != 0 ? null : str4, (i7 & 512) != 0 ? 0 : num6, (i7 & 1024) != 0 ? 0 : num7, (i7 & 2048) != 0 ? null : str5, (i7 & 4096) != 0 ? 0 : num8, (i7 & 8192) != 0 ? null : str6);
    }

    @Nullable
    public final String getCheckInId() {
        return this.checkInId;
    }

    @Nullable
    public final Integer getCheckInStatus() {
        return this.checkInStatus;
    }

    @Nullable
    public final Integer getCheckInStatusToday() {
        return this.checkInStatusToday;
    }

    @Nullable
    public final Integer getCheckInType() {
        return this.checkInType;
    }

    @Nullable
    public final Integer getCompleteCheckInDays() {
        return this.completeCheckInDays;
    }

    @Nullable
    public final Integer getCompleteCount() {
        return this.completeCount;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getCreator() {
        return this.creator;
    }

    @Nullable
    public final Integer getCumulativeDuration() {
        return this.cumulativeDuration;
    }

    @Nullable
    public final Integer getEpisodeNum() {
        return this.episodeNum;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getTotalCheckInDays() {
        return this.totalCheckInDays;
    }

    public final void setCheckInId(@Nullable String str) {
        this.checkInId = str;
    }

    public final void setCheckInStatus(@Nullable Integer num) {
        this.checkInStatus = num;
    }

    public final void setCheckInStatusToday(@Nullable Integer num) {
        this.checkInStatusToday = num;
    }

    public final void setCheckInType(@Nullable Integer num) {
        this.checkInType = num;
    }

    public final void setCompleteCheckInDays(@Nullable Integer num) {
        this.completeCheckInDays = num;
    }

    public final void setCompleteCount(@Nullable Integer num) {
        this.completeCount = num;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCreator(@Nullable String str) {
        this.creator = str;
    }

    public final void setCumulativeDuration(@Nullable Integer num) {
        this.cumulativeDuration = num;
    }

    public final void setEpisodeNum(@Nullable Integer num) {
        this.episodeNum = num;
    }

    public final void setJumpLink(@Nullable String str) {
        this.jumpLink = str;
    }

    public final void setSourceId(@Nullable String str) {
        this.sourceId = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTotalCheckInDays(@Nullable Integer num) {
        this.totalCheckInDays = num;
    }
}
