package com.bilibili.ogvvega.tunnel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/CauseType.class */
public final class CauseType {
    private static final EnumEntries $ENTRIES;
    private static final CauseType[] $VALUES;
    public static final CauseType NORMAL = new CauseType("NORMAL", 0);
    public static final CauseType NETWORK_ERROR = new CauseType("NETWORK_ERROR", 1);
    public static final CauseType NOT_LOGIN = new CauseType("NOT_LOGIN", 2);
    public static final CauseType HEARTBEAT_LOST = new CauseType("HEARTBEAT_LOST", 3);
    public static final CauseType AUTH_FAILED = new CauseType("AUTH_FAILED", 4);
    public static final CauseType SERVER_DISCONNECT = new CauseType("SERVER_DISCONNECT", 5);

    private static final /* synthetic */ CauseType[] $values() {
        return new CauseType[]{NORMAL, NETWORK_ERROR, NOT_LOGIN, HEARTBEAT_LOST, AUTH_FAILED, SERVER_DISCONNECT};
    }

    static {
        CauseType[] causeTypeArr$values = $values();
        $VALUES = causeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(causeTypeArr$values);
    }

    private CauseType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CauseType> getEntries() {
        return $ENTRIES;
    }

    public static CauseType valueOf(String str) {
        return (CauseType) Enum.valueOf(CauseType.class, str);
    }

    public static CauseType[] values() {
        return (CauseType[]) $VALUES.clone();
    }
}
