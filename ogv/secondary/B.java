package com.bilibili.ogv.secondary;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.systemui.StatusBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/B.class */
public final class B implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Unit> f72595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f72596b;

    public B(Modifier modifier, UiComposableLike uiComposableLike) {
        this.f72595a = uiComposableLike;
        this.f72596b = modifier;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1883630218, iIntValue, -1, "com.bilibili.ogv.secondary.SecondaryOperationComponent.entry.<anonymous>.<anonymous>.<anonymous> (SecondaryOperationComponent.kt:62)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i7 = BiliTheme.$stable;
            this.f72595a.invoke(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m1169backgroundbw27NRU$default(StatusBarKt.statusBarDarkIcons(this.f72596b, Boolean.valueOf(biliTheme.getDayNightTheme(composer, i7) == ThemeDayNight.Day)), biliTheme.getColors(composer, i7).getBg1-0d7_KjU(), null, 2, null), TopAppBarDefaults.INSTANCE.getWindowInsets(composer, TopAppBarDefaults.$stable))), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
