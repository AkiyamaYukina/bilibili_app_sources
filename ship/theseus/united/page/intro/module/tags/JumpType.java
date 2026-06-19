package com.bilibili.ship.theseus.united.page.intro.module.tags;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/JumpType.class */
public final class JumpType {
    private static final EnumEntries $ENTRIES;
    private static final JumpType[] $VALUES;
    public static final JumpType FLUID = new JumpType("FLUID", 0, "fluid");
    public static final JumpType NEW_PAGE = new JumpType("NEW_PAGE", 1, "new_page");

    @NotNull
    private final String type;

    private static final /* synthetic */ JumpType[] $values() {
        return new JumpType[]{FLUID, NEW_PAGE};
    }

    static {
        JumpType[] jumpTypeArr$values = $values();
        $VALUES = jumpTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(jumpTypeArr$values);
    }

    private JumpType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<JumpType> getEntries() {
        return $ENTRIES;
    }

    public static JumpType valueOf(String str) {
        return (JumpType) Enum.valueOf(JumpType.class, str);
    }

    public static JumpType[] values() {
        return (JumpType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
