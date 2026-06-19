package com.bilibili.ship.theseus.united.page.videoquality;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import kntr.base.imageloader.BiliImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityVisionKt.class */
public final class QualityVisionKt {
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.painter.Painter r10, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.painter.Painter r11, @org.jetbrains.annotations.NotNull final Ex0.g r12, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.QualityVisionKt.a(androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.graphics.painter.Painter, Ex0.g, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.painter.Painter r12, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r13, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r14, @org.jetbrains.annotations.Nullable androidx.compose.ui.layout.ContentScale r15, boolean r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.QualityVisionKt.b(androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [androidx.compose.foundation.layout.Arrangement$Vertical, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@Nullable final Painter painter, @Nullable final Painter painter2, @NotNull final String str, @NotNull final Function0 function0, @NotNull final Function0 function02, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2113931478);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | ((i7 & 64) == 0 ? composerStartRestartGroup.changed(painter2) : composerStartRestartGroup.changedInstance(painter2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(modifier) ? 131072 : 65536);
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i13) != 74898, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2113931478, i13, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualityVisionInfo (QualityVision.kt:53)");
            }
            Color.Companion companion = Color.Companion;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifier, companion.m2655getBlack0d7_KjU(), null, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (painter != null) {
                composerStartRestartGroup.startReplaceGroup(114198763);
                b(painter, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), false, composerStartRestartGroup, Painter.$stable | 3120 | (i13 & 14), 20);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(114369170);
                composerStartRestartGroup.endReplaceGroup();
            }
            Painter xmark_close_line_500 = BiliIconfont.INSTANCE.getXmark_close_line_500(composerStartRestartGroup, 6);
            ColorFilter colorFilterM2671tintxETnrds$default = ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, companion.m2666getWhite0d7_KjU(), 0, 2, null);
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getTopEnd());
            float f7 = 24;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(PaddingKt.m1342padding3ABfNKs(modifierAlign, Dp.m3880constructorimpl(f7)), Dp.m3880constructorimpl(f7)), false, null, null, null, function02, 15, null);
            int i14 = Painter.$stable;
            ImageKt.Image(xmark_close_line_500, (String) null, modifierM1186clickableoSLSa3U$default, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM2671tintxETnrds$default, composerStartRestartGroup, i14 | 1572912, 56);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Object(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion4, 0.9f);
            if (painter2 != null) {
                composerStartRestartGroup.startReplaceGroup(425411597);
                b(painter2, modifierFillMaxWidth, null, null, false, composerStartRestartGroup, i14 | 24624 | ((i13 >> 3) & 14), 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (str.length() > 0) {
                    BiliImageKt.BiliImage(com.bilibili.ad.adview.story.card.card138.i.a(ContentScale.Companion, Fa.A.a(composerStartRestartGroup, 425565357, str)), modifierFillMaxWidth, (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(425795036);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composerStartRestartGroup, companion4);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i15 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw("开启大会员专属特权", PaddingKt.m1343paddingVpY3zN4(ClickableKt.m1186clickableoSLSa3U$default(BackgroundKt.m1168backgroundbw27NRU(companion4, biliTheme.getColors(composerStartRestartGroup, i15).getBrand_pink-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), false, null, null, null, function0, 15, null), Dp.m3880constructorimpl(28), Dp.m3880constructorimpl(7)), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i15).getT14(), companion.m2666getWhite0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 6, 1016);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(painter, painter2, str, function0, function02, modifier, i7) { // from class: com.bilibili.ship.theseus.united.page.videoquality.I

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Painter f103719a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Painter f103720b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f103721c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f103722d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f103723e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Modifier f103724f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f103725g;

                {
                    this.f103719a = painter;
                    this.f103720b = painter2;
                    this.f103721c = str;
                    this.f103722d = function0;
                    this.f103723e = function02;
                    this.f103724f = modifier;
                    this.f103725g = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f103725g | 1);
                    String str2 = this.f103721c;
                    Function0 function03 = this.f103723e;
                    Modifier modifier2 = this.f103724f;
                    QualityVisionKt.c(this.f103719a, this.f103720b, str2, this.f103722d, function03, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
