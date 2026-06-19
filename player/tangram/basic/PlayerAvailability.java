package com.bilibili.player.tangram.basic;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayerAvailability.class */
public final class PlayerAvailability {
    private static final EnumEntries $ENTRIES;
    private static final PlayerAvailability[] $VALUES;
    public static final PlayerAvailability IDLE = new PlayerAvailability("IDLE", 0);
    public static final PlayerAvailability LOADING = new PlayerAvailability("LOADING", 1);
    public static final PlayerAvailability FORBIDDEN = new PlayerAvailability("FORBIDDEN", 2);
    public static final PlayerAvailability READY = new PlayerAvailability("READY", 3);
    public static final PlayerAvailability ERROR = new PlayerAvailability("ERROR", 4);
    public static final PlayerAvailability COMPLETED = new PlayerAvailability("COMPLETED", 5);

    private static final /* synthetic */ PlayerAvailability[] $values() {
        return new PlayerAvailability[]{IDLE, LOADING, FORBIDDEN, READY, ERROR, COMPLETED};
    }

    static {
        PlayerAvailability[] playerAvailabilityArr$values = $values();
        $VALUES = playerAvailabilityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playerAvailabilityArr$values);
    }

    private PlayerAvailability(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PlayerAvailability> getEntries() {
        return $ENTRIES;
    }

    public static PlayerAvailability valueOf(String str) {
        return (PlayerAvailability) Enum.valueOf(PlayerAvailability.class, str);
    }

    public static PlayerAvailability[] values() {
        return (PlayerAvailability[]) $VALUES.clone();
    }
}
