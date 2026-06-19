package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StoppedStatusCode.class */
public final class StoppedStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final StoppedStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final StoppedStatusCode UN_DEFINE = new StoppedStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final StoppedStatusCode OK = new StoppedStatusCode("OK", 1, (byte) 1);
    public static final StoppedStatusCode URI_INVALID = new StoppedStatusCode("URI_INVALID", 2, (byte) 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StoppedStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ StoppedStatusCode[] $values() {
        return new StoppedStatusCode[]{UN_DEFINE, OK, URI_INVALID};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.mediastreaming.enums.StoppedStatusCode$a, java.lang.Object] */
    static {
        StoppedStatusCode[] stoppedStatusCodeArr$values = $values();
        $VALUES = stoppedStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(stoppedStatusCodeArr$values);
        Companion = new Object();
    }

    private StoppedStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<StoppedStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static StoppedStatusCode valueOf(String str) {
        return (StoppedStatusCode) Enum.valueOf(StoppedStatusCode.class, str);
    }

    public static StoppedStatusCode[] values() {
        return (StoppedStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
