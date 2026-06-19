package com.bilibili.studio.centerplus.util.blink;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/blink/ByteEffectModRes.class */
@Keep
public final class ByteEffectModRes {
    private static final EnumEntries $ENTRIES;
    private static final ByteEffectModRes[] $VALUES;
    private final int maxVersion32;
    private final int maxVersion64;

    @NotNull
    private final String modName;
    public static final ByteEffectModRes BYTEEFFECT_SO_32 = new ByteEffectModRes("BYTEEFFECT_SO_32", 0, "byteeffect_so_32", 0, 6);
    public static final ByteEffectModRes BYTEEFFECT_SO_64 = new ByteEffectModRes("BYTEEFFECT_SO_64", 1, "byteeffect_so_64", 7, 0);
    public static final ByteEffectModRes BYTEEFFECT_LIC = new ByteEffectModRes("BYTEEFFECT_LIC", 2, "android_byteeffect_license", 4, 3);
    public static final ByteEffectModRes BYTEEFFECT_MODEL = new ByteEffectModRes("BYTEEFFECT_MODEL", 3, "android_byteeffect_model", 4, 4);

    private static final /* synthetic */ ByteEffectModRes[] $values() {
        return new ByteEffectModRes[]{BYTEEFFECT_SO_32, BYTEEFFECT_SO_64, BYTEEFFECT_LIC, BYTEEFFECT_MODEL};
    }

    static {
        ByteEffectModRes[] byteEffectModResArr$values = $values();
        $VALUES = byteEffectModResArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(byteEffectModResArr$values);
    }

    private ByteEffectModRes(String str, int i7, String str2, int i8, int i9) {
        this.modName = str2;
        this.maxVersion64 = i8;
        this.maxVersion32 = i9;
    }

    @NotNull
    public static EnumEntries<ByteEffectModRes> getEntries() {
        return $ENTRIES;
    }

    public static ByteEffectModRes valueOf(String str) {
        return (ByteEffectModRes) Enum.valueOf(ByteEffectModRes.class, str);
    }

    public static ByteEffectModRes[] values() {
        return (ByteEffectModRes[]) $VALUES.clone();
    }

    public final int getMaxVersion32() {
        return this.maxVersion32;
    }

    public final int getMaxVersion64() {
        return this.maxVersion64;
    }

    @NotNull
    public final String getModName() {
        return this.modName;
    }
}
