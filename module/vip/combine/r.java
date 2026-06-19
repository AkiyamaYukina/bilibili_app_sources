package com.bilibili.module.vip.combine;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.composecomponent.button.livereverse.t;
import com.bilibili.app.comm.aphro.mediaselect.compose.x0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.module.vip.combine.VipPaymentTipsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/r.class */
public final class r {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull VipPaymentTipsVM vipPaymentTipsVM, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(149750444);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(vipPaymentTipsVM) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(149750444, i8, -1, "com.bilibili.module.vip.combine.VipRightsDialog (VipPaymentTipsDialogFragment.kt:232)");
            }
            BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-1832279052, true, new R9.j(vipPaymentTipsVM, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Zi.k(vipPaymentTipsVM, i7, 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final Modifier modifier, final VipPaymentTipsVM.Button button, Composer composer, final int i7) {
        int i8;
        BorderStroke borderStrokeM1178BorderStrokecXLIe8U;
        long jA;
        long jA2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1842748761);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(button) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1842748761, i9, -1, "com.bilibili.module.vip.combine.VipRightsDialogButton (VipPaymentTipsDialogFragment.kt:334)");
            }
            boolean z6 = button.f66165c == VipPaymentTipsVM.Button.ButtonIndex.FIRST;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(modifier, Dp.m3880constructorimpl(34));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-943292125);
                borderStrokeM1178BorderStrokecXLIe8U = BorderStrokeKt.m1178BorderStrokecXLIe8U(Dp.m3880constructorimpl(1), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getLine_bold-0d7_KjU());
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-943218035);
                composerStartRestartGroup.endReplaceGroup();
                borderStrokeM1178BorderStrokecXLIe8U = null;
            }
            RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(17));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-943038731);
                jA = Af.l.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-942980978);
                jA = t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-942863085);
                jA2 = Li0.e.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-942803410);
                jA2 = x0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            int i10 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM1640buttonColorsro_MJ88 = buttonDefaults.m1640buttonColorsro_MJ88(jA, jA2, 0L, 0L, composerStartRestartGroup, i10 << 12, 12);
            float f7 = 0;
            ButtonKt.Button(button.f66164b, modifierM1358height3ABfNKs, false, null, buttonDefaults.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i10 << 15) | 54, 28), roundedCornerShapeM1502RoundedCornerShape0680j_4, borderStrokeM1178BorderStrokecXLIe8U, buttonColorsM1640buttonColorsro_MJ88, null, ComposableLambdaKt.rememberComposableLambda(-1913118391, true, new Function3(button) { // from class: com.bilibili.module.vip.combine.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VipPaymentTipsVM.Button f66194a;

                {
                    this.f66194a = button;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1913118391, iIntValue, -1, "com.bilibili.module.vip.combine.VipRightsDialogButton.<anonymous> (VipPaymentTipsDialogFragment.kt:360)");
                        }
                        TextKt.m1772Text4IGK_g(this.f66194a.f66163a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composer2, BiliTheme.$stable).getT14(), composer2, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 268);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, button, i7) { // from class: com.bilibili.module.vip.combine.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f66195a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final VipPaymentTipsVM.Button f66196b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f66197c;

                {
                    this.f66195a = modifier;
                    this.f66196b = button;
                    this.f66197c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f66197c | 1);
                    VipPaymentTipsVM.Button button2 = this.f66196b;
                    r.b(this.f66195a, button2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
