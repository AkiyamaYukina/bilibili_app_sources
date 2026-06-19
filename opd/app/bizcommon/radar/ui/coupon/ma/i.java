package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import Di0.C1602f;
import Fa.A;
import Fa.K;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.iconfont.KtxKt;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import java.util.Arrays;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/i.class */
public final class i {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final x xVar, final boolean z6, final boolean z7, final long j7, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i7) {
        int i8;
        int i9;
        Object obj;
        String str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1109360218);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(xVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i10 = i8;
        if ((i7 & 48) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        if ((i7 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(z7) ? 256 : 128;
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(j7) ? 2048 : 1024);
        }
        if ((i7 & 24576) == 0) {
            i9 = i11 | (composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192);
        } else {
            i9 = i11;
        }
        int i12 = i9;
        if ((i7 & 196608) == 0) {
            i12 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 74899) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109360218, i12, -1, "com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.BubbleContent (RadarMaCouponBubbleView.kt:239)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objMutableInteractionSource;
            String str2 = xVar.h;
            long jColor = ColorKt.Color(4294918528L);
            if (!StringsKt.isBlank(str2)) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (!StringsKt.Z(str2, "#")) {
                        str2 = "#" + str2;
                    }
                    obj = Result.constructor-impl(Color.m2619boximpl(ColorKt.Color(android.graphics.Color.parseColor(str2))));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Color colorM2619boximpl = Color.m2619boximpl(jColor);
                Object obj2 = obj;
                if (Result.isFailure-impl(obj)) {
                    obj2 = colorM2619boximpl;
                }
                jColor = ((Color) obj2).m2639unboximpl();
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(6));
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            float f7 = 8;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(PaddingKt.m1344paddingVpY3zN4$default(modifierFillMaxWidth$default, Dp.m3880constructorimpl(f7), 0.0f, 2, null), Dp.m3880constructorimpl(32));
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            O4.d.c(companion5, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String str3 = xVar.f74400e;
            if (StringsKt.isBlank(str3)) {
                composerStartRestartGroup.startReplaceGroup(-109730914);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(ClipKt.clip(ShadowKt.m2374shadows4CzXII$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(12), roundedCornerShapeM1502RoundedCornerShape0680j_4, false, 0L, 0L, 24, null), roundedCornerShapeM1502RoundedCornerShape0680j_4), Color.Companion.m2666getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(A.a(composerStartRestartGroup, -110045719, str3).contentScale(ContentScale.Companion.getFillBounds()).build(), ClipKt.clip(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), roundedCornerShapeM1502RoundedCornerShape0680j_4), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            float f8 = 4;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, Dp.m3880constructorimpl(f8), 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            O4.d.c(companion5, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            b bVar = xVar.f74405k;
            builder.append(bVar.f74333a);
            String str4 = bVar.f74334b;
            if (!StringsKt.isBlank(str4)) {
                int iPushStyle = builder.pushStyle(new SpanStyle(jColor, 0L, FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                try {
                    builder.append(str4);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    builder.pop(iPushStyle);
                }
            }
            builder.append(bVar.f74335c);
            if (j7 > 0) {
                long jCoerceAtLeast = RangesKt.coerceAtLeast(j7 / ((long) 1000), 0L);
                long j8 = 86400;
                long j9 = jCoerceAtLeast / j8;
                long j10 = 3600;
                long j11 = (jCoerceAtLeast % j8) / j10;
                long j12 = 60;
                long j13 = (jCoerceAtLeast % j10) / j12;
                long j14 = jCoerceAtLeast % j12;
                if (j9 > 0) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format("%d天%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j9), Long.valueOf(j11), Long.valueOf(j13), Long.valueOf(j14)}, 4));
                } else {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11), Long.valueOf(j13), Long.valueOf(j14)}, 3));
                }
                builder.append(str);
            }
            TextKt.m1773TextIbK3jfQ(builder.toAnnotatedString(), RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), ColorKt.Color(4281283128L), TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, null, composerStartRestartGroup, 3456, 3072, 253936);
            String str5 = bVar.f74337e;
            if (StringsKt.isBlank(str5)) {
                composerStartRestartGroup.startReplaceGroup(707144646);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                SpacerKt.Spacer(K.a(f7, 706487322, composerStartRestartGroup, companion3), composerStartRestartGroup, 6);
                BiliImageKt.BiliImage(new ImageRequest(str5).contentScale(ContentScale.Companion.getFillBounds()).build(), ClickableKt.m1182clickableO2vRcR0$default(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion3, Dp.m3880constructorimpl(64)), Dp.m3880constructorimpl(20)), mutableInteractionSource, null, z7, null, null, function0, 24, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z6) {
                SpacerKt.Spacer(K.a(f8, 707197811, composerStartRestartGroup, companion3), composerStartRestartGroup, 6);
                float f9 = 16;
                Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(f9)), false, null, null, null, function02, 15, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                O4.d.c(companion5, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                ImageKt.Image(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable(context, 2131239056), composerStartRestartGroup, 0), (String) null, SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, ColorKt.Color(4279769372L), 0, 2, null), composerStartRestartGroup, Painter.$stable | 1573296, 56);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(707984870);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(xVar, z6, z7, j7, function0, function02, i7) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final x f74346a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f74347b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f74348c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f74349d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f74350e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f74351f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f74352g;

                {
                    this.f74346a = xVar;
                    this.f74347b = z6;
                    this.f74348c = z7;
                    this.f74349d = j7;
                    this.f74350e = function0;
                    this.f74351f = function02;
                    this.f74352g = i7;
                }

                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f74352g | 1);
                    i.a(this.f74346a, this.f74347b, this.f74348c, this.f74349d, this.f74350e, this.f74351f, (Composer) obj3, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
