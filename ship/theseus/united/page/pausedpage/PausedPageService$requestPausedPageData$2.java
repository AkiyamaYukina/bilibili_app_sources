package com.bilibili.ship.theseus.united.page.pausedpage;

import android.os.SystemClock;
import com.bapis.bilibili.app.viewunite.v1.KTabType;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.IVDPausedPage;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.tab.u;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.app.ad.base.protocol.biz.vd.pausedpage.IAdPausedPageData;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$requestPausedPageData$2.class */
final class PausedPageService$requestPausedPageData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IAdPausedPageData>, Object> {
    final Job $currentJob;
    final long $episodeAvid;
    final long $episodeCid;
    final PausedPageService.PauseTriggerSource $source;
    private Object L$0;
    Object L$1;
    int label;
    final PausedPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$requestPausedPageData$2(PausedPageService pausedPageService, long j7, long j8, Job job, PausedPageService.PauseTriggerSource pauseTriggerSource, Continuation<? super PausedPageService$requestPausedPageData$2> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
        this.$episodeAvid = j7;
        this.$episodeCid = j8;
        this.$currentJob = job;
        this.$source = pauseTriggerSource;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausedPageService$requestPausedPageData$2 pausedPageService$requestPausedPageData$2 = new PausedPageService$requestPausedPageData$2(this.this$0, this.$episodeAvid, this.$episodeCid, this.$currentJob, this.$source, continuation);
        pausedPageService$requestPausedPageData$2.L$0 = obj;
        return pausedPageService$requestPausedPageData$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IAdPausedPageData> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Job job;
        Object objA;
        KTabType kTabType;
        IVDPausedPage pausedPage;
        String str;
        int i7;
        List listA;
        int i8;
        String str2;
        String str3;
        Object objRequestPausedPage;
        PausedPageService pausedPageService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService2 = this.this$0;
                long j7 = this.$episodeAvid;
                long j8 = this.$episodeCid;
                job = this.$currentJob;
                Result.Companion companion = Result.Companion;
                u uVar = pausedPageService2.f102160o;
                PageAdRepository pageAdRepository = pausedPageService2.f102154i;
                int iIntValue = ((Number) uVar.f103214d.getValue()).intValue();
                try {
                    long jCoerceAtLeast = RangesKt.coerceAtLeast(((long) pausedPageService2.f102152f.getCurrentPosition()) / 1000, 0L);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Long l7 = pausedPageService2.f102143I;
                    long jCoerceAtLeast2 = RangesKt.coerceAtLeast((l7 == null ? RangesKt.coerceAtLeast(pausedPageService2.f102144J, 0L) : RangesKt.coerceAtLeast(jElapsedRealtime - l7.longValue(), 0L)) / 1000, 0L);
                    Pair pairN = PausedPageService.n(pausedPageService2);
                    int iIntValue2 = ((Number) pairN.component1()).intValue();
                    int iIntValue3 = ((Number) pairN.component2()).intValue();
                    try {
                        BLog.i("PausedPageService", "requestPausedPage extras stopTs=" + jCoerceAtLeast + " playTs=" + jCoerceAtLeast2 + " nonPlayerAreaWidth=" + iIntValue2 + " nonPlayerAreaHeight=" + iIntValue3);
                        try {
                            objA = Result.constructor-impl(KTabType.Companion.a(iIntValue));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objA = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        if (Result.exceptionOrNull-impl(objA) != null) {
                            BLog.w("PausedPageService", "invalid tab index=" + iIntValue + ", fallback to 0");
                            objA = KTabType.Companion.a(0);
                        }
                        kTabType = (KTabType) objA;
                        pausedPage = GAdBizKt.getGAdVideoDetail().getPausedPage();
                        str = pageAdRepository.f98944g;
                        PlayingAreaDescription playingAreaDescription = (PlayingAreaDescription) pausedPageService2.f102156k.f123389b.getValue();
                        i7 = playingAreaDescription == null ? 0 : playingAreaDescription.a() ? 1 : 2;
                        listA = PausedPageService.a(pausedPageService2);
                        i8 = (pausedPageService2.f102139E || pausedPageService2.f102140F) ? 1 : 0;
                        str2 = pageAdRepository.f98946j;
                        str3 = pausedPageService2.f102163r;
                        this.L$0 = pausedPageService2;
                        this.L$1 = job;
                        this.label = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    try {
                        objRequestPausedPage = pausedPage.requestPausedPage(j7, j8, kTabType, str, i7, jCoerceAtLeast, jCoerceAtLeast2, iIntValue2, iIntValue3, listA, i8, str2, str3, this);
                        if (objRequestPausedPage == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pausedPageService = pausedPageService2;
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion32 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (Job) this.L$1;
                PausedPageService pausedPageService3 = (PausedPageService) this.L$0;
                ResultKt.throwOnFailure(obj);
                objRequestPausedPage = obj;
                pausedPageService = pausedPageService3;
            }
            IAdPausedPageData iAdPausedPageData = (IAdPausedPageData) objRequestPausedPage;
            if (pausedPageService.u(job)) {
                pausedPageService.f102136B = new PausedPageService.b(true, iAdPausedPageData != null, iAdPausedPageData != null ? iAdPausedPageData.getAd() : null);
            }
            obj2 = Result.constructor-impl(iAdPausedPageData);
        } catch (Throwable th5) {
            th = th5;
        }
        PausedPageService.PauseTriggerSource pauseTriggerSource = this.$source;
        Throwable th6 = Result.exceptionOrNull-impl(obj2);
        if (th6 != null) {
            if (th6 instanceof CancellationException) {
                throw th6;
            }
            BLog.w("PausedPageService", "requestPausedPage failed source=" + pauseTriggerSource.getValue() + " e=" + th6);
            obj2 = null;
        }
        return obj2;
    }
}
