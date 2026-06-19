package com.bilibili.studio.media.check;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/check/MediaCheckScene.class */
public final class MediaCheckScene {
    private static final EnumEntries $ENTRIES;
    private static final MediaCheckScene[] $VALUES;

    @NotNull
    private final String des;

    @NotNull
    private final String location;
    public static final MediaCheckScene UNDEFINED = new MediaCheckScene("UNDEFINED", 0, "0", "未定义");
    public static final MediaCheckScene LOAD = new MediaCheckScene("LOAD", 1, "1", "素材扫描");
    public static final MediaCheckScene CLICK_SELECT = new MediaCheckScene("CLICK_SELECT", 2, "2", "点击选择");
    public static final MediaCheckScene CLICK_SELECT_AI_STORY_ADD = new MediaCheckScene("CLICK_SELECT_AI_STORY_ADD", 3, "2", "AI故事添加素材");
    public static final MediaCheckScene PREVIEW = new MediaCheckScene("PREVIEW", 4, "3", "点击预览");
    public static final MediaCheckScene EDITOR_OVER = new MediaCheckScene("EDITOR_OVER", 5, "4", "编辑完成发布");
    public static final MediaCheckScene CAPTURE_PREVIEW_PUBLISH = new MediaCheckScene("CAPTURE_PREVIEW_PUBLISH", 6, "5", "拍摄预览页发布");

    private static final /* synthetic */ MediaCheckScene[] $values() {
        return new MediaCheckScene[]{UNDEFINED, LOAD, CLICK_SELECT, CLICK_SELECT_AI_STORY_ADD, PREVIEW, EDITOR_OVER, CAPTURE_PREVIEW_PUBLISH};
    }

    static {
        MediaCheckScene[] mediaCheckSceneArr$values = $values();
        $VALUES = mediaCheckSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mediaCheckSceneArr$values);
    }

    private MediaCheckScene(String str, int i7, String str2, String str3) {
        this.location = str2;
        this.des = str3;
    }

    @NotNull
    public static EnumEntries<MediaCheckScene> getEntries() {
        return $ENTRIES;
    }

    public static MediaCheckScene valueOf(String str) {
        return (MediaCheckScene) Enum.valueOf(MediaCheckScene.class, str);
    }

    public static MediaCheckScene[] values() {
        return (MediaCheckScene[]) $VALUES.clone();
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }
}
