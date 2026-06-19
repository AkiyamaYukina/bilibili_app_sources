package com.bilibili.ship.theseus.united.player.mediaplay.network;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I0;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.M0;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import kntr.base.localization.Locale;
import kntr.base.localization.Localization;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/k.class */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.runtime.Composer r7, final int r8, final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.k.a(androidx.compose.runtime.Composer, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bf  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.bilibili.ship.theseus.united.player.mediaplay.network.d.c r26, final boolean r27, final boolean r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.k.b(com.bilibili.ship.theseus.united.player.mediaplay.network.d$c, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-265916110);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-265916110, i8, -1, "com.bilibili.ship.theseus.united.player.mediaplay.network.CloseButton (NetworkLimitedComponent.kt:129)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(2131235863, composerStartRestartGroup, 0), "关闭详情页", modifier, (Alignment) null, ContentScale.Companion.getInside(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624 | ((i8 << 6) & 896), 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, i7) { // from class: com.bilibili.ship.theseus.united.player.mediaplay.network.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f104571a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f104572b;

                {
                    this.f104571a = modifier;
                    this.f104572b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f104572b | 1);
                    k.c(this.f104571a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final d.c cVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1258688026);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1258688026, i9, -1, "com.bilibili.ship.theseus.united.player.mediaplay.network.Content (NetworkLimitedComponent.kt:162)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion.getStart(), composerStartRestartGroup, 6);
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
            if (cVar.f104557b.b()) {
                composerStartRestartGroup.startReplaceGroup(-1870322561);
                Modifier.Companion companion3 = Modifier.Companion;
                ImageKt.Image(PainterResources_androidKt.painterResource(2131240889, composerStartRestartGroup, 0), "", columnScopeInstance.align(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(30)), companion.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                I0.a(12, 6, composerStartRestartGroup, companion3);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1869977562);
                composerStartRestartGroup.endReplaceGroup();
            }
            d.a aVar = cVar.f104556a;
            String str = aVar.f104543c;
            Modifier.Companion companion4 = Modifier.Companion;
            TextKt.m1772Text4IGK_g(str, columnScopeInstance.align(companion4, companion.getCenterHorizontally()), ColorResources_androidKt.colorResource(R$color.Ga3_u, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            float f7 = 16;
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion4, Dp.m3880constructorimpl(f7)), composerStartRestartGroup, 6);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object objValueOf = objRememberedValue2;
            if (objRememberedValue2 == companion5.getEmpty()) {
                objValueOf = Boolean.valueOf(kntr.base.localization.q.c((Locale) Localization.INSTANCE.getLocaleFlow().getValue()));
                composerStartRestartGroup.updateRememberedValue(objValueOf);
            }
            if (((Boolean) objValueOf).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1869461846);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion.getTop(), composerStartRestartGroup, 6);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                b(cVar, false, ((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup, (i9 & 14) | 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1869201601);
                Modifier modifierWidth = IntrinsicKt.width(SizeKt.m1379widthInVpY3zN4$default(PaddingKt.m1344paddingVpY3zN4$default(columnScopeInstance.align(companion4, companion.getCenterHorizontally()), Dp.m3880constructorimpl(24), 0.0f, 2, null), Dp.m3880constructorimpl(cVar.f104557b.getMinWidth()), 0.0f, 2, null), IntrinsicSize.Max);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
                O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                b(cVar, true, ((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup, (i9 & 14) | 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            String str2 = aVar.f104546f;
            boolean z6 = aVar.f104541a;
            if (z6 || !StringsKt.isBlank(str2)) {
                SpacerKt.Spacer(M0.a(f7, -1868742491, composerStartRestartGroup, companion4), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1868680026);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierAlign = columnScopeInstance.align(companion4, companion.getCenterHorizontally());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            O4.d.c(companion2, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-229617638);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Object bVar = objRememberedValue3;
                if (objRememberedValue3 == companion5.getEmpty()) {
                    bVar = new CN.b(mutableState, 3);
                    composerStartRestartGroup.updateRememberedValue(bVar);
                }
                Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) bVar, 15, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
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
                ImageKt.Image(((Boolean) mutableState.getValue()).booleanValue() ? Mb.d.a(composerStartRestartGroup, -1426395947, 2131235859, composerStartRestartGroup, 0) : Mb.d.a(composerStartRestartGroup, -1426251053, 2131235861, composerStartRestartGroup, 0), "勾选是否提醒", RowScopeInstance.INSTANCE.align(SizeKt.m1372size3ABfNKs(companion4, Dp.m3880constructorimpl(12)), companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                J.a(4, 6, composerStartRestartGroup, companion4);
                TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131841444, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(R$color.Ga5_u, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-228566304);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (StringsKt.isBlank(str2)) {
                composerStartRestartGroup.startReplaceGroup(-228192320);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-228482976);
                TextKt.m1772Text4IGK_g(aVar.f104546f, (Modifier) null, ColorResources_androidKt.colorResource(R$color.Ga5_u, composerStartRestartGroup, 0), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120818);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(cVar, modifier, i7) { // from class: com.bilibili.ship.theseus.united.player.mediaplay.network.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.c f104565a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f104566b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f104567c;

                {
                    this.f104565a = cVar;
                    this.f104566b = modifier;
                    this.f104567c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f104567c | 1);
                    k.d(this.f104565a, this.f104566b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final Modifier modifier, final Function1 function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-908033730);
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
                ComposerKt.traceEventStart(-908033730, i9, -1, "com.bilibili.ship.theseus.united.player.mediaplay.network.CoverBlurView (NetworkLimitedComponent.kt:157)");
            }
            AndroidView_androidKt.AndroidView(function1, modifier, null, composerStartRestartGroup, ((i9 >> 3) & 14) | ((i9 << 3) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, function1) { // from class: com.bilibili.ship.theseus.united.player.mediaplay.network.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f104573a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f104574b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f104575c;

                {
                    this.f104573a = modifier;
                    this.f104574b = function1;
                    this.f104575c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f104575c | 1);
                    k.e(this.f104573a, this.f104574b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.player.mediaplay.network.d.c r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.k.f(com.bilibili.ship.theseus.united.player.mediaplay.network.d$c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
