package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.adapter.a;
import com.bilibili.upper.module.tempalte.bean.TagTemplate;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/FoldStyle.class */
public final class FoldStyle implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final FoldStyle[] $VALUES;
    private final int value;
    public static final FoldStyle Default = new FoldStyle(TagTemplate.DEFAULT_TAG, 0, 0);
    public static final FoldStyle Countdown = new FoldStyle("Countdown", 1, 1);
    public static final FoldStyle OnlyButton = new FoldStyle("OnlyButton", 2, 2);

    private static final /* synthetic */ FoldStyle[] $values() {
        return new FoldStyle[]{Default, Countdown, OnlyButton};
    }

    static {
        FoldStyle[] foldStyleArr$values = $values();
        $VALUES = foldStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(foldStyleArr$values);
    }

    private FoldStyle(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<FoldStyle> getEntries() {
        return $ENTRIES;
    }

    public static FoldStyle valueOf(String str) {
        return (FoldStyle) Enum.valueOf(FoldStyle.class, str);
    }

    public static FoldStyle[] values() {
        return (FoldStyle[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9559getValue() {
        return Integer.valueOf(this.value);
    }
}
