package com.bilibili.lib.push;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/RedDotBiz.class */
public final class RedDotBiz {
    private static final EnumEntries $ENTRIES;
    private static final RedDotBiz[] $VALUES;
    public static final RedDotBiz FOLLOWING = new RedDotBiz("FOLLOWING", 0, 1);
    public static final RedDotBiz SDK = new RedDotBiz("SDK", 1, 0);
    private final int code;

    private static final /* synthetic */ RedDotBiz[] $values() {
        return new RedDotBiz[]{FOLLOWING, SDK};
    }

    static {
        RedDotBiz[] redDotBizArr$values = $values();
        $VALUES = redDotBizArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(redDotBizArr$values);
    }

    private RedDotBiz(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<RedDotBiz> getEntries() {
        return $ENTRIES;
    }

    public static RedDotBiz valueOf(String str) {
        return (RedDotBiz) Enum.valueOf(RedDotBiz.class, str);
    }

    public static RedDotBiz[] values() {
        return (RedDotBiz[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
