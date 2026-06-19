package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import com.bilibili.community.Community;
import com.bilibili.community.follow.FollowSeasonResult;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$follow$1.class */
final class OgvAllFilmsLayerService$follow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.community.follow.b $followSeasonData;
    final FilmInLayer $it;
    int label;
    final OgvAllFilmsLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAllFilmsLayerService$follow$1(OgvAllFilmsLayerService ogvAllFilmsLayerService, com.bilibili.community.follow.b bVar, FilmInLayer filmInLayer, Continuation<? super OgvAllFilmsLayerService$follow$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvAllFilmsLayerService;
        this.$followSeasonData = bVar;
        this.$it = filmInLayer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvAllFilmsLayerService$follow$1(this.this$0, this.$followSeasonData, this.$it, continuation);
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
            if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                BLRouter.routeTo(ec.c.a("bilibili://login"), this.this$0.f92698a);
                return Unit.INSTANCE;
            }
            Community community = Community.a;
            com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(this.$followSeasonData.a, this.$it.f92684a, (Long) null);
            this.label = 1;
            Object objG = community.g(dVar, this);
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
        OgvAllFilmsLayerService ogvAllFilmsLayerService = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            FollowSeasonResult followSeasonResult = (FollowSeasonResult) obj2;
            if (followSeasonResult.b.length() > 0) {
                ToastHelper.showToastShort(ogvAllFilmsLayerService.f92698a, followSeasonResult.b);
            }
        }
        Result.box-impl(obj2);
        return Unit.INSTANCE;
    }
}
