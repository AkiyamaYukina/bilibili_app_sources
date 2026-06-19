package com.bilibili.pegasus.data.request;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/request/OpenEvent.class */
public final class OpenEvent {
    private static final EnumEntries $ENTRIES;
    private static final OpenEvent[] $VALUES;

    @NotNull
    private final String value;
    public static final OpenEvent NORMAL = new OpenEvent("NORMAL", 0, "");
    public static final OpenEvent HOT = new OpenEvent("HOT", 1, "hot");
    public static final OpenEvent COLD = new OpenEvent("COLD", 2, "cold");

    private static final /* synthetic */ OpenEvent[] $values() {
        return new OpenEvent[]{NORMAL, HOT, COLD};
    }

    static {
        OpenEvent[] openEventArr$values = $values();
        $VALUES = openEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(openEventArr$values);
    }

    private OpenEvent(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<OpenEvent> getEntries() {
        return $ENTRIES;
    }

    public static OpenEvent valueOf(String str) {
        return (OpenEvent) Enum.valueOf(OpenEvent.class, str);
    }

    public static OpenEvent[] values() {
        return (OpenEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
