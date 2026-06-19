package com.bilibili.ship.theseus.ogv.intro.download.service;

import Cc.h;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadHintType;
import com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService;
import com.bilibili.ship.theseus.ogv.intro.download.ui.m0;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.PayStatus;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kntr.watch.later.watchlater.WatcherLaterScreenKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadService.class */
@StabilityInferred(parameters = 0)
public final class OgvDownloadService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f92379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f92382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f92384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92385g;

    @NotNull
    public final KingPositionService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f92386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final yW0.b f92387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DownloadVipNoticeDialogService f92388k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadService$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvDownloadService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvDownloadService ogvDownloadService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvDownloadService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            OgvDownloadService ogvDownloadService;
            OgvDownloadService ogvDownloadService2;
            OgvDownloadService ogvDownloadService3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ogvDownloadService = this.this$0;
                try {
                    this.L$0 = ogvDownloadService;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    ogvDownloadService2 = ogvDownloadService;
                    ogvDownloadService2.h.f100363M = null;
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OgvDownloadService ogvDownloadService4 = (OgvDownloadService) this.L$0;
                ogvDownloadService3 = ogvDownloadService4;
                try {
                    ResultKt.throwOnFailure(obj);
                    ogvDownloadService = ogvDownloadService4;
                } catch (Throwable th2) {
                    ogvDownloadService2 = ogvDownloadService3;
                    th = th2;
                    ogvDownloadService2.h.f100363M = null;
                    throw th;
                }
            }
            ogvDownloadService3 = ogvDownloadService;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f92389a;

        static {
            int[] iArr = new int[PayStatus.values().length];
            try {
                iArr[PayStatus.STATUS_ALL_FREE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PayStatus.STATUS_VIP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PayStatus.STATUS_VIP_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PayStatus.STATUS_NONE_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PayStatus.STATUS_VIP_FREE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[PayStatus.STATUS_PAY_PACK.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[PayStatus.STATUS_NONE_FREE.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            f92389a = iArr;
        }
    }

    @Inject
    public OgvDownloadService(@NotNull BiliAccountInfo biliAccountInfo, @NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService, @NotNull Gu0.a aVar, @NotNull BiliAccounts biliAccounts, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull KingPositionService kingPositionService, @NotNull g gVar, @NotNull yW0.b bVar, @NotNull DownloadVipNoticeDialogService downloadVipNoticeDialogService, @NotNull f fVar) {
        this.f92379a = biliAccountInfo;
        this.f92380b = coroutineScope;
        this.f92381c = ogvSeason;
        this.f92382d = pageReportService;
        this.f92383e = aVar;
        this.f92384f = biliAccounts;
        this.f92385g = ogvCurrentEpisodeRepository;
        this.h = kingPositionService;
        this.f92386i = gVar;
        this.f92387j = bVar;
        this.f92388k = downloadVipNoticeDialogService;
        fVar.f92409b.d(String.valueOf(ogvSeason.f94449a));
        kingPositionService.f100363M = new h(this, 4);
        boolean zB = b();
        kingPositionService.f100364N.setValue(new Triple(Boolean.valueOf(zB), Boolean.valueOf(!aVar.m()), Boolean.valueOf(zB && ogvSeason.f94455g.f())));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadService.a(com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean b() {
        OgvSeason ogvSeason = this.f92381c;
        boolean zA = false;
        if (!ogvSeason.f94455g.b()) {
            return false;
        }
        OgvSeason.UserStatus userStatus = ogvSeason.h;
        switch (a.f92389a[ogvSeason.f94452d.ordinal()]) {
            case 5:
                if (userStatus.c() || userStatus.a()) {
                }
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                zA = true;
                break;
            case 6:
            case 7:
                zA = userStatus.a();
                break;
        }
        return zA;
    }

    public final void c(@NotNull Context context) {
        if (!b() || this.f92383e.m()) {
            return;
        }
        boolean zIsLogin = this.f92384f.isLogin();
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f92385g;
        OgvSeason ogvSeason = this.f92381c;
        if (!zIsLogin) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("sid", String.valueOf(ogvSeason.f94449a));
            OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
            if (ogvEpisodeC != null) {
                mapCreateMapBuilder.put("oid", String.valueOf(ogvEpisodeC.f93555a));
            }
            String json = JsonUtilKt.toJson(MapsKt.build(mapCreateMapBuilder));
            Uri.Builder builderA = WW.b.a("activity://main/login/", "from_spmid", "pgc.pgc-video-detail.downloadbutton.0");
            if (json != null) {
                builderA.appendQueryParameter("extend", json);
            }
            Qj0.g.e(context, builderA.build());
            return;
        }
        if (!ogvSeason.f94455g.f() || this.f92379a.isEffectiveVip()) {
            BuildersKt.launch$default(this.f92380b, (CoroutineContext) null, (CoroutineStart) null, new OgvDownloadService$showDownloadFragment$2(this, null), 3, (Object) null);
            return;
        }
        final DownloadHintType downloadHintType = DownloadHintType.DOWNLOAD_VIP_CACHE;
        OgvEpisode ogvEpisodeC2 = ogvCurrentEpisodeRepository.c();
        long j7 = ogvEpisodeC2 != null ? ogvEpisodeC2.f93555a : 0L;
        StringBuilder sb = new StringBuilder();
        sb.append(ogvSeason.f94450b);
        sb.append("-");
        sb.append(ogvSeason.f94449a);
        final String strA = Ld.c.a(sb, j7, "-");
        final DownloadVipNoticeDialogService downloadVipNoticeDialogService = this.f92388k;
        downloadVipNoticeDialogService.getClass();
        ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Ux.a(downloadVipNoticeDialogService, 2));
        final DownloadVipNoticeDialogService.VipNoticeDialog vipNoticeDialog = new DownloadVipNoticeDialogService.VipNoticeDialog(downloadVipNoticeDialogService);
        final m0 m0Var = new m0(downloadVipNoticeDialogService.c(downloadHintType), downloadVipNoticeDialogService.f92455a.getString(2131854854), "https://i0.hdslb.com/bfs/activity-plat/static/20251211/3e589f9b66684a98619533747d9f4f0f/4hZ4T8itYG.png", new com.bilibili.gripper.d(vipNoticeDialog, 3), new Function0(downloadVipNoticeDialogService, downloadHintType, strA, vipNoticeDialog) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.l0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DownloadVipNoticeDialogService f92590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DownloadHintType f92591b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f92592c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final DownloadVipNoticeDialogService.VipNoticeDialog f92593d;

            {
                this.f92590a = downloadVipNoticeDialogService;
                this.f92591b = downloadHintType;
                this.f92592c = strA;
                this.f92593d = vipNoticeDialog;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke() throws NoWhenBranchMatchedException {
                DownloadVipNoticeDialogService downloadVipNoticeDialogService2 = this.f92590a;
                DownloadVipNoticeDialogService.g(downloadVipNoticeDialogService2, 0, 0, null, 14);
                downloadVipNoticeDialogService2.d(this.f92591b, this.f92592c);
                this.f92593d.dismiss();
                return Unit.INSTANCE;
            }
        }, exposureEntry);
        ComposeView composeView = new ComposeView(downloadVipNoticeDialogService.f92455a, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1492756783, true, new Function2(downloadVipNoticeDialogService, m0Var) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.g0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m0 f92562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DownloadVipNoticeDialogService f92563b;

            {
                this.f92562a = m0Var;
                this.f92563b = downloadVipNoticeDialogService;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1492756783, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.showDialog.<anonymous>.<anonymous> (DownloadVipNoticeDialogService.kt:206)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1176342553, true, new Function2(0, this.f92562a, this.f92563b) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.f0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f92555a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f92556b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Object f92557c;

                        {
                            this.f92555a = i;
                            this.f92556b = obj;
                            this.f92557c = obj;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            switch (this.f92555a) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1176342553, iIntValue2, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.showDialog.<anonymous>.<anonymous>.<anonymous> (DownloadVipNoticeDialogService.kt:207)");
                                        }
                                        final m0 m0Var2 = (m0) this.f92556b;
                                        Function0<Unit> function0 = m0Var2.f92599d;
                                        final DownloadVipNoticeDialogService downloadVipNoticeDialogService2 = (DownloadVipNoticeDialogService) this.f92557c;
                                        AndroidDialog_androidKt.Dialog(function0, null, ComposableLambdaKt.rememberComposableLambda(253753264, true, new Function2(downloadVipNoticeDialogService2, m0Var2) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.j0

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DownloadVipNoticeDialogService f92577a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final m0 f92578b;

                                            {
                                                this.f92577a = downloadVipNoticeDialogService2;
                                                this.f92578b = m0Var2;
                                            }

                                            public final Object invoke(Object obj5, Object obj6) {
                                                Composer composer3 = (Composer) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(253753264, iIntValue3, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.showDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DownloadVipNoticeDialogService.kt:210)");
                                                    }
                                                    this.f92577a.b(this.f92578b, SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(280)), composer3, ExposureEntry.$stable | 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer2, 54), composer2, 384, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1757989750, iIntValue3, -1, "kntr.watch.later.watchlater.__c80f657edb57b417f729d947c982e0eb.<anonymous> (__c80f657edb57b417f729d947c982e0eb.kt:18)");
                                        }
                                        WatcherLaterScreenKt.b((String) ((Ref.ObjectRef) this.f92556b).element, (String) ((Ref.ObjectRef) this.f92557c).element, composer3, 0);
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
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        vipNoticeDialog.setContentView(composeView);
        vipNoticeDialog.show();
    }
}
