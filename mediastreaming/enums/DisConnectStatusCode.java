package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/DisConnectStatusCode.class */
public final class DisConnectStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final DisConnectStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final DisConnectStatusCode UN_DEFINE = new DisConnectStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final DisConnectStatusCode OK = new DisConnectStatusCode("OK", 1, (byte) 1);
    public static final DisConnectStatusCode CONNECT_LOSS_ERROR = new DisConnectStatusCode("CONNECT_LOSS_ERROR", 2, (byte) 2);
    public static final DisConnectStatusCode GET_PACKET_TIMEOUT = new DisConnectStatusCode("GET_PACKET_TIMEOUT", 3, (byte) 3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/DisConnectStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ DisConnectStatusCode[] $values() {
        return new DisConnectStatusCode[]{UN_DEFINE, OK, CONNECT_LOSS_ERROR, GET_PACKET_TIMEOUT};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.mediastreaming.enums.DisConnectStatusCode$a, java.lang.Object] */
    static {
        DisConnectStatusCode[] disConnectStatusCodeArr$values = $values();
        $VALUES = disConnectStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(disConnectStatusCodeArr$values);
        Companion = new Object();
    }

    private DisConnectStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<DisConnectStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static DisConnectStatusCode valueOf(String str) {
        return (DisConnectStatusCode) Enum.valueOf(DisConnectStatusCode.class, str);
    }

    public static DisConnectStatusCode[] values() {
        return (DisConnectStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
