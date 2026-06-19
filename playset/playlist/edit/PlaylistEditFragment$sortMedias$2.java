package com.bilibili.playset.playlist.edit;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$sortMedias$2.class */
public final class PlaylistEditFragment$sortMedias$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistEditFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistEditFragment$sortMedias$2(PlaylistEditFragment playlistEditFragment, Continuation<? super PlaylistEditFragment$sortMedias$2> continuation) {
        super(2, continuation);
        this.this$0 = playlistEditFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistEditFragment$sortMedias$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ListPresenter listPresenter = this.this$0.h;
            ListPresenter listPresenter2 = listPresenter;
            if (listPresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                listPresenter2 = null;
            }
            String strP = CollectionsKt.p(this.this$0.sf(), ",", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30);
            this.label = 1;
            if (listPresenter2.g(strP, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
