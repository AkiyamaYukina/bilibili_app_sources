package com.bilibili.pegasus.components.graduation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26GuideShowSource.class */
final class Graduation26GuideShowSource {
    private static final EnumEntries $ENTRIES;
    private static final Graduation26GuideShowSource[] $VALUES;
    public static final Graduation26GuideShowSource NORMAL = new Graduation26GuideShowSource("NORMAL", 0);
    public static final Graduation26GuideShowSource ROUTE = new Graduation26GuideShowSource("ROUTE", 1);

    private static final /* synthetic */ Graduation26GuideShowSource[] $values() {
        return new Graduation26GuideShowSource[]{NORMAL, ROUTE};
    }

    static {
        Graduation26GuideShowSource[] graduation26GuideShowSourceArr$values = $values();
        $VALUES = graduation26GuideShowSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(graduation26GuideShowSourceArr$values);
    }

    private Graduation26GuideShowSource(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<Graduation26GuideShowSource> getEntries() {
        return $ENTRIES;
    }

    public static Graduation26GuideShowSource valueOf(String str) {
        return (Graduation26GuideShowSource) Enum.valueOf(Graduation26GuideShowSource.class, str);
    }

    public static Graduation26GuideShowSource[] values() {
        return (Graduation26GuideShowSource[]) $VALUES.clone();
    }
}
