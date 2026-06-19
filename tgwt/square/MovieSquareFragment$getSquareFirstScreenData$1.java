package com.bilibili.tgwt.square;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$getSquareFirstScreenData$1.class */
public final class MovieSquareFragment$getSquareFirstScreenData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MovieSquareFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSquareFragment$getSquareFirstScreenData$1(MovieSquareFragment movieSquareFragment, Continuation<? super MovieSquareFragment$getSquareFirstScreenData$1> continuation) {
        super(2, continuation);
        this.this$0 = movieSquareFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieSquareFragment$getSquareFirstScreenData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        long jLongValue;
        List<Long> listA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = BD0.b.f709a;
            MovieSquareFragment movieSquareFragment = this.this$0;
            String str = movieSquareFragment.f112060q;
            String str2 = movieSquareFragment.f112059p;
            this.label = 1;
            Object squareFirstScreenData = ((BD0.c) BD0.b.f709a.getValue()).getSquareFirstScreenData(str, 0L, 0L, "", 0, "0", 0L, str2, this);
            obj = squareFirstScreenData;
            if (squareFirstScreenData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        MovieSquareFragment movieSquareFragment2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            movieSquareFragment2.f112054k = false;
            SwipeRefreshLayout swipeRefreshLayout = movieSquareFragment2.h;
            SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                swipeRefreshLayout2 = null;
            }
            swipeRefreshLayout2.setEnabled(true);
            SwipeRefreshLayout swipeRefreshLayout3 = movieSquareFragment2.h;
            if (swipeRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                swipeRefreshLayout3 = null;
            }
            swipeRefreshLayout3.setRefreshing(false);
            EmptyStateView emptyStateView = movieSquareFragment2.f112046b;
            if (emptyStateView != null) {
                int i8 = EmptyStateView.f73157k;
                emptyStateView.b(2, false);
            }
            movieSquareFragment2.f112053j.clear();
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                HomeRecommendPage homeRecommendPage = (HomeRecommendPage) ((BiliApiResponse.Success) biliApiResponse).getData();
                movieSquareFragment2.f112054k = false;
                SwipeRefreshLayout swipeRefreshLayout4 = movieSquareFragment2.h;
                SwipeRefreshLayout swipeRefreshLayout5 = swipeRefreshLayout4;
                if (swipeRefreshLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                    swipeRefreshLayout5 = null;
                }
                swipeRefreshLayout5.setEnabled(true);
                SwipeRefreshLayout swipeRefreshLayout6 = movieSquareFragment2.h;
                SwipeRefreshLayout swipeRefreshLayout7 = swipeRefreshLayout6;
                if (swipeRefreshLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                    swipeRefreshLayout7 = null;
                }
                swipeRefreshLayout7.setRefreshing(false);
                RecommendFeed recommendFeed = homeRecommendPage.f112032b;
                movieSquareFragment2.f112055l = recommendFeed != null ? recommendFeed.f112080c : false;
                movieSquareFragment2.f112056m = String.valueOf(recommendFeed != null ? Boxing.boxLong(recommendFeed.f112078a) : null);
                RecommendFeed recommendFeed2 = homeRecommendPage.f112032b;
                if (((recommendFeed2 == null || (listA = recommendFeed2.a()) == null) ? 0 : listA.size()) == 0) {
                    jLongValue = 0;
                } else {
                    jLongValue = 0;
                    if (recommendFeed2 != null) {
                        List<Long> listA2 = recommendFeed2.a();
                        jLongValue = 0;
                        if (listA2 != null) {
                            jLongValue = listA2.get(0).longValue();
                        }
                    }
                }
                movieSquareFragment2.f112057n = jLongValue;
                EmptyStateView emptyStateView2 = movieSquareFragment2.f112046b;
                if (emptyStateView2 != null) {
                    emptyStateView2.a();
                }
                movieSquareFragment2.f112053j.clear();
                ArrayList<UIComponent<?>> arrayList = movieSquareFragment2.f112053j;
                h hVar = movieSquareFragment2.f112064u;
                h hVar2 = hVar;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("converter");
                    hVar2 = null;
                }
                CollectionsKt.addAll(arrayList, hVar2.b(homeRecommendPage.f112031a));
                if (!movieSquareFragment2.f112055l) {
                    ArrayList<UIComponent<?>> arrayList2 = movieSquareFragment2.f112053j;
                    h hVar3 = movieSquareFragment2.f112064u;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("converter");
                        hVar3 = null;
                    }
                    CollectionsKt.addAll(arrayList2, hVar3.b(CollectionsKt.listOf(new RecommendModule(movieSquareFragment2.getString(2131836313), null, "no_more", null, null, null, null, null, 250))));
                }
                movieSquareFragment2.f112052i.notifyDataSetChanged();
                MovieSquareFragment.nf(movieSquareFragment2);
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            movieSquareFragment2.f112054k = false;
            SwipeRefreshLayout swipeRefreshLayout8 = movieSquareFragment2.h;
            SwipeRefreshLayout swipeRefreshLayout9 = swipeRefreshLayout8;
            if (swipeRefreshLayout8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                swipeRefreshLayout9 = null;
            }
            swipeRefreshLayout9.setEnabled(true);
            SwipeRefreshLayout swipeRefreshLayout10 = movieSquareFragment2.h;
            if (swipeRefreshLayout10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
                swipeRefreshLayout10 = null;
            }
            swipeRefreshLayout10.setRefreshing(false);
            EmptyStateView emptyStateView3 = movieSquareFragment2.f112046b;
            if (emptyStateView3 != null) {
                int i9 = EmptyStateView.f73157k;
                emptyStateView3.b(2, false);
            }
            movieSquareFragment2.f112053j.clear();
        }
        movieSquareFragment2.f112052i.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
