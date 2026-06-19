package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ErrorCode.class */
public final class ErrorCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final ErrorCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final ErrorCode UN_DEFINE = new ErrorCode("UN_DEFINE", 0, (byte) 0);
    public static final ErrorCode OK = new ErrorCode("OK", 1, (byte) 1);
    public static final ErrorCode REPEAT = new ErrorCode("REPEAT", 2, (byte) 2);
    public static final ErrorCode URI_INVALID = new ErrorCode("URI_INVALID", 3, (byte) 3);
    public static final ErrorCode INVALID_ARGUMENT = new ErrorCode("INVALID_ARGUMENT", 4, (byte) 4);
    public static final ErrorCode VIDEO_CODEC_NOT_SUPPORT = new ErrorCode("VIDEO_CODEC_NOT_SUPPORT", 5, (byte) 5);
    public static final ErrorCode AUDIO_CODEC_NOT_SUPPORT = new ErrorCode("AUDIO_CODEC_NOT_SUPPORT", 6, (byte) 6);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ErrorCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{UN_DEFINE, OK, REPEAT, URI_INVALID, INVALID_ARGUMENT, VIDEO_CODEC_NOT_SUPPORT, AUDIO_CODEC_NOT_SUPPORT};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mediastreaming.enums.ErrorCode$a, java.lang.Object] */
    static {
        ErrorCode[] errorCodeArr$values = $values();
        $VALUES = errorCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(errorCodeArr$values);
        Companion = new Object();
    }

    private ErrorCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
