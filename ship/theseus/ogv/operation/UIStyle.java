package com.bilibili.ship.theseus.ogv.operation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/UIStyle.class */
public final class UIStyle implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final UIStyle[] $VALUES;

    @NotNull
    private final String value;
    public static final UIStyle BAR_ICON = new UIStyle("BAR_ICON", 0, "ICON_FLOAT_LAYER");
    public static final UIStyle BAR_COUNT_DOWN = new UIStyle("BAR_COUNT_DOWN", 1, "COUNT_DOWN_FLOAT_LAYER");
    public static final UIStyle DIALOG_BANNER = new UIStyle("DIALOG_BANNER", 2, "HALF_SCREEN_POPUP");
    public static final UIStyle DIALOG_IMAGE_BUTTON = new UIStyle("DIALOG_IMAGE_BUTTON", 3, "POP_UP_WINDOW");

    private static final /* synthetic */ UIStyle[] $values() {
        return new UIStyle[]{BAR_ICON, BAR_COUNT_DOWN, DIALOG_BANNER, DIALOG_IMAGE_BUTTON};
    }

    static {
        UIStyle[] uIStyleArr$values = $values();
        $VALUES = uIStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uIStyleArr$values);
    }

    private UIStyle(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<UIStyle> getEntries() {
        return $ENTRIES;
    }

    public static UIStyle valueOf(String str) {
        return (UIStyle) Enum.valueOf(UIStyle.class, str);
    }

    public static UIStyle[] values() {
        return (UIStyle[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
