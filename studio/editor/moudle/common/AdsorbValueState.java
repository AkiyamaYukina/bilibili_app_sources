package com.bilibili.studio.editor.moudle.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/common/AdsorbValueState.class */
public final class AdsorbValueState {
    private static final EnumEntries $ENTRIES;
    private static final AdsorbValueState[] $VALUES;
    public static final AdsorbValueState RESET_VALUE = new AdsorbValueState("RESET_VALUE", 0);
    public static final AdsorbValueState INCREASE_VALUE = new AdsorbValueState("INCREASE_VALUE", 1);
    public static final AdsorbValueState NONE = new AdsorbValueState("NONE", 2);

    private static final /* synthetic */ AdsorbValueState[] $values() {
        return new AdsorbValueState[]{RESET_VALUE, INCREASE_VALUE, NONE};
    }

    static {
        AdsorbValueState[] adsorbValueStateArr$values = $values();
        $VALUES = adsorbValueStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(adsorbValueStateArr$values);
    }

    private AdsorbValueState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AdsorbValueState> getEntries() {
        return $ENTRIES;
    }

    public static AdsorbValueState valueOf(String str) {
        return (AdsorbValueState) Enum.valueOf(AdsorbValueState.class, str);
    }

    public static AdsorbValueState[] values() {
        return (AdsorbValueState[]) $VALUES.clone();
    }
}
