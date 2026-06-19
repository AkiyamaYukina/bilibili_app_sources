package com.bilibili.playerbizcommonv2.service.audio;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/audio/DolbyType.class */
public final class DolbyType {
    private static final EnumEntries $ENTRIES;
    private static final DolbyType[] $VALUES;
    public static final DolbyType UNKNOWN = new DolbyType("UNKNOWN", 0);
    public static final DolbyType VIDEO_AND_AUDIO = new DolbyType("VIDEO_AND_AUDIO", 1);
    public static final DolbyType VIDEO = new DolbyType("VIDEO", 2);
    public static final DolbyType AUDIO = new DolbyType("AUDIO", 3);

    private static final /* synthetic */ DolbyType[] $values() {
        return new DolbyType[]{UNKNOWN, VIDEO_AND_AUDIO, VIDEO, AUDIO};
    }

    static {
        DolbyType[] dolbyTypeArr$values = $values();
        $VALUES = dolbyTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dolbyTypeArr$values);
    }

    private DolbyType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DolbyType> getEntries() {
        return $ENTRIES;
    }

    public static DolbyType valueOf(String str) {
        return (DolbyType) Enum.valueOf(DolbyType.class, str);
    }

    public static DolbyType[] values() {
        return (DolbyType[]) $VALUES.clone();
    }
}
