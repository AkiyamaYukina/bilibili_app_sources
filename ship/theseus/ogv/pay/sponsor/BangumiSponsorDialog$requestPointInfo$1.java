package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.pay.sponsor.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorDialog$requestPointInfo$1.class */
final class BangumiSponsorDialog$requestPointInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiSponsorDialog$requestPointInfo$1(b bVar, Continuation<? super BangumiSponsorDialog$requestPointInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiSponsorDialog$requestPointInfo$1(this.this$0, continuation);
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
            a.f94228a.getClass();
            a aVar = a.C0742a.f94230b;
            int i8 = this.this$0.f94234c;
            this.label = 1;
            Object sponsorPoint = aVar.getSponsorPoint(i8, this);
            obj = sponsorPoint;
            if (sponsorPoint == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        b bVar = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((SponsorPoint) ((BiliApiResponse.Success) biliApiResponse).getData()).f94226a;
                int i9 = b.f94231x;
                bVar.l(str);
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
        }
        int i10 = b.f94231x;
        bVar.l(null);
        return Unit.INSTANCE;
    }
}
