package com.bilibili.moduleservice.charge;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/charge/ChargeLevelFrom.class */
public final class ChargeLevelFrom {
    private static final EnumEntries $ENTRIES;
    private static final ChargeLevelFrom[] $VALUES;
    public static final ChargeLevelFrom COMMENT_LEVEL = new ChargeLevelFrom("COMMENT_LEVEL", 0, 1, "reply");
    private final int elecLevel;

    @NotNull
    private final String elecScreen;

    private static final /* synthetic */ ChargeLevelFrom[] $values() {
        return new ChargeLevelFrom[]{COMMENT_LEVEL};
    }

    static {
        ChargeLevelFrom[] chargeLevelFromArr$values = $values();
        $VALUES = chargeLevelFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chargeLevelFromArr$values);
    }

    private ChargeLevelFrom(String str, int i7, int i8, String str2) {
        this.elecLevel = i8;
        this.elecScreen = str2;
    }

    @NotNull
    public static EnumEntries<ChargeLevelFrom> getEntries() {
        return $ENTRIES;
    }

    public static ChargeLevelFrom valueOf(String str) {
        return (ChargeLevelFrom) Enum.valueOf(ChargeLevelFrom.class, str);
    }

    public static ChargeLevelFrom[] values() {
        return (ChargeLevelFrom[]) $VALUES.clone();
    }

    public final int getElecLevel() {
        return this.elecLevel;
    }

    @NotNull
    public final String getElecScreen() {
        return this.elecScreen;
    }
}
