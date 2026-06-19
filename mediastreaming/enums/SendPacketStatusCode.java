package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/SendPacketStatusCode.class */
public final class SendPacketStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final SendPacketStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final SendPacketStatusCode UN_DEFINE = new SendPacketStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final SendPacketStatusCode OK = new SendPacketStatusCode("OK", 1, (byte) 1);
    public static final SendPacketStatusCode CONNECT_LOSS_ERROR = new SendPacketStatusCode("CONNECT_LOSS_ERROR", 2, (byte) 2);
    public static final SendPacketStatusCode GET_PACKET_TIMEOUT = new SendPacketStatusCode("GET_PACKET_TIMEOUT", 3, (byte) 3);
    public static final SendPacketStatusCode AVCODEC_TYPE_ISNULL = new SendPacketStatusCode("AVCODEC_TYPE_ISNULL", 4, (byte) 4);
    public static final SendPacketStatusCode VIDEO_CODEC_NOT_MATCH = new SendPacketStatusCode("VIDEO_CODEC_NOT_MATCH", 5, (byte) 5);
    public static final SendPacketStatusCode AUDIO_CODEC_NOT_MATCH = new SendPacketStatusCode("AUDIO_CODEC_NOT_MATCH", 6, (byte) 6);
    public static final SendPacketStatusCode BE_STOPPED = new SendPacketStatusCode("BE_STOPPED", 7, (byte) 7);
    public static final SendPacketStatusCode OBJECT_OR_ENV_IS_NULL = new SendPacketStatusCode("OBJECT_OR_ENV_IS_NULL", 8, (byte) 8);
    public static final SendPacketStatusCode CLASS_IS_NULL = new SendPacketStatusCode("CLASS_IS_NULL", 9, (byte) 9);
    public static final SendPacketStatusCode METHOD_SIGN_ERROR = new SendPacketStatusCode("METHOD_SIGN_ERROR", 10, (byte) 10);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/SendPacketStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ SendPacketStatusCode[] $values() {
        return new SendPacketStatusCode[]{UN_DEFINE, OK, CONNECT_LOSS_ERROR, GET_PACKET_TIMEOUT, AVCODEC_TYPE_ISNULL, VIDEO_CODEC_NOT_MATCH, AUDIO_CODEC_NOT_MATCH, BE_STOPPED, OBJECT_OR_ENV_IS_NULL, CLASS_IS_NULL, METHOD_SIGN_ERROR};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.mediastreaming.enums.SendPacketStatusCode$a, java.lang.Object] */
    static {
        SendPacketStatusCode[] sendPacketStatusCodeArr$values = $values();
        $VALUES = sendPacketStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sendPacketStatusCodeArr$values);
        Companion = new Object();
    }

    private SendPacketStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<SendPacketStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static SendPacketStatusCode valueOf(String str) {
        return (SendPacketStatusCode) Enum.valueOf(SendPacketStatusCode.class, str);
    }

    public static SendPacketStatusCode[] values() {
        return (SendPacketStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
