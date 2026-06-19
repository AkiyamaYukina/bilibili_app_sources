package com.bilibili.pegasus.common;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.tencent.connect.common.Constants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/GoTo.class */
public final class GoTo {
    private static final EnumEntries $ENTRIES;
    private static final GoTo[] $VALUES;

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: AV, reason: collision with root package name */
    public static final GoTo f75515AV = new GoTo("AV", 0, "av");
    public static final GoTo PLAYER = new GoTo("PLAYER", 1, "player");
    public static final GoTo LIVE = new GoTo(SocializeMedia.BILI_LIVE, 2, "live");
    public static final GoTo BANGUMI = new GoTo("BANGUMI", 3, "bangumi");
    public static final GoTo BANGUMI_rcmd = new GoTo("BANGUMI_rcmd", 4, "bangumi_rcmd");
    public static final GoTo ARTICLE_S = new GoTo("ARTICLE_S", 5, "article_s");
    public static final GoTo BANNER = new GoTo("BANNER", 6, "banner");
    public static final GoTo TEXT = new GoTo("TEXT", 7, "text");
    public static final GoTo PGC = new GoTo("PGC", 8, "pgc");
    public static final GoTo VERTICAL_AV = new GoTo("VERTICAL_AV", 9, "vertical_av");
    public static final GoTo ARTICLE = new GoTo("ARTICLE", 10, "article");
    public static final GoTo VIP = new GoTo("VIP", 11, "vip");
    public static final GoTo AI_STORY = new GoTo("AI_STORY", 12, "ai_story");
    public static final GoTo AV_AD = new GoTo("AV_AD", 13, "av_ad");
    public static final GoTo PICTURE = new GoTo("PICTURE", 14, Constants.PARAM_AVATAR_URI);

    private static final /* synthetic */ GoTo[] $values() {
        return new GoTo[]{f75515AV, PLAYER, LIVE, BANGUMI, BANGUMI_rcmd, ARTICLE_S, BANNER, TEXT, PGC, VERTICAL_AV, ARTICLE, VIP, AI_STORY, AV_AD, PICTURE};
    }

    static {
        GoTo[] goToArr$values = $values();
        $VALUES = goToArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(goToArr$values);
    }

    private GoTo(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<GoTo> getEntries() {
        return $ENTRIES;
    }

    public static GoTo valueOf(String str) {
        return (GoTo) Enum.valueOf(GoTo.class, str);
    }

    public static GoTo[] values() {
        return (GoTo[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
