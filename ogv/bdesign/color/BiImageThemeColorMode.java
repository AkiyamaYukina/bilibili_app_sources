package com.bilibili.ogv.bdesign.color;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/color/BiImageThemeColorMode.class */
public final class BiImageThemeColorMode {
    private static final EnumEntries $ENTRIES;
    private static final BiImageThemeColorMode[] $VALUES;
    public static final BiImageThemeColorMode DARK = new BiImageThemeColorMode("DARK", 0);
    public static final BiImageThemeColorMode LIGHT = new BiImageThemeColorMode("LIGHT", 1);
    public static final BiImageThemeColorMode DARK_BEFORE = new BiImageThemeColorMode("DARK_BEFORE", 2);

    private static final /* synthetic */ BiImageThemeColorMode[] $values() {
        return new BiImageThemeColorMode[]{DARK, LIGHT, DARK_BEFORE};
    }

    static {
        BiImageThemeColorMode[] biImageThemeColorModeArr$values = $values();
        $VALUES = biImageThemeColorModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biImageThemeColorModeArr$values);
    }

    private BiImageThemeColorMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiImageThemeColorMode> getEntries() {
        return $ENTRIES;
    }

    public static BiImageThemeColorMode valueOf(String str) {
        return (BiImageThemeColorMode) Enum.valueOf(BiImageThemeColorMode.class, str);
    }

    public static BiImageThemeColorMode[] values() {
        return (BiImageThemeColorMode[]) $VALUES.clone();
    }
}
