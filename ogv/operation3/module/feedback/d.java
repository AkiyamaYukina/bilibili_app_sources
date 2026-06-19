package com.bilibili.ogv.operation3.module.feedback;

import Di0.C1602f;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/d.class */
public final class d {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@NotNull final Function0 function0, @NotNull final ComposableLambda composableLambda, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-928170361);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(composableLambda) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-928170361, i9, -1, "com.bilibili.ogv.operation3.module.feedback.BottomDialog (BottomDialog.kt:17)");
            }
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-205675120, true, new Function2(function0, composableLambda) { // from class: com.bilibili.ogv.operation3.module.feedback.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f71199a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComposableLambda f71200b;

                {
                    this.f71199a = function0;
                    this.f71200b = composableLambda;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-205675120, iIntValue, -1, "com.bilibili.ogv.operation3.module.feedback.BottomDialog.<anonymous> (BottomDialog.kt:25)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m2664getTransparent0d7_KjU(), null, 2, null), null, null, false, "", null, this.f71199a, 20, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1182clickableO2vRcR0$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion3 = Composer.Companion;
                        Object lVar = objRememberedValue;
                        if (objRememberedValue == companion3.getEmpty()) {
                            lVar = new com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.l(0);
                            composer2.updateRememberedValue(lVar);
                        }
                        EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) lVar, 1, null);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        Object lVar2 = objRememberedValue2;
                        if (objRememberedValue2 == companion3.getEmpty()) {
                            lVar2 = new com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.l(0);
                            composer2.updateRememberedValue(lVar2);
                        }
                        ExitTransition exitTransitionSlideOutVertically$default = EnterExitTransitionKt.slideOutVertically$default(null, (Function1) lVar2, 1, null);
                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                        final ComposableLambda composableLambda2 = this.f71200b;
                        AnimatedVisibilityKt.AnimatedVisibility(true, modifierWrapContentSize$default, enterTransitionSlideInVertically$default, exitTransitionSlideOutVertically$default, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1427439630, true, new Function3(composableLambda2) { // from class: com.bilibili.ogv.operation3.module.feedback.c

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final ComposableLambda f71204a;

                            {
                                this.f71204a = composableLambda2;
                            }

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1427439630, iIntValue2, -1, "com.bilibili.ogv.operation3.module.feedback.BottomDialog.<anonymous>.<anonymous>.<anonymous> (BottomDialog.kt:44)");
                                }
                                this.f71204a.invoke(composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 200118, 16);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, composableLambda, i7) { // from class: com.bilibili.ogv.operation3.module.feedback.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f71201a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComposableLambda f71202b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f71203c;

                {
                    this.f71201a = function0;
                    this.f71202b = composableLambda;
                    this.f71203c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71203c | 1);
                    d.a(this.f71201a, this.f71202b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
