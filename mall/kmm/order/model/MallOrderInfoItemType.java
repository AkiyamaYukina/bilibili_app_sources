package com.bilibili.mall.kmm.order.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/model/MallOrderInfoItemType.class */
public final class MallOrderInfoItemType {
    private static final EnumEntries $ENTRIES;
    private static final MallOrderInfoItemType[] $VALUES;
    public static final MallOrderInfoItemType TYPE_NONE = new MallOrderInfoItemType("TYPE_NONE", 0);
    public static final MallOrderInfoItemType TYPE_OLD_VIRTUAL = new MallOrderInfoItemType("TYPE_OLD_VIRTUAL", 1);
    public static final MallOrderInfoItemType TYPE_OLD_ADDRESS = new MallOrderInfoItemType("TYPE_OLD_ADDRESS", 2);
    public static final MallOrderInfoItemType TYPE_OLD_GOOD_ITEM = new MallOrderInfoItemType("TYPE_OLD_GOOD_ITEM", 3);
    public static final MallOrderInfoItemType TYPE_OLD_SCROLL_NOTICE = new MallOrderInfoItemType("TYPE_OLD_SCROLL_NOTICE", 4);
    public static final MallOrderInfoItemType TYPE_OLD_SINGLE_NOTICE = new MallOrderInfoItemType("TYPE_OLD_SINGLE_NOTICE", 5);
    public static final MallOrderInfoItemType TYPE_OLD_TV_NOTICE = new MallOrderInfoItemType("TYPE_OLD_TV_NOTICE", 6);
    public static final MallOrderInfoItemType TYPE_OLD_PAY_CASHIER = new MallOrderInfoItemType("TYPE_OLD_PAY_CASHIER", 7);
    public static final MallOrderInfoItemType TYPE_OLD_REAL_NAME = new MallOrderInfoItemType("TYPE_OLD_REAL_NAME", 8);
    public static final MallOrderInfoItemType TYPE_OLD_TAIL_REMINDER = new MallOrderInfoItemType("TYPE_OLD_TAIL_REMINDER", 9);
    public static final MallOrderInfoItemType TYPE_SEPARATOR = new MallOrderInfoItemType("TYPE_SEPARATOR", 10);
    public static final MallOrderInfoItemType TYPE_DELIVERY = new MallOrderInfoItemType("TYPE_DELIVERY", 11);
    public static final MallOrderInfoItemType TYPE_EMPTY_LINE = new MallOrderInfoItemType("TYPE_EMPTY_LINE", 12);
    public static final MallOrderInfoItemType TYPE_EQUITY_CARD = new MallOrderInfoItemType("TYPE_EQUITY_CARD", 13);
    public static final MallOrderInfoItemType TYPE_GOOD_FOLD = new MallOrderInfoItemType("TYPE_GOOD_FOLD", 14);
    public static final MallOrderInfoItemType TYPE_GRAY_TIP = new MallOrderInfoItemType("TYPE_GRAY_TIP", 15);
    public static final MallOrderInfoItemType TYPE_MULTI_MARKETING = new MallOrderInfoItemType("TYPE_MULTI_MARKETING", 16);
    public static final MallOrderInfoItemType TYPE_OPEN_WORDS = new MallOrderInfoItemType("TYPE_OPEN_WORDS", 17);
    public static final MallOrderInfoItemType TYPE_TITLE = new MallOrderInfoItemType("TYPE_TITLE", 18);
    public static final MallOrderInfoItemType TYPE_GIFT = new MallOrderInfoItemType("TYPE_GIFT", 19);
    public static final MallOrderInfoItemType TYPE_NATIONAL_SUBSIDY = new MallOrderInfoItemType("TYPE_NATIONAL_SUBSIDY", 20);
    public static final MallOrderInfoItemType TYPE_INPUT_DESCRIPTION = new MallOrderInfoItemType("TYPE_INPUT_DESCRIPTION", 21);

    private static final /* synthetic */ MallOrderInfoItemType[] $values() {
        return new MallOrderInfoItemType[]{TYPE_NONE, TYPE_OLD_VIRTUAL, TYPE_OLD_ADDRESS, TYPE_OLD_GOOD_ITEM, TYPE_OLD_SCROLL_NOTICE, TYPE_OLD_SINGLE_NOTICE, TYPE_OLD_TV_NOTICE, TYPE_OLD_PAY_CASHIER, TYPE_OLD_REAL_NAME, TYPE_OLD_TAIL_REMINDER, TYPE_SEPARATOR, TYPE_DELIVERY, TYPE_EMPTY_LINE, TYPE_EQUITY_CARD, TYPE_GOOD_FOLD, TYPE_GRAY_TIP, TYPE_MULTI_MARKETING, TYPE_OPEN_WORDS, TYPE_TITLE, TYPE_GIFT, TYPE_NATIONAL_SUBSIDY, TYPE_INPUT_DESCRIPTION};
    }

    static {
        MallOrderInfoItemType[] mallOrderInfoItemTypeArr$values = $values();
        $VALUES = mallOrderInfoItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallOrderInfoItemTypeArr$values);
    }

    private MallOrderInfoItemType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallOrderInfoItemType> getEntries() {
        return $ENTRIES;
    }

    public static MallOrderInfoItemType valueOf(String str) {
        return (MallOrderInfoItemType) Enum.valueOf(MallOrderInfoItemType.class, str);
    }

    public static MallOrderInfoItemType[] values() {
        return (MallOrderInfoItemType[]) $VALUES.clone();
    }
}
