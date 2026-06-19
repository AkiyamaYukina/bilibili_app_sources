package com.bilibili.playerbizcommonv2.widget.setting;

import Di0.C1602f;
import I3.C2;
import I3.C2248m2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
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
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingComposeKt.class */
public final class PlayerSettingComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r14, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.C5829a r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt.a(androidx.compose.ui.Modifier, com.bilibili.playerbizcommonv2.widget.setting.a, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@Nullable Modifier modifier, @NotNull final C5829a c5829a, @NotNull final ComposableLambda composableLambda, @Nullable Composer composer, final int i7) {
        Function0<Unit> function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1975299325);
        int i8 = i7 | 6;
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(c5829a) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(composableLambda) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1975299325, i10, -1, "com.bilibili.playerbizcommonv2.widget.setting.AiLanguageDubbingSelect (PlayerSettingCompose.kt:602)");
            }
            Modifier modifierThen = companion.then(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            float f7 = 16;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(modifierFillMaxSize$default, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 10, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(20, 6, composerStartRestartGroup, companion);
            if (StringsKt.isBlank(c5829a.f83182a.getValue())) {
                composerStartRestartGroup.startReplaceGroup(1398868553);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1396294034);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getBottom(), composerStartRestartGroup, 48);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String value = c5829a.f83182a.getValue();
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                TextStyle t14 = biliTheme.getTextStyle(composerStartRestartGroup, i11).getT14();
                long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getText_white-0d7_KjU();
                TextAlign.Companion companion4 = TextAlign.Companion;
                int iM3794getCentere0LSkKk = companion4.m3794getCentere0LSkKk();
                TextOverflow.Companion companion5 = TextOverflow.Companion;
                TextKt.m1772Text4IGK_g(value, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3794getCentere0LSkKk), 0L, companion5.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, 0, 3120, 54778);
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(6, 6, composerStartRestartGroup, companion);
                State<String> state = c5829a.f83183b;
                if (StringsKt.isBlank(state.getValue())) {
                    composerStartRestartGroup.startReplaceGroup(847243210);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(846855245);
                    TextKt.m1772Text4IGK_g(state.getValue(), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion4.m3794getCentere0LSkKk()), 0L, companion5.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12(), composerStartRestartGroup, 0, 3120, 54778);
                    composerStartRestartGroup.endReplaceGroup();
                }
                State<String> state2 = c5829a.f83186e;
                String value2 = state2.getValue();
                if (value2 == null || value2.length() == 0) {
                    composerStartRestartGroup.startReplaceGroup(848691530);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(847352857);
                    Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(17));
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
                    O4.d.c(companion3, composerM2296constructorimpl4, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl4, currentCompositionLocalMap4);
                    Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    String value3 = state2.getValue();
                    String str = value3;
                    if (value3 == null) {
                        str = "";
                    }
                    TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12();
                    long j8 = biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU();
                    int iM3794getCentere0LSkKk2 = companion4.m3794getCentere0LSkKk();
                    Function0<Unit> function02 = c5829a.f83187f;
                    if (function02 == null) {
                        composerStartRestartGroup.startReplaceGroup(700613298);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Object c22 = objRememberedValue;
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            c22 = new C2(10);
                            composerStartRestartGroup.updateRememberedValue(c22);
                        }
                        function0 = (Function0) c22;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-947231764);
                        composerStartRestartGroup.endReplaceGroup();
                        function0 = function02;
                    }
                    TextKt.m1772Text4IGK_g(str, ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null), j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3794getCentere0LSkKk2), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 3072, 56824);
                    Painter arrow_forward_right_line_500 = BiliIconfont.INSTANCE.getArrow_forward_right_line_500(composerStartRestartGroup, 6);
                    Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7));
                    if (function02 == null) {
                        composerStartRestartGroup.startReplaceGroup(701010098);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        Object c2248m2 = objRememberedValue2;
                        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                            c2248m2 = new C2248m2(9);
                            composerStartRestartGroup.updateRememberedValue(c2248m2);
                        }
                        function02 = (Function0) c2248m2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-947218964);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    ImageKt.Image(arrow_forward_right_line_500, (String) null, ClickableKt.m1186clickableoSLSa3U$default(modifierM1372size3ABfNKs, false, null, null, null, function02, 15, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(12, 6, composerStartRestartGroup, companion);
            composableLambda.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            modifier = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier2, c5829a, composableLambda, i7) { // from class: com.bilibili.playerbizcommonv2.widget.setting.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f83199a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C5829a f83200b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ComposableLambda f83201c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f83202d;

                {
                    this.f83199a = modifier2;
                    this.f83200b = c5829a;
                    this.f83201c = composableLambda;
                    this.f83202d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83202d | 1);
                    C5829a c5829a2 = this.f83200b;
                    ComposableLambda composableLambda2 = this.f83201c;
                    PlayerSettingComposeKt.b(this.f83199a, c5829a2, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final C5829a c5829a, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1411126011);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c5829a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411126011, i8, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSecondSelect (PlayerSettingCompose.kt:591)");
            }
            b(null, c5829a, ComposableLambdaKt.rememberComposableLambda(722792795, true, new Function2(c5829a) { // from class: com.bilibili.playerbizcommonv2.widget.setting.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5829a f83346a;

                {
                    this.f83346a = c5829a;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(722792795, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSecondSelect.<anonymous> (PlayerSettingCompose.kt:593)");
                        }
                        PlayerSettingComposeKt.a(null, this.f83346a, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i8 << 3) & 112) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.bililive.room.biz.shopping.view.coupon.w(c5829a, i7, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0430  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.F r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt.d(com.bilibili.playerbizcommonv2.widget.setting.F, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03b4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.E.a r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt.e(com.bilibili.playerbizcommonv2.widget.setting.E$a, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0451  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.G r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 2047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt.f(com.bilibili.playerbizcommonv2.widget.setting.G, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.L r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt.g(com.bilibili.playerbizcommonv2.widget.setting.L, androidx.compose.runtime.Composer, int):void");
    }
}
