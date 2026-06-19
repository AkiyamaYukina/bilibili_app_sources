package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvColorDirection.class */
public final class OgvColorDirection implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final OgvColorDirection[] $VALUES;

    @NotNull
    private final String value;
    public static final OgvColorDirection Vertical = new OgvColorDirection(TextSource.STR_SCROLL_VERTICAL, 0, "vertical");
    public static final OgvColorDirection Horizontal = new OgvColorDirection(TextSource.STR_SCROLL_HORIZONTAL, 1, "horizontal");

    private static final /* synthetic */ OgvColorDirection[] $values() {
        return new OgvColorDirection[]{Vertical, Horizontal};
    }

    static {
        OgvColorDirection[] ogvColorDirectionArr$values = $values();
        $VALUES = ogvColorDirectionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(ogvColorDirectionArr$values);
    }

    private OgvColorDirection(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<OgvColorDirection> getEntries() {
        return $ENTRIES;
    }

    public static OgvColorDirection valueOf(String str) {
        return (OgvColorDirection) Enum.valueOf(OgvColorDirection.class, str);
    }

    public static OgvColorDirection[] values() {
        return (OgvColorDirection[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
