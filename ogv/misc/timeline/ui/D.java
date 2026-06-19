package com.bilibili.ogv.misc.timeline.ui;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/D.class */
public final class D {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07b3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r27, @org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r28, @org.jetbrains.annotations.NotNull final yk0.C9061a r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 2101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.D.a(int, androidx.compose.ui.Modifier, yk0.a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final String str, final boolean z6, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i7) {
        int i8;
        long jM2664getTransparent0d7_KjU;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1821183318);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i10 = i8;
        if ((i7 & 48) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i11 = i10;
        if ((i7 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, 1 & i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821183318, i11, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineTypeFilterItem (TimelineTypeFilter.kt:112)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-2105472096);
                jM2664getTransparent0d7_KjU = ColorResources_androidKt.colorResource(R$color.Bg1, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2105470027);
                composerStartRestartGroup.endReplaceGroup();
                jM2664getTransparent0d7_KjU = Color.Companion.m2664getTransparent0d7_KjU();
            }
            Modifier modifierA = H.a(15, modifierM1186clickableoSLSa3U$default, jM2664getTransparent0d7_KjU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(companion, Dp.m3880constructorimpl(12), Dp.m3880constructorimpl(3));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(2081733768);
                i9 = R$color.Text1;
            } else {
                composerStartRestartGroup.startReplaceGroup(2081735752);
                i9 = R$color.Text2;
            }
            long jColorResource = ColorResources_androidKt.colorResource(i9, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2186TextNvy7gAk(str, modifierM1343paddingVpY3zN4, jColorResource, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, (i11 & 14) | 24624, 0, 262120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7, z6, function0) { // from class: com.bilibili.ogv.misc.timeline.ui.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f69489a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f69490b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f69491c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f69492d;

                {
                    this.f69489a = str;
                    this.f69490b = z6;
                    this.f69491c = function0;
                    this.f69492d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69492d | 1);
                    D.b(this.f69489a, this.f69490b, this.f69491c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
