package com.bilibili.lib.projection.constant;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/constant/DirectionConst.class */
public final class DirectionConst {
    private static final EnumEntries $ENTRIES;
    private static final DirectionConst[] $VALUES;
    public static final DirectionConst LEFT = new DirectionConst("LEFT", 0);
    public static final DirectionConst CENTER = new DirectionConst("CENTER", 1);
    public static final DirectionConst RIGHT = new DirectionConst("RIGHT", 2);
    public static final DirectionConst NONE = new DirectionConst("NONE", 3);

    private static final /* synthetic */ DirectionConst[] $values() {
        return new DirectionConst[]{LEFT, CENTER, RIGHT, NONE};
    }

    static {
        DirectionConst[] directionConstArr$values = $values();
        $VALUES = directionConstArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(directionConstArr$values);
    }

    private DirectionConst(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DirectionConst> getEntries() {
        return $ENTRIES;
    }

    public static DirectionConst valueOf(String str) {
        return (DirectionConst) Enum.valueOf(DirectionConst.class, str);
    }

    public static DirectionConst[] values() {
        return (DirectionConst[]) $VALUES.clone();
    }
}
