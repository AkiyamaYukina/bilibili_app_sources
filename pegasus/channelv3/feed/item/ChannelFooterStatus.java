package com.bilibili.pegasus.channelv3.feed.item;

import androidx.annotation.StringRes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/item/ChannelFooterStatus.class */
public final class ChannelFooterStatus {
    private static final EnumEntries $ENTRIES;
    private static final ChannelFooterStatus[] $VALUES;
    private final int leftRes;
    private final int rightRes;
    private final boolean showLoadingBar;
    public static final ChannelFooterStatus CHANNEL_LOADING = new ChannelFooterStatus("CHANNEL_LOADING", 0, 0, 0, true);
    public static final ChannelFooterStatus CHANNEL_NO_MORE = new ChannelFooterStatus("CHANNEL_NO_MORE", 1, 2131841344, 0, false);
    public static final ChannelFooterStatus CHANNEL_ERROR = new ChannelFooterStatus("CHANNEL_ERROR", 2, 2131845314, 2131841457, false);

    private static final /* synthetic */ ChannelFooterStatus[] $values() {
        return new ChannelFooterStatus[]{CHANNEL_LOADING, CHANNEL_NO_MORE, CHANNEL_ERROR};
    }

    static {
        ChannelFooterStatus[] channelFooterStatusArr$values = $values();
        $VALUES = channelFooterStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(channelFooterStatusArr$values);
    }

    private ChannelFooterStatus(@StringRes String str, @StringRes int i7, int i8, int i9, boolean z6) {
        this.leftRes = i8;
        this.rightRes = i9;
        this.showLoadingBar = z6;
    }

    @NotNull
    public static EnumEntries<ChannelFooterStatus> getEntries() {
        return $ENTRIES;
    }

    public static ChannelFooterStatus valueOf(String str) {
        return (ChannelFooterStatus) Enum.valueOf(ChannelFooterStatus.class, str);
    }

    public static ChannelFooterStatus[] values() {
        return (ChannelFooterStatus[]) $VALUES.clone();
    }

    public final int getLeftRes() {
        return this.leftRes;
    }

    public final int getRightRes() {
        return this.rightRes;
    }

    public final boolean getShowLoadingBar() {
        return this.showLoadingBar;
    }
}
