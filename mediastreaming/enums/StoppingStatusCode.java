package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StoppingStatusCode.class */
public final class StoppingStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final StoppingStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final StoppingStatusCode UN_DEFINE = new StoppingStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final StoppingStatusCode OK = new StoppingStatusCode("OK", 1, (byte) 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StoppingStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ StoppingStatusCode[] $values() {
        return new StoppingStatusCode[]{UN_DEFINE, OK};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.mediastreaming.enums.StoppingStatusCode$a, java.lang.Object] */
    static {
        StoppingStatusCode[] stoppingStatusCodeArr$values = $values();
        $VALUES = stoppingStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(stoppingStatusCodeArr$values);
        Companion = new Object();
    }

    private StoppingStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<StoppingStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static StoppingStatusCode valueOf(String str) {
        return (StoppingStatusCode) Enum.valueOf(StoppingStatusCode.class, str);
    }

    public static StoppingStatusCode[] values() {
        return (StoppingStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
