package com.bilibili.ship.theseus.ogv;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.ship.theseus.ogv.requestreport.OgvDataRequestFailedReporter;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvIjkReportService$1.class */
public final class OgvIjkReportService$1 extends SuspendLambda implements Function2<A.b, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvIjkReportService$1(t tVar, Continuation<? super OgvIjkReportService$1> continuation) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvIjkReportService$1 ogvIjkReportService$1 = new OgvIjkReportService$1(this.this$0, continuation);
        ogvIjkReportService$1.L$0 = obj;
        return ogvIjkReportService$1;
    }

    public final Object invoke(A.b bVar, Continuation<? super Unit> continuation) {
        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        A.b bVar = (A.b) this.L$0;
        t tVar = this.this$0;
        int i7 = bVar.f79326a;
        tVar.getClass();
        Neurons.trackT$default(false, "ogv.detail.ijk.failed.report", MapsKt.mapOf(new Pair[]{TuplesKt.to("errorCode", String.valueOf(i7)), TuplesKt.to("errorMsg", "ijk player error")}), 0, new OgvIjkReportService$reportOnIJKFailed$1(OgvDataRequestFailedReporter.f94423a), 8, (Object) null);
        return Unit.INSTANCE;
    }
}
