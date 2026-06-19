package com.bilibili.pegasus.components.interest;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/InterestChainProcess.class */
public final class InterestChainProcess {
    private static final EnumEntries $ENTRIES;
    private static final InterestChainProcess[] $VALUES;
    private final int pathCode;
    public static final InterestChainProcess WAIT = new InterestChainProcess("WAIT", 0, 0);
    public static final InterestChainProcess ENTER = new InterestChainProcess("ENTER", 1, 1);
    public static final InterestChainProcess REQUEST = new InterestChainProcess("REQUEST", 2, 2);
    public static final InterestChainProcess ERROR = new InterestChainProcess("ERROR", 3, 3);
    public static final InterestChainProcess VALID_RESPONSE = new InterestChainProcess("VALID_RESPONSE", 4, 4);
    public static final InterestChainProcess PAGE_VISIBLE = new InterestChainProcess("PAGE_VISIBLE", 5, 5);
    public static final InterestChainProcess PRE_DIALOG = new InterestChainProcess("PRE_DIALOG", 6, 6);
    public static final InterestChainProcess ADD_TO_DIALOG_MANAGER = new InterestChainProcess("ADD_TO_DIALOG_MANAGER", 7, 7);
    public static final InterestChainProcess SHOW = new InterestChainProcess("SHOW", 8, 8);
    public static final InterestChainProcess CLOSE = new InterestChainProcess("CLOSE", 9, 9);
    public static final InterestChainProcess FINISH = new InterestChainProcess("FINISH", 10, 10);
    public static final InterestChainProcess PRE_TIANMA_REQUEST = new InterestChainProcess("PRE_TIANMA_REQUEST", 11, 11);

    private static final /* synthetic */ InterestChainProcess[] $values() {
        return new InterestChainProcess[]{WAIT, ENTER, REQUEST, ERROR, VALID_RESPONSE, PAGE_VISIBLE, PRE_DIALOG, ADD_TO_DIALOG_MANAGER, SHOW, CLOSE, FINISH, PRE_TIANMA_REQUEST};
    }

    static {
        InterestChainProcess[] interestChainProcessArr$values = $values();
        $VALUES = interestChainProcessArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interestChainProcessArr$values);
    }

    private InterestChainProcess(String str, int i7, int i8) {
        this.pathCode = i8;
    }

    @NotNull
    public static EnumEntries<InterestChainProcess> getEntries() {
        return $ENTRIES;
    }

    public static InterestChainProcess valueOf(String str) {
        return (InterestChainProcess) Enum.valueOf(InterestChainProcess.class, str);
    }

    public static InterestChainProcess[] values() {
        return (InterestChainProcess[]) $VALUES.clone();
    }

    public final int getPathCode() {
        return this.pathCode;
    }
}
