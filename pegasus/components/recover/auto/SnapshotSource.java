package com.bilibili.pegasus.components.recover.auto;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/auto/SnapshotSource.class */
public final class SnapshotSource {
    private static final EnumEntries $ENTRIES;
    private static final SnapshotSource[] $VALUES;
    public static final SnapshotSource PAGE_LEAVE = new SnapshotSource("PAGE_LEAVE", 0);
    public static final SnapshotSource PAGE_INVISIBLE = new SnapshotSource("PAGE_INVISIBLE", 1);
    public static final SnapshotSource PAGE_PAUSE = new SnapshotSource("PAGE_PAUSE", 2);
    public static final SnapshotSource DESTROY_VIEW = new SnapshotSource("DESTROY_VIEW", 3);

    private static final /* synthetic */ SnapshotSource[] $values() {
        return new SnapshotSource[]{PAGE_LEAVE, PAGE_INVISIBLE, PAGE_PAUSE, DESTROY_VIEW};
    }

    static {
        SnapshotSource[] snapshotSourceArr$values = $values();
        $VALUES = snapshotSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(snapshotSourceArr$values);
    }

    private SnapshotSource(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<SnapshotSource> getEntries() {
        return $ENTRIES;
    }

    public static SnapshotSource valueOf(String str) {
        return (SnapshotSource) Enum.valueOf(SnapshotSource.class, str);
    }

    public static SnapshotSource[] values() {
        return (SnapshotSource[]) $VALUES.clone();
    }
}
