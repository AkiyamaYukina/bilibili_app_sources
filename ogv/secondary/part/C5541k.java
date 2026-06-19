package com.bilibili.ogv.secondary.part;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.secondary.part.InterfaceC5531a;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/k.class */
public final class C5541k implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5531a f72850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.material3.pulltorefresh.t f72851b;

    public C5541k(InterfaceC5531a interfaceC5531a, androidx.compose.material3.pulltorefresh.t tVar) {
        this.f72850a = interfaceC5531a;
        this.f72851b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                ComposerKt.traceEventStart(-1772252534, i7, -1, "com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl.invoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateCategoryKomponent.kt:154)");
            }
            androidx.compose.material3.pulltorefresh.j.f41909a.a(this.f72851b, ((Boolean) ((InterfaceC5531a.c) this.f72850a).f72807b.getValue()).booleanValue(), boxScope.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0L, BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getBrand_pink-0d7_KjU(), 0.0f, composer, 0, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
