package com.bilibili.tensorflow.model;

import com.bilibili.ogv.infra.util.i;
import com.bilibili.tensorflow.data.api.TfRemoteData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipContractLostPredictTFClient.class */
public final class OgvVipContractLostPredictTFClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final OgvVipContractLostPredictTFClient f110768a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ExecutorCoroutineDispatcher f110769b = ExecutorsKt.from(Executors.newSingleThreadExecutor());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static List<Integer> f110770c = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f110771d;

    public static final List a(com.bilibili.tensorflow.utils.c cVar, TfRemoteData tfRemoteData) {
        Integer intOrNull;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : tfRemoteData.f110711c.f110714b.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key.intValue() < 32) {
                if (value.length() > 30) {
                    String str = cVar.f110818b.f110816c.get(value);
                    arrayList.add(Integer.valueOf((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()));
                } else {
                    arrayList.add(Integer.valueOf(i.c(value)));
                }
            }
        }
        return arrayList;
    }

    public static void c() {
        if (Hj0.a.a("tf_ogv_vip_open_switch", false) && com.bilibili.ogv.infra.account.a.f67852b.isLogin() && !f110771d) {
            BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new OgvVipContractLostPredictTFClient$startContractLostPredict$1(null), 3, (Object) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1 r0 = (com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1 r0 = new com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L59
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L51
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L81
        L59:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r9 = r0
            com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2 r0 = new com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r10
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto L81
            r0 = r8
            return r0
        L81:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
