package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bilibili.bplus.im.communication.S;
import com.bilibili.compose.theme.BiliTheme;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/r.class */
public final class r {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(p pVar, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1653755463);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(pVar) : composerStartRestartGroup.changedInstance(pVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1653755463, i8, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.BilibiliSection (CheeseAttendanceShare.kt:231)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion2, e(303.0f, composerStartRestartGroup)), e(82.0f, composerStartRestartGroup));
            ContentScale fillWidth = ContentScale.Companion.getFillWidth();
            int i9 = Painter.$stable;
            ImageKt.Image(pVar.f89337b, "logo", modifierM1358height3ABfNKs, (Alignment) null, fillWidth, 0.0f, (ColorFilter) null, composerStartRestartGroup, i9 | 24624, 104);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion.getBottom(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, 0.0f, e(10.0f, composerStartRestartGroup), e(6.0f, composerStartRestartGroup), 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(2131855738, composerStartRestartGroup, 0);
            long jF = f(30.0f, composerStartRestartGroup);
            TextAlign.Companion companion4 = TextAlign.Companion;
            int iM3795getEnde0LSkKk = companion4.m3795getEnde0LSkKk();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getGa9-0d7_KjU(), jF, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3795getEnde0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906846067, 0, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.formatTimestampToShareText (CheeseAttendanceShare.kt:289)");
            }
            String str = new SimpleDateFormat(StringResources_androidKt.stringResource(2131855739, composerStartRestartGroup, 0), Locale.CHINA).format(new Date(System.currentTimeMillis()));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131847063, new Object[]{str}, composerStartRestartGroup, 0), PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, e(12.0f, composerStartRestartGroup), 0.0f, 0.0f, 13, null), biliTheme.getColors(composerStartRestartGroup, i10).getText4-0d7_KjU(), f(26.0f, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion4.m3795getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130544);
            composerStartRestartGroup.endNode();
            ImageKt.Image(pVar.f89339d, "qrCode", SizeKt.m1372size3ABfNKs(companion2, e(158.0f, composerStartRestartGroup)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i9 | 48, 120);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Oy.f(pVar, i7, 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219708999);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(cheeseAttendanceShareMaterial) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219708999, i8, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.DaysCounter (CheeseAttendanceShare.kt:210)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(companion, e(106.0f, composerStartRestartGroup));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            int iD = cheeseAttendanceShareMaterial.d();
            long jF = f(98.0f, composerStartRestartGroup);
            FontWeight bold = FontWeight.Companion.getBold();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(String.valueOf(iD), PaddingKt.m1344paddingVpY3zN4$default(rowScopeInstance.alignByBaseline(companion), e(12.0f, composerStartRestartGroup), 0.0f, 2, null), biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink-0d7_KjU(), jF, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196608, 0, 131024);
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131851772, composerStartRestartGroup, 0), rowScopeInstance.alignByBaseline(companion), biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), f(40.0f, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(cheeseAttendanceShareMaterial, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.attendance.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseAttendanceShareMaterial f89340a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89341b;

                {
                    this.f89340a = cheeseAttendanceShareMaterial;
                    this.f89341b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89341b | 1);
                    r.b(this.f89340a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial, p pVar, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319638843);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(cheeseAttendanceShareMaterial) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(pVar) : composerStartRestartGroup.changedInstance(pVar) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319638843, i9, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.FitnessTrackingCard (CheeseAttendanceShare.kt:116)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierClip = ClipKt.clip(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, e(960.0f, composerStartRestartGroup)), e(1693.0f, composerStartRestartGroup)), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(e(30.0f, composerStartRestartGroup)));
            Color.Companion companion2 = Color.Companion;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierClip, companion2.m2664getTransparent0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), e(1280.0f, composerStartRestartGroup));
            ContentScale crop = ContentScale.Companion.getCrop();
            int i10 = Painter.$stable;
            ImageKt.Image(pVar.f89336a, "main", modifierM1358height3ABfNKs, (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, i10 | 24624, 104);
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.m2666getWhite0d7_KjU(), null, 2, null), e(48.0f, composerStartRestartGroup), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierM1358height3ABfNKs2 = SizeKt.m1358height3ABfNKs(companion, e(206.0f, composerStartRestartGroup));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, SizeKt.m1358height3ABfNKs(companion, e(106.0f, composerStartRestartGroup)), 1.0f, false, 2, null);
            int i11 = i9 & 14;
            d(cheeseAttendanceShareMaterial, pVar, modifierWeight$default, composerStartRestartGroup, (i10 << 3) | i11 | (i9 & 112));
            b(cheeseAttendanceShareMaterial, composerStartRestartGroup, i11);
            composerStartRestartGroup.endNode();
            DividerKt.m1691DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getLine_regular-0d7_KjU(), Dp.m3880constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 390, 8);
            a(pVar, composerStartRestartGroup, i10 | ((i9 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new S(i7, 1, cheeseAttendanceShareMaterial, pVar));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial, p pVar, Modifier modifier, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1774515488);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(cheeseAttendanceShareMaterial) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(pVar) : composerStartRestartGroup.changedInstance(pVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1774515488, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.UserProfileSection (CheeseAttendanceShare.kt:171)");
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
            Modifier.Companion companion3 = Modifier.Companion;
            ImageKt.Image(pVar.f89338c, "avatar", ClipKt.clip(SizeKt.m1372size3ABfNKs(companion3, e(106.0f, composerStartRestartGroup)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion3, e(24.0f, composerStartRestartGroup)), composerStartRestartGroup, 0);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion.getStart(), composerStartRestartGroup, 6);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            TextKt.m1772Text4IGK_g(cheeseAttendanceShareMaterial.f(), (Modifier) null, Color.Companion.m2655getBlack0d7_KjU(), f(42.0f, composerStartRestartGroup), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196992, 0, 131026);
            TextKt.m1772Text4IGK_g(cheeseAttendanceShareMaterial.g(), (Modifier) null, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText3-0d7_KjU(), f(38.0f, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3120, 120818);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.biligame.cloudgame.v2.ui.welfare.p(i7, 1, cheeseAttendanceShareMaterial, pVar, modifier));
        }
    }

    @Composable
    public static final float e(float f7, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-244841770, 6, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.px (CheeseAttendanceShare.kt:283)");
        }
        float fMo1267toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo1267toDpu2uoSUM(f7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo1267toDpu2uoSUM;
    }

    @Composable
    public static final long f(float f7, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-575286288, 6, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.sp (CheeseAttendanceShare.kt:286)");
        }
        long jMo1273toSpkPz2Gy4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo1273toSpkPz2Gy4(f7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jMo1273toSpkPz2Gy4;
    }
}
