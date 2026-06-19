package com.bilibili.sistersplayer.hls;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/HLSMasterCode.class */
public final class HLSMasterCode {
    private static final EnumEntries $ENTRIES;
    private static final HLSMasterCode[] $VALUES;
    private final int ec;
    public static final HLSMasterCode OK = new HLSMasterCode("OK", 0, 0);
    public static final HLSMasterCode ERROR_SWITCH_CRASH = new HLSMasterCode("ERROR_SWITCH_CRASH", 1, 40000);
    public static final HLSMasterCode ERROR_SWITCH_TIME_NOT_MATCH = new HLSMasterCode("ERROR_SWITCH_TIME_NOT_MATCH", 2, 40001);
    public static final HLSMasterCode SWITCH_CANCEL = new HLSMasterCode("SWITCH_CANCEL", 3, 40002);
    public static final HLSMasterCode KEEP = new HLSMasterCode("KEEP", 4, 40003);
    public static final HLSMasterCode PLAYER_BUFFER_LITTLE = new HLSMasterCode("PLAYER_BUFFER_LITTLE", 5, 40004);

    private static final /* synthetic */ HLSMasterCode[] $values() {
        return new HLSMasterCode[]{OK, ERROR_SWITCH_CRASH, ERROR_SWITCH_TIME_NOT_MATCH, SWITCH_CANCEL, KEEP, PLAYER_BUFFER_LITTLE};
    }

    static {
        HLSMasterCode[] hLSMasterCodeArr$values = $values();
        $VALUES = hLSMasterCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hLSMasterCodeArr$values);
    }

    private HLSMasterCode(String str, int i7, int i8) {
        this.ec = i8;
    }

    @NotNull
    public static EnumEntries<HLSMasterCode> getEntries() {
        return $ENTRIES;
    }

    public static HLSMasterCode valueOf(String str) {
        return (HLSMasterCode) Enum.valueOf(HLSMasterCode.class, str);
    }

    public static HLSMasterCode[] values() {
        return (HLSMasterCode[]) $VALUES.clone();
    }

    public final int getEc() {
        return this.ec;
    }
}
