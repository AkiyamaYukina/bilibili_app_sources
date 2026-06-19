package com.bilibili.playerbizcommon.playerinput.utils;

import Cq0.b;
import Rq0.a;
import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/playerinput/utils/InputExtensionsKt.class */
public final class InputExtensionsKt {
    public static final boolean isDarkTheme(@NotNull b bVar) {
        return bVar.u() == 0;
    }

    public static final boolean isLandscape(@NotNull b bVar) {
        return bVar.getScreenMode() == ScreenModeType.LANDSCAPE_FULLSCREEN;
    }

    public static final boolean isStory(@NotNull b bVar) {
        a aVarN = bVar.n();
        boolean z6 = false;
        if (aVarN != null) {
            z6 = false;
            if (aVarN.f20934c == 1) {
                z6 = true;
            }
        }
        return z6;
    }

    public static final boolean isThumb(@NotNull b bVar) {
        return bVar.getScreenMode() == ScreenModeType.THUMB;
    }

    public static final boolean isVerticalFull(@NotNull b bVar) {
        return bVar.getScreenMode() == ScreenModeType.VERTICAL_FULLSCREEN;
    }

    public static final void updateMargin(@NotNull View view, int i7, int i8, int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i7;
            marginLayoutParams.rightMargin = i8;
            marginLayoutParams.topMargin = i9;
            marginLayoutParams.bottomMargin = i10;
        }
    }

    public static /* synthetic */ void updateMargin$default(View view, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        updateMargin(view, i7, i8, i9, i10);
    }

    public static final void updatePadding(@NotNull b bVar, @NotNull ViewGroup viewGroup) {
        if (isLandscape(bVar)) {
            int px = NewPlayerUtilsKt.toPx(60.0f);
            viewGroup.setPadding(px, viewGroup.getPaddingTop(), px, viewGroup.getPaddingBottom());
        } else {
            int px2 = NewPlayerUtilsKt.toPx(12.0f);
            viewGroup.setPadding(px2, viewGroup.getPaddingTop(), px2, viewGroup.getPaddingBottom());
        }
    }
}
