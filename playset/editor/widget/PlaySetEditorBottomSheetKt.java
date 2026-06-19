package com.bilibili.playset.editor.widget;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import js0.C7722d;
import js0.InterfaceC7721c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.R0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/PlaySetEditorBottomSheetKt.class */
public final class PlaySetEditorBottomSheetKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1289443985);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1289443985, i8, -1, "com.bilibili.playset.editor.widget.BottomSheetConfirmButton (PlaySetEditorBottomSheet.kt:297)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            int i9 = BiliTheme.$stable;
            DividerKt.m2008HorizontalDivider9IZ8Weo(null, Dp.m3880constructorimpl((float) 0.5d), biliTheme.getColors(composerStartRestartGroup, i9).getLine_regular-0d7_KjU(), composerStartRestartGroup, 48, 1);
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), biliTheme.getColors(composerStartRestartGroup, i9).getBg1_float-0d7_KjU(), null, 2, null), C5963m.h);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(modifierM1358height3ABfNKs, (MutableInteractionSource) objMutableInteractionSource, null, false, null, null, function0, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1182clickableO2vRcR0$default);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131841512, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT16(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(R0.a(companion, WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, i7) { // from class: com.bilibili.playset.editor.widget.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f84873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f84874b;

                {
                    this.f84873a = function0;
                    this.f84874b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84874b | 1);
                    PlaySetEditorBottomSheetKt.a(this.f84873a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final boolean z6, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(908419967);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(908419967, i9, -1, "com.bilibili.playset.editor.widget.BottomSheetDragHandle (PlaySetEditorBottomSheet.kt:136)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C5963m.f85023d);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            BoxKt.Box(com.bilibili.ad.adview.liveroom.answer.fragment.compont.H.a(2, SizeKt.m1374sizeVpY3zN4(companion, C5963m.f85024e, C5963m.f85025f), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGa3-0d7_KjU()), composerStartRestartGroup, 0);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(42886066);
                BoxKt.Box(ClickableKt.m1186clickableoSLSa3U$default(BackgroundKt.m1169backgroundbw27NRU$default(boxScopeInstance.matchParentSize(companion), Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, null, function0, 15, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(43123433);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(z6, i7, function0) { // from class: com.bilibili.playset.editor.widget.G

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f84888a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84889b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f84890c;

                {
                    this.f84888a = z6;
                    this.f84889b = function0;
                    this.f84890c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84890c | 1);
                    PlaySetEditorBottomSheetKt.b(this.f84888a, this.f84889b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final C7722d c7722d, @NotNull final Function1<? super InterfaceC7721c, Unit> function1, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1645896888);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c7722d) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i9 = i8;
        if ((i7 & 3072) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
        }
        int i10 = i9;
        if ((i7 & 24576) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 9363) != 9362, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1645896888, i10, -1, "com.bilibili.playset.editor.widget.PlaySetEditorBottomSheet (PlaySetEditorBottomSheet.kt:65)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(696269312, true, new Function2(function1, function0, c7722d, function03, function02) { // from class: com.bilibili.playset.editor.widget.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f84863a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84864b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C7722d f84865c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f84866d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f84867e;

                {
                    this.f84863a = function1;
                    this.f84864b = function0;
                    this.f84865c = c7722d;
                    this.f84866d = function03;
                    this.f84867e = function02;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24) {
                    /*
                        Method dump skipped, instruction units count: 540
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.A.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.campus.page.e(c7722d, function1, function0, function02, function03, i7, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x04c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final js0.C7722d r11, final kotlin.jvm.functions.Function0<kotlin.Unit> r12, final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r13, final kotlin.jvm.functions.Function0<kotlin.Unit> r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.PlaySetEditorBottomSheetKt.d(js0.d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final js0.C7722d r11, final kotlin.jvm.functions.Function0<kotlin.Unit> r12, final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r13, final kotlin.jvm.functions.Function0<kotlin.Unit> r14, final kotlin.jvm.functions.Function0<kotlin.Unit> r15, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.PlaySetEditorBottomSheetKt.e(js0.d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
