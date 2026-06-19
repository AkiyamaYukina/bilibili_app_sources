package com.bilibili.ship.theseus.cheese.player.layer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/ShowLayerFrom.class */
public final class ShowLayerFrom {
    private static final EnumEntries $ENTRIES;
    private static final ShowLayerFrom[] $VALUES;
    public static final ShowLayerFrom DEAFULT = new ShowLayerFrom("DEAFULT", 0);
    public static final ShowLayerFrom CAN_NOT_PREVIEW = new ShowLayerFrom("CAN_NOT_PREVIEW", 1);
    public static final ShowLayerFrom PARTLY_PREVIEW = new ShowLayerFrom("PARTLY_PREVIEW", 2);
    public static final ShowLayerFrom PIECE_CHEESE_VERIFY = new ShowLayerFrom("PIECE_CHEESE_VERIFY", 3);

    private static final /* synthetic */ ShowLayerFrom[] $values() {
        return new ShowLayerFrom[]{DEAFULT, CAN_NOT_PREVIEW, PARTLY_PREVIEW, PIECE_CHEESE_VERIFY};
    }

    static {
        ShowLayerFrom[] showLayerFromArr$values = $values();
        $VALUES = showLayerFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(showLayerFromArr$values);
    }

    private ShowLayerFrom(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ShowLayerFrom> getEntries() {
        return $ENTRIES;
    }

    public static ShowLayerFrom valueOf(String str) {
        return (ShowLayerFrom) Enum.valueOf(ShowLayerFrom.class, str);
    }

    public static ShowLayerFrom[] values() {
        return (ShowLayerFrom[]) $VALUES.clone();
    }
}
