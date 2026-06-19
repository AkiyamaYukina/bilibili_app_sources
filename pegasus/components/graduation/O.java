package com.bilibili.pegasus.components.graduation;

import Di0.C1602f;
import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.authorspace.ui.D0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import com.bilibili.pegasus.data.config.GraduationSeasonGuideConfig;
import com.bilibili.search2.api.SearchBangumiItem;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/O.class */
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f76076b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f76078d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f76081g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f76082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f76083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f76084k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f76075a = Dp.m3880constructorimpl(80);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f76077c = Dp.m3880constructorimpl(351);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f76079e = Dp.m3880constructorimpl(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f76080f = Dp.m3880constructorimpl(36);
    public static final float h = Dp.m3880constructorimpl(84);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f76085l = ColorKt.Color(4291423999L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f76086m = ColorKt.Color(4283348195L);

    static {
        float f7 = 48;
        f76076b = Dp.m3880constructorimpl(f7);
        float f8 = 12;
        f76078d = Dp.m3880constructorimpl(f8);
        f76081g = Dp.m3880constructorimpl(f8);
        f76082i = Dp.m3880constructorimpl(f7);
        float f9 = 56;
        f76083j = Dp.m3880constructorimpl(f9);
        f76084k = Dp.m3880constructorimpl(f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r12, androidx.compose.runtime.Composer r13, final com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 r14, final com.bilibili.app.authorspace.ui.D0 r15, final com.bilibili.pegasus.data.config.GraduationSeasonConfig r16, final boolean r17) {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.O.a(int, androidx.compose.runtime.Composer, com.bilibili.ad.adview.pegasus.holders.inline.card134.g0, com.bilibili.app.authorspace.ui.D0, com.bilibili.pegasus.data.config.GraduationSeasonConfig, boolean):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final GraduationSeasonGuideConfig graduationSeasonGuideConfig, final boolean z6, final String str, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-402910768);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(graduationSeasonGuideConfig) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-402910768, i11, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonGuideContent (GraduationSeasonGuideView.kt:235)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            d(graduationSeasonGuideConfig, z6, SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getCenterStart()), f76081g, 0.0f, 0.0f, 0.0f, 14, null), f76080f), composerStartRestartGroup, i11 & SearchBangumiItem.TYPE_FULLNET_MOVIE);
            long sp = TextUnitKt.getSp(14);
            long sp2 = TextUnitKt.getSp(20);
            TextKt.m1772Text4IGK_g(str, SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getCenterStart()), f76083j, 0.0f, f76084k, 0.0f, 10, null), 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText1-0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 6) & 14) | 199680, 3126, 119760);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(graduationSeasonGuideConfig, z6, str, modifier, i7) { // from class: com.bilibili.pegasus.components.graduation.H

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GraduationSeasonGuideConfig f76043a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f76044b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f76045c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f76046d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f76047e;

                {
                    this.f76043a = graduationSeasonGuideConfig;
                    this.f76044b = z6;
                    this.f76045c = str;
                    this.f76046d = modifier;
                    this.f76047e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76047e | 1);
                    String str2 = this.f76045c;
                    Modifier modifier2 = this.f76046d;
                    O.b(this.f76043a, this.f76044b, str2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i7, @Nullable Composer composer, @NotNull final com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 g0Var, @NotNull final D0 d02, @Nullable final GraduationSeasonConfig graduationSeasonConfig, final boolean z6) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(148350959);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(graduationSeasonConfig) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(d02) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(g0Var) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148350959, i11, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonGuideEntry (GraduationSeasonGuideView.kt:72)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1831255129, true, new Function2(z6, graduationSeasonConfig, d02, g0Var) { // from class: com.bilibili.pegasus.components.graduation.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f76057a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final GraduationSeasonConfig f76058b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final D0 f76059c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 f76060d;

                {
                    this.f76057a = z6;
                    this.f76058b = graduationSeasonConfig;
                    this.f76059c = d02;
                    this.f76060d = g0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
                    /*
                        Method dump skipped, instruction units count: 443
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.K.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, g0Var, d02, graduationSeasonConfig, z6) { // from class: com.bilibili.pegasus.components.graduation.L

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f76061a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final GraduationSeasonConfig f76062b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final D0 f76063c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 f76064d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f76065e;

                {
                    this.f76061a = z6;
                    this.f76062b = graduationSeasonConfig;
                    this.f76063c = d02;
                    this.f76064d = g0Var;
                    this.f76065e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76065e | 1);
                    D0 d03 = this.f76063c;
                    O.c(iUpdateChangedFlags, (Composer) obj, this.f76064d, d03, this.f76062b, this.f76061a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(final GraduationSeasonGuideConfig graduationSeasonGuideConfig, final boolean z6, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-802223150);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(graduationSeasonGuideConfig) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-802223150, i10, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonGuideLeftIcon (GraduationSeasonGuideView.kt:273)");
            }
            if (!z6) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(graduationSeasonGuideConfig, z6, modifier, i7) { // from class: com.bilibili.pegasus.components.graduation.I

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final GraduationSeasonGuideConfig f76048a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final boolean f76049b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Modifier f76050c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f76051d;

                        {
                            this.f76048a = graduationSeasonGuideConfig;
                            this.f76049b = z6;
                            this.f76050c = modifier;
                            this.f76051d = i7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76051d | 1);
                            boolean z7 = this.f76049b;
                            Modifier modifier2 = this.f76050c;
                            O.d(this.f76048a, z7, modifier2, (Composer) obj, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            boolean zIsNightTheme = MultipleThemeUtils.isNightTheme((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            String str = null;
            if (graduationSeasonGuideConfig != null) {
                String iconNight = zIsNightTheme ? graduationSeasonGuideConfig.getIconNight() : graduationSeasonGuideConfig.getIconLight();
                str = null;
                if (iconNight != null) {
                    str = null;
                    if (!StringsKt.isBlank(iconNight)) {
                        str = iconNight;
                    }
                }
            }
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1831533910);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                ImageRequest imageRequestA = Fa.A.a(composerStartRestartGroup, -1831533909, str);
                imageRequestA.contentScale(ContentScale.Companion.getFillBounds());
                imageRequestA.autoPlay(true);
                BiliImageKt.BiliImage(imageRequestA.build(), modifier, (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, ((i10 >> 3) & 112) | 384, 1016);
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
            scopeUpdateScopeEndRestartGroup2.updateScope(new J(graduationSeasonGuideConfig, z6, modifier, i7));
        }
    }
}
