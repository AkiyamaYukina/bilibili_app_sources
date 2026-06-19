package com.bilibili.playerbizcommonv2.widget.setting.channel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingType.class */
public final class VideoSettingType {
    private static final EnumEntries $ENTRIES;
    private static final VideoSettingType[] $VALUES;
    public static final VideoSettingType TOP = new VideoSettingType("TOP", 0);
    public static final VideoSettingType MIDDLE = new VideoSettingType("MIDDLE", 1);
    public static final VideoSettingType BOTTOM = new VideoSettingType("BOTTOM", 2);
    public static final VideoSettingType TOP_BOTTOM = new VideoSettingType("TOP_BOTTOM", 3);

    private static final /* synthetic */ VideoSettingType[] $values() {
        return new VideoSettingType[]{TOP, MIDDLE, BOTTOM, TOP_BOTTOM};
    }

    static {
        VideoSettingType[] videoSettingTypeArr$values = $values();
        $VALUES = videoSettingTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoSettingTypeArr$values);
    }

    private VideoSettingType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<VideoSettingType> getEntries() {
        return $ENTRIES;
    }

    public static VideoSettingType valueOf(String str) {
        return (VideoSettingType) Enum.valueOf(VideoSettingType.class, str);
    }

    public static VideoSettingType[] values() {
        return (VideoSettingType[]) $VALUES.clone();
    }
}
