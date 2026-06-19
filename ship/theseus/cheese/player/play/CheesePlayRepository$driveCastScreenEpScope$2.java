package com.bilibili.ship.theseus.cheese.player.play;

import android.os.Parcelable;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lv0.C7893a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$driveCastScreenEpScope$2.class */
final class CheesePlayRepository$driveCastScreenEpScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheesePlayRepository.b.a $state;
    private Object L$0;
    int label;
    final CheesePlayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayRepository$driveCastScreenEpScope$2(CheesePlayRepository cheesePlayRepository, CheesePlayRepository.b.a aVar, Continuation<? super CheesePlayRepository$driveCastScreenEpScope$2> continuation) {
        super(2, continuation);
        this.this$0 = cheesePlayRepository;
        this.$state = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePlayRepository$driveCastScreenEpScope$2 cheesePlayRepository$driveCastScreenEpScope$2 = new CheesePlayRepository$driveCastScreenEpScope$2(this.this$0, this.$state, continuation);
        cheesePlayRepository$driveCastScreenEpScope$2.L$0 = obj;
        return cheesePlayRepository$driveCastScreenEpScope$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("CheesePlayRepository$driveCastScreenEpScope$2-invokeSuspend", "[theseus-cheese-CheesePlayRepository$driveCastScreenEpScope$2-invokeSuspend] drive cast screen ep play scope");
        C7893a c7893a = this.this$0.f90683m;
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        c7893a.d(PlayingAreaDescription.a.a(this.$state.f90698a.f90696a.f117523s));
        this.this$0.f90680j.a(coroutineScope, this.$state.f90698a.f90696a);
        return Unit.INSTANCE;
    }
}
