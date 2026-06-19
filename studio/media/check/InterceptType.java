package com.bilibili.studio.media.check;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/check/InterceptType.class */
public final class InterceptType {
    private static final EnumEntries $ENTRIES;
    private static final InterceptType[] $VALUES;
    public static final InterceptType NONE = new InterceptType("NONE", 0);
    public static final InterceptType TOAST = new InterceptType("TOAST", 1);
    public static final InterceptType DIALOG = new InterceptType("DIALOG", 2);

    private static final /* synthetic */ InterceptType[] $values() {
        return new InterceptType[]{NONE, TOAST, DIALOG};
    }

    static {
        InterceptType[] interceptTypeArr$values = $values();
        $VALUES = interceptTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interceptTypeArr$values);
    }

    private InterceptType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<InterceptType> getEntries() {
        return $ENTRIES;
    }

    public static InterceptType valueOf(String str) {
        return (InterceptType) Enum.valueOf(InterceptType.class, str);
    }

    public static InterceptType[] values() {
        return (InterceptType[]) $VALUES.clone();
    }
}
