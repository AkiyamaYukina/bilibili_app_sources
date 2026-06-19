package com.bilibili.ogv.infra.account;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/account/b.class */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.ogv.infra.account.EnsureLoginKt$ensureLogin$1
            if (r0 == 0) goto L29
            r0 = r5
            com.bilibili.ogv.infra.account.EnsureLoginKt$ensureLogin$1 r0 = (com.bilibili.ogv.infra.account.EnsureLoginKt$ensureLogin$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r6 = r0
            r0 = r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r8
            r1 = r6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r5 = r0
            goto L32
        L29:
            com.bilibili.ogv.infra.account.EnsureLoginKt$ensureLogin$1 r0 = new com.bilibili.ogv.infra.account.EnsureLoginKt$ensureLogin$1
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L32:
            r0 = r5
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r5
            int r0 = r0.label
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L62
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L58
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r4 = r0
            goto L99
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.lib.accounts.BiliAccounts r0 = com.bilibili.ogv.infra.account.a.f67852b
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L75
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L75:
            java.lang.String r0 = "activity://main/login/"
            com.bilibili.lib.blrouter.RouteRequest r0 = com.bilibili.lib.blrouter.RouteRequestKt.toRouteRequest(r0)
            r8 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r4
            androidx.activity.result.ActivityResultRegistry r1 = r1.getActivityResultRegistry()
            r2 = r5
            java.lang.Object r0 = Qj0.g.a(r0, r1, r2)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = r9
            if (r0 != r1) goto L99
            r0 = r9
            return r0
        L99:
            r0 = r4
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto Lad
            r0 = r4
            int r0 = r0.getResultCode()
            r1 = -1
            if (r0 != r1) goto Lad
            goto Laf
        Lad:
            r0 = 0
            r7 = r0
        Laf:
            r0 = r7
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.account.b.a(androidx.fragment.app.FragmentActivity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
