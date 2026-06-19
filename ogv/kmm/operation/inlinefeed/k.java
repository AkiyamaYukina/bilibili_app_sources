package com.bilibili.ogv.kmm.operation.inlinefeed;

import Di0.C1602f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import kntr.app.tribee.consume.page.f0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/k.class */
public final class k {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2026195351);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026195351, i9, -1, "com.bilibili.ogv.kmm.operation.inlinefeed.CinemaFeedTitle (CinemaInlineFeedUi.kt:42)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextStyle textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i10).getT16b(), biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            float f7 = 12;
            BasicTextKt.m1512BasicTextRWo7tUw(str, PaddingKt.m1345paddingqDBjuR0(modifier, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(10), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(6)), textStyleM3586copyp1EtxEg$default, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, i9 & 14, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, modifier, i7) { // from class: com.bilibili.ogv.kmm.operation.inlinefeed.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f68392a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68393b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68394c;

                {
                    this.f68392a = str;
                    this.f68393b = modifier;
                    this.f68394c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.a(RecomposeScopeImplKt.updateChangedFlags(this.f68394c | 1), (Composer) obj, this.f68393b, this.f68392a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.inlinefeed.a.c r35, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.kmm.operation.inlinevideo.b r36, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1 r37, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.operation3.module.feedback.g r38, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 3121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.inlinefeed.k.b(com.bilibili.ogv.kmm.operation.inlinefeed.a$c, com.bilibili.ogv.kmm.operation.inlinevideo.b, com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1, com.bilibili.ogv.operation3.module.feedback.g, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final y yVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1852706193);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(yVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, 1 & i9)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1852706193, i9, -1, "com.bilibili.ogv.kmm.operation.inlinefeed.CinemaInlineTagItem (CinemaInlineFeedUi.kt:223)");
            }
            int i10 = yVar.f68464a;
            if (i10 == 2) {
                composerStartRestartGroup.startReplaceGroup(-654354297);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, PaddingKt.m1343paddingVpY3zN4(H.a(2, SizeKt.wrapContentSize$default(modifier, null, false, 3, null), Color.m2628copywmQWz5c$default(biliTheme.getColors(composerStartRestartGroup, i11).getOr5-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m3880constructorimpl(4), Dp.m3880constructorimpl((float) 0.5d)), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i11).getT10(), biliTheme.getColors(composerStartRestartGroup, i11).getOr5-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 936);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i10 == 3) {
                composerStartRestartGroup.startReplaceGroup(-653741799);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i12 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, PaddingKt.m1343paddingVpY3zN4(H.a(2, SizeKt.wrapContentSize$default(modifier, null, false, 3, null), Color.m2628copywmQWz5c$default(biliTheme2.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m3880constructorimpl(4), Dp.m3880constructorimpl((float) 0.5d)), TextStyle.m3586copyp1EtxEg$default(biliTheme2.getTextStyle(composerStartRestartGroup, i12).getT10(), biliTheme2.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 936);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (i10 == 5) {
                composerStartRestartGroup.startReplaceGroup(-653139841);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
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
                Lazy lazy = Ua1.a.d;
                Painter painterPainterResource = ImageResourcesKt.painterResource((DrawableResource) lazy.getValue(), composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                float f7 = 12;
                Modifier modifierM1377width3ABfNKs = SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(f7));
                ColorFilter.Companion companion3 = ColorFilter.Companion;
                BiliTheme biliTheme3 = BiliTheme.INSTANCE;
                int i13 = BiliTheme.$stable;
                ColorFilter colorFilterM2671tintxETnrds$default = ColorFilter.Companion.m2671tintxETnrds$default(companion3, biliTheme3.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0, 2, null);
                int i14 = Painter.$stable;
                ImageKt.Image(painterPainterResource, "icon", modifierM1377width3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM2671tintxETnrds$default, composerStartRestartGroup, i14 | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme3.getTextStyle(composerStartRestartGroup, i13).getT13(), biliTheme3.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
                ImageKt.Image(ImageResourcesKt.painterResource((DrawableResource) lazy.getValue(), composerStartRestartGroup, 0), "icon", GraphicsLayerModifierKt.m2702graphicsLayer_6ThJ44$default(SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(f7)), -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524286, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(companion3, biliTheme3.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0, 2, null), composerStartRestartGroup, i14 | 48, 56);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            } else if (i10 != 6) {
                composerStartRestartGroup.startReplaceGroup(-651618671);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceGroup(-652137797);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
                O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ImageKt.Image(ImageResourcesKt.painterResource((DrawableResource) Ua1.a.b.getValue(), composerStartRestartGroup, 0), "icon", SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
                BiliTheme biliTheme4 = BiliTheme.INSTANCE;
                int i15 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme4.getTextStyle(composerStartRestartGroup, i15).getT13(), biliTheme4.getColors(composerStartRestartGroup, i15).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit5 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i16 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i16, modifier, yVar) { // from class: com.bilibili.ogv.kmm.operation.inlinefeed.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f68403a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68404b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68405c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f68406d;

                {
                    this.f68403a = i16;
                    this.f68406d = yVar;
                    this.f68404b = modifier;
                    this.f68405c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i17 = this.f68403a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i17) {
                        case 0:
                            k.c((y) this.f68406d, this.f68404b, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f68405c | 1));
                            break;
                        default:
                            f0.h(RecomposeScopeImplKt.updateChangedFlags(this.f68405c | 1), composer2, this.f68404b, (String) this.f68406d);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
