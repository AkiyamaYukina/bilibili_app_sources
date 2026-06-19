package com.bilibili.biligame.card;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButtonAction.class */
public final class GameCardButtonAction {
    private static final EnumEntries $ENTRIES;
    private static final GameCardButtonAction[] $VALUES;
    public static final GameCardButtonAction ACTION_DETAIL = new GameCardButtonAction("ACTION_DETAIL", 0);
    public static final GameCardButtonAction ACTION_BOOK = new GameCardButtonAction("ACTION_BOOK", 1);
    public static final GameCardButtonAction ACTION_DOWNLOAD = new GameCardButtonAction("ACTION_DOWNLOAD", 2);
    public static final GameCardButtonAction ACTION_MINI_GAME = new GameCardButtonAction("ACTION_MINI_GAME", 3);
    public static final GameCardButtonAction ACTION_PAY = new GameCardButtonAction("ACTION_PAY", 4);
    public static final GameCardButtonAction ACTION_LINK = new GameCardButtonAction("ACTION_LINK", 5);

    private static final /* synthetic */ GameCardButtonAction[] $values() {
        return new GameCardButtonAction[]{ACTION_DETAIL, ACTION_BOOK, ACTION_DOWNLOAD, ACTION_MINI_GAME, ACTION_PAY, ACTION_LINK};
    }

    static {
        GameCardButtonAction[] gameCardButtonActionArr$values = $values();
        $VALUES = gameCardButtonActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(gameCardButtonActionArr$values);
    }

    private GameCardButtonAction(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<GameCardButtonAction> getEntries() {
        return $ENTRIES;
    }

    public static GameCardButtonAction valueOf(String str) {
        return (GameCardButtonAction) Enum.valueOf(GameCardButtonAction.class, str);
    }

    public static GameCardButtonAction[] values() {
        return (GameCardButtonAction[]) $VALUES.clone();
    }
}
