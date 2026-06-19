package com.bilibili.lib.ui.permission;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/permission/PermissionBizState.class */
public final class PermissionBizState {
    private static final EnumEntries $ENTRIES;
    private static final PermissionBizState[] $VALUES;
    private final int code;
    public static final PermissionBizState ENABLE = new PermissionBizState("ENABLE", 0, 1);
    public static final PermissionBizState DISABLE = new PermissionBizState("DISABLE", 1, 2);
    public static final PermissionBizState FOLLOW = new PermissionBizState("FOLLOW", 2, 0);

    private static final /* synthetic */ PermissionBizState[] $values() {
        return new PermissionBizState[]{ENABLE, DISABLE, FOLLOW};
    }

    static {
        PermissionBizState[] permissionBizStateArr$values = $values();
        $VALUES = permissionBizStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(permissionBizStateArr$values);
    }

    private PermissionBizState(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<PermissionBizState> getEntries() {
        return $ENTRIES;
    }

    public static PermissionBizState valueOf(String str) {
        return (PermissionBizState) Enum.valueOf(PermissionBizState.class, str);
    }

    public static PermissionBizState[] values() {
        return (PermissionBizState[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
