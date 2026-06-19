package com.bilibili.mall.kmm.virtumart.api;

import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/api/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Json f65687a = JsonKt.Json$default((Json) null, new a(0), 1, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.api.b.a(long, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.Map r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.mall.kmm.virtumart.api.MallVirtualMartAPIServiceImpl$loadData$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.mall.kmm.virtumart.api.MallVirtualMartAPIServiceImpl$loadData$1 r0 = (com.bilibili.mall.kmm.virtumart.api.MallVirtualMartAPIServiceImpl$loadData$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.mall.kmm.virtumart.api.MallVirtualMartAPIServiceImpl$loadData$1 r0 = new com.bilibili.mall.kmm.virtumart.api.MallVirtualMartAPIServiceImpl$loadData$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r7
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            r6 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto L8e
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r6
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            java.lang.String r0 = "https://mall.bilibili.com/mall-search-items/items/course/lesson/detail"
            r1 = r6
            r2 = r7
            java.lang.Object r0 = com.bilibili.mall.kmm.common.f.a(r0, r1, r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r10
            if (r0 != r1) goto L8e
            r0 = r10
            return r0
        L8e:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r5
            kotlinx.serialization.json.Json r0 = r0.f65687a
            r6 = r0
            r0 = r6
            kotlinx.serialization.modules.SerializersModule r0 = r0.getSerializersModule()
            r0 = r6
            com.bilibili.mall.kmm.common.c$b r1 = com.bilibili.mall.kmm.common.c.Companion
            ih0.b$b r2 = ih0.C7575b.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            kotlinx.serialization.KSerializer r1 = r1.serializer(r2)
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1
            r2 = r7
            java.lang.Object r0 = r0.decodeFromString(r1, r2)
            com.bilibili.mall.kmm.common.c r0 = (com.bilibili.mall.kmm.common.c) r0
            java.lang.Object r0 = com.bilibili.mall.kmm.common.b.a(r0)
            r6 = r0
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.api.b.b(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, long r10, boolean r12, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.api.b.c(java.lang.String, java.lang.String, long, boolean, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
