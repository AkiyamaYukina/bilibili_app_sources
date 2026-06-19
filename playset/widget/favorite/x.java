package com.bilibili.playset.widget.favorite;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.graphics.O;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.bilibili.app.comm.aphro.mediaselect.compose.X;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/x.class */
public final class x {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/x$a.class */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f85815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f85816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0<Unit> f85817c;

        public a(n nVar, m mVar, Function0<Unit> function0) {
            this.f85815a = nVar;
            this.f85816b = mVar;
            this.f85817c = function0;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            m mVar = this.f85816b;
            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new WideScreenAdaptiveContainerKt$handleDragGesture$2(this.f85815a, mVar.f85769d, mVar.f85768c, this.f85817c, mVar.f85767b, null), continuation);
            if (objAwaitEachGesture != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objAwaitEachGesture = Unit.INSTANCE;
            }
            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1852380955);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1852380955, i7, -1, "com.bilibili.playset.widget.favorite.DragHandle (WideScreenAdaptiveContainer.kt:576)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), l.h);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i8 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierM1358height3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i8).getBg1-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            if (com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.k.a(BackgroundKt.m1168backgroundbw27NRU(SizeKt.m1374sizeVpY3zN4(companion, l.f85763e, l.f85764f), biliTheme.getColors(composerStartRestartGroup, i8).getGa3-0d7_KjU(), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(l.f85765g)), composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.playset.widget.favorite.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f85786a;

                {
                    this.f85786a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    x.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f85786a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(Composer composer, final int i7, final Function2 function2) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1469799192);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469799192, i8, -1, "com.bilibili.playset.widget.favorite.FullScreenContainer (WideScreenAdaptiveContainer.kt:600)");
            }
            float fB = X.b(WindowInsets.Companion, composerStartRestartGroup, 6, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), BiliTheme.INSTANCE.getThemeColors(composerStartRestartGroup, BiliTheme.$stable).getPrimary-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m1358height3ABfNKs(companion, fB), 0.0f, 1, null), composerStartRestartGroup, 0);
            if (O.c(composerStartRestartGroup, i8 & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, function2) { // from class: com.bilibili.playset.widget.favorite.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function2 f85803a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f85804b;

                {
                    this.f85803a = function2;
                    this.f85804b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    x.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f85804b | 1), this.f85803a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final float r10, final boolean r11, final kotlin.jvm.functions.Function0<kotlin.Unit> r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.x.c(float, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.ui.Modifier r15, final float r16, final float r17, final float r18, final com.bilibili.playset.widget.favorite.n r19, final com.bilibili.playset.widget.favorite.m r20, final androidx.compose.ui.input.nestedscroll.NestedScrollConnection r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final androidx.compose.ui.unit.Density r23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 1431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.x.d(androidx.compose.ui.Modifier, float, float, float, com.bilibili.playset.widget.favorite.n, com.bilibili.playset.widget.favorite.m, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function0, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(boolean r9, @org.jetbrains.annotations.NotNull final java.lang.Class r10, @org.jetbrains.annotations.Nullable final android.os.Bundle r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.x.e(boolean, java.lang.Class, android.os.Bundle, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0425  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final int r14, androidx.compose.runtime.Composer r15, final kotlin.jvm.functions.Function0 r16, final kotlin.jvm.functions.Function2 r17) {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.x.f(int, androidx.compose.runtime.Composer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2):void");
    }
}
