package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameMainGame;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiliGameMinePlayGame.class */
@StabilityInferred(parameters = 0)
@Keep
public class BiliGameMinePlayGame extends BiligameMainGame {
    public static final int $stable = 8;

    @JSONField(name = "benefit_tag_list")
    @Nullable
    private List<GameBenefitTag> benefitTagList;

    @JSONField(name = "show_big_card")
    private boolean bigCard;

    @JSONField(name = "big_image")
    @Nullable
    private String bigImage;

    @JSONField(name = "earlier_count")
    private int earlierCount;

    @JSONField(name = "last_active_time_text")
    @Nullable
    private String lastActiveTimeText;

    @JSONField(name = "last_login_time")
    @Nullable
    private String lastLoginTime;

    @JSONField(name = "play_duration")
    private int playDuration;

    @JSONField(name = "play_duration_text")
    @Nullable
    private String playDurationText;
    private int playedType;

    @JSONField(name = "ranking_list_content")
    @Nullable
    private String rankListContent;

    @JSONField(name = "recent_count")
    private int recentCount;

    @JSONField(name = "is_recent_played")
    private boolean recentPlayed;

    @Nullable
    public final List<GameBenefitTag> getBenefitTagList() {
        return this.benefitTagList;
    }

    public final boolean getBigCard() {
        return this.bigCard;
    }

    @Nullable
    public final String getBigImage() {
        return this.bigImage;
    }

    public final int getEarlierCount() {
        return this.earlierCount;
    }

    @Nullable
    public final String getLastActiveTimeText() {
        return this.lastActiveTimeText;
    }

    @Nullable
    public final String getLastLoginTime() {
        return this.lastLoginTime;
    }

    public final int getPlayDuration() {
        return this.playDuration;
    }

    @Nullable
    public final String getPlayDurationText() {
        return this.playDurationText;
    }

    public final int getPlayedType() {
        return this.playedType;
    }

    @Nullable
    public final String getRankListContent() {
        return this.rankListContent;
    }

    public final int getRecentCount() {
        return this.recentCount;
    }

    public final boolean getRecentPlayed() {
        return this.recentPlayed;
    }

    public final void setBenefitTagList(@Nullable List<GameBenefitTag> list) {
        this.benefitTagList = list;
    }

    public final void setBigCard(boolean z6) {
        this.bigCard = z6;
    }

    public final void setBigImage(@Nullable String str) {
        this.bigImage = str;
    }

    public final void setEarlierCount(int i7) {
        this.earlierCount = i7;
    }

    public final void setLastActiveTimeText(@Nullable String str) {
        this.lastActiveTimeText = str;
    }

    public final void setLastLoginTime(@Nullable String str) {
        this.lastLoginTime = str;
    }

    public final void setPlayDuration(int i7) {
        this.playDuration = i7;
    }

    public final void setPlayDurationText(@Nullable String str) {
        this.playDurationText = str;
    }

    public final void setPlayedType(int i7) {
        this.playedType = i7;
    }

    public final void setRankListContent(@Nullable String str) {
        this.rankListContent = str;
    }

    public final void setRecentCount(int i7) {
        this.recentCount = i7;
    }

    public final void setRecentPlayed(boolean z6) {
        this.recentPlayed = z6;
    }
}
