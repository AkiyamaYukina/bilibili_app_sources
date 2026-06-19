package com.bilibili.ship.theseus.ugc.play.schedule;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/CancelFrom.class */
public final class CancelFrom {
    private static final EnumEntries $ENTRIES;
    private static final CancelFrom[] $VALUES;
    public static final CancelFrom CANCEL_BUTTON = new CancelFrom("CANCEL_BUTTON", 0);
    public static final CancelFrom SHARE_BUTTON = new CancelFrom("SHARE_BUTTON", 1);
    public static final CancelFrom APPBAR_OFFSET = new CancelFrom("APPBAR_OFFSET", 2);
    public static final CancelFrom PLAYER_COLLAPSED = new CancelFrom("PLAYER_COLLAPSED", 3);
    public static final CancelFrom BACKGROUND = new CancelFrom("BACKGROUND", 4);
    public static final CancelFrom INTERACTION = new CancelFrom("INTERACTION", 5);

    private static final /* synthetic */ CancelFrom[] $values() {
        return new CancelFrom[]{CANCEL_BUTTON, SHARE_BUTTON, APPBAR_OFFSET, PLAYER_COLLAPSED, BACKGROUND, INTERACTION};
    }

    static {
        CancelFrom[] cancelFromArr$values = $values();
        $VALUES = cancelFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cancelFromArr$values);
    }

    private CancelFrom(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CancelFrom> getEntries() {
        return $ENTRIES;
    }

    public static CancelFrom valueOf(String str) {
        return (CancelFrom) Enum.valueOf(CancelFrom.class, str);
    }

    public static CancelFrom[] values() {
        return (CancelFrom[]) $VALUES.clone();
    }
}
