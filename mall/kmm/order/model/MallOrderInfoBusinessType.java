package com.bilibili.mall.kmm.order.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/model/MallOrderInfoBusinessType.class */
public final class MallOrderInfoBusinessType {
    private static final EnumEntries $ENTRIES;
    private static final MallOrderInfoBusinessType[] $VALUES;
    public static final MallOrderInfoBusinessType BusinessNone = new MallOrderInfoBusinessType("BusinessNone", 0);
    public static final MallOrderInfoBusinessType BusinessGood = new MallOrderInfoBusinessType("BusinessGood", 1);
    public static final MallOrderInfoBusinessType BusinessEquity = new MallOrderInfoBusinessType("BusinessEquity", 2);
    public static final MallOrderInfoBusinessType BusinessSubsidy = new MallOrderInfoBusinessType("BusinessSubsidy", 3);
    public static final MallOrderInfoBusinessType BusinessCoupon = new MallOrderInfoBusinessType("BusinessCoupon", 4);
    public static final MallOrderInfoBusinessType BusinessShopCoupon = new MallOrderInfoBusinessType("BusinessShopCoupon", 5);
    public static final MallOrderInfoBusinessType BusinessShopCouponDisCount = new MallOrderInfoBusinessType("BusinessShopCouponDisCount", 6);
    public static final MallOrderInfoBusinessType BusinessShopDisCount = new MallOrderInfoBusinessType("BusinessShopDisCount", 7);
    public static final MallOrderInfoBusinessType BusinessFreight = new MallOrderInfoBusinessType("BusinessFreight", 8);
    public static final MallOrderInfoBusinessType BusinessShopNotice = new MallOrderInfoBusinessType("BusinessShopNotice", 9);
    public static final MallOrderInfoBusinessType BusinessDiscountDetails = new MallOrderInfoBusinessType("BusinessDiscountDetails", 10);
    public static final MallOrderInfoBusinessType BusinessBuyerInfo = new MallOrderInfoBusinessType("BusinessBuyerInfo", 11);
    public static final MallOrderInfoBusinessType BusinessGift = new MallOrderInfoBusinessType("BusinessGift", 12);
    public static final MallOrderInfoBusinessType BusinessNationalSubsidy = new MallOrderInfoBusinessType("BusinessNationalSubsidy", 13);
    public static final MallOrderInfoBusinessType BusinessOrderExpenseDiscount = new MallOrderInfoBusinessType("BusinessOrderExpenseDiscount", 14);

    private static final /* synthetic */ MallOrderInfoBusinessType[] $values() {
        return new MallOrderInfoBusinessType[]{BusinessNone, BusinessGood, BusinessEquity, BusinessSubsidy, BusinessCoupon, BusinessShopCoupon, BusinessShopCouponDisCount, BusinessShopDisCount, BusinessFreight, BusinessShopNotice, BusinessDiscountDetails, BusinessBuyerInfo, BusinessGift, BusinessNationalSubsidy, BusinessOrderExpenseDiscount};
    }

    static {
        MallOrderInfoBusinessType[] mallOrderInfoBusinessTypeArr$values = $values();
        $VALUES = mallOrderInfoBusinessTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallOrderInfoBusinessTypeArr$values);
    }

    private MallOrderInfoBusinessType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallOrderInfoBusinessType> getEntries() {
        return $ENTRIES;
    }

    public static MallOrderInfoBusinessType valueOf(String str) {
        return (MallOrderInfoBusinessType) Enum.valueOf(MallOrderInfoBusinessType.class, str);
    }

    public static MallOrderInfoBusinessType[] values() {
        return (MallOrderInfoBusinessType[]) $VALUES.clone();
    }
}
