package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import Di0.C1602f;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.theme.BiliTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/r.class */
public final class r {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable Modifier modifier, @NotNull final List list) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-893491417);
        int i8 = ((i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7 : i7) | 48;
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            modifier2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893491417, i8, -1, "com.bilibili.ship.theseus.ogv.intro.limitedtimefree.CountdownTimerUI (OgvLimitedTimeFreeTicketsComponentB.kt:245)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            composerStartRestartGroup.startReplaceGroup(2073337211);
            int i9 = 0;
            for (Object obj : list) {
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue();
                String strA = iIntValue < 10 ? C3259x.a(iIntValue, "0") : String.valueOf(iIntValue);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i10 = BiliTheme.$stable;
                TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12();
                long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU();
                Modifier.Companion companion2 = Modifier.Companion;
                TextKt.m1772Text4IGK_g(strA, PaddingKt.m1343paddingVpY3zN4(androidx.room.coroutines.f.a(2, companion2, biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink_thin-0d7_KjU()), Dp.m3880constructorimpl((float) 2.5d), Dp.m3880constructorimpl((float) 1.5d)), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 3120, 55288);
                if (i9 < list.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(1945716425);
                    float f7 = 4;
                    J.a(f7, 6, composerStartRestartGroup, companion2);
                    TextKt.m1772Text4IGK_g(":", (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getGraph_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12(), composerStartRestartGroup, 6, 0, 65530);
                    H0.e.a(f7, 6, composerStartRestartGroup, companion2);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1946014335);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i9++;
            }
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 0;
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i11, list, modifier3) { // from class: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f93271a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f93272b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f93273c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f93274d;

                {
                    this.f93271a = i11;
                    this.f93273c = list;
                    this.f93274d = modifier3;
                    this.f93272b = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.f93271a) {
                        case 0:
                            List list2 = (List) this.f93273c;
                            ((Integer) obj3).getClass();
                            r.a(RecomposeScopeImplKt.updateChangedFlags(this.f93272b | 1), (Composer) obj2, (Modifier) this.f93274d, list2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93272b | 1);
                            kntr.app.appwidget.guide.ui.l.c((kntr.app.appwidget.guide.ui.o) this.f93273c, (Integer) this.f93274d, (Composer) obj2, iUpdateChangedFlags);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 2479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.r.b(com.bilibili.ship.theseus.ogv.intro.limitedtimefree.u, androidx.compose.runtime.Composer, int):void");
    }
}
