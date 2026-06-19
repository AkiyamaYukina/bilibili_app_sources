package com.bilibili.search2.eastereggs;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/EggTypes.class */
public final class EggTypes {
    private static final EnumEntries $ENTRIES;
    private static final EggTypes[] $VALUES;
    private int type;
    public static final EggTypes VIDEO = new EggTypes("VIDEO", 0, 1);
    public static final EggTypes WEB = new EggTypes("WEB", 1, 2);
    public static final EggTypes IMG = new EggTypes("IMG", 2, 3);

    private static final /* synthetic */ EggTypes[] $values() {
        return new EggTypes[]{VIDEO, WEB, IMG};
    }

    static {
        EggTypes[] eggTypesArr$values = $values();
        $VALUES = eggTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(eggTypesArr$values);
    }

    private EggTypes(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<EggTypes> getEntries() {
        return $ENTRIES;
    }

    public static EggTypes valueOf(String str) {
        return (EggTypes) Enum.valueOf(EggTypes.class, str);
    }

    public static EggTypes[] values() {
        return (EggTypes[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
