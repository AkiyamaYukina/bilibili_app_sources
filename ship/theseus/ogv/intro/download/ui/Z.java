package com.bilibili.ship.theseus.ogv.intro.download.ui;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.bilibili.app.comm.aphro.mediaselect.compose.w0;
import com.bilibili.compose.theme.BiliTheme;
import kntr.base.captcha.CaptchaPageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/Z.class */
public final class Z {
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.download.ui.b0 r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r15, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.Z.a(com.bilibili.ship.theseus.ogv.intro.download.ui.b0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final a0 a0Var, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        TextStyle t14;
        long jA;
        Composer composerStartRestartGroup = composer.startRestartGroup(-68317478);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(a0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, 1 & i9)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-68317478, i9, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.QualityDialogItem (DownloadQualityFloatLayerUI.kt:64)");
            }
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(modifier, Dp.m3880constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            String str = (String) a0Var.f92523c.getValue();
            MutableState mutableState = a0Var.f92524d;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1492561310);
                t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14b();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1492560351);
                t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14();
            }
            composerStartRestartGroup.endReplaceGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1492558104);
                jA = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1492557053);
                jA = w0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            BasicTextKt.m1512BasicTextRWo7tUw(str, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(t14, jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1018);
            if (((Boolean) a0Var.f92525e.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(975429461);
                Modifier.Companion companion2 = Modifier.Companion;
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(8, 6, composerStartRestartGroup, companion2);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i10 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(StringResources_androidKt.stringResource(2131854857, composerStartRestartGroup, 0), SizeKt.wrapContentSize$default(BackgroundKt.m1168backgroundbw27NRU(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(42)), Dp.m3880constructorimpl(14)), biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), null, false, 3, null), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i10).getT10(), biliTheme.getColors(composerStartRestartGroup, i10).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(975935908);
                composerStartRestartGroup.endReplaceGroup();
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
            final int i11 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i11, a0Var, modifier) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.V

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f92510a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f92511b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f92512c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f92513d;

                {
                    this.f92510a = i11;
                    this.f92512c = a0Var;
                    this.f92513d = modifier;
                    this.f92511b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = this.f92510a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            Z.b((a0) this.f92512c, (Modifier) this.f92513d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f92511b | 1));
                            break;
                        default:
                            CaptchaPageKt.b((String) this.f92512c, (String) this.f92513d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f92511b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
