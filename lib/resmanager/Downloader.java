package com.bilibili.lib.resmanager;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/Downloader.class */
public final class Downloader {
    private static final EnumEntries $ENTRIES;
    private static final Downloader[] $VALUES;
    public static final Downloader DEFAULT = new Downloader("DEFAULT", 0);
    public static final Downloader BILI = new Downloader("BILI", 1);

    private static final /* synthetic */ Downloader[] $values() {
        return new Downloader[]{DEFAULT, BILI};
    }

    static {
        Downloader[] downloaderArr$values = $values();
        $VALUES = downloaderArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(downloaderArr$values);
    }

    private Downloader(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<Downloader> getEntries() {
        return $ENTRIES;
    }

    public static Downloader valueOf(String str) {
        return (Downloader) Enum.valueOf(Downloader.class, str);
    }

    public static Downloader[] values() {
        return (Downloader[]) $VALUES.clone();
    }
}
