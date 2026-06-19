package com.bilibili.search2.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchPurchaseCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchPurchaseItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchPurchaseItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "city")
    @Nullable
    private String city;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "price")
    private int price;

    @JSONField(name = "price_complete")
    @Nullable
    private String priceShow;

    @JSONField(name = "price_type")
    private int priceType;

    @JSONField(name = "required_number")
    private int requiredNumber;

    @JSONField(name = "sale_type")
    @Nullable
    private String saleType;

    @JSONField(name = "sale_type_color")
    @Nullable
    private String saleTypeColor;

    @JSONField(name = "sale_type_night_color")
    @Nullable
    private String saleTypeNightColor;

    @JSONField(name = "shop_name")
    @Nullable
    private String shopName;

    @JSONField(name = "show_time")
    @Nullable
    private String showTime;

    @JSONField(name = "venue")
    @Nullable
    private String venue;

    public SearchPurchaseItem() {
    }

    public SearchPurchaseItem(@NotNull SearchPurchaseCard searchPurchaseCard) {
        this.badge = searchPurchaseCard.getBadge();
        this.venue = searchPurchaseCard.getVenue();
        this.price = searchPurchaseCard.getPrice();
        this.priceShow = searchPurchaseCard.getPriceComplete();
        this.priceType = searchPurchaseCard.getPriceType();
        this.requiredNumber = searchPurchaseCard.getRequiredNumber();
        this.city = searchPurchaseCard.getCity();
        this.showTime = searchPurchaseCard.getShowTime();
        this.id = searchPurchaseCard.getId();
        this.shopName = searchPurchaseCard.getShopName();
        setTitle(searchPurchaseCard.getTitle());
        setCover(searchPurchaseCard.getCover());
        this.saleType = searchPurchaseCard.getSaleType();
        this.saleTypeColor = searchPurchaseCard.getSaleTypeColor();
        this.saleTypeNightColor = searchPurchaseCard.getSaleTypeNightColor();
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLocation() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.city)) {
            sb.append(this.city);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(this.venue)) {
            sb.append(this.venue);
        }
        return sb.toString();
    }

    @NotNull
    public final String getLocationNew() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.city)) {
            sb.append(this.city);
        }
        if (!TextUtils.isEmpty(this.venue)) {
            sb.append(" ");
            sb.append(this.venue);
        }
        return sb.toString();
    }

    public final int getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: getPrice, reason: collision with other method in class */
    public final String m8646getPrice() {
        String strValueOf = this.priceShow;
        if (strValueOf == null) {
            strValueOf = String.valueOf(this.price);
        }
        return strValueOf;
    }

    @Nullable
    public final String getPriceShow() {
        return this.priceShow;
    }

    public final int getPriceType() {
        return this.priceType;
    }

    public final int getRequiredNumber() {
        return this.requiredNumber;
    }

    @Nullable
    public final String getSaleType() {
        return this.saleType;
    }

    @Nullable
    public final String getSaleTypeColor() {
        return this.saleTypeColor;
    }

    @Nullable
    public final String getSaleTypeNightColor() {
        return this.saleTypeNightColor;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    @Nullable
    public final String getShowTime() {
        return this.showTime;
    }

    @Nullable
    public final String getVenue() {
        return this.venue;
    }

    public final boolean isLowestPrice() {
        boolean z6 = true;
        if (this.priceType != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setPrice(int i7) {
        this.price = i7;
    }

    public final void setPriceShow(@Nullable String str) {
        this.priceShow = str;
    }

    public final void setPriceType(int i7) {
        this.priceType = i7;
    }

    public final void setRequiredNumber(int i7) {
        this.requiredNumber = i7;
    }

    public final void setSaleType(@Nullable String str) {
        this.saleType = str;
    }

    public final void setSaleTypeColor(@Nullable String str) {
        this.saleTypeColor = str;
    }

    public final void setSaleTypeNightColor(@Nullable String str) {
        this.saleTypeNightColor = str;
    }

    public final void setShopName(@Nullable String str) {
        this.shopName = str;
    }

    public final void setShowTime(@Nullable String str) {
        this.showTime = str;
    }

    public final void setVenue(@Nullable String str) {
        this.venue = str;
    }
}
