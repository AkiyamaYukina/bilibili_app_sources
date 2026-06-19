package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/OfficialVerifyType.class */
public final class OfficialVerifyType implements com.bilibili.bson.adapter.a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final OfficialVerifyType[] $VALUES;
    private final int value;
    public static final OfficialVerifyType UNVERIFIED = new OfficialVerifyType("UNVERIFIED", 0, 0);
    public static final OfficialVerifyType UPPER = new OfficialVerifyType("UPPER", 1, 1);
    public static final OfficialVerifyType IDENTITY = new OfficialVerifyType("IDENTITY", 2, 2);
    public static final OfficialVerifyType COMPANY = new OfficialVerifyType("COMPANY", 3, 3);
    public static final OfficialVerifyType GOVERNMENT = new OfficialVerifyType("GOVERNMENT", 4, 4);
    public static final OfficialVerifyType MEDIA = new OfficialVerifyType("MEDIA", 5, 5);
    public static final OfficialVerifyType OTHER = new OfficialVerifyType("OTHER", 6, 6);

    private static final /* synthetic */ OfficialVerifyType[] $values() {
        return new OfficialVerifyType[]{UNVERIFIED, UPPER, IDENTITY, COMPANY, GOVERNMENT, MEDIA, OTHER};
    }

    static {
        OfficialVerifyType[] officialVerifyTypeArr$values = $values();
        $VALUES = officialVerifyTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(officialVerifyTypeArr$values);
    }

    private OfficialVerifyType(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<OfficialVerifyType> getEntries() {
        return $ENTRIES;
    }

    public static OfficialVerifyType valueOf(String str) {
        return (OfficialVerifyType) Enum.valueOf(OfficialVerifyType.class, str);
    }

    public static OfficialVerifyType[] values() {
        return (OfficialVerifyType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9521getValue() {
        return Integer.valueOf(this.value);
    }
}
