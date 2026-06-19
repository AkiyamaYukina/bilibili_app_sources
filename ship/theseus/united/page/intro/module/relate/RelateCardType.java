package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/RelateCardType.class */
public final class RelateCardType {
    private static final EnumEntries $ENTRIES;
    private static final RelateCardType[] $VALUES;
    public static final RelateCardType CARD_TYPE_UNKNOWN = new RelateCardType("CARD_TYPE_UNKNOWN", 0);

    /* JADX INFO: renamed from: AV, reason: collision with root package name */
    public static final RelateCardType f101047AV = new RelateCardType("AV", 1);
    public static final RelateCardType BANGUMI = new RelateCardType("BANGUMI", 2);
    public static final RelateCardType RESOURCE = new RelateCardType("RESOURCE", 3);
    public static final RelateCardType GAME = new RelateCardType("GAME", 4);
    public static final RelateCardType CM = new RelateCardType("CM", 5);
    public static final RelateCardType LIVE = new RelateCardType(SocializeMedia.BILI_LIVE, 6);
    public static final RelateCardType AI_RECOMMEND = new RelateCardType("AI_RECOMMEND", 7);
    public static final RelateCardType BANGUMI_AV = new RelateCardType("BANGUMI_AV", 8);
    public static final RelateCardType SPECIAL = new RelateCardType("SPECIAL", 9);
    public static final RelateCardType COURSE = new RelateCardType("COURSE", 10);
    public static final RelateCardType MINI_PROGRAM = new RelateCardType("MINI_PROGRAM", 11);
    public static final RelateCardType HISTORY_AV = new RelateCardType("HISTORY_AV", 12);
    public static final RelateCardType LOADING_PLACEHOLDER = new RelateCardType("LOADING_PLACEHOLDER", 13);

    private static final /* synthetic */ RelateCardType[] $values() {
        return new RelateCardType[]{CARD_TYPE_UNKNOWN, f101047AV, BANGUMI, RESOURCE, GAME, CM, LIVE, AI_RECOMMEND, BANGUMI_AV, SPECIAL, COURSE, MINI_PROGRAM, HISTORY_AV, LOADING_PLACEHOLDER};
    }

    static {
        RelateCardType[] relateCardTypeArr$values = $values();
        $VALUES = relateCardTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(relateCardTypeArr$values);
    }

    private RelateCardType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<RelateCardType> getEntries() {
        return $ENTRIES;
    }

    public static RelateCardType valueOf(String str) {
        return (RelateCardType) Enum.valueOf(RelateCardType.class, str);
    }

    public static RelateCardType[] values() {
        return (RelateCardType[]) $VALUES.clone();
    }
}
