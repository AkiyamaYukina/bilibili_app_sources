package com.bilibili.ship.theseus.ogv.ep;

import android.os.Parcelable;
import com.bilibili.ship.theseus.ogv.C6152d;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver;
import com.bilibili.ship.theseus.ogv.s;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$driveMediaEpComponent$2.class */
final class OgvCurrentEpisodeRepository$driveMediaEpComponent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvCurrentEpisodeRepository.b.c $state;
    private Object L$0;
    int label;
    final OgvCurrentEpisodeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvCurrentEpisodeRepository$driveMediaEpComponent$2(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, OgvCurrentEpisodeRepository.b.c cVar, Continuation<? super OgvCurrentEpisodeRepository$driveMediaEpComponent$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvCurrentEpisodeRepository;
        this.$state = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvCurrentEpisodeRepository$driveMediaEpComponent$2 ogvCurrentEpisodeRepository$driveMediaEpComponent$2 = new OgvCurrentEpisodeRepository$driveMediaEpComponent$2(this.this$0, this.$state, continuation);
        ogvCurrentEpisodeRepository$driveMediaEpComponent$2.L$0 = obj;
        return ogvCurrentEpisodeRepository$driveMediaEpComponent$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("OgvCurrentEpisodeRepository$driveMediaEpComponent$2-invokeSuspend", "[theseus-ogv-OgvCurrentEpisodeRepository$driveMediaEpComponent$2-invokeSuspend] drive ogv media ep play scope");
        C7893a c7893a = this.this$0.f92112o;
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        c7893a.d(PlayingAreaDescription.a.a(this.$state.f92128b.f92122a.f93546B));
        s sVar = this.this$0.f92103e;
        o oVar = new o();
        com.bilibili.ship.theseus.united.bean.d dVar = this.$state.f92129c;
        oVar.m9372setTagpIAwiHE(com.bilibili.ship.theseus.ogv.restrictionlayer.a.f94435a.a, new OgvRestrictionLayerDriver.a((dVar == null || (bool = dVar.f98756e) == null) ? false : bool.booleanValue()));
        Unit unit = Unit.INSTANCE;
        OgvCurrentEpisodeRepository.b.c cVar = this.$state;
        C6152d c6152dA = sVar.a(coroutineScope, oVar, cVar.f92128b.f92122a, this.this$0.f92121x, cVar.f92127a.f104529c);
        this.this$0.f92107j.e(true, false);
        this.this$0.f92120w.setValue(c6152dA);
        return Unit.INSTANCE;
    }
}
