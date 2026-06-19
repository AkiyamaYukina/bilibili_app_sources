package com.bilibili.search2.stardust.suggest;

import Rs0.a;
import com.bilibili.search2.api.suggest.PgcSugWord;
import com.bilibili.search2.api.suggest.UserSugWord;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/suggest/SugType.class */
public final class SugType {
    private static final EnumEntries $ENTRIES;
    private static final SugType[] $VALUES;

    @NotNull
    private final Class<?> sugType;
    private final int value;
    public static final SugType USER = new SugType("USER", 0, 4, a.class);
    public static final SugType USER_NEW = new SugType("USER_NEW", 1, 81, UserSugWord.class);
    public static final SugType PGC = new SugType("PGC", 2, 8, a.class);
    public static final SugType PGC_NEW = new SugType("PGC_NEW", 3, 82, PgcSugWord.class);

    private static final /* synthetic */ SugType[] $values() {
        return new SugType[]{USER, USER_NEW, PGC, PGC_NEW};
    }

    static {
        SugType[] sugTypeArr$values = $values();
        $VALUES = sugTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sugTypeArr$values);
    }

    private SugType(String str, int i7, int i8, Class cls) {
        this.value = i8;
        this.sugType = cls;
    }

    @NotNull
    public static EnumEntries<SugType> getEntries() {
        return $ENTRIES;
    }

    public static SugType valueOf(String str) {
        return (SugType) Enum.valueOf(SugType.class, str);
    }

    public static SugType[] values() {
        return (SugType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
