package com.bilibili.music.podcast.data;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicCollectionViewModel$sortData$1.class */
public final class MusicCollectionViewModel$sortData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $groupId;
    final String $sortOps;
    int label;
    final MusicCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicCollectionViewModel$sortData$1(String str, long j7, MusicCollectionViewModel musicCollectionViewModel, Continuation<? super MusicCollectionViewModel$sortData$1> continuation) {
        super(2, continuation);
        this.$sortOps = str;
        this.$groupId = j7;
        this.this$0 = musicCollectionViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicCollectionViewModel$sortData$1(this.$sortOps, this.$groupId, this.this$0, continuation);
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
            com.bilibili.playset.widget.favorite.f fVar = com.bilibili.playset.widget.favorite.f.f85754a;
            String str = this.$sortOps;
            long j7 = this.$groupId;
            this.label = 1;
            Object objG = fVar.g(j7, str, this);
            obj2 = objG;
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        MusicCollectionViewModel musicCollectionViewModel = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            musicCollectionViewModel.f66421e.setValue(Boxing.boxInt(1));
        }
        MusicCollectionViewModel musicCollectionViewModel2 = this.this$0;
        if (Result.exceptionOrNull-impl(obj2) != null) {
            musicCollectionViewModel2.f66421e.setValue(Boxing.boxInt(2));
        }
        return Unit.INSTANCE;
    }
}
