package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.media.resource.Badge;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import dagger.assisted.AssistedInject;
import dagger.internal.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/y.class */
@StabilityInferred(parameters = 0)
public final class C6450y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f103967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusQualityResources f103968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f103971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f103972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final y0 f103973g;

    @NotNull
    public final AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Provider f103974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Provider f103975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f103976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final T f103977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageReportService f103978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f103979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f103980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final E f103981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f103982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SharedPreferences f103983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f103984s;

    @AssistedInject
    public C6450y(@NotNull Context context, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull TheseusQualityResources theseusQualityResources, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IReporterService iReporterService, @NotNull BiliAccounts biliAccounts, @NotNull y0 y0Var, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull Provider provider, @NotNull Provider provider2, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull T t7, @NotNull PageReportService pageReportService, @NotNull F f7, @NotNull Function0 function0) {
        this.f103967a = theseusPlayerQualityService;
        this.f103968b = theseusQualityResources;
        this.f103969c = hVar;
        this.f103970d = iPlayerCoreService;
        this.f103971e = iReporterService;
        this.f103972f = biliAccounts;
        this.f103973g = y0Var;
        this.h = absFunctionWidgetService;
        this.f103974i = provider;
        this.f103975j = provider2;
        this.f103976k = episodeExtraInfoRepository;
        this.f103977l = t7;
        this.f103978m = pageReportService;
        this.f103979n = function0;
        com.bilibili.app.authorspace.header.D d7 = new com.bilibili.app.authorspace.header.D(this, 4);
        com.bilibili.bplus.followinglist.opus.manager.y yVar = com.bilibili.ship.theseus.united.report.a.f104837a;
        this.f103980o = new ExposureEntry(yVar, d7);
        this.f103981p = f7.a(function0);
        this.f103982q = LazyKt.lazy(new com.bilibili.lib.fasthybrid.game.scenarios.game.about.e(context, 1));
        this.f103983r = BiliGlobalPreferenceHelper.getBLKVSharedPreference(context);
        this.f103984s = new ExposureEntry(yVar, new com.bilibili.app.authorspace.header.a0(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.compose.ui.Modifier g(int r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, @org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.g(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, boolean):androidx.compose.ui.Modifier");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02a6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final boolean r12, @org.jetbrains.annotations.Nullable final com.bilibili.player.tangram.basic.a r13, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.a(boolean, com.bilibili.player.tangram.basic.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:159:0x073e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, int r36) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0234  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.NotNull final com.bapis.bilibili.playershared.QnGroup r17, @org.jetbrains.annotations.Nullable final com.bilibili.player.tangram.basic.a r18, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.c(com.bapis.bilibili.playershared.QnGroup, com.bilibili.player.tangram.basic.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0282  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.NotNull final com.bapis.bilibili.playershared.StreamInfo r16, final boolean r17, @org.jetbrains.annotations.Nullable final com.bilibili.player.tangram.basic.a r18, final boolean r19, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.Nullable final com.bilibili.lib.media.resource.Badge r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.d(com.bapis.bilibili.playershared.StreamInfo, boolean, com.bilibili.player.tangram.basic.a, boolean, androidx.compose.ui.Modifier, com.bilibili.lib.media.resource.Badge, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.Map<java.lang.String, java.lang.String> r5, com.bilibili.player.tangram.basic.c r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.e(java.util.Map, com.bilibili.player.tangram.basic.c):void");
    }

    public final ComposableLambda f(boolean z6, boolean z7, boolean z8, boolean z9, final boolean z10, final Badge badge) {
        ComposableLambda composableLambdaComposableLambdaInstance;
        if (badge == null || badge.i().length() == 0 || (z7 && z9)) {
            BiliAccounts biliAccounts = this.f103972f;
            composableLambdaComposableLambdaInstance = (z6 && biliAccounts.isLogin()) ? C6432f.f103865a : z7 ? z9 ? ComposableLambdaKt.composableLambdaInstance(-134611806, true, new Function3(z10) { // from class: com.bilibili.ship.theseus.united.page.videoquality.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f103935a;

                {
                    this.f103935a = z10;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    int i8;
                    Modifier modifier = (Modifier) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i9 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i9 = iIntValue | (composer.changed(modifier) ? 4 : 2);
                    }
                    if (composer.shouldExecute((i9 & 19) != 18, i9 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-134611806, i9, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualityListPanel.badge.<anonymous> (QualityListPanel.kt:390)");
                        }
                        if (this.f103935a) {
                            i7 = 1279187459;
                            i8 = 2131858111;
                        } else {
                            i7 = 1279317411;
                            i8 = 2131858112;
                        }
                        com.bilibili.playerbizcommonv2.widget.quality.h0.e(PL0.c.a(composer, i7, i8, composer, 0), modifier, null, null, composer, (i9 << 3) & 112, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }) : C6432f.f103866b : (biliAccounts.isLogin() || !z8) ? null : C6432f.f103867c;
        } else {
            composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1574346779, true, new Function3(badge) { // from class: com.bilibili.ship.theseus.united.page.videoquality.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Badge f103931a;

                {
                    this.f103931a = badge;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier modifier = (Modifier) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i7 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i7 = iIntValue | (composer.changed(modifier) ? 4 : 2);
                    }
                    boolean z11 = false;
                    if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1574346779, i7, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualityListPanel.badge.<anonymous> (QualityListPanel.kt:373)");
                        }
                        if (BiliTheme.INSTANCE.getDayNightTheme(composer, BiliTheme.$stable) == ThemeDayNight.Day) {
                            z11 = true;
                        }
                        Badge badge2 = this.f103931a;
                        Integer numN = com.bilibili.playerbizcommonv2.utils.p.n(z11 ? badge2.j() : badge2.m());
                        Color colorA = numN != null ? xu0.c.a(numN) : null;
                        Integer numN2 = com.bilibili.playerbizcommonv2.utils.p.n(z11 ? badge2.a() : badge2.b());
                        Color colorA2 = numN2 != null ? xu0.c.a(numN2) : null;
                        Integer numN3 = com.bilibili.playerbizcommonv2.utils.p.n(z11 ? badge2.d() : badge2.h());
                        Color colorA3 = numN3 != null ? xu0.c.a(numN3) : null;
                        if (badge2.c() == 1) {
                            composer.startReplaceGroup(-321511072);
                            com.bilibili.playerbizcommonv2.widget.quality.h0.d(badge2.i(), modifier, colorA2, colorA, composer, (i7 << 3) & 112, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-321412709);
                            com.bilibili.playerbizcommonv2.widget.quality.h0.e(badge2.i(), modifier, colorA3, colorA, composer, (i7 << 3) & 112, 0);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        return composableLambdaComposableLambdaInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bapis.bilibili.playershared.QnPanel h() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository r0 = r0.f103976k
            com.bilibili.lib.media.resource.ExtraInfo r0 = r0.a()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1d
            tb0.h r0 = com.bilibili.ship.theseus.united.page.videoquality.A.f103685a
            r1 = r4
            java.lang.Object r0 = r0.a(r1)
            com.bapis.bilibili.playershared.QnPanel r0 = (com.bapis.bilibili.playershared.QnPanel) r0
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L21
        L1d:
            com.bapis.bilibili.playershared.QnPanel r0 = com.bapis.bilibili.playershared.QnPanel.getDefaultInstance()
            r4 = r0
        L21:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.h():com.bapis.bilibili.playershared.QnPanel");
    }

    public final MutableState<Boolean> i() {
        ExtraInfo extraInfoA = this.f103976k.a();
        ExtraInfo extraInfo = extraInfoA;
        if (extraInfoA == null) {
            extraInfo = new ExtraInfo();
        }
        tb0.h hVar = A.f103688d;
        MutableState<Boolean> mutableState = (MutableState) hVar.a(extraInfo);
        if (mutableState != null) {
            return mutableState;
        }
        boolean z6 = true;
        if (((Boolean) A.f103687c.a(extraInfo)).booleanValue()) {
            z6 = this.f103983r.getBoolean("quality_group_expanded", true);
        }
        MutableState<Boolean> mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
        hVar.b(extraInfo, mutableStateMutableStateOf$default);
        return mutableStateMutableStateOf$default;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.bapis.bilibili.playershared.StreamInfo r6, com.bilibili.player.tangram.basic.a r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            com.bilibili.player.tangram.basic.c$b r0 = new com.bilibili.player.tangram.basic.c$b
            r1 = r0
            r2 = r6
            int r2 = com.bilibili.playerbizcommonv2.widget.quality.h0.k(r2)
            r1.<init>(r2)
            r10 = r0
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r9 = r0
            r0 = r5
            r1 = r9
            r2 = r10
            r0.e(r1, r2)
            r0 = r9
            r1 = r6
            java.util.Map r1 = r1.getReportParamsMap()
            r0.putAll(r1)
            r0 = r9
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)
            r11 = r0
            r0 = r5
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f103969c
            com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl r0 = r0.f91109c
            com.bilibili.player.tangram.basic.c r0 = r0.g()
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.c.a
            r8 = r0
            java.lang.String r0 = "0"
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L51
            java.lang.String r0 = "0"
            r6 = r0
            goto L55
        L51:
            java.lang.String r0 = "1"
            r6 = r0
        L55:
            r0 = r11
            java.lang.String r1 = "from_is_auto"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            r6 = r0
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.c.b
            if (r0 == 0) goto L8a
            r0 = r7
            if (r0 == 0) goto L7e
            r0 = r7
            int r0 = r0.f79320a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L8a
        L7e:
            r0 = r12
            com.bilibili.player.tangram.basic.c$b r0 = (com.bilibili.player.tangram.basic.c.b) r0
            int r0 = r0.f79322a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6 = r0
        L8a:
            r0 = r11
            java.lang.String r1 = "from_qn"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f103978m
            java.lang.String r1 = "player.player.clarity-type.0.player"
            r2 = r11
            r3 = 4
            com.bilibili.ship.theseus.united.page.report.PageReportService.g(r0, r1, r2, r3)
            r0 = r5
            com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r0 = r0.f103967a
            r1 = r10
            r0.e(r1)
            r0 = r5
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.f103979n
            java.lang.Object r0 = r0.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.C6450y.j(com.bapis.bilibili.playershared.StreamInfo, com.bilibili.player.tangram.basic.a):void");
    }
}
