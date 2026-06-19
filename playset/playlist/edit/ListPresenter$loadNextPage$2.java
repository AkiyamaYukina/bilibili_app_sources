package com.bilibili.playset.playlist.edit;

import com.bilibili.playset.playlist.entity.MediaId;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/ListPresenter$loadNextPage$2.class */
final class ListPresenter$loadNextPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPresenter$loadNextPage$2(ListPresenter listPresenter, Continuation<? super ListPresenter$loadNextPage$2> continuation) {
        super(2, continuation);
        this.this$0 = listPresenter;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ListPresenter$loadNextPage$2(this.this$0, continuation);
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
                ListPresenter listPresenter = this.this$0;
                long j7 = listPresenter.f85233b;
                int i8 = listPresenter.h;
                int i9 = listPresenter.f85240j;
                this.label = 1;
                Object objD = com.bilibili.playset.api.i.d(j7, i8, i9, this);
                obj = objD;
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            List listEmptyList = list;
            if (list == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (this.this$0.f85244n.size() >= 1) {
                ArrayList<List<MediaId>> arrayList = this.this$0.f85244n;
                List<MediaId> listRemove = arrayList.remove(arrayList.size() - 1);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(listRemove);
                arrayList2.addAll(listEmptyList);
                this.this$0.f85244n.addAll(CollectionsKt.chunked(arrayList2, 20));
                ListPresenter listPresenter2 = this.this$0;
                listPresenter2.f85241k = listPresenter2.f85237f <= listPresenter2.f85244n.size();
            }
            this.this$0.h++;
        } catch (Exception e7) {
            String message = e7.getMessage();
            if (message != null) {
                this.this$0.f85232a.yf(message);
            }
        }
        return Unit.INSTANCE;
    }
}
