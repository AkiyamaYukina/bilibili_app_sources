package com.bilibili.opd.app.bizcommon.imageselector.page;

import Di0.C1602f;
import Jm0.C2423A;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallText2ImgKt.class */
public final class MallText2ImgKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallText2ImgKt$a.class */
    public static final class a implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f73869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M f73870b;

        public a(View view, M m7) {
            this.f73869a = view;
            this.f73870b = m7;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public final void dispose() {
            this.f73869a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f73870b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0246  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final Jm0.C2423A r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.page.MallText2ImgKt.a(Jm0.A, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x055a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaFragment r34, @org.jetbrains.annotations.NotNull final Jm0.C2423A r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 2223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.page.MallText2ImgKt.b(com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaFragment, Jm0.A, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaFragment r26, @org.jetbrains.annotations.NotNull final Jm0.C2423A r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1093
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.page.MallText2ImgKt.c(com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaFragment, Jm0.A, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x025b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final Jm0.C2423A r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.page.MallText2ImgKt.d(Jm0.A, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(@Nullable Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1056998724);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1056998724, i7, -1, "com.bilibili.opd.app.bizcommon.imageselector.page.Loading (MallText2Img.kt:497)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.Asset.m5057boximpl(LottieCompositionSpec.Asset.m5058constructorimpl("player_loading_tv.json")), null, null, null, null, null, composerStartRestartGroup, 6, 62);
            com.airbnb.lottie.compose.c cVarA = com.airbnb.lottie.compose.b.a(lottieCompositionResultRememberLottieComposition.getValue(), false, false, null, 0.0f, Integer.MAX_VALUE, composerStartRestartGroup, 94);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            LottieAnimationKt.LottieAnimation(lottieCompositionResultRememberLottieComposition.getValue(), ((Number) cVarA.getValue()).floatValue(), SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(4), 7, null), Dp.m3880constructorimpl(24)), false, false, false, null, null, null, composerStartRestartGroup, 384, 504);
            TextKt.m1772Text4IGK_g("正在努力加载…", (Modifier) null, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText3-0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3078, 6, 130034);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f73873a;

                {
                    this.f73873a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    MallText2ImgKt.e((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f73873a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@NotNull final MallMediaFragment mallMediaFragment, @NotNull final C2423A c2423a, @NotNull final Function3<? super String, ? super String, ? super Long, Unit> function3, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-554252391);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mallMediaFragment) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(c2423a) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function3) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-554252391, i10, -1, "com.bilibili.opd.app.bizcommon.imageselector.page.MallText2Img (MallText2Img.kt:61)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(991562577, true, new Function2(mallMediaFragment, c2423a, function3) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.J

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaFragment f73766a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C2423A f73767b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function3 f73768c;

                {
                    this.f73766a = mallMediaFragment;
                    this.f73767b = c2423a;
                    this.f73768c = function3;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x020b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 586
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.page.J.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new W41.c(i7, 1, mallMediaFragment, c2423a, function3));
        }
    }
}
