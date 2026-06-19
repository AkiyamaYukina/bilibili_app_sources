package com.bilibili.pegasus.interest.reporter;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/interest/reporter/InterestEvent.class */
@Keep
public final class InterestEvent {
    private static final EnumEntries $ENTRIES;
    private static final InterestEvent[] $VALUES;
    private final int event;
    public static final InterestEvent WAIT = new InterestEvent("WAIT", 0, 0);
    public static final InterestEvent ENTER = new InterestEvent("ENTER", 1, 1);
    public static final InterestEvent REQUEST = new InterestEvent("REQUEST", 2, 2);
    public static final InterestEvent ERROR = new InterestEvent("ERROR", 3, 3);
    public static final InterestEvent VALID_RESPONSE = new InterestEvent("VALID_RESPONSE", 4, 4);
    public static final InterestEvent PAGE_VISIBLE = new InterestEvent("PAGE_VISIBLE", 5, 5);
    public static final InterestEvent PRE_DIALOG = new InterestEvent("PRE_DIALOG", 6, 6);
    public static final InterestEvent ADD_TO_DIALOG_MANAGER = new InterestEvent("ADD_TO_DIALOG_MANAGER", 7, 7);
    public static final InterestEvent SHOW = new InterestEvent("SHOW", 8, 8);
    public static final InterestEvent CLOSE = new InterestEvent("CLOSE", 9, 9);
    public static final InterestEvent FINISH = new InterestEvent("FINISH", 10, 10);
    public static final InterestEvent BEFORE_PEGASUS_REQUEST = new InterestEvent("BEFORE_PEGASUS_REQUEST", 11, 11);

    private static final /* synthetic */ InterestEvent[] $values() {
        return new InterestEvent[]{WAIT, ENTER, REQUEST, ERROR, VALID_RESPONSE, PAGE_VISIBLE, PRE_DIALOG, ADD_TO_DIALOG_MANAGER, SHOW, CLOSE, FINISH, BEFORE_PEGASUS_REQUEST};
    }

    static {
        InterestEvent[] interestEventArr$values = $values();
        $VALUES = interestEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestEventArr$values);
    }

    private InterestEvent(String str, int i7, int i8) {
        this.event = i8;
    }

    @NotNull
    public static EnumEntries<InterestEvent> getEntries() {
        return $ENTRIES;
    }

    public static InterestEvent valueOf(String str) {
        return (InterestEvent) Enum.valueOf(InterestEvent.class, str);
    }

    public static InterestEvent[] values() {
        return (InterestEvent[]) $VALUES.clone();
    }

    public final int getEvent() {
        return this.event;
    }
}
