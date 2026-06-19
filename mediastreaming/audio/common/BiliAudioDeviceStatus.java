package com.bilibili.mediastreaming.audio.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/common/BiliAudioDeviceStatus.class */
public final class BiliAudioDeviceStatus {
    private static final EnumEntries $ENTRIES;
    private static final BiliAudioDeviceStatus[] $VALUES;
    public static final BiliAudioDeviceStatus OPEN = new BiliAudioDeviceStatus("OPEN", 0);
    public static final BiliAudioDeviceStatus STOP = new BiliAudioDeviceStatus("STOP", 1);

    private static final /* synthetic */ BiliAudioDeviceStatus[] $values() {
        return new BiliAudioDeviceStatus[]{OPEN, STOP};
    }

    static {
        BiliAudioDeviceStatus[] biliAudioDeviceStatusArr$values = $values();
        $VALUES = biliAudioDeviceStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliAudioDeviceStatusArr$values);
    }

    private BiliAudioDeviceStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliAudioDeviceStatus> getEntries() {
        return $ENTRIES;
    }

    public static BiliAudioDeviceStatus valueOf(String str) {
        return (BiliAudioDeviceStatus) Enum.valueOf(BiliAudioDeviceStatus.class, str);
    }

    public static BiliAudioDeviceStatus[] values() {
        return (BiliAudioDeviceStatus[]) $VALUES.clone();
    }
}
