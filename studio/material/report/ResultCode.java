package com.bilibili.studio.material.report;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/report/ResultCode.class */
public final class ResultCode {
    private static final EnumEntries $ENTRIES;
    private static final ResultCode[] $VALUES;

    @NotNull
    private final String resultCode;
    public static final ResultCode START = new ResultCode("START", 0, "start");
    public static final ResultCode SUCCESS = new ResultCode(BCGToken.SCHEDULE_STATUS_SUCCESS, 1, "success");
    public static final ResultCode FAIL = new ResultCode("FAIL", 2, "fail");
    public static final ResultCode CANCEL = new ResultCode("CANCEL", 3, "cancel");

    private static final /* synthetic */ ResultCode[] $values() {
        return new ResultCode[]{START, SUCCESS, FAIL, CANCEL};
    }

    static {
        ResultCode[] resultCodeArr$values = $values();
        $VALUES = resultCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(resultCodeArr$values);
    }

    private ResultCode(String str, int i7, String str2) {
        this.resultCode = str2;
    }

    @NotNull
    public static EnumEntries<ResultCode> getEntries() {
        return $ENTRIES;
    }

    public static ResultCode valueOf(String str) {
        return (ResultCode) Enum.valueOf(ResultCode.class, str);
    }

    public static ResultCode[] values() {
        return (ResultCode[]) $VALUES.clone();
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }
}
