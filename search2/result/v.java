package com.bilibili.search2.result;

import androidx.compose.runtime.internal.StabilityInferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/v.class */
@StabilityInferred(parameters = 1)
public final class v {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.search2.result.SearchShortUrlDataLoader$searchShortLinkSuspend$1
            if (r0 == 0) goto L29
            r0 = r9
            com.bilibili.search2.result.SearchShortUrlDataLoader$searchShortLinkSuspend$1 r0 = (com.bilibili.search2.result.SearchShortUrlDataLoader$searchShortLinkSuspend$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r9 = r0
            goto L33
        L29:
            com.bilibili.search2.result.SearchShortUrlDataLoader$searchShortLinkSuspend$1 r0 = new com.bilibili.search2.result.SearchShortUrlDataLoader$searchShortLinkSuspend$1
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            r9 = r0
        L33:
            r0 = r9
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r0 = r12
            r8 = r0
            goto La2
        L5a:
            r8 = move-exception
            goto Lb5
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            com.bapis.bilibili.app.search.v2.SearchShortUrlReq$b r0 = com.bapis.bilibili.app.search.v2.SearchShortUrlReq.newBuilder()
            r1 = r8
            com.bapis.bilibili.app.search.v2.SearchShortUrlReq$b r0 = r0.setShortUrl(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.bapis.bilibili.app.search.v2.SearchShortUrlReq r0 = (com.bapis.bilibili.app.search.v2.SearchShortUrlReq) r0
            r12 = r0
            com.bapis.bilibili.app.search.v2.SearchMoss r0 = new com.bapis.bilibili.app.search.v2.SearchMoss     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r0 = r8
            r1 = r12
            r2 = r9
            java.lang.Object r0 = com.bapis.bilibili.app.search.v2.SearchMossKtxKt.suspendSearchShortUrl(r0, r1, r2)     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            r1 = r13
            if (r0 != r1) goto La2
            r0 = r13
            return r0
        La2:
            r0 = r8
            com.bapis.bilibili.app.search.v2.SearchShortUrlReply r0 = (com.bapis.bilibili.app.search.v2.SearchShortUrlReply) r0     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r9 = r0
            r0 = r11
            r8 = r0
            r0 = r9
            if (r0 == 0) goto Lb3
            r0 = r9
            java.lang.String r0 = r0.getOriginUrl()     // Catch: com.bilibili.lib.moss.api.MossException -> L5a
            r8 = r0
        Lb3:
            r0 = r8
            return r0
        Lb5:
            java.lang.String r0 = "SearchShortUrlDataLoader"
            r1 = r8
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.v.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
