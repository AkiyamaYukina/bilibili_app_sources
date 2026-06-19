package com.bilibili.ogv.kmm.operation.vippreview;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.contextmenu.internal.J;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I;
import com.bilibili.app.comm.aphro.mediaselect.compose.x0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/v.class */
public final class v {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/v$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f68980a;

        static {
            int[] iArr = new int[VipOfflinePreviewActiveCard.Type.values().length];
            try {
                iArr[VipOfflinePreviewActiveCard.Type.RESERVATION.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VipOfflinePreviewActiveCard.Type.REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VipOfflinePreviewActiveCard.Type.RECALL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f68980a = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable Modifier modifier, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-637576327);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-637576327, i8, -1, "com.bilibili.ogv.kmm.operation.vippreview.RecallContent (VipOfflinePreviewUi.kt:233)");
            }
            float fM3880constructorimpl = Dp.m3880constructorimpl((float) 0.5d);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw("活动回顾", PaddingKt.m1343paddingVpY3zN4(I.a(15, modifier, fM3880constructorimpl, biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink-0d7_KjU()), Dp.m3880constructorimpl(21), Dp.m3880constructorimpl((float) 5.5d)), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12b(), biliTheme.getColors(composerStartRestartGroup, i9).getBrand_pink-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 6, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l(modifier, i7, 0));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, final boolean z6) {
        int i8;
        long jA;
        long jA2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1325920173);
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
                ComposerKt.traceEventStart(1325920173, i9, -1, "com.bilibili.ogv.kmm.operation.vippreview.RegistrationContent (VipOfflinePreviewUi.kt:217)");
            }
            String str = z6 ? "立即报名" : "已报名";
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1395993673);
                jA = x0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1395992622);
                jA = aj.c.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1395990249);
                jA2 = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1395989189);
                jA2 = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_bg_thick-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            BasicTextKt.m1512BasicTextRWo7tUw(str, PaddingKt.m1343paddingVpY3zN4(BackgroundKt.m1169backgroundbw27NRU$default(J.a(modifier, 15), jA2, null, 2, null), Dp.m3880constructorimpl(21), Dp.m3880constructorimpl(5)), TextStyle.m3586copyp1EtxEg$default(BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12b(), jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, z6) { // from class: com.bilibili.ogv.kmm.operation.vippreview.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f68961a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68962b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68963c;

                {
                    this.f68961a = z6;
                    this.f68962b = modifier;
                    this.f68963c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.b(RecomposeScopeImplKt.updateChangedFlags(this.f68963c | 1), (Composer) obj, this.f68962b, this.f68961a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, final boolean z6) {
        int i8;
        long jA;
        long jA2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1882203606);
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
                ComposerKt.traceEventStart(1882203606, i9, -1, "com.bilibili.ogv.kmm.operation.vippreview.ReservationContent (VipOfflinePreviewUi.kt:198)");
            }
            String str = z6 ? "立即预约" : "已预约";
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(616440704);
                jA = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(616441755);
                jA = aj.c.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(616444133);
                jA2 = Zi.p.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(616445348);
                jA2 = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_bg_thick-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            BasicTextKt.m1512BasicTextRWo7tUw(str, PaddingKt.m1343paddingVpY3zN4(BackgroundKt.m1169backgroundbw27NRU$default(J.a(modifier, 15), jA2, null, 2, null), Dp.m3880constructorimpl(21), Dp.m3880constructorimpl(5)), TextStyle.m3586copyp1EtxEg$default(BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12b(), jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, z6) { // from class: com.bilibili.ogv.kmm.operation.vippreview.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f68958a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68959b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68960c;

                {
                    this.f68958a = z6;
                    this.f68959b = modifier;
                    this.f68960c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.c(RecomposeScopeImplKt.updateChangedFlags(this.f68960c | 1), (Composer) obj, this.f68959b, this.f68958a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03dd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard.c r33, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.reservation.a r34, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 3009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.vippreview.v.d(com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard$c, com.bilibili.ogv.kmm.operation.reservation.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0428  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard r33, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2 r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.vippreview.v.e(com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }
}
