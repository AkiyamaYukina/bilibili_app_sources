package com.bilibili.playerbizcommonv2.widget.setting;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/VideoSettingJumpType.class */
public final class VideoSettingJumpType {
    private static final EnumEntries $ENTRIES;
    private static final VideoSettingJumpType[] $VALUES;
    public static final VideoSettingJumpType WEB_IN_APP = new VideoSettingJumpType("WEB_IN_APP", 0);
    public static final VideoSettingJumpType WEB_IN_HALF = new VideoSettingJumpType("WEB_IN_HALF", 1);
    public static final VideoSettingJumpType WEB_IN_BROWSER = new VideoSettingJumpType("WEB_IN_BROWSER", 2);

    private static final /* synthetic */ VideoSettingJumpType[] $values() {
        return new VideoSettingJumpType[]{WEB_IN_APP, WEB_IN_HALF, WEB_IN_BROWSER};
    }

    static {
        VideoSettingJumpType[] videoSettingJumpTypeArr$values = $values();
        $VALUES = videoSettingJumpTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoSettingJumpTypeArr$values);
    }

    private VideoSettingJumpType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<VideoSettingJumpType> getEntries() {
        return $ENTRIES;
    }

    public static VideoSettingJumpType valueOf(String str) {
        return (VideoSettingJumpType) Enum.valueOf(VideoSettingJumpType.class, str);
    }

    public static VideoSettingJumpType[] values() {
        return (VideoSettingJumpType[]) $VALUES.clone();
    }
}
