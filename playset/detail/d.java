package com.bilibili.playset.detail;

import F3.P4;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.playset.detail.compose.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<l> f84450a = CompositionLocalKt.compositionLocalOf$default(null, new P4(9), 1, null);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(int i7, @Nullable Composer composer, @NotNull com.bilibili.playset.detail.data.h hVar, @NotNull Function0 function0, @NotNull Function1 function1) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1986208030);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(hVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986208030, i10, -1, "com.bilibili.playset.detail.MultiTypeListDetailContent (MultiTypeListDetailContent.kt:60)");
            }
            l lVar = (l) composerStartRestartGroup.consume(f84450a);
            if (lVar.f84575a || lVar.f84576b) {
                composerStartRestartGroup.startReplaceGroup(641275075);
                N.d(i10 & 1022, composerStartRestartGroup, hVar, function0, function1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(641436709);
                N.f(i10 & 1022, composerStartRestartGroup, hVar, function0, function1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i7, 0, hVar, function1, function0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void b(final boolean z6, final boolean z7, final boolean z8, final boolean z9, @NotNull final ComposableLambda composableLambda, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(707768758);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z8) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(z9) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(composableLambda) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(707768758, i12, -1, "com.bilibili.playset.detail.PaneStyleProvider (MultiTypeListDetailContent.kt:41)");
            }
            CompositionLocalKt.CompositionLocalProvider(f84450a.provides(new l(z6, z7, z8, z9)), ComposableLambdaKt.rememberComposableLambda(-453089674, true, new NQ.c(composableLambda, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(z6, z7, z8, z9, composableLambda, i7) { // from class: com.bilibili.playset.detail.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f84291a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f84292b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f84293c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f84294d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final ComposableLambda f84295e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f84296f;

                {
                    this.f84291a = z6;
                    this.f84292b = z7;
                    this.f84293c = z8;
                    this.f84294d = z9;
                    this.f84295e = composableLambda;
                    this.f84296f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84296f | 1);
                    boolean z10 = this.f84294d;
                    ComposableLambda composableLambda2 = this.f84295e;
                    d.b(this.f84291a, this.f84292b, this.f84293c, z10, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
