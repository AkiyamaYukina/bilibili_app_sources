package com.bilibili.opd.app.bizcommon.imageselector.page;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaPreviewModel.class */
public final class MallMediaPreviewModel {
    private static final EnumEntries $ENTRIES;
    private static final MallMediaPreviewModel[] $VALUES;
    public static final MallMediaPreviewModel IMAGE = new MallMediaPreviewModel("IMAGE", 0, 1, "预览图片");
    public static final MallMediaPreviewModel VIDEO = new MallMediaPreviewModel("VIDEO", 1, 2, "预览视频");

    @NotNull
    private final String desc;
    private final int value;

    private static final /* synthetic */ MallMediaPreviewModel[] $values() {
        return new MallMediaPreviewModel[]{IMAGE, VIDEO};
    }

    static {
        MallMediaPreviewModel[] mallMediaPreviewModelArr$values = $values();
        $VALUES = mallMediaPreviewModelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallMediaPreviewModelArr$values);
    }

    private MallMediaPreviewModel(String str, int i7, int i8, String str2) {
        this.value = i8;
        this.desc = str2;
    }

    @NotNull
    public static EnumEntries<MallMediaPreviewModel> getEntries() {
        return $ENTRIES;
    }

    public static MallMediaPreviewModel valueOf(String str) {
        return (MallMediaPreviewModel) Enum.valueOf(MallMediaPreviewModel.class, str);
    }

    public static MallMediaPreviewModel[] values() {
        return (MallMediaPreviewModel[]) $VALUES.clone();
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }
}
