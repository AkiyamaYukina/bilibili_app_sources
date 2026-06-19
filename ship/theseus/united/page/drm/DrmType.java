package com.bilibili.ship.theseus.united.page.drm;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/drm/DrmType.class */
public final class DrmType implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final DrmType[] $VALUES;
    private final int value;
    public static final DrmType NON = new DrmType("NON", 0, 0);
    public static final DrmType FAIR_PLAY = new DrmType("FAIR_PLAY", 1, 1);
    public static final DrmType WIDE_VINE = new DrmType("WIDE_VINE", 2, 2);
    public static final DrmType BILI_DRM = new DrmType("BILI_DRM", 3, 3);

    private static final /* synthetic */ DrmType[] $values() {
        return new DrmType[]{NON, FAIR_PLAY, WIDE_VINE, BILI_DRM};
    }

    static {
        DrmType[] drmTypeArr$values = $values();
        $VALUES = drmTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(drmTypeArr$values);
    }

    private DrmType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<DrmType> getEntries() {
        return $ENTRIES;
    }

    public static DrmType valueOf(String str) {
        return (DrmType) Enum.valueOf(DrmType.class, str);
    }

    public static DrmType[] values() {
        return (DrmType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9427getValue() {
        return Integer.valueOf(this.value);
    }

    public final boolean isDrm() {
        return this != NON;
    }
}
