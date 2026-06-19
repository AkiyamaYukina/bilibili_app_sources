package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.pulltorefresh.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/f.class */
public final class f implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f68585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68586b;

    public f(t tVar, boolean z6) {
        this.f68585a = tVar;
        this.f68586b = z6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope boxScope = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(boxScope) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1124652576, i7, -1, "com.bilibili.ogv.kmm.operation.page.PageModel.komponent.<anonymous>.<anonymous>.<anonymous> (PageModel.kt:228)");
            }
            androidx.compose.material3.pulltorefresh.j.f41909a.a(this.f68585a, this.f68586b, boxScope.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0L, BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getBrand_pink-0d7_KjU(), 0.0f, composer, 0, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
