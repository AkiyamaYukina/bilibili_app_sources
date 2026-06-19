package com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/interf/ShowBubbleType.class */
public final class ShowBubbleType {
    private static final EnumEntries $ENTRIES;
    private static final ShowBubbleType[] $VALUES;
    private final int value;
    public static final ShowBubbleType Unknown = new ShowBubbleType("Unknown", 0, -1);
    public static final ShowBubbleType SwitchDevice = new ShowBubbleType("SwitchDevice", 1, 1);
    public static final ShowBubbleType Damaku = new ShowBubbleType("Damaku", 2, 2);
    public static final ShowBubbleType Speed = new ShowBubbleType("Speed", 3, 3);
    public static final ShowBubbleType Quality = new ShowBubbleType("Quality", 4, 4);

    private static final /* synthetic */ ShowBubbleType[] $values() {
        return new ShowBubbleType[]{Unknown, SwitchDevice, Damaku, Speed, Quality};
    }

    static {
        ShowBubbleType[] showBubbleTypeArr$values = $values();
        $VALUES = showBubbleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(showBubbleTypeArr$values);
    }

    private ShowBubbleType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<ShowBubbleType> getEntries() {
        return $ENTRIES;
    }

    public static ShowBubbleType valueOf(String str) {
        return (ShowBubbleType) Enum.valueOf(ShowBubbleType.class, str);
    }

    public static ShowBubbleType[] values() {
        return (ShowBubbleType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
