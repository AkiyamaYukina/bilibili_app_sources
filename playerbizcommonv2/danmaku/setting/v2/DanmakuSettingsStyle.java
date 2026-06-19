package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsStyle.class */
public final class DanmakuSettingsStyle {
    private static final EnumEntries $ENTRIES;
    private static final DanmakuSettingsStyle[] $VALUES;
    public static final DanmakuSettingsStyle TOP = new DanmakuSettingsStyle("TOP", 0);
    public static final DanmakuSettingsStyle MIDDLE = new DanmakuSettingsStyle("MIDDLE", 1);
    public static final DanmakuSettingsStyle BOTTOM = new DanmakuSettingsStyle("BOTTOM", 2);
    public static final DanmakuSettingsStyle TOP_WITHOUT_DIVIDER = new DanmakuSettingsStyle("TOP_WITHOUT_DIVIDER", 3);
    public static final DanmakuSettingsStyle MIDDLE_WITHOUT_DIVIDER = new DanmakuSettingsStyle("MIDDLE_WITHOUT_DIVIDER", 4);
    public static final DanmakuSettingsStyle SINGLE = new DanmakuSettingsStyle("SINGLE", 5);

    private static final /* synthetic */ DanmakuSettingsStyle[] $values() {
        return new DanmakuSettingsStyle[]{TOP, MIDDLE, BOTTOM, TOP_WITHOUT_DIVIDER, MIDDLE_WITHOUT_DIVIDER, SINGLE};
    }

    static {
        DanmakuSettingsStyle[] danmakuSettingsStyleArr$values = $values();
        $VALUES = danmakuSettingsStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(danmakuSettingsStyleArr$values);
    }

    private DanmakuSettingsStyle(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DanmakuSettingsStyle> getEntries() {
        return $ENTRIES;
    }

    public static DanmakuSettingsStyle valueOf(String str) {
        return (DanmakuSettingsStyle) Enum.valueOf(DanmakuSettingsStyle.class, str);
    }

    public static DanmakuSettingsStyle[] values() {
        return (DanmakuSettingsStyle[]) $VALUES.clone();
    }
}
