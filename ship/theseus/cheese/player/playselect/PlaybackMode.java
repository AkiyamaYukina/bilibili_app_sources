package com.bilibili.ship.theseus.cheese.player.playselect;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/PlaybackMode.class */
public final class PlaybackMode {
    private static final EnumEntries $ENTRIES;
    private static final PlaybackMode[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    public static final String KEY_PLAY_ACTION_MODE_AFTER_ENDED = "pref_player_completion_action_key3";
    private final int value;
    public static final PlaybackMode AUTO_CONTINUOUS = new PlaybackMode("AUTO_CONTINUOUS", 0, 0);
    public static final PlaybackMode PAUSE_WHEN_ENDED = new PlaybackMode("PAUSE_WHEN_ENDED", 1, 1);
    public static final PlaybackMode SINGLE_EPISODE_LOOP = new PlaybackMode("SINGLE_EPISODE_LOOP", 2, 2);
    public static final PlaybackMode LIST_LOOP = new PlaybackMode("LIST_LOOP", 3, 4);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/PlaybackMode$a.class */
    public static final class a {
        @NotNull
        public static PlaybackMode a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? PlaybackMode.AUTO_CONTINUOUS : PlaybackMode.LIST_LOOP : PlaybackMode.SINGLE_EPISODE_LOOP : PlaybackMode.PAUSE_WHEN_ENDED : PlaybackMode.AUTO_CONTINUOUS;
        }
    }

    private static final /* synthetic */ PlaybackMode[] $values() {
        return new PlaybackMode[]{AUTO_CONTINUOUS, PAUSE_WHEN_ENDED, SINGLE_EPISODE_LOOP, LIST_LOOP};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode$a, java.lang.Object] */
    static {
        PlaybackMode[] playbackModeArr$values = $values();
        $VALUES = playbackModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playbackModeArr$values);
        Companion = new Object();
    }

    private PlaybackMode(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PlaybackMode> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackMode valueOf(String str) {
        return (PlaybackMode) Enum.valueOf(PlaybackMode.class, str);
    }

    public static PlaybackMode[] values() {
        return (PlaybackMode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
