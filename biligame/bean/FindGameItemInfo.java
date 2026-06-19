package com.bilibili.biligame.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.bean.BiligameRankInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.ui.gamedetail.data.AvailableGiftData;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/FindGameItemInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FindGameItemInfo extends BiligameMainGame {
    public static final int $stable = 8;

    @SerializedName("game_rank_info")
    @Nullable
    private BiligameRankInfo gameRankInfo;

    @SerializedName("avail_gift_b_o")
    @Nullable
    private AvailableGiftData giftInfo;

    @SerializedName("screen_shots")
    @Nullable
    private List<? extends GameDetailContent.ScreenShot> screenShotList;

    @Nullable
    public final BiligameRankInfo getGameRankInfo() {
        return this.gameRankInfo;
    }

    @Nullable
    public final AvailableGiftData getGiftInfo() {
        return this.giftInfo;
    }

    @Nullable
    public final List<GameDetailContent.ScreenShot> getScreenShotList() {
        return this.screenShotList;
    }

    public final void setGameRankInfo(@Nullable BiligameRankInfo biligameRankInfo) {
        this.gameRankInfo = biligameRankInfo;
    }

    public final void setGiftInfo(@Nullable AvailableGiftData availableGiftData) {
        this.giftInfo = availableGiftData;
    }

    public final void setScreenShotList(@Nullable List<? extends GameDetailContent.ScreenShot> list) {
        this.screenShotList = list;
    }
}
