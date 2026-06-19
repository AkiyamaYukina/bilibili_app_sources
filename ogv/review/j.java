package com.bilibili.ogv.review;

import Di0.C1602f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/j.class */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0339  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r27, com.bilibili.ogv.review.k r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.j.a(androidx.compose.ui.Modifier, com.bilibili.ogv.review.k, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.review.k r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.j.b(com.bilibili.ogv.review.k, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i7, final int i8, Composer composer, final Painter painter, final String str, final Function0 function0, boolean z6) {
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(328031146);
        if ((i7 & 6) == 0) {
            i9 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i11 = i9;
        if ((i7 & 48) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i12 = i11;
        if ((i7 & 384) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i13 = i8 & 8;
        if (i13 != 0) {
            i10 = i12 | 3072;
        } else {
            i10 = i12;
            if ((i7 & 3072) == 0) {
                i10 = i12 | (composerStartRestartGroup.changed(z6) ? 2048 : 1024);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            if (i13 != 0) {
                z6 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(328031146, i10, -1, "com.bilibili.ogv.review.ReviewMenuItem (ReviewMenu.kt:111)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(ClickableKt.m1186clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, null, null, function0, 15, null), Dp.m3880constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
            IconKt.m2023Iconww6aTOc(painter, (String) null, SizeKt.m1372size3ABfNKs(RowScopeInstance.INSTANCE.align(companion, companion2.getCenterVertically()), Dp.m3880constructorimpl(24)), ColorResources_androidKt.colorResource(R$color.Brand_pink, composerStartRestartGroup, 0), composerStartRestartGroup, Painter.$stable | 48 | (i10 & 14), 0);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(12)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f7 = 14;
            TextKt.m2186TextNvy7gAk(str, null, ColorResources_androidKt.colorResource(R$color.Text1, composerStartRestartGroup, 0), null, v0.a(f7, 6, 15, composerStartRestartGroup, companion), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, (14 & (i10 >> 3)) | 24576, 0, 262122);
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composerStartRestartGroup, companion);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(1110606897);
                DividerKt.m2007Divider9IZ8Weo(null, Dp.m3880constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(R$color.Ga2, composerStartRestartGroup, 0), composerStartRestartGroup, 48, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1110711646);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z7 = z6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i8, painter, str, function0, z7) { // from class: com.bilibili.ogv.review.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Painter f72434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f72435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f72436c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f72437d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f72438e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f72439f;

                {
                    this.f72434a = painter;
                    this.f72435b = str;
                    this.f72436c = function0;
                    this.f72437d = z7;
                    this.f72438e = i7;
                    this.f72439f = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72438e | 1);
                    boolean z8 = this.f72437d;
                    j.c(iUpdateChangedFlags, this.f72439f, (Composer) obj, this.f72434a, this.f72435b, this.f72436c, z8);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
