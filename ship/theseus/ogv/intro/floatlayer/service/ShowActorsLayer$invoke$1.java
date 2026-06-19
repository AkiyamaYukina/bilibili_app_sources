package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import android.os.Bundle;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowActorsLayer$invoke$1.class */
final class ShowActorsLayer$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $actorId;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowActorsLayer$invoke$1(c cVar, long j7, Continuation<? super ShowActorsLayer$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$actorId = j7;
    }

    private static final Unit invokeSuspend$lambda$0(c cVar, long j7, com.bilibili.ogv.infra.coroutine.c cVar2) {
        cVar.getClass();
        d.a aVar = new d.a(null);
        aVar.n(cVar.f92990a.getString(2131854817));
        Bundle bundle = new Bundle();
        bundle.putLong("roleId", j7);
        OgvSeason ogvSeason = cVar.f92992c;
        bundle.putLong("seasonId", ogvSeason.f94449a);
        bundle.putInt("seasonType", ogvSeason.f94450b.f71782a);
        bundle.putString("seasonName", ogvSeason.f94457j);
        Unit unit = Unit.INSTANCE;
        RunningUIComponent runningUIComponent = new RunningUIComponent(new com.bilibili.ship.theseus.united.page.floatlayer.d(aVar, new com.bilibili.ship.theseus.united.page.floatlayer.e(cVar.f92991b, OgvActorInfoFragment.class, bundle, new ShowActorsLayer$component$2(cVar, null))), 0, new ShowActorsLayer$component$3(cVar, aVar, null), 2);
        cVar2.b(new ShowActorsLayer$invoke$1$1$1(cVar, runningUIComponent, null));
        cVar2.b(new ShowActorsLayer$invoke$1$1$2(runningUIComponent, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShowActorsLayer$invoke$1(this.this$0, this.$actorId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = this.this$0;
            long j7 = this.$actorId;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(cVar, j7, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
