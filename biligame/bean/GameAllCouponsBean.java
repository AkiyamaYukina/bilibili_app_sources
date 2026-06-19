package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameAllCouponsBean.class */
@Keep
public final class GameAllCouponsBean implements Serializable {
    private boolean clickIsReceiveAll;

    @JSONField(name = "coupon_list")
    @Nullable
    private List<CouponsDetailList> couponsDetailList;

    @JSONField(name = "game_info")
    @Nullable
    private GameDetailInfo gameInfo;

    public final boolean getClickIsReceiveAll() {
        return this.clickIsReceiveAll;
    }

    @Nullable
    public final List<CouponsDetailList> getCouponsDetailList() {
        return this.couponsDetailList;
    }

    @Nullable
    public final GameDetailInfo getGameInfo() {
        return this.gameInfo;
    }

    public final void setClickIsReceiveAll(boolean z6) {
        this.clickIsReceiveAll = z6;
    }

    public final void setCouponsDetailList(@Nullable List<CouponsDetailList> list) {
        this.couponsDetailList = list;
    }

    public final void setGameInfo(@Nullable GameDetailInfo gameDetailInfo) {
        this.gameInfo = gameDetailInfo;
    }
}
