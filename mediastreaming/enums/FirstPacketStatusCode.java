package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/FirstPacketStatusCode.class */
public final class FirstPacketStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final FirstPacketStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final FirstPacketStatusCode UN_DEFINE = new FirstPacketStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final FirstPacketStatusCode OK = new FirstPacketStatusCode("OK", 1, (byte) 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/FirstPacketStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ FirstPacketStatusCode[] $values() {
        return new FirstPacketStatusCode[]{UN_DEFINE, OK};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.mediastreaming.enums.FirstPacketStatusCode$a, java.lang.Object] */
    static {
        FirstPacketStatusCode[] firstPacketStatusCodeArr$values = $values();
        $VALUES = firstPacketStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(firstPacketStatusCodeArr$values);
        Companion = new Object();
    }

    private FirstPacketStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<FirstPacketStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static FirstPacketStatusCode valueOf(String str) {
        return (FirstPacketStatusCode) Enum.valueOf(FirstPacketStatusCode.class, str);
    }

    public static FirstPacketStatusCode[] values() {
        return (FirstPacketStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
