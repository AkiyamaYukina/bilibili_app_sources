package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ComicShowUiStatus.class */
public final class ComicShowUiStatus {
    private static final EnumEntries $ENTRIES;
    private static final ComicShowUiStatus[] $VALUES;
    private final int status;
    public static final ComicShowUiStatus OnlySingleStoryPurchase = new ComicShowUiStatus("OnlySingleStoryPurchase", 0, 1);
    public static final ComicShowUiStatus SingleStoryPurchaseWithBulk = new ComicShowUiStatus("SingleStoryPurchaseWithBulk", 1, 5);
    public static final ComicShowUiStatus SingleStoryPurchaseWithVolume = new ComicShowUiStatus("SingleStoryPurchaseWithVolume", 2, 4);
    public static final ComicShowUiStatus OnlyVolumePurchase = new ComicShowUiStatus("OnlyVolumePurchase", 3, 2);
    public static final ComicShowUiStatus VolumePurchaseWithSingleStory = new ComicShowUiStatus("VolumePurchaseWithSingleStory", 4, 3);
    public static final ComicShowUiStatus BulkPurchase = new ComicShowUiStatus("BulkPurchase", 5, 6);

    private static final /* synthetic */ ComicShowUiStatus[] $values() {
        return new ComicShowUiStatus[]{OnlySingleStoryPurchase, SingleStoryPurchaseWithBulk, SingleStoryPurchaseWithVolume, OnlyVolumePurchase, VolumePurchaseWithSingleStory, BulkPurchase};
    }

    static {
        ComicShowUiStatus[] comicShowUiStatusArr$values = $values();
        $VALUES = comicShowUiStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(comicShowUiStatusArr$values);
    }

    private ComicShowUiStatus(String str, int i7, int i8) {
        this.status = i8;
    }

    @NotNull
    public static EnumEntries<ComicShowUiStatus> getEntries() {
        return $ENTRIES;
    }

    public static ComicShowUiStatus valueOf(String str) {
        return (ComicShowUiStatus) Enum.valueOf(ComicShowUiStatus.class, str);
    }

    public static ComicShowUiStatus[] values() {
        return (ComicShowUiStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
