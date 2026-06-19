package com.bilibili.playerbizcommonv2.videomentioned;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/d.class */
public final class d {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final MentionedCardItem<?> mentionedCardItem, @NotNull final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(472416533);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mentionedCardItem) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(472416533, i9, -1, "com.bilibili.playerbizcommonv2.videomentioned.MentionedCardHiddenSheet (MentionedCardHiddenSheet.kt:23)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(2018231501, true, new Function2(modifier, mentionedCardItem) { // from class: com.bilibili.playerbizcommonv2.videomentioned.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f82004a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MentionedCardItem f82005b;

                {
                    this.f82004a = modifier;
                    this.f82005b = mentionedCardItem;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i10;
                    int i11;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2018231501, iIntValue, -1, "com.bilibili.playerbizcommonv2.videomentioned.MentionedCardHiddenSheet.<anonymous> (MentionedCardHiddenSheet.kt:25)");
                        }
                        float f7 = 16;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(this.f82004a, 0.0f, 1, null), Dp.m3880constructorimpl(64)), Dp.m3880constructorimpl(f7), 0.0f, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (this.f82005b.getDidHidden()) {
                            i10 = 1012252174;
                            i11 = 2131857393;
                        } else {
                            i10 = 1012382126;
                            i11 = 2131857394;
                        }
                        String strA = PL0.c.a(composer2, i10, i11, composer2, 0);
                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                        int i12 = BiliTheme.$stable;
                        long j7 = biliTheme.getColors(composer2, i12).getText1-0d7_KjU();
                        TextStyle t14 = biliTheme.getTextStyle(composer2, i12).getT14();
                        Modifier.Companion companion2 = Modifier.Companion;
                        TextKt.m1772Text4IGK_g(strA, SizeKt.wrapContentHeight$default(PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m1169backgroundbw27NRU$default(com.bilibili.ad.adview.videodetail.endpage.cards.A.a(8, companion2), biliTheme.getColors(composer2, i12).getBg1_float-0d7_KjU(), null, 2, null), 0.0f, 1, null), Dp.m3880constructorimpl(52)), Dp.m3880constructorimpl(f7), 0.0f, 2, null), null, false, 3, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composer2, 0, 0, 65528);
                        SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m3880constructorimpl(12)), composer2, 6);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(mentionedCardItem, modifier, i7) { // from class: com.bilibili.playerbizcommonv2.videomentioned.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MentionedCardItem f82006a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f82007b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f82008c;

                {
                    this.f82006a = mentionedCardItem;
                    this.f82007b = modifier;
                    this.f82008c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82008c | 1);
                    d.a(this.f82006a, this.f82007b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
