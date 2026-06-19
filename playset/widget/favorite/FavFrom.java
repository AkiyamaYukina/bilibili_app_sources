package com.bilibili.playset.widget.favorite;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavFrom.class */
public final class FavFrom {
    private static final EnumEntries $ENTRIES;
    private static final FavFrom[] $VALUES;
    public static final FavFrom Fav = new FavFrom("Fav", 0);
    public static final FavFrom Triple = new FavFrom("Triple", 1);
    public static final FavFrom Dialog = new FavFrom("Dialog", 2);

    private static final /* synthetic */ FavFrom[] $values() {
        return new FavFrom[]{Fav, Triple, Dialog};
    }

    static {
        FavFrom[] favFromArr$values = $values();
        $VALUES = favFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(favFromArr$values);
    }

    private FavFrom(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FavFrom> getEntries() {
        return $ENTRIES;
    }

    public static FavFrom valueOf(String str) {
        return (FavFrom) Enum.valueOf(FavFrom.class, str);
    }

    public static FavFrom[] values() {
        return (FavFrom[]) $VALUES.clone();
    }
}
