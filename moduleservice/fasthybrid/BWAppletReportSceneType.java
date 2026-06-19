package com.bilibili.moduleservice.fasthybrid;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/BWAppletReportSceneType.class */
public final class BWAppletReportSceneType {
    private static final EnumEntries $ENTRIES;
    private static final BWAppletReportSceneType[] $VALUES;
    private final int value;
    public static final BWAppletReportSceneType TM_AD_MINIPROGRAM = new BWAppletReportSceneType("TM_AD_MINIPROGRAM", 0, 0);
    public static final BWAppletReportSceneType TM_GAME = new BWAppletReportSceneType("TM_GAME", 1, 1);
    public static final BWAppletReportSceneType TM_AD_MINIGAME = new BWAppletReportSceneType("TM_AD_MINIGAME", 2, 2);
    public static final BWAppletReportSceneType STORY_MINIGAME = new BWAppletReportSceneType("STORY_MINIGAME", 3, 3);
    public static final BWAppletReportSceneType AD_VD_APPLET = new BWAppletReportSceneType("AD_VD_APPLET", 4, 4);
    public static final BWAppletReportSceneType AD_STORY_APPLET = new BWAppletReportSceneType("AD_STORY_APPLET", 5, 5);
    public static final BWAppletReportSceneType AD_TM__APPLET = new BWAppletReportSceneType("AD_TM__APPLET", 6, 6);
    public static final BWAppletReportSceneType NONE = new BWAppletReportSceneType("NONE", 7, -1);

    private static final /* synthetic */ BWAppletReportSceneType[] $values() {
        return new BWAppletReportSceneType[]{TM_AD_MINIPROGRAM, TM_GAME, TM_AD_MINIGAME, STORY_MINIGAME, AD_VD_APPLET, AD_STORY_APPLET, AD_TM__APPLET, NONE};
    }

    static {
        BWAppletReportSceneType[] bWAppletReportSceneTypeArr$values = $values();
        $VALUES = bWAppletReportSceneTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bWAppletReportSceneTypeArr$values);
    }

    private BWAppletReportSceneType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BWAppletReportSceneType> getEntries() {
        return $ENTRIES;
    }

    public static BWAppletReportSceneType valueOf(String str) {
        return (BWAppletReportSceneType) Enum.valueOf(BWAppletReportSceneType.class, str);
    }

    public static BWAppletReportSceneType[] values() {
        return (BWAppletReportSceneType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
