package com.bilibili.playset.api;

import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.ServiceGenerator;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/i.class */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r9, long r11, long r13, @org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.a(long, long, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(long r7, long r9, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.playset.api.PlaySetApiKt$batchMoveResource$1
            if (r0 == 0) goto L2f
            r0 = r12
            com.bilibili.playset.api.PlaySetApiKt$batchMoveResource$1 r0 = (com.bilibili.playset.api.PlaySetApiKt$batchMoveResource$1) r0
            r14 = r0
            r0 = r14
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r14
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r14
            r12 = r0
            goto L3a
        L2f:
            com.bilibili.playset.api.PlaySetApiKt$batchMoveResource$1 r0 = new com.bilibili.playset.api.PlaySetApiKt$batchMoveResource$1
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r12 = r0
        L3a:
            r0 = r12
            java.lang.Object r0 = r0.result
            r14 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r15 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L6e
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L64
            r0 = r14
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r14
            r11 = r0
            goto La3
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r14
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.playset.api.PlaySetService> r0 = com.bilibili.playset.api.PlaySetService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
            com.bilibili.playset.api.PlaySetService r0 = (com.bilibili.playset.api.PlaySetService) r0
            r1 = r7
            r2 = r9
            r3 = r11
            com.bilibili.okretro.call.BiliCall r0 = r0.batchMoveResource(r1, r2, r3)
            r11 = r0
            r0 = r12
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r12
            java.lang.Object r0 = com.bilibili.lib.coroutineextension.BiliCallExtKt.getResponse(r0, r1)
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            r1 = r15
            if (r0 != r1) goto La3
            r0 = r15
            return r0
        La3:
            r0 = r11
            com.bilibili.playset.api.GeneralMsgResponse r0 = (com.bilibili.playset.api.GeneralMsgResponse) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lbc
            r0 = r11
            T r0 = r0.data
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            goto Lbf
        Lbc:
            r0 = 0
            r11 = r0
        Lbf:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.b(long, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(long r7, int r9, int r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r0 = r11
            boolean r0 = r0 instanceof com.bilibili.playset.api.PlaySetApiKt$getCreatedPlaySetAll$1
            if (r0 == 0) goto L2f
            r0 = r11
            com.bilibili.playset.api.PlaySetApiKt$getCreatedPlaySetAll$1 r0 = (com.bilibili.playset.api.PlaySetApiKt$getCreatedPlaySetAll$1) r0
            r13 = r0
            r0 = r13
            int r0 = r0.label
            r12 = r0
            r0 = r12
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r13
            r1 = r12
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r13
            r11 = r0
            goto L3a
        L2f:
            com.bilibili.playset.api.PlaySetApiKt$getCreatedPlaySetAll$1 r0 = new com.bilibili.playset.api.PlaySetApiKt$getCreatedPlaySetAll$1
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r11 = r0
        L3a:
            r0 = r11
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r11
            int r0 = r0.label
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L6e
            r0 = r12
            r1 = 1
            if (r0 != r1) goto L64
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r13
            r11 = r0
            goto La4
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.playset.api.PlaySetService> r0 = com.bilibili.playset.api.PlaySetService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
            com.bilibili.playset.api.PlaySetService r0 = (com.bilibili.playset.api.PlaySetService) r0
            r1 = r9
            r2 = r10
            java.lang.String r3 = "0"
            r4 = r7
            com.bilibili.okretro.call.BiliCall r0 = r0.getCreatedPlaySetAll(r1, r2, r3, r4)
            r13 = r0
            r0 = r11
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r11
            java.lang.Object r0 = com.bilibili.lib.coroutineextension.BiliCallExtKt.getResponse(r0, r1)
            r13 = r0
            r0 = r13
            r11 = r0
            r0 = r13
            r1 = r14
            if (r0 != r1) goto La4
            r0 = r14
            return r0
        La4:
            r0 = r11
            com.bilibili.playset.api.GeneralMsgResponse r0 = (com.bilibili.playset.api.GeneralMsgResponse) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lbd
            r0 = r11
            T r0 = r0.data
            com.bilibili.playset.api.PlaySetPageData r0 = (com.bilibili.playset.api.PlaySetPageData) r0
            r11 = r0
            goto Lc0
        Lbd:
            r0 = 0
            r11 = r0
        Lc0:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.c(long, int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r6, int r8, int r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r0 = r10
            boolean r0 = r0 instanceof com.bilibili.playset.api.PlaySetApiKt$getFullAmountIds$1
            if (r0 == 0) goto L2f
            r0 = r10
            com.bilibili.playset.api.PlaySetApiKt$getFullAmountIds$1 r0 = (com.bilibili.playset.api.PlaySetApiKt$getFullAmountIds$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r12
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r10 = r0
            goto L3a
        L2f:
            com.bilibili.playset.api.PlaySetApiKt$getFullAmountIds$1 r0 = new com.bilibili.playset.api.PlaySetApiKt$getFullAmountIds$1
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r10 = r0
        L3a:
            r0 = r10
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r10
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6e
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L64
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r12
            r10 = r0
            goto La2
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.playset.api.PlaySetService> r0 = com.bilibili.playset.api.PlaySetService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
            com.bilibili.playset.api.PlaySetService r0 = (com.bilibili.playset.api.PlaySetService) r0
            r1 = r6
            r2 = r8
            r3 = r9
            com.bilibili.okretro.call.BiliCall r0 = r0.getFullAmountIds(r1, r2, r3)
            r12 = r0
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r12
            r1 = r10
            java.lang.Object r0 = com.bilibili.lib.coroutineextension.BiliCallExtKt.getResponse(r0, r1)
            r12 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            r1 = r13
            if (r0 != r1) goto La2
            r0 = r13
            return r0
        La2:
            r0 = r10
            com.bilibili.playset.api.GeneralMsgResponse r0 = (com.bilibili.playset.api.GeneralMsgResponse) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Lbb
            r0 = r10
            T r0 = r0.data
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            goto Lbe
        Lbb:
            r0 = 0
            r10 = r0
        Lbe:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.d(long, int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.playset.api.PlaySetApiKt$queryClearOfflineState$1
            if (r0 == 0) goto L29
            r0 = r6
            com.bilibili.playset.api.PlaySetApiKt$queryClearOfflineState$1 r0 = (com.bilibili.playset.api.PlaySetApiKt$queryClearOfflineState$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L32
        L29:
            com.bilibili.playset.api.PlaySetApiKt$queryClearOfflineState$1 r0 = new com.bilibili.playset.api.PlaySetApiKt$queryClearOfflineState$1
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L32:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L60
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r6 = r0
            goto L8f
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.playset.api.PlaySetService> r0 = com.bilibili.playset.api.PlaySetService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
            com.bilibili.playset.api.PlaySetService r0 = (com.bilibili.playset.api.PlaySetService) r0
            r1 = r4
            com.bilibili.okretro.call.BiliCall r0 = r0.queryClearOfflineState(r1)
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r6
            java.lang.Object r0 = com.bilibili.lib.coroutineextension.BiliCallExtKt.getResponse(r0, r1)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L8f
            r0 = r9
            return r0
        L8f:
            r0 = r6
            com.bilibili.playset.api.GeneralMsgResponse r0 = (com.bilibili.playset.api.GeneralMsgResponse) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La3
            r0 = r6
            T r0 = r0.data
            java.lang.Integer r0 = (java.lang.Integer) r0
            r6 = r0
            goto La5
        La3:
            r0 = 0
            r6 = r0
        La5:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.e(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public static final Object f(long j7, @NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        Object response = BiliCallExtKt.getResponse(((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).sortPlaysetMedias(str, Boxing.boxLong(j7)), continuationImpl);
        return response == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? response : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.playset.api.PlaySetApiKt$tryClearOfflineMedias$1
            if (r0 == 0) goto L29
            r0 = r6
            com.bilibili.playset.api.PlaySetApiKt$tryClearOfflineMedias$1 r0 = (com.bilibili.playset.api.PlaySetApiKt$tryClearOfflineMedias$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L32
        L29:
            com.bilibili.playset.api.PlaySetApiKt$tryClearOfflineMedias$1 r0 = new com.bilibili.playset.api.PlaySetApiKt$tryClearOfflineMedias$1
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L32:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L60
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r6 = r0
            goto L8f
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.playset.api.PlaySetService> r0 = com.bilibili.playset.api.PlaySetService.class
            java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
            com.bilibili.playset.api.PlaySetService r0 = (com.bilibili.playset.api.PlaySetService) r0
            r1 = r4
            com.bilibili.okretro.call.BiliCall r0 = r0.clearOfflineMedias(r1)
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r6
            java.lang.Object r0 = com.bilibili.lib.coroutineextension.BiliCallExtKt.getResponse(r0, r1)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L8f
            r0 = r9
            return r0
        L8f:
            r0 = r6
            com.bilibili.playset.api.GeneralMsgResponse r0 = (com.bilibili.playset.api.GeneralMsgResponse) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La3
            r0 = r6
            T r0 = r0.data
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            goto La5
        La3:
            r0 = 0
            r6 = r0
        La5:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.i.g(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
