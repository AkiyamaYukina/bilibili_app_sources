package com.bilibili.ogv.operation3.module.banner;

import Di0.C1602f;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.contextmenu.internal.J;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.operation3.module.banner.b;
import java.util.List;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.ImmutableImageRequest;
import kntr.common.comment.card.renderer.comment.p0;
import kntr.common.comment.card.renderer.comment.v0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/k.class */
public final class k {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final List list, final PagerState pagerState, final Modifier modifier, Composer composer, final int i7) {
        long jM2628copywmQWz5c$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(1246481151);
        int i8 = (i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7 : i7;
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(pagerState) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1246481151, i10, -1, "com.bilibili.ogv.operation3.module.banner.BannerIndicator (BannerV3SupportModule.kt:160)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
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
            composerStartRestartGroup.startReplaceGroup(-1636193906);
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                boolean z6 = pagerState.getCurrentPage() % list.size() == i11;
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(-677180751);
                    jM2628copywmQWz5c$default = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_white-0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-677106754);
                    jM2628copywmQWz5c$default = Color.m2628copywmQWz5c$default(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_white-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.endReplaceGroup();
                }
                float f7 = 4;
                BoxKt.Box(H.a(f7, SizeKt.m1374sizeVpY3zN4(PaddingKt.m1342padding3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(2)), Dp.m3880constructorimpl(z6 ? 8 : 4), Dp.m3880constructorimpl(f7)), jM2628copywmQWz5c$default), composerStartRestartGroup, 0);
                i11++;
            }
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, pagerState, modifier, list) { // from class: com.bilibili.ogv.operation3.module.banner.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f71155a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PagerState f71156b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f71157c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f71158d;

                {
                    this.f71155a = list;
                    this.f71156b = pagerState;
                    this.f71157c = modifier;
                    this.f71158d = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71158d | 1);
                    k.a(this.f71155a, this.f71156b, this.f71157c, (Composer) obj2, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final b.C0442b c0442b, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-645794384);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c0442b) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-645794384, i9, -1, "com.bilibili.ogv.operation3.module.banner.BannerItem (BannerV3SupportModule.kt:189)");
            }
            float f7 = 8;
            Modifier modifierA = J.a(modifier, f7);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            ImmutableImageRequest immutableImageRequestBuild = new ImageRequest(c0442b.f71126b).build();
            Modifier.Companion companion3 = Modifier.Companion;
            BiliImageKt.BiliImage(immutableImageRequestBuild, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, n.f71159a, n.f71160b, composerStartRestartGroup, 905969712, 252);
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(48)), companion.getBottomStart());
            Brush.Companion companion4 = Brush.Companion;
            Color.Companion companion5 = Color.Companion;
            BoxKt.Box(BackgroundKt.background$default(modifierAlign, Brush.Companion.m2579verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion5.m2655getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion5.m2655getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getBottomStart()), Dp.m3880constructorimpl(12), 0.0f, Dp.m3880constructorimpl(60), Dp.m3880constructorimpl(f7), 2, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextKt.m2186TextNvy7gAk(c0442b.f71125a, modifierM1346paddingqDBjuR0$default, biliTheme.getColors(composerStartRestartGroup, i10).getText_white-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT14(), composerStartRestartGroup, 0, 24960, 110584);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i11, modifier, c0442b) { // from class: com.bilibili.ogv.operation3.module.banner.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f71151a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f71152b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f71153c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f71154d;

                {
                    this.f71151a = i11;
                    this.f71154d = c0442b;
                    this.f71152b = modifier;
                    this.f71153c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = this.f71151a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            k.b((b.C0442b) this.f71154d, this.f71152b, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f71153c | 1));
                            break;
                        default:
                            p0.c((v0) this.f71154d, this.f71152b, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f71153c | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
