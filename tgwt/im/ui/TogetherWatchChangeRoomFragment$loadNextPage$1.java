package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1530c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ogv.pub.chat.ChangeRoomInitial;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.square.HomeRecommendPage;
import com.bilibili.tgwt.square.RecommendFeed;
import com.bilibili.tgwt.square.RecommendModule;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment$loadNextPage$1.class */
final class TogetherWatchChangeRoomFragment$loadNextPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $fullScreen;
    int label;
    final TogetherWatchChangeRoomFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChangeRoomFragment$loadNextPage$1(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment, String str, Continuation<? super TogetherWatchChangeRoomFragment$loadNextPage$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchChangeRoomFragment;
        this.$fullScreen = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChangeRoomFragment$loadNextPage$1(this.this$0, this.$fullScreen, continuation);
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
            TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment = this.this$0;
            long j7 = togetherWatchChangeRoomFragment.f111282i;
            String str = togetherWatchChangeRoomFragment.h;
            String str2 = togetherWatchChangeRoomFragment.f111283j;
            ChangeRoomInitial changeRoomInitial = togetherWatchChangeRoomFragment.f111285l;
            ChangeRoomInitial changeRoomInitial2 = changeRoomInitial;
            if (changeRoomInitial == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initial");
                changeRoomInitial2 = null;
            }
            Long lBoxLong = Boxing.boxLong(changeRoomInitial2.f71479b);
            ChangeRoomInitial changeRoomInitial3 = this.this$0.f111285l;
            ChangeRoomInitial changeRoomInitial4 = changeRoomInitial3;
            if (changeRoomInitial3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initial");
                changeRoomInitial4 = null;
            }
            int i8 = changeRoomInitial4.f71480c;
            String str3 = this.$fullScreen;
            ChangeRoomInitial changeRoomInitial5 = this.this$0.f111285l;
            ChangeRoomInitial changeRoomInitial6 = changeRoomInitial5;
            if (changeRoomInitial5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initial");
                changeRoomInitial6 = null;
            }
            Long lBoxLong2 = Boxing.boxLong(changeRoomInitial6.f71478a);
            this.label = 1;
            Object squareFeeds = ((BD0.c) BD0.b.f709a.getValue()).getSquareFeeds(j7, str, str2, lBoxLong, i8, str3, lBoxLong2, "0.0.0.0", this);
            obj = squareFeeds;
            if (squareFeeds == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                HomeRecommendPage homeRecommendPage = (HomeRecommendPage) ((BiliApiResponse.Success) biliApiResponse).getData();
                togetherWatchChangeRoomFragment2.f111280f = false;
                RecommendFeed recommendFeed = homeRecommendPage.f112032b;
                togetherWatchChangeRoomFragment2.f111281g = recommendFeed != null ? recommendFeed.f112080c : false;
                togetherWatchChangeRoomFragment2.h = String.valueOf(recommendFeed != null ? Boxing.boxLong(recommendFeed.f112078a) : null);
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
                togetherWatchChangeRoomFragment2.f111282i = jLongValue;
                ArrayList<UIComponent<?>> arrayList = togetherWatchChangeRoomFragment2.f111279e;
                com.bilibili.tgwt.square.h hVar = togetherWatchChangeRoomFragment2.f111288o;
                com.bilibili.tgwt.square.h hVar2 = hVar;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("converter");
                    hVar2 = null;
                }
                CollectionsKt.addAll(arrayList, hVar2.b(homeRecommendPage.f112031a));
                if (!togetherWatchChangeRoomFragment2.f111281g) {
                    ArrayList<UIComponent<?>> arrayList2 = togetherWatchChangeRoomFragment2.f111279e;
                    com.bilibili.tgwt.square.h hVar3 = togetherWatchChangeRoomFragment2.f111288o;
                    com.bilibili.tgwt.square.h hVar4 = hVar3;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("converter");
                        hVar4 = null;
                    }
                    CollectionsKt.addAll(arrayList2, hVar4.b(CollectionsKt.listOf(new RecommendModule(togetherWatchChangeRoomFragment2.getString(2131836313), null, "no_more", null, null, null, null, null, 250))));
                }
                AbstractC1530c abstractC1530c = togetherWatchChangeRoomFragment2.f111277c;
                AbstractC1530c abstractC1530c2 = abstractC1530c;
                if (abstractC1530c == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    abstractC1530c2 = null;
                }
                RecyclerView.LayoutManager layoutManager = abstractC1530c2.f2445B.getLayoutManager();
                GridLayoutManager gridLayoutManager = null;
                if (layoutManager instanceof GridLayoutManager) {
                    gridLayoutManager = (GridLayoutManager) layoutManager;
                }
                int iFindLastVisibleItemPosition = gridLayoutManager != null ? gridLayoutManager.findLastVisibleItemPosition() : -1;
                int size = homeRecommendPage.f112031a.size();
                if (iFindLastVisibleItemPosition >= 0 && size > 0) {
                    togetherWatchChangeRoomFragment2.f111278d.notifyItemRangeInserted(iFindLastVisibleItemPosition + 1, size);
                }
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
        }
        togetherWatchChangeRoomFragment2.f111280f = false;
        return Unit.INSTANCE;
    }
}
