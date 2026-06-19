package com.bilibili.tgwt.search;

import BD0.c;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.MovieCardListVo;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/TogetherWatchSearchResultFragment$loadDataImpl$1.class */
final class TogetherWatchSearchResultFragment$loadDataImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $curPage;
    final Function1<Throwable, Unit> $onError;
    final Function1<MovieCardListVo, Unit> $onSuccess;
    int label;
    final TogetherWatchSearchResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TogetherWatchSearchResultFragment$loadDataImpl$1(TogetherWatchSearchResultFragment togetherWatchSearchResultFragment, int i7, Function1<? super MovieCardListVo, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super TogetherWatchSearchResultFragment$loadDataImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchSearchResultFragment;
        this.$curPage = i7;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchSearchResultFragment$loadDataImpl$1(this.this$0, this.$curPage, this.$onSuccess, this.$onError, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = BD0.b.f709a;
            String str = this.this$0.h;
            int i8 = this.$curPage;
            this.label = 1;
            Object objSearch = ((c) BD0.b.f709a.getValue()).search(str, i8, 10, this);
            obj = objSearch;
            if (objSearch == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        Function1<MovieCardListVo, Unit> function1 = this.$onSuccess;
        Function1<Throwable, Unit> function12 = this.$onError;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            function12.invoke(new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            function12.invoke(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(((BiliApiResponse.Success) biliApiResponse).getData());
        }
        return Unit.INSTANCE;
    }
}
