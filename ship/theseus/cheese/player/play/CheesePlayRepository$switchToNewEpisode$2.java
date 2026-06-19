package com.bilibili.ship.theseus.cheese.player.play;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.keel.player.e;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import eu0.C6985d;
import ev0.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$switchToNewEpisode$2.class */
public final class CheesePlayRepository$switchToNewEpisode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6985d $episode;
    final i $landingPosition;
    final GeminiCommonPlayableParams $playableParams;
    int label;
    final CheesePlayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayRepository$switchToNewEpisode$2(CheesePlayRepository cheesePlayRepository, C6985d c6985d, GeminiCommonPlayableParams geminiCommonPlayableParams, i iVar, Continuation<? super CheesePlayRepository$switchToNewEpisode$2> continuation) {
        super(2, continuation);
        this.this$0 = cheesePlayRepository;
        this.$episode = c6985d;
        this.$playableParams = geminiCommonPlayableParams;
        this.$landingPosition = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePlayRepository$switchToNewEpisode$2(this.this$0, this.$episode, this.$playableParams, this.$landingPosition, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PreloadRepository preloadRepository = this.this$0.f90684n;
            C6985d c6985d = this.$episode;
            long j7 = c6985d.f117510e;
            this.label = 1;
            Object objA = preloadRepository.a(j7, c6985d.f117511f, this);
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
        C6985d c6985d2 = this.$episode;
        defpackage.a.b("[theseus-cheese-CheesePlayRepository$switchToNewEpisode$2-invokeSuspend] ", android.support.v4.media.session.a.a(z.a(c6985d2.f117510e, "can not find valid preload data for avid:", ", cid:"), c6985d2.f117511f, ", switch media scope without preload data"), "CheesePlayRepository$switchToNewEpisode$2-invokeSuspend");
        CheesePlayRepository.j(this.$episode, this.$playableParams, this.$landingPosition, this.this$0, (e) obj);
        return Unit.INSTANCE;
    }
}
