package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameAssetInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameAssetInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "asset_id")
    private long assetId;

    @JSONField(name = "asset_type")
    private int assetType = 1;

    @JSONField(name = "image_urls")
    @Nullable
    private List<String> imageUrls;

    @JSONField(name = "product_desc")
    @Nullable
    private String productDesc;

    @JSONField(name = "product_name")
    @Nullable
    private String productName;

    public final long getAssetId() {
        return this.assetId;
    }

    public final int getAssetType() {
        return this.assetType;
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    @Nullable
    public final String getProductDesc() {
        return this.productDesc;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final void setAssetId(long j7) {
        this.assetId = j7;
    }

    public final void setAssetType(int i7) {
        this.assetType = i7;
    }

    public final void setImageUrls(@Nullable List<String> list) {
        this.imageUrls = list;
    }

    public final void setProductDesc(@Nullable String str) {
        this.productDesc = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }
}
