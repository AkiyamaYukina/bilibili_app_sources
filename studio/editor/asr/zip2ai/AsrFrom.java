package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/AsrFrom.class */
public final class AsrFrom {
    private static final EnumEntries $ENTRIES;
    private static final AsrFrom[] $VALUES;

    @NotNull
    private String value;
    public static final AsrFrom INTELLIGENCE = new AsrFrom("INTELLIGENCE", 0, "intelligence");
    public static final AsrFrom DRAFT = new AsrFrom("DRAFT", 1, "draft");
    public static final AsrFrom CUSTOMER = new AsrFrom("CUSTOMER", 2, GameDetailContent.DetailInfo.DATA_TYPE_CUSTOMER);
    public static final AsrFrom AUTO = new AsrFrom("AUTO", 3, "auto");
    public static final AsrFrom DELETE_VIDEO = new AsrFrom("DELETE_VIDEO", 4, "delete_video");
    public static final AsrFrom DELETE_RECORD = new AsrFrom("DELETE_RECORD", 5, "delete_record");

    private static final /* synthetic */ AsrFrom[] $values() {
        return new AsrFrom[]{INTELLIGENCE, DRAFT, CUSTOMER, AUTO, DELETE_VIDEO, DELETE_RECORD};
    }

    static {
        AsrFrom[] asrFromArr$values = $values();
        $VALUES = asrFromArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(asrFromArr$values);
    }

    private AsrFrom(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<AsrFrom> getEntries() {
        return $ENTRIES;
    }

    public static AsrFrom valueOf(String str) {
        return (AsrFrom) Enum.valueOf(AsrFrom.class, str);
    }

    public static AsrFrom[] values() {
        return (AsrFrom[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String str) {
        this.value = str;
    }
}
