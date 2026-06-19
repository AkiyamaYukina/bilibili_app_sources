package com.bilibili.mediastreaming.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StartStatusCode.class */
public final class StartStatusCode implements CommonStatusCode {
    private static final EnumEntries $ENTRIES;
    private static final StartStatusCode[] $VALUES;

    @NotNull
    public static final a Companion;
    private final byte value;
    public static final StartStatusCode UN_DEFINE = new StartStatusCode("UN_DEFINE", 0, (byte) 0);
    public static final StartStatusCode OK = new StartStatusCode("OK", 1, (byte) 1);
    public static final StartStatusCode NO_FACTORY = new StartStatusCode("NO_FACTORY", 2, (byte) 2);
    public static final StartStatusCode UN_INIT = new StartStatusCode("UN_INIT", 3, (byte) 3);
    public static final StartStatusCode URI_INVALID = new StartStatusCode("URI_INVALID", 4, (byte) 4);
    public static final StartStatusCode URI_UN_SUPPORT = new StartStatusCode("URI_UN_SUPPORT", 5, (byte) 5);
    public static final StartStatusCode URI_REPEAT = new StartStatusCode("URI_REPEAT", 6, (byte) 6);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/enums/StartStatusCode$a.class */
    public static final class a {
    }

    private static final /* synthetic */ StartStatusCode[] $values() {
        return new StartStatusCode[]{UN_DEFINE, OK, NO_FACTORY, UN_INIT, URI_INVALID, URI_UN_SUPPORT, URI_REPEAT};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mediastreaming.enums.StartStatusCode$a, java.lang.Object] */
    static {
        StartStatusCode[] startStatusCodeArr$values = $values();
        $VALUES = startStatusCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(startStatusCodeArr$values);
        Companion = new Object();
    }

    private StartStatusCode(String str, int i7, byte b7) {
        this.value = b7;
    }

    @NotNull
    public static EnumEntries<StartStatusCode> getEntries() {
        return $ENTRIES;
    }

    public static StartStatusCode valueOf(String str) {
        return (StartStatusCode) Enum.valueOf(StartStatusCode.class, str);
    }

    public static StartStatusCode[] values() {
        return (StartStatusCode[]) $VALUES.clone();
    }

    @Override // com.bilibili.mediastreaming.enums.CommonStatusCode
    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public byte mo7062getValuew2LRezQ() {
        return this.value;
    }
}
