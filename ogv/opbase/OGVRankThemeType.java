package com.bilibili.ogv.opbase;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/OGVRankThemeType.class */
public final class OGVRankThemeType implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final OGVRankThemeType[] $VALUES;
    private final int value;
    public static final OGVRankThemeType UNKNOWN = new OGVRankThemeType("UNKNOWN", 0, 0);
    public static final OGVRankThemeType AUTO = new OGVRankThemeType("AUTO", 1, 1);
    public static final OGVRankThemeType DARK = new OGVRankThemeType("DARK", 2, 2);

    private static final /* synthetic */ OGVRankThemeType[] $values() {
        return new OGVRankThemeType[]{UNKNOWN, AUTO, DARK};
    }

    static {
        OGVRankThemeType[] oGVRankThemeTypeArr$values = $values();
        $VALUES = oGVRankThemeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(oGVRankThemeTypeArr$values);
    }

    private OGVRankThemeType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<OGVRankThemeType> getEntries() {
        return $ENTRIES;
    }

    public static OGVRankThemeType valueOf(String str) {
        return (OGVRankThemeType) Enum.valueOf(OGVRankThemeType.class, str);
    }

    public static OGVRankThemeType[] values() {
        return (OGVRankThemeType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m7457getValue() {
        return Integer.valueOf(this.value);
    }
}
