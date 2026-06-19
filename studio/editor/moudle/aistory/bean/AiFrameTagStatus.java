package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AiFrameTagStatus.class */
@Keep
public final class AiFrameTagStatus {
    private static final EnumEntries $ENTRIES;
    private static final AiFrameTagStatus[] $VALUES;
    private final int status;
    public static final AiFrameTagStatus DEFAULT = new AiFrameTagStatus("DEFAULT", 0, 0);
    public static final AiFrameTagStatus UPLOAD_SUCCESS = new AiFrameTagStatus("UPLOAD_SUCCESS", 1, 1);
    public static final AiFrameTagStatus REG_SUCCESS = new AiFrameTagStatus("REG_SUCCESS", 2, 2);
    public static final AiFrameTagStatus FAIL = new AiFrameTagStatus("FAIL", 3, 3);

    private static final /* synthetic */ AiFrameTagStatus[] $values() {
        return new AiFrameTagStatus[]{DEFAULT, UPLOAD_SUCCESS, REG_SUCCESS, FAIL};
    }

    static {
        AiFrameTagStatus[] aiFrameTagStatusArr$values = $values();
        $VALUES = aiFrameTagStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(aiFrameTagStatusArr$values);
    }

    private AiFrameTagStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<AiFrameTagStatus> getEntries() {
        return $ENTRIES;
    }

    public static AiFrameTagStatus valueOf(String str) {
        return (AiFrameTagStatus) Enum.valueOf(AiFrameTagStatus.class, str);
    }

    public static AiFrameTagStatus[] values() {
        return (AiFrameTagStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
