package com.bilibili.mediastreaming.enums;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliFlashpointErrorType.class */
public final class BiliFlashpointErrorType {
    private static final EnumEntries $ENTRIES;
    private static final BiliFlashpointErrorType[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private static final Map<Integer, BiliFlashpointErrorType> map;
    public static final BiliFlashpointErrorType UN_DEFINE = new BiliFlashpointErrorType("UN_DEFINE", 0);
    public static final BiliFlashpointErrorType CONNECT_SUCCESS_NUM = new BiliFlashpointErrorType("CONNECT_SUCCESS_NUM", 1);
    public static final BiliFlashpointErrorType AVCODEC_TYPE = new BiliFlashpointErrorType("AVCODEC_TYPE", 2);
    public static final BiliFlashpointErrorType DISPATCH_MANAGEMENT = new BiliFlashpointErrorType("DISPATCH_MANAGEMENT", 3);
    public static final BiliFlashpointErrorType PARAMETER = new BiliFlashpointErrorType("PARAMETER", 4);
    public static final BiliFlashpointErrorType CONNECT_STATS = new BiliFlashpointErrorType("CONNECT_STATS", 5);
    public static final BiliFlashpointErrorType NET_STATS = new BiliFlashpointErrorType("NET_STATS", 6);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliFlashpointErrorType$a.class */
    public static final class a {
    }

    private static final /* synthetic */ BiliFlashpointErrorType[] $values() {
        return new BiliFlashpointErrorType[]{UN_DEFINE, CONNECT_SUCCESS_NUM, AVCODEC_TYPE, DISPATCH_MANAGEMENT, PARAMETER, CONNECT_STATS, NET_STATS};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mediastreaming.enums.BiliFlashpointErrorType$a, java.lang.Object] */
    static {
        BiliFlashpointErrorType[] biliFlashpointErrorTypeArr$values = $values();
        $VALUES = biliFlashpointErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliFlashpointErrorTypeArr$values);
        Companion = new Object();
        EnumEntries<BiliFlashpointErrorType> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((BiliFlashpointErrorType) obj).ordinal()), obj);
        }
        map = linkedHashMap;
    }

    private BiliFlashpointErrorType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliFlashpointErrorType> getEntries() {
        return $ENTRIES;
    }

    public static BiliFlashpointErrorType valueOf(String str) {
        return (BiliFlashpointErrorType) Enum.valueOf(BiliFlashpointErrorType.class, str);
    }

    public static BiliFlashpointErrorType[] values() {
        return (BiliFlashpointErrorType[]) $VALUES.clone();
    }
}
