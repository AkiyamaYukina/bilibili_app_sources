package com.bilibili.ship.theseus.ogv.intro.download.ui;

import com.bilibili.ogv.pub.reserve.VipReserveCacheStorage;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1.class */
public final class DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c0 $downloadReserveVm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1(c0 c0Var, Continuation<? super DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1> continuation) {
        super(2, continuation);
        this.$downloadReserveVm = c0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1(this.$downloadReserveVm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objA = VipReserveCacheStorage.a(this);
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
        OgvEpisode ogvEpisode = this.$downloadReserveVm.f92539b;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxLong(((com.bilibili.ogv.pub.reserve.l) it.next()).f71679b));
        }
        if (CollectionsKt.toSet(arrayList).contains(Boxing.boxLong(ogvEpisode.f93555a))) {
            c0 c0Var = this.$downloadReserveVm;
            c0Var.f92542e.setValue(Boolean.TRUE);
            ogvEpisode.f93552H = 1;
        } else {
            c0 c0Var2 = this.$downloadReserveVm;
            c0Var2.f92542e.setValue(Boolean.FALSE);
            ogvEpisode.f93552H = 0;
        }
        return Unit.INSTANCE;
    }
}
