package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import Pb.E;
import com.bilibili.adcommon.utils.i;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import java.util.Timer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1.class */
public final class PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Continuation<f> $it;
    final String $orderCTime;
    final String $orderId;
    int label;
    final PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 this$0;
    final d this$1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1$a.class */
    public static final class a implements Function4<String, Boolean, Throwable, Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 f74035a;

        public a(PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1) {
            this.f74035a = payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Throwable th = (Throwable) obj3;
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 = this.f74035a;
            payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74028b = zBooleanValue;
            String message = null;
            if (zBooleanValue2) {
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74027a = true;
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74029c = th;
                if (th != null) {
                    message = th.getMessage();
                }
                E.a("something force stop.....message: ", message, ReporterMap.RIGHT_BRACES, "PayViewStoreViewModel");
            } else if (zBooleanValue) {
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74027a = true;
            } else {
                String message2 = null;
                if (th != null) {
                    message2 = th.getMessage();
                }
                i.a("is not success...... order id: ", str, ", error message: ", message2, "PayViewStoreViewModel");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1(PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1, d dVar, Continuation<? super f> continuation, String str, String str2, Continuation<? super PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1> continuation2) {
        super(2, continuation2);
        this.this$0 = payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1;
        this.this$1 = dVar;
        this.$it = continuation;
        this.$orderId = str;
        this.$orderCTime = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1(this.this$0, this.this$1, this.$it, this.$orderId, this.$orderCTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 = this.this$0;
            if (payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74027a) {
                Timer timer = this.this$1.f74052f;
                if (timer != null) {
                    timer.cancel();
                }
                this.this$1.f74052f = null;
                Continuation<f> continuation = this.$it;
                Result.Companion companion = Result.Companion;
                PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 payViewStoreViewModel$startRotationTrainingForConsumeResult$2$12 = this.this$0;
                continuation.resumeWith(Result.constructor-impl(new f(payViewStoreViewModel$startRotationTrainingForConsumeResult$2$12.f74028b, payViewStoreViewModel$startRotationTrainingForConsumeResult$2$12.f74029c, 1)));
                return Unit.INSTANCE;
            }
            if (payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74031e >= payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74030d) {
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74027a = true;
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74028b = false;
                payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.f74029c = new Throwable("请求超时，请重新尝试支付");
            } else {
                d dVar = this.this$1;
                String str = this.$orderId;
                String str2 = this.$orderCTime;
                a aVar = new a(payViewStoreViewModel$startRotationTrainingForConsumeResult$2$1);
                this.label = 1;
                if (d.I0(dVar, str, str2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f74031e++;
        return Unit.INSTANCE;
    }
}
