package com.bilibili.search2.result.bangumi;

import Di0.C1602f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/q.class */
public final class q {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, @NotNull final String str, @NotNull final String str2, @Nullable final String str3) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2135736747);
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
            i10 = i9 | (composerStartRestartGroup.changed(str3) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, 1 & i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135736747, i11, -1, "com.bilibili.search2.result.bangumi.BikanUi (BikanUi.kt:24)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            long jColor = ColorKt.Color(com.bilibili.search2.utils.B.s(biliTheme.getDayNightTheme(composerStartRestartGroup, i12) == ThemeDayNight.Day ? str : str2, "#A5816A"));
            if (str3 == null || str3.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-86980403);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-87536822);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
                BasicTextKt.m1512BasicTextRWo7tUw(str3, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i12).getT12(), jColor, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, ((i11 >> 6) & 14) | 24576, 1002);
                ImageKt.Image(BiliIconfont.INSTANCE.getArrow_forward_right_line_900(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, ColorKt.Color(4289036650L), 0, 2, null), composerStartRestartGroup, Painter.$stable | 1573296, 56);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, str2, str3) { // from class: com.bilibili.search2.result.bangumi.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f87450a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f87451b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f87452c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f87453d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f87454e;

                {
                    this.f87450a = str;
                    this.f87451b = str2;
                    this.f87452c = str3;
                    this.f87453d = modifier;
                    this.f87454e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.a(RecomposeScopeImplKt.updateChangedFlags(this.f87454e | 1), (Composer) obj, this.f87453d, this.f87450a, this.f87451b, this.f87452c);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
