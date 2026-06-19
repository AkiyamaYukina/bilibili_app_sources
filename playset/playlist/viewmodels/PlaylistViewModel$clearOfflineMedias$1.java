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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel$clearOfflineMedias$1.class */
public final class PlaylistViewModel$clearOfflineMedias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final PlaylistViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$clearOfflineMedias$1(PlaylistViewModel playlistViewModel, long j7, Continuation<? super PlaylistViewModel$clearOfflineMedias$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistViewModel;
        this.$playlistId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistViewModel$clearOfflineMedias$1(this.this$0, this.$playlistId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            if (e7 instanceof BiliApiException) {
                this.this$0.f85535p.setValue(e7.getMessage());
            } else {
                this.this$0.f85535p.setValue("neterror");
            }
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f85535p.setValue("loading");
            long j7 = this.$playlistId;
            this.label = 1;
            if (com.bilibili.playset.api.i.g(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        PlaylistViewModel playlistViewModel = this.this$0;
        long j8 = this.$playlistId;
        this.label = 2;
        playlistViewModel.getClass();
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(1, durationUnit);
        long duration2 = DurationKt.toDuration(2, durationUnit);
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1(DurationKt.toDuration(5, durationUnit), duration, duration2, 2, null, playlistViewModel, playlistViewModel, j8, playlistViewModel), 3, (Object) null);
        if (Unit.INSTANCE == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
