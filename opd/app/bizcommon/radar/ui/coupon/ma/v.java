package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import Di0.C1602f;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.internal.J;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.C4618g;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I0;
import com.bilibili.mobile.BLHumanActionParamsType;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kntr.login.dialog.LoginDialogPageKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/v.class */
public final class v {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, Composer composer, final Modifier modifier, final String str, final boolean z6) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1491955295);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, 1 & i10)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1491955295, i10, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.ActionFallbackButton (RadarMaCouponDialog.kt:323)");
            }
            float f7 = 16;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 3, null)), ColorKt.Color(z6 ? 4294928025L : 4294947783L), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1772Text4IGK_g(Intrinsics.areEqual(str, "REQUEST") ? "立即领取" : "去看看", (Modifier) null, Color.Companion.m2666getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getW600(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131026);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, z6) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f74388a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f74389b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f74390c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f74391d;

                {
                    this.f74388a = modifier;
                    this.f74389b = z6;
                    this.f74390c = str;
                    this.f74391d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    v.a(RecomposeScopeImplKt.updateChangedFlags(this.f74391d | 1), (Composer) obj, this.f74388a, this.f74390c, this.f74389b);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final x xVar, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(383281868);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(xVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(383281868, i8, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.AmountDialogBody (RadarMaCouponDialog.kt:435)");
            }
            String str = xVar.h;
            a aVar = xVar.f74403i;
            long jG = g(ColorKt.Color(4294918528L), str);
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
            Modifier modifierRotate = RotateKt.rotate(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, Dp.m3880constructorimpl(54), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(182)), Dp.m3880constructorimpl(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)), -3.4f);
            float f7 = 8;
            BoxKt.Box(ClipKt.clip(modifierRotate, RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f7))), composerStartRestartGroup, 0);
            BoxKt.Box(ClipKt.clip(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, Dp.m3880constructorimpl(48), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(194)), Dp.m3880constructorimpl(114)), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f7))), composerStartRestartGroup, 0);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            long sp = TextUnitKt.getSp(36);
            FontWeight.Companion companion4 = FontWeight.Companion;
            int iPushStyle = builder.pushStyle(new SpanStyle(jG, sp, companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
            try {
                builder.append(aVar.f74329a);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                iPushStyle = builder.pushStyle(new SpanStyle(jG, TextUnitKt.getSp(72), companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.f74330b);
                    builder.pop(iPushStyle);
                    iPushStyle = builder.pushStyle(new SpanStyle(jG, TextUnitKt.getSp(36), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                    try {
                        builder.append(aVar.f74331c);
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        float f8 = 20;
                        Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(63), Dp.m3880constructorimpl(f8), 0.0f, 8, null), 0.0f, 1, null), Dp.m3880constructorimpl(82));
                        long sp2 = TextUnitKt.getSp(64);
                        long sp3 = TextUnitKt.getSp(82);
                        TextAlign.Companion companion5 = TextAlign.Companion;
                        TextKt.m1773TextIbK3jfQ(annotatedString, modifierM1358height3ABfNKs, 0L, sp2, null, null, null, 0L, null, TextAlign.m3787boximpl(companion5.m3794getCentere0LSkKk()), sp3, 0, false, 1, 0, null, null, null, composerStartRestartGroup, 3072, 3078, 252404);
                        TextKt.m1772Text4IGK_g(aVar.f74332d, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), Dp.m3880constructorimpl(f8), 0.0f, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(95), 2, null), 0.0f, 1, null), Dp.m3880constructorimpl(24)), ColorKt.Color(4281283128L), TextUnitKt.getSp(14), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion5.m3794getCentere0LSkKk()), TextUnitKt.getSp(24), 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 3078, 121296);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(xVar, i7, i9) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f74392a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f74393b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f74394c;

                {
                    this.f74392a = i9;
                    this.f74394c = xVar;
                    this.f74393b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = this.f74392a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i10) {
                        case 0:
                            v.b((x) this.f74394c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f74393b | 1));
                            break;
                        default:
                            LoginDialogPageKt.a((r81.a) this.f74394c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f74393b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01ab  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final float r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.v.c(float, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final x xVar, Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(505255429);
        int i8 = (i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(xVar) ? 4 : 2) | i7 : i7;
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505255429, i8, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.DetailDialogBody (RadarMaCouponDialog.kt:340)");
            }
            long jG = g(ColorKt.Color(4294918528L), xVar.h);
            float f7 = 18;
            Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(24), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(56));
            float f8 = 8;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m1302spacedBy0680j_4(Dp.m3880constructorimpl(f8)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1345paddingqDBjuR0);
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
            composerStartRestartGroup.startReplaceGroup(1188515220);
            for (j jVar : CollectionsKt.take(xVar.f74404j, 3)) {
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(J.a(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3880constructorimpl(64)), f8), Color.m2628copywmQWz5c$default(Color.Companion.m2666getWhite0d7_KjU(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
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
                O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (StringsKt.isBlank(jVar.f74353a)) {
                    composerStartRestartGroup.startReplaceGroup(-806409562);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-806594074);
                    f(jVar.f74353a, boxScopeInstance.matchParentSize(companion2), null, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                long sp = TextUnitKt.getSp(14);
                FontWeight.Companion companion5 = FontWeight.Companion;
                int iPushStyle = builder.pushStyle(new SpanStyle(jG, sp, companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                try {
                    builder.append(jVar.f74354b);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle = builder.pushStyle(new SpanStyle(jG, TextUnitKt.getSp(26), companion5.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                    try {
                        builder.append(jVar.f74355c);
                        builder.pop(iPushStyle);
                        iPushStyle = builder.pushStyle(new SpanStyle(jG, TextUnitKt.getSp(14), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                        try {
                            builder.append(jVar.f74356d);
                            builder.pop(iPushStyle);
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getTopStart());
                            float f9 = 10;
                            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(modifierAlign, 0.0f, Dp.m3880constructorimpl(f9), 0.0f, 0.0f, 13, null);
                            float f10 = 54;
                            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f10)), Dp.m3880constructorimpl(30));
                            long sp2 = TextUnitKt.getSp(26);
                            long sp3 = TextUnitKt.getSp(30);
                            TextAlign.Companion companion6 = TextAlign.Companion;
                            TextKt.m1773TextIbK3jfQ(annotatedString, modifierM1358height3ABfNKs, jG, sp2, null, null, null, 0L, null, TextAlign.m3787boximpl(companion6.m3794getCentere0LSkKk()), sp3, 0, false, 1, 0, null, null, null, composerStartRestartGroup, 3072, 3078, 252400);
                            Modifier modifierM1377width3ABfNKs = SizeKt.m1377width3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(f9), 7, null), Dp.m3880constructorimpl(f10));
                            float f11 = 16;
                            Modifier modifierM1358height3ABfNKs2 = SizeKt.m1358height3ABfNKs(modifierM1377width3ABfNKs, Dp.m3880constructorimpl(f11));
                            long sp4 = TextUnitKt.getSp(11);
                            long sp5 = TextUnitKt.getSp(16);
                            TextOverflow.Companion companion7 = TextOverflow.Companion;
                            TextKt.m1772Text4IGK_g(jVar.f74357e, modifierM1358height3ABfNKs2, jG, sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion6.m3794getCentere0LSkKk()), sp5, companion7.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3126, 119280);
                            Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion3.getTopStart());
                            float f12 = 66;
                            float fM3880constructorimpl = Dp.m3880constructorimpl(f12);
                            float f13 = 7;
                            float fM3880constructorimpl2 = Dp.m3880constructorimpl(f13);
                            float f14 = 5;
                            TextKt.m1772Text4IGK_g(jVar.f74358f, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(modifierAlign2, fM3880constructorimpl, fM3880constructorimpl2, Dp.m3880constructorimpl(f14), 0.0f, 8, null), 0.0f, 1, null), Dp.m3880constructorimpl(f11)), ColorKt.Color(4279769372L), TextUnitKt.getSp(13), (FontStyle) null, companion5.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), companion7.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 3126, 119760);
                            TextKt.m1772Text4IGK_g(jVar.f74359g, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getTopStart()), Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(25), Dp.m3880constructorimpl(f14), 0.0f, 8, null), 0.0f, 1, null), Dp.m3880constructorimpl(f11)), ColorKt.Color(4284573293L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), companion7.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 3126, 119792);
                            TextKt.m1772Text4IGK_g(jVar.h, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), Dp.m3880constructorimpl(f12), 0.0f, Dp.m3880constructorimpl(f14), Dp.m3880constructorimpl(f13), 2, null), 0.0f, 1, null), Dp.m3880constructorimpl(f11)), ColorKt.Color(4284573293L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), companion7.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 3126, 119792);
                            composerStartRestartGroup.endNode();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            composerStartRestartGroup = composerStartRestartGroup;
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
                composerStartRestartGroup = composerStartRestartGroup;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(xVar, i7, i9) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f74385a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f74386b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f74387c;

                {
                    this.f74385a = i9;
                    this.f74387c = xVar;
                    this.f74386b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f74385a) {
                        case 0:
                            num.intValue();
                            v.d((x) this.f74387c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f74386b | 1));
                            break;
                        default:
                            num.getClass();
                            tv.danmaku.bili.ui.main2.mineV2.n.a((Function1) this.f74387c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f74386b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final x xVar, final String str, final boolean z6, final long j7, final float f7, final boolean z7, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i7) {
        int i8;
        float fM3880constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(878291564);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(xVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(j7) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(f7) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(z7) ? 131072 : 65536);
        }
        if ((1572864 & i7) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        int i14 = i13;
        if ((i7 & 12582912) == 0) {
            i14 = i13 | (composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304);
        }
        if (composerStartRestartGroup.shouldExecute((i14 & 4793491) != 4793490, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(878291564, i14, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.DialogContent (RadarMaCouponDialog.kt:203)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objMutableInteractionSource;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            if (!Intrinsics.areEqual(str, "ma_coupon_detail") || StringsKt.isBlank(xVar.f74399d)) {
                composerStartRestartGroup.startReplaceGroup(-252738720);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-252981853);
                f(xVar.f74399d, SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(256)), Dp.m3880constructorimpl(52)), null, composerStartRestartGroup, 48, 4);
                I0.a(4, 6, composerStartRestartGroup, companion);
            }
            float f8 = 264;
            Modifier modifierM1377width3ABfNKs = SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(f8));
            if (Intrinsics.areEqual(str, "ma_coupon_detail")) {
                fM3880constructorimpl = Dp.m3880constructorimpl(xVar.f74404j.size() >= 2 ? 284 : 212);
            } else {
                fM3880constructorimpl = Dp.m3880constructorimpl(f8);
            }
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(modifierM1377width3ABfNKs, fM3880constructorimpl);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            if (StringsKt.isBlank(xVar.f74400e)) {
                composerStartRestartGroup.startReplaceGroup(535962340);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(J.a(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 16), ColorKt.Color(4294963958L), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(535555713);
                f(xVar.f74400e, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Intrinsics.areEqual(str, "ma_coupon_detail") ? ContentScale.Companion.getFillBounds() : ContentScale.Companion.getCrop(), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM1358height3ABfNKs2 = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), Dp.m3880constructorimpl(101));
            Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(modifierM1358height3ABfNKs2, mutableInteractionSource, null, z7, null, null, function0, 24, null);
            boolean zAreEqual = Intrinsics.areEqual(str, "ma_coupon_amount");
            String str2 = xVar.f74396a;
            String str3 = xVar.f74401f;
            if (zAreEqual) {
                composerStartRestartGroup.startReplaceGroup(536733217);
                if (StringsKt.isBlank(str3)) {
                    composerStartRestartGroup.startReplaceGroup(537075860);
                    float f9 = 4;
                    a((i14 >> 12) & 112, composerStartRestartGroup, PaddingKt.m1343paddingVpY3zN4(modifierM1358height3ABfNKs2, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f9)), str2, z7);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(536778260);
                    float f10 = 4;
                    f(xVar.f74401f, PaddingKt.m1346paddingqDBjuR0$default(modifierM1358height3ABfNKs2, Dp.m3880constructorimpl(f10), 0.0f, Dp.m3880constructorimpl(f10), Dp.m3880constructorimpl(f10), 2, null), ContentScale.Companion.getFillBounds(), composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(537372282);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (Intrinsics.areEqual(str, "ma_coupon_detail")) {
                composerStartRestartGroup.startReplaceGroup(-1783777697);
                d(xVar, composerStartRestartGroup, i14 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(str, "ma_coupon_amount")) {
                composerStartRestartGroup.startReplaceGroup(-1783775009);
                b(xVar, composerStartRestartGroup, i14 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(537585562);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (StringsKt.isBlank(str3)) {
                composerStartRestartGroup.startReplaceGroup(538112655);
                if (Intrinsics.areEqual(str, "ma_coupon_amount")) {
                    composerStartRestartGroup.startReplaceGroup(538178964);
                    BoxKt.Box(modifierM1182clickableO2vRcR0$default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(538261176);
                    float f11 = 4;
                    a((i14 >> 12) & 112, composerStartRestartGroup, PaddingKt.m1343paddingVpY3zN4(modifierM1182clickableO2vRcR0$default, Dp.m3880constructorimpl(f11), Dp.m3880constructorimpl(f11)), str2, z7);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(537651375);
                if (Intrinsics.areEqual(str, "ma_coupon_amount")) {
                    composerStartRestartGroup.startReplaceGroup(537717684);
                    BoxKt.Box(modifierM1182clickableO2vRcR0$default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(537799896);
                    float f12 = 4;
                    f(xVar.f74401f, PaddingKt.m1346paddingqDBjuR0$default(modifierM1182clickableO2vRcR0$default, Dp.m3880constructorimpl(f12), 0.0f, Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(f12), 2, null), ContentScale.Companion.getFillBounds(), composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(16, 6, composerStartRestartGroup, companion);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-249268177);
                c(f7, function02, composerStartRestartGroup, ((i14 >> 12) & 14) | ((i14 >> 18) & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else if (j7 > 0) {
                composerStartRestartGroup.startReplaceGroup(-249078240);
                TextKt.m1772Text4IGK_g(C4618g.a(RangesKt.coerceAtLeast(MathKt.roundToInt(j7 / 1000.0f), 1), "秒后关闭"), (Modifier) null, Color.Companion.m2666getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.Companion.m3794getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null), composerStartRestartGroup, 3456, 0, 65522);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-248853056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(xVar, str, z6, j7, f7, z7, function0, function02, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final x f74367a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74368b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f74369c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f74370d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final float f74371e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final boolean f74372f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function0 f74373g;
                public final Function0 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final int f74374i;

                {
                    this.f74367a = xVar;
                    this.f74368b = str;
                    this.f74369c = z6;
                    this.f74370d = j7;
                    this.f74371e = f7;
                    this.f74372f = z7;
                    this.f74373g = function0;
                    this.h = function02;
                    this.f74374i = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74374i | 1);
                    v.e(this.f74367a, this.f74368b, this.f74369c, this.f74370d, this.f74371e, this.f74372f, this.f74373g, this.h, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(final String str, final Modifier modifier, ContentScale contentScale, Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-16623411);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i11 = i9;
        if ((i7 & 48) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i10 = i11 | 384;
        } else {
            i10 = i11;
            if ((i7 & 384) == 0) {
                i10 = i11 | (composerStartRestartGroup.changed(contentScale) ? 256 : 128);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (i12 != 0) {
                contentScale = ContentScale.Companion.getCrop();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-16623411, i10, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.RemoteImage (RadarMaCouponDialog.kt:489)");
            }
            ContentScale contentScale2 = contentScale;
            BiliImageKt.BiliImage(new ImageRequest(str).contentScale(contentScale).build(), modifier, (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, i10 & 112, 1020);
            contentScale = contentScale2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                contentScale = contentScale2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ContentScale contentScale3 = contentScale;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, modifier, contentScale3, i7, i8) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74380a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f74381b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ContentScale f74382c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f74383d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f74384e;

                {
                    this.f74380a = str;
                    this.f74381b = modifier;
                    this.f74382c = contentScale3;
                    this.f74383d = i7;
                    this.f74384e = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74383d | 1);
                    ContentScale contentScale4 = this.f74382c;
                    int i13 = this.f74384e;
                    v.f(this.f74380a, this.f74381b, contentScale4, (Composer) obj, iUpdateChangedFlags, i13);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final long g(long j7, String str) {
        Object obj;
        if (StringsKt.isBlank(str)) {
            return j7;
        }
        try {
            Result.Companion companion = Result.Companion;
            if (!StringsKt.Z(str, "#")) {
                str = "#" + str;
            }
            obj = Result.constructor-impl(Color.m2619boximpl(ColorKt.Color(android.graphics.Color.parseColor(str))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Color colorM2619boximpl = Color.m2619boximpl(j7);
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = colorM2619boximpl;
        }
        return ((Color) obj2).m2639unboximpl();
    }
}
