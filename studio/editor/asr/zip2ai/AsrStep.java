package com.bilibili.studio.editor.asr.zip2ai;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/AsrStep.class */
public final class AsrStep {
    private static final EnumEntries $ENTRIES;
    private static final AsrStep[] $VALUES;
    public static final AsrStep START = new AsrStep("START", 0);
    public static final AsrStep PACKAGE = new AsrStep("PACKAGE", 1);
    public static final AsrStep UPLOAD = new AsrStep("UPLOAD", 2);
    public static final AsrStep PREHEAT = new AsrStep("PREHEAT", 3);
    public static final AsrStep END = new AsrStep("END", 4);

    private static final /* synthetic */ AsrStep[] $values() {
        return new AsrStep[]{START, PACKAGE, UPLOAD, PREHEAT, END};
    }

    static {
        AsrStep[] asrStepArr$values = $values();
        $VALUES = asrStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(asrStepArr$values);
    }

    private AsrStep(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AsrStep> getEntries() {
        return $ENTRIES;
    }

    public static AsrStep valueOf(String str) {
        return (AsrStep) Enum.valueOf(AsrStep.class, str);
    }

    public static AsrStep[] values() {
        return (AsrStep[]) $VALUES.clone();
    }
}
