package com.bilibili.ogv.operation2;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation2.inlinevideo.r;
import com.bilibili.ogv.operation2.inlinevideo.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/p.class */
public final class p implements com.bilibili.ogv.kmm.operation.inlinevideo.h {
    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.h
    public final com.bilibili.ogv.kmm.operation.inlinevideo.n a() {
        return new s();
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.h
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(com.bilibili.ogv.kmm.operation.inlinevideo.k kVar, Function0<Unit> function0, Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(-829319792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829319792, i7, -1, "com.bilibili.ogv.operation2.InlineVideoComponentModule.provide.<no name provided>.Content (InlineVideoComponentModule.kt:25)");
        }
        r.f(kVar, function0, modifier, composer, i7 & 1022, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
