package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.Utils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiliGameMineBookGame.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliGameMineBookGame extends BiligameMainGame {
    public static final int $stable = 8;

    @JSONField(name = "need_big_image")
    private int bigCard;

    @JSONField(name = "big_image")
    @Nullable
    private String bigImage;
    private int bookTimeType;

    @JSONField(name = "have_reward_gift")
    private int haveRewardGift;

    @JSONField(name = "is_unread_will_online_game")
    private boolean isUnreadWillOnlineGame;

    @JSONField(name = "official_uid")
    private long officialUid;

    @JSONField(name = "order_time")
    @Nullable
    private String orderTime;

    @JSONField(name = "remind_auto_download")
    private boolean remindAutoDownLoad;

    @JSONField(name = "reserve_list_content")
    @Nullable
    private String reserveListContent;

    @JSONField(name = "reserve_type")
    private int reserveType = -1;

    @JSONField(name = "version_book_num")
    private int versionBookNum;

    @JSONField(name = "version_order_time")
    @Nullable
    private String versionOrderTime;

    @JSONField(name = "will_online")
    private int willOnline;

    public final int getBigCard() {
        return this.bigCard;
    }

    @Nullable
    public final String getBigImage() {
        return this.bigImage;
    }

    @NotNull
    public final String getBookOrderTime() {
        return Utils.formatDate(NumUtils.parseLong(this.orderTime), "yyyy-MM-dd");
    }

    public final int getBookTimeType() {
        return this.bookTimeType;
    }

    @NotNull
    public final String getBookVersionOrderTime() {
        String str = this.versionOrderTime;
        return (str == null || str.length() == 0) ? "" : Utils.formatDate(NumUtils.parseLong(this.versionOrderTime), "yyyy-MM-dd");
    }

    public final int getHaveRewardGift() {
        return this.haveRewardGift;
    }

    public final long getOfficialUid() {
        return this.officialUid;
    }

    @Nullable
    public final String getOrderTime() {
        return this.orderTime;
    }

    public final boolean getRemindAutoDownLoad() {
        return this.remindAutoDownLoad;
    }

    @Nullable
    public final String getReserveListContent() {
        return this.reserveListContent;
    }

    public final int getReserveType() {
        return this.reserveType;
    }

    public final int getVersionBookNum() {
        return this.versionBookNum;
    }

    @Nullable
    public final String getVersionOrderTime() {
        return this.versionOrderTime;
    }

    public final int getWillOnline() {
        return this.willOnline;
    }

    public final boolean isUnreadWillOnlineGame() {
        return this.isUnreadWillOnlineGame;
    }

    public final void setBigCard(int i7) {
        this.bigCard = i7;
    }

    public final void setBigImage(@Nullable String str) {
        this.bigImage = str;
    }

    public final void setBookTimeType(int i7) {
        this.bookTimeType = i7;
    }

    public final void setHaveRewardGift(int i7) {
        this.haveRewardGift = i7;
    }

    public final void setOfficialUid(long j7) {
        this.officialUid = j7;
    }

    public final void setOrderTime(@Nullable String str) {
        this.orderTime = str;
    }

    public final void setRemindAutoDownLoad(boolean z6) {
        this.remindAutoDownLoad = z6;
    }

    public final void setReserveListContent(@Nullable String str) {
        this.reserveListContent = str;
    }

    public final void setReserveType(int i7) {
        this.reserveType = i7;
    }

    public final void setUnreadWillOnlineGame(boolean z6) {
        this.isUnreadWillOnlineGame = z6;
    }

    public final void setVersionBookNum(int i7) {
        this.versionBookNum = i7;
    }

    public final void setVersionOrderTime(@Nullable String str) {
        this.versionOrderTime = str;
    }

    public final void setWillOnline(int i7) {
        this.willOnline = i7;
    }
}
