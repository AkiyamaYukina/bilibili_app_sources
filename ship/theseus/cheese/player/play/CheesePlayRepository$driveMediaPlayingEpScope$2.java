package com.bilibili.ship.theseus.cheese.player.play;

import android.os.Parcelable;
import com.bilibili.ship.theseus.cheese.di.h;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.di.o;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$driveMediaPlayingEpScope$2.class */
final class CheesePlayRepository$driveMediaPlayingEpScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheesePlayRepository.b.c $state;
    private Object L$0;
    int label;
    final CheesePlayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayRepository$driveMediaPlayingEpScope$2(CheesePlayRepository cheesePlayRepository, CheesePlayRepository.b.c cVar, Continuation<? super CheesePlayRepository$driveMediaPlayingEpScope$2> continuation) {
        super(2, continuation);
        this.this$0 = cheesePlayRepository;
        this.$state = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePlayRepository$driveMediaPlayingEpScope$2 cheesePlayRepository$driveMediaPlayingEpScope$2 = new CheesePlayRepository$driveMediaPlayingEpScope$2(this.this$0, this.$state, continuation);
        cheesePlayRepository$driveMediaPlayingEpScope$2.L$0 = obj;
        return cheesePlayRepository$driveMediaPlayingEpScope$2;
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
        BLog.i("CheesePlayRepository$driveMediaPlayingEpScope$2-invokeSuspend", "[theseus-cheese-CheesePlayRepository$driveMediaPlayingEpScope$2-invokeSuspend] drive normal ep play scope");
        C7893a c7893a = this.this$0.f90683m;
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        c7893a.d(PlayingAreaDescription.a.a(this.$state.f90701b.f90696a.f117523s));
        h hVar = this.this$0.f90679i;
        o oVar = new o();
        CheesePlayRepository.b.c cVar = this.$state;
        hVar.a(coroutineScope, oVar, cVar.f90701b.f90696a, cVar.f90700a);
        this.this$0.f90681k.e(true, false);
        return Unit.INSTANCE;
    }
}
