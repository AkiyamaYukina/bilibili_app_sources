package com.bilibili.pegasus.keywordblocker;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AbstractC4464g0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.m0;
import com.bilibili.app.comm.list.common.utils.KeywordBlockerSettingHelper;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.compose.widget.BiliTopAppBarKt;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.kmm.keywordblocker.KeywordBlockPageStatus;
import com.bilibili.pegasus.kmm.keywordblocker.b;
import com.bilibili.search2.api.SearchBangumiItem;
import com.mall.data.page.ipstory.bean.IpStoryItemBean;
import com.mall.ui.page.ip.view.BarrageKt;
import com.mall.ui.page.ip.view.IPFragmentV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/k.class */
public final class k {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/k$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78237a;

        static {
            int[] iArr = new int[KeywordBlockPageStatus.values().length];
            try {
                iArr[KeywordBlockPageStatus.Empty.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[KeywordBlockPageStatus.AddingEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[KeywordBlockPageStatus.LoadedWithData.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[KeywordBlockPageStatus.Editing.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[KeywordBlockPageStatus.Adding.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f78237a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.g0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final com.bilibili.pegasus.kmm.keywordblocker.d dVar, @NotNull final Function1<? super com.bilibili.pegasus.kmm.keywordblocker.b, Unit> function1, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composer2;
        AnnotatedString annotatedString;
        Composer composerStartRestartGroup = composer.startRestartGroup(973968496);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(dVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973968496, i9, -1, "com.bilibili.pegasus.keywordblocker.KeywordBlockerPage (BlockerPage.kt:59)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxSize$default, biliTheme.getColors(composerStartRestartGroup, i10).getBg1-0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            KeywordBlockerSettingHelper.KeywordBlockerInfo keywordBlockerInfo = KeywordBlockerSettingHelper.a;
            BiliTopAppBarKt.BiliTopAppBar-942rkJo(keywordBlockerInfo.getPageTitle(), (Modifier) null, 0.0f, ComposableLambdaKt.rememberComposableLambda(362282291, true, new Function3(dVar, function1) { // from class: com.bilibili.pegasus.keywordblocker.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.pegasus.kmm.keywordblocker.d f78230a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78231b;

                {
                    this.f78230a = dVar;
                    this.f78231b = function1;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x01e6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 603
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            int i11 = a.f78237a[dVar.f78262b.ordinal()];
            KeywordBlockPageStatus keywordBlockPageStatus = dVar.f78262b;
            if (i11 == 1 || i11 == 2) {
                composerStartRestartGroup.startReplaceGroup(1545678420);
                Modifier modifierThen = boxScopeInstance.align(companion, companion2.getTopCenter()).then(new AbstractC4464g0(InspectableValueKt.f44956a));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
                O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                BiliImageKt.BiliImage(BiliImageLoaderHelper.resourceToUri$default((String) null, 2131236937, 1, (Object) null), SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(280)), Dp.m3880constructorimpl(154)), "Loading view", false, 0, (String) null, false, (Function3) null, companion2.getCenter(), ContentScale.Companion.getFit(), biliTheme.getDayNightTheme(composerStartRestartGroup, i10) == ThemeDayNight.Night ? 0.5f : 1.0f, (ColorFilter) null, composerStartRestartGroup, 905970096, 0, 2296);
                float f7 = 6;
                float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
                float f8 = 48;
                Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(f8), fM3880constructorimpl, Dp.m3880constructorimpl(f8), 0.0f, 8, null);
                long jColorResource = ColorResources_androidKt.colorResource(R$color.Text1, composerStartRestartGroup, 0);
                long sp = TextUnitKt.getSp(16);
                FontWeight bold = FontWeight.Companion.getBold();
                String emptyTitle = keywordBlockerInfo.getEmptyTitle();
                String str = emptyTitle;
                if (emptyTitle == null) {
                    str = "";
                }
                TextKt.m1772Text4IGK_g(str, modifierM1346paddingqDBjuR0$default, jColorResource, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
                String emptySubTitle = keywordBlockerInfo.getEmptySubTitle();
                if (emptySubTitle != null) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(emptySubTitle);
                    annotatedString = builder.toAnnotatedString();
                } else {
                    annotatedString = null;
                }
                if (annotatedString == null) {
                    AnnotatedString.Builder builderA = m0.a(composerStartRestartGroup, -1111053018, 0, 1, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-35838862);
                    int iPushStyle = builderA.pushStyle(new SpanStyle(biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builderA.append(StringResources_androidKt.stringResource(2131841479, composerStartRestartGroup, 0));
                        Unit unit = Unit.INSTANCE;
                        builderA.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        builderA.append(StringResources_androidKt.stringResource(2131845373, composerStartRestartGroup, 0));
                        annotatedString = builderA.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                    } catch (Throwable th) {
                        builderA.pop(iPushStyle);
                        throw th;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-35847798);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextKt.m1773TextIbK3jfQ(annotatedString, PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f8), 0.0f, 8, null), biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3072, 0, 262128);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                composerStartRestartGroup.startReplaceGroup(1548136751);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl4 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM2296constructorimpl4, currentCompositionLocalMap4);
                Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
                String deleteWordsDesc = keywordBlockPageStatus == KeywordBlockPageStatus.Editing ? keywordBlockerInfo.getDeleteWordsDesc() : keywordBlockerInfo.getBlockerWordsDesc();
                String str2 = deleteWordsDesc;
                if (deleteWordsDesc == null) {
                    str2 = "";
                }
                float f9 = 16;
                TextKt.m1772Text4IGK_g(str2, PaddingKt.m1345paddingqDBjuR0(companion, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(18), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(10)), biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 48, 129008);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl5 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl5, measurePolicyColumnMeasurePolicy4, composerM2296constructorimpl5, currentCompositionLocalMap5);
                Updater.m2304setimpl(composerM2296constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl5, Integer.valueOf(iHashCode5), composerM2296constructorimpl5));
                b(dVar, function1, composerStartRestartGroup, i9 & SearchBangumiItem.TYPE_FULLNET_MOVIE);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceGroup(1549062845);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endNode();
            if (keywordBlockPageStatus == KeywordBlockPageStatus.Editing || keywordBlockPageStatus == KeywordBlockPageStatus.Adding || keywordBlockPageStatus == KeywordBlockPageStatus.AddingEmpty) {
                composerStartRestartGroup.startReplaceGroup(1720856156);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1719726981);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                float f10 = 16;
                float fM3880constructorimpl2 = Dp.m3880constructorimpl(f10);
                float fM3880constructorimpl3 = Dp.m3880constructorimpl(8);
                float fM3880constructorimpl4 = Dp.m3880constructorimpl(f10);
                float f11 = 40;
                Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(modifierFillMaxWidth$default, fM3880constructorimpl2, fM3880constructorimpl3, fM3880constructorimpl4, Dp.m3880constructorimpl(f11));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1345paddingqDBjuR0);
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl6 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl6, currentCompositionLocalMap6);
                Updater.m2304setimpl(composerM2296constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl6, Integer.valueOf(iHashCode6), composerM2296constructorimpl6));
                Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(f11));
                RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(20));
                BorderStroke borderStrokeM1178BorderStrokecXLIe8U = BorderStrokeKt.m1178BorderStrokecXLIe8U(Dp.m3880constructorimpl((float) 0.5d), biliTheme.getColors(composerStartRestartGroup, i10).getLine_bold-0d7_KjU());
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getBg1-0d7_KjU();
                long j8 = biliTheme.getColors(composerStartRestartGroup, i10).getText2-0d7_KjU();
                int i12 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM1640buttonColorsro_MJ88 = buttonDefaults.m1640buttonColorsro_MJ88(j7, j8, 0L, 0L, composerStartRestartGroup, i12 << 12, 12);
                float f12 = 0;
                ButtonElevation buttonElevationM1641elevationR_JCAzs = buttonDefaults.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(f12), 0.0f, Dp.m3880constructorimpl(f12), Dp.m3880constructorimpl(f12), composerStartRestartGroup, (i12 << 15) | 27702, 4);
                boolean z6 = (i9 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue == Composer.Companion.getEmpty()) {
                    final int i13 = 0;
                    objRememberedValue = new Function0(i13, function1) { // from class: com.bilibili.pegasus.keywordblocker.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f78232a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Function1 f78233b;

                        {
                            this.f78232a = i13;
                            this.f78233b = function1;
                        }

                        public final Object invoke() {
                            switch (this.f78232a) {
                                case 0:
                                    this.f78233b.invoke(new b.f(null));
                                    break;
                                default:
                                    this.f78233b.invoke(2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ButtonKt.Button((Function0) objRememberedValue, modifierM1358height3ABfNKs, false, null, buttonElevationM1641elevationR_JCAzs, roundedCornerShapeM1502RoundedCornerShape0680j_4, borderStrokeM1178BorderStrokecXLIe8U, buttonColorsM1640buttonColorsro_MJ88, null, m.f78239a, composerStartRestartGroup, 805306416, 268);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composerStartRestartGroup;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(dVar, function1, i7) { // from class: com.bilibili.pegasus.keywordblocker.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.pegasus.kmm.keywordblocker.d f78234a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78235b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f78236c;

                {
                    this.f78234a = dVar;
                    this.f78235b = function1;
                    this.f78236c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78236c | 1);
                    k.a(this.f78234a, this.f78235b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final com.bilibili.pegasus.kmm.keywordblocker.d dVar, final Function1<? super com.bilibili.pegasus.kmm.keywordblocker.b, Unit> function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-783229530);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(dVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783229530, i9, -1, "com.bilibili.pegasus.keywordblocker.loadFlowRow (BlockerPage.kt:209)");
            }
            FlowLayoutKt.FlowRow(PaddingKt.m1343paddingVpY3zN4(Modifier.Companion, Dp.m3880constructorimpl(10), Dp.m3880constructorimpl(0)), null, null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1302582047, true, new Function3(dVar, function1) { // from class: com.bilibili.pegasus.keywordblocker.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.pegasus.kmm.keywordblocker.d f78219a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78220b;

                {
                    this.f78219a = dVar;
                    this.f78220b = function1;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x02e1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 1027
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, dVar, function1) { // from class: com.bilibili.pegasus.keywordblocker.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f78221a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f78222b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f78223c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f78224d;

                {
                    this.f78221a = i10;
                    this.f78224d = dVar;
                    this.f78222b = function1;
                    this.f78223c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f78221a) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78223c | 1);
                            k.b((com.bilibili.pegasus.kmm.keywordblocker.d) this.f78224d, (Function1) this.f78222b, (Composer) obj, iUpdateChangedFlags);
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f78223c | 1);
                            com.bilibili.videoshortcut.sidecenter.setting.h.b((List) this.f78224d, (Function1) this.f78222b, (Composer) obj, iUpdateChangedFlags2);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f78223c | 1);
                            BarrageKt.b((IPFragmentV2) this.f78224d, (IpStoryItemBean) this.f78222b, (Composer) obj, iUpdateChangedFlags3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
