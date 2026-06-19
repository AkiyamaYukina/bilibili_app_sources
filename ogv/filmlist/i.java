package com.bilibili.ogv.filmlist;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.systemui.StatusBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/i.class */
public final class i implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Unit> f67720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f67721b;

    public i(Modifier modifier, UiComposableLike uiComposableLike) {
        this.f67720a = uiComposableLike;
        this.f67721b = modifier;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-69564085, iIntValue, -1, "com.bilibili.ogv.filmlist.FilmListComponent.komponent.<anonymous>.<anonymous>.<anonymous> (FilmListComponent.kt:56)");
            }
            this.f67720a.invoke(BackgroundKt.m1169backgroundbw27NRU$default(StatusBarKt.statusBarDarkIcons(this.f67721b, Boolean.FALSE), ColorKt.Color(4282863447L), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
