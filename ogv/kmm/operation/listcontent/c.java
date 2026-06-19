package com.bilibili.ogv.kmm.operation.listcontent;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.kmm.operation.page.MoreLoadingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import mk0.C8007c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/c.class */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerLoadUiService f68547a;

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1890496077, iIntValue, -1, "com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PerLoadUiService.kt:153)");
            }
            C8007c.a((MoreLoadingState) this.f68547a.f68539n.getValue(), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
