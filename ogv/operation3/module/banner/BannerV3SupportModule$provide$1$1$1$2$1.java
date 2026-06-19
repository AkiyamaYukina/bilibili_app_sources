package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/BannerV3SupportModule$provide$1$1$1$2$1.class */
final class BannerV3SupportModule$provide$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<a> $displayableBanner;
    final int $initPage;
    final PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerV3SupportModule$provide$1$1$1$2$1(List<a> list, PagerState pagerState, int i7, Continuation<? super BannerV3SupportModule$provide$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.$displayableBanner = list;
        this.$pagerState = pagerState;
        this.$initPage = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerV3SupportModule$provide$1$1$1$2$1(this.$displayableBanner, this.$pagerState, this.$initPage, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$displayableBanner.size() > 1) {
                PagerState pagerState = this.$pagerState;
                int i8 = this.$initPage;
                this.label = 1;
                if (PagerState.scrollToPage$default(pagerState, i8 + 1, 0.0f, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
