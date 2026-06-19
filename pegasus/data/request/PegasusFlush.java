package com.bilibili.pegasus.data.request;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/request/PegasusFlush.class */
public final class PegasusFlush {
    private static final EnumEntries $ENTRIES;
    private static final PegasusFlush[] $VALUES;
    private final int value;
    public static final PegasusFlush NORMAL = new PegasusFlush("NORMAL", 0, 0);
    public static final PegasusFlush AUTO_BACK_FROM_BACKGROUND = new PegasusFlush("AUTO_BACK_FROM_BACKGROUND", 1, 1);
    public static final PegasusFlush SWITCH_STYLE = new PegasusFlush("SWITCH_STYLE", 2, 2);
    public static final PegasusFlush INTEREST = new PegasusFlush("INTEREST", 3, 3);
    public static final PegasusFlush SWITCH_PEGASUS_RECOMMEND_MODE = new PegasusFlush("SWITCH_PEGASUS_RECOMMEND_MODE", 4, 4);
    public static final PegasusFlush TAB_CLICK = new PegasusFlush("TAB_CLICK", 5, 5);
    public static final PegasusFlush PULL_DOWN = new PegasusFlush("PULL_DOWN", 6, 6);
    public static final PegasusFlush TOP_REFRESH_BUTTON_CLICK = new PegasusFlush("TOP_REFRESH_BUTTON_CLICK", 7, 7);
    public static final PegasusFlush PULL_UP = new PegasusFlush("PULL_UP", 8, 8);
    public static final PegasusFlush AUTO_BACK_FROM_OTHER_PAGE = new PegasusFlush("AUTO_BACK_FROM_OTHER_PAGE", 9, 9);
    public static final PegasusFlush SWITCH_RECOMMEND_MODE_FROM_SETTINGS = new PegasusFlush("SWITCH_RECOMMEND_MODE_FROM_SETTINGS", 10, 11);
    public static final PegasusFlush SWITCH_RECOMMEND_MODE_FROM_GUIDANCE = new PegasusFlush("SWITCH_RECOMMEND_MODE_FROM_GUIDANCE", 11, 12);
    public static final PegasusFlush TAB_CLICK_WITH_OFFSET = new PegasusFlush("TAB_CLICK_WITH_OFFSET", 12, 14);
    public static final PegasusFlush TAB_DOUBLE_CLICK = new PegasusFlush("TAB_DOUBLE_CLICK", 13, 15);
    public static final PegasusFlush BOTTOM_REFRESH_BUTTON_CLICK = new PegasusFlush("BOTTOM_REFRESH_BUTTON_CLICK", 14, 16);
    public static final PegasusFlush VIDEO_MODE_CHANGE = new PegasusFlush("VIDEO_MODE_CHANGE", 15, 17);
    public static final PegasusFlush REFRESH_GUIDANCE = new PegasusFlush("REFRESH_GUIDANCE", 16, 18);
    public static final PegasusFlush HOME_TAB_REFRESH_GUIDANCE = new PegasusFlush("HOME_TAB_REFRESH_GUIDANCE", 17, 19);
    public static final PegasusFlush AUTO_BACK_FROM_BEHAVIOR = new PegasusFlush("AUTO_BACK_FROM_BEHAVIOR", 18, 20);
    public static final PegasusFlush LOGIN_CHANGE = new PegasusFlush("LOGIN_CHANGE", 19, 21);
    public static final PegasusFlush FLUSH_TAB_SWITCH_COLUMN = new PegasusFlush("FLUSH_TAB_SWITCH_COLUMN", 20, 22);
    public static final PegasusFlush FLUSH_ON_BACK_PRESS = new PegasusFlush("FLUSH_ON_BACK_PRESS", 21, 23);
    public static final PegasusFlush GRADUATION_26 = new PegasusFlush("GRADUATION_26", 22, 26);

    private static final /* synthetic */ PegasusFlush[] $values() {
        return new PegasusFlush[]{NORMAL, AUTO_BACK_FROM_BACKGROUND, SWITCH_STYLE, INTEREST, SWITCH_PEGASUS_RECOMMEND_MODE, TAB_CLICK, PULL_DOWN, TOP_REFRESH_BUTTON_CLICK, PULL_UP, AUTO_BACK_FROM_OTHER_PAGE, SWITCH_RECOMMEND_MODE_FROM_SETTINGS, SWITCH_RECOMMEND_MODE_FROM_GUIDANCE, TAB_CLICK_WITH_OFFSET, TAB_DOUBLE_CLICK, BOTTOM_REFRESH_BUTTON_CLICK, VIDEO_MODE_CHANGE, REFRESH_GUIDANCE, HOME_TAB_REFRESH_GUIDANCE, AUTO_BACK_FROM_BEHAVIOR, LOGIN_CHANGE, FLUSH_TAB_SWITCH_COLUMN, FLUSH_ON_BACK_PRESS, GRADUATION_26};
    }

    static {
        PegasusFlush[] pegasusFlushArr$values = $values();
        $VALUES = pegasusFlushArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pegasusFlushArr$values);
    }

    private PegasusFlush(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PegasusFlush> getEntries() {
        return $ENTRIES;
    }

    public static PegasusFlush valueOf(String str) {
        return (PegasusFlush) Enum.valueOf(PegasusFlush.class, str);
    }

    public static PegasusFlush[] values() {
        return (PegasusFlush[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isUserRequest() {
        return this == PULL_DOWN || this == PULL_UP || this == TAB_CLICK || this == TOP_REFRESH_BUTTON_CLICK || this == NORMAL || this == TAB_CLICK_WITH_OFFSET;
    }
}
