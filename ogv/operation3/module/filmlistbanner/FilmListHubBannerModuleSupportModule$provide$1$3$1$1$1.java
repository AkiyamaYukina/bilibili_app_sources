package com.bilibili.ogv.operation3.module.filmlistbanner;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1.class */
final class FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1(PagerState pagerState, Continuation<? super FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1(this.$pagerState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L2b
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L24
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L1a
            goto L2b
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L41
        L2b:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
        L2f:
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = 3000(0xbb8, double:1.482E-320)
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r11
            if (r0 != r1) goto L41
            r0 = r11
            return r0
        L41:
            r0 = r8
            androidx.compose.foundation.pager.PagerState r0 = r0.$pagerState
            boolean r0 = r0.isScrollInProgress()
            if (r0 != 0) goto L2f
            r0 = r8
            androidx.compose.foundation.pager.PagerState r0 = r0.$pagerState
            int r0 = r0.getPageCount()
            r1 = 1
            if (r0 <= r1) goto L2f
            r0 = r8
            androidx.compose.foundation.pager.PagerState r0 = r0.$pagerState
            r9 = r0
            r0 = r9
            int r0 = r0.getCurrentPage()
            r10 = r0
            r0 = r8
            r1 = 2
            r0.label = r1
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = 0
            r3 = 0
            r4 = r8
            r5 = 6
            r6 = 0
            java.lang.Object r0 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r0, r1, r2, r3, r4, r5, r6)
            r1 = r11
            if (r0 != r1) goto L2f
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.filmlistbanner.FilmListHubBannerModuleSupportModule$provide$1$3$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
