package com.bilibili.search2.share;

import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.oversea.TranslateApiKt;
import dt0.AbstractC6843f;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/SearchShareHelper$translate$4.class */
final class SearchShareHelper$translate$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.search2.api.oversea.a $data;
    final AbstractC6843f<?> $holder;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchShareHelper$translate$4(com.bilibili.search2.api.oversea.a aVar, AbstractC6843f<?> abstractC6843f, Continuation<? super SearchShareHelper$translate$4> continuation) {
        super(2, continuation);
        this.$data = aVar;
        this.$holder = abstractC6843f;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchShareHelper$translate$4(this.$data, this.$holder, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List<com.bilibili.search2.api.oversea.a> allItems;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.$data.setTranslatedStatus(1000L);
                allItems = this.$data.getAllItems();
                this.L$0 = allItems;
                this.label = 1;
                obj = TranslateApiKt.a(allItems, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                allItems = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            list = (List) obj;
        } catch (Exception e7) {
            e7.printStackTrace();
            this.$data.setTranslatedStatus(2L);
        }
        if (!list.isEmpty() && list.size() == allItems.size()) {
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    if (str != null && str.length() != 0) {
                        for (Pair pair : CollectionsKt.zip(allItems, list)) {
                            com.bilibili.search2.api.oversea.a aVar = (com.bilibili.search2.api.oversea.a) pair.getFirst();
                            String str2 = (String) pair.getSecond();
                            if (str2 == null || str2.length() == 0) {
                                aVar.setTranslatedStatus(2L);
                            } else {
                                aVar.setTranslatedTitle(str2);
                                aVar.setTranslatedStatus(1L);
                            }
                        }
                        this.$data.setTranslatedStatus(1L);
                        AbstractC6843f<?> abstractC6843f = this.$holder;
                        abstractC6843f.notifyItemChanged((BaseSearchItem) abstractC6843f.getData(), "PAYLOAD_UPDATE_TRANSLATE");
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        throw new IllegalArgumentException("translate result is empty");
    }
}
