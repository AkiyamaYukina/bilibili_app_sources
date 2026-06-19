package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/AsrAiTaskStatus.class */
public final class AsrAiTaskStatus {
    private static final EnumEntries $ENTRIES;
    private static final AsrAiTaskStatus[] $VALUES;

    @NotNull
    private final String status;
    public static final AsrAiTaskStatus SUCCESS = new AsrAiTaskStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 0, "success");
    public static final AsrAiTaskStatus FAIL = new AsrAiTaskStatus("FAIL", 1, "fail");
    public static final AsrAiTaskStatus CANCEL = new AsrAiTaskStatus("CANCEL", 2, "cancel");

    private static final /* synthetic */ AsrAiTaskStatus[] $values() {
        return new AsrAiTaskStatus[]{SUCCESS, FAIL, CANCEL};
    }

    static {
        AsrAiTaskStatus[] asrAiTaskStatusArr$values = $values();
        $VALUES = asrAiTaskStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(asrAiTaskStatusArr$values);
    }

    private AsrAiTaskStatus(String str, int i7, String str2) {
        this.status = str2;
    }

    @NotNull
    public static EnumEntries<AsrAiTaskStatus> getEntries() {
        return $ENTRIES;
    }

    public static AsrAiTaskStatus valueOf(String str) {
        return (AsrAiTaskStatus) Enum.valueOf(AsrAiTaskStatus.class, str);
    }

    public static AsrAiTaskStatus[] values() {
        return (AsrAiTaskStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
