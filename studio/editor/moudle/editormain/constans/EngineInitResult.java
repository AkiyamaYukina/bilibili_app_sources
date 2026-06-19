package com.bilibili.studio.editor.moudle.editormain.constans;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/constans/EngineInitResult.class */
public final class EngineInitResult {
    private static final EnumEntries $ENTRIES;
    private static final EngineInitResult[] $VALUES;
    public static final EngineInitResult INIT_SUCCESS = new EngineInitResult("INIT_SUCCESS", 0);
    public static final EngineInitResult FAIL_X86 = new EngineInitResult("FAIL_X86", 1);
    public static final EngineInitResult FAIL_LOW_VERSION = new EngineInitResult("FAIL_LOW_VERSION", 2);
    public static final EngineInitResult FAIL_NO_RESOURCE = new EngineInitResult("FAIL_NO_RESOURCE", 3);

    private static final /* synthetic */ EngineInitResult[] $values() {
        return new EngineInitResult[]{INIT_SUCCESS, FAIL_X86, FAIL_LOW_VERSION, FAIL_NO_RESOURCE};
    }

    static {
        EngineInitResult[] engineInitResultArr$values = $values();
        $VALUES = engineInitResultArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(engineInitResultArr$values);
    }

    private EngineInitResult(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<EngineInitResult> getEntries() {
        return $ENTRIES;
    }

    public static EngineInitResult valueOf(String str) {
        return (EngineInitResult) Enum.valueOf(EngineInitResult.class, str);
    }

    public static EngineInitResult[] values() {
        return (EngineInitResult[]) $VALUES.clone();
    }
}
