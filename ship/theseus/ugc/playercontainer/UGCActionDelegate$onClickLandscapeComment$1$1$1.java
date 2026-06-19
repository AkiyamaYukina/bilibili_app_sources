package com.bilibili.ship.theseus.ugc.playercontainer;

import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.ship.theseus.united.player.widget.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$onClickLandscapeComment$1$1$1.class */
public final class UGCActionDelegate$onClickLandscapeComment$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final UGCActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCActionDelegate$onClickLandscapeComment$1$1$1(UGCActionDelegate uGCActionDelegate, Continuation<? super UGCActionDelegate$onClickLandscapeComment$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = uGCActionDelegate;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UGCActionDelegate$onClickLandscapeComment$1$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UGCActionDelegate uGCActionDelegate = this.this$0;
            ZoomContainerService zoomContainerService = uGCActionDelegate.f98227C;
            a.C1172a c1172a = new a.C1172a(uGCActionDelegate.f98231G, uGCActionDelegate.f98232H, uGCActionDelegate.f98235b.a(), this.this$0.f98226B.a().f123880b, this.this$0.f98226B.a().f123881c, this.this$0.f98226B.a().f123882d, this.this$0.f98226B.a().f123879a, this.this$0.f98235b.g());
            this.label = 1;
            if (zoomContainerService.p(com.bilibili.ship.theseus.united.player.widget.a.class, c1172a, ZoomContainerService.Side.RIGHT, this) == coroutine_suspended) {
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
