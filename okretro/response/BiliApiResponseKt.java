package com.bilibili.okretro.response;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponseKt.class */
public final class BiliApiResponseKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final <T> Object asResult(@NotNull BiliApiResponse<? extends T> biliApiResponse) throws NoWhenBranchMatchedException {
        Object obj;
        Object objCreateFailure;
        Result.Companion companion = Result.Companion;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            objCreateFailure = ResultKt.createFailure(new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = Result.constructor-impl(((BiliApiResponse.Success) biliApiResponse).getData());
                return obj;
            }
            objCreateFailure = ResultKt.createFailure(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        }
        obj = Result.constructor-impl(objCreateFailure);
        return obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final <T, R> R fold(@NotNull BiliApiResponse<? extends T> biliApiResponse, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super Exception, ? extends R> function12) throws NoWhenBranchMatchedException {
        Object objInvoke;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            objInvoke = function12.invoke(new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            objInvoke = function12.invoke(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = function1.invoke(((BiliApiResponse.Success) biliApiResponse).getData());
        }
        return (R) objInvoke;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final <T, R> R fold(@NotNull BiliApiResponse<? extends T> biliApiResponse, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super BiliApiResponse.BusinessFailure, ? extends R> function12, @NotNull Function1<? super Exception, ? extends R> function13) throws NoWhenBranchMatchedException {
        Object objInvoke;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            objInvoke = function12.invoke(biliApiResponse);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            objInvoke = function13.invoke(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = function1.invoke(((BiliApiResponse.Success) biliApiResponse).getData());
        }
        return (R) objInvoke;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final <T, R> BiliApiResponse<R> map(@NotNull BiliApiResponse<? extends T> biliApiResponse, @NotNull Function1<? super T, ? extends R> function1) throws NoWhenBranchMatchedException {
        if (!(biliApiResponse instanceof BiliApiResponse.BusinessFailure) && !(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            biliApiResponse = new BiliApiResponse.Success(function1.invoke(((BiliApiResponse.Success) biliApiResponse).getData()));
        }
        return (BiliApiResponse<R>) biliApiResponse;
    }
}
