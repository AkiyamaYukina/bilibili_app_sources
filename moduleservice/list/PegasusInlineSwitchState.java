package com.bilibili.moduleservice.list;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/list/PegasusInlineSwitchState.class */
@Keep
public final class PegasusInlineSwitchState {
    private static final EnumEntries $ENTRIES;
    private static final PegasusInlineSwitchState[] $VALUES;
    public static final PegasusInlineSwitchState ALL_NETWORK = new PegasusInlineSwitchState("ALL_NETWORK", 0);
    public static final PegasusInlineSwitchState WIFI_ONLY = new PegasusInlineSwitchState("WIFI_ONLY", 1);
    public static final PegasusInlineSwitchState OFF = new PegasusInlineSwitchState("OFF", 2);

    private static final /* synthetic */ PegasusInlineSwitchState[] $values() {
        return new PegasusInlineSwitchState[]{ALL_NETWORK, WIFI_ONLY, OFF};
    }

    static {
        PegasusInlineSwitchState[] pegasusInlineSwitchStateArr$values = $values();
        $VALUES = pegasusInlineSwitchStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pegasusInlineSwitchStateArr$values);
    }

    private PegasusInlineSwitchState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PegasusInlineSwitchState> getEntries() {
        return $ENTRIES;
    }

    public static PegasusInlineSwitchState valueOf(String str) {
        return (PegasusInlineSwitchState) Enum.valueOf(PegasusInlineSwitchState.class, str);
    }

    public static PegasusInlineSwitchState[] values() {
        return (PegasusInlineSwitchState[]) $VALUES.clone();
    }
}
