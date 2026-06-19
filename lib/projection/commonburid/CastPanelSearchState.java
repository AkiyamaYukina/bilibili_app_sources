package com.bilibili.lib.projection.commonburid;

import androidx.core.os.EnvironmentCompat;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastPanelSearchState.class */
public final class CastPanelSearchState {
    private static final EnumEntries $ENTRIES;
    private static final CastPanelSearchState[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final CastPanelSearchState CastPanelSearchStateUnknown = new CastPanelSearchState("CastPanelSearchStateUnknown", 0, EnvironmentCompat.MEDIA_UNKNOWN);
    public static final CastPanelSearchState CastPanelSearchStateEmpty = new CastPanelSearchState("CastPanelSearchStateEmpty", 1, "empty");
    public static final CastPanelSearchState BBCastPanelSearchStateTVOnly = new CastPanelSearchState("BBCastPanelSearchStateTVOnly", 2, "tv_only");
    public static final CastPanelSearchState BBCastPanelSearchStateCarOnly = new CastPanelSearchState("BBCastPanelSearchStateCarOnly", 3, "car_only");
    public static final CastPanelSearchState BBCastPanelSearchStateThirdOnly = new CastPanelSearchState("BBCastPanelSearchStateThirdOnly", 4, "third_only");
    public static final CastPanelSearchState BBCastPanelSearchStateTVAndThird = new CastPanelSearchState("BBCastPanelSearchStateTVAndThird", 5, "tv_and_third");
    public static final CastPanelSearchState BBCastPanelSearchStateCarAndThird = new CastPanelSearchState("BBCastPanelSearchStateCarAndThird", 6, "car_and_third");
    public static final CastPanelSearchState BBCastPanelSearchStateTVAndCar = new CastPanelSearchState("BBCastPanelSearchStateTVAndCar", 7, "tv_and_car");
    public static final CastPanelSearchState BBCastPanelSearchStateAll = new CastPanelSearchState("BBCastPanelSearchStateAll", 8, "all");

    private static final /* synthetic */ CastPanelSearchState[] $values() {
        return new CastPanelSearchState[]{CastPanelSearchStateUnknown, CastPanelSearchStateEmpty, BBCastPanelSearchStateTVOnly, BBCastPanelSearchStateCarOnly, BBCastPanelSearchStateThirdOnly, BBCastPanelSearchStateTVAndThird, BBCastPanelSearchStateCarAndThird, BBCastPanelSearchStateTVAndCar, BBCastPanelSearchStateAll};
    }

    static {
        CastPanelSearchState[] castPanelSearchStateArr$values = $values();
        $VALUES = castPanelSearchStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(castPanelSearchStateArr$values);
    }

    private CastPanelSearchState(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<CastPanelSearchState> getEntries() {
        return $ENTRIES;
    }

    public static CastPanelSearchState valueOf(String str) {
        return (CastPanelSearchState) Enum.valueOf(CastPanelSearchState.class, str);
    }

    public static CastPanelSearchState[] values() {
        return (CastPanelSearchState[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
