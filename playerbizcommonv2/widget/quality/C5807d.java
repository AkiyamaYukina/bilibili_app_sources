package com.bilibili.playerbizcommonv2.widget.quality;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.theme.R$color;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.ImmutableImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/d.class */
public final class C5807d {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @Nullable final String str, @NotNull final Function0 function0, @NotNull final Function0 function02) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2045475570);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2045475570, i11, -1, "com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityInfo (AIEnhancedQualityInfoUIComponent.kt:76)");
            }
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifier, Color.Companion.m2655getBlack0d7_KjU(), null, 2, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            ImageRequest imageRequest = new ImageRequest(str == null ? "" : str);
            ContentScale.Companion companion3 = ContentScale.Companion;
            ImmutableImageRequest immutableImageRequestA = com.bilibili.ad.adview.story.card.card53.select.component.t.a(companion3, imageRequest);
            Modifier.Companion companion4 = Modifier.Companion;
            BiliImageKt.BiliImage(immutableImageRequestA, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            String strStringResource = StringResources_androidKt.stringResource(2131846323, composerStartRestartGroup, 0);
            long jColorResource = ColorResources_androidKt.colorResource(R$color.Text_white, composerStartRestartGroup, 0);
            TextStyle t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14();
            FontWeight w500 = FontWeight.Companion.getW500();
            Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m1346paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(52), 7, null), companion.getBottomCenter());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            Object fVar = objRememberedValue;
            if (objRememberedValue == companion5.getEmpty()) {
                fVar = new com.bilibili.pegasus.channelv2.detail.tab.baike.f(1);
                composerStartRestartGroup.updateRememberedValue(fVar);
            }
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(ClickableKt.m1186clickableoSLSa3U$default(SemanticsModifierKt.semantics$default(modifierAlign, false, (Function1) fVar, 1, null), false, null, null, null, function0, 15, null), ColorResources_androidKt.colorResource(R$color.Brand_pink, composerStartRestartGroup, 0), RoundedCornerShapeKt.RoundedCornerShape(100));
            float f7 = 24;
            TextKt.m1772Text4IGK_g(strStringResource, PaddingKt.m1343paddingVpY3zN4(modifierM1168backgroundbw27NRU, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(7)), jColorResource, 0L, (FontStyle) null, w500, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, 196608, 0, 65496);
            Painter painterA = Ij0.c.a(2131235863, composerStartRestartGroup, 0);
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(boxScopeInstance.align(PaddingKt.m1346paddingqDBjuR0$default(companion4, 0.0f, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(32), 0.0f, 9, null), companion.getTopEnd()), Dp.m3880constructorimpl(f7));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue2;
            if (objRememberedValue2 == companion5.getEmpty()) {
                obj = new Object();
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            ImageKt.Image(painterA, "关闭", ClickableKt.m1186clickableoSLSa3U$default(SemanticsModifierKt.semantics$default(modifierM1372size3ABfNKs, false, (Function1) obj, 1, null), false, null, null, null, function02, 15, null), (Alignment) null, companion3.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, function0, function02) { // from class: com.bilibili.playerbizcommonv2.widget.quality.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f82797a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f82798b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f82799c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f82800d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f82801e;

                {
                    this.f82797a = str;
                    this.f82798b = function0;
                    this.f82799c = function02;
                    this.f82800d = modifier;
                    this.f82801e = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    C5807d.a(RecomposeScopeImplKt.updateChangedFlags(this.f82801e | 1), (Composer) obj2, this.f82800d, this.f82797a, this.f82798b, this.f82799c);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
