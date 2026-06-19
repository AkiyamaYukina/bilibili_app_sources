package com.bilibili.playerbizcommon.features.online;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/online/OnlineScheme.class */
public final class OnlineScheme {
    private static final EnumEntries $ENTRIES;
    private static final OnlineScheme[] $VALUES;
    public static final OnlineScheme UGC = new OnlineScheme("UGC", 0);
    public static final OnlineScheme OGV = new OnlineScheme("OGV", 1);

    private static final /* synthetic */ OnlineScheme[] $values() {
        return new OnlineScheme[]{UGC, OGV};
    }

    static {
        OnlineScheme[] onlineSchemeArr$values = $values();
        $VALUES = onlineSchemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(onlineSchemeArr$values);
    }

    private OnlineScheme(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<OnlineScheme> getEntries() {
        return $ENTRIES;
    }

    public static OnlineScheme valueOf(String str) {
        return (OnlineScheme) Enum.valueOf(OnlineScheme.class, str);
    }

    public static OnlineScheme[] values() {
        return (OnlineScheme[]) $VALUES.clone();
    }
}
