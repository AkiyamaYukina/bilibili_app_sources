package com.bilibili.pegasus.channelv3.utils;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/utils/ChannelStatus.class */
public final class ChannelStatus {
    private static final EnumEntries $ENTRIES;
    private static final ChannelStatus[] $VALUES;
    public static final ChannelStatus LOADING = new ChannelStatus("LOADING", 0);
    public static final ChannelStatus SUCCESS = new ChannelStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 1);
    public static final ChannelStatus ERROR = new ChannelStatus("ERROR", 2);
    public static final ChannelStatus EMPTY = new ChannelStatus("EMPTY", 3);

    private static final /* synthetic */ ChannelStatus[] $values() {
        return new ChannelStatus[]{LOADING, SUCCESS, ERROR, EMPTY};
    }

    static {
        ChannelStatus[] channelStatusArr$values = $values();
        $VALUES = channelStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelStatusArr$values);
    }

    private ChannelStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ChannelStatus> getEntries() {
        return $ENTRIES;
    }

    public static ChannelStatus valueOf(String str) {
        return (ChannelStatus) Enum.valueOf(ChannelStatus.class, str);
    }

    public static ChannelStatus[] values() {
        return (ChannelStatus[]) $VALUES.clone();
    }
}
