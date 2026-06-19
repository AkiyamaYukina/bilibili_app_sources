package com.bilibili.ship.theseus.ogv.ep;

import android.os.Parcelable;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2.class */
final class OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvCurrentEpisodeRepository.b.a $state;
    private Object L$0;
    int label;
    final OgvCurrentEpisodeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, OgvCurrentEpisodeRepository.b.a aVar, Continuation<? super OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvCurrentEpisodeRepository;
        this.$state = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2 ogvCurrentEpisodeRepository$driveCastScreenEpComponent$2 = new OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2(this.this$0, this.$state, continuation);
        ogvCurrentEpisodeRepository$driveCastScreenEpComponent$2.L$0 = obj;
        return ogvCurrentEpisodeRepository$driveCastScreenEpComponent$2;
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
        BLog.i("OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2-invokeSuspend", "[theseus-ogv-OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2-invokeSuspend] drive ogv cast screen ep play scope");
        C7893a c7893a = this.this$0.f92112o;
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        c7893a.d(PlayingAreaDescription.a.a(this.$state.f92125a.f92122a.f93546B));
        this.this$0.f92104f.a(coroutineScope, this.$state.f92125a.f92122a);
        return Unit.INSTANCE;
    }
}
