package com.bilibili.studio.editor.smarttitle.constans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/constans/SmartTitleType.class */
public final class SmartTitleType {
    private static final EnumEntries $ENTRIES;
    private static final SmartTitleType[] $VALUES;
    public static final SmartTitleType DEFAULT = new SmartTitleType("DEFAULT", 0);
    public static final SmartTitleType UNIVERSAL = new SmartTitleType("UNIVERSAL", 1);
    public static final SmartTitleType STYLIZATION = new SmartTitleType("STYLIZATION", 2);

    private static final /* synthetic */ SmartTitleType[] $values() {
        return new SmartTitleType[]{DEFAULT, UNIVERSAL, STYLIZATION};
    }

    static {
        SmartTitleType[] smartTitleTypeArr$values = $values();
        $VALUES = smartTitleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(smartTitleTypeArr$values);
    }

    private SmartTitleType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SmartTitleType> getEntries() {
        return $ENTRIES;
    }

    public static SmartTitleType valueOf(String str) {
        return (SmartTitleType) Enum.valueOf(SmartTitleType.class, str);
    }

    public static SmartTitleType[] values() {
        return (SmartTitleType[]) $VALUES.clone();
    }
}
