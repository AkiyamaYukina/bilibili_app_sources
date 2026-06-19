package com.bilibili.tgwt.chatroom;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/PlayStatus.class */
public final class PlayStatus {
    private static final EnumEntries $ENTRIES;
    private static final PlayStatus[] $VALUES;
    private final int value;
    public static final PlayStatus PLAYING = new PlayStatus("PLAYING", 0, 1);
    public static final PlayStatus PAUSE = new PlayStatus("PAUSE", 1, 0);
    public static final PlayStatus COMPLETED = new PlayStatus("COMPLETED", 2, 2);

    private static final /* synthetic */ PlayStatus[] $values() {
        return new PlayStatus[]{PLAYING, PAUSE, COMPLETED};
    }

    static {
        PlayStatus[] playStatusArr$values = $values();
        $VALUES = playStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playStatusArr$values);
    }

    private PlayStatus(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PlayStatus> getEntries() {
        return $ENTRIES;
    }

    public static PlayStatus valueOf(String str) {
        return (PlayStatus) Enum.valueOf(PlayStatus.class, str);
    }

    public static PlayStatus[] values() {
        return (PlayStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
