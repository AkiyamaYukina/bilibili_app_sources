package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/h.class */
@StabilityInferred(parameters = 1)
@Module
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[PHI: r8 r11
  0x0076: PHI (r8v2 androidx.compose.foundation.pager.PagerState) = (r8v1 androidx.compose.foundation.pager.PagerState), (r8v3 androidx.compose.foundation.pager.PagerState) binds: [B:18:0x0070, B:23:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r11v2 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1) = 
  (r11v1 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1)
  (r11v3 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1)
 binds: [B:18:0x0070, B:23:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[PHI: r9 r12
  0x0094: PHI (r9v4 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1) = 
  (r9v3 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1)
  (r9v2 com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1)
 binds: [B:20:0x008e, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r12v1 androidx.compose.foundation.pager.PagerState) = (r12v0 androidx.compose.foundation.pager.PagerState), (r12v2 androidx.compose.foundation.pager.PagerState) binds: [B:20:0x008e, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:19:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.pager.PagerState r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1
            if (r0 == 0) goto L25
            r0 = r9
            com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1 r0 = (com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r9 = r0
            goto L2e
        L25:
            com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1 r0 = new com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule$provide$1$startLoop$1
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r9 = r0
        L2e:
            r0 = r9
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L70
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L60
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L56
            r0 = r9
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.PagerState r0 = (androidx.compose.foundation.pager.PagerState) r0
            r8 = r0
            goto L70
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.PagerState r0 = (androidx.compose.foundation.pager.PagerState) r0
            r12 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L94
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r11 = r0
        L76:
            r0 = r11
            r1 = r8
            r0.L$0 = r1
            r0 = r11
            r1 = 1
            r0.label = r1
            r0 = r11
            r9 = r0
            r0 = r8
            r12 = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            r1 = r11
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r13
            if (r0 != r1) goto L94
            goto Lc2
        L94:
            r0 = r12
            int r0 = r0.getCurrentPage()
            r10 = r0
            r0 = r9
            r1 = r12
            r0.L$0 = r1
            r0 = r9
            r1 = r10
            r0.I$0 = r1
            r0 = r9
            r1 = 2
            r0.label = r1
            r0 = r9
            r11 = r0
            r0 = r12
            r8 = r0
            r0 = r12
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = 0
            r3 = 0
            r4 = r9
            r5 = 6
            r6 = 0
            java.lang.Object r0 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r0, r1, r2, r3, r4, r5, r6)
            r1 = r13
            if (r0 != r1) goto L76
        Lc2:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.banner.h.a(androidx.compose.foundation.pager.PagerState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
