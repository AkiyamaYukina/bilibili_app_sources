package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.opd.app.bizcommon.radar.data.MaCouponVO;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponViewKt.class */
public final class RadarCouponViewKt {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final float r7, final float r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.RadarCouponViewKt.a(float, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent r13, final long r14, final long r16, final float r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 1209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.RadarCouponViewKt.b(com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent, long, long, float, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final float f7, final int i7, final long j7, @Nullable Composer composer) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1665053292);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1665053292, i9, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.CountdownTimer (RadarCouponView.kt:571)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object objMutableStateOf$default = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Long.valueOf(j7), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            MutableState mutableState = (MutableState) objMutableStateOf$default;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object radarCouponViewKt$CountdownTimer$1$1 = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                radarCouponViewKt$CountdownTimer$1$1 = new RadarCouponViewKt$CountdownTimer$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(radarCouponViewKt$CountdownTimer$1$1);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) radarCouponViewKt$CountdownTimer$1$1, composerStartRestartGroup, 6);
            long jLongValue = ((Number) mutableState.getValue()).longValue();
            long j8 = 3600;
            String strPadStart = StringsKt.padStart(String.valueOf(jLongValue / j8), 2, '0');
            long jLongValue2 = ((Number) mutableState.getValue()).longValue();
            long j9 = 60;
            String strPadStart2 = StringsKt.padStart(String.valueOf((jLongValue2 % j8) / j9), 2, '0');
            String strPadStart3 = StringsKt.padStart(String.valueOf(((Number) mutableState.getValue()).longValue() % j9), 2, '0');
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i10 = i9 & 112;
            h(strPadStart, f7, composerStartRestartGroup, i10);
            long sp = TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7);
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextStyle textStyle = new TextStyle(ColorKt.Color(4294967295L), sp, companion5.getW600(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null);
            TextAlign.Companion companion6 = TextAlign.Companion;
            int iM3794getCentere0LSkKk = companion6.m3794getCentere0LSkKk();
            float f8 = 1;
            TextKt.m1772Text4IGK_g(":", PaddingKt.m1344paddingVpY3zN4$default(companion3, com.bilibili.ad.reward.view.malllottery.k.a(f8, f7), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3794getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 6, 0, 65020);
            h(strPadStart2, f7, composerStartRestartGroup, i10);
            TextKt.m1772Text4IGK_g(":", PaddingKt.m1344paddingVpY3zN4$default(companion3, com.bilibili.ad.reward.view.malllottery.k.a(f8, f7), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion6.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4294967295L), TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7), companion5.getW600(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), composerStartRestartGroup, 6, 0, 65020);
            h(strPadStart3, f7, composerStartRestartGroup, i10);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion3, Dp.m3880constructorimpl(Dp.m3880constructorimpl(2) * f7)), composerStartRestartGroup, 0);
            TextKt.m1772Text4IGK_g("后过期", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.Companion.m2666getWhite0d7_KjU(), TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7), companion5.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), composerStartRestartGroup, 6, 0, 65534);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f7, j7, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f74434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f74435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f74436c;

                {
                    this.f74434a = j7;
                    this.f74435b = f7;
                    this.f74436c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74436c | 1);
                    long j10 = this.f74434a;
                    RadarCouponViewKt.c(this.f74435b, iUpdateChangedFlags, j10, (Composer) obj);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final MaCouponVO maCouponVO, @Nullable final String str, final float f7, @Nullable final String str2, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(651324327);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(maCouponVO) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str2) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1155) != 1154, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(651324327, i10, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.CouponBottomSection (RadarCouponView.kt:524)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl(Dp.m3880constructorimpl(33) * f7)), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            int couponFloatStatus = maCouponVO.getCouponFloatStatus();
            if (couponFloatStatus == 0) {
                composerStartRestartGroup.startReplaceGroup(1286125784);
                composerStartRestartGroup.endReplaceGroup();
            } else if (couponFloatStatus == 1) {
                composerStartRestartGroup.startReplaceGroup(1286192961);
                BiliImageKt.BiliImage(ImageRequest.useOrigin$default(new ImageRequest(str2 == null ? "" : str2), false, 1, (Object) null).build(), SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(56)), Dp.m3880constructorimpl(20)), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                composerStartRestartGroup.endReplaceGroup();
            } else if (couponFloatStatus == 2) {
                composerStartRestartGroup.startReplaceGroup(1286540781);
                TextKt.m1772Text4IGK_g("即将过期", OffsetKt.m1334offsetVpY3zN4$default(companion, 0.0f, Dp.m3880constructorimpl(-2), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.Companion.m2666getWhite0d7_KjU(), TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(12)) * f7), FontWeight.Companion.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), composerStartRestartGroup, 54, 0, 65532);
                composerStartRestartGroup.endReplaceGroup();
            } else if (couponFloatStatus != 3) {
                composerStartRestartGroup.startReplaceGroup(1287090721);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1286905899);
                c(f7, (i10 >> 3) & 112, maCouponVO.getCouponValidTime(), composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(maCouponVO, str, f7, str2, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MaCouponVO f74224a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74225b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f74226c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f74227d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f74228e;

                {
                    this.f74224a = maCouponVO;
                    this.f74225b = str;
                    this.f74226c = f7;
                    this.f74227d = str2;
                    this.f74228e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74228e | 1);
                    RadarCouponViewKt.d(this.f74224a, this.f74225b, this.f74226c, this.f74227d, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(@NotNull final RadarTriggerContent radarTriggerContent, final float f7, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708162079);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(radarTriggerContent) ? 4 : 2) | i7;
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
                ComposerKt.traceEventStart(-1708162079, i10, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.CouponCard (RadarCouponView.kt:397)");
            }
            MaCouponVO maCouponVO = radarTriggerContent.getMaCouponVO();
            if (maCouponVO == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(radarTriggerContent, f7, function0, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.x

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final RadarTriggerContent f74440a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final float f74441b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Function0 f74442c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f74443d;

                        {
                            this.f74440a = radarTriggerContent;
                            this.f74441b = f7;
                            this.f74442c = function0;
                            this.f74443d = i7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74443d | 1);
                            RadarCouponViewKt.e(this.f74440a, this.f74441b, this.f74442c, (Composer) obj, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            float fA = com.bilibili.ad.reward.view.malllottery.k.a(68, f7);
            float fA2 = com.bilibili.ad.reward.view.malllottery.k.a(84, f7);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, fA), fA2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(modifierM1358height3ABfNKs, (MutableInteractionSource) objMutableInteractionSource, null, false, null, null, function0, 28, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1182clickableO2vRcR0$default);
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
            String couponBgImg = radarTriggerContent.getCouponBgImg();
            if (couponBgImg == null || couponBgImg.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(461611247);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.Color(4294928025L), null, 2, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(461409313);
                String couponBgImg2 = radarTriggerContent.getCouponBgImg();
                String str = couponBgImg2;
                if (couponBgImg2 == null) {
                    str = "";
                }
                BiliImageKt.BiliImage(new ImageRequest(str).build(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i11 = (i10 << 3) & 896;
            g(maCouponVO, radarTriggerContent.getCouponTextColor(), f7, composerStartRestartGroup, i11);
            d(maCouponVO, radarTriggerContent.getCouponTextColor(), f7, radarTriggerContent.getCouponButtonImg(), composerStartRestartGroup, i11);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(radarTriggerContent, f7, function0, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final RadarTriggerContent f74444a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f74445b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f74446c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f74447d;

                {
                    this.f74444a = radarTriggerContent;
                    this.f74445b = f7;
                    this.f74446c = function0;
                    this.f74447d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74447d | 1);
                    RadarCouponViewKt.e(this.f74444a, this.f74445b, this.f74446c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.NotNull final com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent r13, final long r14, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.State<java.lang.Boolean> r16, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.State<java.lang.Boolean> r17, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.State<java.lang.Integer> r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.RadarCouponViewKt.f(com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent, long, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@NotNull final MaCouponVO maCouponVO, @Nullable final String str, final float f7, @Nullable Composer composer, final int i7) {
        int i8;
        long jM2666getWhite0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(548819000);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(maCouponVO) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(f7) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548819000, i10, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.CouponTopSection (RadarCouponView.kt:456)");
            }
            try {
                jM2666getWhite0d7_KjU = ColorKt.Color(android.graphics.Color.parseColor(str == null ? "#FFFFFF" : str));
            } catch (Exception e7) {
                jM2666getWhite0d7_KjU = Color.Companion.m2666getWhite0d7_KjU();
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1358height3ABfNKs(PaddingKt.m1344paddingVpY3zN4$default(companion2, com.bilibili.ad.reward.view.malllottery.k.a(5, f7), 0.0f, 2, null), Dp.m3880constructorimpl(Dp.m3880constructorimpl(51) * f7)), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion.getCenterVertically(), composerStartRestartGroup, 54);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(22)) * f7);
            String couponAmount = maCouponVO.getCouponAmount();
            long sp2 = sp;
            if (couponAmount != null) {
                sp2 = sp;
                if (couponAmount.length() == 4) {
                    sp2 = TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(18)) * f7);
                }
            }
            String couponAmount2 = maCouponVO.getCouponAmount();
            long j7 = sp2;
            if (couponAmount2 != null) {
                if (couponAmount2.length() >= 5) {
                    sp2 = TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(16)) * f7);
                }
                Unit unit = Unit.INSTANCE;
                j7 = sp2;
            }
            String couponAmount3 = maCouponVO.getCouponAmount();
            String str2 = couponAmount3;
            if (couponAmount3 == null) {
                str2 = "";
            }
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m1772Text4IGK_g(str2, (Modifier) companion2, jM2666getWhite0d7_KjU, j7, (FontStyle) null, companion4.getW600(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196656, 3072, 122832);
            String unit2 = maCouponVO.getUnit();
            if (unit2 == null) {
                unit2 = "";
            }
            TextKt.m1772Text4IGK_g(unit2, OffsetKt.m1334offsetVpY3zN4$default(companion2, 0.0f, Dp.m3880constructorimpl(2), 1, null), jM2666getWhite0d7_KjU, TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7), (FontStyle) null, companion4.getW600(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196656, 3072, 122832);
            composerStartRestartGroup.endNode();
            String couponSubTitle = maCouponVO.getCouponSubTitle();
            if (couponSubTitle == null || couponSubTitle.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-1744286528);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1744605890);
                TextKt.m1772Text4IGK_g(maCouponVO.getCouponSubTitle(), PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(0), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(jM2666getWhite0d7_KjU, TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7), companion4.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), composerStartRestartGroup, 48, 0, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(maCouponVO, str, f7, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.F

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MaCouponVO f74237a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74238b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f74239c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f74240d;

                {
                    this.f74237a = maCouponVO;
                    this.f74238b = str;
                    this.f74239c = f7;
                    this.f74240d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74240d | 1);
                    RadarCouponViewKt.g(this.f74237a, this.f74238b, this.f74239c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(@NotNull final String str, final float f7, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1547965211);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, 1 & i9)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547965211, i9, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.TimeBox (RadarCouponView.kt:633)");
            }
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(Dp.m3880constructorimpl(16) * f7)), Dp.m3880constructorimpl(Dp.m3880constructorimpl(13) * f7)), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(Dp.m3880constructorimpl(2) * f7))), Color.Companion.m2666getWhite0d7_KjU(), null, 2, null);
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
            TextKt.m1772Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4294928025L), TextUnitKt.getSp(TextUnit.m3990getValueimpl(TextUnitKt.getSp(10)) * f7), FontWeight.Companion.getW600(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), composerStartRestartGroup, i9 & 14, 0, 65022);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, f7, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74437a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f74438b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f74439c;

                {
                    this.f74437a = str;
                    this.f74438b = f7;
                    this.f74439c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74439c | 1);
                    RadarCouponViewKt.h(this.f74437a, this.f74438b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
