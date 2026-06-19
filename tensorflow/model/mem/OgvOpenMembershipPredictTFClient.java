package com.bilibili.tensorflow.model.mem;

import com.bilibili.biligame.dialogdispatcher.e;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.tensorflow.data.api.TfRemoteData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.Interpreter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/OgvOpenMembershipPredictTFClient.class */
public final class OgvOpenMembershipPredictTFClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final OgvOpenMembershipPredictTFClient f110788a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f110789b = {"DBY-W09"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f110790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f110791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static List<Integer> f110792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f110793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f110794g;
    public static int h;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient, java.lang.Object] */
    static {
        Double doubleOrNull = StringsKt.toDoubleOrNull(Hj0.a.c("ogv.tf_open_membership_sampling_rate"));
        f110790c = doubleOrNull != null ? doubleOrNull.doubleValue() : 1.0d;
        f110791d = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        f110792e = CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.a(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float b(List list, ByteBuffer byteBuffer) {
        byte b7;
        try {
            Interpreter interpreter = new Interpreter(byteBuffer);
            f110792e = list;
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
            e.a("[tensorflow-OgvOpenMembershipPredictTFClient-predict] ", e7.getMessage(), "OgvOpenMembershipPredictTFClient-predict", e7);
            b7 = -1082130432;
        }
        return b7 == true ? 1.0f : 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.c(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final List d(TfRemoteData tfRemoteData) {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1 r0 = (com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1) r0
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
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1 r0 = new com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$1
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
            r9 = r0
            com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2<T> r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient$requestVipDataAndPredict$2.f110795a
            r8 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r8
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.e(com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g() {
        /*
            r0 = 0
            r5 = r0
            r0 = r5
            r4 = r0
            java.lang.String r0 = "tf_ogv_open_membership_switch"
            r1 = 0
            boolean r0 = Hj0.a.a(r0, r1)
            if (r0 == 0) goto L5c
            boolean r0 = kntr.base.utils.foundation.RomUtils.isHuaweiRom()
            if (r0 != 0) goto L22
            boolean r0 = kntr.base.utils.foundation.RomUtils.isHonorRom()
            if (r0 == 0) goto L1d
            goto L22
        L1d:
            r0 = 0
            r3 = r0
            goto L24
        L22:
            r0 = 1
            r3 = r0
        L24:
            r0 = r3
            if (r0 == 0) goto L37
            java.lang.String r0 = "tf_ogv_open_membership_huawei_switch_off"
            r1 = 0
            boolean r0 = Hj0.a.a(r0, r1)
            if (r0 == 0) goto L37
            r0 = r5
            r4 = r0
            goto L5c
        L37:
            java.lang.String r0 = android.os.Build.MODEL
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L4e
            java.lang.String[] r0 = com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f110789b
            r1 = r6
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 == 0) goto L4e
            r0 = r5
            r4 = r0
            goto L5c
        L4e:
            r0 = r3
            if (r0 == 0) goto L5a
            r0 = r5
            r4 = r0
            boolean r0 = kntr.base.utils.foundation.RomUtils.isHarmony()
            if (r0 == 0) goto L5c
        L5a:
            r0 = 1
            r4 = r0
        L5c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.g():boolean");
    }

    public static void i() {
        BuildersKt.launch$default(f110791d, (CoroutineContext) null, (CoroutineStart) null, new OgvOpenMembershipPredictTFClient$startOpenMembershipPredict$1(null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r9, long r11, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.f(long, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0142 -> B:86:0x025c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01c4 -> B:65:0x01d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r9, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.mem.OgvOpenMembershipPredictTFClient.h(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
