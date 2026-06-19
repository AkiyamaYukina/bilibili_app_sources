package com.bilibili.ship.theseus.ugc.play;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.ship.theseus.keel.player.e;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import ev0.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$switchToNewEpisode$2.class */
public final class UGCPlaybackRepository$switchToNewEpisode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Av0.a $episode;
    final int $index;
    final i $landingPosition;
    int label;
    final UGCPlaybackRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlaybackRepository$switchToNewEpisode$2(UGCPlaybackRepository uGCPlaybackRepository, Av0.a aVar, int i7, i iVar, Continuation<? super UGCPlaybackRepository$switchToNewEpisode$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCPlaybackRepository;
        this.$episode = aVar;
        this.$index = i7;
        this.$landingPosition = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCPlaybackRepository$switchToNewEpisode$2(this.this$0, this.$episode, this.$index, this.$landingPosition, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PreloadRepository preloadRepository = this.this$0.f98074s;
            Av0.a aVar = this.$episode;
            long j7 = aVar.f590a;
            this.label = 1;
            Object objA = preloadRepository.a(j7, aVar.f591b, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Av0.a aVar2 = this.$episode;
        defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$switchToNewEpisode$2-invokeSuspend] ", android.support.v4.media.session.a.a(z.a(aVar2.f590a, "can not find valid preload data for avid:", ", cid:"), aVar2.f591b, ", switch media scope without preload data"), "UGCPlaybackRepository$switchToNewEpisode$2-invokeSuspend");
        UGCPlaybackRepository.h(this.$episode, this.this$0, this.$index, this.$landingPosition, (e) obj);
        return Unit.INSTANCE;
    }
}
