package com.bilibili.ogv.operation3.module.vcards3x2;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.switchit.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/c.class */
public final class c implements Function3<FlowRowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState<List<i>> f71459a;

    public c(MutableState<List<i>> mutableState) {
        this.f71459a = mutableState;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322928450, iIntValue, -1, "com.bilibili.ogv.operation3.module.vcards3x2.VCards3x2SupportModule.provide.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VCards3x2SupportModule.kt:113)");
            }
            for (i iVar : this.f71459a.getValue()) {
                iVar.f71439a.a(C8013d.a(SizeKt.fillMaxWidth(Modifier.Companion, 0.32f), iVar.f71440b), 0.0f, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
