package com.bilibili.mall.kmm.detailVideo.comment.vm;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/vm/MallDetailCommentLoadStatus.class */
public final class MallDetailCommentLoadStatus {
    private static final EnumEntries $ENTRIES;
    private static final MallDetailCommentLoadStatus[] $VALUES;
    public static final MallDetailCommentLoadStatus NONE = new MallDetailCommentLoadStatus("NONE", 0);
    public static final MallDetailCommentLoadStatus EMPTY = new MallDetailCommentLoadStatus("EMPTY", 1);
    public static final MallDetailCommentLoadStatus SUCCESS = new MallDetailCommentLoadStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
    public static final MallDetailCommentLoadStatus ERROR = new MallDetailCommentLoadStatus("ERROR", 3);

    private static final /* synthetic */ MallDetailCommentLoadStatus[] $values() {
        return new MallDetailCommentLoadStatus[]{NONE, EMPTY, SUCCESS, ERROR};
    }

    static {
        MallDetailCommentLoadStatus[] mallDetailCommentLoadStatusArr$values = $values();
        $VALUES = mallDetailCommentLoadStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mallDetailCommentLoadStatusArr$values);
    }

    private MallDetailCommentLoadStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MallDetailCommentLoadStatus> getEntries() {
        return $ENTRIES;
    }

    public static MallDetailCommentLoadStatus valueOf(String str) {
        return (MallDetailCommentLoadStatus) Enum.valueOf(MallDetailCommentLoadStatus.class, str);
    }

    public static MallDetailCommentLoadStatus[] values() {
        return (MallDetailCommentLoadStatus[]) $VALUES.clone();
    }
}
