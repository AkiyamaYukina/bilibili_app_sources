package com.bilibili.ship.theseus.ugc.intro.tools;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/ToolsType.class */
public final class ToolsType {
    private static final EnumEntries $ENTRIES;
    private static final ToolsType[] $VALUES;
    public static final ToolsType Unknown = new ToolsType("Unknown", 0);
    public static final ToolsType CommandDanmaku = new ToolsType("CommandDanmaku", 1);
    public static final ToolsType InteractiveSettings = new ToolsType("InteractiveSettings", 2);
    public static final ToolsType UPVideoMentions = new ToolsType("UPVideoMentions", 3);
    public static final ToolsType UNIVERSAL = new ToolsType("UNIVERSAL", 4);

    private static final /* synthetic */ ToolsType[] $values() {
        return new ToolsType[]{Unknown, CommandDanmaku, InteractiveSettings, UPVideoMentions, UNIVERSAL};
    }

    static {
        ToolsType[] toolsTypeArr$values = $values();
        $VALUES = toolsTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(toolsTypeArr$values);
    }

    private ToolsType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ToolsType> getEntries() {
        return $ENTRIES;
    }

    public static ToolsType valueOf(String str) {
        return (ToolsType) Enum.valueOf(ToolsType.class, str);
    }

    public static ToolsType[] values() {
        return (ToolsType[]) $VALUES.clone();
    }
}
