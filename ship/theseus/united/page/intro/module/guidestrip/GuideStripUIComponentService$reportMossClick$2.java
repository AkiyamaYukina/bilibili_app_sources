package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bapis.bilibili.community.service.cert.v1.Action;
import com.bapis.bilibili.community.service.cert.v1.FieldCertMoss;
import com.bapis.bilibili.community.service.cert.v1.FieldCertPopActionReq;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$reportMossClick$2.class */
final class GuideStripUIComponentService$reportMossClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$reportMossClick$2(GuideStripUIComponentService guideStripUIComponentService, Continuation<? super GuideStripUIComponentService$reportMossClick$2> continuation) {
        super(2, continuation);
        this.this$0 = guideStripUIComponentService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GuideStripUIComponentService$reportMossClick$2(this.this$0, continuation);
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
        try {
            new FieldCertMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeFieldCertPopAction(FieldCertPopActionReq.newBuilder().setAvid(this.this$0.f100075g.a()).setAction(Action.ACTION_CERT_CANCEL).build());
            e eVar = this.this$0.f100074f;
            MutableStateFlow<Integer> mutableStateFlow = eVar.f100117a;
            mutableStateFlow.setValue(Integer.valueOf(((Number) mutableStateFlow.getValue()).intValue() - 1));
            eVar.f100119c.setValue(Boolean.FALSE);
        } catch (MossException e7) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-GuideStripUIComponentService$reportMossClick$2-invokeSuspend] ", "report field cert moss click error -> " + e7, "GuideStripUIComponentService$reportMossClick$2-invokeSuspend", (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
