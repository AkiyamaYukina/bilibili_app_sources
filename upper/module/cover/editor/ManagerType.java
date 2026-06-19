package com.bilibili.upper.module.cover.editor;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/ManagerType.class */
public final class ManagerType {
    private static final EnumEntries $ENTRIES;
    private static final ManagerType[] $VALUES;
    public static final ManagerType TYPE_16_9 = new ManagerType("TYPE_16_9", 0);
    public static final ManagerType TYPE_4_3 = new ManagerType("TYPE_4_3", 1);

    private static final /* synthetic */ ManagerType[] $values() {
        return new ManagerType[]{TYPE_16_9, TYPE_4_3};
    }

    static {
        ManagerType[] managerTypeArr$values = $values();
        $VALUES = managerTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(managerTypeArr$values);
    }

    private ManagerType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ManagerType> getEntries() {
        return $ENTRIES;
    }

    public static ManagerType valueOf(String str) {
        return (ManagerType) Enum.valueOf(ManagerType.class, str);
    }

    public static ManagerType[] values() {
        return (ManagerType[]) $VALUES.clone();
    }
}
