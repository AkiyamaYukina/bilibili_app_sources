package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import C80.D;
import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.layout.J;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.search.inline.card155.N;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.biligame.booktri.benefit.C5314z;
import com.bilibili.biligame.booktri.benefit.G;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.intro.module.promptbar.w;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.GradientColorVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.Arrays;
import java.util.Locale;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.ImmutableImageRequest;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/w.class */
@StabilityInferred(parameters = 0)
public final class w implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PromptBarVo f100770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f100771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final He.k f100772c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/w$a.class */
    public static final class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptBarVo f100773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f100774b;

        public a(PromptBarVo promptBarVo, w wVar) {
            this.f100773a = promptBarVo;
            this.f100774b = wVar;
        }

        @Override // androidx.compose.foundation.lazy.layout.J
        @Composable
        public final void f(int i7, Object obj, Composer composer, int i8) {
            composer.startReplaceGroup(-988682218);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-988682218, 0, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarMultiCardStyle.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Item (PromptBarUIComponent.kt:184)");
            }
            this.f100774b.c(this.f100773a.a().get(i7), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }

        @Override // androidx.compose.foundation.lazy.layout.J
        public final int getItemCount() {
            return this.f100773a.a().size();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/w$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100775a;

        static {
            int[] iArr = new int[PromptBarVo.Style.values().length];
            try {
                iArr[PromptBarVo.Style.Text.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PromptBarVo.Style.Benefit.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PromptBarVo.Style.Gifts.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PromptBarVo.Style.Countdown.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f100775a = iArr;
        }
    }

    public w(@NotNull PromptBarVo promptBarVo, @NotNull ExposureEntry exposureEntry, @NotNull He.k kVar) {
        this.f100770a = promptBarVo;
        this.f100771b = exposureEntry;
        this.f100772c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.united.page.intro.module.promptbar.w.a r10, final float r11, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.promptbar.w.a(com.bilibili.ship.theseus.united.page.intro.module.promptbar.w$a, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(final int i7, final long j7, Composer composer, final Modifier modifier) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1303292579);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed("限时优惠") ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(j7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(this) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1303292579, i11, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipBarCountdownContent (PromptBarUIComponent.kt:474)");
            }
            int i12 = i11 >> 6;
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
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g("限时优惠", (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12(), composerStartRestartGroup, i11 & 14, 0, 65530);
            composerStartRestartGroup.startReplaceGroup(745283258);
            long j8 = Duration.getInWholeDays-impl(j7);
            int i14 = Duration.getHoursComponent-impl(j7);
            int i15 = Duration.getMinutesComponent-impl(j7);
            int i16 = Duration.getSecondsComponent-impl(j7);
            Duration.getNanosecondsComponent-impl(j7);
            if (j8 > 0) {
                composerStartRestartGroup.startReplaceGroup(125034736);
                m(composerStartRestartGroup, i12 & 112, String.valueOf(j8));
                TextKt.m1772Text4IGK_g("天", PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12(), composerStartRestartGroup, 54, 0, 65528);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(125362437);
                composerStartRestartGroup.endReplaceGroup();
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            String str = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            int i17 = i12 & 112;
            m(composerStartRestartGroup, i17, str);
            TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12();
            FontWeight.Companion companion2 = FontWeight.Companion;
            FontWeight w700 = companion2.getW700();
            long j9 = biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU();
            Modifier.Companion companion3 = Modifier.Companion;
            float f7 = 6;
            TextKt.m1772Text4IGK_g(":", PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), j9, 0L, (FontStyle) null, w700, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 196662, 0, 65496);
            m(composerStartRestartGroup, i17, String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15)}, 1)));
            TextKt.m1772Text4IGK_g(":", PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, (FontStyle) null, companion2.getW700(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12(), composerStartRestartGroup, 196662, 0, 65496);
            m(composerStartRestartGroup, i17, String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1)));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, j7, modifier, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100719a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f100720b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f100721c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f100722d;

                {
                    this.f100719a = this;
                    this.f100720b = j7;
                    this.f100721c = modifier;
                    this.f100722d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100722d | 1);
                    long j10 = this.f100720b;
                    Modifier modifier2 = this.f100721c;
                    this.f100719a.b(iUpdateChangedFlags, j10, (Composer) obj, modifier2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(206034042, true, new com.bilibili.biligame.ui.pointmall.lottery.e(this, 2)));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final PromptBarVo.BenefitInfo benefitInfo, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-634355487);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(benefitInfo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, 1 & i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-634355487, i8, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipBenefitContent (PromptBarUIComponent.kt:449)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BiliImageKt.BiliImage(D.b(benefitInfo.f102408b), androidx.compose.foundation.text.contextmenu.internal.J.a(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(22)), 2), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(benefitInfo.f102407a, PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), Color.m2628copywmQWz5c$default(biliTheme.getColors(composerStartRestartGroup, i9).getText_white-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT11(), composerStartRestartGroup, 48, 3072, 57336);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, this, benefitInfo) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f100733a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f100734b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f100735c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f100736d;

                {
                    this.f100733a = i10;
                    this.f100735c = this;
                    this.f100736d = benefitInfo;
                    this.f100734b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f100733a) {
                        case 0:
                            num.intValue();
                            ((w) this.f100735c).c((PromptBarVo.BenefitInfo) this.f100736d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f100734b | 1));
                            break;
                        default:
                            num.getClass();
                            kntr.app.tribee.repost.page.n.a(RecomposeScopeImplKt.updateChangedFlags(this.f100734b | 1), composer2, (Modifier) this.f100735c, (String) this.f100736d);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.promptbar.w.d(com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void e(final PromptBarVo promptBarVo, final Modifier modifier, final ComposableLambda composableLambda, Composer composer, final int i7) {
        int i8;
        long jA;
        long jA2;
        Integer numB;
        Composer composerStartRestartGroup = composer.startRestartGroup(-852383943);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(promptBarVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(composableLambda) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(this) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852383943, i10, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarBackgroundBox (PromptBarUIComponent.kt:316)");
            }
            GradientColorVo gradientColorVoB = promptBarVo.b();
            Color colorA = (gradientColorVoB == null || (numB = gradientColorVoB.b()) == null) ? null : xu0.c.a(numB);
            if (colorA == null) {
                composerStartRestartGroup.startReplaceGroup(1197795389);
                jA = N.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                jA = com.bilibili.ad.adview.videodetail.pausedpage.brand.loopcard.t.a(composerStartRestartGroup, 1197792010, colorA);
            }
            Color colorA2 = null;
            if (gradientColorVoB != null) {
                Integer numA = gradientColorVoB.a();
                colorA2 = null;
                if (numA != null) {
                    colorA2 = xu0.c.a(numA);
                }
            }
            if (colorA2 == null) {
                composerStartRestartGroup.startReplaceGroup(1197799676);
                jA2 = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGa7-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                jA2 = com.bilibili.ad.adview.videodetail.pausedpage.brand.loopcard.t.a(composerStartRestartGroup, 1197796483, colorA2);
            }
            Modifier modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(BackgroundKt.background$default(modifier, Brush.Companion.m2571horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(jA), Color.m2619boximpl(jA2)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), this.f100771b);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierCollectExposureLayoutInfo);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            composableLambda.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i10 >> 3) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, promptBarVo, modifier, composableLambda, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100728a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PromptBarVo f100729b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f100730c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ComposableLambda f100731d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f100732e;

                {
                    this.f100728a = this;
                    this.f100729b = promptBarVo;
                    this.f100730c = modifier;
                    this.f100731d = composableLambda;
                    this.f100732e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100732e | 1);
                    Modifier modifier2 = this.f100730c;
                    ComposableLambda composableLambda2 = this.f100731d;
                    this.f100728a.e(this.f100729b, modifier2, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void f(final int i7, Composer composer, final Modifier modifier, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1737471734);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737471734, i9, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarBackgroundImage (PromptBarUIComponent.kt:342)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageRequest imageRequest = new ImageRequest(str);
            imageRequest.contentScale(ContentScale.Companion.getFillWidth());
            ImmutableImageRequest immutableImageRequestBuild = imageRequest.build();
            Modifier.Companion companion2 = Modifier.Companion;
            BiliImageKt.BiliImage(immutableImageRequestBuild, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Brush.Companion companion3 = Brush.Companion;
            Color.Companion companion4 = Color.Companion;
            if (com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.k.a(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m2571horizontalGradient8A3gB4$default(companion3, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion4.m2655getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion4.m2655getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, modifier, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100737a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f100738b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f100739c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f100740d;

                {
                    this.f100737a = this;
                    this.f100738b = str;
                    this.f100739c = modifier;
                    this.f100740d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100740d | 1);
                    String str2 = this.f100738b;
                    Modifier modifier2 = this.f100739c;
                    this.f100737a.f(iUpdateChangedFlags, (Composer) obj, modifier2, str2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void g(final PromptBarVo promptBarVo, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1860707341);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(promptBarVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1860707341, i9, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarCountdownStyle (PromptBarUIComponent.kt:243)");
            }
            Duration.Companion companion = Duration.Companion;
            long jE = promptBarVo.e();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            long j7 = Duration.minus-LRDsOJo(DurationKt.toDuration(jE, durationUnit), DurationKt.toDuration(ServerClock.unreliableNow(), durationUnit));
            Duration.Companion companion2 = Duration.Companion;
            if (Duration.compareTo-LRDsOJo(j7, companion2.getZERO-UwyO8pc()) <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, promptBarVo, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final w f100744a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final PromptBarVo f100745b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f100746c;

                        {
                            this.f100744a = this;
                            this.f100745b = promptBarVo;
                            this.f100746c = i7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100746c | 1);
                            this.f100744a.g(this.f100745b, (Composer) obj, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            final long jA = com.bilibili.ogv.infra.util.d.a(j7, DurationKt.toDuration(1, DurationUnit.SECONDS), composerStartRestartGroup);
            if (Duration.equals-impl0(jA, companion2.getZERO-UwyO8pc())) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new n(i7, 0, this, promptBarVo));
                    return;
                }
                return;
            }
            e(promptBarVo, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(74)), ComposableLambdaKt.rememberComposableLambda(-1696737780, true, new Function3(promptBarVo, this, jA) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PromptBarVo f100751a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final w f100752b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f100753c;

                {
                    this.f100751a = promptBarVo;
                    this.f100752b = this;
                    this.f100753c = jA;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1696737780, iIntValue, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarCountdownStyle.<anonymous> (PromptBarUIComponent.kt:255)");
                        }
                        PromptBarVo promptBarVo2 = this.f100751a;
                        String strC = promptBarVo2.c();
                        w wVar = this.f100752b;
                        if (strC == null) {
                            composer2.startReplaceGroup(-45063441);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-45063440);
                            wVar.f(48, composer2, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), strC);
                            composer2.endReplaceGroup();
                        }
                        Modifier.Companion companion3 = Modifier.Companion;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null);
                        Alignment.Companion companion4 = Alignment.Companion;
                        Alignment.Vertical centerVertically = companion4.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                        O4.d.c(companion5, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, 0);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                        O4.d.c(companion5, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextVo textVo = promptBarVo2.f102394a;
                        if (textVo == null) {
                            composer2.startReplaceGroup(1938679834);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1938679835);
                            wVar.l(textVo, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        wVar.b(390, this.f100753c, composer2, PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(10), 0.0f, 0.0f, 13, null));
                        composer2.endNode();
                        TextVo textVo2 = (TextVo) CollectionsKt.lastOrNull(promptBarVo2.d());
                        if (textVo2 == null) {
                            composer2.startReplaceGroup(950089010);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(950089011);
                            wVar.d(textVo2, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD | ((i9 << 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2(this, promptBarVo, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100754a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PromptBarVo f100755b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f100756c;

                {
                    this.f100754a = this;
                    this.f100755b = promptBarVo;
                    this.f100756c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100756c | 1);
                    this.f100754a.g(this.f100755b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void h(final PromptBarVo promptBarVo, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1285109277);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(promptBarVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1285109277, i9, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarDefaultStyle (PromptBarUIComponent.kt:70)");
            }
            e(promptBarVo, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(63)), ComposableLambdaKt.rememberComposableLambda(2120644156, true, new Function3(promptBarVo, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PromptBarVo f100759a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final w f100760b;

                {
                    this.f100759a = promptBarVo;
                    this.f100760b = this;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2120644156, iIntValue, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarDefaultStyle.<anonymous> (PromptBarUIComponent.kt:77)");
                        }
                        PromptBarVo promptBarVo2 = this.f100759a;
                        String strC = promptBarVo2.c();
                        w wVar = this.f100760b;
                        if (strC == null) {
                            composer2.startReplaceGroup(1436128447);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1436128448);
                            wVar.f(48, composer2, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), strC);
                            composer2.endReplaceGroup();
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
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
                        Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
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
                        TextVo textVo = promptBarVo2.f102394a;
                        if (textVo == null) {
                            composer2.startReplaceGroup(276187242);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(276187243);
                            wVar.l(textVo, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        TextVo textVoJ = promptBarVo2.j();
                        if (textVoJ == null) {
                            composer2.startReplaceGroup(276309878);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(276309879);
                            wVar.k(textVoJ, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        TextVo textVo2 = (TextVo) CollectionsKt.lastOrNull(promptBarVo2.d());
                        if (textVo2 == null) {
                            composer2.startReplaceGroup(-2128923102);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-2128923101);
                            wVar.d(textVo2, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD | ((i9 << 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, promptBarVo, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100761a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PromptBarVo f100762b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f100763c;

                {
                    this.f100761a = this;
                    this.f100762b = promptBarVo;
                    this.f100763c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100763c | 1);
                    this.f100761a.h(this.f100762b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void i(final PromptBarVo promptBarVo, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(420318011);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(promptBarVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420318011, i9, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarMultiCardStyle (PromptBarUIComponent.kt:149)");
            }
            e(promptBarVo, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(74)), ComposableLambdaKt.rememberComposableLambda(584287572, true, new Function3(promptBarVo, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PromptBarVo f100764a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final w f100765b;

                {
                    this.f100764a = promptBarVo;
                    this.f100765b = this;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(584287572, iIntValue, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarMultiCardStyle.<anonymous> (PromptBarUIComponent.kt:156)");
                        }
                        PromptBarVo promptBarVo2 = this.f100764a;
                        String strC = promptBarVo2.c();
                        w wVar = this.f100765b;
                        if (strC == null) {
                            composer2.startReplaceGroup(-991359321);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-991359320);
                            wVar.f(48, composer2, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), strC);
                            Unit unit = Unit.INSTANCE;
                            composer2.endReplaceGroup();
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
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
                        Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
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
                        TextVo textVo = promptBarVo2.f102394a;
                        if (textVo == null) {
                            composer2.startReplaceGroup(992383954);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(992383955);
                            wVar.l(textVo, composer2, 0);
                            Unit unit2 = Unit.INSTANCE;
                            composer2.endReplaceGroup();
                        }
                        Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(8), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
                        int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1346paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                        Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                        wVar.a(new w.a(promptBarVo2, wVar), Dp.m3880constructorimpl(16), SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl(22)), composer2, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD);
                        composer2.endNode();
                        composer2.endNode();
                        TextVo textVo2 = (TextVo) CollectionsKt.lastOrNull(promptBarVo2.d());
                        if (textVo2 == null) {
                            composer2.startReplaceGroup(4318890);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(4318891);
                            wVar.d(textVo2, composer2, 0);
                            Unit unit3 = Unit.INSTANCE;
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD | ((i9 << 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, this, promptBarVo) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f100712a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f100713b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f100714c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f100715d;

                {
                    this.f100712a = i10;
                    this.f100714c = this;
                    this.f100715d = promptBarVo;
                    this.f100713b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f100712a) {
                        case 0:
                            num.intValue();
                            ((w) this.f100714c).i((PromptBarVo) this.f100715d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f100713b | 1));
                            break;
                        default:
                            num.getClass();
                            tv.danmaku.bili.fullscreen.page.qrcode.e.a(RecomposeScopeImplKt.updateChangedFlags(this.f100713b | 1), composer2, (Modifier) this.f100715d, (String) this.f100714c);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void j(final PromptBarVo promptBarVo, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1374304436);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(promptBarVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1374304436, i9, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarSingleCardStyle (PromptBarUIComponent.kt:110)");
            }
            e(promptBarVo, SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(63)), ComposableLambdaKt.rememberComposableLambda(-586215341, true, new Function3(promptBarVo, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PromptBarVo f100757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final w f100758b;

                {
                    this.f100757a = promptBarVo;
                    this.f100758b = this;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-586215341, iIntValue, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarSingleCardStyle.<anonymous> (PromptBarUIComponent.kt:117)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1344paddingVpY3zN4$default);
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
                        PromptBarVo promptBarVo2 = this.f100757a;
                        BiliImageKt.BiliImage(D.b(promptBarVo2.a().get(0).f102408b), SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 11, null), Dp.m3880constructorimpl(36)), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composer2, 48, 1020);
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
                        w wVar = this.f100758b;
                        TextVo textVo = promptBarVo2.f102394a;
                        if (textVo == null) {
                            composer2.startReplaceGroup(762202111);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(762202112);
                            wVar.l(textVo, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        TextVo textVoJ = promptBarVo2.j();
                        if (textVoJ == null) {
                            composer2.startReplaceGroup(762324747);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(762324748);
                            wVar.k(textVoJ, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        TextVo textVo2 = (TextVo) CollectionsKt.lastOrNull(promptBarVo2.d());
                        if (textVo2 == null) {
                            composer2.startReplaceGroup(166842179);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(166842180);
                            wVar.d(textVo2, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD | ((i9 << 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new G(i7, 1, this, promptBarVo));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void k(final TextVo textVo, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-814287607);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(textVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814287607, i8, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarSubtitle (PromptBarUIComponent.kt:300)");
            }
            TextKt.m1772Text4IGK_g(textVo.f102705a, PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m3880constructorimpl(4), 0.0f, 0.0f, 13, null), ColorKt.Color(textVo.n()), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT11(), composerStartRestartGroup, 48, 3120, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, textVo, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f100741a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TextVo f100742b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f100743c;

                {
                    this.f100741a = this;
                    this.f100742b = textVo;
                    this.f100743c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100743c | 1);
                    this.f100741a.k(this.f100742b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void l(TextVo textVo, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-59602103);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(textVo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59602103, i8, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipPromptBarTitle (PromptBarUIComponent.kt:289)");
            }
            TextKt.m1772Text4IGK_g(textVo.f102705a, (Modifier) null, ColorKt.Color(textVo.n()), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14(), composerStartRestartGroup, 0, 3120, 55290);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C5314z(i7, 1, this, textVo));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void m(Composer composer, int i7, String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1397554047);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397554047, i8, -1, "com.bilibili.ship.theseus.united.page.intro.module.promptbar.PromptBarUIComponent.VipTimeUnitText (PromptBarUIComponent.kt:425)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(22));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            Modifier modifierA = H.a(4, modifierM1372size3ABfNKs, Color.m2628copywmQWz5c$default(biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink_thin-0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, i8 & 14, 3072, 56826);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new X71.e(i7, 1, this, str));
        }
    }
}
