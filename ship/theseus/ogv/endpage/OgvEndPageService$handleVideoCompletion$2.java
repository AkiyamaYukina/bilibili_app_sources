package com.bilibili.ship.theseus.ogv.endpage;

import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvEndPageService$handleVideoCompletion$2.class */
public final class OgvEndPageService$handleVideoCompletion$2 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvEndPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvEndPageService$handleVideoCompletion$2(OgvEndPageService ogvEndPageService, Continuation<? super OgvEndPageService$handleVideoCompletion$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvEndPageService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvEndPageService$handleVideoCompletion$2 ogvEndPageService$handleVideoCompletion$2 = new OgvEndPageService$handleVideoCompletion$2(this.this$0, continuation);
        ogvEndPageService$handleVideoCompletion$2.L$0 = obj;
        return ogvEndPageService$handleVideoCompletion$2;
    }

    public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c.a aVar = (c.a) this.L$0;
            Object obj2 = !aVar.f102988b ? this.this$0.f91925a.get() : aVar.f102987a ? this.this$0.f91927c.get() : this.this$0.f91926b.get();
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setExitAnim(-1);
            layoutParams.setEnterAnim(-1);
            layoutParams.setFunctionType(1);
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(this.this$0.f91928d, (AbsFunctionWidget) obj2, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
