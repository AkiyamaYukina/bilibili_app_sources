package com.bilibili.biligame.api.cdk;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkProductInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CdkProductInfo implements Serializable {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    private static final long serialVersionUID = 1;

    @JSONField(name = "discount_rate")
    private int discountRate;

    @JSONField(name = "fixing_price")
    private int fixingPrice;

    @JSONField(name = "game_icon")
    @Nullable
    private String gameIcon;

    @JSONField(name = "max_quantity")
    private int maxQuantity = 99;

    @JSONField(name = "product_desc")
    @Nullable
    private String productDesc;

    @JSONField(name = "product_id")
    @Nullable
    private String productId;

    @JSONField(name = "product_name")
    @Nullable
    private String productName;

    @JSONField(name = "sales_price")
    private int salesPrice;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkProductInfo$a.class */
    public static final class a {
    }

    private final String formatPrice(int i7) {
        return new BigDecimal(i7).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP).toPlainString();
    }

    @NotNull
    public final String calculateTotalFixingPrice(int i7) {
        return formatPrice(this.fixingPrice * i7);
    }

    @NotNull
    public final String calculateTotalPrice(int i7) {
        return formatPrice(this.salesPrice * i7);
    }

    public final int getDiscountRate() {
        return this.discountRate;
    }

    public final int getFixingPrice() {
        return this.fixingPrice;
    }

    @NotNull
    public final String getFormattedDiscountPrice() {
        return formatPrice(this.salesPrice);
    }

    @NotNull
    public final String getFormattedOriginalPrice() {
        return formatPrice(this.fixingPrice);
    }

    @Nullable
    public final String getGameIcon() {
        return this.gameIcon;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    @Nullable
    public final String getProductDesc() {
        return this.productDesc;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final int getSalesPrice() {
        return this.salesPrice;
    }

    public final boolean hasDiscount() {
        return this.discountRate > 0 && this.fixingPrice > this.salesPrice;
    }

    public final void setDiscountRate(int i7) {
        this.discountRate = i7;
    }

    public final void setFixingPrice(int i7) {
        this.fixingPrice = i7;
    }

    public final void setGameIcon(@Nullable String str) {
        this.gameIcon = str;
    }

    public final void setMaxQuantity(int i7) {
        this.maxQuantity = i7;
    }

    public final void setProductDesc(@Nullable String str) {
        this.productDesc = str;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setSalesPrice(int i7) {
        this.salesPrice = i7;
    }
}
