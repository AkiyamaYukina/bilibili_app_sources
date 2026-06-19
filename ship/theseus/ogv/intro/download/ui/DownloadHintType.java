package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadHintType.class */
public final class DownloadHintType {
    private static final EnumEntries $ENTRIES;
    private static final DownloadHintType[] $VALUES;
    public static final DownloadHintType DOWNLOAD_VIDEO_HINT = new DownloadHintType("DOWNLOAD_VIDEO_HINT", 0);
    public static final DownloadHintType DOWNLOAD_QUALITY_HINT = new DownloadHintType("DOWNLOAD_QUALITY_HINT", 1);
    public static final DownloadHintType DOWNLOAD_RESERVE_HINT = new DownloadHintType("DOWNLOAD_RESERVE_HINT", 2);
    public static final DownloadHintType DOWNLOAD_VIP_CACHE = new DownloadHintType("DOWNLOAD_VIP_CACHE", 3);
    public static final DownloadHintType DOWNLOAD_AUDIO_HINT = new DownloadHintType("DOWNLOAD_AUDIO_HINT", 4);

    private static final /* synthetic */ DownloadHintType[] $values() {
        return new DownloadHintType[]{DOWNLOAD_VIDEO_HINT, DOWNLOAD_QUALITY_HINT, DOWNLOAD_RESERVE_HINT, DOWNLOAD_VIP_CACHE, DOWNLOAD_AUDIO_HINT};
    }

    static {
        DownloadHintType[] downloadHintTypeArr$values = $values();
        $VALUES = downloadHintTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(downloadHintTypeArr$values);
    }

    private DownloadHintType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DownloadHintType> getEntries() {
        return $ENTRIES;
    }

    public static DownloadHintType valueOf(String str) {
        return (DownloadHintType) Enum.valueOf(DownloadHintType.class, str);
    }

    public static DownloadHintType[] values() {
        return (DownloadHintType[]) $VALUES.clone();
    }
}
