package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/DIRECTION.class */
public final class DIRECTION {
    private static final EnumEntries $ENTRIES;
    private static final DIRECTION[] $VALUES;
    public static final DIRECTION NONE = new DIRECTION("NONE", 0);
    public static final DIRECTION UP = new DIRECTION("UP", 1);
    public static final DIRECTION DOWN = new DIRECTION("DOWN", 2);

    private static final /* synthetic */ DIRECTION[] $values() {
        return new DIRECTION[]{NONE, UP, DOWN};
    }

    static {
        DIRECTION[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(directionArr$values);
    }

    private DIRECTION(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DIRECTION> getEntries() {
        return $ENTRIES;
    }

    public static DIRECTION valueOf(String str) {
        return (DIRECTION) Enum.valueOf(DIRECTION.class, str);
    }

    public static DIRECTION[] values() {
        return (DIRECTION[]) $VALUES.clone();
    }
}
