package com.bilibili.music.podcast.player.init;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/init/MusicActivityHandleMode.class */
public final class MusicActivityHandleMode {
    private static final EnumEntries $ENTRIES;
    private static final MusicActivityHandleMode[] $VALUES;
    public static final MusicActivityHandleMode CLEAR_MODULE = new MusicActivityHandleMode("CLEAR_MODULE", 0);
    public static final MusicActivityHandleMode SINGLE_MODULE = new MusicActivityHandleMode("SINGLE_MODULE", 1);

    private static final /* synthetic */ MusicActivityHandleMode[] $values() {
        return new MusicActivityHandleMode[]{CLEAR_MODULE, SINGLE_MODULE};
    }

    static {
        MusicActivityHandleMode[] musicActivityHandleModeArr$values = $values();
        $VALUES = musicActivityHandleModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(musicActivityHandleModeArr$values);
    }

    private MusicActivityHandleMode(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MusicActivityHandleMode> getEntries() {
        return $ENTRIES;
    }

    public static MusicActivityHandleMode valueOf(String str) {
        return (MusicActivityHandleMode) Enum.valueOf(MusicActivityHandleMode.class, str);
    }

    public static MusicActivityHandleMode[] values() {
        return (MusicActivityHandleMode[]) $VALUES.clone();
    }
}
