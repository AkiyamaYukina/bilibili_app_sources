package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ButtonState.class */
public final class ButtonState {
    private static final EnumEntries $ENTRIES;
    private static final ButtonState[] $VALUES;
    public static final ButtonState Unknown = new ButtonState("Unknown", 0);
    public static final ButtonState SureToBuy = new ButtonState("SureToBuy", 1);
    public static final ButtonState GotoCharging = new ButtonState("GotoCharging", 2);
    public static final ButtonState ChargingAndSureToBuy = new ButtonState("ChargingAndSureToBuy", 3);

    private static final /* synthetic */ ButtonState[] $values() {
        return new ButtonState[]{Unknown, SureToBuy, GotoCharging, ChargingAndSureToBuy};
    }

    static {
        ButtonState[] buttonStateArr$values = $values();
        $VALUES = buttonStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buttonStateArr$values);
    }

    private ButtonState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<ButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) $VALUES.clone();
    }
}
