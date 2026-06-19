package com.bilibili.studio.videocompile.define;

import androidx.annotation.Keep;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileCancelFrom.class */
@Keep
public final class BVideoCompileCancelFrom {
    private static final EnumEntries $ENTRIES;
    private static final BVideoCompileCancelFrom[] $VALUES;

    @NotNull
    private String type;
    public static final BVideoCompileCancelFrom BizCancel = new BVideoCompileCancelFrom("BizCancel", 0, "BizCancel");
    public static final BVideoCompileCancelFrom BizRelease = new BVideoCompileCancelFrom("BizRelease", 1, "BizRelease");
    public static final BVideoCompileCancelFrom InternalFinish = new BVideoCompileCancelFrom("InternalFinish", 2, "InternalFinish");
    public static final BVideoCompileCancelFrom InternalFail = new BVideoCompileCancelFrom("InternalFail", 3, "InternalFail");
    public static final BVideoCompileCancelFrom InternalRetryByHardwareDecodingError = new BVideoCompileCancelFrom("InternalRetryByHardwareDecodingError", 4, "InternalRetryByHardwareDecodingError");
    public static final BVideoCompileCancelFrom InternalRetryByHardwareEncodingError = new BVideoCompileCancelFrom("InternalRetryByHardwareEncodingError", 5, "InternalRetryByHardwareEncodingError");

    private static final /* synthetic */ BVideoCompileCancelFrom[] $values() {
        return new BVideoCompileCancelFrom[]{BizCancel, BizRelease, InternalFinish, InternalFail, InternalRetryByHardwareDecodingError, InternalRetryByHardwareEncodingError};
    }

    static {
        BVideoCompileCancelFrom[] bVideoCompileCancelFromArr$values = $values();
        $VALUES = bVideoCompileCancelFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bVideoCompileCancelFromArr$values);
    }

    private BVideoCompileCancelFrom(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<BVideoCompileCancelFrom> getEntries() {
        return $ENTRIES;
    }

    public static BVideoCompileCancelFrom valueOf(String str) {
        return (BVideoCompileCancelFrom) Enum.valueOf(BVideoCompileCancelFrom.class, str);
    }

    public static BVideoCompileCancelFrom[] values() {
        return (BVideoCompileCancelFrom[]) $VALUES.clone();
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    public void setType(@NotNull String str) {
        this.type = str;
    }
}
