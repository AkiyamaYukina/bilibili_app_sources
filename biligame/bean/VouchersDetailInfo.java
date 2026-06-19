package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/VouchersDetailInfo.class */
@Keep
public final class VouchersDetailInfo implements Serializable {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final DecimalFormat priceFormatter = new DecimalFormat("#.##");

    @JSONField(name = "applicable_games")
    @Nullable
    private List<GameDetailInfo> applicableGames;

    @JSONField(name = "discount_amount")
    private long discountAmount;

    @JSONField(name = "threshold_amount")
    private long thresholdAmount;

    @JSONField(name = "use_effective_time")
    private long useEffectiveTime;

    @JSONField(name = "use_expire_time")
    private long useExpireTime;

    @JSONField(name = "coupon_no")
    @NotNull
    private String couponNo = "";

    @JSONField(name = "name")
    @NotNull
    private String name = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/VouchersDetailInfo$a.class */
    public static final class a {
    }

    @Nullable
    public final List<GameDetailInfo> getApplicableGames() {
        return this.applicableGames;
    }

    @NotNull
    public final String getCouponNo() {
        return this.couponNo;
    }

    public final long getDiscountAmount() {
        return this.discountAmount;
    }

    public final int getDiscountAmountFontSize(int i7) {
        int length = getDiscountAmountString().length();
        if (length == 4) {
            i7 = 24;
        } else if (length == 5) {
            i7 = 20;
        } else if (length == 6) {
            i7 = 18;
        }
        return i7;
    }

    public final int getDiscountAmountFontSize22(int i7) {
        int length = getDiscountAmountString().length();
        if (length == 4) {
            i7 = 20;
        } else if (length == 5) {
            i7 = 18;
        } else if (length == 6) {
            i7 = 16;
        }
        return i7;
    }

    public final int getDiscountAmountFontSize32(int i7) {
        int length = getDiscountAmountString().length();
        if (length == 4) {
            i7 = 28;
        } else if (length == 5) {
            i7 = 24;
        } else if (length == 6) {
            i7 = 20;
        }
        return i7;
    }

    @NotNull
    public final String getDiscountAmountString() {
        double d7 = this.discountAmount / 100.0d;
        Companion.getClass();
        return priceFormatter.format(d7);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getThresholdAmount() {
        return this.thresholdAmount;
    }

    @NotNull
    public final String getThresholdAmountString() {
        double d7 = this.thresholdAmount / 100.0d;
        Companion.getClass();
        return priceFormatter.format(d7);
    }

    public final long getUseEffectiveTime() {
        return this.useEffectiveTime;
    }

    public final long getUseExpireTime() {
        return this.useExpireTime;
    }

    public final void setApplicableGames(@Nullable List<GameDetailInfo> list) {
        this.applicableGames = list;
    }

    public final void setCouponNo(@NotNull String str) {
        this.couponNo = str;
    }

    public final void setDiscountAmount(long j7) {
        this.discountAmount = j7;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setThresholdAmount(long j7) {
        this.thresholdAmount = j7;
    }

    public final void setUseEffectiveTime(long j7) {
        this.useEffectiveTime = j7;
    }

    public final void setUseExpireTime(long j7) {
        this.useExpireTime = j7;
    }
}
