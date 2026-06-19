package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import Di0.C1602f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4150n7;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.ViewBinding;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.m0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.M;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;
import fu0.C7184f;
import java.util.Map;
import kntr.app.ad.uikit.components.button.download.DownloadButtonUIStyle;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/L.class */
@StabilityInferred(parameters = 0)
public final class L extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<C7184f> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final State<M.a> f89641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final T9.j f89642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C6102x f89643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f89644o = true;

    public L(@NotNull State state, @NotNull T9.j jVar, @NotNull C6102x c6102x) {
        this.f89641l = state;
        this.f89642m = jVar;
        this.f89643n = c6102x;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        ((C7184f) viewBinding).f119541a.setContent(ComposableLambdaKt.composableLambdaInstance(-504762378, true, new androidx.navigation3.ui.l(this, 1)));
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7184f c7184fInflate = C7184f.inflate(layoutInflater, viewGroup, false);
        c7184fInflate.f119541a.setNestedScrollingEnabled(true);
        return c7184fInflate;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f89644o;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0258  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails r27, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.L.m(com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void n(@Nullable Modifier modifier, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1469831860);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1469831860, i8, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheeseRelatedCoursesFloatLayerComponent.ErrorContent (CheeseRelatedCoursesFloatLayerComponent.kt:390)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            Painter painterA = Ij0.c.a(2131244965, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            ImageKt.Image(painterA, (String) null, SizeKt.m1372size3ABfNKs(companion2, Dp.m3880constructorimpl(140)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(6, 6, composerStartRestartGroup, companion2);
            String strStringResource = StringResources_androidKt.stringResource(2131841569, composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.digital.card.page.card.cardmodule.g(i7, 1, modifier, this));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void o(@NotNull final RelatedCoursesDetails.Item item, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-671847188);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | ((i7 & 512) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-671847188, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheeseRelatedCoursesFloatLayerComponent.ItemContent (CheeseRelatedCoursesFloatLayerComponent.kt:163)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = item.f89671j;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextStyle t14b = biliTheme.getTextStyle(composerStartRestartGroup, i11).getT14b();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU();
            TextOverflow.Companion companion3 = TextOverflow.Companion;
            int iM3827getEllipsisgIe3tQ8 = companion3.m3827getEllipsisgIe3tQ8();
            Modifier.Companion companion4 = Modifier.Companion;
            float f7 = 12;
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1344paddingVpY3zN4$default(companion4, Dp.m3880constructorimpl(f7), 0.0f, 2, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t14b, composerStartRestartGroup, 48, 3120, 55288);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(IntrinsicKt.height(PaddingKt.m1344paddingVpY3zN4$default(companion4, com.bilibili.ad.reward.view.playable.B.a(10, companion4, composerStartRestartGroup, 6, f7), 0.0f, 2, null), IntrinsicSize.Min), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m1377width3ABfNKs(companion4, Dp.m3880constructorimpl(135)), 1.7763158f, false, 2, null);
            float f8 = 6;
            Modifier modifierA = androidx.compose.foundation.text.contextmenu.internal.J.a(modifierAspectRatio$default, f8);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageRequest imageRequest = new ImageRequest(item.f89667e);
            Unit unit = Unit.INSTANCE;
            BiliImageKt.BiliImage(imageRequest.build(), SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, Q.f89652a, composerStartRestartGroup, 805306416, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR);
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion4, companion.getBottomCenter()), 0.0f, 1, null), Dp.m3880constructorimpl(28));
            Brush.Companion companion5 = Brush.Companion;
            Color.Companion companion6 = Color.Companion;
            SpacerKt.Spacer(BackgroundKt.background$default(modifierM1358height3ABfNKs, Brush.Companion.m2579verticalGradient8A3gB4$default(companion5, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion6.m2655getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion6.m2655getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion.getBottomStart()), Dp.m3880constructorimpl(f8), 0.0f, 0.0f, Dp.m3880constructorimpl(4), 6, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl4, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            ImageKt.Image(Ij0.c.a(2131235038, composerStartRestartGroup, 0), (String) null, SizeKt.m1372size3ABfNKs(companion4, Dp.m3880constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i11).getGraph_white-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
            float f9 = 3;
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(f9, 6, composerStartRestartGroup, companion4);
            TextKt.m1772Text4IGK_g(item.f89670i, (Modifier) companion4, biliTheme.getColors(composerStartRestartGroup, i11).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion3.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT10(), composerStartRestartGroup, 48, 3120, 55288);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(8, 6, composerStartRestartGroup, companion4);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl5, currentCompositionLocalMap5);
            Updater.m2304setimpl(composerM2296constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl5, Integer.valueOf(iHashCode5), composerM2296constructorimpl5));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            int i12 = 4480 | ((i10 << 3) & 7168);
            q(i12, composerStartRestartGroup, modifierFillMaxWidth$default2, item.f89669g, item.h);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            TextKt.m1772Text4IGK_g(item.f89663a, PaddingKt.m1346paddingqDBjuR0$default(companion4, 0.0f, Dp.m3880constructorimpl(2), 0.0f, 0.0f, 13, null), biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion3.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12(), composerStartRestartGroup, 48, 3120, 55288);
            boolean zA = item.a();
            RelatedCoursesDetails.Price price = item.f89665c;
            if (zA) {
                composerStartRestartGroup.startReplaceGroup(-1743972345);
                TextKt.m1772Text4IGK_g(price.f89674b, (Modifier) companion4, biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion3.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12b(), composerStartRestartGroup, 48, 3120, 55288);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                boolean zIsBlank = StringsKt.isBlank(price.f89673a);
                RelatedCoursesDetails.Price price2 = item.f89664b;
                if (zIsBlank) {
                    composerStartRestartGroup.startReplaceGroup(-1743531618);
                    p(i12, composerStartRestartGroup, companion4, price2.f89673a, price2.f89675c);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1743348284);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getBottom(), composerStartRestartGroup, 48);
                    int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor6 = companion2.getConstructor();
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
                    O4.d.c(companion2, composerM2296constructorimpl6, measurePolicyRowMeasurePolicy3, composerM2296constructorimpl6, currentCompositionLocalMap6);
                    Updater.m2304setimpl(composerM2296constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl6, Integer.valueOf(iHashCode6), composerM2296constructorimpl6));
                    p(i12, composerStartRestartGroup, companion4, price.f89673a, price.f89675c);
                    com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(f9, 6, composerStartRestartGroup, companion4);
                    TextKt.m1772Text4IGK_g(price.f89674b, (Modifier) companion4, biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion3.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12b(), composerStartRestartGroup, 48, 3120, 55288);
                    com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(f9, 6, composerStartRestartGroup, companion4);
                    StringBuilder sbA = androidx.compose.ui.autofill.r.a(price2.f89673a);
                    sbA.append(price2.f89675c);
                    TextKt.m1772Text4IGK_g(sbA.toString(), (Modifier) companion4, biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion3.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getLineThrough(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null), composerStartRestartGroup, 48, 3120, 55288);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (C4150n7.b(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i13 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, item, modifier, i7, i13) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f89618a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f89619b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f89620c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f89621d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Object f89622e;

                {
                    this.f89618a = i13;
                    this.f89621d = this;
                    this.f89622e = item;
                    this.f89619b = modifier;
                    this.f89620c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = this.f89618a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i14) {
                        case 0:
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89620c | 1);
                            ((L) this.f89621d).o((RelatedCoursesDetails.Item) this.f89622e, this.f89619b, composer2, iUpdateChangedFlags);
                            break;
                        default:
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f89620c | 1);
                            kntr.app.ad.uikit.components.button.download.a.a((DownloadButtonUIStyle) this.f89621d, (kntr.app.ad.uikit.components.button.download.b) this.f89622e, this.f89619b, composer2, iUpdateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void p(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str, @NotNull final String str2) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-602225584);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, 1 & i10)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-602225584, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheeseRelatedCoursesFloatLayerComponent.Price (CheeseRelatedCoursesFloatLayerComponent.kt:305)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composerStartRestartGroup, 48);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextStyle t14b = biliTheme.getTextStyle(composerStartRestartGroup, i11).getT14b();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU();
            TextOverflow.Companion companion2 = TextOverflow.Companion;
            int iM3827getEllipsisgIe3tQ8 = companion2.m3827getEllipsisgIe3tQ8();
            Modifier.Companion companion3 = Modifier.Companion;
            TextKt.m1772Text4IGK_g(str, (Modifier) companion3, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t14b, composerStartRestartGroup, (i10 & 14) | 48, 3120, 55288);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(2, 6, composerStartRestartGroup, companion3);
            TextKt.m1772Text4IGK_g(str2, (Modifier) companion3, biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion2.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12b(), composerStartRestartGroup, ((i10 >> 3) & 14) | 48, 3120, 55288);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, str2, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.G

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final L f89628a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f89629b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f89630c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f89631d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f89632e;

                {
                    this.f89628a = this;
                    this.f89629b = str;
                    this.f89630c = str2;
                    this.f89631d = modifier;
                    this.f89632e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89632e | 1);
                    String str3 = this.f89630c;
                    Modifier modifier2 = this.f89631d;
                    this.f89628a.p(iUpdateChangedFlags, (Composer) obj, modifier2, this.f89629b, str3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void q(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str, final boolean z6) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(275731908);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(275731908, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheeseRelatedCoursesFloatLayerComponent.Title (CheeseRelatedCoursesFloatLayerComponent.kt:335)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z6) {
                AnnotatedString.Builder builderA = m0.a(composerStartRestartGroup, 380062037, 0, 1, (DefaultConstructorMarker) null);
                InlineTextContentKt.appendInlineContent$default(builderA, "inlineIcon", null, 2, null);
                builderA.append(" " + str);
                AnnotatedString annotatedString = builderA.toAnnotatedString();
                Map mapMapOf = MapsKt.mapOf(TuplesKt.to("inlineIcon", new InlineTextContent(new Placeholder(TextUnitKt.getSp(16), TextUnitKt.getSp(16), PlaceholderVerticalAlign.Companion.m3549getCenterJ6kI3mc(), null), Q.f89653b)));
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                TextKt.m1773TextIbK3jfQ(annotatedString, Modifier.Companion, biliTheme.getColors(composerStartRestartGroup, i11).getBrand_pink-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 2, 0, mapMapOf, null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT14b(), composerStartRestartGroup, 48, 3120, 88056);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(381573845);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i12 = BiliTheme.$stable;
                TextKt.m1772Text4IGK_g(str, (Modifier) Modifier.Companion, biliTheme2.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme2.getTextStyle(composerStartRestartGroup, i12).getT14(), composerStartRestartGroup, (i10 & 14) | 48, 3120, 55288);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, z6, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.F

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final L f89623a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f89624b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f89625c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f89626d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f89627e;

                {
                    this.f89623a = this;
                    this.f89624b = str;
                    this.f89625c = z6;
                    this.f89626d = modifier;
                    this.f89627e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89627e | 1);
                    boolean z7 = this.f89625c;
                    Modifier modifier2 = this.f89626d;
                    this.f89623a.q(iUpdateChangedFlags, (Composer) obj, modifier2, this.f89624b, z7);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
