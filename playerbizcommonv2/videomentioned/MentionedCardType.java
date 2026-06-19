package com.bilibili.playerbizcommonv2.videomentioned;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardType.class */
public final class MentionedCardType {
    private static final EnumEntries $ENTRIES;
    private static final MentionedCardType[] $VALUES;
    public static final MentionedCardType GAME = new MentionedCardType("GAME", 0, "game");
    public static final MentionedCardType STREAMER = new MentionedCardType("STREAMER", 1, "streamer");

    @NotNull
    private final String type;

    private static final /* synthetic */ MentionedCardType[] $values() {
        return new MentionedCardType[]{GAME, STREAMER};
    }

    static {
        MentionedCardType[] mentionedCardTypeArr$values = $values();
        $VALUES = mentionedCardTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mentionedCardTypeArr$values);
    }

    private MentionedCardType(String str, int i7, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<MentionedCardType> getEntries() {
        return $ENTRIES;
    }

    public static MentionedCardType valueOf(String str) {
        return (MentionedCardType) Enum.valueOf(MentionedCardType.class, str);
    }

    public static MentionedCardType[] values() {
        return (MentionedCardType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
