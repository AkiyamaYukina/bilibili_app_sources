package com.bilibili.moduleservice.charge;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/charge/ChargeFrom.class */
public final class ChargeFrom {
    private static final EnumEntries $ENTRIES;
    private static final ChargeFrom[] $VALUES;
    public static final ChargeFrom COMMENT = new ChargeFrom("COMMENT", 0, "community_comment");

    @NotNull
    private final String value;

    private static final /* synthetic */ ChargeFrom[] $values() {
        return new ChargeFrom[]{COMMENT};
    }

    static {
        ChargeFrom[] chargeFromArr$values = $values();
        $VALUES = chargeFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chargeFromArr$values);
    }

    private ChargeFrom(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ChargeFrom> getEntries() {
        return $ENTRIES;
    }

    public static ChargeFrom valueOf(String str) {
        return (ChargeFrom) Enum.valueOf(ChargeFrom.class, str);
    }

    public static ChargeFrom[] values() {
        return (ChargeFrom[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
