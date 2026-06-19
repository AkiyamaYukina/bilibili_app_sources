package com.bilibili.pegasus.components.customreporter;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/OfflineLogMiddleware$1.class */
final class OfflineLogMiddleware$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final e this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/OfflineLogMiddleware$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f75911a = (a<T>) new Object();

        public final Object emit(Object obj, Continuation continuation) {
            d dVar = (d) obj;
            StringBuilder sbA = z.a(dVar.f75935a, "[recommendRequestTimeConsuming] {\"start_time\":", ",\"end_time\":");
            sbA.append(dVar.f75936b);
            sbA.append(",\"flush\":");
            sbA.append(dVar.f75937c);
            sbA.append(",\"status\":");
            sbA.append(dVar.f75939e);
            sbA.append(ReporterMap.RIGHT_BRACES);
            BLog.i("pegasus", sbA.toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineLogMiddleware$1(e eVar, Continuation<? super OfflineLogMiddleware$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfflineLogMiddleware$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f75940a);
            FlowCollector flowCollector = a.f75911a;
            this.label = 1;
            Object objCollect = flowFilterNotNull.collect(new OfflineLogMiddleware$1$invokeSuspend$$inlined$filter$1$2(flowCollector), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
