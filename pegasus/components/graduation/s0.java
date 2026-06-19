package com.bilibili.pegasus.components.graduation;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/s0.class */
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f76205c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f76209g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f76211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f76212k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f76216o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f76219r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f76203a = ColorKt.Color(3641182216L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f76204b = Dp.m3880constructorimpl(34);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f76206d = Dp.m3880constructorimpl(ErrorCode.E_VOS_UPDATE_TRUSTTIME);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f76207e = Dp.m3880constructorimpl(440);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f76208f = Dp.m3880constructorimpl(SearchBangumiItem.TYPE_FULLNET_MOVIE);
    public static final float h = Dp.m3880constructorimpl(190);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f76210i = Dp.m3880constructorimpl(48);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f76213l = Dp.m3880constructorimpl(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f76214m = Dp.m3880constructorimpl(23);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f76215n = Dp.m3880constructorimpl(19);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f76217p = Dp.m3880constructorimpl(60);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f76218q = Dp.m3880constructorimpl(356);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f76220s = Dp.m3880constructorimpl(228);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f76221t = Dp.m3880constructorimpl(53);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f76222u = Dp.m3880constructorimpl((float) 453.5d);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f76223v = Dp.m3880constructorimpl(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f76224w = Dp.m3880constructorimpl(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f76225x = Dp.m3880constructorimpl(525);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f76226y = Dp.m3880constructorimpl(330);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f76227z = Dp.m3880constructorimpl(350);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final float f76201A = Dp.m3880constructorimpl(600);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public static final FontFamily f76202B = FontFamilyKt.FontFamily(new androidx.compose.ui.text.font.I(FontWeight.Companion.getNormal(), FontStyle.Companion.m3648getNormal_LCdwA(), new FontVariation.Settings(new FontVariation.a[0]), 0));

    static {
        float f7 = 0;
        f76205c = Dp.m3880constructorimpl(f7);
        float f8 = 200;
        f76209g = Dp.m3880constructorimpl(f8);
        float f9 = 195;
        f76211j = Dp.m3880constructorimpl(f9);
        f76212k = Dp.m3880constructorimpl(f9);
        f76216o = Dp.m3880constructorimpl(f8);
        f76219r = Dp.m3880constructorimpl(f7);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final String str, final boolean z6, final int i7, final long j7, final Modifier modifier, Composer composer, final int i8) {
        long jH;
        long jH2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2029562589);
        int i9 = (i8 & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i8 : i8;
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i11 = i10;
        if ((i8 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(i7) ? 256 : 128);
        }
        if ((i8 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(j7) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i8 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2029562589, i12, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonNoAgeYearText (GraduationSeasonYearSelectDialogView.kt:393)");
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (StringsKt.isBlank(string)) {
                string = null;
            }
            String str2 = string;
            if (string == null) {
                str2 = "2009";
            }
            String string2 = StringsKt.trim(StringsKt.L(StringsKt.substringAfter(str, str2, "以前"), "年", "")).toString();
            if (StringsKt.isBlank(string2)) {
                string2 = null;
            }
            if (string2 == null) {
                string2 = "以前";
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1849994082);
                jH = h(Dp.m3880constructorimpl(25), composerStartRestartGroup);
                jH2 = h(Dp.m3880constructorimpl(20), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i7 <= 1) {
                composerStartRestartGroup.startReplaceGroup(-1849834370);
                jH = h(Dp.m3880constructorimpl(22), composerStartRestartGroup);
                jH2 = h(Dp.m3880constructorimpl(18), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1849683586);
                jH = h(Dp.m3880constructorimpl(18), composerStartRestartGroup);
                jH2 = h(Dp.m3880constructorimpl(15), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(modifier, f76209g), f76210i);
            Alignment.Companion companion = Alignment.Companion;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifierM1358height3ABfNKs, companion.getCenter(), false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
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
            float f7 = 24;
            long jH3 = h(Dp.m3880constructorimpl(f7), composerStartRestartGroup);
            FontWeight.Companion companion3 = FontWeight.Companion;
            FontWeight w700 = companion3.getW700();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextAlign textAlignM3787boximpl = TextAlign.m3787boximpl(companion4.m3794getCentere0LSkKk());
            int i14 = ((i12 >> 3) & 896) | 1769472;
            FontFamily fontFamily = f76202B;
            TextKt.m1772Text4IGK_g(str2, (Modifier) null, j7, jH, (FontStyle) null, w700, fontFamily, 0L, (TextDecoration) null, textAlignM3787boximpl, jH3, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i14, 3072, 121234);
            TextKt.m1772Text4IGK_g(string2, (Modifier) null, j7, jH2, (FontStyle) null, companion3.getW700(), fontFamily, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion4.m3794getCentere0LSkKk()), h(Dp.m3880constructorimpl(f7), composerStartRestartGroup), 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i14, 3072, 121234);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, z6, i7, j7, modifier, i8) { // from class: com.bilibili.pegasus.components.graduation.k0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f76139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f76140b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f76141c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f76142d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f76143e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f76144f;

                {
                    this.f76139a = str;
                    this.f76140b = z6;
                    this.f76141c = i7;
                    this.f76142d = j7;
                    this.f76143e = modifier;
                    this.f76144f = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76144f | 1);
                    long j8 = this.f76142d;
                    Modifier modifier2 = this.f76143e;
                    s0.a(this.f76139a, this.f76140b, this.f76141c, j8, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.bilibili.pegasus.data.config.GraduationSeasonConfig r11, final int r12, final kotlin.jvm.functions.Function1 r13, final androidx.compose.ui.Modifier r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 1540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.s0.b(com.bilibili.pegasus.data.config.GraduationSeasonConfig, int, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@Nullable final GraduationSeasonConfig graduationSeasonConfig, final boolean z6, @NotNull final Function1<? super Integer, Unit> function1, @NotNull final Function1<? super Integer, Unit> function12, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1696509122);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(graduationSeasonConfig) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696509122, i11, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonYearSelectDialogContent (GraduationSeasonYearSelectDialogView.kt:97)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), f76203a, null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(1874271128, true, new Function3(graduationSeasonConfig, z6, function1, function12) { // from class: com.bilibili.pegasus.components.graduation.f0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GraduationSeasonConfig f76118a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f76119b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f76120c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function1 f76121d;

                {
                    this.f76118a = graduationSeasonConfig;
                    this.f76119b = z6;
                    this.f76120c = function1;
                    this.f76121d = function12;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x02d3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
                    /*
                        Method dump skipped, instruction units count: 818
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.f0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(graduationSeasonConfig, z6, function1, function12, i7) { // from class: com.bilibili.pegasus.components.graduation.l0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GraduationSeasonConfig f76146a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f76147b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f76148c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function1 f76149d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f76150e;

                {
                    this.f76146a = graduationSeasonConfig;
                    this.f76147b = z6;
                    this.f76148c = function1;
                    this.f76149d = function12;
                    this.f76150e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76150e | 1);
                    s0.c(this.f76146a, this.f76147b, this.f76148c, this.f76149d, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.foundation.layout.BoxWithConstraintsScope r14, final int r15, final float r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.s0.d(androidx.compose.foundation.layout.BoxWithConstraintsScope, int, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0430  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final androidx.compose.foundation.layout.BoxWithConstraintsScope r26, final com.bilibili.pegasus.data.config.GraduationSeasonConfig r27, final int r28, final kotlin.jvm.functions.Function1 r29, final kotlin.jvm.functions.Function0 r30, final kotlin.jvm.functions.Function0 r31, final float r32, androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.s0.e(androidx.compose.foundation.layout.BoxWithConstraintsScope, com.bilibili.pegasus.data.config.GraduationSeasonConfig, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(final a0 a0Var, final boolean z6, final int i7, final Modifier modifier, Composer composer, final int i8) {
        int i9;
        long jH;
        Composer composerStartRestartGroup = composer.startRestartGroup(817090712);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(a0Var) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i11 = i10;
        if ((i8 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(i7) ? 256 : 128);
        }
        int i12 = i11;
        if ((i8 & 3072) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(817090712, i12, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonYearText (GraduationSeasonYearSelectDialogView.kt:336)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1172495993, i12 & 1022, -1, "com.bilibili.pegasus.components.graduation.graduationSeasonYearTextSize (GraduationSeasonYearSelectDialogView.kt:377)");
            }
            boolean z7 = a0Var.f76106d;
            if (z7 && z6) {
                composerStartRestartGroup.startReplaceGroup(-1487211928);
                jH = h(Dp.m3880constructorimpl(20), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z7 && i7 <= 1) {
                composerStartRestartGroup.startReplaceGroup(-1487209368);
                jH = h(Dp.m3880constructorimpl(18), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z7) {
                composerStartRestartGroup.startReplaceGroup(-1487207352);
                jH = h(Dp.m3880constructorimpl(15), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1487205624);
                jH = h(Dp.m3880constructorimpl(32), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i7 <= 1) {
                composerStartRestartGroup.startReplaceGroup(-1487203736);
                jH = h(Dp.m3880constructorimpl(25), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1487202136);
                jH = h(Dp.m3880constructorimpl(20), composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            long jColor = ColorKt.Color(z6 ? 4294930361L : 4283586650L);
            if (a0Var.f76105c) {
                composerStartRestartGroup.startReplaceGroup(-1924826992);
                a(a0Var.f76104b, z6, i7, jColor, modifier, composerStartRestartGroup, (i12 & 1008) | ((i12 << 3) & 57344));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1924584293);
                TextKt.m1772Text4IGK_g(a0Var.f76104b, SizeKt.wrapContentSize$default(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(modifier, f76209g), f76210i), Alignment.Companion.getCenter(), false, 2, null), jColor, jH, (FontStyle) null, FontWeight.Companion.getW700(), f76202B, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), h(Dp.m3880constructorimpl(24), composerStartRestartGroup), 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 1769472, 3072, 121232);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(a0Var, z6, i7, modifier, i8) { // from class: com.bilibili.pegasus.components.graduation.j0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a0 f76134a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f76135b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f76136c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f76137d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f76138e;

                {
                    this.f76134a = a0Var;
                    this.f76135b = z6;
                    this.f76136c = i7;
                    this.f76137d = modifier;
                    this.f76138e = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76138e | 1);
                    int i13 = this.f76136c;
                    Modifier modifier2 = this.f76137d;
                    s0.f(this.f76134a, this.f76135b, i13, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Composable
    public static final float g(BoxWithConstraintsScope boxWithConstraintsScope, float f7, Composer composer, int i7) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-783586594, i7, -1, "com.bilibili.pegasus.components.graduation.graduationSeasonAdaptiveScale (GraduationSeasonYearSelectDialogView.kt:454)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(1.0f, density.mo1270toPx0680j_4(Dp.m3880constructorimpl(boxWithConstraintsScope.mo1317getMaxWidthD9Ej5fM() - Dp.m3880constructorimpl(f76204b * 2))) / density.mo1270toPx0680j_4(f7)), 0.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fCoerceAtLeast;
    }

    @Composable
    public static final long h(float f7, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2088181423, 6, -1, "com.bilibili.pegasus.components.graduation.graduationSeasonDpTextUnit (GraduationSeasonYearSelectDialogView.kt:448)");
        }
        long sp = TextUnitKt.getSp(f7 / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getFontScale());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sp;
    }
}
