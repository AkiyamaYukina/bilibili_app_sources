package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/SeasonMode.class */
public final class SeasonMode implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final SeasonMode[] $VALUES;
    private final int value;
    public static final SeasonMode SINGLE_EPISODE = new SeasonMode("SINGLE_EPISODE", 0, 1);
    public static final SeasonMode MULTIPLE_EPISODE = new SeasonMode("MULTIPLE_EPISODE", 1, 2);

    private static final /* synthetic */ SeasonMode[] $values() {
        return new SeasonMode[]{SINGLE_EPISODE, MULTIPLE_EPISODE};
    }

    static {
        SeasonMode[] seasonModeArr$values = $values();
        $VALUES = seasonModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(seasonModeArr$values);
    }

    private SeasonMode(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<SeasonMode> getEntries() {
        return $ENTRIES;
    }

    public static SeasonMode valueOf(String str) {
        return (SeasonMode) Enum.valueOf(SeasonMode.class, str);
    }

    public static SeasonMode[] values() {
        return (SeasonMode[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9149getValue() {
        return Integer.valueOf(this.value);
    }
}
