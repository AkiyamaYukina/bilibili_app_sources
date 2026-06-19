package com.bilibili.ogv.rank;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.systemui.StatusBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/Q.class */
public final class Q implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Unit> f71885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f71886b;

    public Q(Modifier modifier, UiComposableLike uiComposableLike) {
        this.f71885a = uiComposableLike;
        this.f71886b = modifier;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197810296, iIntValue, -1, "com.bilibili.ogv.rank.RankComponent.entry.<anonymous>.<anonymous>.<anonymous> (RankComponent.kt:52)");
            }
            this.f71885a.invoke(BackgroundKt.m1169backgroundbw27NRU$default(StatusBarKt.statusBarDarkIcons(this.f71886b, Boolean.FALSE), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
