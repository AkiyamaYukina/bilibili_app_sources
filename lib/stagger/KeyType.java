package com.bilibili.lib.stagger;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/KeyType.class */
public final class KeyType {
    private static final EnumEntries $ENTRIES;
    private static final KeyType[] $VALUES;
    public static final KeyType TASK_ID = new KeyType("TASK_ID", 0);
    public static final KeyType HASH = new KeyType("HASH", 1);

    private static final /* synthetic */ KeyType[] $values() {
        return new KeyType[]{TASK_ID, HASH};
    }

    static {
        KeyType[] keyTypeArr$values = $values();
        $VALUES = keyTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(keyTypeArr$values);
    }

    private KeyType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<KeyType> getEntries() {
        return $ENTRIES;
    }

    public static KeyType valueOf(String str) {
        return (KeyType) Enum.valueOf(KeyType.class, str);
    }

    public static KeyType[] values() {
        return (KeyType[]) $VALUES.clone();
    }
}
