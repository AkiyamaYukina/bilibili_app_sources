package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.net.Uri;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$showVipNoticeDialog$1.class */
public final class DownloadFloatLayerService$showVipNoticeDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvSeason.CacheAuthConfig.CacheDialog $dialog;
    final long $epId;
    final DownloadHintType $hintType;
    final Function0<Unit> $onVipClickReport;
    final ExposureEntry $vipNoticeDialogExposureEntry;
    final String $vipSubId;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$showVipNoticeDialog$1(OgvSeason.CacheAuthConfig.CacheDialog cacheDialog, DownloadFloatLayerService downloadFloatLayerService, DownloadHintType downloadHintType, ExposureEntry exposureEntry, Function0<Unit> function0, String str, long j7, Continuation<? super DownloadFloatLayerService$showVipNoticeDialog$1> continuation) {
        super(2, continuation);
        this.$dialog = cacheDialog;
        this.this$0 = downloadFloatLayerService;
        this.$hintType = downloadHintType;
        this.$vipNoticeDialogExposureEntry = exposureEntry;
        this.$onVipClickReport = function0;
        this.$vipSubId = str;
        this.$epId = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit invokeSuspend$lambda$0(Function0 function0, DownloadFloatLayerService downloadFloatLayerService, DownloadHintType downloadHintType, String str) throws NoWhenBranchMatchedException {
        function0.invoke();
        downloadFloatLayerService.h.d(downloadHintType, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Function0 function0, DownloadFloatLayerService downloadFloatLayerService, OgvSeason.CacheAuthConfig.CacheDialog cacheDialog, long j7, DownloadHintType downloadHintType) {
        function0.invoke();
        MutableSharedFlow<Unit> mutableSharedFlow = downloadFloatLayerService.f92443q;
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        Uri uri = Uri.parse(cacheDialog.f94474c);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (!queryParameterNames.contains("season_id")) {
            builderBuildUpon.appendQueryParameter("season_id", String.valueOf(downloadFloatLayerService.f92431d.f94449a));
        }
        if (!queryParameterNames.contains("ep_id")) {
            builderBuildUpon.appendQueryParameter("ep_id", String.valueOf(j7));
        }
        downloadFloatLayerService.f92440n.a(new com.bilibili.ship.theseus.united.page.restrictionlayer.P(builderBuildUpon.build().toString(), 4, "united.player-video-detail.caching.vip.click", null, true, downloadHintType == DownloadHintType.DOWNLOAD_VIDEO_HINT ? "ogv" : "order"));
        return unit;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$showVipNoticeDialog$1(this.$dialog, this.this$0, this.$hintType, this.$vipNoticeDialogExposureEntry, this.$onVipClickReport, this.$vipSubId, this.$epId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final OgvSeason.CacheAuthConfig.CacheDialog cacheDialog = this.$dialog;
            if (cacheDialog == null) {
                DownloadVipNoticeDialogService downloadVipNoticeDialogService = this.this$0.h;
                String strC = downloadVipNoticeDialogService.c(this.$hintType);
                String string = this.this$0.f92432e.getString(2131854854);
                ExposureEntry exposureEntry = this.$vipNoticeDialogExposureEntry;
                final Function0<Unit> function0 = this.$onVipClickReport;
                final DownloadFloatLayerService downloadFloatLayerService = this.this$0;
                final DownloadHintType downloadHintType = this.$hintType;
                final String str = this.$vipSubId;
                Function0<Unit> function02 = new Function0(function0, downloadFloatLayerService, downloadHintType, str) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function0 f92646a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final DownloadFloatLayerService f92647b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final DownloadHintType f92648c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f92649d;

                    {
                        this.f92646a = function0;
                        this.f92647b = downloadFloatLayerService;
                        this.f92648c = downloadHintType;
                        this.f92649d = str;
                    }

                    public final Object invoke() {
                        return DownloadFloatLayerService$showVipNoticeDialog$1.invokeSuspend$lambda$0(this.f92646a, this.f92647b, this.f92648c, this.f92649d);
                    }
                };
                this.label = 1;
                if (downloadVipNoticeDialogService.e(strC, string, "https://i0.hdslb.com/bfs/activity-plat/static/20251211/3e589f9b66684a98619533747d9f4f0f/4hZ4T8itYG.png", exposureEntry, function02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                final DownloadFloatLayerService downloadFloatLayerService2 = this.this$0;
                DownloadVipNoticeDialogService downloadVipNoticeDialogService2 = downloadFloatLayerService2.h;
                ExposureEntry exposureEntry2 = this.$vipNoticeDialogExposureEntry;
                final Function0<Unit> function03 = this.$onVipClickReport;
                final long j7 = this.$epId;
                final DownloadHintType downloadHintType2 = this.$hintType;
                Function0<Unit> function04 = new Function0(function03, downloadFloatLayerService2, cacheDialog, j7, downloadHintType2) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function0 f92650a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final DownloadFloatLayerService f92651b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvSeason.CacheAuthConfig.CacheDialog f92652c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final long f92653d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final DownloadHintType f92654e;

                    {
                        this.f92650a = function03;
                        this.f92651b = downloadFloatLayerService2;
                        this.f92652c = cacheDialog;
                        this.f92653d = j7;
                        this.f92654e = downloadHintType2;
                    }

                    public final Object invoke() {
                        return DownloadFloatLayerService$showVipNoticeDialog$1.invokeSuspend$lambda$1(this.f92650a, this.f92651b, this.f92652c, this.f92653d, this.f92654e);
                    }
                };
                this.label = 2;
                if (downloadVipNoticeDialogService2.e(cacheDialog.f94472a, cacheDialog.f94473b, cacheDialog.f94475d, exposureEntry2, function04, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
