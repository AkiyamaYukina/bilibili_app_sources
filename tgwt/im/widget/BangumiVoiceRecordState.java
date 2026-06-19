package com.bilibili.tgwt.im.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiVoiceRecordState.class */
public final class BangumiVoiceRecordState {
    private static final EnumEntries $ENTRIES;
    private static final BangumiVoiceRecordState[] $VALUES;
    public static final BangumiVoiceRecordState PREV_RECORD = new BangumiVoiceRecordState("PREV_RECORD", 0);
    public static final BangumiVoiceRecordState RECORDING = new BangumiVoiceRecordState("RECORDING", 1);
    public static final BangumiVoiceRecordState ENTER_CANCEL_RECORD = new BangumiVoiceRecordState("ENTER_CANCEL_RECORD", 2);
    public static final BangumiVoiceRecordState PREV_CANCEL_RECORD = new BangumiVoiceRecordState("PREV_CANCEL_RECORD", 3);

    private static final /* synthetic */ BangumiVoiceRecordState[] $values() {
        return new BangumiVoiceRecordState[]{PREV_RECORD, RECORDING, ENTER_CANCEL_RECORD, PREV_CANCEL_RECORD};
    }

    static {
        BangumiVoiceRecordState[] bangumiVoiceRecordStateArr$values = $values();
        $VALUES = bangumiVoiceRecordStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bangumiVoiceRecordStateArr$values);
    }

    private BangumiVoiceRecordState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BangumiVoiceRecordState> getEntries() {
        return $ENTRIES;
    }

    public static BangumiVoiceRecordState valueOf(String str) {
        return (BangumiVoiceRecordState) Enum.valueOf(BangumiVoiceRecordState.class, str);
    }

    public static BangumiVoiceRecordState[] values() {
        return (BangumiVoiceRecordState[]) $VALUES.clone();
    }
}
