package com.bilibili.ogv.secondary;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.vip.cashier2.purchase.dialog.VipBuyResultDialogViewModel;
import java.util.ArrayList;
import java.util.List;
import kntr.common.router.UrisKt;
import kntr.common.trio.navigationevent.BackHandlerKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/q.class */
public final class q {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final PagerState pagerState, @NotNull final List list, @NotNull final Function0 function0, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        com.bilibili.ogv.secondary.api.h hVar;
        Composer composerStartRestartGroup = composer.startRestartGroup(545827944);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(list) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(545827944, i11, -1, "com.bilibili.ogv.secondary.PageReadyUi (PageReadyUi.kt:27)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objCreateCompositionCoroutineScope = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objCreateCompositionCoroutineScope);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objCreateCompositionCoroutineScope;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifier, biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU(), null, 2, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable));
            float f7 = 44;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(modifierWindowInsetsPadding, Dp.m3880constructorimpl(f7));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            final int i13 = 0;
            com.bilibili.ogv.bdesign.tab.m.a(pagerState.getCurrentPage(), boxScopeInstance.align(companion3, companion.getCenter()), biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU(), 0L, Dp.m3880constructorimpl(f7), ComposableLambdaKt.rememberComposableLambda(290356870, true, new Function3(pagerState, i13) { // from class: com.bilibili.ogv.secondary.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f72698a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f72699b;

                {
                    this.f72698a = i13;
                    this.f72699b = pagerState;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (this.f72698a) {
                        case 0:
                            List list2 = (List) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(290356870, iIntValue, -1, "com.bilibili.ogv.secondary.PageReadyUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PageReadyUi.kt:52)");
                            }
                            TabRowDefaults.INSTANCE.m2123SecondaryIndicator9IZ8Weo(androidx.compose.foundation.text.contextmenu.internal.J.a(PaddingKt.m1346paddingqDBjuR0$default(com.bilibili.ogv.bdesign.tab.m.c(Modifier.Companion, (com.bilibili.ogv.bdesign.tab.e) list2.get(((PagerState) this.f72699b).getCurrentPage()), composer2), 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(10), 7, null), 3), 0.0f, 0L, composer2, TabRowDefaults.$stable << 9, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            break;
                        default:
                            com.bilibili.vip.cashier2.i iVar = (com.bilibili.vip.cashier2.i) obj;
                            Composer composer3 = (Composer) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            int i14 = iIntValue2;
                            if ((iIntValue2 & 6) == 0) {
                                i14 = iIntValue2 | ((iIntValue2 & 8) == 0 ? composer3.changed(iVar) : composer3.changedInstance(iVar) ? 4 : 2);
                            }
                            if (composer3.shouldExecute((i14 & 19) != 18, i14 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(176825097, i14, -1, "com.bilibili.vip.cashier2.payment.PaymentResultDialogService.keepShowing.<anonymous> (PaymentResultDialogService.kt:48)");
                                }
                                com.bilibili.vip.cashier2.purchase.dialog.a.c((VipBuyResultDialogViewModel) this.f72699b, iVar.a(), composer3, 0);
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
            }, composerStartRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(343772294, true, new Function2(list, pagerState, coroutineScope) { // from class: com.bilibili.ogv.secondary.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f72700a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PagerState f72701b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CoroutineScope f72702c;

                {
                    this.f72700a = list;
                    this.f72701b = pagerState;
                    this.f72702c = coroutineScope;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r16, java.lang.Object r17) {
                    /*
                        Method dump skipped, instruction units count: 297
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12804096, 72);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Brush.Companion companion4 = Brush.Companion;
            Pair pair = TuplesKt.to(Float.valueOf(0.0f), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU()));
            Pair pair2 = TuplesKt.to(Float.valueOf(0.05f), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU()));
            Color.Companion companion5 = Color.Companion;
            BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m2572horizontalGradient8A3gB4$default(companion4, new Pair[]{pair, pair2, Z50.b.b(companion5, Float.valueOf(0.1f)), Z50.b.b(companion5, Float.valueOf(0.9f)), TuplesKt.to(Float.valueOf(0.95f), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            float f8 = 36;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f8), 0.0f, 0.0f, 0.0f, 14, null);
            float f9 = 20;
            BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.align(SizeKt.fillMaxHeight$default(SizeKt.m1377width3ABfNKs(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f9)), 0.0f, 1, null), companion.getCenterStart()), Brush.Companion.m2573linearGradientmHitzGk$default(companion4, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU()), Color.m2619boximpl(Color.m2628copywmQWz5c$default(biliTheme.getColors(composerStartRestartGroup, i12).getBg1-0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            BiliIconfont biliIconfont = BiliIconfont.INSTANCE;
            Painter arrow_back_left_line_500 = biliIconfont.getArrow_back_left_line_500(composerStartRestartGroup, 6);
            Modifier modifierM1358height3ABfNKs2 = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion3, Dp.m3880constructorimpl(f8)), Dp.m3880constructorimpl(f7));
            float f10 = 12;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f10);
            float f11 = 10;
            Modifier modifierAlign = boxScopeInstance.align(BackHandlerKt.goBackOnClick-cJG_KMw(PaddingKt.m1346paddingqDBjuR0$default(modifierM1358height3ABfNKs2, fM3880constructorimpl, Dp.m3880constructorimpl(f11), 0.0f, Dp.m3880constructorimpl(f11), 4, null), false, (String) null, (Role) null, (MutableInteractionSource) null, composerStartRestartGroup, 6, 15), companion.getCenterStart());
            long j7 = biliTheme.getColors(composerStartRestartGroup, i12).getText2-0d7_KjU();
            int i14 = Painter.$stable | 48;
            IconKt.m2023Iconww6aTOc(arrow_back_left_line_500, "back", modifierAlign, j7, composerStartRestartGroup, i14, 0);
            boolean z6 = false;
            IconKt.m2023Iconww6aTOc(biliIconfont.getMagnifier_search_line_500(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(ClickableKt.m1186clickableoSLSa3U$default(boxScopeInstance.align(PaddingKt.m1343paddingVpY3zN4(SizeKt.wrapContentSize$default(companion3, null, false, 3, null), Dp.m3880constructorimpl(f10), Dp.m3880constructorimpl(f10)), companion.getCenterEnd()), false, null, null, null, function0, 15, null), Dp.m3880constructorimpl(f9)), biliTheme.getColors(composerStartRestartGroup, i12).getText1-0d7_KjU(), composerStartRestartGroup, i14, 0);
            composerStartRestartGroup.endNode();
            C5529j c5529j = (C5529j) CollectionsKt.getOrNull(list, pagerState.getCurrentPage());
            if (c5529j != null && (hVar = c5529j.f72696a) != null && (hVar instanceof com.bilibili.ogv.secondary.api.j)) {
                z6 = true;
            }
            PagerKt.m1477HorizontalPager8jOkeI(pagerState, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, null, 0, 0.0f, null, null, !z6, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(576132049, true, new Function4(pagerState, list) { // from class: com.bilibili.ogv.secondary.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f72703a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PagerState f72704b;

                {
                    this.f72703a = list;
                    this.f72704b = pagerState;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    List list2 = this.f72703a;
                    int iIntValue = ((Integer) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(576132049, iIntValue2, -1, "com.bilibili.ogv.secondary.PageReadyUi.<anonymous>.<anonymous> (PageReadyUi.kt:152)");
                    }
                    C5529j c5529j2 = (C5529j) ((ArrayList) list2).get(iIntValue);
                    String queryParameter = UrisKt.toUri(c5529j2.f72696a.b()).getQueryParameter("page_name");
                    String str = queryParameter;
                    if (queryParameter == null) {
                        str = "";
                    }
                    kntr.common.pv.compose.PagerKt.a(android.support.v4.media.a.a("pgc.", str, ".0.0.pv"), this.f72704b, iIntValue, composer2, (iIntValue2 << 3) & 896);
                    c5529j2.f72697b.invoke(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 48, 24576, 16124);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(pagerState, list, function0, modifier, i7) { // from class: com.bilibili.ogv.secondary.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PagerState f72705a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f72706b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f72707c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f72708d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f72709e;

                {
                    this.f72705a = pagerState;
                    this.f72706b = list;
                    this.f72707c = function0;
                    this.f72708d = modifier;
                    this.f72709e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72709e | 1);
                    Function0 function02 = this.f72707c;
                    Modifier modifier2 = this.f72708d;
                    q.a(this.f72705a, this.f72706b, function02, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
