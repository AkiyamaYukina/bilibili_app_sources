package com.bilibili.biligame.api.cloudgame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/GamePassSellingGuide.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GamePassSellingGuide {
    public static final int $stable = 8;

    @JSONField(name = "goods_url")
    @Nullable
    private String goodsUrl = "";

    @Nullable
    public final String getGoodsUrl() {
        return this.goodsUrl;
    }

    public final void setGoodsUrl(@Nullable String str) {
        this.goodsUrl = str;
    }
}
