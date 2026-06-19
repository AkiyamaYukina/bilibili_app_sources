package com.bilibili.studio.videoeditor.ms.report;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/report/InitScene.class */
public final class InitScene {
    private static final EnumEntries $ENTRIES;
    private static final InitScene[] $VALUES;
    public static final InitScene CENTER_PLUS_ALBUM = new InitScene("CENTER_PLUS_ALBUM", 0, "center_plus_album");
    public static final InitScene OPEN_AUTH = new InitScene("OPEN_AUTH", 1, "open_auth");

    @NotNull
    private final String value;

    private static final /* synthetic */ InitScene[] $values() {
        return new InitScene[]{CENTER_PLUS_ALBUM, OPEN_AUTH};
    }

    static {
        InitScene[] initSceneArr$values = $values();
        $VALUES = initSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(initSceneArr$values);
    }

    private InitScene(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<InitScene> getEntries() {
        return $ENTRIES;
    }

    public static InitScene valueOf(String str) {
        return (InitScene) Enum.valueOf(InitScene.class, str);
    }

    public static InitScene[] values() {
        return (InitScene[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
