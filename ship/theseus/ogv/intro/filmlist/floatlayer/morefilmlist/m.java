package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import Di0.C1602f;
import Eu0.n;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.P0;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.ContextCompat;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/m.class */
public final class m {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final String str, final float f7, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1925462594);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1925462594, i10, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.MoreFilmListTitleInLayer (OgvMoreFilmsUi.kt:38)");
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
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(40)), f7, 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getCenterStart());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            n.e(RowScopeInstance.INSTANCE.weight(companion, 1.0f, false), android.support.v4.media.a.a("《", str, "》"), composerStartRestartGroup, ContextCompat.getColor((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R$color.Text1), 6);
            String strStringResource = StringResources_androidKt.stringResource(2131854824, composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(100), 0.0f, 11, null), biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT14b(), composerStartRestartGroup, 48, 48, 63480);
            composerStartRestartGroup.endNode();
            IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getXmark_close_line_500(composerStartRestartGroup, 6), (String) null, ClickableKt.m1186clickableoSLSa3U$default(boxScopeInstance.align(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(20)), companion2.getCenterEnd()), false, null, null, null, function0, 15, null), biliTheme.getColors(composerStartRestartGroup, i11).getGa7-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup.endNode();
            DividerKt.m1691DivideroMI9zvI(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl((float) 0.5d)), biliTheme.getColors(composerStartRestartGroup, i11).getLine_regular-0d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, f7, function0, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92811a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f92812b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f92813c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f92814d;

                {
                    this.f92811a = str;
                    this.f92812b = f7;
                    this.f92813c = function0;
                    this.f92814d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92814d | 1);
                    m.a(this.f92811a, this.f92812b, this.f92813c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@NotNull final String str, final float f7, @Nullable final Modifier modifier, @NotNull final Function0 function0, @NotNull final ComposableLambda composableLambda, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1164901675);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(composableLambda) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, 1 & i12)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1164901675, i12, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsUi (OgvMoreFilmsUi.kt:24)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            a(str, f7, function0, composerStartRestartGroup, (i12 & SearchBangumiItem.TYPE_FULLNET_MOVIE) | ((i12 >> 3) & 896));
            if (P0.b((i12 >> 12) & 14, composerStartRestartGroup, composableLambda)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, f7, modifier, function0, composableLambda, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92805a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f92806b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f92807c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f92808d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final ComposableLambda f92809e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f92810f;

                {
                    this.f92805a = str;
                    this.f92806b = f7;
                    this.f92807c = modifier;
                    this.f92808d = function0;
                    this.f92809e = composableLambda;
                    this.f92810f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92810f | 1);
                    Function0 function02 = this.f92808d;
                    ComposableLambda composableLambda2 = this.f92809e;
                    m.b(this.f92805a, this.f92806b, this.f92807c, function02, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
