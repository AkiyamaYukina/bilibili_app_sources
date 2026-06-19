package com.bilibili.studio.editor.asr.bean;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AsrSource.class */
public final class AsrSource {
    private static final EnumEntries $ENTRIES;
    private static final AsrSource[] $VALUES;
    public static final AsrSource INTELLIGENCE = new AsrSource("INTELLIGENCE", 0, 0);
    public static final AsrSource EDITOR = new AsrSource("EDITOR", 1, 1);
    public static final AsrSource SECTION = new AsrSource("SECTION", 2, 2);

    private static final /* synthetic */ AsrSource[] $values() {
        return new AsrSource[]{INTELLIGENCE, EDITOR, SECTION};
    }

    static {
        AsrSource[] asrSourceArr$values = $values();
        $VALUES = asrSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(asrSourceArr$values);
    }

    private AsrSource(String str, int i7, int i8) {
    }

    @NotNull
    public static EnumEntries<AsrSource> getEntries() {
        return $ENTRIES;
    }

    public static AsrSource valueOf(String str) {
        return (AsrSource) Enum.valueOf(AsrSource.class, str);
    }

    public static AsrSource[] values() {
        return (AsrSource[]) $VALUES.clone();
    }
}
