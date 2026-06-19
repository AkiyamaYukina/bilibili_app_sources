package com.bilibili.ogv.pub.reserve;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheStorage$queryAllAsync$2.class */
final class VipReserveCacheStorage$queryAllAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends l>>, Object> {
    int label;

    public VipReserveCacheStorage$queryAllAsync$2(Continuation<? super VipReserveCacheStorage$queryAllAsync$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheStorage$queryAllAsync$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<l>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String message;
        StringBuilder sb;
        Throwable th;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRefB = G0.g.b(obj);
        try {
            objectRefB.element = VipReserveDatabase.f71657a.e().f();
        } catch (SQLiteCantOpenDatabaseException e7) {
            message = e7.getMessage();
            sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage$queryAllAsync$2-invokeSuspend] ");
            th = e7;
            sb.append(message);
            BLog.e("VipReserveCacheStorage$queryAllAsync$2-invokeSuspend", sb.toString(), th);
        } catch (SQLiteDiskIOException e8) {
            message = e8.getMessage();
            sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage$queryAllAsync$2-invokeSuspend] ");
            th = e8;
            sb.append(message);
            BLog.e("VipReserveCacheStorage$queryAllAsync$2-invokeSuspend", sb.toString(), th);
        }
        List list = (List) objectRefB.element;
        List listEmptyList = list;
        if (list == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }
}
