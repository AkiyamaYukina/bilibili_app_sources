package com.bilibili.mall.kmm.order.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/model/MallOrderInfoActionType.class */
public final class MallOrderInfoActionType {
    private static final EnumEntries $ENTRIES;
    private static final MallOrderInfoActionType[] $VALUES;
    public static final MallOrderInfoActionType ActionNone = new MallOrderInfoActionType("ActionNone", 0);
    public static final MallOrderInfoActionType ActionJumpUrl = new MallOrderInfoActionType("ActionJumpUrl", 1);
    public static final MallOrderInfoActionType ActionToast = new MallOrderInfoActionType("ActionToast", 2);
    public static final MallOrderInfoActionType ActionSelect = new MallOrderInfoActionType("ActionSelect", 3);
    public static final MallOrderInfoActionType ActionFloatEquity = new MallOrderInfoActionType("ActionFloatEquity", 4);
    public static final MallOrderInfoActionType ActionFloatString = new MallOrderInfoActionType("ActionFloatString", 5);
    public static final MallOrderInfoActionType ActionFloatSubsidy = new MallOrderInfoActionType("ActionFloatSubsidy", 6);
    public static final MallOrderInfoActionType ActionFloatCoupon = new MallOrderInfoActionType("ActionFloatCoupon", 7);
    public static final MallOrderInfoActionType ActionFloatGoodsFold = new MallOrderInfoActionType("ActionFloatGoodsFold", 8);
    public static final MallOrderInfoActionType ActionFloatDiscountDetails = new MallOrderInfoActionType("ActionFloatDiscountDetails", 9);
    public static final MallOrderInfoActionType ActionFloatBuyerInfo = new MallOrderInfoActionType("ActionFloatBuyerInfo", 10);
    public static final MallOrderInfoActionType ActionFloatGift = new MallOrderInfoActionType("ActionFloatGift", 11);
    public static final MallOrderInfoActionType ActionFloatOrderExpenseDiscount = new MallOrderInfoActionType("ActionFloatOrderExpenseDiscount", 12);
    public static final MallOrderInfoActionType ActionNationalSubsidy = new MallOrderInfoActionType("ActionNationalSubsidy", 13);

    private static final /* synthetic */ MallOrderInfoActionType[] $values() {
        return new MallOrderInfoActionType[]{ActionNone, ActionJumpUrl, ActionToast, ActionSelect, ActionFloatEquity, ActionFloatString, ActionFloatSubsidy, ActionFloatCoupon, ActionFloatGoodsFold, ActionFloatDiscountDetails, ActionFloatBuyerInfo, ActionFloatGift, ActionFloatOrderExpenseDiscount, ActionNationalSubsidy};
    }

    static {
        MallOrderInfoActionType[] mallOrderInfoActionTypeArr$values = $values();
        $VALUES = mallOrderInfoActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallOrderInfoActionTypeArr$values);
    }

    private MallOrderInfoActionType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallOrderInfoActionType> getEntries() {
        return $ENTRIES;
    }

    public static MallOrderInfoActionType valueOf(String str) {
        return (MallOrderInfoActionType) Enum.valueOf(MallOrderInfoActionType.class, str);
    }

    public static MallOrderInfoActionType[] values() {
        return (MallOrderInfoActionType[]) $VALUES.clone();
    }
}
