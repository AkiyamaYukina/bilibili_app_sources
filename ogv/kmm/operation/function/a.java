package com.bilibili.ogv.kmm.operation.function;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/a.class */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.function.Function.b r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.function.a.a(com.bilibili.ogv.kmm.operation.function.Function$b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@Nullable final Modifier modifier, @NotNull final Function1 function1, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(72625745);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72625745, i9, -1, "com.bilibili.ogv.kmm.operation.function.CinemaFunctionUi (CinemaFunctionUi.kt:21)");
            }
            float f7 = 12;
            LazyDslKt.LazyRow(modifier, null, PaddingKt.m1338PaddingValuesa9UjIt4(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(10), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(6)), false, Arrangement.INSTANCE.m1303spacedByD5KLDUw(Dp.m3880constructorimpl(8), Alignment.Companion.getCenterHorizontally()), null, null, false, null, function1, composerStartRestartGroup, (i9 & 14) | 24576 | ((i9 << 24) & 1879048192), 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, function1) { // from class: ek0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f117326a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f117327b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f117328c;

                {
                    this.f117326a = modifier;
                    this.f117327b = function1;
                    this.f117328c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f117328c | 1);
                    com.bilibili.ogv.kmm.operation.function.a.b(this.f117326a, this.f117327b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
