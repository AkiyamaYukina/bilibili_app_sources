package com.bilibili.playerbizcommonv2.videomentioned;

import Di0.C1602f;
import android.content.Context;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.s5;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.J;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommonv2.videomentioned.g;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.mineV2.ui.menuGroups.MineNormalModuleGroupKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/y.class */
@StabilityInferred(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<g> f82062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<? extends f> f82063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<e> f82065d = SharedFlowKt.MutableSharedFlow$default(1, 1, (BufferOverflow) null, 4, (Object) null);

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull StateFlow<? extends g> stateFlow, @NotNull StateFlow<? extends f> stateFlow2, boolean z6) {
        this.f82062a = stateFlow;
        this.f82063b = stateFlow2;
        this.f82064c = z6;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final <E extends UIComponent.ViewEntry, F extends UIComponent.ViewEntry> void a(B<E, F> b7, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2089959924);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(b7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089959924, i9, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.Content (VideoMentionedDialogComponent.kt:97)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-956550340, true, new com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.w(this, 1, b7, SnapshotStateKt.collectAsState(this.f82063b, null, composerStartRestartGroup, 0, 1)), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J(i7, 1, this, b7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0264  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry, F extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry> void b(com.bilibili.playerbizcommonv2.videomentioned.B<E, F> r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.videomentioned.y.b(com.bilibili.playerbizcommonv2.videomentioned.B, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry, F extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry> void c(com.bilibili.playerbizcommonv2.videomentioned.B<E, F> r28, final boolean r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.videomentioned.y.c(com.bilibili.playerbizcommonv2.videomentioned.B, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1370570604);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1370570604, i8, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.Loading (VideoMentionedDialogComponent.kt:409)");
            }
            i(kntr.common.compose.res.b.a(composerStartRestartGroup), StringResources_androidKt.stringResource(2131841506, composerStartRestartGroup, 0), null, composerStartRestartGroup, 8 | ((i8 << 9) & 7168), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.videomentioned.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final y f82046a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82047b;

                {
                    this.f82046a = this;
                    this.f82047b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82047b | 1);
                    this.f82046a.d((Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e(Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1672494143);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1672494143, i8, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.NoData (VideoMentionedDialogComponent.kt:416)");
            }
            i(DrawablePainterKt.rememberDrawablePainter(AppCompatResources.getDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238754), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(2131841396, composerStartRestartGroup, 0), ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText3-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | ((i8 << 9) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7, i9) { // from class: com.bilibili.playerbizcommonv2.videomentioned.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f82048a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82049b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f82050c;

                {
                    this.f82048a = i9;
                    this.f82050c = this;
                    this.f82049b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = this.f82048a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i10) {
                        case 0:
                            ((y) this.f82050c).e(composer2, RecomposeScopeImplKt.updateChangedFlags(this.f82049b | 1));
                            break;
                        default:
                            MineNormalModuleGroupKt.n((Modifier) this.f82050c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f82049b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(final com.bilibili.playerbizcommonv2.videomentioned.B r15, final androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.videomentioned.y.f(com.bilibili.playerbizcommonv2.videomentioned.B, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void g(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2094771784);
        int i8 = i7 & 1;
        if (composerStartRestartGroup.shouldExecute(i8 != 0, i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2094771784, i7, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.SectionFooter (VideoMentionedDialogComponent.kt:302)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            DividerKt.m1691DivideroMI9zvI(null, biliTheme.getColors(composerStartRestartGroup, i9).getLine_regular-0d7_KjU(), Dp.m3880constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(37));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2186TextNvy7gAk(StringResources_androidKt.stringResource(2131841674, composerStartRestartGroup, 0), null, biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12(), composerStartRestartGroup, 0, 0, 131066);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(4, 6, composerStartRestartGroup, companion);
            IconKt.m2023Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_expand_line_500(composerStartRestartGroup, 6), "展开更多", SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(12)), biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.videomentioned.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final y f82042a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82043b;

                {
                    this.f82042a = this;
                    this.f82043b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82043b | 1);
                    this.f82042a.g((Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0255  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry, F extends com.bilibili.app.gemini.ui.UIComponent.ViewEntry> void h(final com.bilibili.playerbizcommonv2.videomentioned.B<E, F> r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.videomentioned.y.h(com.bilibili.playerbizcommonv2.videomentioned.B, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void i(final Painter painter, final String str, ColorFilter colorFilter, Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        ColorFilter colorFilter2;
        Composer composerStartRestartGroup = composer.startRestartGroup(694738381);
        if ((i7 & 6) == 0) {
            i9 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i11 = i9;
        if ((i7 & 48) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i10 = i11 | 384;
        } else {
            i10 = i11;
            if ((i7 & 384) == 0) {
                i10 = i11 | (composerStartRestartGroup.changed(colorFilter) ? 256 : 128);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (i12 != 0) {
                colorFilter = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694738381, i10, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.StateView (VideoMentionedDialogComponent.kt:429)");
            }
            final ColorFilter colorFilter3 = colorFilter;
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(963799941, true, new Function2(painter, colorFilter3, str) { // from class: com.bilibili.playerbizcommonv2.videomentioned.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Painter f82051a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ColorFilter f82052b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f82053c;

                {
                    this.f82051a = painter;
                    this.f82052b = colorFilter3;
                    this.f82053c = str;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(963799941, iIntValue, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.StateView.<anonymous> (VideoMentionedDialogComponent.kt:431)");
                        }
                        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        float f7 = 60;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, Dp.m3880constructorimpl(f7), 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(this.f82051a, (String) null, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, this.f82052b, composer2, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                        int i13 = BiliTheme.$stable;
                        TextKt.m2186TextNvy7gAk(this.f82053c, PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 13, null), biliTheme.getColors(composer2, i13).getText3-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composer2, i13).getT14(), composer2, 48, 0, 131064);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            colorFilter2 = colorFilter;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                colorFilter2 = colorFilter;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            colorFilter2 = colorFilter;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ColorFilter colorFilter4 = colorFilter2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, painter, str, colorFilter4, i7, i8) { // from class: com.bilibili.playerbizcommonv2.videomentioned.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final y f82054a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Painter f82055b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f82056c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ColorFilter f82057d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f82058e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f82059f;

                {
                    this.f82054a = this;
                    this.f82055b = painter;
                    this.f82056c = str;
                    this.f82057d = colorFilter4;
                    this.f82058e = i7;
                    this.f82059f = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82058e | 1);
                    ColorFilter colorFilter5 = this.f82057d;
                    int i13 = this.f82059f;
                    this.f82054a.i(this.f82055b, this.f82056c, colorFilter5, (Composer) obj, iUpdateChangedFlags, i13);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void j(@Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1714817045);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714817045, i8, -1, "com.bilibili.playerbizcommonv2.videomentioned.VideoMentionedDialogComponent.VideoMentionedContainer (VideoMentionedDialogComponent.kt:75)");
            }
            g gVar = (g) SnapshotStateKt.collectAsState(this.f82062a, null, composerStartRestartGroup, 0, 1).getValue();
            if (Intrinsics.areEqual(gVar, g.b.f82015a)) {
                composerStartRestartGroup.startReplaceGroup(-1773408978);
                d(composerStartRestartGroup, i8 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(gVar, g.c.f82016a)) {
                composerStartRestartGroup.startReplaceGroup(-1773322674);
                d(composerStartRestartGroup, i8 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (gVar instanceof g.d) {
                composerStartRestartGroup.startReplaceGroup(-1773227039);
                a(((g.d) gVar).f82017a, composerStartRestartGroup, (i8 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(gVar, g.a.f82014a)) {
                    throw s5.a(composerStartRestartGroup, 1328264576);
                }
                composerStartRestartGroup.startReplaceGroup(-1773130257);
                e(composerStartRestartGroup, i8 & 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.bplus.im.communication.widget.h(this, i7, 2));
        }
    }
}
