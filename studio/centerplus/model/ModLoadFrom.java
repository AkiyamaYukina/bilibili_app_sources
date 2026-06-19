package com.bilibili.studio.centerplus.model;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/ModLoadFrom.class */
public final class ModLoadFrom {
    private static final EnumEntries $ENTRIES;
    private static final ModLoadFrom[] $VALUES;

    @NotNull
    private final String value;
    public static final ModLoadFrom NONE = new ModLoadFrom("NONE", 0, "none");
    public static final ModLoadFrom LIVE = new ModLoadFrom(SocializeMedia.BILI_LIVE, 1, "开直播");
    public static final ModLoadFrom CAPTURE = new ModLoadFrom("CAPTURE", 2, "拍摄");
    public static final ModLoadFrom UPLOAD = new ModLoadFrom("UPLOAD", 3, "上传");
    public static final ModLoadFrom AI_COLLECTION = new ModLoadFrom("AI_COLLECTION", 4, "AI阵地");
    public static final ModLoadFrom FOLLOWING = new ModLoadFrom("FOLLOWING", 5, "发动态");
    public static final ModLoadFrom FOLLOWING_PICK = new ModLoadFrom("FOLLOWING_PICK", 6, "动态选择视频");
    public static final ModLoadFrom FOLLOWING_EDIT = new ModLoadFrom("FOLLOWING_EDIT", 7, "动态编辑图片");
    public static final ModLoadFrom FOLLOWING_EDIT_BMM = new ModLoadFrom("FOLLOWING_EDIT_BMM", 8, "动态编辑图片");
    public static final ModLoadFrom VIDEO_TEMPLATE = new ModLoadFrom("VIDEO_TEMPLATE", 9, "视频模板");
    public static final ModLoadFrom VIDEO_TEMPLATE_ENTRANCE = new ModLoadFrom("VIDEO_TEMPLATE_ENTRANCE", 10, "视频模板图文入口");
    public static final ModLoadFrom VIDEO_TEMPLATE_DERAIL = new ModLoadFrom("VIDEO_TEMPLATE_DERAIL", 11, "视频模板详情页");

    private static final /* synthetic */ ModLoadFrom[] $values() {
        return new ModLoadFrom[]{NONE, LIVE, CAPTURE, UPLOAD, AI_COLLECTION, FOLLOWING, FOLLOWING_PICK, FOLLOWING_EDIT, FOLLOWING_EDIT_BMM, VIDEO_TEMPLATE, VIDEO_TEMPLATE_ENTRANCE, VIDEO_TEMPLATE_DERAIL};
    }

    static {
        ModLoadFrom[] modLoadFromArr$values = $values();
        $VALUES = modLoadFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(modLoadFromArr$values);
    }

    private ModLoadFrom(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ModLoadFrom> getEntries() {
        return $ENTRIES;
    }

    public static ModLoadFrom valueOf(String str) {
        return (ModLoadFrom) Enum.valueOf(ModLoadFrom.class, str);
    }

    public static ModLoadFrom[] values() {
        return (ModLoadFrom[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
