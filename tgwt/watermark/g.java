package com.bilibili.tgwt.watermark;

import Di0.C1602f;
import android.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ogvcommon.play.resolver.Watermark;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p61.B;
import p61.C;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/g.class */
public final class g {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final WatermarkUiMode watermarkUiMode, final Watermark watermark, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-901210511);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(watermarkUiMode.ordinal()) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(watermark) : composerStartRestartGroup.changedInstance(watermark) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-901210511, i9, -1, "com.bilibili.tgwt.watermark.IconizedWatermarkUi (WatermarkUi.kt:83)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, watermarkUiMode.m10603getMarginEndD9Ej5fM(), watermarkUiMode.m10602getMarginBottomD9Ej5fM(), 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            BiliImageKt.BiliImage(new ImageRequest(watermark.f73251a).build(), SizeKt.m1372size3ABfNKs(companion, watermarkUiMode.m10601getIconSizeD9Ej5fM()), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, watermarkUiMode.m10600getIconPaddingD9Ej5fM()), composerStartRestartGroup, 0);
            BasicTextKt.m1512BasicTextRWo7tUw(watermark.f73252b, (Modifier) null, new TextStyle(ColorKt.Color(4289855488L), watermarkUiMode.m10605getTextSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1572864, 954);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, watermarkUiMode, watermark) { // from class: com.bilibili.tgwt.watermark.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f112321a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f112322b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f112323c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f112324d;

                {
                    this.f112321a = i10;
                    this.f112323c = watermarkUiMode;
                    this.f112324d = watermark;
                    this.f112322b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f112321a) {
                        case 0:
                            num.intValue();
                            g.a((WatermarkUiMode) this.f112323c, (Watermark) this.f112324d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f112322b | 1));
                            break;
                        default:
                            num.getClass();
                            C.a((B) this.f112323c, (Modifier) this.f112324d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f112322b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final WatermarkUiMode watermarkUiMode, final Watermark watermark, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1403063325);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(watermarkUiMode.ordinal()) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(watermark) : composerStartRestartGroup.changedInstance(watermark) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1403063325, i9, -1, "com.bilibili.tgwt.watermark.PlainTextWatermarkUi (WatermarkUi.kt:56)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity() * 1;
            BasicTextKt.m1512BasicTextRWo7tUw(watermark.f73252b, PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, watermarkUiMode.m10604getSimpleTextMarginBottomD9Ej5fM(), 7, null), new TextStyle(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(ColorResources_androidKt.colorResource(2131100750, composerStartRestartGroup, 0), Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(density)))), density, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16769020, (DefaultConstructorMarker) null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 6, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 936);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(watermarkUiMode, watermark, i7) { // from class: com.bilibili.tgwt.watermark.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WatermarkUiMode f112325a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Watermark f112326b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f112327c;

                {
                    this.f112325a = watermarkUiMode;
                    this.f112326b = watermark;
                    this.f112327c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112327c | 1);
                    g.b(this.f112325a, this.f112326b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final h hVar, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2016952192);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(hVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2016952192, i8, -1, "com.bilibili.tgwt.watermark.WatermarkUi (WatermarkUi.kt:40)");
            }
            Watermark watermark = (Watermark) hVar.f112328a.getValue();
            WatermarkUiMode watermarkUiMode = (WatermarkUiMode) hVar.f112329b.getValue();
            if (watermark == null || watermarkUiMode == null) {
                composerStartRestartGroup.startReplaceGroup(430637954);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(430429417);
                String str = watermark.f73251a;
                if (str == null || StringsKt.isBlank(str)) {
                    composerStartRestartGroup.startReplaceGroup(430470802);
                    b(watermarkUiMode, watermark, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(430556083);
                    a(watermarkUiMode, watermark, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(hVar, i7) { // from class: com.bilibili.tgwt.watermark.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final h f112319a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f112320b;

                {
                    this.f112319a = hVar;
                    this.f112320b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f112320b | 1);
                    g.c(this.f112319a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
