package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameProductInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameProductInfo implements Serializable {
    public static final int PURCHASE_STATUS_ALREADY_BUY = 1;
    public static final int PURCHASE_STATUS_CAN_NOT_BUY = 2;
    public static final int PURCHASE_STATUS_NOT_BUY = 0;

    @JSONField(name = "asset_type")
    private int assetType;

    @JSONField(name = "bundle_list")
    @Nullable
    private List<GameProductInfo> bundleList;

    @JSONField(name = "cost_desc")
    @Nullable
    private String costDesc;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @JSONField(name = "is_default")
    private int f33default;

    @JSONField(name = "discount")
    private int discount;

    @JSONField(name = "discount_price")
    private double discountPrice;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "image_urls")
    @Nullable
    private List<String> imageUrls;

    @JSONField(name = "package_size")
    private int packageSize;

    @JSONField(name = "price")
    private double price;

    @JSONField(name = "product_desc")
    @Nullable
    private String productDesc;

    @JSONField(name = "product_name")
    @Nullable
    private String productName;

    @JSONField(name = "product_type")
    private int productType = 1;

    @JSONField(name = "purchase_status")
    private int purchaseStatus;
    private boolean selected;

    @JSONField(name = "sub_assets")
    @Nullable
    private List<GameAssetInfo> subAssets;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameProductInfo$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean canBuy() {
        return this.purchaseStatus == 0;
    }

    public final boolean canNotBuy() {
        return this.purchaseStatus == 2;
    }

    public final int getAssetType() {
        return this.assetType;
    }

    @Nullable
    public final List<GameProductInfo> getBundleList() {
        return this.bundleList;
    }

    @Nullable
    public final String getCostDesc() {
        return this.costDesc;
    }

    public final int getDefault() {
        return this.f33default;
    }

    public final int getDiscount() {
        return this.discount;
    }

    public final double getDiscountPrice() {
        return this.discountPrice;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public final int getPackageSize() {
        return this.packageSize;
    }

    public final double getPrice() {
        return this.price;
    }

    @Nullable
    public final String getProductDesc() {
        return this.productDesc;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final int getProductType() {
        return this.productType;
    }

    public final int getPurchaseStatus() {
        return this.purchaseStatus;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getStrDiscountPrice() {
        return String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.discountPrice)}, 1));
    }

    @NotNull
    public final String getStrPrice() {
        return String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.price)}, 1));
    }

    @Nullable
    public final List<GameAssetInfo> getSubAssets() {
        return this.subAssets;
    }

    public final boolean isDLC() {
        return this.assetType == 2;
    }

    public final boolean isDefault() {
        boolean z6 = true;
        if (this.f33default != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setAssetType(int i7) {
        this.assetType = i7;
    }

    public final void setBundleList(@Nullable List<GameProductInfo> list) {
        this.bundleList = list;
    }

    public final void setCostDesc(@Nullable String str) {
        this.costDesc = str;
    }

    public final void setDefault(int i7) {
        this.f33default = i7;
    }

    public final void setDiscount(int i7) {
        this.discount = i7;
    }

    public final void setDiscountPrice(double d7) {
        this.discountPrice = d7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setImageUrls(@Nullable List<String> list) {
        this.imageUrls = list;
    }

    public final void setPackageSize(int i7) {
        this.packageSize = i7;
    }

    public final void setPrice(double d7) {
        this.price = d7;
    }

    public final void setProductDesc(@Nullable String str) {
        this.productDesc = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setProductType(int i7) {
        this.productType = i7;
    }

    public final void setPurchaseStatus(int i7) {
        this.purchaseStatus = i7;
    }

    public final void setSelected(boolean z6) {
        this.selected = z6;
    }

    public final void setSubAssets(@Nullable List<GameAssetInfo> list) {
        this.subAssets = list;
    }
}
