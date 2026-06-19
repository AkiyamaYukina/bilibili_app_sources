package com.bilibili.playset.api;

import com.bilibili.lib.riskcontrol.BiliRiskException;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/p.class */
public final class p implements Function2<String, BiliRiskException, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f84099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliApiResponse.BusinessFailure f84100b;

    public p(CancellableContinuationImpl cancellableContinuationImpl, BiliApiResponse.BusinessFailure businessFailure) {
        this.f84099a = cancellableContinuationImpl;
        this.f84100b = businessFailure;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r7
            com.bilibili.lib.riskcontrol.BiliRiskException r0 = (com.bilibili.lib.riskcontrol.BiliRiskException) r0
            r6 = r0
            r0 = r5
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.f84099a
            r9 = r0
            r0 = r9
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L1e
            goto L8f
        L1e:
            r0 = r10
            if (r0 == 0) goto L3d
            r0 = r10
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L2e
            goto L3d
        L2e:
            r0 = r9
            r1 = r10
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
            goto L8f
        L3d:
            r0 = r5
            com.bilibili.okretro.response.BiliApiResponse$BusinessFailure r0 = r0.f84100b
            r10 = r0
            r0 = r6
            if (r0 == 0) goto L58
            r0 = r6
            java.lang.String r0 = r0.getErrorCode()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L58
            r0 = r7
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = r0
            goto L5e
        L58:
            r0 = r10
            int r0 = r0.getCode()
            r8 = r0
        L5e:
            r0 = r6
            if (r0 == 0) goto L6d
            r0 = r6
            java.lang.String r0 = r0.getErrorMsg()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L73
        L6d:
            r0 = r10
            java.lang.String r0 = r0.getMessage()
            r6 = r0
        L73:
            com.bilibili.api.BiliApiException r0 = new com.bilibili.api.BiliApiException
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            r7 = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r6 = r0
            r0 = r9
            r1 = r7
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
