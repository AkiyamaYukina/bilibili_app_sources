package com.bilibili.playset.collection.api;

import com.bilibili.playset.api.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/CollectionViewModel$sortData$1.class */
public final class CollectionViewModel$sortData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $groupId;
    final String $sortOps;
    private Object L$0;
    int label;
    final CollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$sortData$1(String str, long j7, CollectionViewModel collectionViewModel, Continuation<? super CollectionViewModel$sortData$1> continuation) {
        super(2, continuation);
        this.$sortOps = str;
        this.$groupId = j7;
        this.this$0 = collectionViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CollectionViewModel$sortData$1 collectionViewModel$sortData$1 = new CollectionViewModel$sortData$1(this.$sortOps, this.$groupId, this.this$0, continuation);
        collectionViewModel$sortData$1.L$0 = obj;
        return collectionViewModel$sortData$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                String str = this.$sortOps;
                long j7 = this.$groupId;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (i.f(j7, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e7) {
                coroutineScope2 = coroutineScope;
                CoroutineScopeKt.ensureActive(coroutineScope2);
                this.this$0.f84214g.setValue(Boxing.boxInt(2));
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            coroutineScope2 = coroutineScope3;
            try {
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
            } catch (Exception e8) {
                CoroutineScopeKt.ensureActive(coroutineScope2);
                this.this$0.f84214g.setValue(Boxing.boxInt(2));
            }
        }
        CoroutineScopeKt.ensureActive(coroutineScope);
        coroutineScope2 = coroutineScope;
        this.this$0.f84214g.setValue(Boxing.boxInt(1));
        return Unit.INSTANCE;
    }
}
