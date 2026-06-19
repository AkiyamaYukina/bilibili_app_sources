package com.bilibili.playset.playlist.search2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$switchTranslate$1.class */
final class CollectionSearchResultFragment$switchTranslate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.playset.api.c $item;
    int I$0;
    Object L$0;
    int label;
    final CollectionSearchResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSearchResultFragment$switchTranslate$1(CollectionSearchResultFragment collectionSearchResultFragment, com.bilibili.playset.api.c cVar, Continuation<? super CollectionSearchResultFragment$switchTranslate$1> continuation) {
        super(2, continuation);
        this.this$0 = collectionSearchResultFragment;
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionSearchResultFragment$switchTranslate$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int iIndexOf;
        com.bilibili.playset.api.c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            M.b("translate error: ", e7.getMessage(), "CollectionSearchResultFragment");
            this.$item.q(1);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            iIndexOf = ((h) this.this$0.mf().f85421c.getValue()).f85448c.indexOf(this.$item);
            if (iIndexOf < 0) {
                BLog.e("MultiTypeListDetailActivityV2", "invalid item");
                return Unit.INSTANCE;
            }
            if (com.bilibili.playset.api.e.a(this.$item)) {
                this.$item.q(1);
                this.this$0.kf().notifyItemChanged(iIndexOf, "PAYLOADS_UPDATE_TRANSLATE");
            } else if (this.$item.n() == 1 && this.$item.n() != 10) {
                if (this.$item.m().length() == 0) {
                    this.$item.q(10);
                    cVar = this.$item;
                    this.L$0 = cVar;
                    this.I$0 = iIndexOf;
                    this.label = 1;
                    obj = com.bilibili.playset.api.e.b(cVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.$item.q(2);
                    this.this$0.kf().notifyItemChanged(iIndexOf, "PAYLOADS_UPDATE_TRANSLATE");
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iIndexOf = this.I$0;
        cVar = (com.bilibili.playset.api.c) this.L$0;
        ResultKt.throwOnFailure(obj);
        cVar.h((String) obj);
        if (this.$item.m().length() == 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.$item.q(2);
        this.this$0.kf().notifyItemChanged(iIndexOf, "PAYLOADS_UPDATE_TRANSLATE");
        return Unit.INSTANCE;
    }
}
