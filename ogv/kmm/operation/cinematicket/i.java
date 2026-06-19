package com.bilibili.ogv.kmm.operation.cinematicket;

import Di0.C1602f;
import Fa.K;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import com.bilibili.app.history.widget.m;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.kmm.operation.inlinefeed.y;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/i.class */
public final class i {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(y yVar, Modifier modifier, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1539425911);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(yVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1539425911, i9, -1, "com.bilibili.ogv.kmm.operation.cinematicket.CinemaTicketInlineTagItem (CinemaTicketInlineUi.kt:219)");
            }
            int i10 = yVar.f68464a;
            if (i10 == 2) {
                composerStartRestartGroup.startReplaceGroup(623630220);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, modifier, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12(), biliTheme.getColors(composerStartRestartGroup, i11).getOperate_orange-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, (i9 & 112) | 1597440, 936);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i10 == 3) {
                composerStartRestartGroup.startReplaceGroup(623948373);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i12 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, modifier, TextStyle.m3586copyp1EtxEg$default(biliTheme2.getTextStyle(composerStartRestartGroup, i12).getT12(), biliTheme2.getColors(composerStartRestartGroup, i12).getText2-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, (i9 & 112) | 1597440, 936);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i10 == 5) {
                composerStartRestartGroup.startReplaceGroup(624254715);
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
                ColorFilter colorFilterM2671tintxETnrds$default = ColorFilter.Companion.m2671tintxETnrds$default(companion3, biliTheme3.getColors(composerStartRestartGroup, i13).getOperate_orange-0d7_KjU(), 0, 2, null);
                int i14 = Painter.$stable;
                ImageKt.Image(painterPainterResource, "icon", modifierM1377width3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM2671tintxETnrds$default, composerStartRestartGroup, i14 | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme3.getTextStyle(composerStartRestartGroup, i13).getT12(), biliTheme3.getColors(composerStartRestartGroup, i13).getOperate_orange-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
                ImageKt.Image(ImageResourcesKt.painterResource((DrawableResource) lazy.getValue(), composerStartRestartGroup, 0), "icon", GraphicsLayerModifierKt.m2702graphicsLayer_6ThJ44$default(SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(f7)), -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524286, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(companion3, biliTheme3.getColors(composerStartRestartGroup, i13).getOperate_orange-0d7_KjU(), 0, 2, null), composerStartRestartGroup, i14 | 48, 56);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (i10 != 6) {
                composerStartRestartGroup.startReplaceGroup(625860825);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(625270585);
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
                Painter painterPainterResource2 = ImageResourcesKt.painterResource((DrawableResource) Ua1.a.c.getValue(), composerStartRestartGroup, 0);
                Modifier modifierM1377width3ABfNKs2 = SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(12));
                ColorFilter.Companion companion5 = ColorFilter.Companion;
                BiliTheme biliTheme4 = BiliTheme.INSTANCE;
                int i15 = BiliTheme.$stable;
                ImageKt.Image(painterPainterResource2, "icon", modifierM1377width3ABfNKs2, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(companion5, biliTheme4.getColors(composerStartRestartGroup, i15).getText1-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
                BasicTextKt.m1512BasicTextRWo7tUw(yVar.f68465b, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme4.getTextStyle(composerStartRestartGroup, i15).getT12(), biliTheme4.getColors(composerStartRestartGroup, i15).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new m(i7, 1, yVar, modifier));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0606  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.cinematicket.a r35, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.cinematicket.a.c r36, @org.jetbrains.annotations.NotNull final com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t r37, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.kmm.operation.inlinevideo.b r38, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.bpf.countdown.CountdownModelKt$createCountdownModel$1 r39, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 2713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.cinematicket.i.b(com.bilibili.ogv.kmm.operation.cinematicket.a, com.bilibili.ogv.kmm.operation.cinematicket.a$c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.t, com.bilibili.ogv.kmm.operation.inlinevideo.b, com.bilibili.ogv.bpf.countdown.CountdownModelKt$createCountdownModel$1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i7, final long j7, @Nullable Composer composer, @Nullable Modifier modifier) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-663821113);
        int i8 = ((i7 & 6) == 0 ? (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7 : i7) | 48;
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-663821113, i8, -1, "com.bilibili.ogv.kmm.operation.cinematicket.CountdownTimer (CinemaTicketInlineUi.kt:184)");
            }
            long j8 = Duration.getInWholeHours-impl(j7);
            int i9 = Duration.getMinutesComponent-impl(j7);
            int i10 = Duration.getSecondsComponent-impl(j7);
            Duration.getNanosecondsComponent-impl(j7);
            List listListOf = CollectionsKt.listOf(new Integer[]{Integer.valueOf((int) j8), Integer.valueOf(i9), Integer.valueOf(i10)});
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            composerStartRestartGroup.startReplaceGroup(404514929);
            int i11 = 0;
            modifier2 = companion;
            for (Object obj : listListOf) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue();
                String strA = iIntValue < 10 ? C3259x.a(iIntValue, "0") : String.valueOf(iIntValue);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i12 = BiliTheme.$stable;
                TextStyle textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT11b(), biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                Modifier.Companion companion3 = Modifier.Companion;
                long j9 = biliTheme.getColors(composerStartRestartGroup, i12).getBrand_pink-0d7_KjU();
                float f7 = 2;
                BasicTextKt.m1512BasicTextRWo7tUw(strA, PaddingKt.m1343paddingVpY3zN4(androidx.room.coroutines.f.a(f7, companion3, j9), Dp.m3880constructorimpl((float) 3.5d), Dp.m3880constructorimpl((float) 1.5d)), textStyleM3586copyp1EtxEg$default, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1016);
                if (i11 < listListOf.size() - 1) {
                    SpacerKt.Spacer(K.a(f7, 398239656, composerStartRestartGroup, companion3), composerStartRestartGroup, 6);
                    BasicTextKt.m1512BasicTextRWo7tUw(":", (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT11b(), biliTheme.getColors(composerStartRestartGroup, i12).getBrand_pink-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 6, 1018);
                    H0.e.a(f7, 6, composerStartRestartGroup, companion3);
                } else {
                    composerStartRestartGroup.startReplaceGroup(398554864);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i11++;
            }
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, j7, modifier3) { // from class: com.bilibili.ogv.kmm.operation.cinematicket.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f68256a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68257b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68258c;

                {
                    this.f68256a = j7;
                    this.f68257b = modifier3;
                    this.f68258c = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    i.c(RecomposeScopeImplKt.updateChangedFlags(this.f68258c | 1), this.f68256a, (Composer) obj2, this.f68257b);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
