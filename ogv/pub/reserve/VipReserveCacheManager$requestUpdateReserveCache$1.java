package com.bilibili.ogv.pub.reserve;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import androidx.compose.runtime.snapshots.C4340n;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$requestUpdateReserveCache$1.class */
final class VipReserveCacheManager$requestUpdateReserveCache$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<l> $canReserveCacheList;
    final String $epIdStrs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveCacheManager$requestUpdateReserveCache$1(String str, List<l> list, Continuation<? super VipReserveCacheManager$requestUpdateReserveCache$1> continuation) {
        super(2, continuation);
        this.$epIdStrs = str;
        this.$canReserveCacheList = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheManager$requestUpdateReserveCache$1(this.$epIdStrs, this.$canReserveCacheList, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String message;
        StringBuilder sb;
        Throwable th;
        String message2;
        StringBuilder sb2;
        Throwable th2;
        ReserveVerify reserveVerify;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = (b) ServiceGenerator.createService(b.class);
            String str = this.$epIdStrs;
            this.label = 1;
            Object objReserveVerify = bVar.reserveVerify(str, this);
            obj = objReserveVerify;
            if (objReserveVerify == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        List<l> list = this.$canReserveCacheList;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.w("VipReserveCacheManager$requestUpdateReserveCache$1-invokeSuspend", "[ogv-pub-VipReserveCacheManager$requestUpdateReserveCache$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list2 = (List) ((BiliApiResponse.Success) biliApiResponse).getData();
                List<l> list3 = (List) VipReserveCacheManager.c(list).component1();
                if (list2.isEmpty()) {
                    VipReserveCacheManager.b();
                } else {
                    List list4 = list2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C4340n.a(list4, 10, 16));
                    for (Object obj2 : list4) {
                        linkedHashMap.put(Long.valueOf(((ReserveVerify) obj2).b()), obj2);
                    }
                    List<l> list5 = list3;
                    for (l lVar : list5) {
                        if (linkedHashMap.containsKey(Long.valueOf(lVar.f71679b)) && (reserveVerify = (ReserveVerify) linkedHashMap.get(Long.valueOf(lVar.f71679b))) != null) {
                            lVar.b(reserveVerify);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z6 = false;
                    for (l lVar2 : list5) {
                        if (lVar2.a() < VipReserveCacheManager.d()) {
                            if (lVar2.f71680c == 1 && lVar2.f71682e == 1) {
                                arrayList.add(lVar2);
                            } else {
                                z6 = true;
                            }
                        }
                    }
                    if (z6) {
                        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$notifySubscribeCheckInterval$1(30000L, null), 3, (Object) null);
                    } else {
                        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$notifySubscribeCheckInterval$1(1000L, null), 3, (Object) null);
                    }
                    if (!arrayList.isEmpty()) {
                        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$handleDownload$1(arrayList, null), 3, (Object) null);
                        try {
                            VipReserveDatabase.f71657a.e().b(arrayList);
                        } catch (SQLiteCantOpenDatabaseException e7) {
                            message2 = e7.getMessage();
                            sb2 = new StringBuilder("[ogv-pub-VipReserveCacheStorage-delete] ");
                            th2 = e7;
                            sb2.append(message2);
                            BLog.e("VipReserveCacheStorage-delete", sb2.toString(), th2);
                        } catch (SQLiteDiskIOException e8) {
                            message2 = e8.getMessage();
                            sb2 = new StringBuilder("[ogv-pub-VipReserveCacheStorage-delete] ");
                            th2 = e8;
                            sb2.append(message2);
                            BLog.e("VipReserveCacheStorage-delete", sb2.toString(), th2);
                        }
                    }
                    list3.removeAll(arrayList);
                    try {
                        VipReserveDatabase.f71657a.e().e(list3);
                    } catch (SQLiteCantOpenDatabaseException e9) {
                        message = e9.getMessage();
                        sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage-update] ");
                        th = e9;
                        sb.append(message);
                        BLog.e("VipReserveCacheStorage-update", sb.toString(), th);
                    } catch (SQLiteDiskIOException e10) {
                        message = e10.getMessage();
                        sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage-update] ");
                        th = e10;
                        sb.append(message);
                        BLog.e("VipReserveCacheStorage-update", sb.toString(), th);
                    }
                    VipReserveCacheManager.b();
                }
                return Unit.INSTANCE;
            }
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            BLog.w("VipReserveCacheManager$requestUpdateReserveCache$1-invokeSuspend", "[ogv-pub-VipReserveCacheManager$requestUpdateReserveCache$1-invokeSuspend] " + exception.getMessage(), exception);
        }
        VipReserveCacheManager.b();
        return Unit.INSTANCE;
    }
}
