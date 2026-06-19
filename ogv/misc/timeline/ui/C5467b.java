package com.bilibili.ogv.misc.timeline.ui;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.bilibili.compose.image.BiliImageState;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.misc.timeline.ui.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/b.class */
public final class C5467b {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final BiliImageState biliImageState, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(950945492);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(biliImageState) : composerStartRestartGroup.changedInstance(biliImageState) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950945492, i8, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineTvPlaceholder (BiliImagePlaceholder.kt:13)");
            }
            if (biliImageState.getSucceed()) {
                composerStartRestartGroup.startReplaceGroup(13275470);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(12950652);
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBg3-0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(2131236331, composerStartRestartGroup, 0), "icon", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 25008, 104);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(biliImageState, i7) { // from class: com.bilibili.ogv.misc.timeline.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliImageState f69515a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f69516b;

                {
                    this.f69515a = biliImageState;
                    this.f69516b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69516b | 1);
                    C5467b.a(this.f69515a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
