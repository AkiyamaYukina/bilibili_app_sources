package com.bilibili.pegasus.channelv3.feed;

import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/ChannelDetailCardActionType.class */
public final class ChannelDetailCardActionType {
    private static final EnumEntries $ENTRIES;
    private static final ChannelDetailCardActionType[] $VALUES;

    @NotNull
    private final String type;
    public static final ChannelDetailCardActionType DETAIL = new ChannelDetailCardActionType("DETAIL", 0, "detail");
    public static final ChannelDetailCardActionType LIKE = new ChannelDetailCardActionType("LIKE", 1, IVideoLikeRouteService.ACTION_LIKE);
    public static final ChannelDetailCardActionType CANCEL_LIKE = new ChannelDetailCardActionType("CANCEL_LIKE", 2, "cancel_like");
    public static final ChannelDetailCardActionType SPACE = new ChannelDetailCardActionType("SPACE", 3, "space");
    public static final ChannelDetailCardActionType THREE = new ChannelDetailCardActionType("THREE", 4, "three");

    private static final /* synthetic */ ChannelDetailCardActionType[] $values() {
        return new ChannelDetailCardActionType[]{DETAIL, LIKE, CANCEL_LIKE, SPACE, THREE};
    }

    static {
        ChannelDetailCardActionType[] channelDetailCardActionTypeArr$values = $values();
        $VALUES = channelDetailCardActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelDetailCardActionTypeArr$values);
    }

    private ChannelDetailCardActionType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<ChannelDetailCardActionType> getEntries() {
        return $ENTRIES;
    }

    public static ChannelDetailCardActionType valueOf(String str) {
        return (ChannelDetailCardActionType) Enum.valueOf(ChannelDetailCardActionType.class, str);
    }

    public static ChannelDetailCardActionType[] values() {
        return (ChannelDetailCardActionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
