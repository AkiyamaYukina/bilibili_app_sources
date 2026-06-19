package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ConnectingStatusCode.class */
public final class ConnectingStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final ConnectingStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final ConnectingStatusCode UN_DEFINE = new ConnectingStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final ConnectingStatusCode OK = new ConnectingStatusCode("OK", 1, (byte) 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/ConnectingStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ ConnectingStatusCode[] $values() {
        return new ConnectingStatusCode[]{UN_DEFINE, OK};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.mediastreaming.enums.ConnectingStatusCode$a, java.lang.Object] */
    static {
        ConnectingStatusCode[] connectingStatusCodeArr$values = $values();
        $VALUES = connectingStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(connectingStatusCodeArr$values);
        Companion = new Object();
    }

    private ConnectingStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<ConnectingStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static ConnectingStatusCode valueOf(String str) {
        return (ConnectingStatusCode) Enum.valueOf(ConnectingStatusCode.class, str);
    }

    public static ConnectingStatusCode[] values() {
        return (ConnectingStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
