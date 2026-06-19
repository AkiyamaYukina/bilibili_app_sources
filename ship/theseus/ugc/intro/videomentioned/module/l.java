package com.bilibili.ship.theseus.ugc.intro.videomentioned.module;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.bilibili.app.comm.aphro.mediaselect.compose.w0;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/l.class */
public final class l {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final String str, final boolean z6, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        long jA;
        TextStyle t12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2026947021);
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
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, 1 & i10)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2026947021, i10, -1, "com.bilibili.ship.theseus.ugc.intro.videomentioned.module.TabItem (VideoMentionedModuleComponent.kt:230)");
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(Modifier.Companion, false, null, null, null, function0, 15, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
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
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(1037125054);
                jA = w0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(1037125950);
                jA = aj.c.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(1037127965);
                t12 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12b();
            } else {
                composerStartRestartGroup.startReplaceGroup(1037128924);
                t12 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12();
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2186TextNvy7gAk(str, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t12, composerStartRestartGroup, i10 & 14, 0, 131066);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7, z6, function0) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f97901a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f97902b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f97903c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f97904d;

                {
                    this.f97901a = str;
                    this.f97902b = z6;
                    this.f97903c = function0;
                    this.f97904d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f97904d | 1);
                    l.a(this.f97901a, this.f97902b, this.f97903c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
