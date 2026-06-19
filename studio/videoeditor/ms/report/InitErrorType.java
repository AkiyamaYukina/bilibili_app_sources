package com.bilibili.studio.videoeditor.ms.report;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/report/InitErrorType.class */
public final class InitErrorType {
    private static final EnumEntries $ENTRIES;
    private static final InitErrorType[] $VALUES;

    @NotNull
    private final String value;
    public static final InitErrorType LOAD_FAILED = new InitErrorType("LOAD_FAILED", 0, "load_failed");
    public static final InitErrorType AUTH_FAILED = new InitErrorType("AUTH_FAILED", 1, "auth_failed");
    public static final InitErrorType FILE_ERROR = new InitErrorType("FILE_ERROR", 2, "file_error");
    public static final InitErrorType OTHER_ERROR = new InitErrorType("OTHER_ERROR", 3, "other_error");

    private static final /* synthetic */ InitErrorType[] $values() {
        return new InitErrorType[]{LOAD_FAILED, AUTH_FAILED, FILE_ERROR, OTHER_ERROR};
    }

    static {
        InitErrorType[] initErrorTypeArr$values = $values();
        $VALUES = initErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(initErrorTypeArr$values);
    }

    private InitErrorType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<InitErrorType> getEntries() {
        return $ENTRIES;
    }

    public static InitErrorType valueOf(String str) {
        return (InitErrorType) Enum.valueOf(InitErrorType.class, str);
    }

    public static InitErrorType[] values() {
        return (InitErrorType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
