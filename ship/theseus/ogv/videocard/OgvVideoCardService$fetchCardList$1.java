package com.bilibili.ship.theseus.ogv.videocard;

import Ig.t;
import com.bilibili.api.BiliApiException;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$fetchCardList$1.class */
final class OgvVideoCardService$fetchCardList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$fetchCardList$1(OgvVideoCardService ogvVideoCardService, Continuation<? super OgvVideoCardService$fetchCardList$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoCardService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVideoCardService$fetchCardList$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred<BiliApiResponse<List<PlayerCardVO>>> deferred = this.this$0.f94641l.f94656a;
            this.label = 1;
            Object objAwait = deferred.await(this);
            obj = objAwait;
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        OgvVideoCardService ogvVideoCardService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.w("OgvVideoCardService$fetchCardList$1-invokeSuspend", "[theseus-ogv-OgvVideoCardService$fetchCardList$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            BLog.w("OgvVideoCardService$fetchCardList$1-invokeSuspend", "[theseus-ogv-OgvVideoCardService$fetchCardList$1-invokeSuspend] " + exception.getMessage(), exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((BiliApiResponse.Success) biliApiResponse).getData();
            OgvVideoCardService.a(ogvVideoCardService, list);
            ArrayList arrayList = null;
            if (list != null) {
                List list2 = list;
                ArrayList<PlayerCardVO> arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((PlayerCardVO) obj2).f() == 8) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (PlayerCardVO playerCardVO : arrayList2) {
                    arrayList3.add(new com.bilibili.ship.theseus.ogv.bugle.a(playerCardVO.B(), playerCardVO.z(), playerCardVO.n(), playerCardVO.o(), playerCardVO.l(), playerCardVO.i(), playerCardVO.d(), playerCardVO.y(), playerCardVO.r(), playerCardVO.j(), playerCardVO.f94689n, playerCardVO.e(), playerCardVO.o().length() > 0 ? new t(1, ogvVideoCardService, playerCardVO) : null));
                }
                arrayList = arrayList3;
            }
            ogvVideoCardService.f94652w = arrayList;
            com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
            com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(ogvVideoCardService.f94637g));
            com.bilibili.community.follow.b bVar2 = bVar;
            if (bVar == null) {
                bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
            }
            LikeRepository.a.getClass();
            Boolean bool = (Boolean) LikeRepository.c.c(com.bilibili.community.b.a(ogvVideoCardService.f94648s));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            ogvVideoCardService.h(bVar2.a);
            ogvVideoCardService.i(zBooleanValue);
            com.bilibili.ship.theseus.keel.player.j jVar = ogvVideoCardService.f94635e;
            ogvVideoCardService.j(jVar.F());
            ogvVideoCardService.f(jVar.F());
        }
        return Unit.INSTANCE;
    }
}
