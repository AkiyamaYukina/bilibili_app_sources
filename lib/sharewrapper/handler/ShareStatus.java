package com.bilibili.lib.sharewrapper.handler;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/handler/ShareStatus.class */
public final class ShareStatus {
    private static final EnumEntries $ENTRIES;
    private static final ShareStatus[] $VALUES;
    private final int code;
    public static final ShareStatus SUCCESS = new ShareStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 0, 0);
    public static final ShareStatus FAILURE = new ShareStatus("FAILURE", 1, 1);
    public static final ShareStatus CANCEL = new ShareStatus("CANCEL", 2, 2);

    private static final /* synthetic */ ShareStatus[] $values() {
        return new ShareStatus[]{SUCCESS, FAILURE, CANCEL};
    }

    static {
        ShareStatus[] shareStatusArr$values = $values();
        $VALUES = shareStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shareStatusArr$values);
    }

    private ShareStatus(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<ShareStatus> getEntries() {
        return $ENTRIES;
    }

    public static ShareStatus valueOf(String str) {
        return (ShareStatus) Enum.valueOf(ShareStatus.class, str);
    }

    public static ShareStatus[] values() {
        return (ShareStatus[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
