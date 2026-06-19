package com.bilibili.ship.theseus.united.page.deepblue;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/deepblue/DeepBlueTripleGuidePosition.class */
public final class DeepBlueTripleGuidePosition {
    private static final EnumEntries $ENTRIES;
    private static final DeepBlueTripleGuidePosition[] $VALUES;

    @NotNull
    private final String spKey;
    public static final DeepBlueTripleGuidePosition KingPosition = new DeepBlueTripleGuidePosition("KingPosition", 0, "deep_blue_king_position_like_triple_guide");
    public static final DeepBlueTripleGuidePosition EndPage = new DeepBlueTripleGuidePosition("EndPage", 1, "deep_blue_end_page_like_triple_guide");

    private static final /* synthetic */ DeepBlueTripleGuidePosition[] $values() {
        return new DeepBlueTripleGuidePosition[]{KingPosition, EndPage};
    }

    static {
        DeepBlueTripleGuidePosition[] deepBlueTripleGuidePositionArr$values = $values();
        $VALUES = deepBlueTripleGuidePositionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(deepBlueTripleGuidePositionArr$values);
    }

    private DeepBlueTripleGuidePosition(String str, int i7, String str2) {
        this.spKey = str2;
    }

    @NotNull
    public static EnumEntries<DeepBlueTripleGuidePosition> getEntries() {
        return $ENTRIES;
    }

    public static DeepBlueTripleGuidePosition valueOf(String str) {
        return (DeepBlueTripleGuidePosition) Enum.valueOf(DeepBlueTripleGuidePosition.class, str);
    }

    public static DeepBlueTripleGuidePosition[] values() {
        return (DeepBlueTripleGuidePosition[]) $VALUES.clone();
    }

    @NotNull
    public final String getSpKey() {
        return this.spKey;
    }
}
