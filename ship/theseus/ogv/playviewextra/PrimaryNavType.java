package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PrimaryNavType.class */
public final class PrimaryNavType implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final PrimaryNavType[] $VALUES;
    private final int value;
    public static final PrimaryNavType VIP = new PrimaryNavType("VIP", 0, 1);
    public static final PrimaryNavType PAY = new PrimaryNavType("PAY", 1, 2);

    private static final /* synthetic */ PrimaryNavType[] $values() {
        return new PrimaryNavType[]{VIP, PAY};
    }

    static {
        PrimaryNavType[] primaryNavTypeArr$values = $values();
        $VALUES = primaryNavTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(primaryNavTypeArr$values);
    }

    private PrimaryNavType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PrimaryNavType> getEntries() {
        return $ENTRIES;
    }

    public static PrimaryNavType valueOf(String str) {
        return (PrimaryNavType) Enum.valueOf(PrimaryNavType.class, str);
    }

    public static PrimaryNavType[] values() {
        return (PrimaryNavType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9128getValue() {
        return Integer.valueOf(this.value);
    }
}
