package com.bilibili.ship.theseus.ogv.trialcountdown;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.autofill.r;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
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
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.A;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/g.class */
public final class g {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable final TextVo textVo, @Nullable final TextVo textVo2, final long j7, @NotNull final FullPromptBarVo fullPromptBarVo, @Nullable final y yVar, @Nullable final y yVar2, @Nullable Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1355429011);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(textVo) : composerStartRestartGroup.changedInstance(textVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(textVo2) : composerStartRestartGroup.changedInstance(textVo2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(j7) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | ((i7 & 4096) == 0 ? composerStartRestartGroup.changed(fullPromptBarVo) : composerStartRestartGroup.changedInstance(fullPromptBarVo) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(yVar) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(yVar2) ? 131072 : 65536);
        }
        int i14 = i13 | 1572864;
        if (composerStartRestartGroup.shouldExecute((599187 & i14) != 599186, i14 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355429011, i14, -1, "com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownUI (TrialCountdownUI.kt:29)");
            }
            float f7 = 8;
            Modifier modifierA = H.a(f7, PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(5), 0.0f, 0.0f, 13, null), ColorKt.Color(2568755232L));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(f7)), Dp.m3880constructorimpl(38)), composerStartRestartGroup, 6);
            BiliImageKt.BiliImage(fullPromptBarVo.f102379a, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(14)), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 0, 4092);
            float f8 = 4;
            J.a(f8, 6, composerStartRestartGroup, companion);
            if (textVo != null) {
                composerStartRestartGroup.startReplaceGroup(618188207);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i15 = BiliTheme.$stable;
                TextKt.m1772Text4IGK_g(textVo.f102705a, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i15).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i15).getT12(), composerStartRestartGroup, 0, 0, 65530);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(618348043);
                composerStartRestartGroup.endReplaceGroup();
            }
            float f9 = 6;
            J.a(f9, 6, composerStartRestartGroup, companion);
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl((float) 0.5d)), Dp.m3880constructorimpl(10)), ColorKt.Color(2583691263L), null, 2, null), composerStartRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(f9)), composerStartRestartGroup, 6);
            if (textVo2 != null) {
                composerStartRestartGroup.startReplaceGroup(618551496);
                composerStartRestartGroup.startReplaceGroup(-1457743929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1457743929, (i14 >> 6) & 14, -1, "com.bilibili.ship.theseus.ogv.trialcountdown.formatCountdown (TrialCountdownUI.kt:93)");
                }
                if (j7 <= 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    strStringResource = "";
                } else {
                    if (j7 > 60) {
                        composerStartRestartGroup.startReplaceGroup(-1234943258);
                        strStringResource = (j7 / ((long) 60)) + StringResources_androidKt.stringResource(2131848824, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1234790831);
                        strStringResource = StringResources_androidKt.stringResource(2131854850, new Object[]{String.valueOf(j7)}, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                StringBuilder sbA = r.a(strStringResource);
                sbA.append(textVo2.f102705a);
                String string = sbA.toString();
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i16 = BiliTheme.$stable;
                TextKt.m1772Text4IGK_g(string, (Modifier) null, biliTheme2.getColors(composerStartRestartGroup, i16).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme2.getTextStyle(composerStartRestartGroup, i16).getT12(), composerStartRestartGroup, 0, 0, 65530);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(618748811);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (yVar != null) {
                composerStartRestartGroup.startReplaceGroup(618816391);
                SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(12)), composerStartRestartGroup, 6);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                Modifier modifierA2 = yVar.a(companion);
                int i17 = (i14 >> 12) & 14;
                Brush brushC = yVar.c(composerStartRestartGroup, i17);
                if (brushC == null) {
                    composerStartRestartGroup.startReplaceGroup(18402679);
                    brushC = new SolidColor(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBrand_pink-0d7_KjU(), null);
                } else {
                    composerStartRestartGroup.startReplaceGroup(18401811);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(BackgroundKt.background$default(modifierA2, brushC, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f8));
                BiliTheme biliTheme3 = BiliTheme.INSTANCE;
                int i18 = BiliTheme.$stable;
                A.a(yVar, modifierM1343paddingVpY3zN4, null, TextStyle.m3586copyp1EtxEg$default(biliTheme3.getTextStyle(composerStartRestartGroup, i18).getT12b(), biliTheme3.getColors(composerStartRestartGroup, i18).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, 0, false, 0, 0, null, null, composerStartRestartGroup, i17, 0, 1018);
                if (yVar2 == null) {
                    composerStartRestartGroup.startReplaceGroup(570853283);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    Modifier modifierM1334offsetVpY3zN4$default = OffsetKt.m1334offsetVpY3zN4$default(S60.c.a(composerStartRestartGroup, 18414622, companion2, boxScopeInstance, companion), 0.0f, Dp.m3880constructorimpl(-9), 1, null);
                    int i19 = (i14 >> 15) & 14;
                    Brush brushC2 = yVar2.c(composerStartRestartGroup, i19);
                    if (brushC2 == null) {
                        composerStartRestartGroup.startReplaceGroup(18421047);
                        brushC2 = new SolidColor(biliTheme3.getColors(composerStartRestartGroup, i18).getBrand_pink-0d7_KjU(), null);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(18420210);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    A.a(yVar2, PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.background$default(modifierM1334offsetVpY3zN4$default, brushC2, RoundedCornerShapeKt.m1503RoundedCornerShapea9UjIt4(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(2)), 0.0f, 4, null), Dp.m3880constructorimpl(f8), 0.0f, 2, null), null, new TextStyle(0L, TextUnitKt.getSp(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(13), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646141, (DefaultConstructorMarker) null), null, 0, false, 0, 0, null, null, composerStartRestartGroup, i19 | 3072, 0, 1018);
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(620019563);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(f9)), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(textVo, textVo2, j7, fullPromptBarVo, yVar, yVar2, modifier2, i7) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TextVo f94616a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TextVo f94617b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f94618c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final FullPromptBarVo f94619d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final y f94620e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final y f94621f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Modifier f94622g;
                public final int h;

                {
                    this.f94616a = textVo;
                    this.f94617b = textVo2;
                    this.f94618c = j7;
                    this.f94619d = fullPromptBarVo;
                    this.f94620e = yVar;
                    this.f94621f = yVar2;
                    this.f94622g = modifier2;
                    this.h = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    y yVar3 = this.f94621f;
                    Modifier modifier3 = this.f94622g;
                    g.a(this.f94616a, this.f94617b, this.f94618c, this.f94619d, this.f94620e, yVar3, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
