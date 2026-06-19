package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMDisplayDomain.class */
public final class DMDisplayDomain {
    private static final EnumEntries $ENTRIES;
    private static final DMDisplayDomain[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String description;
    private final float percent;
    private final float region;
    public static final DMDisplayDomain PERCENT_10 = new DMDisplayDomain("PERCENT_10", 0, 0.0f, 0.1f, "10%");
    public static final DMDisplayDomain PERCENT_25 = new DMDisplayDomain("PERCENT_25", 1, 25.0f, 0.25f, "25%");
    public static final DMDisplayDomain PERCENT_50 = new DMDisplayDomain("PERCENT_50", 2, 50.0f, 0.5f, "50%");
    public static final DMDisplayDomain PERCENT_75 = new DMDisplayDomain("PERCENT_75", 3, 75.0f, 0.75f, "75%");
    public static final DMDisplayDomain PERCENT_100 = new DMDisplayDomain("PERCENT_100", 4, 100.0f, 1.0f, "100%");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMDisplayDomain$a.class */
    public static final class a {
        @NotNull
        public static DMDisplayDomain a(float f7) {
            DMDisplayDomain dMDisplayDomain = DMDisplayDomain.PERCENT_25;
            float fAbs = Math.abs(dMDisplayDomain.getPercent() - f7);
            for (DMDisplayDomain dMDisplayDomain2 : DMDisplayDomain.getEntries()) {
                float fAbs2 = Math.abs(dMDisplayDomain2.getPercent() - f7);
                if (fAbs2 < fAbs) {
                    dMDisplayDomain = dMDisplayDomain2;
                    fAbs = fAbs2;
                }
            }
            return dMDisplayDomain;
        }

        @NotNull
        public static DMDisplayDomain b(float f7) {
            DMDisplayDomain dMDisplayDomain = DMDisplayDomain.PERCENT_25;
            float fAbs = Math.abs(dMDisplayDomain.getRegion() - f7);
            for (DMDisplayDomain dMDisplayDomain2 : DMDisplayDomain.getEntries()) {
                float fAbs2 = Math.abs(dMDisplayDomain2.getRegion() - f7);
                if (fAbs2 < fAbs) {
                    dMDisplayDomain = dMDisplayDomain2;
                    fAbs = fAbs2;
                }
            }
            return dMDisplayDomain;
        }
    }

    private static final /* synthetic */ DMDisplayDomain[] $values() {
        return new DMDisplayDomain[]{PERCENT_10, PERCENT_25, PERCENT_50, PERCENT_75, PERCENT_100};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDomain$a, java.lang.Object] */
    static {
        DMDisplayDomain[] dMDisplayDomainArr$values = $values();
        $VALUES = dMDisplayDomainArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dMDisplayDomainArr$values);
        Companion = new Object();
    }

    private DMDisplayDomain(String str, int i7, float f7, float f8, String str2) {
        this.percent = f7;
        this.region = f8;
        this.description = str2;
    }

    @NotNull
    public static EnumEntries<DMDisplayDomain> getEntries() {
        return $ENTRIES;
    }

    public static DMDisplayDomain valueOf(String str) {
        return (DMDisplayDomain) Enum.valueOf(DMDisplayDomain.class, str);
    }

    public static DMDisplayDomain[] values() {
        return (DMDisplayDomain[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final float getRegion() {
        return this.region;
    }
}
