package com.bilibili.tgwt.watermark;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/WatermarkUiMode.class */
public final class WatermarkUiMode {
    private static final EnumEntries $ENTRIES;
    private static final WatermarkUiMode[] $VALUES;
    public static final WatermarkUiMode HalfScreen;
    public static final WatermarkUiMode Landscape;
    public static final WatermarkUiMode LandscapeSmall;
    public static final WatermarkUiMode PortraitFullscreen;
    private final float iconPadding;
    private final float iconSize;
    private final float marginBottom;
    private final float marginEnd;
    private final float simpleTextMarginBottom;
    private final long textSize;

    private static final /* synthetic */ WatermarkUiMode[] $values() {
        return new WatermarkUiMode[]{HalfScreen, Landscape, LandscapeSmall, PortraitFullscreen};
    }

    static {
        float f7 = 20;
        float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
        long sp = TextUnitKt.getSp(14);
        float f8 = 32;
        float fM3880constructorimpl2 = Dp.m3880constructorimpl(f8);
        float fM3880constructorimpl3 = Dp.m3880constructorimpl(48);
        float f9 = 4;
        float fM3880constructorimpl4 = Dp.m3880constructorimpl(f9);
        float f10 = 50;
        HalfScreen = new WatermarkUiMode("HalfScreen", 0, fM3880constructorimpl, sp, fM3880constructorimpl2, fM3880constructorimpl3, fM3880constructorimpl4, Dp.m3880constructorimpl(f10));
        float f11 = 96;
        float f12 = 80;
        Landscape = new WatermarkUiMode("Landscape", 1, Dp.m3880constructorimpl(f8), TextUnitKt.getSp(24), Dp.m3880constructorimpl(f11), Dp.m3880constructorimpl(f11), Dp.m3880constructorimpl(8), Dp.m3880constructorimpl(f12));
        LandscapeSmall = new WatermarkUiMode("LandscapeSmall", 2, Dp.m3880constructorimpl(f7), TextUnitKt.getSp(14), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f11), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f12));
        PortraitFullscreen = new WatermarkUiMode("PortraitFullscreen", 3, Dp.m3880constructorimpl(f7), TextUnitKt.getSp(14), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(224), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f10));
        WatermarkUiMode[] watermarkUiModeArr$values = $values();
        $VALUES = watermarkUiModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(watermarkUiModeArr$values);
    }

    private WatermarkUiMode(String str, int i7, float f7, long j7, float f8, float f9, float f10, float f11) {
        this.iconSize = f7;
        this.textSize = j7;
        this.marginEnd = f8;
        this.marginBottom = f9;
        this.iconPadding = f10;
        this.simpleTextMarginBottom = f11;
    }

    @NotNull
    public static EnumEntries<WatermarkUiMode> getEntries() {
        return $ENTRIES;
    }

    public static WatermarkUiMode valueOf(String str) {
        return (WatermarkUiMode) Enum.valueOf(WatermarkUiMode.class, str);
    }

    public static WatermarkUiMode[] values() {
        return (WatermarkUiMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getIconPadding-D9Ej5fM, reason: not valid java name */
    public final float m10600getIconPaddingD9Ej5fM() {
        return this.iconPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m10601getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: getMarginBottom-D9Ej5fM, reason: not valid java name */
    public final float m10602getMarginBottomD9Ej5fM() {
        return this.marginBottom;
    }

    /* JADX INFO: renamed from: getMarginEnd-D9Ej5fM, reason: not valid java name */
    public final float m10603getMarginEndD9Ej5fM() {
        return this.marginEnd;
    }

    /* JADX INFO: renamed from: getSimpleTextMarginBottom-D9Ej5fM, reason: not valid java name */
    public final float m10604getSimpleTextMarginBottomD9Ej5fM() {
        return this.simpleTextMarginBottom;
    }

    /* JADX INFO: renamed from: getTextSize-XSAIIZE, reason: not valid java name */
    public final long m10605getTextSizeXSAIIZE() {
        return this.textSize;
    }
}
