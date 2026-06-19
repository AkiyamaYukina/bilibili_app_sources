package com.bilibili.pegasus.components.windowpane;

import Di0.C1602f;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4150n7;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.DialogFragment;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.q;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/PegasusStyleDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class PegasusStyleDialogFragment extends DialogFragment {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void hf(final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1240527812);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240527812, i8, -1, "com.bilibili.pegasus.components.windowpane.PegasusStyleDialogFragment.DialogContent (PegasusStyleDialogFragment.kt:64)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1763992708, true, new Function2(function0) { // from class: com.bilibili.pegasus.components.windowpane.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f77234a;

                {
                    this.f77234a = function0;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1763992708, iIntValue, -1, "com.bilibili.pegasus.components.windowpane.PegasusStyleDialogFragment.DialogContent.<anonymous> (PegasusStyleDialogFragment.kt:66)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                        int i9 = BiliTheme.$stable;
                        Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m2628copywmQWz5c$default(biliTheme.getColors(composer2, i9).getShadow-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1169backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(androidx.room.coroutines.f.a(8, companion, biliTheme.getColors(composer2, i9).getBg1_float-0d7_KjU()), Dp.m3880constructorimpl(360), Dp.m3880constructorimpl(120));
                        float f7 = 24;
                        float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
                        float f8 = 16;
                        Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(modifierM1374sizeVpY3zN4, Dp.m3880constructorimpl(f8), fM3880constructorimpl, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1345paddingqDBjuR0);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                        int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
                        Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131856257, composer2, 0), (Modifier) null, biliTheme.getColors(composer2, i9).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer2, i9).getT16b(), composer2, 0, 0, 65530);
                        q.a(f7, 6, composer2, companion);
                        Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(34));
                        RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(17));
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        long j7 = biliTheme.getColors(composer2, i9).getBrand_pink-0d7_KjU();
                        int i10 = ButtonDefaults.$stable;
                        ButtonColors buttonColorsM1640buttonColorsro_MJ88 = buttonDefaults.m1640buttonColorsro_MJ88(j7, 0L, 0L, 0L, composer2, i10 << 12, 14);
                        float f9 = 0;
                        ButtonKt.Button(this.f77234a, modifierM1358height3ABfNKs, false, null, buttonDefaults.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f9), 0.0f, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f9), composer2, (i10 << 15) | 27702, 4), roundedCornerShapeM1502RoundedCornerShape0680j_4, null, buttonColorsM1640buttonColorsro_MJ88, null, b.f77232a, composer2, 805306416, 332);
                        if (C4150n7.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, function0, i7) { // from class: com.bilibili.pegasus.components.windowpane.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PegasusStyleDialogFragment f77235a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f77236b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f77237c;

                {
                    this.f77235a = this;
                    this.f77236b = function0;
                    this.f77237c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f77237c | 1);
                    this.f77235a.hf(this.f77236b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext());
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-262307528, true, new Function2(this) { // from class: com.bilibili.pegasus.components.windowpane.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PegasusStyleDialogFragment f77233a;

            {
                this.f77233a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
                /*
                    r5 = this;
                    r0 = r6
                    androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                    r10 = r0
                    r0 = r7
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    r8 = r0
                    r0 = r8
                    r1 = 3
                    r0 = r0 & r1
                    r1 = 2
                    if (r0 == r1) goto L1b
                    r0 = 1
                    r9 = r0
                    goto L1e
                L1b:
                    r0 = 0
                    r9 = r0
                L1e:
                    r0 = r10
                    r1 = r9
                    r2 = r8
                    r3 = 1
                    r2 = r2 & r3
                    boolean r0 = r0.shouldExecute(r1, r2)
                    if (r0 == 0) goto L91
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L3c
                    r0 = -262307528(0xfffffffff05d8138, float:-2.7420961E29)
                    r1 = r8
                    r2 = -1
                    java.lang.String r3 = "com.bilibili.pegasus.components.windowpane.PegasusStyleDialogFragment.onCreateDialog.<anonymous>.<anonymous> (PegasusStyleDialogFragment.kt:40)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                L3c:
                    r0 = r5
                    com.bilibili.pegasus.components.windowpane.PegasusStyleDialogFragment r0 = r0.f77233a
                    r11 = r0
                    r0 = r10
                    r1 = r11
                    boolean r0 = r0.changedInstance(r1)
                    r9 = r0
                    r0 = r10
                    java.lang.Object r0 = r0.rememberedValue()
                    r7 = r0
                    r0 = r9
                    if (r0 != 0) goto L66
                    r0 = r7
                    r6 = r0
                    r0 = r7
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L79
                L66:
                    In.i r0 = new In.i
                    r1 = r0
                    r2 = r11
                    r3 = 2
                    r1.<init>(r2, r3)
                    r6 = r0
                    r0 = r10
                    r1 = r6
                    r0.updateRememberedValue(r1)
                L79:
                    r0 = r11
                    r1 = r6
                    kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                    r2 = r10
                    r3 = 0
                    r0.hf(r1, r2, r3)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L98
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto L98
                L91:
                    r0 = r10
                    r0.skipToGroupEnd()
                L98:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.windowpane.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        dialog.setContentView(composeView);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(17);
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
