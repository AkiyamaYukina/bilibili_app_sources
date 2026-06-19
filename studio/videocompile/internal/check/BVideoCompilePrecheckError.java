package com.bilibili.studio.videocompile.internal.check;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/check/BVideoCompilePrecheckError.class */
@Keep
public final class BVideoCompilePrecheckError {
    private static final EnumEntries $ENTRIES;
    private static final BVideoCompilePrecheckError[] $VALUES;
    private int errorCode;

    @NotNull
    private String errorMsg;
    public static final BVideoCompilePrecheckError Success = new BVideoCompilePrecheckError("Success", 0, 0, "Success");
    public static final BVideoCompilePrecheckError TimelineDurationError = new BVideoCompilePrecheckError("TimelineDurationError", 1, 1, "TimelineDurationError");
    public static final BVideoCompilePrecheckError IsCompiling = new BVideoCompilePrecheckError("IsCompiling", 2, 2, "IsCompiling");
    public static final BVideoCompilePrecheckError VideoError = new BVideoCompilePrecheckError("VideoError", 3, 3, "VideoError");
    public static final BVideoCompilePrecheckError AudioError = new BVideoCompilePrecheckError("AudioError", 4, 4, "AudioError");
    public static final BVideoCompilePrecheckError CompilerError = new BVideoCompilePrecheckError("CompilerError", 5, 5, "CompilerError");

    private static final /* synthetic */ BVideoCompilePrecheckError[] $values() {
        return new BVideoCompilePrecheckError[]{Success, TimelineDurationError, IsCompiling, VideoError, AudioError, CompilerError};
    }

    static {
        BVideoCompilePrecheckError[] bVideoCompilePrecheckErrorArr$values = $values();
        $VALUES = bVideoCompilePrecheckErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bVideoCompilePrecheckErrorArr$values);
    }

    private BVideoCompilePrecheckError(String str, int i7, int i8, String str2) {
        this.errorCode = i8;
        this.errorMsg = str2;
    }

    @NotNull
    public static EnumEntries<BVideoCompilePrecheckError> getEntries() {
        return $ENTRIES;
    }

    public static BVideoCompilePrecheckError valueOf(String str) {
        return (BVideoCompilePrecheckError) Enum.valueOf(BVideoCompilePrecheckError.class, str);
    }

    public static BVideoCompilePrecheckError[] values() {
        return (BVideoCompilePrecheckError[]) $VALUES.clone();
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorCode(int i7) {
        this.errorCode = i7;
    }

    public void setErrorMsg(@NotNull String str) {
        this.errorMsg = str;
    }
}
