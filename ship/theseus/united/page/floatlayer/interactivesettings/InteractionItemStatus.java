package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionItemStatus.class */
public final class InteractionItemStatus {
    private static final EnumEntries $ENTRIES;
    private static final InteractionItemStatus[] $VALUES;
    private final int status;
    public static final InteractionItemStatus On = new InteractionItemStatus("On", 0, 0);
    public static final InteractionItemStatus Off = new InteractionItemStatus("Off", 1, 1);

    private static final /* synthetic */ InteractionItemStatus[] $values() {
        return new InteractionItemStatus[]{On, Off};
    }

    static {
        InteractionItemStatus[] interactionItemStatusArr$values = $values();
        $VALUES = interactionItemStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interactionItemStatusArr$values);
    }

    private InteractionItemStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<InteractionItemStatus> getEntries() {
        return $ENTRIES;
    }

    public static InteractionItemStatus valueOf(String str) {
        return (InteractionItemStatus) Enum.valueOf(InteractionItemStatus.class, str);
    }

    public static InteractionItemStatus[] values() {
        return (InteractionItemStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
