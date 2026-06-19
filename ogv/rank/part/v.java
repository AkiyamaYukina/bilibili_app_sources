package com.bilibili.ogv.rank.part;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/v.class */
public final class v implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f72125a;

    public v(q qVar) {
        this.f72125a = qVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(lazyItemScope) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-253424457, i7, -1, "kntr.common.komponent.itemComposableLike.<anonymous> (LazyLists.kt:12)");
            }
            q qVar = this.f72125a;
            composer.startReplaceGroup(1365407218);
            qVar.invoke(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
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
