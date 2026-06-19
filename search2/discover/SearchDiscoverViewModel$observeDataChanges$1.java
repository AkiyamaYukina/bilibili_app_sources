package com.bilibili.search2.discover;

import Ps0.F;
import com.bilibili.search2.api.SearchSquareType;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/SearchDiscoverViewModel$observeDataChanges$1.class */
final class SearchDiscoverViewModel$observeDataChanges$1 extends SuspendLambda implements Function3<i, l, Continuation<? super n>, Object> {
    int label;
    final p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDiscoverViewModel$observeDataChanges$1(p pVar, Continuation<? super SearchDiscoverViewModel$observeDataChanges$1> continuation) {
        super(3, continuation);
        this.this$0 = pVar;
    }

    public final Object invoke(i iVar, l lVar, Continuation<? super n> continuation) {
        return new SearchDiscoverViewModel$observeDataChanges$1(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        SearchSquareType searchSquareType;
        Object next;
        i iVar;
        List<F> list;
        Object next2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        p pVar = this.this$0;
        List<SearchSquareType> list2 = pVar.f86461g;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.areEqual(((SearchSquareType) next2).getType(), SquareTypes.HISTORY.getType())) {
                    break;
                }
            }
            searchSquareType = (SearchSquareType) next2;
        } else {
            searchSquareType = null;
        }
        boolean z6 = false;
        boolean z7 = (searchSquareType == null || (iVar = (i) pVar.f86458d.getValue()) == null || (list = iVar.f86440a) == null || !(list.isEmpty() ^ true)) ? false : true;
        List<SearchSquareType> list3 = pVar.f86461g;
        SearchSquareType searchSquareType2 = null;
        if (list3 != null) {
            Iterator<T> it2 = list3.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((SearchSquareType) next).getType(), SquareTypes.TRENDING.getType()));
            searchSquareType2 = (SearchSquareType) next;
        }
        if (searchSquareType2 != null) {
            z6 = true;
        }
        return new n(z7, z6);
    }
}
