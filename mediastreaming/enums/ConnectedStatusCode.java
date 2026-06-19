package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ConnectedStatusCode.class */
public final class ConnectedStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final ConnectedStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final ConnectedStatusCode UN_DEFINE = new ConnectedStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final ConnectedStatusCode OK = new ConnectedStatusCode("OK", 1, (byte) 1);
    public static final ConnectedStatusCode URI_INVALID = new ConnectedStatusCode("URI_INVALID", 2, (byte) 2);
    public static final ConnectedStatusCode INVALID_ARGUMENT = new ConnectedStatusCode("INVALID_ARGUMENT", 3, (byte) 3);
    public static final ConnectedStatusCode BE_STOPPED = new ConnectedStatusCode("BE_STOPPED", 4, (byte) 4);
    public static final ConnectedStatusCode SETUP_URL_FAIL = new ConnectedStatusCode("SETUP_URL_FAIL", 5, (byte) 5);
    public static final ConnectedStatusCode CONNECT_FAIL = new ConnectedStatusCode("CONNECT_FAIL", 6, (byte) 6);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ConnectedStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ConnectedStatusCode[] $values() {
        return new ConnectedStatusCode[]{UN_DEFINE, OK, URI_INVALID, INVALID_ARGUMENT, BE_STOPPED, SETUP_URL_FAIL, CONNECT_FAIL};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mediastreaming.enums.ConnectedStatusCode$a, java.lang.Object] */
    static {
        ConnectedStatusCode[] connectedStatusCodeArr$values = $values();
        $VALUES = connectedStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(connectedStatusCodeArr$values);
        Companion = new Object();
    }

    private ConnectedStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<ConnectedStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static ConnectedStatusCode valueOf(String str) {
        return (ConnectedStatusCode) Enum.valueOf(ConnectedStatusCode.class, str);
    }

    public static ConnectedStatusCode[] values() {
        return (ConnectedStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
