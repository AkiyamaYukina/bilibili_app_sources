package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMediaType.class */
@Keep
public final class BiligameMediaType implements Serializable {
    private static final EnumEntries $ENTRIES;
    private static final BiligameMediaType[] $VALUES;
    public static final BiligameMediaType Video = new BiligameMediaType("Video", 0);
    public static final BiligameMediaType Picture = new BiligameMediaType("Picture", 1);

    private static final /* synthetic */ BiligameMediaType[] $values() {
        return new BiligameMediaType[]{Video, Picture};
    }

    static {
        BiligameMediaType[] biligameMediaTypeArr$values = $values();
        $VALUES = biligameMediaTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biligameMediaTypeArr$values);
    }

    private BiligameMediaType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiligameMediaType> getEntries() {
        return $ENTRIES;
    }

    public static BiligameMediaType valueOf(String str) {
        return (BiligameMediaType) Enum.valueOf(BiligameMediaType.class, str);
    }

    public static BiligameMediaType[] values() {
        return (BiligameMediaType[]) $VALUES.clone();
    }
}
