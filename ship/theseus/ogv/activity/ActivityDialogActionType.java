package com.bilibili.ship.theseus.ogv.activity;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/ActivityDialogActionType.class */
public final class ActivityDialogActionType implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final ActivityDialogActionType[] $VALUES;

    @NotNull
    private final String value;
    public static final ActivityDialogActionType EXEC = new ActivityDialogActionType("EXEC", 0, "report");
    public static final ActivityDialogActionType OPEN_WITH_ROUTE = new ActivityDialogActionType("OPEN_WITH_ROUTE", 1, "url");
    public static final ActivityDialogActionType EXPOSURE = new ActivityDialogActionType("EXPOSURE", 2, "show");
    public static final ActivityDialogActionType CLOSE = new ActivityDialogActionType("CLOSE", 3, "close");
    public static final ActivityDialogActionType CLOSE_BY_CLICK_IMAGE = new ActivityDialogActionType("CLOSE_BY_CLICK_IMAGE", 4, "inner_close");

    private static final /* synthetic */ ActivityDialogActionType[] $values() {
        return new ActivityDialogActionType[]{EXEC, OPEN_WITH_ROUTE, EXPOSURE, CLOSE, CLOSE_BY_CLICK_IMAGE};
    }

    static {
        ActivityDialogActionType[] activityDialogActionTypeArr$values = $values();
        $VALUES = activityDialogActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(activityDialogActionTypeArr$values);
    }

    private ActivityDialogActionType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ActivityDialogActionType> getEntries() {
        return $ENTRIES;
    }

    public static ActivityDialogActionType valueOf(String str) {
        return (ActivityDialogActionType) Enum.valueOf(ActivityDialogActionType.class, str);
    }

    public static ActivityDialogActionType[] values() {
        return (ActivityDialogActionType[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
