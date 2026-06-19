package com.bilibili.topix;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/IconStyle.class */
public final class IconStyle {
    private static final EnumEntries $ENTRIES;
    private static final IconStyle[] $VALUES;
    private final boolean isCircle;
    private final int size;
    private final int startPadding;
    public static final IconStyle DEFAULT_ICON = new IconStyle("DEFAULT_ICON", 0, 18, false, 20);
    public static final IconStyle AVATAR_ICON = new IconStyle("AVATAR_ICON", 1, 32, true, 8);

    private static final /* synthetic */ IconStyle[] $values() {
        return new IconStyle[]{DEFAULT_ICON, AVATAR_ICON};
    }

    static {
        IconStyle[] iconStyleArr$values = $values();
        $VALUES = iconStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iconStyleArr$values);
    }

    private IconStyle(String str, int i7, int i8, boolean z6, int i9) {
        this.size = i8;
        this.isCircle = z6;
        this.startPadding = i9;
    }

    @NotNull
    public static EnumEntries<IconStyle> getEntries() {
        return $ENTRIES;
    }

    public static IconStyle valueOf(String str) {
        return (IconStyle) Enum.valueOf(IconStyle.class, str);
    }

    public static IconStyle[] values() {
        return (IconStyle[]) $VALUES.clone();
    }

    public final int getSize() {
        return this.size;
    }

    public final int getStartPadding() {
        return this.startPadding;
    }

    public final boolean isCircle() {
        return this.isCircle;
    }
}
