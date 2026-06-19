package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import eu0.C6985d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$studyCompletedState$4$1.class */
public final class CheeseStudyCompletedLayerService$studyCompletedState$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseStudyCompletedLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedLayerService$studyCompletedState$4$1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super CheeseStudyCompletedLayerService$studyCompletedState$4$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseStudyCompletedLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyCompletedLayerService$studyCompletedState$4$1(this.this$0, continuation);
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
        PlaybackMode.a aVar = PlaybackMode.Companion;
        int i7 = this.this$0.f90175g.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar.getClass();
        if (PlaybackMode.a.a(i7) == PlaybackMode.SINGLE_EPISODE_LOOP) {
            CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.this$0;
            CheesePlayRepository cheesePlayRepository = cheeseStudyCompletedLayerService.f90186s;
            C6985d c6985d = cheeseStudyCompletedLayerService.f90176i;
            CheesePlayRepository.e(cheesePlayRepository, c6985d.f117510e, c6985d.f117511f, 99, 12);
        } else {
            this.this$0.f90178k.b(true);
        }
        return Unit.INSTANCE;
    }
}
