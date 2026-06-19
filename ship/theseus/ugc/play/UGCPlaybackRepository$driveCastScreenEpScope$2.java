package com.bilibili.ship.theseus.ugc.play;

import android.os.Parcelable;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$driveCastScreenEpScope$2.class */
final class UGCPlaybackRepository$driveCastScreenEpScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final UGCPlaybackRepository.a.C0903a $state;
    private Object L$0;
    int label;
    final UGCPlaybackRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlaybackRepository$driveCastScreenEpScope$2(UGCPlaybackRepository uGCPlaybackRepository, UGCPlaybackRepository.a.C0903a c0903a, Continuation<? super UGCPlaybackRepository$driveCastScreenEpScope$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCPlaybackRepository;
        this.$state = c0903a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCPlaybackRepository$driveCastScreenEpScope$2 uGCPlaybackRepository$driveCastScreenEpScope$2 = new UGCPlaybackRepository$driveCastScreenEpScope$2(this.this$0, this.$state, continuation);
        uGCPlaybackRepository$driveCastScreenEpScope$2.L$0 = obj;
        return uGCPlaybackRepository$driveCastScreenEpScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
        UGCPlaybackRepository.a.C0903a c0903a = this.$state;
        uGCPlaybackRepository.getClass();
        defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$driveCastScreenEpScope$2-invokeSuspend] ", "drive ugc cast screen ep play scope, [" + UGCPlaybackRepository.d(c0903a) + "]", "UGCPlaybackRepository$driveCastScreenEpScope$2-invokeSuspend");
        C7893a c7893a = this.this$0.f98069n;
        c7893a.f123390c = null;
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        c7893a.d(PlayingAreaDescription.a.a(this.$state.f98078a.f98082a.f596g));
        this.this$0.f98067l.a(coroutineScope, this.$state.f98078a.f98082a);
        return Unit.INSTANCE;
    }
}
