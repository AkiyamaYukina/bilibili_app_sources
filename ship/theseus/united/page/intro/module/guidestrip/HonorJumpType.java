package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/HonorJumpType.class */
public final class HonorJumpType implements com.bilibili.bson.adapter.a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final HonorJumpType[] $VALUES;
    private final int value;
    public static final HonorJumpType HONOR_JUMP_TYPE_UNKNOWN = new HonorJumpType("HONOR_JUMP_TYPE_UNKNOWN", 0, 0);
    public static final HonorJumpType HONOR_OPEN_URL = new HonorJumpType("HONOR_OPEN_URL", 1, 1);
    public static final HonorJumpType HONOR_HALF_SCREEN = new HonorJumpType("HONOR_HALF_SCREEN", 2, 2);
    public static final HonorJumpType HONOR_POPUP = new HonorJumpType("HONOR_POPUP", 3, 3);

    private static final /* synthetic */ HonorJumpType[] $values() {
        return new HonorJumpType[]{HONOR_JUMP_TYPE_UNKNOWN, HONOR_OPEN_URL, HONOR_HALF_SCREEN, HONOR_POPUP};
    }

    static {
        HonorJumpType[] honorJumpTypeArr$values = $values();
        $VALUES = honorJumpTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(honorJumpTypeArr$values);
    }

    private HonorJumpType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<HonorJumpType> getEntries() {
        return $ENTRIES;
    }

    public static HonorJumpType valueOf(String str) {
        return (HonorJumpType) Enum.valueOf(HonorJumpType.class, str);
    }

    public static HonorJumpType[] values() {
        return (HonorJumpType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9462getValue() {
        return Integer.valueOf(this.value);
    }
}
