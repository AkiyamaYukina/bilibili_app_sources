package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ComicFinishState.class */
public final class ComicFinishState {
    private static final EnumEntries $ENTRIES;
    private static final ComicFinishState[] $VALUES;
    private final int state;
    public static final ComicFinishState Unknown = new ComicFinishState("Unknown", 0, -2);
    public static final ComicFinishState NotPublished = new ComicFinishState("NotPublished", 1, -1);
    public static final ComicFinishState Serialized = new ComicFinishState("Serialized", 2, 0);
    public static final ComicFinishState End = new ComicFinishState("End", 3, 1);
    public static final ComicFinishState NewPowerProject = new ComicFinishState("NewPowerProject", 4, 2);

    private static final /* synthetic */ ComicFinishState[] $values() {
        return new ComicFinishState[]{Unknown, NotPublished, Serialized, End, NewPowerProject};
    }

    static {
        ComicFinishState[] comicFinishStateArr$values = $values();
        $VALUES = comicFinishStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(comicFinishStateArr$values);
    }

    private ComicFinishState(String str, int i7, int i8) {
        this.state = i8;
    }

    @NotNull
    public static EnumEntries<ComicFinishState> getEntries() {
        return $ENTRIES;
    }

    public static ComicFinishState valueOf(String str) {
        return (ComicFinishState) Enum.valueOf(ComicFinishState.class, str);
    }

    public static ComicFinishState[] values() {
        return (ComicFinishState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }
}
