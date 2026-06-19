package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionItemType.class */
public final class InteractionItemType {
    private static final EnumEntries $ENTRIES;
    private static final InteractionItemType[] $VALUES;
    private final int type;
    public static final InteractionItemType Unknown = new InteractionItemType("Unknown", 0, -1);
    public static final InteractionItemType CommentSwitch = new InteractionItemType("CommentSwitch", 1, 0);
    public static final InteractionItemType NiceCommentSwitch = new InteractionItemType("NiceCommentSwitch", 2, 1);
    public static final InteractionItemType ChargeCommentSwitch = new InteractionItemType("ChargeCommentSwitch", 3, 2);
    public static final InteractionItemType DanmakuSwitch = new InteractionItemType("DanmakuSwitch", 4, 3);
    public static final InteractionItemType UploaderProtected = new InteractionItemType("UploaderProtected", 5, 4);
    public static final InteractionItemType DanmakuInterceptWords = new InteractionItemType("DanmakuInterceptWords", 6, 5);
    public static final InteractionItemType CommentInterceptWords = new InteractionItemType("CommentInterceptWords", 7, 6);

    private static final /* synthetic */ InteractionItemType[] $values() {
        return new InteractionItemType[]{Unknown, CommentSwitch, NiceCommentSwitch, ChargeCommentSwitch, DanmakuSwitch, UploaderProtected, DanmakuInterceptWords, CommentInterceptWords};
    }

    static {
        InteractionItemType[] interactionItemTypeArr$values = $values();
        $VALUES = interactionItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interactionItemTypeArr$values);
    }

    private InteractionItemType(String str, int i7, int i8) {
        this.type = i8;
    }

    @NotNull
    public static EnumEntries<InteractionItemType> getEntries() {
        return $ENTRIES;
    }

    public static InteractionItemType valueOf(String str) {
        return (InteractionItemType) Enum.valueOf(InteractionItemType.class, str);
    }

    public static InteractionItemType[] values() {
        return (InteractionItemType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
