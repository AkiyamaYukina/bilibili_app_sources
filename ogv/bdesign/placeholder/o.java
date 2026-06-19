package com.bilibili.ogv.bdesign.placeholder;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/o.class */
public final class o {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final Painter painter, @Nullable final String str, @NotNull final String str2, @Nullable final p pVar, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2052501410);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str2) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(pVar) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052501410, i12, -1, "com.bilibili.ogv.bdesign.placeholder.Placeholder (Placeholder.kt:21)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion2, Dp.m3880constructorimpl(140));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            ImageKt.Image(painter, "error", AlphaKt.alpha(modifierM1372size3ABfNKs, biliTheme.getDayNightTheme(composerStartRestartGroup, i13) == ThemeDayNight.Night ? 0.5f : 1.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | (i12 & 14), 120);
            boolean z6 = true;
            if (str != null) {
                z6 = StringsKt.isBlank(str);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-2051242570);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2051536636);
                BasicTextKt.m1512BasicTextRWo7tUw(str, SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(22)), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT16b(), biliTheme.getColors(composerStartRestartGroup, i13).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, ((i12 >> 3) & 14) | 48, 1016);
                composerStartRestartGroup.endReplaceGroup();
            }
            BasicTextKt.m1512BasicTextRWo7tUw(str2, SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(20)), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT14(), biliTheme.getColors(composerStartRestartGroup, i13).getText3-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, ((i12 >> 6) & 14) | 48, 1016);
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(-2050887031);
                BasicTextKt.m1512BasicTextRWo7tUw(pVar.f67422a, SizeKt.wrapContentSize$default(ClickableKt.m1186clickableoSLSa3U$default(H.a(15, SizeKt.m1377width3ABfNKs(SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(12), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(30)), Dp.m3880constructorimpl(96)), biliTheme.getColors(composerStartRestartGroup, i13).getBrand_pink-0d7_KjU()), false, null, null, null, pVar.f67423b, 15, null), null, false, 3, null), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT14(), biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1016);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2050280330);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(painter, str, str2, pVar, modifier, i7) { // from class: com.bilibili.ogv.bdesign.placeholder.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Painter f67416a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f67417b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f67418c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final p f67419d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f67420e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f67421f;

                {
                    this.f67416a = painter;
                    this.f67417b = str;
                    this.f67418c = str2;
                    this.f67419d = pVar;
                    this.f67420e = modifier;
                    this.f67421f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67421f | 1);
                    p pVar2 = this.f67419d;
                    Modifier modifier2 = this.f67420e;
                    o.a(this.f67416a, this.f67417b, this.f67418c, pVar2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
