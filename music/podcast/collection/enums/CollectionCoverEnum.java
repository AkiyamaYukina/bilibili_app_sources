package com.bilibili.music.podcast.collection.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCoverEnum.class */
public final class CollectionCoverEnum {
    private static final EnumEntries $ENTRIES;
    private static final CollectionCoverEnum[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final CollectionCoverEnum CUSTOM = new CollectionCoverEnum("CUSTOM", 0, 0);
    public static final CollectionCoverEnum VIDEO = new CollectionCoverEnum("VIDEO", 1, 2);
    public static final CollectionCoverEnum OGV = new CollectionCoverEnum("OGV", 2, 24);
    public static final CollectionCoverEnum AUDIO = new CollectionCoverEnum("AUDIO", 3, 12);
    public static final CollectionCoverEnum SEASON = new CollectionCoverEnum("SEASON", 4, 21);
    public static final CollectionCoverEnum UNKNOWN = new CollectionCoverEnum("UNKNOWN", 5, -1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCoverEnum$a.class */
    public static final class a {
        @NotNull
        public static CollectionCoverEnum a(int i7) {
            CollectionCoverEnum collectionCoverEnum = CollectionCoverEnum.CUSTOM;
            if (i7 != collectionCoverEnum.getValue()) {
                collectionCoverEnum = CollectionCoverEnum.VIDEO;
                if (i7 != collectionCoverEnum.getValue()) {
                    collectionCoverEnum = CollectionCoverEnum.OGV;
                    if (i7 != collectionCoverEnum.getValue()) {
                        collectionCoverEnum = CollectionCoverEnum.AUDIO;
                        if (i7 != collectionCoverEnum.getValue()) {
                            collectionCoverEnum = CollectionCoverEnum.SEASON;
                            if (i7 != collectionCoverEnum.getValue()) {
                                collectionCoverEnum = CollectionCoverEnum.UNKNOWN;
                            }
                        }
                    }
                }
            }
            return collectionCoverEnum;
        }
    }

    private static final /* synthetic */ CollectionCoverEnum[] $values() {
        return new CollectionCoverEnum[]{CUSTOM, VIDEO, OGV, AUDIO, SEASON, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.music.podcast.collection.enums.CollectionCoverEnum$a, java.lang.Object] */
    static {
        CollectionCoverEnum[] collectionCoverEnumArr$values = $values();
        $VALUES = collectionCoverEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(collectionCoverEnumArr$values);
        Companion = new Object();
    }

    private CollectionCoverEnum(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<CollectionCoverEnum> getEntries() {
        return $ENTRIES;
    }

    public static CollectionCoverEnum valueOf(String str) {
        return (CollectionCoverEnum) Enum.valueOf(CollectionCoverEnum.class, str);
    }

    public static CollectionCoverEnum[] values() {
        return (CollectionCoverEnum[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
