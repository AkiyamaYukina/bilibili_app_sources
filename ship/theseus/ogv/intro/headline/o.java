package com.bilibili.ship.theseus.ogv.intro.headline;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import java.util.List;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import oj0.C8225f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/o.class */
public final class o {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable final Painter painter, @Nullable final g gVar, @NotNull final String str, @NotNull final String str2, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-879274245);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(gVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(str2) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879274245, i12, -1, "com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineTitle (OgvHeadlineTitle.kt:35)");
            }
            if (painter != null) {
                composerStartRestartGroup.startReplaceGroup(546701648);
                Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(6), 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
                Modifier.Companion companion2 = Modifier.Companion;
                ImageKt.Image(painter, str, SizeKt.m1358height3ABfNKs(companion2, Dp.m3880constructorimpl(40)), (Alignment) null, ContentScale.Companion.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24960 | (i12 & 14) | ((i12 >> 3) & 112), 104);
                J.a(4, 6, composerStartRestartGroup, companion2);
                b((i12 >> 9) & 14, composerStartRestartGroup, null, str2);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(painter, gVar, str, str2, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Painter f93162a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final g f93163b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final String f93164c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final String f93165d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Modifier f93166e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final int f93167f;

                        {
                            this.f93162a = painter;
                            this.f93163b = gVar;
                            this.f93164c = str;
                            this.f93165d = str2;
                            this.f93166e = modifier;
                            this.f93167f = i7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93167f | 1);
                            String str3 = this.f93165d;
                            Modifier modifier2 = this.f93166e;
                            o.a(this.f93162a, this.f93163b, this.f93164c, str3, modifier2, (Composer) obj, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(547123527);
            composerStartRestartGroup.endReplaceGroup();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            C8225f.a(ComposableLambdaKt.rememberComposableLambda(-924032582, true, new com.bilibili.bplus.followinglist.page.opus.f(gVar, 1), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1268481211, true, new Function2(str2) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f93168a;

                {
                    this.f93168a = str2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1268481211, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineTitle.<anonymous> (OgvHeadlineTitle.kt:61)");
                        }
                        o.b(0, composer2, null, this.f93168a);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), str, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT18b(), biliTheme.getColors(composerStartRestartGroup, i13).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(25), null, null, null, 0, 0, null, 16646142, null), ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo1265roundToPx0680j_4(Dp.m3880constructorimpl(4)), modifier, composerStartRestartGroup, (i12 & 896) | 54 | (458752 & (i12 << 3)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(painter, gVar, str, str2, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Painter f93169a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final g f93170b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f93171c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f93172d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f93173e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f93174f;

                {
                    this.f93169a = painter;
                    this.f93170b = gVar;
                    this.f93171c = str;
                    this.f93172d = str2;
                    this.f93173e = modifier;
                    this.f93174f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93174f | 1);
                    String str3 = this.f93172d;
                    Modifier modifier2 = this.f93173e;
                    o.a(this.f93169a, this.f93170b, this.f93171c, str3, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i7, Composer composer, Modifier modifier, final String str) {
        int i8;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(630858269);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8 | 48;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            modifier2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(630858269, i9, -1, "com.bilibili.ship.theseus.ogv.intro.headline.TitleBadge (OgvHeadlineTitle.kt:71)");
            }
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-878073220);
                ImageRequest imageRequest = new ImageRequest(str);
                imageRequest.useRaw(true);
                BiliImageKt.BiliImage(imageRequest.build(), SizeKt.m1374sizeVpY3zN4(modifier2, Dp.m3880constructorimpl(28), Dp.m3880constructorimpl(16)), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, b.f93121a, (Function4) null, composerStartRestartGroup, 100663296, 764);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-877874107);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, modifier3, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f93175a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f93176b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f93177c;

                {
                    this.f93175a = str;
                    this.f93176b = modifier3;
                    this.f93177c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.b(RecomposeScopeImplKt.updateChangedFlags(this.f93177c | 1), (Composer) obj, this.f93176b, this.f93175a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final g gVar, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1165476051);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(gVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165476051, i8, -1, "com.bilibili.ship.theseus.ogv.intro.headline.TitleLeftContent (OgvHeadlineTitle.kt:84)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1379widthInVpY3zN4$default(companion, 0.0f, Dp.m3880constructorimpl(89), 1, null), Dp.m3880constructorimpl(22));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            Modifier modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(ClickableKt.m1186clickableoSLSa3U$default(PaddingKt.m1343paddingVpY3zN4(H.a(11, modifierM1358height3ABfNKs, biliTheme.getColors(composerStartRestartGroup, i9).getGraph_bg_thin-0d7_KjU()), Dp.m3880constructorimpl(8), Dp.m3880constructorimpl(3)), false, null, null, null, gVar.f93134c, 15, null), gVar.f93133b);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierCollectExposureLayoutInfo);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(Ij0.c.a(2131242007, composerStartRestartGroup, 0), "guideImage", rowScopeInstance.align(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(16)), companion2.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            J.a(2, 6, composerStartRestartGroup, companion);
            String str = gVar.f93132a.f93110c;
            TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12();
            TextKt.m1772Text4IGK_g(str, rowScopeInstance.align(rowScopeInstance.weight(companion, 1.0f, false), companion2.getCenterVertically()), biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composerStartRestartGroup, 0, 3120, 54776);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(gVar, i7, i10) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f93178a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f93179b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f93180c;

                {
                    this.f93178a = i10;
                    this.f93180c = gVar;
                    this.f93179b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f93178a) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93179b | 1);
                            o.c((g) this.f93180c, (Composer) obj, iUpdateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            fd.b.c((List) this.f93180c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f93179b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
