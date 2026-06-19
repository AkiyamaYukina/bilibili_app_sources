package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/f.class */
public final class f {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable final Modifier modifier, @NotNull final Function0 function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1269043677);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1269043677, i9, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsError (OgvAllFilmsError.kt:16)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(40)), Dp.m3880constructorimpl(12), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Painter xmark_close_line_500 = BiliIconfont.INSTANCE.getXmark_close_line_500(composerStartRestartGroup, 6);
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(20)), false, null, null, null, function0, 15, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            IconKt.m1714Iconww6aTOc(xmark_close_line_500, (String) null, modifierM1186clickableoSLSa3U$default, biliTheme.getColors(composerStartRestartGroup, i10).getGa7-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup.endNode();
            DividerKt.m1691DivideroMI9zvI(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl((float) 0.5d)), biliTheme.getColors(composerStartRestartGroup, i10).getLine_regular-0d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
            Fu0.c.a(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, function0) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f92737a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f92738b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f92739c;

                {
                    this.f92737a = modifier;
                    this.f92738b = function0;
                    this.f92739c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92739c | 1);
                    f.a(this.f92737a, this.f92738b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
