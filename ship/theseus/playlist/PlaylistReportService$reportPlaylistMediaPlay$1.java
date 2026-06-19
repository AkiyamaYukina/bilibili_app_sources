package com.bilibili.ship.theseus.playlist;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.playlist.PlaylistReportService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistReportService$reportPlaylistMediaPlay$1.class */
public final class PlaylistReportService$reportPlaylistMediaPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $cid;
    int label;
    final PlaylistReportService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistReportService$reportPlaylistMediaPlay$1(PlaylistReportService playlistReportService, long j7, Continuation<? super PlaylistReportService$reportPlaylistMediaPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistReportService;
        this.$cid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistReportService$reportPlaylistMediaPlay$1(this.this$0, this.$cid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String strA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlaylistReportService playlistReportService = this.this$0;
            PlaylistReportService.a aVar = playlistReportService.f95076f;
            PlaylistRepository playlistRepository = playlistReportService.f95074d;
            long j7 = playlistRepository.f95085H;
            long j8 = this.$cid;
            int i8 = playlistRepository.c().f95137a.f95248v;
            this.label = 1;
            Object objReportPlay = aVar.reportPlay(j7, 11, 2, j8, i8, this);
            obj = objReportPlay;
            if (objReportPlay == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            strA = "Playlist play Report Failed, error: " + new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                BLog.i("PlaylistReportService$reportPlaylistMediaPlay$1-invokeSuspend", "[theseus-playlist-PlaylistReportService$reportPlaylistMediaPlay$1-invokeSuspend] Playlist play Report Success");
                return Unit.INSTANCE;
            }
            strA = N4.a.a("Playlist play Report Failed, error: ", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        }
        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-playlist-PlaylistReportService$reportPlaylistMediaPlay$1-invokeSuspend] ", strA, "PlaylistReportService$reportPlaylistMediaPlay$1-invokeSuspend", (Throwable) null);
        return Unit.INSTANCE;
    }
}
