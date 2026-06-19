package com.bilibili.mall.kmm.detailVideo.comment.vm;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/vm/MallDetailCommentFooterStatus.class */
public final class MallDetailCommentFooterStatus {
    private static final EnumEntries $ENTRIES;
    private static final MallDetailCommentFooterStatus[] $VALUES;
    public static final MallDetailCommentFooterStatus NONE = new MallDetailCommentFooterStatus("NONE", 0);
    public static final MallDetailCommentFooterStatus IDLE = new MallDetailCommentFooterStatus("IDLE", 1);
    public static final MallDetailCommentFooterStatus END = new MallDetailCommentFooterStatus("END", 2);
    public static final MallDetailCommentFooterStatus ERROR = new MallDetailCommentFooterStatus("ERROR", 3);

    private static final /* synthetic */ MallDetailCommentFooterStatus[] $values() {
        return new MallDetailCommentFooterStatus[]{NONE, IDLE, END, ERROR};
    }

    static {
        MallDetailCommentFooterStatus[] mallDetailCommentFooterStatusArr$values = $values();
        $VALUES = mallDetailCommentFooterStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallDetailCommentFooterStatusArr$values);
    }

    private MallDetailCommentFooterStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallDetailCommentFooterStatus> getEntries() {
        return $ENTRIES;
    }

    public static MallDetailCommentFooterStatus valueOf(String str) {
        return (MallDetailCommentFooterStatus) Enum.valueOf(MallDetailCommentFooterStatus.class, str);
    }

    public static MallDetailCommentFooterStatus[] values() {
        return (MallDetailCommentFooterStatus[]) $VALUES.clone();
    }
}
