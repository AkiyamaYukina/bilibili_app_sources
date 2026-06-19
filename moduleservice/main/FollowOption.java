package com.bilibili.moduleservice.main;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/FollowOption.class */
public final class FollowOption {
    private static final EnumEntries $ENTRIES;
    private static final FollowOption[] $VALUES;
    public static final FollowOption ADD = new FollowOption("ADD", 0);
    public static final FollowOption REMOVE = new FollowOption("REMOVE", 1);

    private static final /* synthetic */ FollowOption[] $values() {
        return new FollowOption[]{ADD, REMOVE};
    }

    static {
        FollowOption[] followOptionArr$values = $values();
        $VALUES = followOptionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(followOptionArr$values);
    }

    private FollowOption(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FollowOption> getEntries() {
        return $ENTRIES;
    }

    public static FollowOption valueOf(String str) {
        return (FollowOption) Enum.valueOf(FollowOption.class, str);
    }

    public static FollowOption[] values() {
        return (FollowOption[]) $VALUES.clone();
    }
}
