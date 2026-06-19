package com.bilibili.studio.videocompile.define;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileRetryType.class */
@Keep
public final class BVideoCompileRetryType {
    private static final EnumEntries $ENTRIES;
    private static final BVideoCompileRetryType[] $VALUES;
    private int id;

    @NotNull
    private String type;
    public static final BVideoCompileRetryType HardwareEncodingError = new BVideoCompileRetryType("HardwareEncodingError", 0, "HardwareEncodingError", 1);
    public static final BVideoCompileRetryType HardwareDecodingError = new BVideoCompileRetryType("HardwareDecodingError", 1, "HardwareDecodingError", 2);

    private static final /* synthetic */ BVideoCompileRetryType[] $values() {
        return new BVideoCompileRetryType[]{HardwareEncodingError, HardwareDecodingError};
    }

    static {
        BVideoCompileRetryType[] bVideoCompileRetryTypeArr$values = $values();
        $VALUES = bVideoCompileRetryTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bVideoCompileRetryTypeArr$values);
    }

    private BVideoCompileRetryType(String str, int i7, String str2, int i8) {
        this.type = str2;
        this.id = i8;
    }

    @NotNull
    public static EnumEntries<BVideoCompileRetryType> getEntries() {
        return $ENTRIES;
    }

    public static BVideoCompileRetryType valueOf(String str) {
        return (BVideoCompileRetryType) Enum.valueOf(BVideoCompileRetryType.class, str);
    }

    public static BVideoCompileRetryType[] values() {
        return (BVideoCompileRetryType[]) $VALUES.clone();
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setType(@NotNull String str) {
        this.type = str;
    }
}
