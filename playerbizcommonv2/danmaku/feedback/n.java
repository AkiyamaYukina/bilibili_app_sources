package com.bilibili.playerbizcommonv2.danmaku.feedback;

import Di0.C1602f;
import I.E;
import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommonv2.danmaku.feedback.n;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5787g;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsStyle;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import h80.x;
import h80.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/n.class */
@StabilityInferred(parameters = 1)
public final class n implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f80908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f80909b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f80911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f80912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f80913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f80914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f80915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f80916g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f80917i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f80918j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f80919k;

        public a(int i7, String str, String str2, int i8, DanmakuSettingsStyle danmakuSettingsStyle, int i9, int i10, int i11, int i12) {
            str2 = (i12 & 8) != 0 ? "" : str2;
            i8 = (i12 & 32) != 0 ? 2131238689 : i8;
            danmakuSettingsStyle = (i12 & 64) != 0 ? DanmakuSettingsStyle.MIDDLE : danmakuSettingsStyle;
            i9 = (i12 & 128) != 0 ? R$color.Text1 : i9;
            int i13 = R$color.Text3;
            i10 = (i12 & 512) != 0 ? R$color.Bg1_float : i10;
            i11 = (i12 & 1024) != 0 ? R$color.Line_regular : i11;
            this.f80910a = i7;
            this.f80911b = str;
            this.f80912c = 1;
            this.f80913d = str2;
            this.f80914e = 1;
            this.f80915f = i8;
            this.f80916g = danmakuSettingsStyle;
            this.h = i9;
            this.f80917i = i13;
            this.f80918j = i10;
            this.f80919k = i11;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f80910a == aVar.f80910a && Intrinsics.areEqual(this.f80911b, aVar.f80911b) && this.f80912c == aVar.f80912c && Intrinsics.areEqual(this.f80913d, aVar.f80913d) && this.f80914e == aVar.f80914e && this.f80915f == aVar.f80915f && this.f80916g == aVar.f80916g && this.h == aVar.h && this.f80917i == aVar.f80917i && this.f80918j == aVar.f80918j && this.f80919k == aVar.f80919k;
        }

        public final int hashCode() {
            int iA = I.a(this.f80915f, I.a(this.f80914e, E.a(I.a(this.f80912c, E.a(Integer.hashCode(this.f80910a) * 31, 31, this.f80911b), 31), 31, this.f80913d), 31), 31);
            return Integer.hashCode(this.f80919k) + I.a(this.f80918j, I.a(this.f80917i, I.a(this.h, (this.f80916g.hashCode() + iA) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemContent(startIconRes=");
            sb.append(this.f80910a);
            sb.append(", title=");
            sb.append(this.f80911b);
            sb.append(", titleLineLimit=");
            sb.append(this.f80912c);
            sb.append(", subtitle=");
            sb.append(this.f80913d);
            sb.append(", subtitleLineLimit=");
            sb.append(this.f80914e);
            sb.append(", endIconRes=");
            sb.append(this.f80915f);
            sb.append(", style=");
            sb.append(this.f80916g);
            sb.append(", titleTextColor=");
            sb.append(this.h);
            sb.append(", subtitleTextColor=");
            sb.append(this.f80917i);
            sb.append(", bgColor=");
            sb.append(this.f80918j);
            sb.append(", dividerColor=");
            return C4277b.a(this.f80919k, ")", sb);
        }
    }

    public n(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f80908a = aVar;
        this.f80909b = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(-825560963, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f80905a;

            {
                this.f80905a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-825560963, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackItem.bindToView.<anonymous> (DanmakuFeedbackItem.kt:53)");
                    }
                    final n nVar = this.f80905a;
                    final int i7 = 0;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(172891189, true, new Function2(nVar, i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f80906a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f80907b;

                        {
                            this.f80906a = i7;
                            this.f80907b = nVar;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            Object obj5 = this.f80907b;
                            boolean z6 = false;
                            switch (this.f80906a) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(172891189, iIntValue2, -1, "com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackItem.bindToView.<anonymous>.<anonymous> (DanmakuFeedbackItem.kt:54)");
                                        }
                                        Modifier.Companion companion = Modifier.Companion;
                                        Modifier modifierM1360heightInVpY3zN4$default = SizeKt.m1360heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(52), 0.0f, 2, null);
                                        float f7 = com.bilibili.playerbizcommonv2.danmaku.setting.v2.r.f81461a;
                                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(modifierM1360heightInVpY3zN4$default, f7, 0.0f, 2, null);
                                        n nVar2 = (n) obj5;
                                        long jColor = ColorKt.Color(C5787g.d(nVar2.f80908a.f80918j, composer2, 0));
                                        n.a aVar = nVar2.f80908a;
                                        DanmakuSettingsStyle danmakuSettingsStyle = aVar.f80916g;
                                        Modifier modifierM1342padding3ABfNKs = PaddingKt.m1342padding3ABfNKs(C5787g.c(BackgroundKt.m1168backgroundbw27NRU(modifierM1344paddingVpY3zN4$default, jColor, com.bilibili.playerbizcommonv2.danmaku.setting.v2.r.c(danmakuSettingsStyle)), com.bilibili.playerbizcommonv2.danmaku.setting.v2.r.b(danmakuSettingsStyle), ColorKt.Color(C5787g.d(aVar.f80919k, composer2, 0))), f7);
                                        Alignment.Companion companion2 = Alignment.Companion;
                                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1342padding3ABfNKs);
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
                                        int i8 = aVar.h;
                                        int i9 = aVar.f80910a;
                                        if (i9 != -1) {
                                            IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(AppCompatResources.getDrawable((Context) LA.f.b(composer2, -554174413), i9), composer2, 0), (String) null, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(20)), ColorKt.Color(C5787g.d(i8, composer2, 0)), composer2, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                                            H0.e.a(8, 6, composer2, companion);
                                        } else {
                                            composer2.startReplaceGroup(-553469039);
                                            composer2.endReplaceGroup();
                                        }
                                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
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
                                        O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        long jColor2 = ColorKt.Color(C5787g.d(i8, composer2, 0));
                                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                                        int i10 = BiliTheme.$stable;
                                        TextKt.m1772Text4IGK_g(aVar.f80911b, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), jColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, aVar.f80912c, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer2, i10).getT14(), composer2, 48, 0, 57336);
                                        if (aVar.f80913d.length() > 0) {
                                            composer2.startReplaceGroup(1475675909);
                                            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(2, 6, composer2, companion);
                                            TextKt.m1772Text4IGK_g(aVar.f80913d, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorKt.Color(C5787g.d(aVar.f80917i, composer2, 0)), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, aVar.f80914e, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer2, i10).getT12(), composer2, 48, 0, 57336);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(1476169863);
                                            composer2.endReplaceGroup();
                                        }
                                        composer2.endNode();
                                        int i11 = aVar.f80915f;
                                        if (i11 != -1) {
                                            IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(AppCompatResources.getDrawable((Context) LA.f.b(composer2, -552323279), i11), composer2, 0), (String) null, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(16)), biliTheme.getColors(composer2, i10).getText3-0d7_KjU(), composer2, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-551708239);
                                            composer2.endReplaceGroup();
                                        }
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    z.a aVar2 = z.Companion;
                                    if ((iIntValue3 & 3) != 2) {
                                        z6 = true;
                                    }
                                    if (composer3.shouldExecute(z6, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(81927095, iIntValue3, -1, "com.bilibili.lib.fasthybrid.game.scenarios.game.ui.widget.OnlineLoadingErrorView.<anonymous> (OnlineLoadingErrorView.kt:58)");
                                        }
                                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1551415953, true, new x((z) obj5), composer3, 54), composer3, 384, 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        ((ComposeView) bVar.a).setOnClickListener(new GB.c(this, 4));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
