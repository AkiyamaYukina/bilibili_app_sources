package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/g.class */
public final class g implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State<UiComposableLike<Unit>> f68587a;

    public g(State<? extends UiComposableLike<Unit>> state) {
        this.f68587a = state;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(953813119, iIntValue, -1, "com.bilibili.ogv.kmm.operation.page.PageModel.komponent.<anonymous>.<anonymous>.<anonymous> (PageModel.kt:236)");
            }
            this.f68587a.getValue().invoke(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
