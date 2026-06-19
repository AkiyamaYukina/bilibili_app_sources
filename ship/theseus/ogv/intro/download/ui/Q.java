package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.s5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ship.theseus.ogv.intro.download.ui.e0;
import kntr.base.captcha.CaptchaPageKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/Q.class */
public final class Q {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x054a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r26, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r27, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadItemStyle r28, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.download.ui.e0 r29, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.Q.a(boolean, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadItemStyle, com.bilibili.ship.theseus.ogv.intro.download.ui.e0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final e0 e0Var, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) throws NoWhenBranchMatchedException {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1275157734);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(e0Var) : composerStartRestartGroup.changedInstance(e0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275157734, i9, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadStateUI (DownloadItemUI.kt:121)");
            }
            if (Intrinsics.areEqual(e0Var, e0.a.f92550a)) {
                composerStartRestartGroup.startReplaceGroup(761832358);
                ImageKt.Image(Ij0.c.a(2131236766, composerStartRestartGroup, 0), "", modifier, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i9 << 3) & 896), 120);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(e0Var, e0.b.f92551a)) {
                composerStartRestartGroup.startReplaceGroup(762120937);
                ImageKt.Image(Ij0.c.a(2131236767, composerStartRestartGroup, 0), "", modifier, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i9 << 3) & 896), 120);
                composerStartRestartGroup.endReplaceGroup();
            } else if (e0Var instanceof e0.c) {
                composerStartRestartGroup.startReplaceGroup(762427713);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i10 = BiliTheme.$stable;
                ProgressIndicatorKt.m1727CircularProgressIndicatorDUhRLBM(((e0.c) e0Var).f92552a / 100.0f, modifier, biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU(), Dp.m3880constructorimpl(2), biliTheme.getColors(composerStartRestartGroup, i10).getGa3-0d7_KjU(), StrokeCap.Companion.m2808getRoundKaPHkGw(), composerStartRestartGroup, (i9 & 112) | 3072, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(e0Var, e0.e.f92554a)) {
                composerStartRestartGroup.startReplaceGroup(762794629);
                ImageKt.Image(Ij0.c.a(2131242839, composerStartRestartGroup, 0), "", modifier, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | ((i9 << 3) & 896), 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(e0Var, e0.d.f92553a)) {
                    throw s5.a(composerStartRestartGroup, -1360898902);
                }
                composerStartRestartGroup.startReplaceGroup(763044582);
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
            final int i11 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i11, e0Var, modifier) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.P

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f92495a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f92496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f92497c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f92498d;

                {
                    this.f92495a = i11;
                    this.f92497c = e0Var;
                    this.f92498d = modifier;
                    this.f92496b = i7;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i12 = this.f92495a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            Q.b((e0) this.f92497c, (Modifier) this.f92498d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f92496b | 1));
                            break;
                        default:
                            CaptchaPageKt.b((String) this.f92497c, (String) this.f92498d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f92496b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.Modifier r7, androidx.compose.runtime.Composer r8, final int r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.Q.c(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
