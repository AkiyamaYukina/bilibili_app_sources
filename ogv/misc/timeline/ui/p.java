package com.bilibili.ogv.misc.timeline.ui;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/p.class */
public final class p {
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline r14, @org.jetbrains.annotations.NotNull final yk0.C9061a r15, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline r16, final boolean r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.p.a(com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline, yk0.a, com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@Nullable Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-651974531);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-651974531, i7, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineListItemEmptyFooter (TimelineListItems.kt:331)");
            }
            BoxKt.Box(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m1169backgroundbw27NRU$default(Modifier.Companion, ColorResources_androidKt.colorResource(R$color.Bg1, composerStartRestartGroup, 0), null, 2, null), 0.0f, 1, null), Dp.m3880constructorimpl(12)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.ogv.misc.timeline.ui.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f69576a;

                {
                    this.f69576a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    p.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f69576a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x030a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull yk0.C9061a r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.p.c(yk0.a, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final boolean z6, final boolean z7, @Nullable Composer composer, final int i7) {
        int i8;
        long jColorResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1902714828);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902714828, i9, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineListItemHeader (TimelineListItems.kt:252)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(32));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1377width3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(23), Dp.m3880constructorimpl(22), 0.0f, 0.0f, 12, null), Dp.m3880constructorimpl(2)), 0.0f, 1, null);
            if (!z6 || z7) {
                composerStartRestartGroup.startReplaceGroup(1671932236);
                jColorResource = ColorResources_androidKt.colorResource(R$color.Brand_pink_thin, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1672027933);
                composerStartRestartGroup.endReplaceGroup();
                jColorResource = Color.Companion.m2664getTransparent0d7_KjU();
            }
            if (com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.k.a(BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxHeight$default, jColorResource, null, 2, null), composerStartRestartGroup, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(z6, z7, i7) { // from class: com.bilibili.ogv.misc.timeline.ui.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f69577a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f69578b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f69579c;

                {
                    this.f69577a = z6;
                    this.f69578b = z7;
                    this.f69579c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69579c | 1);
                    p.d(this.f69577a, this.f69578b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
