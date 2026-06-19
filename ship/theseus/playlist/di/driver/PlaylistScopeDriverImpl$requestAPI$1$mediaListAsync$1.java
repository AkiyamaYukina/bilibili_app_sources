package com.bilibili.ship.theseus.playlist.di.driver;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.okretro.response.BiliApiResponseKt;
import com.bilibili.ship.theseus.playlist.api.ListResponse;
import com.bilibili.ship.theseus.playlist.di.driver.c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlaylistScopeDriverImpl$requestAPI$1$mediaListAsync$1.class */
public final class PlaylistScopeDriverImpl$requestAPI$1$mediaListAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ListResponse>>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScopeDriverImpl$requestAPI$1$mediaListAsync$1(c cVar, Continuation<? super PlaylistScopeDriverImpl$requestAPI$1$mediaListAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistScopeDriverImpl$requestAPI$1$mediaListAsync$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<ListResponse>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = this.this$0;
            com.bilibili.ship.theseus.playlist.util.c cVar2 = cVar.f95485i;
            c.a aVar = cVar.f95479b;
            int i8 = aVar.f95489b;
            Integer numBoxInt = Boxing.boxInt(aVar.f95493f);
            c.a aVar2 = this.this$0.f95479b;
            int i9 = aVar2.h;
            this.label = 1;
            Object objA = com.bilibili.ship.theseus.playlist.util.c.a(cVar2, i8, aVar.f95490c, aVar.f95491d, 0L, aVar.f95492e, false, true, aVar.f95494g, numBoxInt, false, 0, i9, aVar2.f95495i, 1, this, 16384);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Result.box-impl(BiliApiResponseKt.asResult((BiliApiResponse) obj));
    }
}
