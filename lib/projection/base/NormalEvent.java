package com.bilibili.lib.projection.base;

import ge0.f;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/base/NormalEvent.class */
public final class NormalEvent implements f {
    private static final EnumEntries $ENTRIES;
    private static final NormalEvent[] $VALUES;
    public static final NormalEvent SEEK_COMPLETE = new NormalEvent("SEEK_COMPLETE", 0);

    private static final /* synthetic */ NormalEvent[] $values() {
        return new NormalEvent[]{SEEK_COMPLETE};
    }

    static {
        NormalEvent[] normalEventArr$values = $values();
        $VALUES = normalEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(normalEventArr$values);
    }

    private NormalEvent(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<NormalEvent> getEntries() {
        return $ENTRIES;
    }

    public static NormalEvent valueOf(String str) {
        return (NormalEvent) Enum.valueOf(NormalEvent.class, str);
    }

    public static NormalEvent[] values() {
        return (NormalEvent[]) $VALUES.clone();
    }
}
