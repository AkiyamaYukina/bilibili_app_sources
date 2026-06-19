package com.bilibili.ship.theseus.ugc.play.schedule;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/InterceptorEnum.class */
public final class InterceptorEnum {
    private static final EnumEntries $ENTRIES;
    private static final InterceptorEnum[] $VALUES;
    public static final InterceptorEnum INTRO_SCROLL = new InterceptorEnum("INTRO_SCROLL", 0);
    public static final InterceptorEnum COMMENT_TAB = new InterceptorEnum("COMMENT_TAB", 1);
    public static final InterceptorEnum COMMENT_INPUT = new InterceptorEnum("COMMENT_INPUT", 2);
    public static final InterceptorEnum TRIPLE = new InterceptorEnum("TRIPLE", 3);
    public static final InterceptorEnum COIN = new InterceptorEnum("COIN", 4);
    public static final InterceptorEnum FAV = new InterceptorEnum("FAV", 5);
    public static final InterceptorEnum COMMENT_IMAGE = new InterceptorEnum("COMMENT_IMAGE", 6);

    private static final /* synthetic */ InterceptorEnum[] $values() {
        return new InterceptorEnum[]{INTRO_SCROLL, COMMENT_TAB, COMMENT_INPUT, TRIPLE, COIN, FAV, COMMENT_IMAGE};
    }

    static {
        InterceptorEnum[] interceptorEnumArr$values = $values();
        $VALUES = interceptorEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interceptorEnumArr$values);
    }

    private InterceptorEnum(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<InterceptorEnum> getEntries() {
        return $ENTRIES;
    }

    public static InterceptorEnum valueOf(String str) {
        return (InterceptorEnum) Enum.valueOf(InterceptorEnum.class, str);
    }

    public static InterceptorEnum[] values() {
        return (InterceptorEnum[]) $VALUES.clone();
    }

    public final boolean forceIntercept() {
        return compareTo(COMMENT_TAB) > 0;
    }
}
