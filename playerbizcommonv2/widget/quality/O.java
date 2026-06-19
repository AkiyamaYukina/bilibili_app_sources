package com.bilibili.playerbizcommonv2.widget.quality;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/O.class */
public final class O {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/O$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82699a;

        static {
            int[] iArr = new int[HdrCardSize.values().length];
            try {
                iArr[HdrCardSize.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[HdrCardSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[HdrCardSize.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f82699a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.foundation.layout.BoxScopeInstance r12, final boolean r13, final com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize r14, final boolean r15, @androidx.annotation.DrawableRes final int r16, final kotlin.jvm.functions.Function0 r17, final kotlin.jvm.functions.Function0 r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.a(androidx.compose.foundation.layout.BoxScopeInstance, boolean, com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize, boolean, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.quality.C5812i r27, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.b(com.bilibili.playerbizcommonv2.widget.quality.i, com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.layout.BoxScopeInstance r11, final com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize r12, final kotlin.jvm.functions.Function0 r13, androidx.compose.runtime.Composer r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.c(androidx.compose.foundation.layout.BoxScopeInstance, com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final String str, final boolean z6, final HdrCardSize hdrCardSize, final List list, final Modifier modifier, Composer composer, final int i7) throws NoWhenBranchMatchedException {
        Composer composerStartRestartGroup = composer.startRestartGroup(763011081);
        int i8 = (i7 & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i7 : i7;
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(hdrCardSize.ordinal()) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(list) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(763011081, i12, -1, "com.bilibili.playerbizcommonv2.widget.quality.HdrContent (QualityHdrInfoComponent.kt:237)");
            }
            float fM3880constructorimpl = Dp.m3880constructorimpl((z6 || hdrCardSize != HdrCardSize.SMALL) ? 50 : 40);
            float fM3880constructorimpl2 = Dp.m3880constructorimpl(40);
            float fM3880constructorimpl3 = Dp.m3880constructorimpl(hdrCardSize == HdrCardSize.LARGE ? 100 : 60);
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(z6 ? arrangement.getCenter() : arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f(composerStartRestartGroup, i12 & 14, str);
            Modifier.Companion companion3 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion3, fM3880constructorimpl), composerStartRestartGroup, 0);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1744702264);
                composerStartRestartGroup.startReplaceGroup(220814502);
                int i13 = 0;
                for (Object obj : list) {
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    b((C5812i) obj, hdrCardSize, composerStartRestartGroup, (i12 >> 3) & 112);
                    if (i13 != CollectionsKt.getLastIndex(list)) {
                        composerStartRestartGroup.startReplaceGroup(-20022544);
                        SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(Modifier.Companion, fM3880constructorimpl2), composerStartRestartGroup, 6);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-620653695);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i13++;
                }
                composerStartRestartGroup.endReplaceGroup();
                I0.a(60, 6, composerStartRestartGroup, Modifier.Companion);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1744432192);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
                O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-812481662);
                int i14 = 0;
                for (Object obj2 : list) {
                    if (i14 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    b((C5812i) obj2, hdrCardSize, composerStartRestartGroup, (i12 >> 3) & 112);
                    if (i14 != CollectionsKt.getLastIndex(list)) {
                        composerStartRestartGroup.startReplaceGroup(276175623);
                        ad.e.a(fM3880constructorimpl3, 0, composerStartRestartGroup, Modifier.Companion);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(276274606);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i14++;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                I0.a(50, 6, composerStartRestartGroup, Modifier.Companion);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, z6, hdrCardSize, list, modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f82642a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f82643b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final HdrCardSize f82644c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final List f82645d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f82646e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f82647f;

                {
                    this.f82642a = str;
                    this.f82643b = z6;
                    this.f82644c = hdrCardSize;
                    this.f82645d = list;
                    this.f82646e = modifier;
                    this.f82647f = i7;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    ((Integer) obj4).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82647f | 1);
                    HdrCardSize hdrCardSize2 = this.f82644c;
                    Modifier modifier2 = this.f82646e;
                    O.d(this.f82642a, this.f82643b, hdrCardSize2, this.f82645d, modifier2, (Composer) obj3, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0251  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r14, @androidx.annotation.DrawableRes final int r15, @org.jetbrains.annotations.NotNull final java.lang.String r16, @org.jetbrains.annotations.NotNull final kotlin.Pair<java.lang.String, java.lang.String> r17, @org.jetbrains.annotations.NotNull final java.util.List<com.bilibili.playerbizcommonv2.widget.quality.C5812i> r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.e(boolean, int, java.lang.String, kotlin.Pair, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, final int r15, @org.jetbrains.annotations.NotNull final java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.f(androidx.compose.runtime.Composer, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final int r27, final int r28, androidx.compose.runtime.Composer r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function0 r31, final boolean r32) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.g(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize r11, @androidx.annotation.DrawableRes final int r12, final kotlin.jvm.functions.Function0<kotlin.Unit> r13, androidx.compose.ui.Modifier r14, androidx.compose.runtime.Composer r15, final int r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.O.h(com.bilibili.playerbizcommonv2.widget.quality.HdrCardSize, int, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
