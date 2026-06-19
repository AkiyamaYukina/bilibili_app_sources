package com.bilibili.studio.editor.moudle.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/common/AdsorbResult.class */
public final class AdsorbResult {
    private static final EnumEntries $ENTRIES;
    private static final AdsorbResult[] $VALUES;
    public static final AdsorbResult NO_ADSORBED = new AdsorbResult("NO_ADSORBED", 0);
    public static final AdsorbResult ADSORBED = new AdsorbResult("ADSORBED", 1);
    public static final AdsorbResult TRIGGER_ADSORBED = new AdsorbResult("TRIGGER_ADSORBED", 2);

    private static final /* synthetic */ AdsorbResult[] $values() {
        return new AdsorbResult[]{NO_ADSORBED, ADSORBED, TRIGGER_ADSORBED};
    }

    static {
        AdsorbResult[] adsorbResultArr$values = $values();
        $VALUES = adsorbResultArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(adsorbResultArr$values);
    }

    private AdsorbResult(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AdsorbResult> getEntries() {
        return $ENTRIES;
    }

    public static AdsorbResult valueOf(String str) {
        return (AdsorbResult) Enum.valueOf(AdsorbResult.class, str);
    }

    public static AdsorbResult[] values() {
        return (AdsorbResult[]) $VALUES.clone();
    }
}
