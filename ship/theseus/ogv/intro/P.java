package com.bilibili.ship.theseus.ogv.intro;

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
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.iconfont.BiliIconfontKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/P.class */
@StabilityInferred(parameters = 0)
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeasonInfo f92256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f92257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bplus.im.pblink.g f92258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f92259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f92260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92261f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/P$a.class */
    @Stable
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableState f92262a = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f92263b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final MutableState f92264c = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MutableState f92265d = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final MutableState f92266e = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public P(@NotNull OgvSeasonInfo ogvSeasonInfo, @NotNull a aVar, @NotNull com.bilibili.bplus.im.pblink.g gVar, @NotNull ExposureEntry exposureEntry, boolean z6, boolean z7) {
        this.f92256a = ogvSeasonInfo;
        this.f92257b = aVar;
        this.f92258c = gVar;
        this.f92259d = exposureEntry;
        this.f92260e = z6;
        this.f92261f = z7;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1988788780);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988788780, i9, -1, "com.bilibili.ship.theseus.ogv.intro.OgvSeasonInfoUi.Content (OgvSeasonInfoUi.kt:33)");
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
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            ThemeDayNight dayNightTheme = biliTheme.getDayNightTheme(composerStartRestartGroup, i10);
            ThemeDayNight themeDayNight = ThemeDayNight.Night;
            OgvSeasonInfo ogvSeasonInfo = this.f92256a;
            Integer num = dayNightTheme == themeDayNight ? ogvSeasonInfo.f92253g : ogvSeasonInfo.f92252f;
            long jM2665getUnspecified0d7_KjU = num == null ? Color.Companion.m2665getUnspecified0d7_KjU() : ColorKt.Color(num.intValue());
            Integer num2 = biliTheme.getDayNightTheme(composerStartRestartGroup, i10) == themeDayNight ? ogvSeasonInfo.f92251e : ogvSeasonInfo.f92250d;
            long jM2665getUnspecified0d7_KjU2 = num2 == null ? Color.Companion.m2665getUnspecified0d7_KjU() : ColorKt.Color(num2.intValue());
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, null, null, this.f92258c, 15, null);
            int i11 = ExposureEntry.$stable;
            c(((i9 << 6) & 7168) | (i11 << 9), jM2665getUnspecified0d7_KjU, jM2665getUnspecified0d7_KjU2, composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
            b(PaddingKt.m1346paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(46), 0.0f, 9, null), composerStartRestartGroup, (i11 << 3) | (i9 & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.M

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f92233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f92234b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f92235c;

                {
                    this.f92233a = this;
                    this.f92234b = modifier;
                    this.f92235c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92235c | 1);
                    this.f92233a.a(this.f92234b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.P.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final int i7, final long j7, final long j8, Composer composer, final Modifier modifier) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248326575);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(j8) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | ((i7 & 4096) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248326575, i11, -1, "com.bilibili.ship.theseus.ogv.intro.OgvSeasonInfoUi.SeasonInfoContent (OgvSeasonInfoUi.kt:58)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            OgvSeasonInfo ogvSeasonInfo = this.f92256a;
            Painter painterRememberIconFontPainter = BiliIconfontKt.rememberIconFontPainter(ogvSeasonInfo.a().f93586c, composerStartRestartGroup, 0);
            String str = ogvSeasonInfo.a().f93585b;
            int i12 = Painter.$stable;
            int i13 = i12 | ((i11 << 6) & 896) | (ExposureEntry.$stable << 12) | ((i11 << 3) & 57344);
            d(painterRememberIconFontPainter, str, j7, null, composerStartRestartGroup, i13);
            BiliIconfont biliIconfont = BiliIconfont.INSTANCE;
            d(biliIconfont.getHeart_collect_line_500(composerStartRestartGroup, 6), ogvSeasonInfo.f92247a, j7, null, composerStartRestartGroup, i13);
            a aVar = this.f92257b;
            if (((Boolean) aVar.f92263b.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-365305880);
                d(biliIconfont.getPerson_hot_line_500(composerStartRestartGroup, 6), (String) aVar.f92262a.getValue(), j7, null, composerStartRestartGroup, i13);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-365181911);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (!this.f92260e || StringsKt.isBlank(ogvSeasonInfo.f92248b)) {
                composerStartRestartGroup.startReplaceGroup(-364780151);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-365088229);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i14 = BiliTheme.$stable;
                TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i14).getT12();
                composerStartRestartGroup.startReplaceGroup(-1397245892);
                long j9 = (j8 > 16L ? 1 : (j8 == 16L ? 0 : -1)) != 0 ? j8 : biliTheme.getColors(composerStartRestartGroup, i14).getOr5-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                TextKt.m1772Text4IGK_g(ogvSeasonInfo.f92248b, (Modifier) null, j9, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 3120, 55290);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (this.f92261f) {
                composerStartRestartGroup.startReplaceGroup(-1162974837);
                Alignment.Vertical centerVertically3 = companion.getCenterVertically();
                Modifier modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(companion3, this.f92259d);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composerStartRestartGroup, 48);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierCollectExposureLayoutInfo);
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
                O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy3, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                String strStringResource = StringResources_androidKt.stringResource(2131851582, composerStartRestartGroup, 0);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i15 = BiliTheme.$stable;
                TextStyle t122 = biliTheme2.getTextStyle(composerStartRestartGroup, i15).getT12();
                composerStartRestartGroup.startReplaceGroup(49092921);
                long j10 = (j7 > 16L ? 1 : (j7 == 16L ? 0 : -1)) != 0 ? j7 : biliTheme2.getColors(composerStartRestartGroup, i15).getText3-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                TextKt.m1772Text4IGK_g(strStringResource, PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3880constructorimpl(2), 0.0f, 11, null), j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t122, composerStartRestartGroup, 48, 0, 65528);
                Painter arrow_forward_right_line_500 = biliIconfont.getArrow_forward_right_line_500(composerStartRestartGroup, 6);
                Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(rowScopeInstance.align(companion3, companion.getCenterVertically()), Dp.m3880constructorimpl(16));
                composerStartRestartGroup.startReplaceGroup(49107801);
                long j11 = (j7 > 16L ? 1 : (j7 == 16L ? 0 : -1)) != 0 ? j7 : biliTheme2.getColors(composerStartRestartGroup, i15).getText3-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                IconKt.m1714Iconww6aTOc(arrow_forward_right_line_500, (String) null, modifierM1372size3ABfNKs, j11, composerStartRestartGroup, i12 | 48, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1162036467);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, j7, j8, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f92236a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f92237b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f92238c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f92239d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f92240e;

                {
                    this.f92236a = this;
                    this.f92237b = j7;
                    this.f92238c = j8;
                    this.f92239d = modifier;
                    this.f92240e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92240e | 1);
                    long j12 = this.f92238c;
                    Modifier modifier2 = this.f92239d;
                    this.f92236a.c(iUpdateChangedFlags, this.f92237b, j12, (Composer) obj, modifier2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(final Painter painter, final String str, final long j7, Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(528442351);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(j7) ? 256 : 128);
        }
        int i11 = i10 | 3072;
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(528442351, i11, -1, "com.bilibili.ship.theseus.ogv.intro.OgvSeasonInfoUi.SeasonInfoItemContent (OgvSeasonInfoUi.kt:157)");
            }
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 11, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (painter != null) {
                composerStartRestartGroup.startReplaceGroup(1491060468);
                Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(rowScopeInstance.align(companion, companion2.getCenterVertically()), 0.0f, 0.0f, Dp.m3880constructorimpl(2), 0.0f, 11, null), Dp.m3880constructorimpl(16));
                composerStartRestartGroup.startReplaceGroup(1433581623);
                long j8 = (j7 > 16L ? 1 : (j7 == 16L ? 0 : -1)) != 0 ? j7 : BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_medium-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                IconKt.m1714Iconww6aTOc(painter, (String) null, modifierM1372size3ABfNKs, j8, composerStartRestartGroup, Painter.$stable | 48 | (i11 & 14), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1491432375);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str2 = StringsKt.isBlank(str) ? "-" : str;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            TextStyle textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT12(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(true), null, 0, 0, null, 16252927, null);
            composerStartRestartGroup.startReplaceGroup(1433593552);
            long j9 = (j7 > 16L ? 1 : (j7 == 16L ? 0 : -1)) != 0 ? j7 : biliTheme.getColors(composerStartRestartGroup, i12).getText3-0d7_KjU();
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m1772Text4IGK_g(str2, (Modifier) companion, j9, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3586copyp1EtxEg$default, composerStartRestartGroup, 48, 3120, 55288);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, painter, str, j7, modifier2, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final P f92241a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Painter f92242b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f92243c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f92244d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f92245e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f92246f;

                {
                    this.f92241a = this;
                    this.f92242b = painter;
                    this.f92243c = str;
                    this.f92244d = j7;
                    this.f92245e = modifier2;
                    this.f92246f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92246f | 1);
                    long j10 = this.f92244d;
                    Modifier modifier3 = this.f92245e;
                    this.f92241a.d(this.f92242b, this.f92243c, j10, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
