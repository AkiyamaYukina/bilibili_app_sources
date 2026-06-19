package com.bilibili.playset.widget.favorite;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/g.class */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.playset.widget.favorite.FavoriteApiHelperKt$suspendRunCatching$1
            if (r0 == 0) goto L25
            r0 = r5
            com.bilibili.playset.widget.favorite.FavoriteApiHelperKt$suspendRunCatching$1 r0 = (com.bilibili.playset.widget.favorite.FavoriteApiHelperKt$suspendRunCatching$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r6 = r0
            r0 = r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r5 = r0
            goto L2e
        L25:
            com.bilibili.playset.widget.favorite.FavoriteApiHelperKt$suspendRunCatching$1 r0 = new com.bilibili.playset.widget.favorite.FavoriteApiHelperKt$suspendRunCatching$1
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.result
            r7 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L61
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L53
            r0 = r7
            r4 = r0
            goto L81
        L4f:
            r4 = move-exception
            goto L89
        L53:
            r4 = move-exception
            goto L97
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L53
            r7 = r0
            r0 = r5
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L53
            r0 = r4
            r1 = r5
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L53
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = r8
            if (r0 != r1) goto L81
            r0 = r8
            return r0
        L81:
            r0 = r4
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L53
            r4 = r0
            goto L95
        L89:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r5 = r0
            r0 = r4
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r4 = r0
        L95:
            r0 = r4
            return r0
        L97:
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.g.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
