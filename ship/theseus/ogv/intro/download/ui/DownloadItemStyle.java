package com.bilibili.ship.theseus.ogv.intro.download.ui;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadItemStyle.class */
public final class DownloadItemStyle {
    private static final EnumEntries $ENTRIES;
    private static final DownloadItemStyle[] $VALUES;
    public static final DownloadItemStyle GRID = new DownloadItemStyle("GRID", 0);
    public static final DownloadItemStyle LINE = new DownloadItemStyle(SocializeMedia.LINE, 1);

    private static final /* synthetic */ DownloadItemStyle[] $values() {
        return new DownloadItemStyle[]{GRID, LINE};
    }

    static {
        DownloadItemStyle[] downloadItemStyleArr$values = $values();
        $VALUES = downloadItemStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(downloadItemStyleArr$values);
    }

    private DownloadItemStyle(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DownloadItemStyle> getEntries() {
        return $ENTRIES;
    }

    public static DownloadItemStyle valueOf(String str) {
        return (DownloadItemStyle) Enum.valueOf(DownloadItemStyle.class, str);
    }

    public static DownloadItemStyle[] values() {
        return (DownloadItemStyle[]) $VALUES.clone();
    }
}
