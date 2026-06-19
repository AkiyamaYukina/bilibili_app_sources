package com.bilibili.ship.theseus.playlist.di.cache.screenrecord;

import android.app.Activity;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import defpackage.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/screenrecord/PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2.class */
final class PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2 extends SuspendLambda implements Function2<PlaylistRepository.e, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlaylistDummyScreenRecordSuppressionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2(PlaylistDummyScreenRecordSuppressionService playlistDummyScreenRecordSuppressionService, Continuation<? super PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2> continuation) {
        super(2, continuation);
        this.this$0 = playlistDummyScreenRecordSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2 playlistDummyScreenRecordSuppressionService$collectScreenRecordState$2 = new PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2(this.this$0, continuation);
        playlistDummyScreenRecordSuppressionService$collectScreenRecordState$2.L$0 = obj;
        return playlistDummyScreenRecordSuppressionService$collectScreenRecordState$2;
    }

    public final Object invoke(PlaylistRepository.e eVar, Continuation<? super Unit> continuation) {
        return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MultiTypeMedia multiTypeMedia = ((PlaylistRepository.e) this.L$0).f95137a;
        int i7 = multiTypeMedia.f95248v;
        if (i7 == 2 || i7 == 21) {
            StringBuilder sbA = z.a(multiTypeMedia.d(), "avid: ", " enable: ");
            boolean z6 = multiTypeMedia.f95220H;
            sbA.append(z6);
            a.b("[theseus-playlist-PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2-invokeSuspend] ", sbA.toString(), "PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2-invokeSuspend");
            if (!CoroutineScopeKt.isActive(this.this$0.f95406a)) {
                return Unit.INSTANCE;
            }
            Activity activity = this.this$0.f95407b;
            if (z6) {
                activity.getWindow().addFlags(8192);
            } else {
                activity.getWindow().clearFlags(8192);
            }
        }
        return Unit.INSTANCE;
    }
}
