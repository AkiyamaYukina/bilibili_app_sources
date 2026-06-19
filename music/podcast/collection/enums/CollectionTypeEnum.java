package com.bilibili.music.podcast.collection.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionTypeEnum.class */
public final class CollectionTypeEnum {
    private static final EnumEntries $ENTRIES;
    private static final CollectionTypeEnum[] $VALUES;
    private final int typeValue;
    public static final CollectionTypeEnum UGC = new CollectionTypeEnum("UGC", 0, 2);
    public static final CollectionTypeEnum SEASON = new CollectionTypeEnum("SEASON", 1, 21);
    public static final CollectionTypeEnum UGC_SEASON = new CollectionTypeEnum("UGC_SEASON", 2, 2);
    public static final CollectionTypeEnum OGV = new CollectionTypeEnum("OGV", 3, 24);
    public static final CollectionTypeEnum AUDIO = new CollectionTypeEnum("AUDIO", 4, 12);
    public static final CollectionTypeEnum FOLDER = new CollectionTypeEnum("FOLDER", 5, 11);
    public static final CollectionTypeEnum UNKNOWN = new CollectionTypeEnum("UNKNOWN", 6, -1);

    private static final /* synthetic */ CollectionTypeEnum[] $values() {
        return new CollectionTypeEnum[]{UGC, SEASON, UGC_SEASON, OGV, AUDIO, FOLDER, UNKNOWN};
    }

    static {
        CollectionTypeEnum[] collectionTypeEnumArr$values = $values();
        $VALUES = collectionTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(collectionTypeEnumArr$values);
    }

    private CollectionTypeEnum(String str, int i7, int i8) {
        this.typeValue = i8;
    }

    @NotNull
    public static EnumEntries<CollectionTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static CollectionTypeEnum valueOf(String str) {
        return (CollectionTypeEnum) Enum.valueOf(CollectionTypeEnum.class, str);
    }

    public static CollectionTypeEnum[] values() {
        return (CollectionTypeEnum[]) $VALUES.clone();
    }

    public final int value() {
        return this.typeValue;
    }
}
