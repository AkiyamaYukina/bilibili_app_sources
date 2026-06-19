package com.bilibili.ship.theseus.ogv.ep;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/ContinuingType.class */
public final class ContinuingType {
    private static final EnumEntries $ENTRIES;
    private static final ContinuingType[] $VALUES;
    private final boolean incrementChainIndex;
    public static final ContinuingType NotContinuing = new ContinuingType("NotContinuing", 0, false);
    public static final ContinuingType RemoteStrategy = new ContinuingType("RemoteStrategy", 1, true);
    public static final ContinuingType LocalStrategy = new ContinuingType("LocalStrategy", 2, false);

    private static final /* synthetic */ ContinuingType[] $values() {
        return new ContinuingType[]{NotContinuing, RemoteStrategy, LocalStrategy};
    }

    static {
        ContinuingType[] continuingTypeArr$values = $values();
        $VALUES = continuingTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(continuingTypeArr$values);
    }

    private ContinuingType(String str, int i7, boolean z6) {
        this.incrementChainIndex = z6;
    }

    @NotNull
    public static EnumEntries<ContinuingType> getEntries() {
        return $ENTRIES;
    }

    public static ContinuingType valueOf(String str) {
        return (ContinuingType) Enum.valueOf(ContinuingType.class, str);
    }

    public static ContinuingType[] values() {
        return (ContinuingType[]) $VALUES.clone();
    }

    public final boolean getIncrementChainIndex() {
        return this.incrementChainIndex;
    }
}
