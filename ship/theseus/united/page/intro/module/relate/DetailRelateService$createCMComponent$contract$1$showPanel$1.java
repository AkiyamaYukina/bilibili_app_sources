package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$contract$1$showPanel$1.class */
public final class DetailRelateService$createCMComponent$contract$1$showPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TT; */
    final IPanelData $panelData;
    final int $panelType;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService;ITT;Lkotlin/coroutines/Continuation<-Lcom/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$contract$1$showPanel$1;>;)V */
    public DetailRelateService$createCMComponent$contract$1$showPanel$1(DetailRelateService detailRelateService, int i7, IPanelData iPanelData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = detailRelateService;
        this.$panelType = i7;
        this.$panelData = iPanelData;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$createCMComponent$contract$1$showPanel$1(this.this$0, this.$panelType, this.$panelData, continuation);
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
        IPanelCallback.showPanel$default(this.this$0.f100883s.b(), this.$panelType, this.$panelData, (IAdPanelListener) null, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
