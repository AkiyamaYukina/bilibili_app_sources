package com.bilibili.upper.module.draft.bean;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/bean/DraftLostSize.class */
public final class DraftLostSize {
    private static final EnumEntries $ENTRIES;
    private static final DraftLostSize[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String resourcePath;
    public static final DraftLostSize SIZE_1_1 = new DraftLostSize("SIZE_1_1", 0, "draft_lost_1_1.png");
    public static final DraftLostSize SIZE_1_2 = new DraftLostSize("SIZE_1_2", 1, "draft_lost_1_2.png");
    public static final DraftLostSize SIZE_2_1 = new DraftLostSize("SIZE_2_1", 2, "draft_lost_2_1.png");
    public static final DraftLostSize SIZE_3_4 = new DraftLostSize("SIZE_3_4", 3, "draft_lost_3_4.png");
    public static final DraftLostSize SIZE_4_3 = new DraftLostSize("SIZE_4_3", 4, "draft_lost_4_3.png");
    public static final DraftLostSize SIZE_9_16 = new DraftLostSize("SIZE_9_16", 5, "draft_lost_9_16.png");
    public static final DraftLostSize SIZE_16_9 = new DraftLostSize("SIZE_16_9", 6, "draft_lost_16_9.png");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/bean/DraftLostSize$a.class */
    public static final class a {
    }

    private static final /* synthetic */ DraftLostSize[] $values() {
        return new DraftLostSize[]{SIZE_1_1, SIZE_1_2, SIZE_2_1, SIZE_3_4, SIZE_4_3, SIZE_9_16, SIZE_16_9};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.upper.module.draft.bean.DraftLostSize$a, java.lang.Object] */
    static {
        DraftLostSize[] draftLostSizeArr$values = $values();
        $VALUES = draftLostSizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(draftLostSizeArr$values);
        Companion = new Object();
    }

    private DraftLostSize(String str, int i7, String str2) {
        this.resourcePath = str2;
    }

    @NotNull
    public static EnumEntries<DraftLostSize> getEntries() {
        return $ENTRIES;
    }

    public static DraftLostSize valueOf(String str) {
        return (DraftLostSize) Enum.valueOf(DraftLostSize.class, str);
    }

    public static DraftLostSize[] values() {
        return (DraftLostSize[]) $VALUES.clone();
    }

    @NotNull
    public final String getResourcePath() {
        return this.resourcePath;
    }
}
