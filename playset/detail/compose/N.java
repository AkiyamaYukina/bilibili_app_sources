package com.bilibili.playset.detail.compose;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/N.class */
public final class N {
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.app.comm.list.widget.statement.PlaceHolderState r11, com.bilibili.app.comm.list.widget.statement.ErrorState r12, final kotlin.jvm.functions.Function0<kotlin.Unit> r13, androidx.compose.runtime.Composer r14, final int r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.compose.N.a(com.bilibili.app.comm.list.widget.statement.PlaceHolderState, com.bilibili.app.comm.list.widget.statement.ErrorState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.bilibili.playset.detail.data.h r11, final kotlin.jvm.functions.Function1<? super com.bilibili.playset.detail.data.f, kotlin.Unit> r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.compose.N.b(com.bilibili.playset.detail.data.h, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.bilibili.playset.detail.data.h r10, kotlin.jvm.functions.Function1<? super com.bilibili.playset.detail.data.f, kotlin.Unit> r11, androidx.compose.foundation.lazy.grid.LazyGridState r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.compose.N.c(com.bilibili.playset.detail.data.h, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final int i7, @Nullable Composer composer, @NotNull final com.bilibili.playset.detail.data.h hVar, @NotNull final Function0 function0, @NotNull final Function1 function1) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1116800538);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(hVar) ? 4 : 2) | i7;
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
                ComposerKt.traceEventStart(-1116800538, i10, -1, "com.bilibili.playset.detail.compose.MultiTypeListDetailPage (MultiTypeListDetailPage.kt:93)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(2051969950, true, new Function2(hVar, function0, function1) { // from class: com.bilibili.playset.detail.compose.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f84444a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f84445b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84446c;

                {
                    this.f84444a = function0;
                    this.f84445b = function1;
                    this.f84446c = hVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2051969950, iIntValue, -1, "com.bilibili.playset.detail.compose.MultiTypeListDetailPage.<anonymous> (MultiTypeListDetailPage.kt:95)");
                        }
                        Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1169backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Function0 function02 = this.f84444a;
                        Function1 function12 = this.f84445b;
                        N.e(function02, function12, composer2, 0);
                        N.b(this.f84446c, function12, composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(hVar, function0, function1, i7) { // from class: com.bilibili.playset.detail.compose.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84351a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84352b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f84353c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f84354d;

                {
                    this.f84351a = hVar;
                    this.f84352b = function0;
                    this.f84353c = function1;
                    this.f84354d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    N.d(RecomposeScopeImplKt.updateChangedFlags(this.f84354d | 1), (Composer) obj, this.f84351a, this.f84352b, this.f84353c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0485  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final kotlin.jvm.functions.Function1<? super com.bilibili.playset.detail.data.f, kotlin.Unit> r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 1457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.compose.N.e(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(final int i7, @Nullable Composer composer, @NotNull final com.bilibili.playset.detail.data.h hVar, @NotNull final Function0 function0, @NotNull final Function1 function1) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1721087752);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(hVar) ? 4 : 2) | i7;
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
                ComposerKt.traceEventStart(1721087752, i10, -1, "com.bilibili.playset.detail.compose.MultiTypeListHalfPage (MultiTypeListDetailPage.kt:60)");
            }
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1926932038, true, new Function2(hVar, function0, function1) { // from class: com.bilibili.playset.detail.compose.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84370a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f84371b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f84372c;

                {
                    this.f84370a = hVar;
                    this.f84371b = function1;
                    this.f84372c = function0;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1926932038, iIntValue, -1, "com.bilibili.playset.detail.compose.MultiTypeListHalfPage.<anonymous>.<anonymous> (MultiTypeListDetailPage.kt:67)");
                        }
                        LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composer2, 0, 3);
                        Modifier modifierM1169backgroundbw27NRU$default2 = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1169backgroundbw27NRU$default2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Function0 function02 = this.f84372c;
                        com.bilibili.playset.detail.data.h hVar2 = this.f84370a;
                        Function1 function12 = this.f84371b;
                        com.bilibili.playset.detail.widget.B.a(0, composer2, hVar2, function02, function12);
                        N.c(hVar2, function12, lazyGridStateRememberLazyGridState, composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(hVar, function0, function1, i7) { // from class: com.bilibili.playset.detail.compose.L

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.detail.data.h f84373a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84374b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f84375c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f84376d;

                {
                    this.f84373a = hVar;
                    this.f84374b = function0;
                    this.f84375c = function1;
                    this.f84376d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    N.f(RecomposeScopeImplKt.updateChangedFlags(this.f84376d | 1), (Composer) obj, this.f84373a, this.f84374b, this.f84375c);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
