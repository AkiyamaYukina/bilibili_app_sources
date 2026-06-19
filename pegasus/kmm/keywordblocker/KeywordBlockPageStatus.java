package com.bilibili.pegasus.kmm.keywordblocker;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/KeywordBlockPageStatus.class */
public final class KeywordBlockPageStatus {
    private static final EnumEntries $ENTRIES;
    private static final KeywordBlockPageStatus[] $VALUES;
    public static final KeywordBlockPageStatus Idle = new KeywordBlockPageStatus("Idle", 0);
    public static final KeywordBlockPageStatus LoadedWithData = new KeywordBlockPageStatus("LoadedWithData", 1);
    public static final KeywordBlockPageStatus Empty = new KeywordBlockPageStatus("Empty", 2);
    public static final KeywordBlockPageStatus Editing = new KeywordBlockPageStatus("Editing", 3);
    public static final KeywordBlockPageStatus Adding = new KeywordBlockPageStatus("Adding", 4);
    public static final KeywordBlockPageStatus AddingEmpty = new KeywordBlockPageStatus("AddingEmpty", 5);

    private static final /* synthetic */ KeywordBlockPageStatus[] $values() {
        return new KeywordBlockPageStatus[]{Idle, LoadedWithData, Empty, Editing, Adding, AddingEmpty};
    }

    static {
        KeywordBlockPageStatus[] keywordBlockPageStatusArr$values = $values();
        $VALUES = keywordBlockPageStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(keywordBlockPageStatusArr$values);
    }

    private KeywordBlockPageStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<KeywordBlockPageStatus> getEntries() {
        return $ENTRIES;
    }

    public static KeywordBlockPageStatus valueOf(String str) {
        return (KeywordBlockPageStatus) Enum.valueOf(KeywordBlockPageStatus.class, str);
    }

    public static KeywordBlockPageStatus[] values() {
        return (KeywordBlockPageStatus[]) $VALUES.clone();
    }
}
