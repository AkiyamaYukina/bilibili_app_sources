package com.bilibili.tgwt.im.ui;

import HD0.Q;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ogv.pub.chat.ChangeRoomInitial;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.square.HomeRecommendPage;
import com.bilibili.tgwt.square.PageHeader;
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
import sl0.C8597a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1.class */
public final class TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C8597a $data;
    final String $fullScreen;
    final String $showTitle;
    int label;
    final TogetherWatchChangeRoomFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment, C8597a c8597a, String str, String str2, Continuation<? super TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchChangeRoomFragment;
        this.$data = c8597a;
        this.$showTitle = str;
        this.$fullScreen = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1(this.this$0, this.$data, this.$showTitle, this.$fullScreen, continuation);
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
            String str = togetherWatchChangeRoomFragment.f111283j;
            ChangeRoomInitial changeRoomInitial = togetherWatchChangeRoomFragment.f111285l;
            ChangeRoomInitial changeRoomInitial2 = changeRoomInitial;
            if (changeRoomInitial == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initial");
                changeRoomInitial2 = null;
            }
            Long lBoxLong = Boxing.boxLong(changeRoomInitial2.f71479b);
            Long lBoxLong2 = Boxing.boxLong(this.$data.f127282a);
            String str2 = this.$showTitle;
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
            Long lBoxLong3 = Boxing.boxLong(changeRoomInitial6.f71478a);
            this.label = 1;
            Object squareFirstScreenData = ((BD0.c) BD0.b.f709a.getValue()).getSquareFirstScreenData(str, lBoxLong, lBoxLong2, str2, i8, str3, lBoxLong3, "0.0.0.0", this);
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
        TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            togetherWatchChangeRoomFragment2.f111280f = false;
            EmptyStateView emptyStateView = togetherWatchChangeRoomFragment2.f111276b;
            if (emptyStateView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
                emptyStateView = null;
            }
            int i9 = EmptyStateView.f73157k;
            emptyStateView.b(2, false);
            togetherWatchChangeRoomFragment2.f111279e.clear();
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                HomeRecommendPage homeRecommendPage = (HomeRecommendPage) ((BiliApiResponse.Success) biliApiResponse).getData();
                togetherWatchChangeRoomFragment2.f111280f = false;
                RecommendFeed recommendFeed = homeRecommendPage.f112032b;
                togetherWatchChangeRoomFragment2.f111281g = recommendFeed != null ? recommendFeed.f112080c : false;
                Q q7 = togetherWatchChangeRoomFragment2.f111284k;
                Q q8 = q7;
                if (q7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    q8 = null;
                }
                PageHeader pageHeaderA = homeRecommendPage.a();
                q8.getClass();
                boolean z6 = pageHeaderA != null;
                if (z6 != q8.h) {
                    q8.h = z6;
                    q8.notifyPropertyChanged(281);
                }
                if (pageHeaderA != null) {
                    String str4 = q8.f8266d;
                    String str5 = pageHeaderA.f112073d;
                    if (!Intrinsics.areEqual(str5, str4)) {
                        q8.f8266d = str5;
                        q8.notifyPropertyChanged(277);
                    }
                    String str6 = q8.f8267e;
                    String str7 = pageHeaderA.f112070a;
                    if (!Intrinsics.areEqual(str7, str6)) {
                        q8.f8267e = str7;
                        q8.notifyPropertyChanged(280);
                    }
                    String strA = pageHeaderA.a();
                    if (!Intrinsics.areEqual(strA, q8.f8268f)) {
                        q8.f8268f = strA;
                        q8.notifyPropertyChanged(279);
                    }
                    String str8 = q8.f8269g;
                    String str9 = pageHeaderA.f112072c;
                    if (!Intrinsics.areEqual(str9, str8)) {
                        q8.f8269g = str9;
                        q8.notifyPropertyChanged(278);
                    }
                }
                RecommendFeed recommendFeed2 = homeRecommendPage.f112032b;
                togetherWatchChangeRoomFragment2.h = String.valueOf(recommendFeed2 != null ? Boxing.boxLong(recommendFeed2.f112078a) : null);
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
                EmptyStateView emptyStateView2 = togetherWatchChangeRoomFragment2.f111276b;
                EmptyStateView emptyStateView3 = emptyStateView2;
                if (emptyStateView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
                    emptyStateView3 = null;
                }
                emptyStateView3.a();
                togetherWatchChangeRoomFragment2.f111279e.clear();
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
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("converter");
                        hVar3 = null;
                    }
                    CollectionsKt.addAll(arrayList2, hVar3.b(CollectionsKt.listOf(new RecommendModule(togetherWatchChangeRoomFragment2.getString(2131836313), null, "no_more", null, null, null, null, null, 250))));
                }
                togetherWatchChangeRoomFragment2.f111278d.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            togetherWatchChangeRoomFragment2.f111280f = false;
            EmptyStateView emptyStateView4 = togetherWatchChangeRoomFragment2.f111276b;
            if (emptyStateView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
                emptyStateView4 = null;
            }
            int i10 = EmptyStateView.f73157k;
            emptyStateView4.b(2, false);
            togetherWatchChangeRoomFragment2.f111279e.clear();
        }
        togetherWatchChangeRoomFragment2.f111278d.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
