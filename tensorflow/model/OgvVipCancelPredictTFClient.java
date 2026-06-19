package com.bilibili.tensorflow.model;

import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.ogv.infra.util.i;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient.class */
public final class OgvVipCancelPredictTFClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final OgvVipCancelPredictTFClient f110754a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f110755b = i.b(Hj0.a.c("ogv.ogv_tf_vip_step"), 64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f110756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ExecutorCoroutineDispatcher f110757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static AccountInfo f110758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f110759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f110760g;

    @NotNull
    public static List<Integer> h;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient, java.lang.Object] */
    static {
        Double doubleOrNull = StringsKt.toDoubleOrNull(Hj0.a.c("ogv.tf_vip_sampling_rate"));
        f110756c = doubleOrNull != null ? doubleOrNull.doubleValue() : 1.0d;
        f110757d = ExecutorsKt.from(Executors.newSingleThreadExecutor());
        f110758e = com.bilibili.ogv.infra.account.a.f67851a.getAccountInfoFromCache();
        f110759f = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        f110760g = new AtomicInteger(0);
        h = CollectionsKt.emptyList();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient r5, kotlin.coroutines.Continuation r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$1 r0 = (com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r5 = r0
            goto L34
        L2a:
            com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$1 r0 = new com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r5 = r0
        L34:
            r0 = r5
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5c
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L55
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L55:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L80
        L5c:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.tflite.TFLite r0 = com.bilibili.tflite.TFLite.INSTANCE
            kotlinx.coroutines.flow.StateFlow r0 = r0.getTfSoStateReadyFlow()
            r8 = r0
            com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2<T> r0 = com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$collectLogDataAndPredict$2.f110761a
            r9 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r9
            r2 = r5
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r6
            if (r0 != r1) goto L80
            r0 = r6
            return r0
        L80:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient.a(com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void b() {
        BuildersKt.launch$default(f110759f, (CoroutineContext) null, (CoroutineStart) null, new OgvVipCancelPredictTFClient$start$1(null), 3, (Object) null);
    }
}
