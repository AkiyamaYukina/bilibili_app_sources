package com.bilibili.ogv.secondary.api;

import G3.C1937n;
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
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/FeedType.class */
@Serializable
public final class FeedType {
    private static final EnumEntries $ENTRIES;
    private static final FeedType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;

    @SerialName("pgc_feed")
    public static final FeedType PGC_FEED = new FeedType("PGC_FEED", 0);

    @SerialName("fall_region")
    public static final FeedType FALL_REGION = new FeedType("FALL_REGION", 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/FeedType$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<FeedType> serializer() {
            return (KSerializer) FeedType.$cachedSerializer$delegate.getValue();
        }
    }

    private static final /* synthetic */ FeedType[] $values() {
        return new FeedType[]{PGC_FEED, FALL_REGION};
    }

    static {
        FeedType[] feedTypeArr$values = $values();
        $VALUES = feedTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedTypeArr$values);
        Companion = new a();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C1937n(9));
    }

    private FeedType(String str, int i7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.annotation.Annotation[], java.lang.annotation.Annotation[][]] */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.bilibili.ogv.secondary.api.FeedType", values(), new String[]{"pgc_feed", "fall_region"}, (Annotation[][]) new Annotation[]{0, 0}, (Annotation[]) null);
    }

    @NotNull
    public static EnumEntries<FeedType> getEntries() {
        return $ENTRIES;
    }

    public static FeedType valueOf(String str) {
        return (FeedType) Enum.valueOf(FeedType.class, str);
    }

    public static FeedType[] values() {
        return (FeedType[]) $VALUES.clone();
    }
}
