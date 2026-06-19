package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import Di0.C1602f;
import Eu0.n;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.colorspace.r;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.analytics.C4679v;
import com.bapis.bilibili.app.viewunite.v1.Q;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/d.class */
public final class d {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, Composer composer, final String str, final Function0 function0, final Function0 function02, final boolean z6) {
        int i8;
        Painter star_favorite_line_500;
        Composer composerStartRestartGroup = composer.startRestartGroup(831024937);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831024937, i11, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.AllFilmTitle (OgvAllFilmUi.kt:49)");
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
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(40)), Dp.m3880constructorimpl(12), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1346paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m3880constructorimpl(70), 0.0f, 11, null), biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14b(), composerStartRestartGroup, i11 & 14, 3120, 55288);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(897319385);
                star_favorite_line_500 = BiliIconfont.INSTANCE.getStar_favorite_fill_500(composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(897320697);
                star_favorite_line_500 = BiliIconfont.INSTANCE.getStar_favorite_line_500(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            float f7 = 20;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7)), false, null, null, null, function0, 15, null);
            long jA = z6 ? C4679v.a(composerStartRestartGroup, 897328845, biliTheme, composerStartRestartGroup, i12) : Q.a(composerStartRestartGroup, 897329896, biliTheme, composerStartRestartGroup, i12);
            int i13 = Painter.$stable | 48;
            IconKt.m1714Iconww6aTOc(star_favorite_line_500, (String) null, modifierM1186clickableoSLSa3U$default, jA, composerStartRestartGroup, i13, 0);
            IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getXmark_close_line_500(composerStartRestartGroup, 6), (String) null, ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(f7)), false, null, null, null, function02, 15, null), biliTheme.getColors(composerStartRestartGroup, i12).getGa7-0d7_KjU(), composerStartRestartGroup, i13, 0);
            composerStartRestartGroup.endNode();
            DividerKt.m1691DivideroMI9zvI(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl((float) 0.5d)), biliTheme.getColors(composerStartRestartGroup, i12).getLine_regular-0d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, str, function0, function02, z6) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92732a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f92733b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f92734c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f92735d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f92736e;

                {
                    this.f92732a = str;
                    this.f92733b = z6;
                    this.f92734c = function0;
                    this.f92735d = function02;
                    this.f92736e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d.a(RecomposeScopeImplKt.updateChangedFlags(this.f92736e | 1), (Composer) obj, this.f92732a, this.f92734c, this.f92735d, this.f92733b);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final FilmInLayer filmInLayer, @NotNull final ExposureEntry exposureEntry, final boolean z6, @Nullable final Modifier modifier, @NotNull final Function0 function0, @NotNull final Function0 function02, @Nullable Composer composer, final int i7) {
        int i8;
        Painter heart_collect2_line_500;
        Composer composerStartRestartGroup = composer.startRestartGroup(2133702327);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(filmInLayer) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(exposureEntry) : composerStartRestartGroup.changedInstance(exposureEntry) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if ((i7 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i11) != 74898, 1 & i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133702327, i11, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.FilmUi (OgvAllFilmUi.kt:105)");
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(modifier, exposureEntry), false, null, null, null, function02, 15, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            n.b(384, composerStartRestartGroup, SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion3, Dp.m3880constructorimpl(78)), Dp.m3880constructorimpl(104)), filmInLayer.f92686c, filmInLayer.f92689f);
            J.a(10, 6, composerStartRestartGroup, companion3);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            long j7 = biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU();
            TextStyle t14b = biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14b();
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(9), 0.0f, 0.0f, 13, null);
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m1772Text4IGK_g(filmInLayer.f92685b, modifierM1346paddingqDBjuR0$default, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t14b, composerStartRestartGroup, 48, 3120, 55288);
            if (StringsKt.isBlank(filmInLayer.f92691i)) {
                composerStartRestartGroup.startReplaceGroup(1026160433);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1025874582);
                TextKt.m1772Text4IGK_g(filmInLayer.f92691i, PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(4), 0.0f, 0.0f, 13, null), biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT12(), composerStartRestartGroup, 48, 48, 63480);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (StringsKt.isBlank(filmInLayer.f92690g)) {
                composerStartRestartGroup.startReplaceGroup(1026740753);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1026239638);
                TextKt.m1772Text4IGK_g(filmInLayer.f92690g, PaddingKt.m1343paddingVpY3zN4(H.a(2, PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 13, null), biliTheme.getColors(composerStartRestartGroup, i12).getOperate_orange_thin-0d7_KjU()), Dp.m3880constructorimpl(4), Dp.m3880constructorimpl((float) 0.5d)), biliTheme.getColors(composerStartRestartGroup, i12).getOperate_orange-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT10(), composerStartRestartGroup, 0, 48, 63480);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = filmInLayer.h;
            if (StringsKt.isBlank(str)) {
                composerStartRestartGroup.startReplaceGroup(1027148465);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1026811681);
                TextKt.m1772Text4IGK_g("“" + str, PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(40), 0.0f, 9, null), biliTheme.getColors(composerStartRestartGroup, i12).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT12(), composerStartRestartGroup, 48, 3120, 55288);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1609857678);
                heart_collect2_line_500 = BiliIconfont.INSTANCE.getHeart_collect2_fill_500(composerStartRestartGroup, 6);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1609856334);
                heart_collect2_line_500 = BiliIconfont.INSTANCE.getHeart_collect2_line_500(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            IconKt.m1714Iconww6aTOc(heart_collect2_line_500, (String) null, ClickableKt.m1186clickableoSLSa3U$default(rowScopeInstance.align(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(24)), companion.getCenterVertically()), false, null, null, null, function0, 15, null), z6 ? Q.a(composerStartRestartGroup, -1609847296, biliTheme, composerStartRestartGroup, i12) : r.b(composerStartRestartGroup, -1609846400, biliTheme, composerStartRestartGroup, i12), composerStartRestartGroup, Painter.$stable | 48, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composerStartRestartGroup = composerStartRestartGroup;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(filmInLayer, exposureEntry, z6, modifier, function0, function02, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FilmInLayer f92718a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ExposureEntry f92719b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f92720c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f92721d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f92722e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f92723f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f92724g;

                {
                    this.f92718a = filmInLayer;
                    this.f92719b = exposureEntry;
                    this.f92720c = z6;
                    this.f92721d = modifier;
                    this.f92722e = function0;
                    this.f92723f = function02;
                    this.f92724g = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92724g | 1);
                    FilmInLayer filmInLayer2 = this.f92718a;
                    Function0 function03 = this.f92722e;
                    Function0 function04 = this.f92723f;
                    d.b(filmInLayer2, this.f92719b, this.f92720c, this.f92721d, function03, function04, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final String str, final boolean z6, @NotNull final Function0 function0, @NotNull final Function0 function02, @NotNull final Function1 function1, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1322847441);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
        }
        int i11 = i10;
        if ((i7 & 24576) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192);
        }
        int i12 = i11;
        if ((196608 & i7) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 131072 : 65536);
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, 1 & i12)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1322847441, i12, -1, "com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmUi (OgvAllFilmUi.kt:25)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
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
            a(((i12 << 3) & 7168) | (i12 & SearchBangumiItem.TYPE_FULLNET_MOVIE) | ((i12 >> 3) & 896), composerStartRestartGroup, str, function02, function0, z6);
            float f7 = 12;
            LazyDslKt.LazyColumn(null, null, PaddingKt.m1335PaddingValues0680j_4(Dp.m3880constructorimpl(f7)), false, arrangement.m1302spacedBy0680j_4(Dp.m3880constructorimpl(f7)), null, null, false, null, function1, composerStartRestartGroup, ((i12 << 15) & 1879048192) | 24960, 491);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, z6, function0, function02, function1, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92725a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f92726b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f92727c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f92728d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function1 f92729e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Modifier f92730f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f92731g;

                {
                    this.f92725a = str;
                    this.f92726b = z6;
                    this.f92727c = function0;
                    this.f92728d = function02;
                    this.f92729e = function1;
                    this.f92730f = modifier;
                    this.f92731g = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92731g | 1);
                    Function1 function12 = this.f92729e;
                    Modifier modifier2 = this.f92730f;
                    d.c(this.f92725a, this.f92726b, this.f92727c, this.f92728d, function12, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
