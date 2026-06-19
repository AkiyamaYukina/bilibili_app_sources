package com.bilibili.playerbizcommonv2.widget.speed;

import Di0.C1602f;
import Fa.K;
import J81.u;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.s5;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.bilibili.ad.adview.search.inline.card155.r0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.compose.utils.ModifierUtilsKt;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.playerbizcommonv2.widget.speed.n;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/q.class */
public final class q {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final n.d dVar, final int i7, @Nullable Composer composer, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1438280656);
        if ((i8 & 6) == 0) {
            i9 = ((i8 & 8) == 0 ? composerStartRestartGroup.changed(dVar) : composerStartRestartGroup.changedInstance(dVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(i7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1438280656, i10, -1, "com.bilibili.playerbizcommonv2.widget.speed.LongPressedWidget (TripleSpeedFunctionWidgetV2.kt:208)");
            }
            final int i11 = 0;
            BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-1306579176, true, new Function2(dVar, i7, i11) { // from class: com.bilibili.playerbizcommonv2.widget.speed.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f83446a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f83447b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f83448c;

                {
                    this.f83446a = i11;
                    this.f83448c = dVar;
                    this.f83447b = i7;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    Unit unit;
                    Object obj3 = this.f83448c;
                    int i12 = this.f83447b;
                    switch (this.f83446a) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1306579176, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.speed.LongPressedWidget.<anonymous> (TripleSpeedFunctionWidgetV2.kt:210)");
                                }
                                Modifier.Companion companion = Modifier.Companion;
                                long jM2628copywmQWz5c$default = Color.m2628copywmQWz5c$default(BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getGa10-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                                float f7 = 8;
                                Modifier modifierA = androidx.room.coroutines.f.a(f7, companion, jM2628copywmQWz5c$default);
                                Alignment.Companion companion2 = Alignment.Companion;
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierA);
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
                                O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                float f8 = 12;
                                Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(companion, 0.0f, r0.a(f8, companion, composer2, 6, f7), 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
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
                                O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
                                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                                n.d dVar2 = (n.d) obj3;
                                n.b bVar = dVar2.f83444b;
                                if (bVar instanceof n.b.a) {
                                    IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) LA.f.b(composer2, -1473458621), ((n.b.a) bVar).f83441a), composer2, 0), (String) null, SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 11, null), Dp.m3880constructorimpl(16)), Color.Companion.m2666getWhite0d7_KjU(), composer2, Painter.$stable | 3504, 0);
                                    composer2.endReplaceGroup();
                                } else if (bVar instanceof n.b.C0556b) {
                                    composer2.startReplaceGroup(-1472920120);
                                    LottieAnimationKt.LottieAnimation(RememberLottieCompositionKt.rememberLottieComposition(new LottieCompositionSpec.c(((n.b.C0556b) bVar).f83442a), null, null, null, null, null, composer2, 0, 62).getValue(), SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 11, null), Dp.m3880constructorimpl(16)), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, null, null, composer2, 1572912, 0, 8124);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (bVar != null) {
                                        throw s5.a(composer2, -1848648226);
                                    }
                                    composer2.startReplaceGroup(-1472373280);
                                    composer2.endReplaceGroup();
                                }
                                long sp = TextUnitKt.getSp(i12);
                                Color.Companion companion4 = Color.Companion;
                                TextKt.m1772Text4IGK_g(dVar2.f83443a, (Modifier) null, companion4.m2666getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 384, 0, 131058);
                                composer2.endNode();
                                n.a aVar = dVar2.f83445c;
                                if (aVar == null) {
                                    composer2.startReplaceGroup(-990186950);
                                    composer2.endReplaceGroup();
                                    unit = null;
                                } else {
                                    composer2.startReplaceGroup(-990186949);
                                    TextKt.m1772Text4IGK_g(aVar.f83439a, PaddingKt.m1345paddingqDBjuR0(ModifierUtilsKt.clickableNoInteraction$default(companion, false, aVar.f83440b, 1, (Object) null), Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f7)), companion4.m2666getWhite0d7_KjU(), TextUnitKt.getSp(i12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196992, 0, 131024);
                                    Unit unit2 = Unit.INSTANCE;
                                    composer2.endReplaceGroup();
                                    unit = Unit.INSTANCE;
                                }
                                if (unit == null) {
                                    SpacerKt.Spacer(K.a(f8, 1630639876, composer2, companion), composer2, 6);
                                } else {
                                    composer2.startReplaceGroup(1630626019);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            ((Integer) obj2).intValue();
                            kntr.srcs.app.splash.page.view.button.r.a((u) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                            return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(dVar, i7, i8) { // from class: com.bilibili.playerbizcommonv2.widget.speed.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n.d f83449a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f83450b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f83451c;

                {
                    this.f83449a = dVar;
                    this.f83450b = i7;
                    this.f83451c = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83451c | 1);
                    q.a(this.f83449a, this.f83450b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
