package com.bilibili.tensorflow.model.mem;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2.class */
public final class OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<T> f110795a = (OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<T>) new Object();

    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
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
            OgvOpenMembershipPredictTFClient ogvOpenMembershipPredictTFClient = OgvOpenMembershipPredictTFClient.f110788a;
            CoroutineScope coroutineScope = OgvOpenMembershipPredictTFClient.f110791d;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:14:0x00aa, B:70:0x0288, B:75:0x02d4, B:80:0x02e6, B:82:0x039f, B:19:0x00ce, B:63:0x0236, B:65:0x0245, B:83:0x03a5, B:22:0x00e4, B:57:0x01f1, B:23:0x00eb, B:52:0x01b0, B:24:0x00f2, B:41:0x015e, B:43:0x0168, B:45:0x0172, B:47:0x017c, B:85:0x03b2, B:85:0x03b2, B:86:0x03b5, B:87:0x03be, B:25:0x00f9, B:37:0x0146, B:26:0x0100, B:33:0x012e, B:29:0x0116), top: B:97:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245 A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b7, blocks: (B:14:0x00aa, B:70:0x0288, B:75:0x02d4, B:80:0x02e6, B:82:0x039f, B:19:0x00ce, B:63:0x0236, B:65:0x0245, B:83:0x03a5, B:22:0x00e4, B:57:0x01f1, B:23:0x00eb, B:52:0x01b0, B:24:0x00f2, B:41:0x015e, B:43:0x0168, B:45:0x0172, B:47:0x017c, B:85:0x03b2, B:85:0x03b2, B:86:0x03b5, B:87:0x03be, B:25:0x00f9, B:37:0x0146, B:26:0x0100, B:33:0x012e, B:29:0x0116), top: B:97:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a5 A[Catch: Exception -> 0x00b7, TRY_ENTER, TryCatch #0 {Exception -> 0x00b7, blocks: (B:14:0x00aa, B:70:0x0288, B:75:0x02d4, B:80:0x02e6, B:82:0x039f, B:19:0x00ce, B:63:0x0236, B:65:0x0245, B:83:0x03a5, B:22:0x00e4, B:57:0x01f1, B:23:0x00eb, B:52:0x01b0, B:24:0x00f2, B:41:0x015e, B:43:0x0168, B:45:0x0172, B:47:0x017c, B:85:0x03b2, B:85:0x03b2, B:86:0x03b5, B:87:0x03be, B:25:0x00f9, B:37:0x0146, B:26:0x0100, B:33:0x012e, B:29:0x0116), top: B:97:0x004b }] */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2.emit(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
