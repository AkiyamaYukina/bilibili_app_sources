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
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliFlashpointPacketType.class */
public final class BiliFlashpointPacketType {
    private static final EnumEntries $ENTRIES;
    private static final BiliFlashpointPacketType[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private static final Map<Integer, BiliFlashpointPacketType> map;
    private final int value;
    public static final BiliFlashpointPacketType UN_DEFINE = new BiliFlashpointPacketType("UN_DEFINE", 0, 1);
    public static final BiliFlashpointPacketType META = new BiliFlashpointPacketType("META", 1, 2);
    public static final BiliFlashpointPacketType IDR = new BiliFlashpointPacketType("IDR", 2, 4);
    public static final BiliFlashpointPacketType VIDEO_HEADER = new BiliFlashpointPacketType("VIDEO_HEADER", 3, 8);
    public static final BiliFlashpointPacketType AUDIO_HEADER = new BiliFlashpointPacketType("AUDIO_HEADER", 4, 16);
    public static final BiliFlashpointPacketType VIDEO = new BiliFlashpointPacketType("VIDEO", 5, 32);
    public static final BiliFlashpointPacketType AUDIO = new BiliFlashpointPacketType("AUDIO", 6, 64);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/BiliFlashpointPacketType$a.class */
    public static final class a {
    }

    private static final /* synthetic */ BiliFlashpointPacketType[] $values() {
        return new BiliFlashpointPacketType[]{UN_DEFINE, META, IDR, VIDEO_HEADER, AUDIO_HEADER, VIDEO, AUDIO};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mediastreaming.enums.BiliFlashpointPacketType$a, java.lang.Object] */
    static {
        BiliFlashpointPacketType[] biliFlashpointPacketTypeArr$values = $values();
        $VALUES = biliFlashpointPacketTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliFlashpointPacketTypeArr$values);
        Companion = new Object();
        EnumEntries<BiliFlashpointPacketType> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((BiliFlashpointPacketType) obj).value), obj);
        }
        map = linkedHashMap;
    }

    private BiliFlashpointPacketType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BiliFlashpointPacketType> getEntries() {
        return $ENTRIES;
    }

    public static BiliFlashpointPacketType valueOf(String str) {
        return (BiliFlashpointPacketType) Enum.valueOf(BiliFlashpointPacketType.class, str);
    }

    public static BiliFlashpointPacketType[] values() {
        return (BiliFlashpointPacketType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
