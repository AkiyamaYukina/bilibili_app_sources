package com.bilibili.tensorflow.model.mem;

import com.bilibili.biligame.dialogdispatcher.e;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.tensorflow.data.api.TfRemoteData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.Interpreter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient.class */
public final class VipOpenMembershipPredictTFClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final VipOpenMembershipPredictTFClient f110796a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f110797b = {"DBY-W09"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231 A[PHI: r6 r10 r12
  0x0231: PHI (r6v4 kotlinx.coroutines.CompletableDeferred) = (r6v3 kotlinx.coroutines.CompletableDeferred), (r6v9 kotlinx.coroutines.CompletableDeferred) binds: [B:110:0x0228, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r10v9 java.nio.MappedByteBuffer) = (r10v8 java.nio.MappedByteBuffer), (r10v13 java.nio.MappedByteBuffer) binds: [B:110:0x0228, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r12v4 java.lang.Object) = (r12v3 java.lang.Object), (r12v8 java.lang.Object) binds: [B:110:0x0228, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient r5, kotlinx.coroutines.CompletableDeferred r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient.a(com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient, kotlinx.coroutines.CompletableDeferred, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1
            if (r0 == 0) goto L2a
            r0 = r7
            com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1 r0 = (com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r6 = r0
            goto L34
        L2a:
            com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1 r0 = new com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto L8b
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2 r0 = new com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient$requestVipDataAndPredict$2
            r1 = r0
            r2 = 0
            r3 = 1
            r4 = 0
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r2, r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            r1 = r9
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r0, r1, r2)
            r9 = r0
            r0 = r9
            r6 = r0
            r0 = r9
            r1 = r7
            if (r0 != r1) goto L8b
            r0 = r7
            r6 = r0
            goto L99
        L8b:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L99
            java.lang.String r0 = "00"
            r6 = r0
        L99:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient.b(com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float d(List list, ByteBuffer byteBuffer) {
        byte b7;
        try {
            Interpreter interpreter = new Interpreter(byteBuffer);
            int[] iArr = new int[1];
            iArr[0] = new int[list.size()];
            int i7 = 0;
            for (Object obj : list) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iArr[0][i7] = ((Number) obj).intValue();
                i7++;
            }
            float[] fArr = new float[1];
            fArr[0] = new float[1];
            interpreter.run(iArr, fArr);
            interpreter.close();
            b7 = fArr[0][0];
        } catch (Exception e7) {
            e.a("[tensorflow-VipOpenMembershipPredictTFClient-predict] ", e7.getMessage(), "VipOpenMembershipPredictTFClient-predict", e7);
            b7 = -1082130432;
        }
        return b7 == true ? 1.0f : 0.0f;
    }

    public static List g(TfRemoteData tfRemoteData) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : tfRemoteData.f110711c.f110714b.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key.intValue() < 32) {
                if (value.length() > 30) {
                    com.bilibili.tensorflow.utils.b bVar = c.f110810f;
                    arrayList.add(Integer.valueOf(i.c(bVar != null ? bVar.f110816c.get(value) : null)));
                } else {
                    arrayList.add(Integer.valueOf(i.c(value)));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Object h(@NotNull Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r9, long r11, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient.c(long, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0236  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0142 -> B:86:0x0260). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01c4 -> B:65:0x01d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r9, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.VipOpenMembershipPredictTFClient.f(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
