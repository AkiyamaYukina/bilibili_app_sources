package com.bilibili.studio.editor.smarttitle.constans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/constans/SmartTitlePromptType.class */
public final class SmartTitlePromptType {
    private static final EnumEntries $ENTRIES;
    private static final SmartTitlePromptType[] $VALUES;
    private final int value;
    public static final SmartTitlePromptType PROMPT_DEFAULT = new SmartTitlePromptType("PROMPT_DEFAULT", 0, 1);
    public static final SmartTitlePromptType PROMPT_UNIVERSAL = new SmartTitlePromptType("PROMPT_UNIVERSAL", 1, 2);
    public static final SmartTitlePromptType PROMPT_STYLE = new SmartTitlePromptType("PROMPT_STYLE", 2, 3);

    private static final /* synthetic */ SmartTitlePromptType[] $values() {
        return new SmartTitlePromptType[]{PROMPT_DEFAULT, PROMPT_UNIVERSAL, PROMPT_STYLE};
    }

    static {
        SmartTitlePromptType[] smartTitlePromptTypeArr$values = $values();
        $VALUES = smartTitlePromptTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(smartTitlePromptTypeArr$values);
    }

    private SmartTitlePromptType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<SmartTitlePromptType> getEntries() {
        return $ENTRIES;
    }

    public static SmartTitlePromptType valueOf(String str) {
        return (SmartTitlePromptType) Enum.valueOf(SmartTitlePromptType.class, str);
    }

    public static SmartTitlePromptType[] values() {
        return (SmartTitlePromptType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
