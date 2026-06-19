package com.bilibili.ogv.rank.api;

import J81.t;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/RankThemeType.class */
@Serializable
public final class RankThemeType {
    private static final EnumEntries $ENTRIES;
    private static final RankThemeType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;

    @SerialName("0")
    public static final RankThemeType UNKNOWN = new RankThemeType("UNKNOWN", 0);

    @SerialName("1")
    public static final RankThemeType AUTO = new RankThemeType("AUTO", 1);

    @SerialName("2")
    public static final RankThemeType DARK = new RankThemeType("DARK", 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/RankThemeType$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<RankThemeType> serializer() {
            return (KSerializer) RankThemeType.$cachedSerializer$delegate.getValue();
        }
    }

    private static final /* synthetic */ RankThemeType[] $values() {
        return new RankThemeType[]{UNKNOWN, AUTO, DARK};
    }

    static {
        RankThemeType[] rankThemeTypeArr$values = $values();
        $VALUES = rankThemeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(rankThemeTypeArr$values);
        Companion = new a();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new t(10));
    }

    private RankThemeType(String str, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.annotation.Annotation[], java.lang.annotation.Annotation[][]] */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.bilibili.ogv.rank.api.RankThemeType", values(), new String[]{"0", "1", "2"}, (Annotation[][]) new Annotation[]{0, 0, 0}, (Annotation[]) null);
    }

    @NotNull
    public static EnumEntries<RankThemeType> getEntries() {
        return $ENTRIES;
    }

    public static RankThemeType valueOf(String str) {
        return (RankThemeType) Enum.valueOf(RankThemeType.class, str);
    }

    public static RankThemeType[] values() {
        return (RankThemeType[]) $VALUES.clone();
    }
}
