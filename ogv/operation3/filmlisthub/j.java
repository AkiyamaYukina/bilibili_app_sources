package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/j.class */
public final class j implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike f71110a;

    public j(UiComposableLike uiComposableLike) {
        this.f71110a = uiComposableLike;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(lazyItemScope) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 131) != 130, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694940242, i7, -1, "kntr.common.komponent.stickyHeaderComposableLike.<anonymous> (LazyLists.kt:60)");
            }
            composer.startReplaceGroup(-105083606);
            this.f71110a.invoke(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
