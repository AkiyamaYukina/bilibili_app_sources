package com.bilibili.studio.editor.moudle.editormain.constans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/constans/EditorPage.class */
public final class EditorPage {
    private static final EnumEntries $ENTRIES;
    private static final EditorPage[] $VALUES;

    @NotNull
    private final String des;
    public static final EditorPage MAIN = new EditorPage("MAIN", 0, "主页面");
    public static final EditorPage PICTURE = new EditorPage("PICTURE", 1, "画幅");
    public static final EditorPage TEMPLATE = new EditorPage("TEMPLATE", 2, "模板");
    public static final EditorPage CLIP = new EditorPage("CLIP", 3, "剪辑");
    public static final EditorPage MUSIC = new EditorPage("MUSIC", 4, "音乐");
    public static final EditorPage CAPTION = new EditorPage("CAPTION", 5, "文字");
    public static final EditorPage STICKER = new EditorPage("STICKER", 6, "贴纸");
    public static final EditorPage FILTER = new EditorPage("FILTER", 7, "滤镜");
    public static final EditorPage RECORD = new EditorPage("RECORD", 8, "录音");
    public static final EditorPage RECORD_FX = new EditorPage("RECORD_FX", 9, "录音变声");
    public static final EditorPage DANMAKU = new EditorPage("DANMAKU", 10, "互动工具");
    public static final EditorPage TRANSITION = new EditorPage("TRANSITION", 11, "转场");

    private static final /* synthetic */ EditorPage[] $values() {
        return new EditorPage[]{MAIN, PICTURE, TEMPLATE, CLIP, MUSIC, CAPTION, STICKER, FILTER, RECORD, RECORD_FX, DANMAKU, TRANSITION};
    }

    static {
        EditorPage[] editorPageArr$values = $values();
        $VALUES = editorPageArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(editorPageArr$values);
    }

    private EditorPage(String str, int i7, String str2) {
        this.des = str2;
    }

    @NotNull
    public static EnumEntries<EditorPage> getEntries() {
        return $ENTRIES;
    }

    public static EditorPage valueOf(String str) {
        return (EditorPage) Enum.valueOf(EditorPage.class, str);
    }

    public static EditorPage[] values() {
        return (EditorPage[]) $VALUES.clone();
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }
}
