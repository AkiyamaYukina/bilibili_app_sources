package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.api.BiliApiException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$clearOfflineMedias$1.class */
public final class PlaylistViewModelV2$clearOfflineMedias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final PlaylistViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModelV2$clearOfflineMedias$1(PlaylistViewModelV2 playlistViewModelV2, long j7, Continuation<? super PlaylistViewModelV2$clearOfflineMedias$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistViewModelV2;
        this.$playlistId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistViewModelV2$clearOfflineMedias$1(this.this$0, this.$playlistId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            this.this$0.K0(this.$playlistId);
            Duration.Companion companion = Duration.Companion;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            long duration = DurationKt.toDuration(1, durationUnit);
            long duration2 = DurationKt.toDuration(2, durationUnit);
            long duration3 = DurationKt.toDuration(5, durationUnit);
            long j7 = this.$playlistId;
            PlaylistViewModelV2 playlistViewModelV2 = this.this$0;
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$clearOfflineMedias$1$invokeSuspend$$inlined$queryUntilSuccess_hTMF5Xc$default$1(duration3, duration, duration2, 2, null, playlistViewModelV2, playlistViewModelV2, j7, playlistViewModelV2), 3, (Object) null);
        } catch (Exception e7) {
            if (e7 instanceof BiliApiException) {
                this.this$0.f85552n.setValue(e7.getMessage());
            } else {
                this.this$0.f85552n.setValue("neterror");
            }
        }
        return Unit.INSTANCE;
    }
}
