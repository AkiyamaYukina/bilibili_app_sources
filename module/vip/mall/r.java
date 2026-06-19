package com.bilibili.module.vip.mall;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.internal.J;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
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
import androidx.compose.ui.layout.ContentScale;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.bilibili.app.authorspace.ui.pages.serieslist.D;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/r.class */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final Modifier modifier, final VipBuyResultDialogViewModel vipBuyResultDialogViewModel, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1975215385);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(vipBuyResultDialogViewModel) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1975215385, i9, -1, "com.bilibili.module.vip.mall.AutoPayReward (VipPaymentResultDialog.kt:554)");
            }
            List list = (List) vipBuyResultDialogViewModel.f66218n.getValue();
            if (list == null || list.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, vipBuyResultDialogViewModel, i7) { // from class: com.bilibili.module.vip.mall.l

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Modifier f66269a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final VipBuyResultDialogViewModel f66270b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f66271c;

                        {
                            this.f66269a = modifier;
                            this.f66270b = vipBuyResultDialogViewModel;
                            this.f66271c = i7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f66271c | 1);
                            r.a(this.f66269a, this.f66270b, (Composer) obj, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            String str = (String) vipBuyResultDialogViewModel.f66217m.getValue();
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            List list2 = (List) vipBuyResultDialogViewModel.f66218n.getValue();
            if (list2 == null) {
                composerStartRestartGroup.startReplaceGroup(1705635745);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1705635746);
                if (list2.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-1855857257);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (list2.size() == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1999527579);
                    c(SizeKt.m1377width3ABfNKs(modifier, Dp.m3880constructorimpl(240)), (VipPayGift) list2.get(0), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (list2.size() > 1) {
                        composerStartRestartGroup.startReplaceGroup(-1999524349);
                        b(0, composerStartRestartGroup, SizeKt.m1377width3ABfNKs(modifier, Dp.m3880constructorimpl(256)), str2, CollectionsKt.take(list2, 3));
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1855595369);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(i7, i10, modifier, vipBuyResultDialogViewModel) { // from class: com.bilibili.module.vip.mall.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f66272a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f66273b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f66274c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f66275d;

                {
                    this.f66272a = i10;
                    this.f66274c = modifier;
                    this.f66275d = vipBuyResultDialogViewModel;
                    this.f66273b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f66272a) {
                        case 0:
                            num.getClass();
                            r.a((Modifier) this.f66274c, (VipBuyResultDialogViewModel) this.f66275d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f66273b | 1));
                            break;
                        default:
                            int iIntValue = num.intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1082125763, iIntValue, -1, "kntr.app.appwidget.guide.ui.AppWidgetGuidePopupHost.<anonymous>.<anonymous> (AppWidgetGuidePopupState.kt:43)");
                                }
                                int style = ((kntr.app.appwidget.guide.ui.o) this.f66274c).getStyle();
                                kntr.app.appwidget.guide.ui.o oVar = (kntr.app.appwidget.guide.ui.o) this.f66275d;
                                int i11 = this.f66273b;
                                if (style == 0) {
                                    composer2.startReplaceGroup(-540770856);
                                    kntr.app.appwidget.guide.ui.n.a(oVar, Integer.valueOf(i11), composer2, 0);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-540768170);
                                    kntr.app.appwidget.guide.ui.l.c(oVar, Integer.valueOf(i11), composer2, 0);
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i7, Composer composer, final Modifier modifier, final String str, final List list) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-410228958);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(list) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-410228958, i10, -1, "com.bilibili.module.vip.mall.AutoPayRewardList (VipPaymentResultDialog.kt:575)");
            }
            Modifier modifierA = J.a(modifier, 8);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierA, biliTheme.getColors(composerStartRestartGroup, i11).getSi1-0d7_KjU(), null, 2, null);
            float f7 = 12;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(modifierM1169backgroundbw27NRU$default, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(13), 5, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            TextKt.m1772Text4IGK_g(str, PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12b(), composerStartRestartGroup, ((i10 >> 3) & 14) | 48, 0, 65528);
            int size = list.size();
            float fM3880constructorimpl = size != 2 ? size != 3 ? Dp.m3880constructorimpl(24) : Dp.m3880constructorimpl(24) : Dp.m3880constructorimpl(65);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(companion3, fM3880constructorimpl, Dp.m3880constructorimpl(f7), fM3880constructorimpl, 0.0f, 8, null), 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getTop(), composerStartRestartGroup, 6);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-898849605);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VipPayGift vipPayGift = (VipPayGift) it.next();
                Modifier.Companion companion4 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                O4.d.c(companion5, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion5, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                BiliImageKt.BiliImage(vipPayGift.a(), SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion4, Dp.m3880constructorimpl(41)), Dp.m3880constructorimpl(51)), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 0, 4092);
                TextKt.m1772Text4IGK_g(vipPayGift.c(), (Modifier) null, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText2-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup.endNode();
            }
            if (com.bilibili.ad.reward.test.J.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, str, list, i7) { // from class: com.bilibili.module.vip.mall.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f66287a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f66288b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f66289c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f66290d;

                {
                    this.f66287a = modifier;
                    this.f66288b = str;
                    this.f66289c = list;
                    this.f66290d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    List list2 = this.f66289c;
                    ((Integer) obj2).getClass();
                    r.b(RecomposeScopeImplKt.updateChangedFlags(this.f66290d | 1), (Composer) obj, this.f66287a, this.f66288b, list2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(Modifier modifier, VipPayGift vipPayGift, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(628187244);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(vipPayGift) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628187244, i9, -1, "com.bilibili.module.vip.mall.AutoPayRewardSingle (VipPaymentResultDialog.kt:630)");
            }
            Modifier modifierA = J.a(modifier, 8);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierA2 = D.a(BackgroundKt.m1169backgroundbw27NRU$default(modifierA, biliTheme.getColors(composerStartRestartGroup, i10).getSi1-0d7_KjU(), null, 2, null), 58, 0.0f, 1, (Object) null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA2);
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
            Modifier.Companion companion3 = Modifier.Companion;
            float f7 = 20;
            BiliImageKt.BiliImage(vipPayGift.a(), SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(PaddingKt.m1345paddingqDBjuR0(companion3, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(5), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(1)), Dp.m3880constructorimpl(41)), Dp.m3880constructorimpl(51)), (String) null, false, 0, (String) null, true, (Function3) null, (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 806879232, 0, 3516);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion.getStart(), composerStartRestartGroup, 6);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strD = vipPayGift.d();
            String str = strD;
            if (strD == null) {
                str = "";
            }
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12b(), composerStartRestartGroup, 0, 0, 65530);
            TextKt.m1772Text4IGK_g(vipPayGift.c(), PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(4), 0.0f, 0.0f, 13, null), biliTheme.getColors(composerStartRestartGroup, i10).getText2-0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(modifier, vipPayGift, i7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0 r17, boolean r18, final java.lang.String r19, final java.util.Map r20, final com.bilibili.framework.exposure.core.ExposureEntry r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.r.d(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean, java.lang.String, java.util.Map, com.bilibili.framework.exposure.core.ExposureEntry, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(@NotNull final VipBuyResultDialogViewModel vipBuyResultDialogViewModel, @NotNull final Map map, @Nullable final Function0 function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-47571920);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(vipBuyResultDialogViewModel) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(map) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-47571920, i10, -1, "com.bilibili.module.vip.mall.VipPaymentResultDialog (VipPaymentResultDialog.kt:315)");
            }
            if (((Boolean) vipBuyResultDialogViewModel.f66207b.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(124587966);
                BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-1562335037, true, new Function2(function0, vipBuyResultDialogViewModel, map) { // from class: com.bilibili.module.vip.mall.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function0 f66262a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final VipBuyResultDialogViewModel f66263b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Map f66264c;

                    {
                        this.f66262a = function0;
                        this.f66263b = vipBuyResultDialogViewModel;
                        this.f66264c = map;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Map map2 = this.f66264c;
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1562335037, iIntValue, -1, "com.bilibili.module.vip.mall.VipPaymentResultDialog.<anonymous> (VipPaymentResultDialog.kt:320)");
                            }
                            AndroidDialog_androidKt.Dialog(this.f66262a, new DialogProperties(false, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1402543372, true, new Function2(this.f66263b, map2) { // from class: com.bilibili.module.vip.mall.h

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final VipBuyResultDialogViewModel f66256a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Map f66257b;

                                {
                                    this.f66256a = vipBuyResultDialogViewModel;
                                    this.f66257b = map2;
                                }

                                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:129:0x0973  */
                                /* JADX WARN: Removed duplicated region for block: B:44:0x0444  */
                                /* JADX WARN: Removed duplicated region for block: B:68:0x0592  */
                                /* JADX WARN: Removed duplicated region for block: B:95:0x07cc  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) throws kotlin.NoWhenBranchMatchedException {
                                    /*
                                        Method dump skipped, instruction units count: 2808
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.h.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            }, composer2, 54), composer2, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(132879474);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(vipBuyResultDialogViewModel, map, function0, i7) { // from class: com.bilibili.module.vip.mall.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VipBuyResultDialogViewModel f66265a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Map f66266b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f66267c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f66268d;

                {
                    this.f66265a = vipBuyResultDialogViewModel;
                    this.f66266b = map;
                    this.f66267c = function0;
                    this.f66268d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f66268d | 1);
                    r.e(this.f66265a, this.f66266b, this.f66267c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
