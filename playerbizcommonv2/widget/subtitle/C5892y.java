package com.bilibili.playerbizcommonv2.widget.subtitle;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/y.class */
public final class C5892y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f83821a;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull String str, @NotNull AnnotatedString annotatedString, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-830709880);
        if ((i7 & 6) == 0) {
            i8 = i7 | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(annotatedString) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830709880, i9, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.AiAudioIntroductionBottomSheet (MultiAudioIntroComponent.kt:177)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f7 = 12;
            Modifier modifierClip = ClipKt.clip(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 12, null));
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
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
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextStyle textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i10).getT18(), 0L, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null);
            long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU();
            float f8 = 16;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f8);
            float f9 = 20;
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1345paddingqDBjuR0(companion, fM3880constructorimpl, Dp.m3880constructorimpl(15), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(6)), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM3586copyp1EtxEg$default, composerStartRestartGroup, i9 & 14, 0, 65528);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(SizeKt.m1360heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m3880constructorimpl(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE), 1, null), 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(f9), 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            TextKt.m1773TextIbK3jfQ(annotatedString, ScrollKt.verticalScroll$default(PaddingKt.m1344paddingVpY3zN4$default(companion, Dp.m3880constructorimpl(f8), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), biliTheme.getColors(composerStartRestartGroup, i10).getText2-0d7_KjU(), TextUnitKt.getSp(13), null, null, null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, null, null, composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6, 261104);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.app.comment3.ui.widget.compose.K(i7, 1, str, annotatedString, function0));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final String str, @NotNull final Function0 function0, @NotNull final AnnotatedString annotatedString, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-893597925);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(annotatedString) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893597925, i11, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.MultiAudioIntroductionContent (MultiAudioIntroComponent.kt:58)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), 0.0f, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 13, null);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                obj = C5891x.f83807a;
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM1346paddingqDBjuR0$default, unit, (PointerInputEventHandler) obj);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenterEnd());
            float f7 = 20;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(modifierAlign, Dp.m3880constructorimpl(f7), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion.getStart(), composerStartRestartGroup, 6);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(BiliIconfont.INSTANCE.getArrow_back_left_line(composerStartRestartGroup, 6), "", ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(24)), false, null, null, null, function0, 15, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, Color.Companion.m2666getWhite0d7_KjU(), 0, 2, null), composerStartRestartGroup, 1572912 | Painter.$stable, 56);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(9, 6, composerStartRestartGroup, companion3);
            FontWeight bold = FontWeight.Companion.getBold();
            long sp = TextUnitKt.getSp(16);
            long sp2 = TextUnitKt.getSp(22);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            androidx.compose.material3.TextKt.m2186TextNvy7gAk(str, null, biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), null, sp, null, bold, null, 0L, null, null, sp2, 0, false, 0, 0, null, null, composerStartRestartGroup, (i11 & 14) | 1597440, 48, 260010);
            composerStartRestartGroup.endNode();
            androidx.compose.material3.TextKt.m2187TextZ58ophY(annotatedString, PaddingKt.m1343paddingVpY3zN4(ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(12)), biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, null, null, composerStartRestartGroup, ((i11 >> 6) & 14) | 24576, 48, 522216);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, function0, annotatedString, modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f83799a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f83800b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final AnnotatedString f83801c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f83802d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f83803e;

                {
                    this.f83799a = str;
                    this.f83800b = function0;
                    this.f83801c = annotatedString;
                    this.f83802d = modifier;
                    this.f83803e = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83803e | 1);
                    AnnotatedString annotatedString2 = this.f83801c;
                    Modifier modifier2 = this.f83802d;
                    C5892y.b(this.f83799a, this.f83800b, annotatedString2, modifier2, (Composer) obj2, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.playerbizcommonv2.service.ai.a r14, @org.jetbrains.annotations.NotNull android.content.Context r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.C5892y.c(com.bilibili.playerbizcommonv2.service.ai.a, android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
