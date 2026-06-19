package com.bilibili.studio.videoeditor.pb;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/BiliProjectTypeWithHeadTail.class */
public final class BiliProjectTypeWithHeadTail {
    private static final EnumEntries $ENTRIES;
    private static final BiliProjectTypeWithHeadTail[] $VALUES;
    public static final BiliProjectTypeWithHeadTail PROJECT_LESS_HEAD = new BiliProjectTypeWithHeadTail("PROJECT_LESS_HEAD", 0, 0);
    public static final BiliProjectTypeWithHeadTail PROJECT_LESS_HEAD_TAIL = new BiliProjectTypeWithHeadTail("PROJECT_LESS_HEAD_TAIL", 1, 1);
    public static final BiliProjectTypeWithHeadTail PROJECT_MORE_HEAD_TAIL = new BiliProjectTypeWithHeadTail("PROJECT_MORE_HEAD_TAIL", 2, 2);
    private final int value;

    private static final /* synthetic */ BiliProjectTypeWithHeadTail[] $values() {
        return new BiliProjectTypeWithHeadTail[]{PROJECT_LESS_HEAD, PROJECT_LESS_HEAD_TAIL, PROJECT_MORE_HEAD_TAIL};
    }

    static {
        BiliProjectTypeWithHeadTail[] biliProjectTypeWithHeadTailArr$values = $values();
        $VALUES = biliProjectTypeWithHeadTailArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliProjectTypeWithHeadTailArr$values);
    }

    private BiliProjectTypeWithHeadTail(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BiliProjectTypeWithHeadTail> getEntries() {
        return $ENTRIES;
    }

    public static BiliProjectTypeWithHeadTail valueOf(String str) {
        return (BiliProjectTypeWithHeadTail) Enum.valueOf(BiliProjectTypeWithHeadTail.class, str);
    }

    public static BiliProjectTypeWithHeadTail[] values() {
        return (BiliProjectTypeWithHeadTail[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
