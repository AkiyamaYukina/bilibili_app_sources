package com.bilibili.biligame.api.cdk;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkAssetInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CdkAssetInfo {
    public static final int $stable = 8;

    @JSONField(name = "cdkey_value")
    @Nullable
    private String cdkValue;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "product_id")
    @Nullable
    private String productId;

    @JSONField(name = "product_name")
    @Nullable
    private String productName;

    @JSONField(name = "valid_start_time")
    @Nullable
    private String purchaseTime;

    @Nullable
    public final String getCdkValue() {
        return this.cdkValue;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getPurchaseTime() {
        return this.purchaseTime;
    }

    public final void setCdkValue(@Nullable String str) {
        this.cdkValue = str;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setPurchaseTime(@Nullable String str) {
        this.purchaseTime = str;
    }
}
