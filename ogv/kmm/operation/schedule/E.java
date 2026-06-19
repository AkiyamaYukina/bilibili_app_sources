package com.bilibili.ogv.kmm.operation.schedule;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/E.class */
public final class E {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str, final boolean z6, final boolean z7) {
        int i8;
        TextStyle textStyleM3586copyp1EtxEg$default;
        long jM2664getTransparent0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2115700667);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z7) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, 1 & i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2115700667, i11, -1, "com.bilibili.ogv.kmm.operation.schedule.SwitchableTitle (UpcomingScheduleCardUi.kt:97)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(43074594);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i12 = BiliTheme.$stable;
                textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT16b(), biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(43182164);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i13 = BiliTheme.$stable;
                textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme2.getTextStyle(composerStartRestartGroup, i13).getT16(), biliTheme2.getColors(composerStartRestartGroup, i13).getText2-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            BasicTextKt.m1512BasicTextRWo7tUw(str, (Modifier) null, textStyleM3586copyp1EtxEg$default, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, i11 & 14, 1018);
            if (z7) {
                composerStartRestartGroup.startReplaceGroup(43376224);
                Modifier.Companion companion2 = Modifier.Companion;
                float f7 = 4;
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composerStartRestartGroup, companion2);
                Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(20)), Dp.m3880constructorimpl(f7));
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(1109787301);
                    jM2664getTransparent0d7_KjU = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1109788006);
                    composerStartRestartGroup.endReplaceGroup();
                    jM2664getTransparent0d7_KjU = Color.Companion.m2664getTransparent0d7_KjU();
                }
                BoxKt.Box(com.bilibili.ad.adview.liveroom.answer.fragment.compont.H.a(f7, modifierM1358height3ABfNKs, jM2664getTransparent0d7_KjU), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(43813479);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, z6, z7) { // from class: com.bilibili.ogv.kmm.operation.schedule.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f68699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f68700b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f68701c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f68702d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f68703e;

                {
                    this.f68699a = str;
                    this.f68700b = z6;
                    this.f68701c = z7;
                    this.f68702d = modifier;
                    this.f68703e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    E.a(RecomposeScopeImplKt.updateChangedFlags(this.f68703e | 1), (Composer) obj, this.f68702d, this.f68699a, this.f68700b, this.f68701c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0637  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.f r35, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1 r36, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 2207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.schedule.E.b(com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$f, com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final boolean r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r34, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.d r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.schedule.E.c(boolean, kotlin.jvm.functions.Function0, com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$d, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x047a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final java.util.List r35, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.schedule.u r36, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.schedule.E.d(java.util.List, com.bilibili.ogv.kmm.operation.schedule.u, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
