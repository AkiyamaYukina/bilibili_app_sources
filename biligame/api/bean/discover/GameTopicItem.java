package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameHotGame;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/GameTopicItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameTopicItem extends BiligameHotGame {
    public static final int $stable = 8;

    @JSONField(name = "game_desc")
    @Nullable
    private String gameDesc;

    @JSONField(name = "gift_name")
    @Nullable
    private String giftName;

    @JSONField(name = "gift_num")
    private int giftNum;

    @JSONField(name = "headline")
    @Nullable
    private String headline;

    @JSONField(name = "recommend_reason")
    @Nullable
    private List<RecommendReason> recommendReason;

    @JSONField(name = "screen_shots")
    @Nullable
    private List<ScreenShot> screenShots;

    @JSONField(name = "sub_headline")
    @Nullable
    private String subHeadline;

    @JSONField(name = "topic_type")
    private int topicType = 1;

    @JSONField(name = "video_info")
    @Nullable
    private GameTopicVideo videoInfo;

    @Nullable
    public final String getGameDesc() {
        return this.gameDesc;
    }

    @Nullable
    public final String getGiftName() {
        return this.giftName;
    }

    public final int getGiftNum() {
        return this.giftNum;
    }

    @Nullable
    public final String getHeadline() {
        return this.headline;
    }

    @Nullable
    public final List<RecommendReason> getRecommendReason() {
        return this.recommendReason;
    }

    @Nullable
    public final List<ScreenShot> getScreenShots() {
        return this.screenShots;
    }

    @Nullable
    public final String getSubHeadline() {
        return this.subHeadline;
    }

    public final int getTopicType() {
        return this.topicType;
    }

    @Nullable
    public final GameTopicVideo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setGameDesc(@Nullable String str) {
        this.gameDesc = str;
    }

    public final void setGiftName(@Nullable String str) {
        this.giftName = str;
    }

    public final void setGiftNum(int i7) {
        this.giftNum = i7;
    }

    public final void setHeadline(@Nullable String str) {
        this.headline = str;
    }

    public final void setRecommendReason(@Nullable List<RecommendReason> list) {
        this.recommendReason = list;
    }

    public final void setScreenShots(@Nullable List<ScreenShot> list) {
        this.screenShots = list;
    }

    public final void setSubHeadline(@Nullable String str) {
        this.subHeadline = str;
    }

    public final void setTopicType(int i7) {
        this.topicType = i7;
    }

    public final void setVideoInfo(@Nullable GameTopicVideo gameTopicVideo) {
        this.videoInfo = gameTopicVideo;
    }
}
