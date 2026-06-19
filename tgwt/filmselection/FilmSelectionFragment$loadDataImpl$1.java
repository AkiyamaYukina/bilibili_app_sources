package com.bilibili.tgwt.filmselection;

import android.os.Bundle;
import com.bilibili.api.BiliApiException;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.MovieCardListVo;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmSelectionFragment$loadDataImpl$1.class */
final class FilmSelectionFragment$loadDataImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $curPage;
    final Function1<Throwable, Unit> $onError;
    final Function1<MovieCardListVo, Unit> $onSuccess;
    int label;
    final FilmSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilmSelectionFragment$loadDataImpl$1(FilmSelectionFragment filmSelectionFragment, int i7, Function1<? super MovieCardListVo, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super FilmSelectionFragment$loadDataImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = filmSelectionFragment;
        this.$curPage = i7;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilmSelectionFragment$loadDataImpl$1(this.this$0, this.$curPage, this.$onSuccess, this.$onError, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String string;
        Integer intOrNull;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = BD0.b.f709a;
            Bundle arguments = this.this$0.getArguments();
            String string2 = arguments != null ? arguments.getString("tabType") : null;
            Bundle arguments2 = this.this$0.getArguments();
            Integer numBoxInt = Boxing.boxInt((arguments2 == null || (string = arguments2.getString("tabChildType")) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue());
            String str = this.this$0.f111166i;
            int i8 = this.$curPage;
            this.label = 1;
            Object filmSelectionList = ((BD0.c) BD0.b.f709a.getValue()).getFilmSelectionList(string2, numBoxInt, str, i8, 10, this);
            obj = filmSelectionList;
            if (filmSelectionList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        int i9 = this.$curPage;
        FilmSelectionFragment filmSelectionFragment = this.this$0;
        Function1<MovieCardListVo, Unit> function1 = this.$onSuccess;
        Function1<Throwable, Unit> function12 = this.$onError;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            if (i9 == 1) {
                EmptyStateView emptyStateViewJf = filmSelectionFragment.jf();
                int i10 = EmptyStateView.f73157k;
                emptyStateViewJf.b(2, false);
            }
            function12.invoke(biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            if (i9 == 1) {
                EmptyStateView emptyStateViewJf2 = filmSelectionFragment.jf();
                int i11 = EmptyStateView.f73157k;
                emptyStateViewJf2.b(2, false);
            }
            function12.invoke(exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            MovieCardListVo movieCardListVo = (MovieCardListVo) ((BiliApiResponse.Success) biliApiResponse).getData();
            if (i9 == 1) {
                List<MovieCardListVo.Item> list = movieCardListVo.f110837b;
                if (list == null || list.isEmpty()) {
                    EmptyStateView emptyStateViewJf3 = filmSelectionFragment.jf();
                    int i12 = EmptyStateView.f73157k;
                    emptyStateViewJf3.b(3, false);
                } else {
                    filmSelectionFragment.jf().a();
                }
            }
            MovieCardListVo.Page page = movieCardListVo.f110836a;
            String strA = null;
            if (page != null) {
                strA = page.a();
            }
            filmSelectionFragment.f111166i = strA;
            function1.invoke(movieCardListVo);
        }
        return Unit.INSTANCE;
    }
}
