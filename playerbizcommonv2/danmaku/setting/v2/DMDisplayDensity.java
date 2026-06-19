package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import androidx.annotation.StringRes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMDisplayDensity.class */
public final class DMDisplayDensity {
    private static final EnumEntries $ENTRIES;
    private static final DMDisplayDensity[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final DMDisplayDensity NORMAL = new DMDisplayDensity("NORMAL", 0, 1, 2131851724);
    public static final DMDisplayDensity PLENTY = new DMDisplayDensity("PLENTY", 1, 2, 2131846093);
    public static final DMDisplayDensity STACKING = new DMDisplayDensity("STACKING", 2, 3, 2131846163);
    private final int description;
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMDisplayDensity$a.class */
    public static final class a {
    }

    private static final /* synthetic */ DMDisplayDensity[] $values() {
        return new DMDisplayDensity[]{NORMAL, PLENTY, STACKING};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDensity$a, java.lang.Object] */
    static {
        DMDisplayDensity[] dMDisplayDensityArr$values = $values();
        $VALUES = dMDisplayDensityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dMDisplayDensityArr$values);
        Companion = new Object();
    }

    private DMDisplayDensity(String str, @StringRes int i7, int i8, int i9) {
        this.value = i8;
        this.description = i9;
    }

    @NotNull
    public static EnumEntries<DMDisplayDensity> getEntries() {
        return $ENTRIES;
    }

    public static DMDisplayDensity valueOf(String str) {
        return (DMDisplayDensity) Enum.valueOf(DMDisplayDensity.class, str);
    }

    public static DMDisplayDensity[] values() {
        return (DMDisplayDensity[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }
}
