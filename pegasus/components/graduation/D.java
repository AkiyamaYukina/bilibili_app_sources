package com.bilibili.pegasus.components.graduation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/D.class */
public final class D {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-280257253);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-280257253, i7, -1, "com.bilibili.pegasus.components.graduation.FlipTransitionBlackPlaceholder (GraduationSeasonFlipEnterOverlayController.kt:165)");
            }
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m2655getBlack0d7_KjU(), null, 2, null), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.pegasus.components.graduation.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f75969a;

                {
                    this.f75969a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    D.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f75969a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0<kotlin.Unit> r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.D.b(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
