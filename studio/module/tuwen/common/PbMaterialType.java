package com.bilibili.studio.module.tuwen.common;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/common/PbMaterialType.class */
public final class PbMaterialType {
    private static final EnumEntries $ENTRIES;
    private static final PbMaterialType[] $VALUES;
    private final int value;
    public static final PbMaterialType None = new PbMaterialType(TextSource.STR_SCROLL_NONE, 0, -1);
    public static final PbMaterialType BBSMDTextTemplateModule = new PbMaterialType("BBSMDTextTemplateModule", 1, 0);
    public static final PbMaterialType BBSMDFontModule = new PbMaterialType("BBSMDFontModule", 2, 1);
    public static final PbMaterialType BBSMDFilterModule = new PbMaterialType("BBSMDFilterModule", 3, 2);
    public static final PbMaterialType BBSMDMusicModule = new PbMaterialType("BBSMDMusicModule", 4, 3);
    public static final PbMaterialType BBSMDStickerModule = new PbMaterialType("BBSMDStickerModule", 5, 7);
    public static final PbMaterialType BBSMDTransitionModule = new PbMaterialType("BBSMDTransitionModule", 6, 8);
    public static final PbMaterialType BBSMDRhythmsModule = new PbMaterialType("BBSMDRhythmsModule", 7, 14);
    public static final PbMaterialType BBSMDEffectModule = new PbMaterialType("BBSMDEffectModule", 8, 17);
    public static final PbMaterialType BBSMDBackgroundModule = new PbMaterialType("BBSMDBackgroundModule", 9, 18);
    public static final PbMaterialType BBSMDVideoModule = new PbMaterialType("BBSMDVideoModule", 10, 19);
    public static final PbMaterialType BBSMDAudioFxModule = new PbMaterialType("BBSMDAudioFxModule", 11, 20);
    public static final PbMaterialType BBSMDFancywordModule = new PbMaterialType("BBSMDFancywordModule", 12, 21);
    public static final PbMaterialType BBSMDTextMotionModule = new PbMaterialType("BBSMDTextMotionModule", 13, 36);

    private static final /* synthetic */ PbMaterialType[] $values() {
        return new PbMaterialType[]{None, BBSMDTextTemplateModule, BBSMDFontModule, BBSMDFilterModule, BBSMDMusicModule, BBSMDStickerModule, BBSMDTransitionModule, BBSMDRhythmsModule, BBSMDEffectModule, BBSMDBackgroundModule, BBSMDVideoModule, BBSMDAudioFxModule, BBSMDFancywordModule, BBSMDTextMotionModule};
    }

    static {
        PbMaterialType[] pbMaterialTypeArr$values = $values();
        $VALUES = pbMaterialTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pbMaterialTypeArr$values);
    }

    private PbMaterialType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PbMaterialType> getEntries() {
        return $ENTRIES;
    }

    public static PbMaterialType valueOf(String str) {
        return (PbMaterialType) Enum.valueOf(PbMaterialType.class, str);
    }

    public static PbMaterialType[] values() {
        return (PbMaterialType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
