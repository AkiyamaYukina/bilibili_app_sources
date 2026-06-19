package com.bilibili.ogv.operation.entrance.filmlist;

import Di0.C1602f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/e.class */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04e2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.operation.entrance.filmlist.p r27, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r28, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 1435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.filmlist.e.a(com.bilibili.ogv.operation.entrance.filmlist.p, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(8594370);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, 1 & i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(8594370, i8, -1, "com.bilibili.ogv.operation.entrance.filmlist.PopupContent (FilmListHead.kt:156)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f7 = 34;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
            float f8 = 6;
            Modifier modifierAlign = columnScopeInstance.align(SizeKt.m1374sizeVpY3zN4(companion3, fM3880constructorimpl, Dp.m3880constructorimpl(f8)), companion.getEnd());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterA = Ij0.c.a(2131242010, composerStartRestartGroup, 0);
            float f9 = 14;
            Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(companion3, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f8));
            int i9 = Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD;
            ImageKt.Image(painterA, "guidePopArrow", modifierM1374sizeVpY3zN4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i9, 120);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion3, Dp.m3880constructorimpl(20)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(companion3, Dp.m3880constructorimpl(f7));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(H.a(17, modifierM1358height3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i10).getGraph_white-0d7_KjU()), Dp.m3880constructorimpl(50), 0.0f, Dp.m3880constructorimpl(f9), 0.0f, 10, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl4 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            TextKt.m2186TextNvy7gAk(StringResources_androidKt.stringResource(2131838831, composerStartRestartGroup, 0), boxScopeInstance.align(SizeKt.wrapContentSize$default(companion3, null, false, 3, null), companion.getCenterEnd()), ColorResources_androidKt.colorResource(R$color.Ga10_u, composerStartRestartGroup, 0), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT13(), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m1374sizeVpY3zN4(companion3, Dp.m3880constructorimpl(46), Dp.m3880constructorimpl(44)), companion.getBottomStart());
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign2);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl5 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl5, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl5, currentCompositionLocalMap5);
            Updater.m2304setimpl(composerM2296constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl5, Integer.valueOf(iHashCode5), composerM2296constructorimpl5));
            J.a(4, 6, composerStartRestartGroup, companion3);
            ImageKt.Image(Ij0.c.a(2131242011, composerStartRestartGroup, 0), "guidancePopImage", SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(42)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i9, 120);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, i7) { // from class: com.bilibili.ogv.operation.entrance.filmlist.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f70038a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f70039b;

                {
                    this.f70038a = modifier;
                    this.f70039b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f70039b | 1);
                    e.b(this.f70038a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
