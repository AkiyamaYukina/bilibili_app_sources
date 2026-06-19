package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameButtonGiftInfo.class */
@Keep
public final class BiliGameButtonGiftInfo {

    @JSONField(name = "gift_count")
    private int giftCount;

    @JSONField(name = "gift_ids")
    @Nullable
    private List<String> giftIds;

    @JSONField(name = "vip_gift_ids")
    @Nullable
    private List<String> vipGiftIds;

    public final int getGiftCount() {
        return this.giftCount;
    }

    @Nullable
    public final List<String> getGiftIds() {
        return this.giftIds;
    }

    @Nullable
    public final List<String> getVipGiftIds() {
        return this.vipGiftIds;
    }

    public final void setGiftCount(int i7) {
        this.giftCount = i7;
    }

    public final void setGiftIds(@Nullable List<String> list) {
        this.giftIds = list;
    }

    public final void setVipGiftIds(@Nullable List<String> list) {
        this.vipGiftIds = list;
    }
}
