package com.bilibili.playset.detail.widget;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt.class */
public final class StaggeredMixedLayoutKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final com.bilibili.playset.detail.data.h hVar, @NotNull final Function1 function1, @NotNull final LazyGridState lazyGridState, @Nullable Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207683946);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(hVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(lazyGridState) ? 256 : 128);
        }
        int i11 = i10 | 3072;
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207683946, i11, -1, "com.bilibili.playset.detail.widget.StaggeredMixedLayout (StaggeredMixedLayout.kt:43)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(715726956, true, new Function3(lazyGridState, hVar, function1) { // from class: com.bilibili.playset.detail.widget.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84583a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LazyGridState f84584b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f84585c;

                {
                    this.f84583a = hVar;
                    this.f84584b = lazyGridState;
                    this.f84585c = function1;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0293  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
                    /*
                        Method dump skipped, instruction units count: 721
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.widget.C.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            modifier = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(hVar, function1, lazyGridState, modifier2, i7) { // from class: com.bilibili.playset.detail.widget.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84588a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f84589b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LazyGridState f84590c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f84591d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f84592e;

                {
                    this.f84588a = hVar;
                    this.f84589b = function1;
                    this.f84590c = lazyGridState;
                    this.f84591d = modifier2;
                    this.f84592e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84592e | 1);
                    LazyGridState lazyGridState2 = this.f84590c;
                    Modifier modifier3 = this.f84591d;
                    StaggeredMixedLayoutKt.a(this.f84588a, this.f84589b, lazyGridState2, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.foundation.lazy.grid.LazyGridState r9, final java.lang.Object r10, final int r11, final kotlin.jvm.functions.Function1 r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.widget.StaggeredMixedLayoutKt.b(androidx.compose.foundation.lazy.grid.LazyGridState, java.lang.Object, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.lazy.grid.LazyGridState r8, final java.lang.Object r9, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r10, androidx.compose.runtime.Composer r11, final int r12) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.widget.StaggeredMixedLayoutKt.c(androidx.compose.foundation.lazy.grid.LazyGridState, java.lang.Object, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
