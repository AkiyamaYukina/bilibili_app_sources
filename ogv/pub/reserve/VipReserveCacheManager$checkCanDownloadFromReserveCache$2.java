package com.bilibili.ogv.pub.reserve;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$checkCanDownloadFromReserveCache$2.class */
public final class VipReserveCacheManager$checkCanDownloadFromReserveCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public VipReserveCacheManager$checkCanDownloadFromReserveCache$2(Continuation<? super VipReserveCacheManager$checkCanDownloadFromReserveCache$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheManager$checkCanDownloadFromReserveCache$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            VipReserveCacheStorage vipReserveCacheStorage = VipReserveCacheStorage.f71656a;
            this.label = 1;
            Object objB = vipReserveCacheStorage.b(null, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            VipReserveCacheManager.f71648b.cancel(VipReserveCacheManager.f71647a);
            return Unit.INSTANCE;
        }
        Pair pairC = VipReserveCacheManager.c(list);
        List list2 = (List) pairC.component1();
        List list3 = (List) pairC.component2();
        if (list2.isEmpty()) {
            VipReserveCacheManager.b();
        } else {
            BuildersKt.launch$default(VipReserveCacheManager.f71649c, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$requestUpdateReserveCache$1(CollectionsKt.p(list3, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62), list, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
