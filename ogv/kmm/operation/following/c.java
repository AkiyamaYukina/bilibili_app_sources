package com.bilibili.ogv.kmm.operation.following;

import Di0.C1602f;
import O4.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.contextmenu.internal.J;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.M0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.kmm.operation.following.BangumiFollowing;
import dk0.k;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import nl0.C8106C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/c.class */
public final class c {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final BangumiFollowing.b bVar, @NotNull final k kVar, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        String str;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-418079328);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(bVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(kVar) : composerStartRestartGroup.changedInstance(kVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-418079328, i10, -1, "com.bilibili.ogv.kmm.operation.following.BangumiFollowingCardUi (BangumiFollowingUi.kt:89)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.77f, false, 2, null);
            float f7 = 6;
            Modifier modifierA = J.a(modifierAspectRatio$default, f7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            d.c(companion2, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            kVar.getClass();
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1161603548, true, new Function3(kVar) { // from class: dk0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k f116476a;

                {
                    this.f116476a = kVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier modifier2 = (Modifier) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i11 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i11 = iIntValue | (composer2.changed(modifier2) ? 4 : 2);
                    }
                    if (composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1161603548, i11, -1, "com.bilibili.ogv.kmm.operation.following.CreateSwitchableCoverModel.invoke.<no name provided>.<get-coverUi>.<anonymous> (CreateSwtichableCoverModel.kt:37)");
                        }
                        k kVar2 = this.f116476a;
                        String str3 = (String) kVar2.f116478b.getValue();
                        String str4 = str3;
                        if (str3 == null) {
                            str4 = "";
                        }
                        C8106C.b(str4, ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(modifier2, kVar2.f116480d), 1.77f, 0.0f, composer2, 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            });
            if (composableLambdaComposableLambdaInstance == null) {
                composerStartRestartGroup.startReplaceGroup(816829517);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(857633332);
                composableLambdaComposableLambdaInstance.invoke(companion3, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            }
            Painter painterPainterResource = ImageResourcesKt.painterResource((DrawableResource) Ua1.a.a.getValue(), composerStartRestartGroup, 0);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, Dp.m3880constructorimpl(10), 6, null);
            float f8 = 40;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m1372size3ABfNKs(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f8)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
            com.bilibili.ogv.kmm.operation.api.k kVar2 = bVar.f68307d;
            boolean z6 = (kVar2 == null || (str2 = kVar2.f68009a) == null || !(StringsKt.isBlank(str2) ^ true)) ? false : true;
            int i11 = bVar.f68306c;
            if (z6 || i11 > 0) {
                composerStartRestartGroup.startReplaceGroup(817224830);
                Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(f8));
                Brush.Companion companion4 = Brush.Companion;
                Color.Companion companion5 = Color.Companion;
                Modifier modifierBackground$default = BackgroundKt.background$default(modifierM1358height3ABfNKs, Brush.Companion.m2579verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(companion5.m2664getTransparent0d7_KjU()), Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion5.m2655getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
                float f9 = 4;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m1343paddingVpY3zN4(modifierBackground$default, fM3880constructorimpl, Dp.m3880constructorimpl(f9)), companion.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getBottom(), companion.getEnd(), composerStartRestartGroup, 54);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                d.c(companion2, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                com.bilibili.ogv.kmm.operation.api.k kVar3 = bVar.f68307d;
                if ((kVar3 == null || (str = kVar3.f68009a) == null || !(StringsKt.isBlank(str) ^ true)) ? false : true) {
                    composerStartRestartGroup.startReplaceGroup(1390393049);
                    String str3 = kVar3.f68009a;
                    BiliTheme biliTheme = BiliTheme.INSTANCE;
                    int i12 = BiliTheme.$stable;
                    BasicTextKt.m1512BasicTextRWo7tUw(str3, PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(52), 0.0f, 0.0f, 0.0f, 14, null), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT10(), biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597488, 936);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1390774287);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (i11 > 0) {
                    SpacerKt.Spacer(M0.a(f9, 1390830924, composerStartRestartGroup, companion3), composerStartRestartGroup, 6);
                    C8106C.h(i11 / 100.0f, 0, 2, composerStartRestartGroup, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1390987567);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(818762430);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            C8106C.j(0, 0, 6, composerStartRestartGroup, null, bVar.f68304a);
            C8106C.i(null, bVar.f68305b, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(bVar, kVar, modifier, i7) { // from class: dk0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiFollowing.b f116472a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final k f116473b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f116474c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f116475d;

                {
                    this.f116472a = bVar;
                    this.f116473b = kVar;
                    this.f116474c = modifier;
                    this.f116475d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f116475d | 1);
                    k kVar4 = this.f116473b;
                    Modifier modifier2 = this.f116474c;
                    com.bilibili.ogv.kmm.operation.following.c.a(this.f116472a, kVar4, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x030a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.following.BangumiFollowing r33, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.following.c.b(com.bilibili.ogv.kmm.operation.following.BangumiFollowing, androidx.compose.ui.Modifier, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int):void");
    }
}
