package com.bilibili.pegasus.recommendlabel;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.G1;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.pegasus.recommendlabel.data.Label;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/x.class */
public final class C5754x {

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.x$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/x$a.class */
    public static final class a implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f78789a;

        public a(List list) {
            this.f78789a = list;
        }

        public final Object invoke(Object obj) {
            this.f78789a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.x$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/x$b.class */
    public static final class b implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f78790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f78791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1 f78792c;

        public b(List list, f0 f0Var, Function1 function1) {
            this.f78790a = list;
            this.f78791b = f0Var;
            this.f78792c = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x02b5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 884
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5754x.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.x$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/x$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78793a;

        static {
            int[] iArr = new int[RecommendLabelPageStatus.values().length];
            try {
                iArr[RecommendLabelPageStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[RecommendLabelPageStatus.LoadedWithData.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[RecommendLabelPageStatus.Empty.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f78793a = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final C5738g c5738g, final f0 f0Var, final Function1<? super InterfaceC5739h, Unit> function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1956696641);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c5738g) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(f0Var) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1956696641, i10, -1, "com.bilibili.pegasus.recommendlabel.FavoriteSelectionItem (RecommendLabelEditPage.kt:342)");
            }
            String str = c5738g.f78714a;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(653679417);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(653679418);
                Modifier.Companion companion = Modifier.Companion;
                float f7 = 16;
                float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
                float f8 = 0;
                Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(companion, fM3880constructorimpl, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f8));
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                TextKt.m1772Text4IGK_g(str, modifierM1345paddingqDBjuR0, biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT16b(), composerStartRestartGroup, 48, 0, 65528);
                composerStartRestartGroup.endReplaceGroup();
            }
            float f9 = 10;
            FlowLayoutKt.FlowRow(PaddingKt.m1345paddingqDBjuR0(Modifier.Companion, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(18)), null, null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(510731942, true, new Function3(c5738g, f0Var, function1) { // from class: com.bilibili.pegasus.recommendlabel.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5738g f78770a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final f0 f78771b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f78772c;

                {
                    this.f78770a = c5738g;
                    this.f78771b = f0Var;
                    this.f78772c = function1;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(510731942, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.FavoriteSelectionItem.<anonymous> (RecommendLabelEditPage.kt:354)");
                        }
                        int i12 = 0;
                        for (Object obj4 : this.f78770a.f78716c) {
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            C5754x.b(this.f78771b, this.f78772c, (Label) obj4, composer2, 0);
                            i12++;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c5738g, f0Var, function1, i7) { // from class: com.bilibili.pegasus.recommendlabel.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5738g f78773a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final f0 f78774b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f78775c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f78776d;

                {
                    this.f78773a = c5738g;
                    this.f78774b = f0Var;
                    this.f78775c = function1;
                    this.f78776d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78776d | 1);
                    C5754x.a(this.f78773a, this.f78774b, this.f78775c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.bilibili.pegasus.recommendlabel.f0 r26, final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.recommendlabel.InterfaceC5739h, kotlin.Unit> r27, final com.bilibili.pegasus.recommendlabel.data.Label r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5754x.b(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function1, com.bilibili.pegasus.recommendlabel.data.Label, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.recommendlabel.InterfaceC5739h, kotlin.Unit> r26, final com.bilibili.pegasus.recommendlabel.data.Label r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5754x.c(kotlin.jvm.functions.Function1, com.bilibili.pegasus.recommendlabel.data.Label, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ef  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.bilibili.pegasus.recommendlabel.f0 r26, final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.recommendlabel.InterfaceC5739h, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5754x.d(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028f  */
    /* JADX WARN: Type inference failed for: r1v30, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.g0] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final com.bilibili.pegasus.recommendlabel.f0 r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.recommendlabel.InterfaceC5739h, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5754x.e(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(final f0 f0Var, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-188218897);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-188218897, i8, -1, "com.bilibili.pegasus.recommendlabel.TopArea (RecommendLabelEditPage.kt:202)");
            }
            final int i9 = 0;
            CompositionLocalKt.CompositionLocalProvider(G1.f37520a.provides(null), ComposableLambdaKt.rememberComposableLambda(-1154464081, true, new Function2(f0Var, i9) { // from class: com.bilibili.pegasus.recommendlabel.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f78755a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f78756b;

                {
                    this.f78755a = i9;
                    this.f78756b = f0Var;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f78755a) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1154464081, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.TopArea.<anonymous> (RecommendLabelEditPage.kt:206)");
                                }
                                BiliTheme biliTheme = BiliTheme.INSTANCE;
                                int i10 = BiliTheme.$stable;
                                long j7 = biliTheme.getThemeColors(composer2, i10).getPrimary-0d7_KjU();
                                long j8 = biliTheme.getThemeColors(composer2, i10).getTextTitle-0d7_KjU();
                                float f7 = androidx.compose.material.F.f37486a;
                                a0.a aVar = androidx.compose.ui.graphics.a0.f43510a;
                                final f0 f0Var2 = (f0) this.f78756b;
                                final int i11 = 0;
                                SurfaceKt.m1748SurfaceFjzlyU(null, aVar, j7, j8, null, f7, ComposableLambdaKt.rememberComposableLambda(2093890795, true, new Function2(f0Var2, i11) { // from class: com.bilibili.pegasus.recommendlabel.m

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final int f78759a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final Object f78760b;

                                    {
                                        this.f78759a = i11;
                                        this.f78760b = f0Var2;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:49:0x0249  */
                                    /* JADX WARN: Removed duplicated region for block: B:52:0x0294  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                                        /*
                                            Method dump skipped, instruction units count: 677
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5744m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                    }
                                }, composer2, 54), composer2, 1572912, 17);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(228819985, iIntValue2, -1, "tv.danmaku.bili.ui.garb.digital.lockcard.DLCCardLockService.renderCardLock.<anonymous> (DLCCardLockService.kt:78)");
                                }
                                final ComposableLambda composableLambda = (ComposableLambda) this.f78756b;
                                final int i12 = 1;
                                BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1149147081, true, new Function2(composableLambda, i12) { // from class: com.bilibili.pegasus.recommendlabel.m

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final int f78759a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final Object f78760b;

                                    {
                                        this.f78759a = i12;
                                        this.f78760b = composableLambda;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:49:0x0249  */
                                    /* JADX WARN: Removed duplicated region for block: B:52:0x0294  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                                        /*
                                            Method dump skipped, instruction units count: 677
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5744m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                    }
                                }, composer3, 54), composer3, 384, 3);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f0Var, i7) { // from class: com.bilibili.pegasus.recommendlabel.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f0 f78768a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f78769b;

                {
                    this.f78768a = f0Var;
                    this.f78769b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78769b | 1);
                    C5754x.f(this.f78768a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
