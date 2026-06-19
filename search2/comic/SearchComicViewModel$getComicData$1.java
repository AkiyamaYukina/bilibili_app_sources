package com.bilibili.search2.comic;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.polymer.app.search.v1.SearchComicRequest;
import com.bapis.bilibili.polymer.app.search.v1.SearchComicResponse;
import com.bapis.bilibili.polymer.app.search.v1.SearchMoss;
import com.bapis.bilibili.polymer.app.search.v1.SearchMossKtxKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/comic/SearchComicViewModel$getComicData$1.class */
final class SearchComicViewModel$getComicData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $comicId;
    final String $query;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchComicViewModel$getComicData$1(String str, c cVar, String str2, Continuation<? super SearchComicViewModel$getComicData$1> continuation) {
        super(2, continuation);
        this.$comicId = str;
        this.this$0 = cVar;
        this.$query = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchComicViewModel$getComicData$1(this.$comicId, this.this$0, this.$query, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SearchComicRequest searchComicRequestBuild = SearchComicRequest.newBuilder().setIdList(this.$comicId).build();
                SearchMoss searchMoss = new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                this.label = 1;
                Object objSuspendSearchComic = SearchMossKtxKt.suspendSearchComic(searchMoss, searchComicRequestBuild, this);
                obj = objSuspendSearchComic;
                if (objSuspendSearchComic == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SearchComicResponse searchComicResponse = (SearchComicResponse) obj;
            if (searchComicResponse == null) {
                MutableLiveData<Resource<ArrayList<BaseSearchItem>>> mutableLiveData = this.this$0.f86379a;
                Resource.Companion.getClass();
                mutableLiveData.setValue(Resource.a.d((Object) null));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c.I0(this.this$0, searchComicResponse.getItemsList(), this.$query));
                MutableLiveData<Resource<ArrayList<BaseSearchItem>>> mutableLiveData2 = this.this$0.f86379a;
                Resource.Companion.getClass();
                mutableLiveData2.setValue(Resource.a.d(arrayList));
            }
        } catch (BusinessException e7) {
            MutableLiveData<Resource<ArrayList<BaseSearchItem>>> mutableLiveData3 = this.this$0.f86379a;
            Resource.Companion.getClass();
            mutableLiveData3.setValue(Resource.a.a(e7));
        } catch (MossException e8) {
            MutableLiveData<Resource<ArrayList<BaseSearchItem>>> mutableLiveData4 = this.this$0.f86379a;
            Resource.Companion.getClass();
            mutableLiveData4.setValue(Resource.a.a(e8));
        }
        return Unit.INSTANCE;
    }
}
