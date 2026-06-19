package com.bilibili.ship.theseus.united.page.comment;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/CommentStyleType.class */
public final class CommentStyleType {
    private static final EnumEntries $ENTRIES;
    private static final CommentStyleType[] $VALUES;
    public static final CommentStyleType FLIP_EFFECT = new CommentStyleType("FLIP_EFFECT", 0);
    public static final CommentStyleType SCROLL_ANIMATION = new CommentStyleType("SCROLL_ANIMATION", 1);
    public static final CommentStyleType CAROUSEL_TEXT = new CommentStyleType("CAROUSEL_TEXT", 2);
    public static final CommentStyleType BUBBLE_TEXT = new CommentStyleType("BUBBLE_TEXT", 3);
    public static final CommentStyleType UNKNOWN = new CommentStyleType("UNKNOWN", 4);

    private static final /* synthetic */ CommentStyleType[] $values() {
        return new CommentStyleType[]{FLIP_EFFECT, SCROLL_ANIMATION, CAROUSEL_TEXT, BUBBLE_TEXT, UNKNOWN};
    }

    static {
        CommentStyleType[] commentStyleTypeArr$values = $values();
        $VALUES = commentStyleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(commentStyleTypeArr$values);
    }

    private CommentStyleType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CommentStyleType> getEntries() {
        return $ENTRIES;
    }

    public static CommentStyleType valueOf(String str) {
        return (CommentStyleType) Enum.valueOf(CommentStyleType.class, str);
    }

    public static CommentStyleType[] values() {
        return (CommentStyleType[]) $VALUES.clone();
    }
}
