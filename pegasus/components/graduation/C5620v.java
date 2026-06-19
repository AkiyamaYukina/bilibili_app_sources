package com.bilibili.pegasus.components.graduation;

import Di0.C1602f;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/v.class */
public final class C5620v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f76236a = ColorKt.Color(3641182216L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f76237b = Dp.m3880constructorimpl(34);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f76238c = Dp.m3880constructorimpl(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f76239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f76240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f76241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f76242g;
    public static final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f76243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f76244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f76245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f76246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f76247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f76248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f76249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f76250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f76251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f76252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f76253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f76254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f76255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f76256v;

    static {
        float f7 = ErrorCode.E_OPERATIONTYPE_EMPTY;
        f76239d = Dp.m3880constructorimpl(f7);
        f76240e = Dp.m3880constructorimpl(561);
        f76241f = Dp.m3880constructorimpl(f7);
        f76242g = Dp.m3880constructorimpl(512);
        h = Dp.m3880constructorimpl(141);
        f76243i = Dp.m3880constructorimpl(536);
        f76244j = Dp.m3880constructorimpl(25);
        float f8 = 23;
        f76245k = Dp.m3880constructorimpl(f8);
        f76246l = Dp.m3880constructorimpl(f8);
        f76247m = Dp.m3880constructorimpl(442);
        f76248n = Dp.m3880constructorimpl(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD);
        f76249o = Dp.m3880constructorimpl(143);
        f76250p = Dp.m3880constructorimpl(47);
        f76251q = Dp.m3880constructorimpl((float) 33.5d);
        f76252r = Dp.m3880constructorimpl(260);
        f76253s = Dp.m3880constructorimpl(220);
        f76254t = Dp.m3880constructorimpl(84);
        f76255u = Dp.m3880constructorimpl(70);
        f76256v = -16742469;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.foundation.layout.BoxScopeInstance r12, final com.bilibili.pegasus.data.config.GraduationSeasonShareConfig r13, final float r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.C5620v.a(androidx.compose.foundation.layout.BoxScopeInstance, com.bilibili.pegasus.data.config.GraduationSeasonShareConfig, float, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@DrawableRes final int i7, final float f7, final float f8, final float f9, final float f10, final float f11, final Function0<Unit> function0, Composer composer, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(891220295);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i11 = i10;
        if ((i8 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(f8) ? 256 : 128);
        }
        int i12 = i11;
        if ((i8 & 3072) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(f9) ? 2048 : 1024);
        }
        int i13 = i12;
        if ((i8 & 24576) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(f10) ? 16384 : 8192);
        }
        int i14 = i13;
        if ((196608 & i8) == 0) {
            i14 = i13 | (composerStartRestartGroup.changed(f11) ? 131072 : 65536);
        }
        if ((1572864 & i8) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i14) != 599186, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(891220295, i14, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisButton (GraduationSeasonAnalysisDialogView.kt:220)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i7, composerStartRestartGroup, i14 & 14), (String) null, ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1374sizeVpY3zN4(OffsetKt.m1333offsetVpY3zN4(Modifier.Companion, Dp.m3880constructorimpl(f7 * f11), Dp.m3880constructorimpl(f8 * f11)), Dp.m3880constructorimpl(f9 * f11), Dp.m3880constructorimpl(f10 * f11)), false, null, null, null, function0, 15, null), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, f7, f8, f9, f10, f11, function0, i8) { // from class: com.bilibili.pegasus.components.graduation.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f76186a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f76187b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f76188c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final float f76189d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final float f76190e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final float f76191f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function0 f76192g;
                public final int h;

                {
                    this.f76186a = i7;
                    this.f76187b = f7;
                    this.f76188c = f8;
                    this.f76189d = f9;
                    this.f76190e = f10;
                    this.f76191f = f11;
                    this.f76192g = function0;
                    this.h = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    float f12 = this.f76191f;
                    Function0 function02 = this.f76192g;
                    C5620v.b(this.f76186a, this.f76187b, this.f76188c, this.f76189d, this.f76190e, f12, function02, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@Nullable final GraduationSeasonShareConfig graduationSeasonShareConfig, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-483633515);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(graduationSeasonShareConfig) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-483633515, i11, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogContent (GraduationSeasonAnalysisDialogView.kt:67)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), f76236a, null, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(755832889, true, new Function3(graduationSeasonShareConfig, function0, function02, function03) { // from class: com.bilibili.pegasus.components.graduation.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GraduationSeasonShareConfig f76151a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f76152b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f76153c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f76154d;

                {
                    this.f76151a = graduationSeasonShareConfig;
                    this.f76152b = function0;
                    this.f76153c = function02;
                    this.f76154d = function03;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i12 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i12 = iIntValue | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    }
                    if (composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(755832889, i12, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogContent.<anonymous>.<anonymous> (GraduationSeasonAnalysisDialogView.kt:80)");
                        }
                        float fM3880constructorimpl = Dp.m3880constructorimpl(boxWithConstraintsScope.mo1317getMaxWidthD9Ej5fM() - Dp.m3880constructorimpl(C5620v.f76237b * 2));
                        float f7 = C5620v.f76239d;
                        float fMin = Math.min(1.0f, RangesKt.coerceAtLeast(fM3880constructorimpl / f7, 0.0f));
                        float fM3880constructorimpl2 = Dp.m3880constructorimpl(f7 - C5620v.f76246l);
                        float f8 = C5620v.f76249o;
                        float fM3880constructorimpl3 = Dp.m3880constructorimpl(fM3880constructorimpl2 - f8);
                        Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(OffsetKt.m1334offsetVpY3zN4$default(Modifier.Companion, 0.0f, C5620v.f76238c, 1, null), Dp.m3880constructorimpl(f7 * fMin), Dp.m3880constructorimpl(C5620v.f76240e * fMin));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1374sizeVpY3zN4);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        GraduationSeasonShareConfig graduationSeasonShareConfig2 = this.f76151a;
                        C5620v.a(boxScopeInstance2, graduationSeasonShareConfig2, fMin, composer2, 6);
                        C5620v.d(boxScopeInstance2, graduationSeasonShareConfig2, fMin, composer2, 6);
                        float f9 = C5620v.h;
                        float f10 = C5620v.f76243i;
                        float f11 = C5620v.f76244j;
                        C5620v.b(2131245530, f9, f10, f11, f11, fMin, this.f76152b, composer2, 28080);
                        float f12 = C5620v.f76245k;
                        float f13 = C5620v.f76247m;
                        float f14 = C5620v.f76248n;
                        float f15 = C5620v.f76250p;
                        C5620v.b(2131245531, f12, f13, f14, f15, fMin, this.f76153c, composer2, 28080);
                        C5620v.b(2131245533, fM3880constructorimpl3, f13, f8, f15, fMin, this.f76154d, composer2, 28080);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3126, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(graduationSeasonShareConfig, function0, function02, function03, i7) { // from class: com.bilibili.pegasus.components.graduation.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GraduationSeasonShareConfig f76157a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f76158b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f76159c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f76160d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f76161e;

                {
                    this.f76157a = graduationSeasonShareConfig;
                    this.f76158b = function0;
                    this.f76159c = function02;
                    this.f76160d = function03;
                    this.f76161e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76161e | 1);
                    C5620v.c(this.f76157a, this.f76158b, this.f76159c, this.f76160d, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.foundation.layout.BoxScopeInstance r8, final com.bilibili.pegasus.data.config.GraduationSeasonShareConfig r9, final float r10, androidx.compose.runtime.Composer r11, final int r12) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.C5620v.d(androidx.compose.foundation.layout.BoxScopeInstance, com.bilibili.pegasus.data.config.GraduationSeasonShareConfig, float, androidx.compose.runtime.Composer, int):void");
    }
}
