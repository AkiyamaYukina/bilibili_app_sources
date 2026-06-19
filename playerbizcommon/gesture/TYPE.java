package com.bilibili.playerbizcommon.gesture;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/TYPE.class */
public final class TYPE {
    private static final EnumEntries $ENTRIES;
    private static final TYPE[] $VALUES;
    public static final TYPE BRIGHTNESS = new TYPE("BRIGHTNESS", 0);
    public static final TYPE VOLUME = new TYPE("VOLUME", 1);

    private static final /* synthetic */ TYPE[] $values() {
        return new TYPE[]{BRIGHTNESS, VOLUME};
    }

    static {
        TYPE[] typeArr$values = $values();
        $VALUES = typeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
    }

    private TYPE(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TYPE> getEntries() {
        return $ENTRIES;
    }

    public static TYPE valueOf(String str) {
        return (TYPE) Enum.valueOf(TYPE.class, str);
    }

    public static TYPE[] values() {
        return (TYPE[]) $VALUES.clone();
    }
}
