package com.bilibili.tensorflow.model;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/d.class */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile File f110780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile File f110781d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f110778a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f110779b = new c("tf_contract_mod", "vip-contract-model.tflite", "eventkey.csv", "3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static volatile String f110782e = "";

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.tensorflow.model.TFVipContractModelLoader$prepare$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.tensorflow.model.TFVipContractModelLoader$prepare$1 r0 = (com.bilibili.tensorflow.model.TFVipContractModelLoader$prepare$1) r0
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
            com.bilibili.tensorflow.model.TFVipContractModelLoader$prepare$1 r0 = new com.bilibili.tensorflow.model.TFVipContractModelLoader$prepare$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.tensorflow.model.c r0 = com.bilibili.tensorflow.model.d.f110779b
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L5f
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r6 = r0
            goto L7f
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.tensorflow.utils.d r0 = com.bilibili.tensorflow.utils.d.f110820a
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r9
            r2 = r6
            java.lang.Object r0 = r0.a(r1, r2)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r10
            if (r0 != r1) goto L7f
            r0 = r10
            return r0
        L7f:
            r0 = r6
            kotlin.Triple r0 = (kotlin.Triple) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Laa
            r0 = r6
            java.lang.Object r0 = r0.getFirst()
            java.io.File r0 = (java.io.File) r0
            com.bilibili.tensorflow.model.d.f110780c = r0
            r0 = r6
            java.lang.Object r0 = r0.getSecond()
            java.io.File r0 = (java.io.File) r0
            com.bilibili.tensorflow.model.d.f110781d = r0
            r0 = r6
            java.lang.Object r0 = r0.getThird()
            java.lang.String r0 = (java.lang.String) r0
            com.bilibili.tensorflow.model.d.f110782e = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "tfModeLoadFail"
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
