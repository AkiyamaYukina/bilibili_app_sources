package com.bilibili.pegasus.keywordblocker;

import Di0.C1602f;
import UR0.f0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.common.C4618g;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.pegasus.kmm.keywordblocker.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/AddModeDialogKt.class */
public final class AddModeDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final com.bilibili.pegasus.kmm.keywordblocker.d r10, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.kmm.keywordblocker.b, kotlin.Unit> r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, final int r13) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.AddModeDialogKt.a(com.bilibili.pegasus.kmm.keywordblocker.d, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final com.bilibili.pegasus.kmm.keywordblocker.d dVar, final Function1<? super com.bilibili.pegasus.kmm.keywordblocker.b, Unit> function1, final FocusRequester focusRequester, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1837841278);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(dVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(focusRequester) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837841278, i10, -1, "com.bilibili.pegasus.keywordblocker.InputArea (AddModeDialog.kt:179)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getBg1-0d7_KjU();
            float f7 = 12;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
            float fM3880constructorimpl2 = Dp.m3880constructorimpl(f7);
            float f8 = 0;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(BackgroundKt.m1168backgroundbw27NRU(modifierFillMaxWidth$default, j7, RoundedCornerShapeKt.m1503RoundedCornerShapea9UjIt4(fM3880constructorimpl, fM3880constructorimpl2, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8))), Dp.m3880constructorimpl(72));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), focusRequester);
            float f9 = 16;
            Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(H.a(f9, PaddingKt.m1344paddingVpY3zN4$default(modifierFocusRequester, Dp.m3880constructorimpl(f9), 0.0f, 2, null), biliTheme.getColors(composerStartRestartGroup, i11).getGraph_bg_regular-0d7_KjU()), Dp.m3880constructorimpl(14), Dp.m3880constructorimpl(6));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1343paddingVpY3zN4);
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
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), focusRequester);
            String str = dVar.f78263c;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            String strStringResource = StringResources_androidKt.stringResource(2131845151, composerStartRestartGroup, 0);
            TextStyle textStyle = new TextStyle(biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            TextStyle textStyle2 = new TextStyle(biliTheme.getColors(composerStartRestartGroup, i11).getText4-0d7_KjU(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            int i12 = i10 & 112;
            boolean z6 = i12 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new f0(function1, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean z7 = false;
            com.bilibili.compose.text.q.c(str2, strStringResource, (Function1) objRememberedValue, modifierFocusRequester2, textStyle, textStyle2, false, true, 0, (KeyboardOptions) null, (KeyboardActions) null, (VisualTransformation) null, (Function1) null, (com.bilibili.compose.text.i) null, composerStartRestartGroup, 12582912, 0, 16192);
            String str3 = dVar.f78263c;
            if (str3 == null || str3.length() <= 0) {
                str3 = null;
            }
            if (str3 == null) {
                composerStartRestartGroup.startReplaceGroup(-1908101853);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1908101852);
                TextKt.m1772Text4IGK_g(C4618g.a(str3.length(), "/9"), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(SizeKt.wrapContentSize$default(companion, null, false, 3, null), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f8));
            float f10 = 1;
            Modifier modifierM1356defaultMinSizeVpY3zN4 = SizeKt.m1356defaultMinSizeVpY3zN4(modifierM1345paddingqDBjuR0, Dp.m3880constructorimpl(f10), Dp.m3880constructorimpl(f10));
            float f11 = 15;
            PaddingValues paddingValuesM1336PaddingValuesYgX7TsA = PaddingKt.m1336PaddingValuesYgX7TsA(Dp.m3880constructorimpl(f11), Dp.m3880constructorimpl(5));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long j8 = biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU();
            long jM2666getWhite0d7_KjU = Color.Companion.m2666getWhite0d7_KjU();
            long jColor = ColorKt.Color(4293125607L);
            long jColor2 = ColorKt.Color(4287928736L);
            int i13 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM1640buttonColorsro_MJ88 = buttonDefaults.m1640buttonColorsro_MJ88(j8, jM2666getWhite0d7_KjU, jColor, jColor2, composerStartRestartGroup, (i13 << 12) | 3504, 0);
            RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f11));
            ButtonElevation buttonElevationM1641elevationR_JCAzs = buttonDefaults.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), 0.0f, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), composerStartRestartGroup, (i13 << 15) | 27702, 4);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dVar);
            if (i12 == 32) {
                z7 = true;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z7 | zChangedInstance) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0(dVar, function1) { // from class: com.bilibili.pegasus.keywordblocker.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.pegasus.kmm.keywordblocker.d f78209a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Function1 f78210b;

                    {
                        this.f78209a = dVar;
                        this.f78210b = function1;
                    }

                    public final Object invoke() {
                        String str4 = this.f78209a.f78263c;
                        if (str4 != null) {
                            this.f78210b.invoke(new b.h(new n(str4)));
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ButtonKt.Button((Function0) objRememberedValue2, modifierM1356defaultMinSizeVpY3zN4, dVar.f78264d, null, buttonElevationM1641elevationR_JCAzs, roundedCornerShapeM1502RoundedCornerShape0680j_4, null, buttonColorsM1640buttonColorsro_MJ88, paddingValuesM1336PaddingValuesYgX7TsA, l.f78238a, composerStartRestartGroup, 905969712, 72);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(dVar, function1, focusRequester, i7) { // from class: com.bilibili.pegasus.keywordblocker.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.pegasus.kmm.keywordblocker.d f78211a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78212b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FocusRequester f78213c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f78214d;

                {
                    this.f78211a = dVar;
                    this.f78212b = function1;
                    this.f78213c = focusRequester;
                    this.f78214d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78214d | 1);
                    AddModeDialogKt.b(this.f78211a, this.f78212b, this.f78213c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
