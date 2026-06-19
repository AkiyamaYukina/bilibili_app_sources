package com.bilibili.ship.theseus.ogv.operation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/ActionArouseType.class */
public final class ActionArouseType implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final ActionArouseType[] $VALUES;

    @NotNull
    private final String value;
    public static final ActionArouseType NEW_PAGE = new ActionArouseType("NEW_PAGE", 0, "new_page");
    public static final ActionArouseType HALF_SCREEN = new ActionArouseType("HALF_SCREEN", 1, "half_screen");

    private static final /* synthetic */ ActionArouseType[] $values() {
        return new ActionArouseType[]{NEW_PAGE, HALF_SCREEN};
    }

    static {
        ActionArouseType[] actionArouseTypeArr$values = $values();
        $VALUES = actionArouseTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(actionArouseTypeArr$values);
    }

    private ActionArouseType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ActionArouseType> getEntries() {
        return $ENTRIES;
    }

    public static ActionArouseType valueOf(String str) {
        return (ActionArouseType) Enum.valueOf(ActionArouseType.class, str);
    }

    public static ActionArouseType[] values() {
        return (ActionArouseType[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
