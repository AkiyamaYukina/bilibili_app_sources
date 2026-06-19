package com.bilibili.ship.theseus.united.page.miniplayer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$collectBackAction$1.class */
final class DetailMiniPlayerService$collectBackAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMiniPlayerService$collectBackAction$1(b bVar, Continuation<? super DetailMiniPlayerService$collectBackAction$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailMiniPlayerService$collectBackAction$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f102050f);
            DetailMiniPlayerService$collectBackAction$1$event$1 detailMiniPlayerService$collectBackAction$1$event$1 = new DetailMiniPlayerService$collectBackAction$1$event$1(this.this$0, null);
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(eventFlow, detailMiniPlayerService$collectBackAction$1$event$1, this);
            obj = objFirstOrNull;
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Lifecycle.Event) obj) == null) {
            BLog.i("DetailMiniPlayerService$collectBackAction$1-invokeSuspend", "[theseus-united-DetailMiniPlayerService$collectBackAction$1-invokeSuspend] event is null");
            return Unit.INSTANCE;
        }
        b.c(this.this$0);
        if (this.this$0.f102052i.e()) {
            return Unit.INSTANCE;
        }
        IMiniPlayerWindowManager iMiniPlayerWindowManager = this.this$0.f102059p;
        if ((iMiniPlayerWindowManager == null || !iMiniPlayerWindowManager.isMiniPlayerActive(true)) && CompoundPlayStateProviderKt.c(this.this$0.f102051g)) {
            b bVar = this.this$0;
            if (!bVar.f102054k.f102031c && bVar.f102052i.d() && !this.this$0.d()) {
                b bVar2 = this.this$0;
                if (!bVar2.f102061r) {
                    bVar2.f102063t.tryEmit(new b.InterfaceC1071b.a(true, true, false, 9));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
