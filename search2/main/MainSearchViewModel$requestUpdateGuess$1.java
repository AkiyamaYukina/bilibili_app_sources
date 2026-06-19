package com.bilibili.search2.main;

import com.bilibili.search2.api.SearchReferral;
import com.bilibili.search2.api.SearchSquareType;
import com.bilibili.search2.discover.SquareTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$requestUpdateGuess$1.class */
final class MainSearchViewModel$requestUpdateGuess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $accessKey;
    final String $avid;
    final String $eventId;
    final int $from;
    final String $query;
    final String $reason;
    final int $show;
    final String $userAct;
    int label;
    final MainSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainSearchViewModel$requestUpdateGuess$1(MainSearchViewModel mainSearchViewModel, String str, int i7, int i8, String str2, String str3, String str4, String str5, String str6, Continuation<? super MainSearchViewModel$requestUpdateGuess$1> continuation) {
        super(2, continuation);
        this.this$0 = mainSearchViewModel;
        this.$accessKey = str;
        this.$from = i7;
        this.$show = i8;
        this.$eventId = str2;
        this.$avid = str3;
        this.$query = str4;
        this.$userAct = str5;
        this.$reason = str6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainSearchViewModel$requestUpdateGuess$1(this.this$0, this.$accessKey, this.$from, this.$show, this.$eventId, this.$avid, this.$query, this.$userAct, this.$reason, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MainSearchViewModel mainSearchViewModel = this.this$0;
            String str = this.$accessKey;
            int i8 = this.$from;
            int i9 = this.$show;
            String str2 = this.$eventId;
            String str3 = this.$avid;
            String str4 = this.$query;
            String str5 = this.$userAct;
            String str6 = this.$reason;
            this.label = 1;
            Object objI0 = MainSearchViewModel.I0(mainSearchViewModel, str, i8, i9, str2, str3, str4, str5, str6, this);
            obj2 = objI0;
            if (objI0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        if (Result.isFailure-impl(obj2)) {
            obj2 = null;
        }
        SearchReferral searchReferral = (SearchReferral) obj2;
        if (searchReferral != null) {
            int i10 = this.$from;
            MainSearchViewModel mainSearchViewModel2 = this.this$0;
            List<SearchReferral.Guess> list = searchReferral.getList();
            if (list != null) {
                for (SearchReferral.Guess guess : list) {
                    guess.trackId = searchReferral.getTrackId();
                    guess.abtestId = searchReferral.getExpStr();
                    guess.from = i10;
                }
            }
            List<SearchSquareType> list2 = ((com.bilibili.search2.main.data.i) mainSearchViewModel2.f86734g.getValue()).f86820a;
            ArrayList arrayList = null;
            if (list2 != null) {
                List<SearchSquareType> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    SearchSquareType searchSquareType = (SearchSquareType) it.next();
                    SearchSquareType searchSquareType2 = searchSquareType;
                    if (Intrinsics.areEqual(SquareTypes.RECOMMEND.getType(), searchSquareType.getType())) {
                        searchSquareType2 = new SearchSquareType();
                        searchSquareType2.setType(searchSquareType.getType());
                        searchSquareType2.setTitle(searchSquareType.getTitle());
                        searchSquareType2.setTrackId(searchSquareType.getTrackId());
                        searchSquareType2.setExpStr(searchSquareType.getExpStr());
                        searchSquareType2.setList(list);
                        searchSquareType2.setSearchButtonOptWithSort(searchSquareType.getSearchButtonOptWithSort());
                        searchSquareType2.setSearchRankingMeta(searchSquareType.getSearchRankingMeta());
                        searchSquareType2.setNegativeFeedback(searchSquareType.getNegativeFeedback());
                    }
                    arrayList2.add(searchSquareType2);
                }
            }
            mainSearchViewModel2.f86734g.setValue(new com.bilibili.search2.main.data.i(arrayList));
        }
        return Unit.INSTANCE;
    }
}
