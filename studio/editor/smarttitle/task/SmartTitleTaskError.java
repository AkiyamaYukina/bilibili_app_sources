package com.bilibili.studio.editor.smarttitle.task;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTaskError.class */
public final class SmartTitleTaskError {
    private static final EnumEntries $ENTRIES;
    private static final SmartTitleTaskError[] $VALUES;
    private final int code;

    @NotNull
    private final String msg;
    public static final SmartTitleTaskError ERROR_PRE_CHECK = new SmartTitleTaskError("ERROR_PRE_CHECK", 0, 1, "参数预检查错误");
    public static final SmartTitleTaskError ERROR_STYLE_NET = new SmartTitleTaskError("ERROR_STYLE_NET", 1, 2, "风格请求-网络错误");
    public static final SmartTitleTaskError ERROR_STYLE_DATA = new SmartTitleTaskError("ERROR_STYLE_DATA", 2, 3, "风格请求-prompt为空");
    public static final SmartTitleTaskError ERROR_AI_TASK = new SmartTitleTaskError("ERROR_AI_TASK", 3, 4, "AI任务错误");

    private static final /* synthetic */ SmartTitleTaskError[] $values() {
        return new SmartTitleTaskError[]{ERROR_PRE_CHECK, ERROR_STYLE_NET, ERROR_STYLE_DATA, ERROR_AI_TASK};
    }

    static {
        SmartTitleTaskError[] smartTitleTaskErrorArr$values = $values();
        $VALUES = smartTitleTaskErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(smartTitleTaskErrorArr$values);
    }

    private SmartTitleTaskError(String str, int i7, int i8, String str2) {
        this.code = i8;
        this.msg = str2;
    }

    @NotNull
    public static EnumEntries<SmartTitleTaskError> getEntries() {
        return $ENTRIES;
    }

    public static SmartTitleTaskError valueOf(String str) {
        return (SmartTitleTaskError) Enum.valueOf(SmartTitleTaskError.class, str);
    }

    public static SmartTitleTaskError[] values() {
        return (SmartTitleTaskError[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
