package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import nl0.C8106C;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/o.class */
public final /* synthetic */ class C5545o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.operablecard.a f72873a;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(modifier) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32967190, i7, -1, "com.bilibili.ogv.secondary.part.CreateCommonFeedKomponent.invoke.<anonymous>.<anonymous> (CreateCommonFeedKomponent.kt:22)");
            }
            C8106C.j(2, ((i7 << 3) & 112) | 384, 0, composer, modifier, this.f72873a.f71392b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
