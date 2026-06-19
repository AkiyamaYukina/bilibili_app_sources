package com.bilibili.ship.theseus.ogv.activity;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/ActivityDialogShowOccasion.class */
public final class ActivityDialogShowOccasion implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final ActivityDialogShowOccasion[] $VALUES;

    @NotNull
    private final String value;
    public static final ActivityDialogShowOccasion IMMEDIATE = new ActivityDialogShowOccasion("IMMEDIATE", 0, "ENTER");
    public static final ActivityDialogShowOccasion EXITING_PAGE = new ActivityDialogShowOccasion("EXITING_PAGE", 1, "QUIT");

    private static final /* synthetic */ ActivityDialogShowOccasion[] $values() {
        return new ActivityDialogShowOccasion[]{IMMEDIATE, EXITING_PAGE};
    }

    static {
        ActivityDialogShowOccasion[] activityDialogShowOccasionArr$values = $values();
        $VALUES = activityDialogShowOccasionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(activityDialogShowOccasionArr$values);
    }

    private ActivityDialogShowOccasion(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ActivityDialogShowOccasion> getEntries() {
        return $ENTRIES;
    }

    public static ActivityDialogShowOccasion valueOf(String str) {
        return (ActivityDialogShowOccasion) Enum.valueOf(ActivityDialogShowOccasion.class, str);
    }

    public static ActivityDialogShowOccasion[] values() {
        return (ActivityDialogShowOccasion[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
