package com.bilibili.lib.projection.commonburid;

import androidx.core.os.EnvironmentCompat;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastContentType.class */
public final class CastContentType {
    private static final EnumEntries $ENTRIES;
    private static final CastContentType[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String rawValue;
    public static final CastContentType CastContentTypeUnknown = new CastContentType("CastContentTypeUnknown", 0, EnvironmentCompat.MEDIA_UNKNOWN);
    public static final CastContentType CastContentTypeUGC = new CastContentType("CastContentTypeUGC", 1, "ugc");
    public static final CastContentType CastContentTypePGC = new CastContentType("CastContentTypePGC", 2, "pgc");
    public static final CastContentType CastContentTypeEDU = new CastContentType("CastContentTypeEDU", 3, "edu");
    public static final CastContentType CastContentTypeLIVE = new CastContentType("CastContentTypeLIVE", 4, "live");
    public static final CastContentType CastContentTypeGAME = new CastContentType("CastContentTypeGAME", 5, "game");
    public static final CastContentType CastContentTypeAD = new CastContentType("CastContentTypeAD", 6, "ad");
    public static final CastContentType CastContentTypeMALL = new CastContentType("CastContentTypeMALL", 7, "mall");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastContentType$a.class */
    public static final class a {
    }

    private static final /* synthetic */ CastContentType[] $values() {
        return new CastContentType[]{CastContentTypeUnknown, CastContentTypeUGC, CastContentTypePGC, CastContentTypeEDU, CastContentTypeLIVE, CastContentTypeGAME, CastContentTypeAD, CastContentTypeMALL};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.lib.projection.commonburid.CastContentType$a, java.lang.Object] */
    static {
        CastContentType[] castContentTypeArr$values = $values();
        $VALUES = castContentTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(castContentTypeArr$values);
        Companion = new Object();
    }

    private CastContentType(String str, int i7, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<CastContentType> getEntries() {
        return $ENTRIES;
    }

    public static CastContentType valueOf(String str) {
        return (CastContentType) Enum.valueOf(CastContentType.class, str);
    }

    public static CastContentType[] values() {
        return (CastContentType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
