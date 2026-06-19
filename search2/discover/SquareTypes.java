package com.bilibili.search2.discover;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/SquareTypes.class */
public final class SquareTypes {
    private static final EnumEntries $ENTRIES;
    private static final SquareTypes[] $VALUES;

    @NotNull
    private String type;
    public static final SquareTypes TRENDING = new SquareTypes("TRENDING", 0, "trending");
    public static final SquareTypes RECOMMEND = new SquareTypes("RECOMMEND", 1, "recommend");
    public static final SquareTypes HISTORY = new SquareTypes("HISTORY", 2, "history");

    private static final /* synthetic */ SquareTypes[] $values() {
        return new SquareTypes[]{TRENDING, RECOMMEND, HISTORY};
    }

    static {
        SquareTypes[] squareTypesArr$values = $values();
        $VALUES = squareTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(squareTypesArr$values);
    }

    private SquareTypes(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<SquareTypes> getEntries() {
        return $ENTRIES;
    }

    public static SquareTypes valueOf(String str) {
        return (SquareTypes) Enum.valueOf(SquareTypes.class, str);
    }

    public static SquareTypes[] values() {
        return (SquareTypes[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        this.type = str;
    }
}
