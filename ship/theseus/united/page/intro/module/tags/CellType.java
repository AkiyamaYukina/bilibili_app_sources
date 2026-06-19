package com.bilibili.ship.theseus.united.page.intro.module.tags;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/CellType.class */
public final class CellType {
    private static final EnumEntries $ENTRIES;
    private static final CellType[] $VALUES;
    public static final CellType BGM = new CellType("BGM", 0, "bgm");

    @NotNull
    private final String type;

    private static final /* synthetic */ CellType[] $values() {
        return new CellType[]{BGM};
    }

    static {
        CellType[] cellTypeArr$values = $values();
        $VALUES = cellTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cellTypeArr$values);
    }

    private CellType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<CellType> getEntries() {
        return $ENTRIES;
    }

    public static CellType valueOf(String str) {
        return (CellType) Enum.valueOf(CellType.class, str);
    }

    public static CellType[] values() {
        return (CellType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
