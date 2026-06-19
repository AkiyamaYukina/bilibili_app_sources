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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.IconButtonKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import com.bilibili.compose.theme.BiliTheme;
import js0.C7722d;
import js0.InterfaceC7720b;
import js0.InterfaceC7721c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.C7900a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/P.class */
public final class P {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final C7722d c7722d, final Function0<Unit> function0, final Function1<? super InterfaceC7721c, Unit> function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1324337179);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c7722d) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1324337179, i10, -1, "com.bilibili.playset.editor.widget.PlaySetEditorContentPage (PlaySetEditorFullScreen.kt:194)");
            }
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBg2-0d7_KjU(), null, 2, null), C5963m.f85029k, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            if (c7722d.f122603j) {
                composerStartRestartGroup.startReplaceGroup(-502324801);
                EditorCommonKt.c(c7722d.f122597c, c7722d.f122598d, C5963m.f85031m, function0, 0L, composerStartRestartGroup, ((i10 << 6) & 7168) | 384, 16);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-502092239);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = c7722d.f122599e;
            if (str == null) {
                str = "";
            }
            int i11 = c7722d.f122595a;
            EditorCommonKt.g(c7722d, str, i11 != 0, function1, 0L, composerStartRestartGroup, (i10 & 14) | ((i10 << 3) & 7168), 16);
            if (i11 == 1 || i11 == 2) {
                composerStartRestartGroup.startReplaceGroup(-501795259);
                String str2 = c7722d.f122600f;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                EditorCommonKt.e(str3, function1, 0, 0L, composerStartRestartGroup, (i10 >> 3) & 112, 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-501660719);
                composerStartRestartGroup.endReplaceGroup();
            }
            EditorCommonKt.h(c7722d.h, function1, 0L, composerStartRestartGroup, (i10 >> 3) & 112, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c7722d, function0, function1, i7) { // from class: com.bilibili.playset.editor.widget.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C7722d f84931a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84932b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f84933c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f84934d;

                {
                    this.f84931a = c7722d;
                    this.f84932b = function0;
                    this.f84933c = function1;
                    this.f84934d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84934d | 1);
                    P.a(this.f84931a, this.f84932b, this.f84933c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final js0.C7722d r15, @androidx.annotation.StringRes final int r16, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r17, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.P.b(js0.d, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final C7722d c7722d, final Function0 function0, final Function1 function1, Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(345980486);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c7722d) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        int i11 = i10 | 3072;
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345980486, i11, -1, "com.bilibili.playset.editor.widget.PlaySetEditorStateContent (PlaySetEditorFullScreen.kt:96)");
            }
            InterfaceC7720b interfaceC7720b = c7722d.f122608o;
            if (interfaceC7720b instanceof InterfaceC7720b.C1304b) {
                composerStartRestartGroup.startReplaceGroup(-816629361);
                EditorCommonKt.d(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (interfaceC7720b instanceof InterfaceC7720b.e) {
                composerStartRestartGroup.startReplaceGroup(-816521171);
                EditorCommonKt.f(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-816424916);
                a(c7722d, function0, function1, composerStartRestartGroup, i11 & 1022);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c7722d, function0, function1, modifier2, i7) { // from class: com.bilibili.playset.editor.widget.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C7722d f84926a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84927b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f84928c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f84929d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f84930e;

                {
                    this.f84926a = c7722d;
                    this.f84927b = function0;
                    this.f84928c = function1;
                    this.f84929d = modifier2;
                    this.f84930e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84930e | 1);
                    Function1 function12 = this.f84928c;
                    Modifier modifier3 = this.f84929d;
                    P.c(this.f84926a, this.f84927b, function12, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-651110692);
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
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-651110692, i11, -1, "com.bilibili.playset.editor.widget.PlaySetEditorToolBar (PlaySetEditorFullScreen.kt:121)");
            }
            float fMo1351calculateTopPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo1351calculateTopPaddingD9Ej5fM();
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxWidth$default, biliTheme.getThemeColors(composerStartRestartGroup, i12).getPrimary-0d7_KjU(), null, 2, null);
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
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m1358height3ABfNKs(companion, fMo1351calculateTopPaddingD9Ej5fM), 0.0f, 1, null), composerStartRestartGroup, 0);
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C7900a.a(composerStartRestartGroup, 2131166672));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(80), 0.0f, 2, null), biliTheme.getThemeColors(composerStartRestartGroup, i12).getTextTitle-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT17b(), composerStartRestartGroup, (i11 & 14) | 48, 3120, 54776);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            IconButtonKt.IconButton(function0, null, false, null, C5953c.f84983a, composerStartRestartGroup, ((i11 >> 6) & 14) | 24576, 14);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            long j7 = biliTheme.getThemeColors(composerStartRestartGroup, i12).getActionIcon-0d7_KjU();
            TextStyle t14 = biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14();
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(12), 0.0f, 11, null);
            float f7 = 4;
            Modifier modifierM1346paddingqDBjuR0$default2 = PaddingKt.m1346paddingqDBjuR0$default(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 10, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            TextKt.m1772Text4IGK_g(str2, ClickableKt.m1182clickableO2vRcR0$default(modifierM1346paddingqDBjuR0$default2, (MutableInteractionSource) objMutableInteractionSource, null, true, null, null, function02, 24, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, (i11 >> 3) & 14, 0, 65528);
            if (C4150n7.b(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, str2, function0, function02, i7) { // from class: com.bilibili.playset.editor.widget.M

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f84921a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f84922b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f84923c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f84924d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f84925e;

                {
                    this.f84921a = str;
                    this.f84922b = str2;
                    this.f84923c = function0;
                    this.f84924d = function02;
                    this.f84925e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84925e | 1);
                    P.d(this.f84921a, this.f84922b, this.f84923c, this.f84924d, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
