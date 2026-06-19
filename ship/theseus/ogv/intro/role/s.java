package com.bilibili.ship.theseus.ogv.intro.role;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/s.class */
public final class s {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, Composer composer, final Modifier modifier, final boolean z6) {
        int i8;
        long jA;
        long jA2;
        long jA3;
        Composer composerStartRestartGroup = composer.startRestartGroup(801034886);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801034886, i9, -1, "com.bilibili.ship.theseus.ogv.intro.role.FollowUpperButton (OgvRolesLayer.kt:153)");
            }
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(modifier, Dp.m3880constructorimpl(72)), Dp.m3880constructorimpl(24));
            float fM3880constructorimpl = Dp.m3880constructorimpl(1);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(995388660);
                jA = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_bg_thick-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(995389840);
                jA = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            float f7 = 12;
            Modifier modifierA = I.a(f7, modifierM1358height3ABfNKs, fM3880constructorimpl, jA);
            RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f7));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(995396596);
                jA2 = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_bg_thick-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(995397769);
                jA2 = com.bilibili.ad.adview.story.card.card53.select.basic.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(modifierA, jA2, roundedCornerShapeM1502RoundedCornerShape0680j_4);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1168backgroundbw27NRU);
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
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-438995286);
                ImageKt.Image(PainterResources_androidKt.painterResource(2131240926, composerStartRestartGroup, 0), (String) null, SizeKt.m1372size3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-438774070);
                IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getPlus_add_line_900(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(rowScopeInstance.align(Modifier.Companion, companion.getCenterVertically()), Dp.m3880constructorimpl(16)), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBrand_pink-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(z6 ? 2 : 4)), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(z6 ? 2131854813 : 2131854847, composerStartRestartGroup, 0);
            int iM3827getEllipsisgIe3tQ8 = TextOverflow.Companion.m3827getEllipsisgIe3tQ8();
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1815247033);
                jA3 = aj.c.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1815246132);
                jA3 = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            TextKt.m1772Text4IGK_g(strStringResource, (Modifier) null, jA3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT13(), composerStartRestartGroup, 0, 3120, 55290);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, z6) { // from class: com.bilibili.ship.theseus.ogv.intro.role.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f93498a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f93499b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f93500c;

                {
                    this.f93498a = z6;
                    this.f93499b = modifier;
                    this.f93500c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s.a(RecomposeScopeImplKt.updateChangedFlags(this.f93500c | 1), (Composer) obj, this.f93499b, this.f93498a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final k kVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-678557134);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(kVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678557134, i9, -1, "com.bilibili.ship.theseus.ogv.intro.role.OgvRoleInLayer (OgvRolesLayer.kt:91)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            float f7 = 40;
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(f7));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomEnd(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1372size3ABfNKs);
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
            BiliImageKt.BiliImage((String) kVar.f93485f.getValue(), ClipKt.clip(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 0, 4092);
            Integer num = (Integer) kVar.f93487i.getValue();
            if (num != null) {
                composerStartRestartGroup.startReplaceGroup(2141441400);
                ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, 0), (String) null, BorderKt.m1172borderxT4_qwU(SizeKt.m1372size3ABfNKs(companion3, Dp.m3880constructorimpl(11)), Dp.m3880constructorimpl(1), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getWh0-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2141885382);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            float f8 = 12;
            J.a(f8, 6, composerStartRestartGroup, companion3);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = (String) kVar.f93483d.getValue();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            int iM3827getEllipsisgIe3tQ8 = companion4.m3827getEllipsisgIe3tQ8();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT14(), composerStartRestartGroup, 0, 3120, 55290);
            TextKt.m1772Text4IGK_g((String) kVar.f93484e.getValue(), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12(), composerStartRestartGroup, 0, 3120, 55290);
            Re.t.b(composerStartRestartGroup, f8, companion3, composerStartRestartGroup, 6);
            if (((Boolean) kVar.h.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1293568381);
                a(0, composerStartRestartGroup, ClickableKt.m1186clickableoSLSa3U$default(companion3, false, null, null, null, kVar.f93481b, 15, null), ((Boolean) kVar.f93486g.getValue()).booleanValue());
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1293467476);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(kVar, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.role.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k f93492a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f93493b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f93494c;

                {
                    this.f93492a = kVar;
                    this.f93493b = modifier;
                    this.f93494c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93494c | 1);
                    s.b(this.f93492a, this.f93493b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01af  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.role.e r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r15, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.s.c(com.bilibili.ship.theseus.ogv.intro.role.e, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ae  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.bilibili.ship.theseus.ogv.intro.role.e r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.s.d(com.bilibili.ship.theseus.ogv.intro.role.e, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
