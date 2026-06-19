package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ConsumeBusinessType.class */
public final class ConsumeBusinessType {
    private static final EnumEntries $ENTRIES;
    private static final ConsumeBusinessType[] $VALUES;
    private final int businessType;
    public static final ConsumeBusinessType Unknown = new ConsumeBusinessType("Unknown", 0, -1);
    public static final ConsumeBusinessType AllInOneConsume = new ConsumeBusinessType("AllInOneConsume", 1, 1);
    public static final ConsumeBusinessType CommonConsume = new ConsumeBusinessType("CommonConsume", 2, 2);

    private static final /* synthetic */ ConsumeBusinessType[] $values() {
        return new ConsumeBusinessType[]{Unknown, AllInOneConsume, CommonConsume};
    }

    static {
        ConsumeBusinessType[] consumeBusinessTypeArr$values = $values();
        $VALUES = consumeBusinessTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(consumeBusinessTypeArr$values);
    }

    private ConsumeBusinessType(String str, int i7, int i8) {
        this.businessType = i8;
    }

    @NotNull
    public static EnumEntries<ConsumeBusinessType> getEntries() {
        return $ENTRIES;
    }

    public static ConsumeBusinessType valueOf(String str) {
        return (ConsumeBusinessType) Enum.valueOf(ConsumeBusinessType.class, str);
    }

    public static ConsumeBusinessType[] values() {
        return (ConsumeBusinessType[]) $VALUES.clone();
    }

    public final int getBusinessType() {
        return this.businessType;
    }
}
