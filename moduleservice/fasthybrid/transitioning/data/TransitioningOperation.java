package com.bilibili.moduleservice.fasthybrid.transitioning.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/data/TransitioningOperation.class */
public final class TransitioningOperation {
    private static final EnumEntries $ENTRIES;
    private static final TransitioningOperation[] $VALUES;
    public static final TransitioningOperation PUSH = new TransitioningOperation("PUSH", 0);
    public static final TransitioningOperation POP = new TransitioningOperation("POP", 1);

    private static final /* synthetic */ TransitioningOperation[] $values() {
        return new TransitioningOperation[]{PUSH, POP};
    }

    static {
        TransitioningOperation[] transitioningOperationArr$values = $values();
        $VALUES = transitioningOperationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transitioningOperationArr$values);
    }

    private TransitioningOperation(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<TransitioningOperation> getEntries() {
        return $ENTRIES;
    }

    public static TransitioningOperation valueOf(String str) {
        return (TransitioningOperation) Enum.valueOf(TransitioningOperation.class, str);
    }

    public static TransitioningOperation[] values() {
        return (TransitioningOperation[]) $VALUES.clone();
    }
}
