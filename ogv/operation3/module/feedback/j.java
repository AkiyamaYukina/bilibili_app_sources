package com.bilibili.ogv.operation3.module.feedback;

import Di0.C1602f;
import androidx.compose.animation.core.C;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.IconKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import jl0.C7707a;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.BlurOption;
import kntr.base.imageloader.K;
import kntr.base.imageloader.Radius;
import kntr.base.imageloader.Sigma;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/j.class */
public final class j {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable Modifier modifier, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778698130);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1778698130, i8, -1, "com.bilibili.ogv.operation3.module.feedback.FeedbackActionUi (FeebackCoverUi.kt:96)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17703b.getValue(), composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m2186TextNvy7gAk(strStringResource, null, biliTheme.getColors(composerStartRestartGroup, i9).getText2-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, 0, 24960, 110586);
            Modifier.Companion companion2 = Modifier.Companion;
            J.a(5, 6, composerStartRestartGroup, companion2);
            IconKt.m2023Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_undo_line_500(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(companion2, Dp.m3880constructorimpl(16)), biliTheme.getColors(composerStartRestartGroup, i9).getText2-0d7_KjU(), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C(modifier, i7, 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-610443442);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-610443442, i9, -1, "com.bilibili.ogv.operation3.module.feedback.FeedbackCoverUi (FeebackCoverUi.kt:36)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-358183198);
                BlurOption blurOption = new BlurOption(Radius.constructor-impl(5), Sigma.constructor-impl(2), (DefaultConstructorMarker) null);
                K.a(5);
                BiliImageKt.BiliImage(C7707a.a(str, null, null, false, false, blurOption, new K(5), 31), boxScopeInstance.matchParentSize(Modifier.Companion), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.rememberComposableLambda(1348805555, true, new com.bilibili.app.screen.adjust.widget.f(boxScopeInstance, 1), composerStartRestartGroup, 54), (Function4) null, composerStartRestartGroup, 100663296, 764);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-357618130);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion3 = Modifier.Companion;
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(boxScopeInstance.matchParentSize(companion3), Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(ImageResourcesKt.painterResource((DrawableResource) Va1.a.a.getValue(), composerStartRestartGroup, 0), "feedback_icon", androidx.compose.foundation.text.contextmenu.internal.J.a(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(32)), 16), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(2, 6, composerStartRestartGroup, companion3);
            String strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17704c.getValue(), composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getText_white-0d7_KjU();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m2186TextNvy7gAk(strStringResource, null, j7, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, t12, composerStartRestartGroup, 0, 24960, 110586);
            TextKt.m2186TextNvy7gAk(StringResourcesKt.stringResource((StringResource) O3.a.f17705d.getValue(), composerStartRestartGroup, 0), AlphaKt.alpha(companion3, 0.6f), biliTheme.getColors(composerStartRestartGroup, i10).getText_white-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT10(), composerStartRestartGroup, 48, 24960, 110584);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, modifier, i7) { // from class: com.bilibili.ogv.operation3.module.feedback.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f71218a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f71219b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f71220c;

                {
                    this.f71218a = str;
                    this.f71219b = modifier;
                    this.f71220c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.b(RecomposeScopeImplKt.updateChangedFlags(this.f71220c | 1), (Composer) obj, this.f71219b, this.f71218a);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
