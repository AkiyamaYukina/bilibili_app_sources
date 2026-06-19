package com.bilibili.ship.theseus.ogv.followseason;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/followseason/f.class */
public final class f {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @Nullable final String str, @NotNull final String str2, final boolean z6) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1040384339);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040384339, i11, -1, "com.bilibili.ship.theseus.ogv.followseason.OgvPlayerFollowSeason (OgvPlayerFollowSeasonWidget.kt:144)");
            }
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(SizeKt.m1358height3ABfNKs(modifier, Dp.m3880constructorimpl(26)), ColorKt.Color(1291845632), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1168backgroundbw27NRU);
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
            if (str == null || str.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-1869502235);
                ad.e.a(z6 ? Dp.m3880constructorimpl(8) : Dp.m3880constructorimpl(10), 0, composerStartRestartGroup, Modifier.Companion);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1869765456);
                Modifier.Companion companion2 = Modifier.Companion;
                SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion2, Dp.m3880constructorimpl(1)), composerStartRestartGroup, 6);
                BiliImageKt.BiliImage(new ImageRequest(str).build(), ClipKt.clip(SizeKt.m1372size3ABfNKs(companion2, Dp.m3880constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                H0.e.a(6, 6, composerStartRestartGroup, companion2);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1869383226);
                Painter heart_collect_line_500 = BiliIconfont.INSTANCE.getHeart_collect_line_500(composerStartRestartGroup, 6);
                Modifier.Companion companion3 = Modifier.Companion;
                IconKt.m1714Iconww6aTOc(heart_collect_line_500, str2, SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(16)), Color.Companion.m2666getWhite0d7_KjU(), composerStartRestartGroup, Painter.$stable | 3456 | (i11 & 112), 0);
                H0.e.a(2, 6, composerStartRestartGroup, companion3);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1869118951);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextKt.m1772Text4IGK_g(str2, (Modifier) null, Color.Companion.m2666getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12(), composerStartRestartGroup, ((i11 >> 3) & 14) | 384, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, str2, z6) { // from class: com.bilibili.ship.theseus.ogv.followseason.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92189a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f92190b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f92191c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f92192d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f92193e;

                {
                    this.f92189a = str;
                    this.f92190b = str2;
                    this.f92191c = z6;
                    this.f92192d = modifier;
                    this.f92193e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.a(RecomposeScopeImplKt.updateChangedFlags(this.f92193e | 1), (Composer) obj, this.f92192d, this.f92189a, this.f92190b, this.f92191c);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
