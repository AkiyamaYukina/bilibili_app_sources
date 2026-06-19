package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import Di0.C1602f;
import Fa.A;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
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
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.z;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImmutableImageRequest;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import mj0.C8003b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/n.class */
public final class n {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-913222216);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(ogvLimitedTimeFreeTicketsInfo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-913222216, i9, -1, "com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComponentA (OgvLimitedTimeFreeTicketsComponentA.kt:26)");
            }
            float f7 = 8;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifier, Brush.Companion.m2571horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(ColorKt.Color(2164252663L)), Color.m2619boximpl(ColorKt.Color(1558304255)), Color.m2619boximpl(ColorKt.Color(1423889918)), Color.m2619boximpl(ColorKt.Color(2279664639L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f7)), 0.0f, 4, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierA = H.a(f7, modifierBackground$default, biliTheme.getDayNightTheme(composerStartRestartGroup, i10) == ThemeDayNight.Night ? Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null) : Color.Companion.m2664getTransparent0d7_KjU());
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String str = (String) CollectionsKt.getOrNull(ogvLimitedTimeFreeTicketsInfo.f93238g.a(), 2);
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-821174017);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                ImmutableImageRequest immutableImageRequestA = z.a(ContentScale.Companion, A.a(composerStartRestartGroup, -821174016, str));
                float f8 = 4;
                BiliImageKt.BiliImage(immutableImageRequestA, J.a(C8003b.a(SizeKt.m1377width3ABfNKs(SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(17), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(34)), Dp.m3880constructorimpl(36)), new SolidColor(Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f8)), 4), f8), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, d.f93243a, (Function4) null, composerStartRestartGroup, 100663296, 764);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            LimitedTimeFreeImages limitedTimeFreeImages = ogvLimitedTimeFreeTicketsInfo.f93238g;
            String str2 = (String) CollectionsKt.getOrNull(limitedTimeFreeImages.a(), 1);
            if (str2 == null || StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-820429056);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                ImmutableImageRequest immutableImageRequestA2 = z.a(ContentScale.Companion, A.a(composerStartRestartGroup, -820429055, str2));
                float f9 = 4;
                BiliImageKt.BiliImage(immutableImageRequestA2, J.a(C8003b.a(SizeKt.m1377width3ABfNKs(SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(9), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(44)), Dp.m3880constructorimpl(36)), new SolidColor(Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f9)), 4), f9), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, d.f93244b, (Function4) null, composerStartRestartGroup, 100663296, 764);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            String str3 = (String) CollectionsKt.getOrNull(limitedTimeFreeImages.a(), 0);
            if (str3 == null || StringsKt.isBlank(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                composerStartRestartGroup.startReplaceGroup(-819691876);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(z.a(ContentScale.Companion, A.a(composerStartRestartGroup, -819691875, str3)), J.a(SizeKt.m1377width3ABfNKs(SizeKt.m1358height3ABfNKs(companion3, Dp.m3880constructorimpl(52)), Dp.m3880constructorimpl(39)), 4), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, d.f93245c, (Function4) null, composerStartRestartGroup, 100663296, 764);
                Unit unit3 = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(10, 6, composerStartRestartGroup, companion3);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str4 = ogvLimitedTimeFreeTicketsInfo.h.f93230b;
            TextStyle t12b = biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12b();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m1772Text4IGK_g(str4, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12b, composerStartRestartGroup, 0, 3120, 55290);
            float f10 = 3;
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion3, Dp.m3880constructorimpl(f10)), composerStartRestartGroup, 6);
            TextKt.m1772Text4IGK_g(ogvLimitedTimeFreeTicketsInfo.b().f93230b, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT11(), composerStartRestartGroup, 0, 3120, 55290);
            composerStartRestartGroup.endNode();
            String str5 = ogvLimitedTimeFreeTicketsInfo.f93240j.f91351a.f91414a;
            TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12();
            long j8 = biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU();
            float f11 = 12;
            Modifier modifierBorder = BorderKt.border(PaddingKt.m1344paddingVpY3zN4$default(companion3, Dp.m3880constructorimpl(f11), 0.0f, 2, null), BorderStrokeKt.m1178BorderStrokecXLIe8U(Dp.m3880constructorimpl((float) 0.5d), biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU()), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f11)));
            float f12 = (float) 14.5d;
            TextKt.m1772Text4IGK_g(str5, PaddingKt.m1345paddingqDBjuR0(modifierBorder, Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(f10), Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(4)), j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 0, 65528);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(ogvLimitedTimeFreeTicketsInfo, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvLimitedTimeFreeTicketsInfo f93264a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f93265b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f93266c;

                {
                    this.f93264a = ogvLimitedTimeFreeTicketsInfo;
                    this.f93265b = modifier;
                    this.f93266c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93266c | 1);
                    n.a(this.f93264a, this.f93265b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
