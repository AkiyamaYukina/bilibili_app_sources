package com.bilibili.pegasus.ext.router;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/ext/router/UriType.class */
public final class UriType {
    private static final EnumEntries $ENTRIES;
    private static final UriType[] $VALUES;
    public static final UriType UNKNOWN = new UriType("UNKNOWN", 0);
    public static final UriType VIDEO = new UriType("VIDEO", 1);
    public static final UriType LIVE = new UriType(SocializeMedia.BILI_LIVE, 2);
    public static final UriType BANGUMI = new UriType("BANGUMI", 3);
    public static final UriType ARTICLE = new UriType("ARTICLE", 4);
    public static final UriType SPACE = new UriType("SPACE", 5);
    public static final UriType GAME_CENTER = new UriType("GAME_CENTER", 6);
    public static final UriType CATEGORY = new UriType("CATEGORY", 7);
    public static final UriType MUSIC = new UriType("MUSIC", 8);
    public static final UriType FOLLOWING = new UriType("FOLLOWING", 9);
    public static final UriType CHANNEL = new UriType("CHANNEL", 10);
    public static final UriType STORY = new UriType("STORY", 11);

    private static final /* synthetic */ UriType[] $values() {
        return new UriType[]{UNKNOWN, VIDEO, LIVE, BANGUMI, ARTICLE, SPACE, GAME_CENTER, CATEGORY, MUSIC, FOLLOWING, CHANNEL, STORY};
    }

    static {
        UriType[] uriTypeArr$values = $values();
        $VALUES = uriTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uriTypeArr$values);
    }

    private UriType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<UriType> getEntries() {
        return $ENTRIES;
    }

    public static UriType valueOf(String str) {
        return (UriType) Enum.valueOf(UriType.class, str);
    }

    public static UriType[] values() {
        return (UriType[]) $VALUES.clone();
    }
}
