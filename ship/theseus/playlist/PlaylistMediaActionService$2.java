package com.bilibili.ship.theseus.playlist;

import com.bilibili.playset.widget.favorite.FavoriteDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistMediaActionService$2.class */
final class PlaylistMediaActionService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final y this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistMediaActionService$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistMediaActionService$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.activityresult.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final y this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(y yVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = yVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.ship.theseus.united.page.activityresult.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            FavoriteDialog favoriteDialog;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.page.activityresult.a aVar = (com.bilibili.ship.theseus.united.page.activityresult.a) this.L$0;
            if (aVar.f98830a == 309 && aVar.f98831b == -1 && (favoriteDialog = this.this$0.f96142j) != null) {
                favoriteDialog.p();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaActionService$2(y yVar, Continuation<? super PlaylistMediaActionService$2> continuation) {
        super(2, continuation);
        this.this$0 = yVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistMediaActionService$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            y yVar = this.this$0;
            SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> sharedFlow = yVar.f96139f.f98829c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(yVar, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
