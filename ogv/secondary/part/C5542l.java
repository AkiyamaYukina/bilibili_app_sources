package com.bilibili.ogv.secondary.part;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/l.class */
public final class C5542l implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Unit> f72852a;

    public C5542l(UiComposableLike<Unit> uiComposableLike) {
        this.f72852a = uiComposableLike;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963139881, iIntValue, -1, "com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl.invoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateCategoryKomponent.kt:163)");
            }
            this.f72852a.invoke(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
