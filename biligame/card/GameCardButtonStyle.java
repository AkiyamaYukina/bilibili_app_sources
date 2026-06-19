package com.bilibili.biligame.card;

import android.R;
import com.bilibili.biligame.utils.GameUtilExtensionsKt;
import com.bilibili.lib.theme.R$color;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButtonStyle.class */
public final class GameCardButtonStyle {
    private static final EnumEntries $ENTRIES;
    private static final GameCardButtonStyle[] $VALUES;

    @NotNull
    private final GameCardButtonAttribute buttonAttribute;
    public static final GameCardButtonStyle STYLE_THEME_COLOR = new GameCardButtonStyle("STYLE_THEME_COLOR", 0, new GameCardButtonAttribute(GameUtilExtensionsKt.toPx(66), GameUtilExtensionsKt.toPx(24), 2131103284, GameUtilExtensionsKt.toPx(2), GameUtilExtensionsKt.toPx(1), false, 2131103284, 13.0f, null, 0, null, 0, null, 7936, null));
    public static final GameCardButtonStyle STYLE_DARK = new GameCardButtonStyle("STYLE_DARK", 1, new GameCardButtonAttribute(GameUtilExtensionsKt.toPx(66), GameUtilExtensionsKt.toPx(24), R.color.white, GameUtilExtensionsKt.toPx(2), GameUtilExtensionsKt.toPx(1), false, R.color.white, 13.0f, null, 0, null, 0, null, 7936, null));
    public static final GameCardButtonStyle STYLE_PINK_FILL = new GameCardButtonStyle("STYLE_PINK_FILL", 2, new GameCardButtonAttribute(GameUtilExtensionsKt.toPx(66), GameUtilExtensionsKt.toPx(24), 2131103284, GameUtilExtensionsKt.toPx(2), 0, true, R.color.white, 13.0f, 2131103284, R$color.Ga3, null, 2131103284, Integer.valueOf(R.color.white), 1024, null));
    public static final GameCardButtonStyle STYLE_CUSTOM = new GameCardButtonStyle("STYLE_CUSTOM", 3, new GameCardButtonAttribute(0, 0, 0, 0, 0, false, 0, 0.0f, null, 0, null, 0, null, 8191, null));

    private static final /* synthetic */ GameCardButtonStyle[] $values() {
        return new GameCardButtonStyle[]{STYLE_THEME_COLOR, STYLE_DARK, STYLE_PINK_FILL, STYLE_CUSTOM};
    }

    static {
        GameCardButtonStyle[] gameCardButtonStyleArr$values = $values();
        $VALUES = gameCardButtonStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(gameCardButtonStyleArr$values);
    }

    private GameCardButtonStyle(String str, int i7, GameCardButtonAttribute gameCardButtonAttribute) {
        this.buttonAttribute = gameCardButtonAttribute;
    }

    @NotNull
    public static EnumEntries<GameCardButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static GameCardButtonStyle valueOf(String str) {
        return (GameCardButtonStyle) Enum.valueOf(GameCardButtonStyle.class, str);
    }

    public static GameCardButtonStyle[] values() {
        return (GameCardButtonStyle[]) $VALUES.clone();
    }

    @NotNull
    public final GameCardButtonAttribute getButtonAttribute() {
        return this.buttonAttribute;
    }
}
