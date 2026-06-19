package com.bilibili.pegasus.components.interest.ui.common;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/i.class */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r6, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.data.interestchoose.InterestChooseGuide r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$1 r0 = (com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$1) r0
            r13 = r0
            r0 = r13
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r13
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r13
            r8 = r0
            goto L32
        L29:
            com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$1 r0 = new com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$1
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
        L32:
            r0 = r8
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L60
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r13
            r6 = r0
            goto L9a
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            java.lang.String r1 = "dd_interest_guide_close_time_ms"
            java.lang.String r2 = "10000"
            java.lang.String r0 = r0.dd(r1, r2)
            r1 = 10000(0x2710, double:4.9407E-320)
            long r0 = com.bilibili.adcommon.utils.ext.AdExtensions.toLongOrDefault(r0, r1)
            r11 = r0
            com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$2 r0 = new com.bilibili.pegasus.components.interest.ui.common.InterestChooseGuideTipsKt$displayInterestChooseGuidance$2
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r6
            r2 = r8
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r0, r1, r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r14
            if (r0 != r1) goto L9a
            r0 = r14
            return r0
        L9a:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "[Interest]InterestChooseGuideTips"
            java.lang.String r1 = "timeout"
            tv.danmaku.android.log.BLog.i(r0, r1)
            com.bilibili.pegasus.components.interest.ui.reporter.InterestTipsCloseType r0 = com.bilibili.pegasus.components.interest.ui.reporter.InterestTipsCloseType.AUTO
            com.bilibili.pegasus.components.interest.e.x(r0)
        Lb0:
            r0 = r6
            if (r0 == 0) goto Lbd
            r0 = r6
            boolean r0 = r0.booleanValue()
            r10 = r0
            goto Lc0
        Lbd:
            r0 = 0
            r10 = r0
        Lc0:
            r0 = r10
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.common.i.a(androidx.fragment.app.Fragment, com.bilibili.pegasus.data.interestchoose.InterestChooseGuide, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
