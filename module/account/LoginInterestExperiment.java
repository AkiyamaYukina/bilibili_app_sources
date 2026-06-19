package com.bilibili.module.account;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/account/LoginInterestExperiment.class */
public final class LoginInterestExperiment {
    private static final EnumEntries $ENTRIES;
    private static final LoginInterestExperiment[] $VALUES;
    public static final LoginInterestExperiment DismissInterest = new LoginInterestExperiment("DismissInterest", 0);
    public static final LoginInterestExperiment DismissInterestForOld = new LoginInterestExperiment("DismissInterestForOld", 1);
    public static final LoginInterestExperiment Control = new LoginInterestExperiment("Control", 2);

    private static final /* synthetic */ LoginInterestExperiment[] $values() {
        return new LoginInterestExperiment[]{DismissInterest, DismissInterestForOld, Control};
    }

    static {
        LoginInterestExperiment[] loginInterestExperimentArr$values = $values();
        $VALUES = loginInterestExperimentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(loginInterestExperimentArr$values);
    }

    private LoginInterestExperiment(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<LoginInterestExperiment> getEntries() {
        return $ENTRIES;
    }

    public static LoginInterestExperiment valueOf(String str) {
        return (LoginInterestExperiment) Enum.valueOf(LoginInterestExperiment.class, str);
    }

    public static LoginInterestExperiment[] values() {
        return (LoginInterestExperiment[]) $VALUES.clone();
    }
}
