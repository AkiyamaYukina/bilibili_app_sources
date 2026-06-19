package com.bilibili.studio.videoeditor;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LoadStatus.class */
public final class LoadStatus {
    private static final EnumEntries $ENTRIES;
    private static final LoadStatus[] $VALUES;
    public static final LoadStatus NotLoad = new LoadStatus("NotLoad", 0);
    public static final LoadStatus Loading = new LoadStatus("Loading", 1);
    public static final LoadStatus SUCCESS = new LoadStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
    public static final LoadStatus FAILED = new LoadStatus("FAILED", 3);

    private static final /* synthetic */ LoadStatus[] $values() {
        return new LoadStatus[]{NotLoad, Loading, SUCCESS, FAILED};
    }

    static {
        LoadStatus[] loadStatusArr$values = $values();
        $VALUES = loadStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(loadStatusArr$values);
    }

    private LoadStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<LoadStatus> getEntries() {
        return $ENTRIES;
    }

    public static LoadStatus valueOf(String str) {
        return (LoadStatus) Enum.valueOf(LoadStatus.class, str);
    }

    public static LoadStatus[] values() {
        return (LoadStatus[]) $VALUES.clone();
    }
}
