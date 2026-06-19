package com.bilibili.ship.theseus.ugc.intro.profield;

import com.bapis.bilibili.community.service.cert.v1.FieldCertMoss;
import com.bapis.bilibili.community.service.cert.v1.FieldCertPopRecordReq;
import com.bapis.bilibili.community.service.cert.v1.FieldCertPopRecordRsp;
import com.bilibili.bangumi.logic.page.detail.service.e;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$reportMossShow$2.class */
final class UgcProfessionalFieldService$reportMossShow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    int label;
    final UgcProfessionalFieldService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcProfessionalFieldService$reportMossShow$2(UgcProfessionalFieldService ugcProfessionalFieldService, Continuation<? super UgcProfessionalFieldService$reportMossShow$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcProfessionalFieldService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcProfessionalFieldService$reportMossShow$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FieldCertPopRecordRsp fieldCertPopRecordRspExecuteFieldCertPopRecord;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            fieldCertPopRecordRspExecuteFieldCertPopRecord = new FieldCertMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeFieldCertPopRecord(FieldCertPopRecordReq.newBuilder().setAvid(this.this$0.f97132e.a()).build());
        } catch (MossException e7) {
            e.a("[theseus-ugc-UgcProfessionalFieldService$reportMossShow$2-invokeSuspend] ", "report field cert moss show error -> " + e7, "UgcProfessionalFieldService$reportMossShow$2-invokeSuspend", (Throwable) null);
            fieldCertPopRecordRspExecuteFieldCertPopRecord = Unit.INSTANCE;
        }
        return fieldCertPopRecordRspExecuteFieldCertPopRecord;
    }
}
