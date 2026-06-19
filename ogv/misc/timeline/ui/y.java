package com.bilibili.ogv.misc.timeline.ui;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/y.class */
public final class y {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, final int i8, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i9) {
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1279790504);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(i7) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        int i11 = i10;
        if ((i9 & 48) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(i8) ? 32 : 16);
        }
        int i12 = i11;
        if ((i9 & 384) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1279790504, i12, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineStatePage (TimelineStatePage.kt:20)");
            }
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(R$color.Bg1, composerStartRestartGroup, 0), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            switch (i7) {
                case 100:
                    composerStartRestartGroup.startReplaceGroup(1881490727);
                    com.bilibili.ogv.bdesign.placeholder.c.b(function0, null, null, null, "居然啥也没有", null, composerStartRestartGroup, ((i12 >> 6) & 14) | 24576, 46);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 101:
                    composerStartRestartGroup.startReplaceGroup(1881247253);
                    com.bilibili.ogv.bdesign.placeholder.e.a(function0, null, null, null, null, null, composerStartRestartGroup, (i12 >> 6) & 14, 62);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 102:
                default:
                    composerStartRestartGroup.startReplaceGroup(1881765201);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 103:
                    composerStartRestartGroup.startReplaceGroup(1881380460);
                    com.bilibili.ogv.bdesign.placeholder.j.b(null, null, composerStartRestartGroup, 0, 3);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 104:
                    composerStartRestartGroup.startReplaceGroup(1881639124);
                    com.bilibili.ogv.bdesign.placeholder.c.a(0, 7, composerStartRestartGroup, null, null, null, i8 == 2 ? "没追的番也很精彩哦" : "今日无内容更新哦");
                    composerStartRestartGroup.endReplaceGroup();
                    break;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i8, function0, i9) { // from class: com.bilibili.ogv.misc.timeline.ui.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f69611a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f69612b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f69613c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f69614d;

                {
                    this.f69611a = i7;
                    this.f69612b = i8;
                    this.f69613c = function0;
                    this.f69614d = i9;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69614d | 1);
                    y.a(this.f69611a, this.f69612b, this.f69613c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
