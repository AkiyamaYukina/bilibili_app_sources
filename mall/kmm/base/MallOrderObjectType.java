package com.bilibili.mall.kmm.base;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/base/MallOrderObjectType.class */
public final class MallOrderObjectType {
    private static final EnumEntries $ENTRIES;
    private static final MallOrderObjectType[] $VALUES;
    public static final MallOrderObjectType NOTICE_MODEL = new MallOrderObjectType("NOTICE_MODEL", 0);
    public static final MallOrderObjectType ADDRESS = new MallOrderObjectType("ADDRESS", 1);
    public static final MallOrderObjectType UNTRUE = new MallOrderObjectType("UNTRUE", 2);
    public static final MallOrderObjectType IDENTIFY = new MallOrderObjectType("IDENTIFY", 3);
    public static final MallOrderObjectType REAL_NAME = new MallOrderObjectType("REAL_NAME", 4);
    public static final MallOrderObjectType GOOD_ITEM = new MallOrderObjectType("GOOD_ITEM", 5);
    public static final MallOrderObjectType PAYMENT = new MallOrderObjectType("PAYMENT", 6);
    public static final MallOrderObjectType EXPENSE_DISCOUNT = new MallOrderObjectType("EXPENSE_DISCOUNT", 7);
    public static final MallOrderObjectType ORDER_SUBMIT_RESULT = new MallOrderObjectType("ORDER_SUBMIT_RESULT", 8);

    private static final /* synthetic */ MallOrderObjectType[] $values() {
        return new MallOrderObjectType[]{NOTICE_MODEL, ADDRESS, UNTRUE, IDENTIFY, REAL_NAME, GOOD_ITEM, PAYMENT, EXPENSE_DISCOUNT, ORDER_SUBMIT_RESULT};
    }

    static {
        MallOrderObjectType[] mallOrderObjectTypeArr$values = $values();
        $VALUES = mallOrderObjectTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallOrderObjectTypeArr$values);
    }

    private MallOrderObjectType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallOrderObjectType> getEntries() {
        return $ENTRIES;
    }

    public static MallOrderObjectType valueOf(String str) {
        return (MallOrderObjectType) Enum.valueOf(MallOrderObjectType.class, str);
    }

    public static MallOrderObjectType[] values() {
        return (MallOrderObjectType[]) $VALUES.clone();
    }
}
